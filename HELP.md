# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.jobFinder.First job application' is invalid and this project uses 'com.jobFinder.First.job.application' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

##### Overviews

All list of end points - 
GET /jobs: get all jobs
GET /jobs/{id}: get a specific job by ID
POST /jobs: create a new job (requests body should contain the job details)
DELETE /jobs/{id}: delete a specific job by id
PUT /jobs/{id}: Update a specific job by ID (req body should contain the updated job details)
GET /jobs/{id}/company: get the company associated with a specific job by id

Example API URLs: 
GET {base_url}/jobs

- hints: to promote loose coupling we create interface

- RequestMapping - Annotation
    - Instead of using @RequestMapping, we can use @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping annotations that ensure that the method is only called for the specified HTTP method.

- @RequestMapping("/jobs") // This means that this method will be called when a GET request is sent to the /jobs URL., provides a base URL for the class. if the class has a base URL, then the method URL will be appended to the base URL. we can remove the base URL from the method URL.
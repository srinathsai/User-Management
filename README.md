# User-Management

It is a established fact that user management has become a most vital part in every application that we use daily. This project aims to create such user managing system using Springboot and Mysql.

## Requirements 
- IntelliJIdea or any Java IDE.
- MySQL
- POSTMAN API

## Dependencies Added
- Spring Web (for working of Spring REST API annotations).
- MySQL dependency ( for connecting with db).
- LOMBOK( to reduce boiler plate code of writing setter, getter and constructors with all parameters, constructors with one parameter).


## Architecture
This application has been developed in 3 tier. And they are as follows.
  -  Controller Layer :- It is the place where Spring Model View Controller is placed in which it takes care od REST API responses and requests. Here it is developed in Controller Package and with the help of Spring annotations (every annotation importance is written in comments) and these annotations are responsible for matching the incoming HTTP requests and executing that specific method.
  -  Service Layer :- This Layer is responsible for developing bussiness logic of the application.
  -  Repository layer :- This layer is responsible for communicating with the database. We use Jpa Repository interface which inheritly extends Crude repository interface and these methods are used to communicate with database which involves saving, updating, deleting, retriving users.
  -  Entity :- This is the class to let know database that this is the table and this class fields are treated as columns in a table and naming of the table, size of the column, whethere a column is nullable or not ..etc are determined by Spring annotations from the Spring Entity dependency.

## Steps of Execution.
- First download the code and open it in IntelliJIdea or any Java IDE.
- (Note you no need to add any configurations for Spring or you no need to adjust any dependency version because here by using Spring initializer necessary dependencies with recent versions have been added and it is reflected in Pom.xml file.)
- In application.properties file change Spring.datasource url to your MySQL url  which at the time of installing MySQL you would get this url. 
- Change username and password in application.properties file of yours that you have set while installing MySQL .
- Change hibernate dialect to MySQL dialect.
- (Note just change urls that are present on right hand side of equal to sign in Applications.properties file).
- Now for playing with this system you need to type urls in POSTMAN API platform with which ever HTTP request you want in from DELETE,PUT,POST,GET.ETC.
  (The urls that needs to be entered in POSTMAN API have been commented above for each corresponding HTTP request method. In that url you change Localhost:8080 to your Localhost where MySQL have been hosted)

# Simple spring security
This is simple spring security with in-memory users 

Run application
---------------

for running the app from console run below command:

    mvnw spring-boot:run
or if you have maven installed on your machine:

    mvn spring-boot:run
   
open http://localhost:8180

You should see this:

 ![login](login.png) 

login
-----
To login for the app as a user use below credential:

    login: user
    password: password
the user has access to the user page: http://localhost:8180/user

To login for the app as an admin use below credential:
    
        login: admin
        password: admin
    
The admin has access to the user pages: http://localhost:8180/user and http://localhost:8180/

The home page looks like this:
 
 ![home page](first-app.png) 
 
 

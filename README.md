# CMPE_272_HW5_JenkinsTestRepo

A simple Palindrome Java Program created to test Github Integration with Jenkins 

# Steps

* Install Jenkins for Windows.
* Configure Jenkins to run locally.
* Create a User in the Jenkins console or can be run as an administrator.
* Install the GitHub Integration Plugin which is used to integrate GitHub Repository with Jenkins.
* Create a Jenkins Job for GitHub Repository in the Jenkins console.

![image](https://user-images.githubusercontent.com/111547793/198801560-3e3545c4-6437-4a5f-a6e9-8bdbf8fb3fa6.png)

* Install ngrok and configure the port to test webhook with localhost.

![image](https://user-images.githubusercontent.com/111547793/198801834-a466cff3-c773-4a47-9391-4561f28ef618.png)

* Create a Webhook for the GitHub Repository using the forwarding URL of ngrok to trigger Jenkins on any push events in the GitHub Repository.

![image](https://user-images.githubusercontent.com/111547793/198802091-9602efbc-4dde-4af5-86d0-6bb045ddb11e.png)

* Once any changes are pushed to the repository a build will be triggered in Jenkins as shown in the below screenshot

![image](https://user-images.githubusercontent.com/111547793/198802282-db627e4f-3b6d-406b-b14a-de5df78d9f38.png)

* Verify the Build Status on the Jenkins Console as shown below.

![image](https://user-images.githubusercontent.com/111547793/198802470-23bff426-0650-4656-bd5b-3c3d3766ceeb.png)


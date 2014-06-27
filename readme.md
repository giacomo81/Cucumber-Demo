This is a working Cucumber demo
===============================

Prerequisites 
--------------

Install Homebrew

  http://brew.sh

Install Ruby

  \curl -sSL https://get.rvm.io | bash -s stable --ruby

Add the following to your bashrc

  export JAVA_HOME=`/usr/libexec/java_home -v 1.7`
  export MAVEN_OPTS='-Xms512m -Xmx2048m -XX:PermSize=256m -XX:MaxPermSize=768m'

Install Maven

  brew install maven git

Install Cucumber

  gem install cucumber


Get Source Code

  $ git clone git@github.com:giacomo81/Cucumber-Demo.git
  
Execution
---------------

To run tests execute the following maven command
	
	$ mvn test

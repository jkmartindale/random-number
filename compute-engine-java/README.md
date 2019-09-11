# Compute Engine + Java

## VM Setup

## Install System Packages
For java, we are using Tomcat 9. [Tomcat](http://tomcat.apache.org/)

To setup Tomcat, we need to create and add a new group/user:
```sh
sudo groupadd tomcat
sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
```

To install Java:
```sh
sudo apt update
sudo apt install default-jdk
```

To install Tomcat and create directory:
```sh
sudo apt install curl
curl -O http://apache.mirrors.pair.com/tomcat/tomcat-9/v9.0.24/bin/apache-tomcat-9.0.24.tar.gz
sudo mkdir /opt/tomcat
sudo sudo tar xzvf apache-tomcat-9*tar.gz -C /opt/tomcat
```

## Project Code
Create this file in the projet directory:

*random-number<span></span>.java*
```java
import java.lang.Math;

public class javaJarFile {

	public static void main(String[] args) {
		double number = 0.0;
		int printNum = 0;
		
		number = Math.random();
		number = number*1000000;
		printNum = (int)Math.ceil(number);
		
		System.out.println(printNum);

	}

}
```


# App Engine + Java

1. Create a Google Cloud Project
1. Run following code in google shell
   ```sh
   git clone https://github.com/GoogleCloudPlatform/appengine-try-java
   ```
1. Change to code directory
    ```sh
    cd appengine_try_java
    ```
1. Edit the servlet provided
    ```sh
    emacs src/main/java/myapp/DemoServlet.java
    ```
1. Change the servlet code to return a random int instead of hello world (code should look like following)
    ```java
    package myapp;

    import javax.servlet.*;
    import javax.servlet.http.*;
    import java.io.*;
    import java.util.*;

    public class DemoServlet extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(1000000) + 1;
            resp.setContentType("text/plain");
            PrintWriter out = resp.getWriter();
            out.println(""  + rand_int1);
            out.close();
        }
    }
    ```
1. Change xml code so servlet is attached to demo
    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <!DOCTYPE web-app PUBLIC
    "-//Oracle Corporation//DTD Web Appication 2.3//EN"
    "http://java.sun.com/dtd/web-app_2_3.dtd">
    <web-app xmlns="http://java.sun.com/xml/ns/javaee" version="2.5">
        <servlet>
            <servlet-name>demo</servlet-name>
            <servlet-class>myapp.DemoServlet</servlet-class>
        </servlet>
        <servlet-mapping>
            <servlet-name>demo</servlet-name>
            <url-pattern>/demo</url-pattern>
        </servlet-mapping>
    </web-app>
    ```
1. Run following code to create app:
    ```sh
    gcloud app create
    ```
1. Set up project with following code:
    ```sh
    gcloud config set project <project_name>
    ```
1. Deploy project
    ```sh
    mvn appengine:deploy
    ```
1. Can find random number at <project_name>.appspot.com/demo

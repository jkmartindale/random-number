# App Engine + Python
1. Create a google cloud project and open virtual console
1. Run following Code:
   ```sh
   git clone https://github.com/GoogleCloudPlatform/python-docs-samples
   ```
1. Switch to tutorial directory:
   ```sh
   cd python-docs-samples/appengine/standard_python37/hello_world
   ```
1. Edit main python file
   ```sh
   emacs main.py
   ```
1. Change hello() function to print a random number instead of Hello, World
   ```py
   from flask import Flask
   import random

   # If `entrypoint` is not defined in app.yaml, App engine will look for an app
   # called `app` in `main.py`.
   app = Flask(__name__)

   @app.route('/)
   def hello():
       """Return a random number."""
       x = random.randint(1,1000000)
       ret = str(x)
       return ret

   if __name__ = '__main__':
       # This is used when running locally only. When deploying to Google App
       # Engine, a webserver process such as Gunicorn will serve the app. This
       # can be configured by adding an `entrypoint` to app.yaml.
       app.run(host='127.0.0.1', port=8080, debug=True)
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
1. Can find random number at <project_name>.appspot.com

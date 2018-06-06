from flask import Flask,render_template,request
app=Flask(__name__)


@app.route('/')
def index():
	return render_template('and.html')
			

@app.route('/home')
def home():
	fruits=["apple","mango","pineapple"]
	return render_template('and.html', fruits=fruits)
			

@app.route('/login',methods=["POST","GET"])
def login():
	error = None
	if request.method=="POST":
			if request.form['email']!='goj@gmail.com' or request.form['password']!='ew':
  				error=" username or password didnot match"
			else:
				return render_template('and.html')
			return render_template('fgg.html' , error=error)	
	return render_template('fgg.html')
		

if __name__=='__main__':
	app.jinja_env.globals.update(chr=chr)
	app.run(host="0.0.0.0",port=8000,debug=True,threaded=True)	





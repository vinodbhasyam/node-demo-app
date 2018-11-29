job('node js example'){
	scm{

		git('git://github.com/vinodbhasyam/node-demo-app.git'){
		node -> node / gitConfigName('Vinod Bhasyam')
				node / gitConfigEmail('bhasyamvinod@gmail.com')
		}
		}

		triggers{
		scm('* * * * *')
		}
		{
		wrappers{
		nodejs('nodejs')
		}
		steps{
		sh ("npm install")
		}
		}
}

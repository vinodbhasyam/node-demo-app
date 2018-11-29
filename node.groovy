job('node js example'){
	scm
	{

		git('git://github.com/vinodbhasyam/node-demo-app.git'){
		node -> node / gitConfigName('Vinod Bhasyam')
				node / gitConfigEmail('bhasyamvinod@gmail.com')
		}
	}

	triggers
	{
		scm('H/5 * * * *')
	}
	wrappers
	{
		nodejs('nodejs')
	}
	steps
	{
		shell("npm install")
	}
}

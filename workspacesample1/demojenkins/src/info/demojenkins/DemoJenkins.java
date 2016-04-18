package info.demojenkins;

public class DemoJenkins {

	public static void main(String[] args) {
		DemoJenkins dj = new DemoJenkins();
		String methodDemo = dj.methodDemo();
		System.out.println(methodDemo);
	}

	public String methodDemo(){
	
		return "from methodone()";
	}
	
}

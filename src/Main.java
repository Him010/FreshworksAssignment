import core.DataStore;

public class Main {
	public static void main(String[] args) throws Exception {
		
		DataStore database = new DataStore("C:\\Users\\admin\\Downloads\\sample.db");
		database.create("Orange", "{color:Orange}");
		database.create("Grapes", "{color:Green}");
		database.create("Berry", "{color:Blue}");
		DataStore database1 = new DataStore("C:\\Users\\admin\\Downloads\\himanshu.db");
		database1.create("Apple", "{color:Red}",2);
		System.out.println(database1.read("Apple"));// Key found and output as {color:Red}
		System.out.println(database.read("Berry")); //Key found and output as {color:Blue}
		database.delete("Berry");
		database.stats();
		Thread.sleep(30);
		System.out.println(database.read("Berry"));//Key not found
		database.close();
		database1.close(); 
	}

}

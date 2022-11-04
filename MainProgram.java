public class MainProgram {
	public static void main(String[] args) {
		Account acc;
		subclass_1 acc_1= new subclass_1("Stephany","21100447","tep234");
		subclass_2 acc_2= new subclass_2("Sairose","20120022","sai233");
		acc = acc_1;
		System.out.println(acc.ForgotPass());
		System.out.println("This is your first account.");
		System.out.println("Accoount name: "+acc.getName());
		System.out.println("Account number: "+acc.getId());
		System.out.println("Password: "+acc_1.getPassword());

		acc = acc_2;
		System.out.println("This is your second account.");
		System.out.println("Accoount name: "+acc.getName());
		System.out.println("Account number: "+acc.getId());
		System.out.println("Password: "+acc_2.getPassword());

	}
}

package oops_progamming;

public class Inheritance1{
	float salary=8000;

}
class programmer extends Inheritance1{
	int bonus=10000;

public static void main(String[]args) {

	programmer p=new programmer();
	System.out.println(p.salary);
	System.out.println(p.bonus);
}
}
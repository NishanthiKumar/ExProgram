package lms;

public class UseComputer {
	public static void main(String[] args) {
		String[] values=args[0].split(",");
		Computer computer=new Computer();
		computer.brand=values[0];
		computer.displaySize=Float.parseFloat(values[1]);
		computer.price=Integer.parseInt(values[2]);
		computer.taxPercentage=Integer.parseInt(values[3]);
		computer.netPrice=computer.price+(computer.price*computer.taxPercentage/100);
		System.out.println("Brand="+computer.brand+" DisplaySize="+computer.displaySize+" Price="+computer.price+" Netprice="+computer.netPrice);
		System.out.println("********");
	}

}

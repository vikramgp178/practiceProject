package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@DataProvider(name="dp")
	public Object[][] getInfo()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="Vikramgp178";
		data[0][1]="pass1";

		data[1][0]="Suprem178";
		data[1][1]="pass2";
		
		data[2][0]="Dupream";
		data[2][1]="pass3";
		
		return data;
		
	}
	
	
	@Test(dataProvider="dp")
	public void getdata(String username, String password) {
		System.out.println(username+" "+password);
	}

}

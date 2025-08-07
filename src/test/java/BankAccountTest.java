import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BankAccountTest {
	@Test
	public void withdrawTest(){
		BankAccount bankAccount=new BankAccount();
		bankAccount.withdraw(5000);
		Assertions.assertEquals(45000, bankAccount.getBankBalance());
	}
	
}
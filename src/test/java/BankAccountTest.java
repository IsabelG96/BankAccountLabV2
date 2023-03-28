import org.assertj.core.api.AssertionsForClassTypes;
import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount1;

    @BeforeEach
    public void setUp(){
    bankAccount1 = new BankAccount("Anna", "Henderson", LocalDate.of(2000,1,1));
    }
    @Test
    public void hasFirstName(){
        //assert
        assertThat(bankAccount1.getFirstName()).isEqualTo("Anna");
    }

    @Test
    public void hasLastName(){
        //assert
        assertThat(bankAccount1.getLastName()).isEqualTo("Henderson");
    }

    @Test
    public void hasDateOfBirth(){
        //assert
        assertThat(bankAccount1.getDateOfBirth()).isEqualTo("2000-01-01");
    }

    @Test
    public void getWithdrawal(){
        //assert
        assertThat(bankAccount1.getBalance()).isEqualTo(0);
    }
    @Test
    public void setDeposit(){
        //assert
        assertThat(bankAccount1.getBalance()).isEqualTo(0);
    }
    @Test
    public void setAccountNumber(){
        //assert
        assertThat(bankAccount1.getAccountNumber()).isEqualTo(0);
    }

}

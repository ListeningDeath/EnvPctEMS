import com.env.entities.Company;
import com.env.repository.CompanyRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Date;

public class TestTool
{
    @Autowired
    private static CompanyRepository companyRepository;

    @Test
    public static void main(String args[])
    {
        Company company = new Company("test_company", "test_reg_address",
                "test_address", new Date(new java.util.Date().getTime()),
                "test_credit_code", "test_rep_person",
                "test_tech_person", "test_tech_person_contact");
        companyRepository.save(company);
    }
}

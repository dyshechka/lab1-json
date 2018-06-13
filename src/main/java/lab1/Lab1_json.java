package lab1;

import com.google.gson.Gson;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Lab1_json {
    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.setContactType("1");
        contact1.setContactValue("9876543210");

        Contact contact2 = new Contact();
        contact2.setContactType("2");
        contact2.setContactValue("MAIL@MAIL.RU");

        List contacts = new ArrayList<Contact>();
        contacts.add(contact1);
        contacts.add(contact2);

        Document document1 = new Document();
        document1.setDocumentNumber("123456");
        document1.setDocumentSerialNumber("1704");
        document1.setDocumentType(1);
        document1.setIssueDate(LocalDate.of(2017, Month.APRIL, 12));
        document1.setIssuedBy("ОТДЕЛ УФМС РОССИИ ПО ВЛАДИМИРСКОЙ ОБЛАСТИ");
        document1.setSubdivisionCode("330-040");

        Document document2 = new Document();
        document2.setDocumentNumber("123456789");
        document2.setDocumentType(2);
        document2.setIssueDate(LocalDate.of(2017, Month.APRIL, 13));

        List documents = new ArrayList<Document>();
        documents.add(document1);
        documents.add(document2);

        Person person = new Person();
        person.setFirstName("ХАРИТОНОВА");
        person.setLastName("МАРТА");
        person.setPatronymic("ЛЕОНИДОВНА");
        person.setBirthDate(LocalDate.of(1995, Month.MARCH, 19));
        person.setBirthPlace("СЫКТЫВКАР");
        person.setGender(1);
        person.setContacts(contacts);
        person.setDocuments(documents);

        Good good1 = new Good();
        good1.setName("ХОЛОДИЛЬНИК");
        good1.setQuantity(12);
        good1.setCost(20000.00);

        Good good2 = new Good();
        good2.setName("ТЕЛЕВИЗОР");
        good2.setQuantity(1);
        good2.setCost(50000.00);

        List goods = new ArrayList<Good>();
        goods.add(good1);
        goods.add(good2);


        Application application = new Application();
        application.setTradePoint(909205501);
        application.setCodeWord("codeWord");
        application.setIncomeType(1);
        application.setMonthlyIncome(20000);
        application.setLoanProductId("RCCF13_UNI_KR");
        application.setInitialPayment(3020);
        application.setLoanTerm(7);
        application.setTransferClaimAgree(true);
        application.setGoods(goods);
        application.setPerson(person);

        Gson gson = new Gson();
        String applicationJson = gson.toJson(application);
        System.out.println(applicationJson);

        Application newApplication = gson.fromJson(applicationJson, Application.class);
        System.out.println(newApplication.equals(application));

    }
}

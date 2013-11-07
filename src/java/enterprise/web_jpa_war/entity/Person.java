


package enterprise.web_jpa_war.entity;

//import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mitesh
 */
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @Column(name = "ID")
    private String cID;

    @Column(name = "LASTNAME")
    private String lName;

    @Column(name = "FIRSTNAME")
    private String fName;
     
    @Column(name = "E-mail")
    private String email;
    
     @Column(name = "DOB")
    private String date;
     
      @Column(name = "Password")
    private String pass;
      
       @Column(name = "Address")
    private String add;

    /** 
     * Creates a new instance of Person
     */
    public Person() {
    }

    public Person(String id, String firstName, String lastName, String em,String d,String pw,String a) {
        this.cID = id;
        this.fName = firstName;
        this.lName  = lastName;
        this.email=em;
        this.date=d;
        this.pass=pw;
        this.add=a;
        
    }

    public String getId() {
        return this.cID;
    }

    public String getLastName() {
        return this.lName;
    }

    public String getFirstName() {
        return this.fName;
    }
    public String getemail() {
        return this.email;
    }
    public String getDOB() {
        return this.date;
    }
    public String getPW() {
        return this.pass;
    }
    public String getAddress() {
        return this.add;
    }
    
}

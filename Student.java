
public class Student {
    public String name;
    public String familyName;
    public String nationalCode;
    public String gender;
    public String dateOfBirth;
    public String phoneNumber;
    public String Email;
    public String studentID;
    public String address;    
    public Student(String name , String familyName,String nationalCode,String gender,String dateOfBirth,String phoneNumber,String Email,String studentID,String address)
    {
        this.name = name;
        this.familyName = familyName;
        this.nationalCode = nationalCode;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.Email = Email;
        this.studentID = studentID;
        this.address = address;
    }
    @Override
    public String toString()
    {
        return "studentID:  " + studentID + System.lineSeparator() + "name:  " + name + System.lineSeparator() + "family-name:  " + familyName + System.lineSeparator() + 
                "gender:  " + gender + System.lineSeparator() + "national-code:  " +  nationalCode + System.lineSeparator() + "date-of-birth:  " + dateOfBirth +
                        System.lineSeparator() + "phone-number:  " + phoneNumber + System.lineSeparator() + "Email:  " + Email + System.lineSeparator() + "address:  " + address +
                System.lineSeparator() + "------------------------------------" + System.lineSeparator();
    }
}

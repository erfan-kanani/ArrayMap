import java.util.*;
import java.io.*;
public class Test {
    public static void main(String[] args) {
        try
        {
            ArrayMap myMap = new ArrayMap();
            Scanner input = new Scanner(System.in);
            File file = new File("student.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            Student students[] = new Student[10];
            String userAnswer;
            int studentsCounter = 0;
            System.out.println("hello and welcome to the student manager program");
            while(true)
            {
                System.out.println("please choose between the following options :"
                + "\n 1-Add Student  \n 2-edit student \n 3-Search for the student \n 4-Delete student \n 5-Show the list of Students "
                        + "\n 6-Exit");
                userAnswer = input.next();
                if(userAnswer.equals("1"))
                {
                    System.out.println("how many students would you like to add?");
                    userAnswer =input.next();
                    studentsCounter = Integer.parseInt(userAnswer);
                    students = new Student[studentsCounter];
                    System.out.println("please enter the imformation about each student:");
                    for(int i = 0;i<studentsCounter;i++)
                    {
                        System.out.println("Student number " + (i+1));
                        
                            String ID = String.valueOf((i+1));
                            System.out.println("name:");
                            String name = input.next();
                            System.out.println("family-name:");
                            String familyName = input.next();
                            System.out.println("national-code:");
                            String nationalCode = input.next();
                            System.out.println("dateOfBirth(the format should be something like this month/day/year) :");
                            String dateOfBirth = input.next();
                            System.out.println("phone-number :");
                            String phoneNumber = input.next();
                            System.out.println("gender:");
                            String gender = input.next();
                            System.out.println("E-mail:");
                            String Email = input.next();
                            System.out.println("address");
                            String address = input.next();
                               students[i] = new Student(name, familyName, nationalCode, gender, dateOfBirth, phoneNumber, Email, ID, address);
                            System.out.println("------------------------------------");
                    }
                    for(int i =0;i<studentsCounter;i++)
                    {
                        myMap.put(students[i].studentID, students[i]);
                    }
                    System.out.println(studentsCounter + " students have been added succesfully");
                }
                else if(userAnswer.equals("2"))
                {
                    System.out.println("please enter the ID whom you want to edit his/her information");
                    userAnswer = input.next();
                    for(int i = 0;i<studentsCounter;i++)
                    {
                        if(students[i].studentID.equals(userAnswer))
                        {
                            System.out.println(students[i].toString());
                            System.out.println("please write new information about student with the ID " + userAnswer);
                            System.out.println("name:");
                            String name = input.next();
                            System.out.println("family-name:");
                            String familyName = input.next();
                            System.out.println("national-code:");
                            String nationalCode = input.next();
                            System.out.println("dateOfBirth(the format should be something like this month/day/year) :");
                            String dateOfBirth = input.next();
                            System.out.println("phone-number :");
                            String phoneNumber = input.next();
                            System.out.println("gender:");
                            String gender = input.next();
                            System.out.println("E-mail:");
                            String Email = input.next();
                            System.out.println("address");
                            String address = input.next();
                               students[i] = new Student(name, familyName, nationalCode, gender, dateOfBirth, phoneNumber, Email,students[i].studentID, address);
                               myMap.put(students[i].studentID ,students[i]);
                            
                        }
                    }
                    
                }
                else if(userAnswer.equals("3"))
                {
                    System.out.println("please enter the ID which you want to search");
                    userAnswer = input.next();
                    System.out.println(myMap.get(userAnswer).toString());
                }
                else if(userAnswer.equals("4"))
                {
                    System.out.println("please enter the ID whom you want to delete");
                    userAnswer = input.next();
                    myMap.remove(userAnswer);
                }
                else if(userAnswer.equals("5"))
                {
                    for(int z = 0 ; z<myMap.size();z++)
                    {
                            System.out.println(myMap.get(String.valueOf(z+1)).toString());
                            break;
                    }
                }
                else
                {
                    break;
                }
            }
            System.out.println("would you like to write the information on the file ?"
                    + "\n 1-yes  \n 2-no");
            userAnswer = input.next();
            if(userAnswer.equals("1"))
            {
                for(int i = 0;i<myMap.size();i++)
                {
                    bw.write(myMap.get(String.valueOf((i+1))).toString());
                }
                bw.close();
                fw.close();
            }
            System.out.println("Thanks for using this programs");
            System.out.println("developed by Erfan kanani and Ali mirsaeidy");
        }
        
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
      
    }
    
}

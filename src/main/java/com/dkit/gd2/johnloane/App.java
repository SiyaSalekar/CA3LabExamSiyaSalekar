package com.dkit.gd2.johnloane;

import java.sql.Array;
import java.util.*;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    public static void main( String[] args )
    {
        //Question 1
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Tanya Martin",12));
        students.add(new Student(2,"John Thompson",24));
        students.add(new Student(3,"Patrick Miller",19));
        students.add(new Student(4,"Robin Daly",20));

        questionOnePartB(students);
        System.out.println();
        questionOnePartC(students);

        // questionOnePartD();

        //Comment on Time and Space Complexity of Arraylist
        //Time
        //Adding elements - O(1)
        //Sort elements - O(n^2)
        //Space
        //
        //



//        //Question 2
//        questionTwoPartA();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nathan","Gray"));
        employees.add(new Employee("Lucas","Trenauskas"));
        employees.add(new Employee("David","Johnson"));
        employees.add(new Employee("David","Johnson"));
        employees.add(new Employee("David","Johnson"));
        employees.add(new Employee("Joe","Docker"));
        employees.add(new Employee("Peter","Anderson"));
        employees.add(new Employee("Peter","Anderson"));
        System.out.println();
        pickLuckyWinner(employees);


//        questionTwoPartB();
        //using Hashset - unique values

        System.out.println();
        Set<String> uniqueNames = new HashSet<>();
        for(Employee e: employees){
            uniqueNames.add(e.getFirstName());
        }
        printUniqueNames(uniqueNames);

//        questionTwoPartC();
        System.out.println();

        Map<String, Integer> NameCountMap = new HashMap<>();

        ArrayList<String> firstNames = new ArrayList<>();
        for(Employee e:employees){
            firstNames.add(e.getFirstName());
        }
        printNameAndCount(firstNames,NameCountMap);

//        questionTwoPartD();
//
//        //Question 3
//        List<String> oneHundredStrings = new ArrayList<>();
//        populateOneHundredStrings(oneHundredStrings);
//        questionThreePartA(oneHundredStrings);
//        questionThreePartB();

//        //Question 4
//        compareTwoStudents();
//        questionFourPartA();
//        questionFourPartB();
//        questionFourPartC();
    }


    public static void questionOnePartB(ArrayList<Student> students){

        System.out.println("Sort by Name");
        StudentNameComparator nameComparator = new StudentNameComparator();
        Collections.sort( students, nameComparator);
        for (Student s: students)
        {
            System.out.println(s);
        }
    }

    public static void questionOnePartC(ArrayList<Student> students){

        System.out.println("Sort by Age");
        StudentAgeComparator ageComparator = new StudentAgeComparator();
        Collections.sort( students, ageComparator);
        for (Student s: students)
        {
            System.out.println(s);
        }
    }

    public static void pickLuckyWinner(ArrayList<Employee> employees){

            // using Math.random()
            int index = (int)(Math.random() * employees.size());

            System.out.println("Lucky Winner is :"
                    + employees.get(index));

    }

    public static void printUniqueNames(Set<String> uniqueNames){
        System.out.println("Unique First Names: ");
        for (String s: uniqueNames){
            System.out.println(s);
        }
    }

    public static void printNameAndCount(ArrayList<String> firstnames, Map<String, Integer> NameCountMap){
        System.out.println("{name} -> "+"count");
        for(String firstname : firstnames) {
            Integer count = NameCountMap.get(firstname);
            if (count != null) {

                NameCountMap.put(firstname,(count+1));

            } else {
                NameCountMap.put(firstname, 1); // add new word with count 1
            }
        }

        for (Map.Entry<String, Integer> entry : NameCountMap.entrySet()) {
            String firstName = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("{"+firstName+"} -> "+count);
        }


    }
    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }
}

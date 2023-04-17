//package dev.nc;
//
//import dev.nc.model.NCStudent;
//import dev.nc.model.Student;
//import dev.nc.util.QueryItem;
//import dev.nc.util.QueryList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main_9 {
//    record Employee(String name) implements QueryItem {
//        @Override
//        public boolean matchFieldValue(String fieldName, String value) {
//            return false;
//        }
//    }
//
//    public static <T extends Student> void printList(List<T> students) {
//         for (var student : students) {
//             System.out.println(student.getYearStarted() + ": " + student);
//         }
//         System.out.println();
//     }
//    //notice, we are not specific about the type of List here (not ArrayList)
//    public static void printMoreLists(List<? extends Student> students) {
//        //with var here, if the type changes, we don’t need to change this loop later
//        for (var student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//
//
//        //assign instance of NCStudent to the reference type Student
//        Student ncStudent = new NCStudent();
//        //pass an instance of NCStudent to the method
//        ncStudent.printStudentName(ncStudent);
//
//        int studentCount = 10;
//        List<Student> students = new ArrayList<>();
//        //Confirm that we can add any type of Student to this List
//        students.add(new NCStudent());
//
//        for(int i = 0; i < studentCount; i++) {
//            students.add(new Student());
//        }
//        printList(students);
//        List<NCStudent> ncStudents = new ArrayList<>();
//        for(int i=0;i< studentCount;i++) {
//            ncStudents.add(new NCStudent());
//        }
//        printList(ncStudents); //ERROR: Required type List<Student>
//
//        var queryList = new QueryList<>(ncStudents);
//        var students2021 = QueryList.getMatches(students,"YearStarted", "2021");
//        printMoreLists(students2021);
//
//        QueryList<Employee> employeeList = new QueryList<>();
//
//    }
//}
//
//
//

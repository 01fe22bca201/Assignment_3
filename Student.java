public class Student {
    public void stud_det(){
        String name="vaishnavi";
        String usn="01fe22bca201";
        String program="BCA";
        String department="Computer applicattion";
        String[] course={"DevOps","Machine Learning","C#"};
        System.out.println("Student name:"+name);
        System.out.println("Student usn:"+usn);
        System.out.println("Program:"+program);
        System.out.println("Department:"+department);
        for(int i=0;i<course.length;i++){
            System.out.println("course:"+course[i]);
        }

    }
}
public class ExtendedDetails extends Student{
    void course(){
        String[] subjects={"DevOps","Machine Learning","C#"};
        int[][] marks={
            {50,20,60}
        };
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                if(marks[i][j]<40){
                    System.out.println("Subject scored less than 40:"+subjects[j]);
                }
            }
        }
    }
    public static void main(String args[]){
        ExtendedDetails sc= new ExtendedDetails();
        sc.stud_det();
        sc.course();
    }
    
    
}

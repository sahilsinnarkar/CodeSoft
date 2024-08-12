import java.util.*;

class Grades {

    Scanner sc = new Scanner(System.in);
    int toc, ads, os, cgr, mic;
    float total, avg;
    String grade = "";

    void getMarks() {
        System.out.println("===========Enter Marks for each Subject (out of 100)===================");
        System.out.print("Theory Of Computation : ");
        this.toc = sc.nextInt();
        System.out.print("Advance Data Structures : ");
        this.ads = sc.nextInt();
        System.out.print("Operating System : ");
        this.os = sc.nextInt();
        System.out.print("Computer Graphics : ");
        this.cgr = sc.nextInt();
        System.out.print("Microprocessor : ");
        this.mic = sc.nextInt();
    }

    void calGrades() {
        this.total = (toc+ads+os+cgr+mic);
        this.avg = this.total / 5;
        if(avg > 90){
            this.grade = "A";
        } else if(avg > 80){
            this.grade = "B";
        } else if(avg > 65){
            this.grade = "C";
        } else if(avg > 40){
            this.grade = "D";
        } else {
            this.grade = "Fail";
        }
    }

    void display() {
        System.out.println("=========Grades===========");
        System.out.println("Total Marks Obtained = " + this.total + "/500");
        System.out.println("Percentage = " + this.avg + "%");
        System.out.println("Grade = " + this.grade);
    }
    
    public static void main(String[] args) {
        Grades g = new Grades();
        g.getMarks();
        g.calGrades();
        g.display();
    }

}

  public class GradeReport {

    public void executeGradeReport(double score) {
        // Check if score is valid (0-100)
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
            return;
        }

        // Get letter grade
        char grade;
        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';

        // Print message
        if (grade == 'A') System.out.println("Excellent!");
        else if (grade == 'B') System.out.println("Good job!");
        else if (grade == 'C') System.out.println("Satisfactory");
        else if (grade == 'D') System.out.println("Needs improvement");
        else System.out.println("Failed");
    }

    public static void main(String[] args) {
        GradeReport g = new GradeReport();
        g.executeGradeReport(85);  // Output: Good job!
        g.executeGradeReport(120); // Output: Invalid Score
    }
}

  

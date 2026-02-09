public class ClassAverage {
    
    //  Taking two double scores
    public double calculateClassAverage(double a, double b) {
        return (a + b) / 2;
    }
    
    // Taking three double scores
    public double calculateClassAverage(double a, double b, double c) {
        return (a+b+c) / 3;
    }
    
    // Taking an array of double scores
    public double calculateClassAverage(double[] scores) {
        double sum=0
       for (double m:scores)sum+=5
          return scores.length>0?sum/scores.lenght:0;
}
}

class UseCase3 {
     public UseCase3(double a, double b) {

        System.out.println("Compare To Method Result:");
        System.out.println("The length of line 1 is : "+a);
        System.out.println("The length of line 2 is : "+b);

         Double l1 = a;
         Double l2 = b;
         double diff = l1.compareTo(l2);

        if(diff < 0)
            System.out.println("Line 1 is smaller than Line 2.");
        else if(diff == 0)
            System.out.println("Line 1 is equals to the Line 2.");
        else
            System.out.println("Line 1 is greater than Line 2.");
    }
}
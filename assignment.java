class Assignment {
    
    public static void main(String args[]){

        /* 
            Task 1: Cast "price" as integer and assign it to "round".            
        */
        float price = 9.9f;
        int round = (int)price;

        // Add code here
        
        System.out.println("round prints " + round); // prints 9


        /*
            Task 2: Cast "price" as String and assign it to "priceAsString".            
        */
        String priceAsString = String.valueOf(price); 
        //Using String Concatenation
// float floatValue = 12.34F;  // Example float value
// String stringValue = floatValue + "";
        
        // Add code here
        
        System.out.println("priceAsString prints " + priceAsString); // prints "9.9"
        System.out.println(priceAsString instanceof String); // prints true


        /*
            Task 3: Cast "priceAsString" as int and assign it to "number".
        */
    try{
        int number = Integer.parseInt(priceAsString);
        System.out.println("number prints " + number);
    }catch(NumberFormatException e){
        // Add code here
        System.out.println("Invalid input: " + priceAsString + " cannot be converted to an integer.");
        // System.out.println("number prints " + number1); // prints 9;
    }
    }
}

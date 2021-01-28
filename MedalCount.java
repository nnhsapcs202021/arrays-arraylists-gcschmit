
/**
 * Write a description of class MedalCount here.
 *
 * @author gcschmit
 * @version 28jan2021
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    /*
     * Can use aarray literals to create 2D arrays by nesting curly brackets.
     */
    private int[][] counts = new int[][]
        {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 1, 0 },
            { 1, 1, 0 },
            { 0, 1, 1 },
            { 0, 0, 0 },
            { 1, 1, 1 }
        };
        
    /**
     * Constructor for objects of class MedalCount
     */
    public MedalCount()
    {
        /*
         * Alternate way to create a 2D array. The initialization would be followed by
         *      nested loops to initialize each element.
         */
        //this.counts = new int[COUNTRIES][MEDALS];
        // for ...
    }
    
    /**
     * Prints the entire table.
     */
    public void printTable()
    {
        // good: for(int row = 0; row < COUNTRIES; row++)
        // better:
        for(int row = 0; row < this.counts.length; row++)
        {
            // good: for(int col = 0; col < MEDALS; col++)
            // better: for(int col = 0; col < this.counts[0].length; col++)
            // best:
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * Sum the medals for the specified country index (i.e., the specified row)
     * 
     * @param countryIndex  the index of the country in the table whose medals to sum
     * @return the sum of medals for the specified country index
     */
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;
        
        for(int col = 0; col < this.counts[countryIndex].length; col++)
        {
            sum += this.counts[countryIndex][col];
        }
        
        return sum;
    }
    
    /**
     * Sums the medals for the specified medal index for all countries (i.e., the
     *      specified column)
     *      
     *  @param medalIndex   the index of the type medal in the table to sum for all
     *                          countries
     *  @return the sum of medals of the specified index for all countries
     */
    public int sumMedalsForType(int medalIndex)
    {
        int sum = 0;
     
        for(int row = 0; row < this.counts.length; row++)
        {
            sum += this.counts[row][medalIndex];
        }
        
        return sum;
    }
}




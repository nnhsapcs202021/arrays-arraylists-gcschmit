public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.print("[");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if(i < array.length - 1)
            {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static double sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }

        average = sum / array.length;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );

        return average;
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] randomArray = createRandomArray(10, 50);

        for (int i = 0; i < randomArray.length; i++)
        {
            if (i != randomArray.length - 1)
            {
                System.out.print(randomArray[i] + " | ");
            }
            else
            {
                System.out.print(randomArray[i]);
            }
        }
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     */
    public static void linearSearch( int valueToFind, int length, int max )
    {
        int[] randoms = createRandomArray(length, max);
        int foundIndex = -1;
        for(int i = 0; i < randoms.length; i++)
        {
            if(randoms[i] == valueToFind)
            {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Index: " + foundIndex);
        printArray(randoms);
    }

    /*
     * Array Algorithm #4: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     */
    public static void countLessThan( int limit )
    {
        int[] array = CommonArrayAlgorithms.createRandomArray(5, 50);
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < limit)
            {
                count++;
            }
        }

        CommonArrayAlgorithms.printArray(array);
        System.out.println("This is the count: " + count);

    }

    /*
     * Array Algorithm #5: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int currentMax = Integer.MIN_VALUE;
        int[] array = createRandomArray( 20,100 );
        System.out.print("Array: ");

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > currentMax)
            {
                currentMax = array[i];
            }
            System.out.print(array[i] + " ");
        }

        System.out.println(); // formatting
        System.out.println("Greatest Value: " + currentMax);

    }

    public static void findMin()
    {
        int[] array = createRandomArray(10, 50);

        int minValue = Integer.MAX_VALUE;
        for (int item : array)
        {
            minValue = Math.min(minValue, item);
        }

        printArray(array);
        System.out.println(minValue);
    }

    /*
     * Array Algorithm #6: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */ 
    public static int[] reverseArray()
    {
        int[] array1 = createRandomArray( 10, 50 );
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++)
        {
            array2[array2.length-1-i] = array1[i];
        }
        printArray(array1);
        printArray(array2);
        return array2;
    }

}
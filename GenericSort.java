public class GenericSort 
{
  public static void main(String[] args) 
  {
    Integer[] list = {34, 17, 23, 35, 45, 9, 1};
    System.out.println("Original Array 1: ");
    printArray(list);
    selectionSort(list);
    System.out.println("\nSelection sort:");
    printArray(list);
    System.out.println("\nOriginal Array 2: ");
    Float[] flist = {34.4f, 17.6f, 23.0f};
    printArray(flist);
    selectionSort(flist);
    System.out.println("\nSelection sort:");
    printArray(flist);
}
public static <E extends Comparable<E>> void selectionSort(E[] list)
{
    for(int i=0; i<list.length -1; i++)
    {
        int iSmallest = i;

        for(int j=i+1; j<list.length; j++)
        {
            if(list[iSmallest].compareTo((list[j])) > 0  )
            {
                iSmallest = j;
            }
        }
        E iSwap = list[iSmallest];
        list[iSmallest] = list[i];
        list[i] = iSwap;

    }
}

public static <E> void printArray(E[] list)
{

    for(int i=0; i<list.length; i++)
    {
 	System.out.print(list[i] + "  ");
    }
}
}

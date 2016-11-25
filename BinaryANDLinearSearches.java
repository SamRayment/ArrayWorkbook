import java.util.Scanner;
public class BinaryANDLinearSearches
{
    public static void binarySearch( int integers[], int searchValue)
    {
        int start=0;
        int end=4;
        boolean found=false;
        
        while(found==false && start<=end)
        {
            int mid=(start+end)/2;
            if (integers[mid]==searchValue)
            {
                found=true;
            }
            else if(integers[mid]>searchValue)
            {
                end--;
            }
            else{
                start++;
            }
        }
        
        if (found==true){
            System.out.println("Found");
        } else{
            System.out.println("Not found");
        }
    }   
    
    public static void linearSearch(int integers[], int searchValue)
    {
        boolean found=false;
        for(int index=0; index<=4;index++)
        {
            if(integers[index]==searchValue)
            {
                System.out.println("Found");
                found=true;
                break;
            }
        }
        
        if (found==true)
        {
          System.out.println("Found"); 
        } else{
            System.out.println("Not found");
        }
    }
    
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int [] integers= new int [5];
        integers[0]=12;
        integers[1]=39;
        integers[2]=45;
        integers[3]=63;
        integers[4]=89;
        
        System.out.println("Please enter wether you'd like a linear or binary search: ");
        String searchType=input.nextLine();
        
        System.out.println("Please enter the value you would like to find: ");
        int searchValue=input.nextInt();
        
        if(searchType.equalsIgnoreCase("Linear"))
        {
            binarySearch(integers, searchValue);
        } 
        else if(searchType.equalsIgnoreCase("Binary"))
        {
            linearSearch(integers, searchValue);
        }
    }
}

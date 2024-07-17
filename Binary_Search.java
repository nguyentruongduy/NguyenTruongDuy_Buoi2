/**
 * Binary_Search
 */
public class Binary_Search {

    public static  int  biany_Search(int A[],int n, int key)
    {
        int left =0;
        int right = n-1;
        while (left < right) 
        {
            int mid = (left + right)/2; //vị trí giữa mảng
            if (A[mid] == key)
            return mid;
            if (key < A[mid])
            right = mid - 1 ;
            else
            left = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int A [] = {1,4,6,7,10,40,8,50,2,44};
        int n = A.length;
        int key = 3;
        int result = biany_Search(A,n,key);

        if (result == -1)
            System.out.printf("Khong co x");
        else
            System.out.println("co key tai vi tri "+result);
        
        
    }
}
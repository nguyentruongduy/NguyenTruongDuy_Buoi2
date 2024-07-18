public class Merge_Sort {
    static void merge_sort(int A[],int i,int n)
    {
        int left = 0;
        int right = n -1;
        if (left< right)
        {
            int mid = (left + right) /2;
            merge_sort(A,left,mid);
            merge_sort(A,mid +1,right);
            merge(A,left,mid,right);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void merge(int arr[], int l, int m, int r)
    {
        
        int n1 = m - l + 1;
        int n2 = r - m;

       
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        
        int i = 0, j = 0;

        
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

       
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int A[] = {1,3,5,6,10,30,11,28,6,2};
        System.out.println("Given array is ");
        printArray(A);

        merge_sort(A,0,A.length -1);
        System.out.println("\nSorted array is");
        printArray(A);
    }
}

import javax.print.attribute.standard.MediaSize.Other;

public class recusive {
	
	public void printArr(int []arr) {
		System.out.print("Array: {"+arr[0]);
		for (int i =0; i<arr.length;i++)
			System.out.print(", "+arr[i]);
		System.out.println("}");
	}
	public static void printStars(int num) {
		if (num >0) {
			System.out.println("*");
			printStars(num-1);
		}
	}
	public static long factorial(int num) {
		if (num == 1 || num == 0)
			return 1;
		return num *factorial(num-1);
	}
	public static int digits(int num) {
		if (num >=0 && num <=9)
			return 1;
		return 1+ digits(num/10);
	}
	public static int power(int a,int n) {
		if (n==0)
			return 1;
		int temp = power(a,n/2);
		if(n%2==0)
			return (temp*temp);
		else
			return (a*temp*temp);
	}
	public static int fibonacci(int n) {
		if ((n==1) || (n==2))
			return 1;
		else
			return fibonacci(n-1)+
					fibonacci(n-2);
	}
	public static void binaryNumbers(int n,String str) {
		if(n==0)
			System.out.println(str);
		else{
			binaryNumbers(n-1,str+"0");
			binaryNumbers(n-1,str+"1");
		}
	}
	public int recSum(int [] a, int i) {
		if(i==a.length)
			return 0;
		return (a[i]+recSum(a,i+1));
	}
	public static void recPrint(int []a, int lo,int hi) {
		if(lo<=hi) {
			System.out.println(a[lo]+"\t");
			recPrint(a,lo+1,hi);
		}
	}
	public boolean recFind(int[] arr, int x,int i) {
		if(i == arr.length)
			return false;
		if(arr[i]==x)
			return true;
		return recFind(arr,i+1,x);
	}
	public int binaryR(int[] a,int x,int lo,int hi) {
		if(hi<lo)
			return -1;
		int middle = (hi+lo)/2;
		if(a[middle]==x)
			return middle;
		else if(a[middle]<x)
			return binaryR(a,x,middle+1,hi);
		else
			return (binaryR(a,x,lo,middle-1));
	}
	public static double mul(double[]a) {
		return mul(a,0);
	}
	private static double mul(double[]a,int i) {
		if (i == a.length)
			return a[i];
		return a[i]* mul(a,i+1);
	
	}
	public static void reverse(int[] a) {
		reverse(a,0);
	}
	private static void reverse(int[] a,int i) {
		if(i <a.length/2) {
			int tmp = a[i];
			a[i]= a[a.length-i-1];
			a[a.length-i-1] = tmp;
			reverse(a,i+1);
		}
	}
	public static boolean count(int[]a1,int a2[]) {
		return count(a1,a2,0);
	}
	private static boolean count(int[]a1,int a2[],int i) {
		if(i==a1.length)
			return true;
		if((a2[i]== 1 && a1[i]>9)||
				a2[i]==2&&(a1[i]<10||a1[i]>99))
			return false;
		return count(a1,a2,i+1);
	}
	public static void palindrome(int[] a) {
		palindrome(a,0);
	}
	private static void palindrome(int[] a,int i) {
		if (i==a.length)
			return;
		System.out.print(a[i]+" ");
		palindrome(a,i+1);
		System.out.print(a[i]+" ");
	}
	public static boolean kArray(int[] a) {
	     if (a.length < 2)
	          return true;
	     return kArray(a, 1, Math.abs(a[0] - a[1]));
	}
	private static boolean kArray(int[] a, int i, int k) {
	     if (i == a.length - 1)
	          return true;
	     return Math.abs(a[i] - a[i + 1]) == k && kArray(a, i + 1, k);
	}
	 public static int smallest(int[] a) {
		 return smallest(a,0);
	 }
	 private static int smallest(int[]a,int i) {
		 if(i == a.length-1)
			 return i;
		 int val = smallest(a,i+1);
		 if(a[val]<a[i])
			 return val;
		 else
			 return i;
	 }
	 public int recMax (int []a) {
		 return recMax(a,0);
	 }
	 private static int recMax(int[]a,int i) {
		 if (i == a.length-1)
			 return a[a.length-1];
		 int currentMax = recMax(a,i+1);
		 if(a[i]<currentMax)
			 return currentMax;
		 return a[i];
	 }
	 public int recMin (int []a) {
		 return recMin(a,0);
	 }
	 private static int recMin(int[]a,int i) {
		 if (i == a.length-1)
			 return a[a.length-1];
		 int currentMin = recMin(a,i+1);
		 if(a[i]>currentMin)
			 return currentMin;
		 return i;
	 }
	 public static void selection(int[]a) {
		 selction(a,0);
	 }
	 private static void selction(int[]a,int i) {
		 if(i==a.length-1)
			 return;
		 int smallest = recMin(a,i);
		 if(smallest != i) {
			 int temp =a[smallest];
			 a[smallest]=a[i];
			 a[i] = temp;
		 }
		 selction(a,i+1);
	 }
	 private static void swap(int[]a,int lo,int hi	) {
		 if(lo<hi) {
			 int temp = a[lo];
			 a[lo] = a[hi];
			 a[hi] = temp;
			 swap(a,lo+1,hi-1);
		 }
	 }
	 private static int partition(int[]a,int lo , int hi) {
		 int left = lo, right = hi;
		 int pivot = a[lo];
		 while(left < right) {
			 while (left < right && a[left]<+pivot)
				 left++;
			 while (a[right] > pivot)
				 right--;
			 if(left < right)
				 swap(a,left,right);
		 }
		 swap(a,lo,right);
		 return right;
	 }
	 public static void quickSort(int[]a) {
		 quickSort(a,0,a.length-1);
	 }
	 private static void quickSort(int[]a,int lo, int hi) {
		 if(lo<hi) {
			 int m = partition(a,lo,hi);
			 quickSort(a,lo,m-1);
			 quickSort(a,m+1,hi);
		 }
	 }
	 public static double halfMin(double[] a) {
		 return halfMin(a,0);
		}
	 private static double halfMin(double[] a, int i) {
			if(i==a.length-1/2)
				return a[i];
			double val = halfMin(a,i+1);
			return Math.min(a[i], val);
		}
	 public static int maxEven(int[] a) {
			return maxEven(a,0);
		}
	 private static int maxEven(int[] a,int i) {
			if(i==a.length-1 && i%2==0)
				return a[i];
			else if(i==a.length-1&&i%2!=0)
				return Integer.MIN_VALUE;
			int val = maxEven(a,i+1);
			if(i%2==0)
				return Math.max(a[i], val);
			else
				return val;
		}
	 public static boolean twoAscending(int[] a) {
		 return twoAscending(a,0) &&
				 twoAscending(a,1);
	 }
	 private static boolean twoAscending(int[]a,int i) {
		 if(i>=a.length-2)
			 return true;
		 if(a[i]<a[i+2])
			 return twoAscending(a,i+2);
		 return false;
	 }
	 public static boolean zigzag(int[] a) {
	     return zigzag(a, 0, true);
	}
	 private static boolean zigzag(int[] a, int i, boolean isUp) {
		 if (i == a.length - 1)
			 return true;
	     if (isUp)
	          return a[i] < a[i+1] && zigzag(a, i + 1, false);
	     else
	          return a[i] > a[i+1] && zigzag(a, i + 1, true);
	}
	 public static boolean quadPrime(int[] a) {
	     if (a.length % 4 != 0)
	         return false;
	     return quadPrime(a, 4, a[0] * a[1] * a[2] * a[3]);
	}
	public static boolean quadPrime(int[] a, int i, int mul) {
	     if (i == a.length)
	          return true;
	     return a[i] * a[i + 1] * a[i+2] * a[i+3] == mul &&
	                quadPrime(a, i + 4, mul);
	}
	public static boolean similarK(int[] a, int[] b, int k) {
	     return similarK(a,b,k,0);
	}
	private static boolean similarK(int[] a, int[] b, int k, int i) {
	     if (i == a.length)
	          return true;
	     return (a[i] % k == b[i] % k) && similarK(a, b, k, i + 1);
	}
	public static boolean isInIt(int num1, int num2, int num3) {
	     return isInNum(num1, num2) && isInNum(num1, num3);
	}
	private static boolean isInNum(int num1, int num) {
	     if (num1 < 100)
	          return false;
	     int temp = num1 % 1000; 
	     if (temp == num)
	          return true;
	     return isInNum(num1 / 10, num);
	}
	public static int max(int[][]a) {
		return max(a,0,0);
	}
	private static int max(int[][]a,int i,int j) {
		if(i==a.length-1&&j==a[0].length-1)
			return a[i][j];
		int next;
		if(j==a[0].length-1)
			next=max(a,i+1,0);
		else
			next=max(a,i,j+1);
		return Math.max(a[i][j], next);
	}
	public static int numberPaths(int x,int y) {
		if((x==0) && (y==0))
			return 0;
		if((x==0) || (y==0))
			return 1;
		return numberPaths(x-1,y)+ numberPaths(x,y-1);
	}
	public static boolean sumNum(int[]a,int num) {
		return sumNum(a,num,0);
	}
	private static boolean sumNum(int[]a,int num,int ind) {
		if(ind == a.length)
			return false;
		if(a[ind]==num)
			return true;
		return sumNum(a,num,ind+1)||
				sumNum(a,num-a[ind],ind+1);
	}
	public static String strings(String s1, String s2) {
		if(s1.length()==0&& s2.length()==0)
			return "";
		if(s1.length()==0) 
			return s2;
		if(s2.length()==0)
			return s1;
		return s1.charAt(0)+""+s2.charAt(0)+""+
			strings(s1.substring(1),s2.substring(1));
	}
	public static void fillHadamard(int mat[][] ) {
		fillHadamard(mat,0,0,mat.length,1);
	}
	private static void fillHadamard(int mat[][],int top, int left, int size , int sign) {
		if(size==1)
			mat[top][left] = sign;
		else {
			fillHadamard(mat,top,left,size/2,sign);
			fillHadamard(mat,top+size/2,left,size/2,sign);
			fillHadamard(mat,top,left+size/2,size/2,sign);
			fillHadamard(mat,top+size/2,left+size/2,size/2,(-1)*sign);
		}
	}
	public static int howManySorted(int n, int max) {
		if(n==1)
			return max;
		if(max==0)
			return 0;
		return howManySorted(n-1,max)+howManySorted(n,max-1);
	}
	public static boolean equalSplit(int[] arr) {
		return equalSplit(arr,0,0,0,0);
	}
	private static boolean equalSplit(int[] arr, int i,int sum1, int sum2,int count) {
		if(i==arr.length)
			return (sum1==sum2) && 2*count==arr.length;
		return equalSplit(arr,i+1,sum1+arr[i],sum2,count+1)||
				 equalSplit(arr,i+1,sum1,sum2+arr[i],count);
	}
	/*public static int findMissingIndex(int[]a) {
		for (int i=0; i <a.length;i++) {
			if (i == a.length-1)
				break;
			int count =---=
			
			
			if((count - a[i])!= 2)
				return i+1;
		}
		return a.length;
	}*/
	public static int findMissingIndex (int []a) {
        int dif=Math.min((a[1]-a[0]),(a[2]-a[1]));
        int high=a.length-1;
        int low=0;
        int mid;
        int minIndex=a.length;
        while(low<high){
            mid=(low+high)/2;
            if(a[mid]==(a[0]+mid*dif)) 
                low=mid+1;
            else {
                high=mid;
                if(minIndex>mid)
                    minIndex=mid;
            }
        }
        if(a[high]!=a[0]+high*dif) 
            if(minIndex>high)
                minIndex=high;
        return minIndex;  
    }
	public static boolean isSum(int[]a,int num) {
		return isSum(a,num,0,0);
	}
	private static boolean isSum(int[]a,int num,int i,int count) {
		if(num == 0)
			return true;
		if ((i==a.length)||(num<0))
			return false;
		if(count == 2)
			return isSum(a,num,i+1,0);
		return isSum(a,num,i+1,count)||
				isSum(a,num-a[i],i+1,count+1);
	}
	public static int shortestRoad(int[] road1,int [] road2) {
		final int n = road1.length;
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0;i<n;i++) {
			sum1 += road1[i];
			sum1 += road2[i];
		}
		int currentSum1 = 0, currentSum2 = 0, minSum = Math.min(sum1, sum2);
		for(int i=0; i<n-1;i++) {
			currentSum1 += road1[i];
			currentSum2 += road2[i];
			int path1 = sum2-currentSum2+currentSum1,
					path2 = sum1-currentSum1+currentSum2;
				minSum = Math.min(minSum, Math.min(path1, path2));
		}
		return minSum;
	}
	public static int meetingPoint(int []a,int []b) {
		final int size = Math.min(a.length, b.length);
		int low= 0, high = size-1,mid;
		while (low <= high) {
			mid = (low+high)/2;
			if (a[mid] > b[mid]) {
				low = mid+1;
				continue;
			}
			if(a[mid]==b[mid]);
			return mid;
		}
		return -1;
	}
	/*
	 public static int countTriplets(int[]arr, int num) {
		int low =0, high = arr.length-1,mid,count =0;
		while (low<=high) {
			mid =(low+high)/2;
			if(arr[low]+arr[mid]+arr[high]<num) {
					count = count++;
				if(mid<high)
					mid++;
				else {
					low++;
					mid= low+1;
			}
			}
			else {
				high--;
			mid= low+1;
			}
		}
		return count;
	}*/
	public static int shortestRoad3(int [] road1,int [] road2) {
		final int N = road1.length;
		int sum1 = 0,sum2 =0;
		for (int i=0; i<N;i++) {
			sum1 += road1[i];
			sum2 += road2[i];
		}
		int currentSum1=0,currentSum2=0, minSum = Math.min(sum1, sum2);
		for (int i=0;i<N-1;i++) {
			currentSum1 = road1[i];
			currentSum2 = road2[i];
			int path1 = sum2 - currentSum2 + currentSum1;
			int path2 = sum1 - currentSum1 + currentSum2;
			minSum = Math.min(minSum, Math.min(path1, path2));
		}
		return minSum;
	}
	public static int longestPalindrome(int [] arr) {
		return longestPalindrome(arr,0,0);
	}
	private static int longestPalindrome(int []arr,int i,int count) {
		if (i == arr.length)
			return 0;
		if(arr[i] == arr[i+2])
			return longestPalindrome(arr, i, count+1);
		return longestPalindrome(arr,i+1,count);
	}
	public void sho(int n) {
		for(int i=0;i<n;i++)
			System.out.print("n");
	}
	public static int findMinDiff(int[]a,int x,int y) {
		final int N =  a.length;
		int _X=0,_Y=0;
		if(a.length==0)
			return 0;
		for (int i=0;i<N;i++) {
			if(x ==a[i])
				_X=i;
			if(y ==a[i])
				_Y=i;
		}
		return  Math.abs(_Y -_X);
	}
	public static int longestSubarray(int[] arr) {
		final int N = arr.length-1;
		int count1=1;
		int count2=1;
		for (int i=0;i<N;i++) {
			if((arr[i]<0)&&(arr[i+1]>0)) {
				count1++;
			}
			if((arr[i]>0)&&(arr[i+1]<0)) {
						count2++;
				}
		}	
		return Math.max(count1, count2);
	}
	public static int howmanypaths(int mat[][]) {
		return howmanypaths(mat,0,0);
	}
	private static int howmanypaths(int mat[][],int i,int j) {
		if((i<mat.length-1)&& (j<mat[0].length-1))
			return 1;
		if((i<0) || (j<0) || (i>= mat.length) || (j>=mat[0].length) || mat[i][j]<=0)
			return 0;
		int temp = mat[i][j];
		mat[i][j] = 1;
		int count = howmanypaths(mat,i+temp,j)+ howmanypaths(mat,temp,j+temp)+
				howmanypaths(mat,i-temp,j)+ howmanypaths(mat,temp,j-temp);
		mat[i][j]=temp;
		return count;
	}
	public static boolean isEven2(int[] arr) {
		return isEven2(arr,0);
	}
	public static boolean isEven2(int[] arr,int i) {
		if(i ==arr.length)
			return true;
		if(arr[i]%2 != 0)
			return false;
		return isEven2(arr,i+1);
	}
	public static int findMax2(int[] arr) {
		return findMax2(arr,0,0);
	}
	private static int findMax2(int[] arr,int i,int max) {
		if(i == arr.length)
			return max;
		int currMax = Math.max(max, i);
		return findMax2(arr,i+1,currMax);
	}
	public static int findMax3(int[] arr) {
		return findmax3(arr,0);
	}
	private static int findmax3(int[]arr,int i) {
		if(arr.length-1 == i)
			return arr[i];
		return Math.max(i, findmax3(arr,i+1));
	}
	public static int find2dMax(int[][]mat) {
		return find2dMax(mat,0,0,0);
	}
	private static int find2dMax(int[][]mat, int i,int j,int max) {
		if (i == mat.length)
			return max;
		if(mat[0].length==j)
			return find2dMax(mat,i+1,0,max);
		int re = Math.max(max, mat[i][j]);
		return find2dMax(mat,i,j+1,re);
	}
	public static boolean splitEqualMult(int[]a) {
		return splitEqualMult(a,0,1,1);
	}
	private static boolean splitEqualMult(int[] a,int i,int split1,int split2) {
		if(a.length==i) {
			if(split1==split2)
				return true;
			return false;
		}
		return splitEqualMult(a,i+1,a[i]*split1,split2)||
				splitEqualMult(a,i+1,split1,split2*a[i]);
	}
	public static void printAllSum(int[]a,int sum){
		printAllSum(a,sum,0,"");
	}
	private static void printAllSum(int[]a,int sum,int i,String s) {
		if(i == a.length) {
			if(sum==0)
				System.out.println(s);
			return;
		}
		printAllSum(a,sum-a[i],i+1,s+"1");
		printAllSum(a,sum,i+1,s+"0");
	}
	public static boolean issum3(int[]a,int sum) {
		return issum3(a,sum,0);
	}
	private static boolean issum3(int[]a,int sum,int i) {
		if (sum ==0)
			return true;
		if (a.length ==i)
			return false;
		return issum3(a,sum,i+1)||
				issum3(a,sum-a[i],i+1);
	}
	public static int minOperations(int x, int y) {
		if (x==y)
			return 0;
		if(x>y)
			return Integer.MAX_VALUE;
		int plus1,mult2;
		plus1 = minOperations(x+1,y)+1;
		mult2 = minOperations(x*2,y)+1;
		if (plus1<mult2)
			return plus1;
		return mult2;
	}
	public static void options(int n) {
		int [] history = new int[n];
		options(n,history,0);
	}
	private static void options(int n,int[] history,int i) {
		if(n==0) {
			printHistory(history,0,i);
			System.out.println();
		}
		if(n>0);
		history[i]=1;
		options(n-1,history,i+1);
		history[i]=2;
		options(n-2,history,i+1);
	}
	private static void printHistory(int[]history,int from,int to) {
		if(from<to) {
			System.out.print(history[from]+"\t");
			printHistory(history,from+1,to); }
	}
	public static boolean splitEqualMult2(int[]a) {
		return splitEqualMult2(a,0,1,1);
	}
	private static boolean splitEqualMult2(int[]a,int i,int sum1,int sum2) {
		if(a.length==i) {
			if(sum1==sum2)
				return true;
			return false;
		}
		return splitEqualMult2(a,i+1,a[i]*sum1,sum2)||
				splitEqualMult2(a,i+1,sum1,a[i]*sum2);
	}
	public static boolean findX(int [] a,int x) {
		int high=a.length-1,low=0,mid;
		
		while(low<=high) {
			mid = (low+high)/2;
			if(mid-1<0&& a[mid]+a[mid+1]!=x)
				return false;
			if(mid+1>a.length-1 && a[mid]+a[mid+1]!=x)
				return false;
			if(a[mid]+a[mid-1]==x || a[mid]+a[mid+1]==x)
				return true;
			if(a[mid]+a[mid-1]>x)
				high--;
			else
				low++;
		}
		return false;
	}
	public static void printPath(int[][] mat) {
		printPath(mat,0,0);
	}
	private static void printPath(int[][]mat,int i,int j) {
		System.out.print("("+i+","+j+")");
		if(i-1>=0) {
			if(mat[i][j]<mat[i-1][j]) {
				printPath(mat,i-1,j);
				return;
			}
		}
		if(j-1>=0) {
			if(mat[i][j]<mat[i][j-1]) {
				printPath(mat,i,j-1);
				return;
			}
		}
		if(i+1<=mat.length-1) {
			if(mat[i][j]<mat[i+1][j]) {
				printPath(mat,i+1,j);
				return;
			}
		}
		if(j+1<=mat[0].length-1) {
			if(mat[i][j]<mat[i][j+1]) {
				printPath(mat,i,j+1);
				return;
			}
		}
	}
	public static boolean isSUm3(int[]a,int num) {
		 int high = a.length-1,low=0,mid,temp=0;
		 while (high>=low) {
			 mid = (low+high)/2;
			 
			 if(a[mid]+a[mid+1]!=num) {
				 return false;
			 }
			 if(a[mid]+a[mid-1]!=num)
				 return false;
			 if(a[mid]+a[mid+1]==num||a[mid]+a[mid-1]==num)
				 return true;
			 if(a[mid]+a[mid+1]>num)
				 high--;
			 else
				 low++;	 
		 }
		 return false;
	}
	/**
	 *  This method returns true if there is a sum of the num
	 * @param a is the subarray
	 * @param num the number to compare
	 * @return This method returns true if there is a sum of the num
	 */
	public static boolean isSumreal3(int[]a,int num) {
		int high =a.length-1,low=0,mid;
		while(low<=high) {
			mid = (low+high)/2;
			if(mid-2<0&&
					a[mid]+a[mid+1]+a[mid+2]!=num)
				return false;
			if(mid+2>a.length-1&&
					a[mid]+a[mid-1]+a[mid-2]!=num)
				return false;	
			if(a[mid]+a[mid+1]+a[mid+2]==num||
					a[mid]+a[mid-1]+a[mid-2]==num)
				return true;
			if(a[mid]+a[mid+1]+a[mid+2]>num)
				high--;
			else
				low++;
		}
		return false;
	}
public static int romanToInt(String s) {
		
		int end = s.length();
		int tempI=0;
		while(end >=0) {
			if(s.charAt(end)=='V') {
				if(s.charAt(end-1)=='I') {
					tempI+=4;
				}
				tempI+=5;
				end--;
			}
		}
		return tempI;
	}
}


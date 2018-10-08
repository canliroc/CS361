package test;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		A.test();
	}

	public static int fact(int n) {
		if (n <= 1) {
			return n;
		}
		return fact(n - 1) + fact(n - 2);
	}

	public static int fact(int n, int acc1, int acc2) {
		if (n == 0) {
			return acc1;
		}
		return fact(n - 1, acc2, acc1 + acc2);
	}

	public static int recPow(int n) {
		if (0 == n) {
			return 1;
		}
		return 2 * recPow(n - 1);
	}

	public static void mergeSort(int[] a) {
		Sort(a, 0, a.length - 1);
	}

	private static void Sort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}

		int mid = (left + right) / 2;
		Sort(a, left, mid);
		Sort(a, mid + 1, right);
		merge(a, left, mid, right);
	}

	private static void merge(int[] a, int left, int mid, int right) {
		int[] tmp = new int[a.length];
		int r1 = mid + 1;
		int tIndex = left;
		int cIndex = left;

		while (left <= mid && r1 <= right) {
			if (a[left] <= a[r1]) {
				tmp[tIndex++] = a[left++];
			} else {
				tmp[tIndex++] = a[r1++];
			}
		}

		while (left <= mid) {
			tmp[tIndex++] = a[left++];
		}

		while (r1 <= right) {
			tmp[tIndex++] = a[r1++];
		}

		while (cIndex <= right) {
			a[cIndex] = tmp[cIndex];
			cIndex++;
		}
	}

	public static int gcd(int n,int m) {
		if(m==n) {
			return m;
		}
		if(m>n) {
			return gcd(m-n, n);
		}else {
			return gcd(m, n-m);
		}
	}

	public static void test() {
		int res=gcd(20, 30);
		System.out.println(res);
	}

}

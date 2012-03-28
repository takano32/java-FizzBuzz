
class FizzBuzz {
	public static final String F = "Fizz";
	public static final String B = "Buzz";
	public static void main(String args[]) {
		FizzBuzz fb = new FizzBuzz();
		fb.fb(100);
	}

	public void fb(int n) {
		if (n == 0) return;
		fb(n - 1);
		if (n % 15 == 0) {
			System.out.println(F + B);
		} else if (n % 5 == 0) {
			System.out.println(B);
		} else if (n % 3 == 0) {
			System.out.println(F);
		} else {
			System.out.println(n);
		}
	}
}



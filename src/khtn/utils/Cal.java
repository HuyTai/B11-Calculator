package khtn.utils;

public class Cal {
	int	a;
	int b;

	public Cal() {
		super();
	}
	public Cal(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int retTong() {
		return this.a+this.b;
	}
	public int retHieu() {
		return this.a-this.b;
	}
	public int retTich() {
		return this.a*this.b;
	}
	public int retThuong() {
		return this.a/this.b;
	}
	public void voidTong() {
		System.out.println("Tổng	A + B = "+(this.a+this.b));
	}
	public void voidHieu() {
		System.out.println("Hiệu	A - B = "+(this.a-this.b));
	}
	public void voidTich() {
		System.out.println("Tích	A x B = "+(this.a*this.b));
	}
	public void voidThuong() {
		System.out.println("Thương	A : B = "+(this.a/this.b));
	}
}

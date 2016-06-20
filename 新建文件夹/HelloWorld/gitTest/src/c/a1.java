package c;
/**
 * 内部类
 * @author Administrator
 *
 */
public class a1 {
	static private String name = "周勇";

	// 创建一个静态内部类
	static class In {
		private int age;

		void testDemo() {
			System.out.println("我叫" + name);
		}
	}

	public static void main(String[] args) {
		a1 ot = new a1();
		System.out.println(ot.name);
		// 调用静态内部类
		a1.In a11 = new a1.In();
		a11.testDemo();
	}

}

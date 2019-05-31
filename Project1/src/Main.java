import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		boolean debug = true;
		int size = 10;
		ArraySample test = new ArraySample();
		test.NewArray(size);
		test.sample[0] = "test";
		test.sample[1] = "test2";
		test.sample[2] = "test3";
		test.sample[3] = "test4";
		test.sample[4] = "test5";

		if (debug) {
			String siz = JOptionPane.showInputDialog("Input new size for array");
			int newSize = Integer.parseInt(siz);

			test.ChangeSize(newSize);
			test.PrintArray();
			test.AddString();
			test.PrintArray();
		}
	}
}

import javax.swing.JOptionPane;

public class ArraySample {

	public String[] sample;
	public int arraySize;
	private int openField;
	public boolean hasOpenField;

	public void NewArray(int size) {
		String[] sample = new String[size];
		this.sample = sample;
		this.arraySize = size;

	}

	public void PrintArray() {

		System.out.println("Your String contains: ");
		for (int j = 0; j < this.arraySize; j++) {
			System.out.println(j + 1 + " " + sample[j]);
		}
	}

	public void ChangeSize(int newSize) {

		if (newSize < this.arraySize) {

			System.out.println("Sorry, the new size needs to be the same size or bigger than the original size");
		} else {
			String[] temp = this.sample;
			String[] newArray = new String[newSize];
			for (int i = 0; i < this.arraySize; i++) {
				newArray[i] = temp[i];
			}
			this.sample = newArray;
			this.arraySize = newSize;

		}
	}

	public void AddString() {
		int k = 0;
		while (k < this.arraySize) {
			if (this.sample[k] == null) {

				this.openField = k;
				this.hasOpenField = true;
				break;
			} else {
				k++;
			}
		}
		if (!hasOpenField) {
			this.ChangeSize(arraySize + 1);
			openField = arraySize + 1;

		}
		sample[openField] = JOptionPane.showInputDialog("New String to add: ");
	}

}

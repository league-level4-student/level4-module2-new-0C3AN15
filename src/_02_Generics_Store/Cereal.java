package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends NonFood{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}

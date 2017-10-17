import java.awt.Color;
import java.util.Arrays;

public class Palette {
	private Color[] colors;
	private String name;

	public Palette(Color[] c, String n) {
		// TODO Auto-generated constructor stub
		colors = c;
		name = n;
	}

	public static void main(String[] args) {
		// Test-driven development

	}
	
	public boolean equals(Object obj) {
		// If obj is not a null and it is in the same class. 
		// ignore that someone forgets to write new equal method in the 
		//sub class. 
		if(obj!= null && obj.getClass()==this.getClass())
		{
			if(!this.name.equals(obj))
			{
				return false;
			}
			
			if(!Arrays.equals(this.colors, ((Palette)obj).colors))
			{
				return false;
			}
			
			return true;
		}
		return false;
	}

}

package iuh.se.attribute;

public class information {

	private String name;
	private int tuoi;
	private float height;
	private float weight;
	
	public information(String name, int tuoi, float height, float weight) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void calcBMI() {
		
	}
	
	
	
	

}

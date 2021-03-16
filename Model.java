package Khoza;

public class Model extends Make{
	String modelName;
	int modelYear;
	
	public Model() {
		this.modelName = "Unknown";
		this.modelYear = -1;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	

}

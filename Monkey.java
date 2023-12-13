package rescuepets;

public class Monkey extends RescueAnimal {
	// Instance variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
		
		
	// Default constructor
	public Monkey() {
		tailLength = "0";
		height = "0";
		bodyLength = "0";
		species = "None";
	}
		
	// Parameterized constructor
	public Monkey(String name, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry, String species, String tailLength, String height, String bodyLength) {
		setName(name);
		setGender(gender);
	    setAge(age);
	    setWeight(weight);
	    setAcquisitionDate(acquisitionDate);
	    setAcquisitionLocation(acquisitionCountry);
	    setTrainingStatus(trainingStatus);
	    setReserved(reserved);
	    setInServiceCountry(inServiceCountry);
		setHeight(height);
		setTailLength(tailLength);
		setSpecies(species);
		setBodyLength(bodyLength);
	}
		
		
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	public void setSpecies(String species) {
		this.species = species;		
	}
		
	// Accessors
		
	public String getTailLength() {
		return tailLength;
	}
	public String getHeight() {
		return height;
	}
	public String getBodyLength() {
		return bodyLength;
	}
	public String getSpecies() {
		return species;
	}
		
		
}


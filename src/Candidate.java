

public class Candidate {
	
	private int id;
	private String name;
	private int academicsPoints;
	private int extraPoints;
	
	
	
	public Candidate(int id, String name, int academicsPoints, int extraPoints) {
		super();
		this.id = id;
		this.name = name;
		this.academicsPoints = academicsPoints;
		this.extraPoints = extraPoints;
	}

	public void calculatePoints() {
		
		int totalPoints = academicsPoints + extraPoints;
		System.out.println("total points :" + totalPoints);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAcademicsPoints() {
		return academicsPoints;
	}

	public void setAcademicsPoints(int academicsPoints) {
		this.academicsPoints = academicsPoints;
	}

	public int getExtraPoints() {
		return extraPoints;
	}

	public void setExtraPoints(int extraPoints) {
		this.extraPoints = extraPoints;
	}
	
	

}

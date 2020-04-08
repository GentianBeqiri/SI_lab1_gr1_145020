class Student {
    public static void main(String[] args) {
	String index;
	String firstName;
	String lastName;

    List<Integer> labPoints = new ArrayList<Integer>();


	//TODO constructor
    public Student(String i, String f, String l,){
        this.index = i;
        this.firstName = f;
        this.lastName = l;
    }

	//TODO seters & getters
    public String getIndex(){
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public double getAverage() {
		//TODO
        int sum = 0;
        double result = 0.0;
        for (int labPoints : labPoints) {
            sum = sum + labPoints;
        }
        if (labPoints.size() > 0) {
            result = sum / labPoints.size();
        }
        return result;
	}

	public boolean hasSignature() {
        if (labPoints >= 8){
            System.out.println("Studentot ima potpis")
        }
		//TODO
	}
}
}
class Point {
	String id
	double x,y;

	//TODO add new variable


	//TODO constructor
	public Point(String id, double x, double y, String color)
	{
		this.id=id;
		this.x=x;
		this.y=y;
		this.color=color;
	}

	//TODO setters and getters
	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}


	public void move (char xDirection, char yDirection) {
		//TODO
		if (xDirection == 'L')
		{
			this.x -= 1;
		}
		if (xDirection == 'R')
		{
			this.x += 1;
		}
		if(yDirection == 'U')
		{
			this.y += 1;
		}
		if(yDirection == 'D')
		{
			this.y -= 1;
		}
	}

	public void draw () {
		System.out.print("x=" + x + " " + "y=" + y);

	}



}

public class Rectangulo {

	private Punto bottomLeft;
	private Punto topRight;

	public Rectangulo(Punto bottonLeft, Punto topRight) {
		this.bottomLeft = bottonLeft;
		this.topRight = topRight;
	}

	boolean isOverlapping(Rectangulo other) {
		if (this.topRight.getB() < other.bottomLeft.getB() || this.bottomLeft.getB() > other.topRight.getB()) {
			return false;
		}
		if (this.topRight.getA() < other.bottomLeft.getA() || this.bottomLeft.getA() > other.topRight.getA()) {
			return false;
		}
		return true;
	}

}

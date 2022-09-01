public class CollisionTest {

	public static void main(String[] args) {
		Rectangulo rectangulo1 = new Rectangulo(new Punto(1, 3), new Punto(0, 5));
		Rectangulo rectangulo2 = new Rectangulo(new Punto(1, 3), new Punto(0, 5));

		if (rectangulo1.isOverlapping(rectangulo2)) {
			System.out.println("Collision detectado");
		} else {
			System.out.println("Collision no detectado");
		}
	}

}

public class Point {

    // instance variables
    private int x;
    private int y;

    public Point(int x, int y) {
        // constructor that accepts two values, one for x and one for y
        this.x = x;
        this.y = y;
    }

    // constructor that accepts one value, sets both x and y to that value
    public Point(int side) {
        x = side;
        y = side;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x == 0 && y == 0) {
            return "origin";
        } else if (x == 0 || y == 0) {
            return "on an axis";
        } else if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else {
            return "IV";
        }
    }

}



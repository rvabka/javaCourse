import java.util.Arrays;

public class Polygon implements Shape {
    private Vec2[] points;

    public Polygon(Vec2[] points){
        this.points = Arrays.copyOf(points, points.length);
    }

    @Override
    public String toSvg(String parameters){
        String res = "<polygon points=\"";
        for (Vec2 point : points)
            res += point.x + "," + point.y + " ";
        res+="\" "+ parameters + " />";
        return res;
    }
}

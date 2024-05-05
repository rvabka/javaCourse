public class Main {
    public static void main(String[] args) {

        Shape polygon = new Polygon(new Vec2[]{new Vec2(120,60),new Vec2(270,280),new Vec2(240,320), new Vec2(110,80)});
        Shape ellipse = new Ellipse(new Vec2(300,400),200,50);

        polygon = new SolidFillShapeDecorator(polygon,"red");
        ellipse = new SolidFillShapeDecorator(ellipse,"green");
        System.out.println(polygon.toSvg(""));
        System.out.println(ellipse.toSvg(""));

        polygon = new StrokeShapeDecorator(polygon, "black", 3);
        System.out.println(polygon.toSvg(""));

        ellipse = new TransformationDecorator.Builder()
                .shape(ellipse)
                .rotate(new Vec2(300, 400), 90)
                .build();

        System.out.println(ellipse.toSvg(""));

    }

}
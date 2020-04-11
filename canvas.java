public class Canvas {
    List<Point> list = new ArrayList<Point>();

    public List<Point> getList() {
        return list;
    }

    public void setList(List<Point> list) {
        this.list = list;
    }

    public void addPoint(Point point)
    {
        list.add(point);
    }

    public void removePoint(Point point)
    {
        list.remove(point);
    }

    public static void main(String[] args) {

    }


}

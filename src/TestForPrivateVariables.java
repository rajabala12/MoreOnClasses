public class TestForPrivateVariables {
    private int x,y;
    private String name1, name2;

    public TestForPrivateVariables() {
        this.x = 1;
        this.name1 = "Java Developer";
        this.y = 2;
        this.name2 = "Java Tester";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName1(){
        return name1;
    }

    public String getName2(){
        return name2;
    }
}

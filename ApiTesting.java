class ApiProtected {
    private int how;
    public ApiProtected(int how) {
        this.how = how;
    }
    public int getHow() {
        return how;
    }
    public void setHow(int how) {
        this.how = how;
    }
    public void showHow() {
        System.out.println(getHow());
    }
}




public class ApiTesting {
    public static void main(String[] args) {
        ApiProtected trys = new ApiProtected(20);
        trys.setHow(2000);
        trys.showHow();
    }
}

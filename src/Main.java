public class Main {
    public static void main(String[] args) {
        TV myTV = new TV(50,1,50,1);
        myTV.setExactChannel(43);
        System.out.println(myTV.getChannel());
        myTV.changeVolume(false);
        System.out.println(myTV.getVolume());
    }
}

public class SharedObject { //SharedObject 클래스는 공유객체
    private int value;

    public synchronized void setValue(int value) { //동기화 메소드
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(Thread.currentThread().getName() + ": " + this.value);
    }
}

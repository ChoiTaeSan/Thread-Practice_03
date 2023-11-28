public class User extends Thread {
    SharedObject sObj;
    int valueToSharedObj;

    public User(SharedObject sObj, String userName, int valueToSharedObj) {
        this.setName(userName);
        this.sObj = sObj;
        this.valueToSharedObj = valueToSharedObj;
    }

    @Override
    public void run() {
        sObj.setValue(valueToSharedObj);
    }
}

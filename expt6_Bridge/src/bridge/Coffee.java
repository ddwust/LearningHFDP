package bridge;

/**
 * Created by dd on 2016/5/24.
 */
public abstract class Coffee {
    protected Sauce sauce;
    public void setSauce(Sauce sauce){
        this.sauce = sauce;
    }
    public abstract void show();
}

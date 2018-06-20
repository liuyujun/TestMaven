package Limit;

/**
 * author: yujun.liu@luckincoffee.com
 * createBy: 2018/6/15 15:58
 */
public class Business {

    @ServiceLimit
    public String startSeckil() {
        return new String(Thread.currentThread().getName()+" success");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    new Business().startSeckil();
                }
            }).start();

        }
    }
}

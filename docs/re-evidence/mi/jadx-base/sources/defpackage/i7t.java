package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i7t implements Runnable, nh {
    private static final String TAG = "HMBaseTask";

    public abstract void doWork();

    public void notExecute(String str) {
    }

    @Override // java.lang.Runnable, defpackage.nh
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        t5t.d(TAG, "==================== start " + getClass().getSimpleName() + " start ====================");
        try {
            doWork();
        } catch (Throwable th) {
            t5t.d(TAG, "Task执行失败:" + th.toString());
        }
        t5t.d(TAG, "====================end " + getClass().getSimpleName() + " end ====================<" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms>");
    }
}

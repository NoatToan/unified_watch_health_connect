package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class ni3 extends CountDownLatch {
    public ni3(int i) {
        super(i);
    }

    public void a() {
        while (getCount() > 0) {
            countDown();
        }
    }
}

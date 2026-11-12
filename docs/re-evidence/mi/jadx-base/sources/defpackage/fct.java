package defpackage;

import com.xiaomi.hm.health.bt.ISBEListener;

/* JADX INFO: loaded from: classes3.dex */
public class fct {
    public static synchronized void a(int i) {
        t5t.d("BluetoothExceptionReporter", "exception:" + i);
        ISBEListener iSBEListenerA = ict.a();
        if (iSBEListenerA != null) {
            iSBEListenerA.onException(i);
        }
    }
}

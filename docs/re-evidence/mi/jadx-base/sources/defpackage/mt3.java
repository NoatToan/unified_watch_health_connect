package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public class mt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Looper f27173a;

    public static Looper a() {
        if (f27173a == null) {
            synchronized (mt3.class) {
                try {
                    if (f27173a == null) {
                        HandlerThread handlerThread = new HandlerThread("Channel Dispatcher");
                        handlerThread.start();
                        f27173a = handlerThread.getLooper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27173a;
    }
}

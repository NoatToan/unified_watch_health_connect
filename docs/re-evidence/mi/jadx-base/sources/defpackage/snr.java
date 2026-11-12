package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class snr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Looper f33825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f33826b = new Object();

    public static Looper a() {
        if (f33825a == null) {
            synchronized (f33826b) {
                try {
                    if (f33825a == null) {
                        HandlerThread handlerThread = new HandlerThread("Spp Dispatcher");
                        handlerThread.start();
                        f33825a = handlerThread.getLooper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33825a;
    }
}

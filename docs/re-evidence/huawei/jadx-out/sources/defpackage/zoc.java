package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lib.android.paypal.com.magnessdk.network.base.c;

/* JADX INFO: loaded from: classes46.dex */
public final class zoc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static zoc f54384b;
    private static final Object e = new Object();
    private ThreadPoolExecutor d;

    public void a(c cVar) {
        this.d.execute(cVar);
    }

    public static zoc c() {
        zoc zocVar;
        synchronized (e) {
            if (f54384b == null) {
                f54384b = new zoc();
            }
            zocVar = f54384b;
        }
        return zocVar;
    }

    private zoc() {
        try {
            this.d = new ThreadPoolExecutor(10, 10, 60000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(256), new ThreadPoolExecutor.DiscardPolicy());
        } catch (Exception unused) {
        }
    }
}

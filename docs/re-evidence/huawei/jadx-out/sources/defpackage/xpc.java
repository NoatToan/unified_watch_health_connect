package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes20.dex */
public class xpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile xpc f53266a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f53267b;

    public static xpc b() {
        if (f53266a == null) {
            synchronized (d) {
                if (f53266a == null) {
                    f53266a = new xpc();
                }
            }
        }
        return f53266a;
    }

    private xpc() {
        HandlerThread handlerThread = new HandlerThread("wear_wallet_handler_oversea");
        handlerThread.start();
        this.f53267b = new Handler(handlerThread.getLooper());
    }

    public Handler c() {
        return d();
    }

    public Handler a() {
        return d();
    }

    public Handler d() {
        return this.f53267b;
    }
}

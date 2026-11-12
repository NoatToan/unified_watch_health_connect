package lib.android.paypal.com.magnessdk.network.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.znq;
import java.lang.ref.WeakReference;
import lib.android.paypal.com.magnessdk.log.a;

/* JADX INFO: loaded from: classes46.dex */
public final class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f40297a;
    private WeakReference<znq> e;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        lib.android.paypal.com.magnessdk.c.h.EnumC0339c enumC0339cA;
        if (this.e.get() == null || (enumC0339cA = lib.android.paypal.com.magnessdk.c.h.EnumC0339c.a(message.what)) == null) {
            return;
        }
        switch (C0341e.f40298a[enumC0339cA.ordinal()]) {
            case 1:
                a.e((Class<?>) e.class, 0, "GET request to " + lib.android.paypal.com.magnessdk.c.h.d.RAMP_CONFIG_URL.toString());
                break;
            case 2:
                break;
            case 3:
                a.e((Class<?>) e.class, 3, "GET request to " + message.obj + " error.");
                return;
            case 4:
                a.e((Class<?>) e.class, 0, "POST request to " + message.obj + " started.");
                return;
            case 5:
                a.e((Class<?>) e.class, 0, "POST request to " + message.obj + " successfully.");
                return;
            case 6:
                a.e((Class<?>) e.class, 3, "POST request to " + message.obj + " error.");
                return;
            default:
                return;
        }
        a.e((Class<?>) e.class, 0, "GET request to " + message.obj + " succeeded");
    }

    /* JADX INFO: renamed from: lib.android.paypal.com.magnessdk.network.base.e$e, reason: collision with other inner class name */
    static /* synthetic */ class C0341e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40298a;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.values().length];
            f40298a = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40298a[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40298a[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.GET_REQUEST_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40298a[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40298a[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_SUCCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40298a[lib.android.paypal.com.magnessdk.c.h.EnumC0339c.POST_REQUEST_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static e a(Looper looper, znq znqVar) {
        e eVar;
        synchronized (e.class) {
            if (f40297a == null) {
                f40297a = new e(looper, znqVar);
            }
            eVar = f40297a;
        }
        return eVar;
    }

    private e(Looper looper, znq znqVar) {
        super(looper);
        this.e = new WeakReference<>(znqVar);
    }
}

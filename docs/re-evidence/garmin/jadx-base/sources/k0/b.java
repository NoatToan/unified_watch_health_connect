package k0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static c a() {
        if (c.f101926a != null) {
            return c.f101926a;
        }
        synchronized (c.class) {
            try {
                if (c.f101926a == null) {
                    c.f101926a = new c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c.f101926a;
    }

    public static e b() {
        if (e.f101937b != null) {
            return e.f101937b;
        }
        synchronized (e.class) {
            try {
                if (e.f101937b == null) {
                    e.f101937b = new e();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return e.f101937b;
    }

    public static f c() {
        if (f.f101939b != null) {
            return f.f101939b;
        }
        synchronized (f.class) {
            try {
                if (f.f101939b == null) {
                    f.f101939b = new f();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f.f101939b;
    }

    public static d d() {
        if (g.f101942a != null) {
            return g.f101942a;
        }
        synchronized (g.class) {
            try {
                if (g.f101942a == null) {
                    g.f101942a = new d(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return g.f101942a;
    }
}

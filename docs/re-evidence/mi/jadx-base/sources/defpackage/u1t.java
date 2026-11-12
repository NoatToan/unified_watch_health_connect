package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class u1t {
    public static u1t c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35298b = d2t.d(p0t.t("RYW1hcF9kZXZpY2VfYWRpdQ"));

    public u1t(Context context) {
        this.f35297a = context.getApplicationContext();
    }

    public static u1t a(Context context) {
        if (c == null) {
            synchronized (u1t.class) {
                try {
                    if (c == null) {
                        c = new u1t(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final synchronized void b() {
        try {
            if (h0t.x() == null) {
                h0t.p(z1t.a());
            }
        } catch (Throwable unused) {
        }
    }

    public final void c(String str) {
        v1t.b(this.f35297a).c(this.f35298b);
        v1t.b(this.f35297a).g(str);
    }
}

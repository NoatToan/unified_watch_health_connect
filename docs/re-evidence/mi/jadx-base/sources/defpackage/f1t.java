package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class f1t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f1t f17307b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17308a;

    public f1t(Context context) {
        this.f17308a = context;
    }

    public static f1t a(Context context) {
        if (f17307b == null) {
            synchronized (f1t.class) {
                try {
                    if (f17307b == null) {
                        f17307b = new f1t(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17307b;
    }

    public static String b() {
        return "";
    }
}

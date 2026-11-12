package com.xiaomi.onetrack.util.oaid;

import android.content.Context;
import com.xiaomi.onetrack.util.n;
import com.xiaomi.onetrack.util.oaid.helpers.b;
import com.xiaomi.onetrack.util.oaid.helpers.g;
import com.xiaomi.onetrack.util.p;
import com.xiaomi.onetrack.util.q;
import com.xiaomi.onetrack.util.w;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13943a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f13944b;
    private volatile boolean c = false;
    private volatile String d = "";
    private final int e = 3;
    private volatile int f = 0;

    public static a a() {
        if (f13944b == null) {
            synchronized (a.class) {
                try {
                    if (f13944b == null) {
                        f13944b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13944b;
    }

    private boolean b() {
        return this.f >= 3;
    }

    public String a(Context context) {
        synchronized (this.d) {
            try {
                if (w.a()) {
                    if (!p.f13986a) {
                        p.b(f13943a, "getOaid() throw exception : Don't use it on the main thread");
                        return "";
                    }
                    throw new IllegalStateException("Don't use it on the main thread");
                }
                if (this.d != null && !this.d.equals("")) {
                    return this.d;
                }
                if (b()) {
                    p.a(f13943a, "isNotAllowedGetOaid");
                    return this.d;
                }
                if (q.a()) {
                    this.d = n.b(context);
                    this.f++;
                    return this.d;
                }
                String strA = new g().a(context);
                if (strA != null && !strA.equals("")) {
                    this.d = strA;
                    this.f++;
                    return strA;
                }
                String strA2 = new b().a(context);
                if (strA2 != null && !strA2.equals("")) {
                    this.d = strA2;
                    this.f++;
                    return strA2;
                }
                this.f++;
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.r;

/* JADX INFO: loaded from: classes4.dex */
public class pms {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile pms f30550b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1 f30551a;

    public pms() {
        this.f30551a = null;
        this.f30551a = r.b("AMapThreadUtil");
    }

    public static pms a() {
        if (f30550b == null) {
            synchronized (pms.class) {
                try {
                    if (f30550b == null) {
                        f30550b = new pms();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30550b;
    }

    public static void c() {
        if (f30550b != null) {
            try {
                if (f30550b.f30551a != null) {
                    f30550b.f30551a.g();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f30550b.f30551a = null;
            f30550b = null;
        }
    }

    public static void d(f7t f7tVar) {
        if (f7tVar != null) {
            try {
                f7tVar.cancelTask();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void b(f7t f7tVar) {
        try {
            this.f30551a.b(f7tVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

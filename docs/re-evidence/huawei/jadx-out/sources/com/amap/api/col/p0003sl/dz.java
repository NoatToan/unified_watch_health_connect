package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public class dz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile dz f2403b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ma f2404a;

    public static dz a() {
        if (f2403b == null) {
            synchronized (dz.class) {
                if (f2403b == null) {
                    f2403b = new dz();
                }
            }
        }
        return f2403b;
    }

    public static void b() {
        if (f2403b != null) {
            try {
                if (f2403b.f2404a != null) {
                    f2403b.f2404a.e();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f2403b.f2404a = null;
            f2403b = null;
        }
    }

    private dz() {
        this.f2404a = null;
        this.f2404a = ea.a("AMapThreadUtil");
    }

    public final void a(mb mbVar) {
        try {
            this.f2404a.a(mbVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(mb mbVar) {
        if (mbVar != null) {
            try {
                mbVar.cancelTask();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

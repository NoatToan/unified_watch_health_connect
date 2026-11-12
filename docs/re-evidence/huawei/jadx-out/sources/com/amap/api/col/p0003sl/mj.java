package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mj {
    private static volatile mj g;
    private static Object h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3200c;
    private no d;
    private no f = new no();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mi f3198a = new mi();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mk f3199b = new mk();
    private mf e = new mf();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public no f3201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<np> f3202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f3203c;
        public long d;
        public boolean e;
        public long f;
        public byte g;
        public String h;
        public List<ni> i;
        public boolean j;
    }

    public static mj a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new mj();
                }
            }
        }
        return g;
    }

    private mj() {
    }

    public final ml a(a aVar) {
        ml mlVar = null;
        if (aVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.d != null && aVar.f3201a.a(this.d) < 10.0d) {
            return null;
        }
        mi.a aVarA = this.f3198a.a(aVar.f3201a, aVar.j, aVar.g, aVar.h, aVar.i);
        List<np> listA = this.f3199b.a(aVar.f3201a, aVar.f3202b, aVar.e, aVar.d, jCurrentTimeMillis);
        if (aVarA != null || listA != null) {
            ng.a(this.f, aVar.f3201a, aVar.f, jCurrentTimeMillis);
            mlVar = new ml(0, this.e.a(this.f, aVarA, aVar.f3203c, listA));
        }
        this.d = aVar.f3201a;
        this.f3200c = jElapsedRealtime;
        return mlVar;
    }
}

package defpackage;

import android.os.SystemClock;
import com.amap.api.col.p0003sl.ni;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q7t {
    public static volatile q7t g;
    public static Object h = new Object();
    public long c;
    public bbt d;
    public bbt f = new bbt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o7t f31205a = new o7t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r7t f31206b = new r7t();
    public k7t e = new k7t();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public bbt f31207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<cbt> f31208b;
        public long c;
        public long d;
        public boolean e;
        public long f;
        public byte g;
        public String h;
        public List<ni> i;
        public boolean j;
    }

    public static q7t a() {
        if (g == null) {
            synchronized (h) {
                try {
                    if (g == null) {
                        g = new q7t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final y7t b(a aVar) {
        y7t y7tVar = null;
        if (aVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        bbt bbtVar = this.d;
        if (bbtVar == null || aVar.f31207a.a(bbtVar) >= 10.0d) {
            o7t.a aVarA = this.f31205a.a(aVar.f31207a, aVar.j, aVar.g, aVar.h, aVar.i);
            List<cbt> listB = this.f31206b.b(aVar.f31207a, aVar.f31208b, aVar.e, aVar.d, jCurrentTimeMillis);
            if (aVarA != null || listB != null) {
                xat.a(this.f, aVar.f31207a, aVar.f, jCurrentTimeMillis);
                y7tVar = new y7t(0, this.e.f(this.f, aVarA, aVar.c, listB));
            }
            this.d = aVar.f31207a;
            this.c = jElapsedRealtime;
        }
        return y7tVar;
    }
}

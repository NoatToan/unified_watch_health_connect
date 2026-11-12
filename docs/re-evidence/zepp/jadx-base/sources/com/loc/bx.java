package com.loc;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class bx {
    private static volatile bx g;
    private static Object h = new Object();
    private long c;
    private db d;
    private db f = new db();
    private bw a = new bw();
    private by b = new by();
    private bt e = new bt();

    public static class a {
        public db a;
        public List<dc> b;
        public long c;
        public long d;
        public boolean e;
        public long f;
        public byte g;
        public String h;
        public List<cv> i;
        public boolean j;
    }

    private bx() {
    }

    public static bx a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new bx();
                }
            }
        }
        return g;
    }

    public final bz a(a aVar) {
        bz bzVar = null;
        if (aVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        db dbVar = this.d;
        if (dbVar == null || aVar.a.a(dbVar) >= 10.0d) {
            bw.a aVarA = this.a.a(aVar.a, aVar.j, aVar.g, aVar.h, aVar.i);
            List<dc> listA = this.b.a(aVar.a, aVar.b, aVar.e, aVar.d, jCurrentTimeMillis);
            if (aVarA != null || listA != null) {
                db dbVar2 = this.f;
                db dbVar3 = aVar.a;
                long j = aVar.f;
                dbVar2.k = j;
                dbVar2.b = j;
                dbVar2.c = jCurrentTimeMillis;
                dbVar2.e = dbVar3.e;
                dbVar2.d = dbVar3.d;
                dbVar2.f = dbVar3.f;
                dbVar2.i = dbVar3.i;
                dbVar2.g = dbVar3.g;
                dbVar2.h = dbVar3.h;
                bzVar = new bz(0, this.e.a(dbVar2, aVarA, aVar.c, listA));
            }
            this.d = aVar.a;
            this.c = jElapsedRealtime;
        }
        return bzVar;
    }
}

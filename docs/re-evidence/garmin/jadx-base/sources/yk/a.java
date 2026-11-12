package yk;

import android.os.SystemClock;
import android.util.SparseArray;
import bk.l;
import com.google.common.primitives.UnsignedBytes;
import java.util.Iterator;
import ok.e;
import pk.b;
import xk.c;
import xk.d;

/* JADX INFO: loaded from: classes7.dex */
public class a extends e implements b.InterfaceC2618b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SparseArray<kk.a> f197584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f197585l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xk.a f197586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f197587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xk.b f197588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f197589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public xk.e f197590q;

    /* JADX INFO: renamed from: yk.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C3705a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f197591a;

        static {
            int[] iArr = new int[l.values().length];
            f197591a = iArr;
            try {
                iArr[l.BROADCAST_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // ok.e
    public final void a(l lVar, dk.a aVar) {
        if (C3705a.f197591a[lVar.ordinal()] != 1) {
            return;
        }
        kk.a aVar2 = this.f197584k.get(aVar.f60156b[1] & UnsignedBytes.MAX_VALUE);
        if (aVar2 != null) {
            SystemClock.elapsedRealtime();
            aVar2.a(aVar);
        }
    }

    @Override // ok.e
    public final void c() {
        long j8 = 0;
        Long lValueOf = null;
        Long lValueOf2 = null;
        Long lValueOf3 = null;
        while (!this.f197585l) {
            if (j8 == 30000) {
                j8 = 1000;
            }
            long jNanoTime = System.nanoTime();
            if (lValueOf == null || jNanoTime - lValueOf.longValue() > 60000000000L) {
                lk.a aVar = new lk.a(16, this, null);
                r(aVar, null);
                lValueOf = aVar.f138171k == ek.a.SUCCESS ? Long.valueOf(jNanoTime) : null;
            }
            if (!this.f197585l && lValueOf2 == null) {
                lk.a aVar2 = new lk.a(22, this, null);
                r(aVar2, null);
                lValueOf2 = aVar2.f138171k == ek.a.SUCCESS ? Long.valueOf(jNanoTime) : null;
            }
            if (!this.f197585l && lValueOf2 != null) {
                Boolean bool = Boolean.TRUE;
                if ((bool.equals(this.f197590q.f191191b) || bool.equals(this.f197590q.f191190a)) && (lValueOf3 == null || jNanoTime - lValueOf3.longValue() > 60000000000L)) {
                    lk.a aVar3 = new lk.a(17, this, null);
                    r(aVar3, null);
                    if (aVar3.f138171k == ek.a.SUCCESS) {
                        lValueOf3 = Long.valueOf(jNanoTime);
                    } else {
                        lValueOf = null;
                    }
                }
            }
            j8 = (lValueOf == null || lValueOf3 == null || lValueOf2 == null) ? j8 + 1000 : 60000L;
            e();
            try {
                if (!this.f197585l) {
                    Thread.sleep(j8);
                }
            } catch (InterruptedException unused) {
                int i14 = gk.a.f77715a;
                gk.a.EnumC1568a.DEBUG.ordinal();
            }
        }
        s();
    }

    @Override // ok.e
    public final String f() {
        return "Vivoki BLE Real-Time Monitoring";
    }

    @Override // ok.e
    public final void i() {
        this.f197585l = true;
    }

    @Override // ok.e
    public final boolean j() {
        this.f197585l = true;
        return true;
    }

    @Override // ok.e
    public final void n() {
        this.f197585l = false;
        s();
    }

    public final void s() {
        xk.a aVar = new xk.a();
        this.f197586m = aVar;
        this.f197587n = new d(aVar);
        this.f197588o = new xk.b(this.f197586m);
        this.f197589p = new c(this.f197586m);
        this.f197590q = new xk.e();
        this.f197584k = new SparseArray<>();
        kk.a[] aVarArr = {this.f197587n, this.f197588o, this.f197589p, this.f197590q};
        for (int i14 = 0; i14 < 4; i14++) {
            kk.a aVar2 = aVarArr[i14];
            Iterator<Integer> it = aVar2.b().iterator();
            while (it.hasNext()) {
                this.f197584k.put(it.next().intValue(), aVar2);
            }
        }
    }
}

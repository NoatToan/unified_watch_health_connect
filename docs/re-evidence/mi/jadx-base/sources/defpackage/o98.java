package defpackage;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class o98 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w14<PooledByteBuffer> f28886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tpo<FileInputStream> f28887b;
    public l4d c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public c83 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorSpace f28888k;

    public o98(w14<PooledByteBuffer> w14Var) {
        this.c = l4d.c;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        b6i.b(w14.y(w14Var));
        this.f28886a = w14Var.clone();
        this.f28887b = null;
    }

    public static boolean M(o98 o98Var) {
        return o98Var.d >= 0 && o98Var.f >= 0 && o98Var.g >= 0;
    }

    public static boolean O(o98 o98Var) {
        return o98Var != null && o98Var.N();
    }

    public static o98 b(o98 o98Var) {
        if (o98Var != null) {
            return o98Var.a();
        }
        return null;
    }

    public static void c(o98 o98Var) {
        if (o98Var != null) {
            o98Var.close();
        }
    }

    public int D() {
        Q();
        return this.d;
    }

    public int E() {
        return this.h;
    }

    public int J() {
        w14<PooledByteBuffer> w14Var = this.f28886a;
        return (w14Var == null || w14Var.n() == null) ? this.i : this.f28886a.n().size();
    }

    public boolean K(int i) {
        if (this.c != pv5.f30818a || this.f28887b != null) {
            return true;
        }
        b6i.g(this.f28886a);
        PooledByteBuffer pooledByteBufferN = this.f28886a.n();
        return pooledByteBufferN.k(i + (-2)) == -1 && pooledByteBufferN.k(i - 1) == -39;
    }

    public synchronized boolean N() {
        return w14.y(this.f28886a) || this.f28887b != null;
    }

    public void P() {
        l4d l4dVarC = m4d.c(y());
        this.c = l4dVarC;
        Pair<Integer, Integer> pairS = pv5.b(l4dVarC) ? S() : R().b();
        if (l4dVarC == pv5.f30818a && this.d == -1) {
            if (pairS != null) {
                int iB = ird.b(y());
                this.e = iB;
                this.d = ird.a(iB);
                return;
            }
            return;
        }
        if (l4dVarC != pv5.f30820k || this.d != -1) {
            this.d = 0;
            return;
        }
        int iA = HeifExifUtil.a(y());
        this.e = iA;
        this.d = ird.a(iA);
    }

    public final void Q() {
        if (this.f < 0 || this.g < 0) {
            P();
        }
    }

    public final x4d R() throws Throwable {
        InputStream inputStreamY;
        try {
            inputStreamY = y();
            try {
                x4d x4dVarB = jq2.b(inputStreamY);
                this.f28888k = x4dVarB.a();
                Pair<Integer, Integer> pairB = x4dVarB.b();
                if (pairB != null) {
                    this.f = ((Integer) pairB.first).intValue();
                    this.g = ((Integer) pairB.second).intValue();
                }
                if (inputStreamY != null) {
                    try {
                        inputStreamY.close();
                    } catch (IOException unused) {
                    }
                }
                return x4dVarB;
            } catch (Throwable th) {
                th = th;
                if (inputStreamY != null) {
                    try {
                        inputStreamY.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamY = null;
        }
    }

    public final Pair<Integer, Integer> S() {
        Pair<Integer, Integer> pairG = mcr.g(y());
        if (pairG != null) {
            this.f = ((Integer) pairG.first).intValue();
            this.g = ((Integer) pairG.second).intValue();
        }
        return pairG;
    }

    public void T(c83 c83Var) {
        this.j = c83Var;
    }

    public void U(int i) {
        this.e = i;
    }

    public void Z(int i) {
        this.g = i;
    }

    public o98 a() {
        o98 o98Var;
        tpo<FileInputStream> tpoVar = this.f28887b;
        if (tpoVar != null) {
            o98Var = new o98(tpoVar, this.i);
        } else {
            w14 w14VarD = w14.d(this.f28886a);
            if (w14VarD == null) {
                o98Var = null;
            } else {
                try {
                    o98Var = new o98((w14<PooledByteBuffer>) w14VarD);
                } catch (Throwable th) {
                    w14.l(w14VarD);
                    throw th;
                }
            }
            w14.l(w14VarD);
        }
        if (o98Var != null) {
            o98Var.d(this);
        }
        return o98Var;
    }

    public void b0(l4d l4dVar) {
        this.c = l4dVar;
    }

    public void c0(int i) {
        this.d = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w14.l(this.f28886a);
    }

    public void d(o98 o98Var) {
        this.c = o98Var.s();
        this.f = o98Var.getWidth();
        this.g = o98Var.getHeight();
        this.d = o98Var.D();
        this.e = o98Var.o();
        this.h = o98Var.E();
        this.i = o98Var.J();
        this.j = o98Var.m();
        this.f28888k = o98Var.n();
    }

    public void d0(int i) {
        this.h = i;
    }

    public void f0(int i) {
        this.f = i;
    }

    public int getHeight() {
        Q();
        return this.g;
    }

    public int getWidth() {
        Q();
        return this.f;
    }

    public w14<PooledByteBuffer> l() {
        return w14.d(this.f28886a);
    }

    public c83 m() {
        return this.j;
    }

    public ColorSpace n() {
        Q();
        return this.f28888k;
    }

    public int o() {
        Q();
        return this.e;
    }

    public String p(int i) {
        w14<PooledByteBuffer> w14VarL = l();
        if (w14VarL == null) {
            return "";
        }
        int iMin = Math.min(J(), i);
        byte[] bArr = new byte[iMin];
        try {
            PooledByteBuffer pooledByteBufferN = w14VarL.n();
            if (pooledByteBufferN == null) {
                w14VarL.close();
                return "";
            }
            pooledByteBufferN.i(0, bArr, 0, iMin);
            w14VarL.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb.toString();
        } catch (Throwable th) {
            w14VarL.close();
            throw th;
        }
    }

    public l4d s() {
        Q();
        return this.c;
    }

    public InputStream y() {
        tpo<FileInputStream> tpoVar = this.f28887b;
        if (tpoVar != null) {
            return tpoVar.get();
        }
        w14 w14VarD = w14.d(this.f28886a);
        if (w14VarD == null) {
            return null;
        }
        try {
            return new o3i((PooledByteBuffer) w14VarD.n());
        } finally {
            w14.l(w14VarD);
        }
    }

    public o98(tpo<FileInputStream> tpoVar) {
        this.c = l4d.c;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        b6i.g(tpoVar);
        this.f28886a = null;
        this.f28887b = tpoVar;
    }

    public o98(tpo<FileInputStream> tpoVar, int i) {
        this(tpoVar);
        this.i = i;
    }
}

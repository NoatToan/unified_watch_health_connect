package kf;

import f5.a1;
import f5.b1;
import f5.g2;
import f5.k;
import f5.v1;
import f5.w;
import f5.x;
import f5.y0;
import h4.r;
import h5.c0;
import h5.s;
import h5.y1;
import j23.t;
import o4.e0;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p5.h0;
import p5.k0;
import p5.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkf/a;", "Lh4/r$c;", "Lh5/s;", "Lh5/c0;", "Lh5/y1;", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "", "alpha", "Lo4/e0;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Ljf/j;", "constraintSizeResolver", "<init>", "(Lh4/d;Lf5/k;FLo4/e0;ZLjava/lang/String;Ljf/j;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a extends r.c implements s, c0, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h4.d f104554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f104555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f104556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f104557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f104558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f104559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jf.j f104560g;

    public a(h4.d dVar, k kVar, float f14, e0 e0Var, boolean z14, String str, jf.j jVar) {
        this.f104554a = dVar;
        this.f104555b = kVar;
        this.f104556c = f14;
        this.f104557d = e0Var;
        this.f104558e = z14;
        this.f104559f = str;
        this.f104560g = jVar;
    }

    @Override // h5.y1
    public final void D1(k0 k0Var) {
        String str = this.f104559f;
        if (str != null) {
            h0.n(k0Var, str);
            l.f136032b.getClass();
            h0.w(k0Var, l.f136037g);
        }
    }

    public final long U1(long j8) {
        if (n4.g.h(j8)) {
            n4.g.f123559b.getClass();
            return 0L;
        }
        long f98674l = V1().getF98674l();
        if (f98674l == 9205357640488583168L) {
            return j8;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f98674l >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (f98674l & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jA = this.f104555b.a(jFloatToRawIntBits, j8);
        return (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) > Float.MAX_VALUE) ? j8 : g2.a(jFloatToRawIntBits, jA);
    }

    public abstract t4.d V1();

    public final long W1(long j8) {
        float fL;
        int iK;
        float fD;
        boolean zH = g6.a.h(j8);
        boolean zG = g6.a.g(j8);
        if (!zH || !zG) {
            t4.d dVarV1 = V1();
            boolean z14 = g6.a.f(j8) && g6.a.e(j8);
            long f98674l = dVarV1.getF98674l();
            if (f98674l != 9205357640488583168L) {
                if (!z14 || (!zH && !zG)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (f98674l >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (f98674l & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        j.a aVar = j.f104590a;
                        fL = t.d(fIntBitsToFloat, g6.a.l(j8), g6.a.j(j8));
                    } else {
                        fL = g6.a.l(j8);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        j.a aVar2 = j.f104590a;
                        fD = t.d(fIntBitsToFloat2, g6.a.k(j8), g6.a.i(j8));
                    } else {
                        iK = g6.a.k(j8);
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) & 4294967295L) | (((long) Float.floatToRawIntBits(fL)) << 32);
                    n4.g.a aVar3 = n4.g.f123559b;
                    long jU1 = U1(jFloatToRawIntBits);
                    return g6.a.c(g6.b.g(MathKt.c(Float.intBitsToFloat((int) (jU1 >> 32))), j8), 0, g6.b.f(MathKt.c(Float.intBitsToFloat((int) (4294967295L & jU1))), j8), 0, 10, j8);
                }
                fL = g6.a.j(j8);
                iK = g6.a.i(j8);
                fD = iK;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fD)) & 4294967295L) | (((long) Float.floatToRawIntBits(fL)) << 32);
                n4.g.a aVar4 = n4.g.f123559b;
                long jU2 = U1(jFloatToRawIntBits2);
                return g6.a.c(g6.b.g(MathKt.c(Float.intBitsToFloat((int) (jU2 >> 32))), j8), 0, g6.b.f(MathKt.c(Float.intBitsToFloat((int) (4294967295L & jU2))), j8), 0, 10, j8);
            }
            if (z14 && (!(dVarV1 instanceof jf.d) || ((jf.d.c) ((jf.d) dVarV1).f98632q.f150540a.getValue()).getF98640a() != null)) {
                return g6.a.c(g6.a.j(j8), 0, g6.a.i(j8), 0, 10, j8);
            }
        }
        return j8;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    public final int maxIntrinsicHeight(x xVar, w wVar, int i14) {
        long jB = g6.b.b(i14, 0, 13);
        jf.j jVar = this.f104560g;
        if (jVar != null) {
            jVar.g(jB);
        }
        if (V1().getF98674l() == 9205357640488583168L) {
            return wVar.a0(i14);
        }
        long jW1 = W1(jB);
        return Math.max(g6.a.k(jW1), wVar.a0(i14));
    }

    @Override // h5.c0
    public final int maxIntrinsicWidth(x xVar, w wVar, int i14) {
        long jB = g6.b.b(0, i14, 7);
        jf.j jVar = this.f104560g;
        if (jVar != null) {
            jVar.g(jB);
        }
        if (V1().getF98674l() == 9205357640488583168L) {
            return wVar.l0(i14);
        }
        long jW1 = W1(jB);
        return Math.max(g6.a.l(jW1), wVar.l0(i14));
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        jf.j jVar = this.f104560g;
        if (jVar != null) {
            jVar.g(j8);
        }
        v1 v1VarQ = y0Var.Q(W1(j8));
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a03.k0(v1VarQ, 18));
    }

    @Override // h5.c0
    public final int minIntrinsicHeight(x xVar, w wVar, int i14) {
        long jB = g6.b.b(i14, 0, 13);
        jf.j jVar = this.f104560g;
        if (jVar != null) {
            jVar.g(jB);
        }
        if (V1().getF98674l() == 9205357640488583168L) {
            return wVar.e0(i14);
        }
        long jW1 = W1(jB);
        return Math.max(g6.a.k(jW1), wVar.e0(i14));
    }

    @Override // h5.c0
    public final int minIntrinsicWidth(x xVar, w wVar, int i14) {
        long jB = g6.b.b(0, i14, 7);
        jf.j jVar = this.f104560g;
        if (jVar != null) {
            jVar.g(jB);
        }
        if (V1().getF98674l() == 9205357640488583168L) {
            return wVar.O(i14);
        }
        long jW1 = W1(jB);
        return Math.max(g6.a.l(jW1), wVar.O(i14));
    }

    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        q4.a aVar = h0Var.f81825a;
        long jU1 = U1(aVar.b());
        long jA = this.f104554a.a(j.e(jU1), j.e(aVar.b()), h0Var.getLayoutDirection());
        g6.k.a aVar2 = g6.k.f76003b;
        int i14 = (int) (jA >> 32);
        int i15 = (int) (jA & 4294967295L);
        q4.a.b bVar = aVar.f142543b;
        long jB = bVar.b();
        bVar.a().l();
        try {
            q4.b bVar2 = bVar.f142550a;
            if (this.f104558e) {
                q4.h.c(bVar2, 0.0f, 0.0f, 31);
            }
            bVar2.h(i14, i15);
            V1().m501drawx_KDEd0(h0Var, jU1, this.f104556c, this.f104557d);
            bVar.a().i();
            bVar.c(jB);
            h0Var.m1();
        } catch (Throwable th3) {
            tn.k.p(bVar, jB);
            throw th3;
        }
    }
}

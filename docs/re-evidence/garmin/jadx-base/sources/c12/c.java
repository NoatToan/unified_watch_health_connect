package c12;

import am.j;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import l72.f0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22536a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22536a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(long j8, i53.c<b> cVar, m mVar, int i14, int i15) {
        long jC;
        int i16;
        int i17;
        boolean z14;
        long j14;
        p2 p2VarI0;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        int i18;
        int i19;
        b bVar2;
        int i24;
        long j15;
        cVar.getClass();
        o0 o0VarE = mVar.E(2126342504);
        if ((i15 & 1) == 0) {
            jC = j8;
            int i25 = o0VarE.l(jC) ? 4 : 2;
            int i26 = i14 | i25;
            if (o0VarE.B(cVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i17 = i26 | i16;
            if ((i17 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) == 0 && !o0VarE.o0()) {
                    o0VarE.e();
                    int i27 = i15 & 1;
                } else if ((i15 & 1) != 0) {
                    jC = j.c(d92.b.f58623a, o0VarE);
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                r rVarE = u1.n.e(r.S, jC, m1.f128891a);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = l.y(rVarE, j92.b.f97899b.f97920e);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(-1367168557);
                i18 = 0;
                for (b bVar3 : cVar) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        x.q();
                        throw null;
                    }
                    bVar2 = bVar3;
                    if (i18 > 0) {
                        o0VarE.C(782123983);
                        r.a aVar2 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        e5.t(aVar2, j92.b.f97899b.f97918c, o0VarE, false);
                    } else {
                        o0VarE.C(782211434);
                        o0VarE.g0(false);
                    }
                    i24 = a.f22536a[bVar2.f22531d.ordinal()];
                    if (i24 != 1) {
                        j15 = jC;
                        o0VarE.C(782319903);
                        o0 o0Var = o0VarE;
                        f0.f110999a.d(384, 1, bVar2.f22529b, x2.f(r.S, 1.0f), bVar2.f22528a, o0Var, null, bVar2.f22530c);
                        o0VarE = o0Var;
                        o0VarE.g0(false);
                    } else if (i24 != 2) {
                        j15 = jC;
                        o0VarE.C(782641373);
                        f0.f110999a.i(bVar2.f22528a, x2.f(r.S, 1.0f), bVar2.f22530c, bVar2.f22529b, o0VarE, 48, 0);
                        o0VarE.g0(false);
                    } else {
                        if (i24 == 3) {
                            throw kg.f.h(o0VarE, 1272160009, false);
                        }
                        o0VarE.C(782941298);
                        j15 = jC;
                        f0.f110999a.k(bVar2.f22528a, null, bVar2.f22530c, bVar2.f22529b, o0VarE, 0, 2);
                        o0VarE.g0(false);
                    }
                    i18 = i19;
                    jC = j15;
                }
                long j16 = jC;
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
                j14 = j16;
            } else {
                o0VarE.e();
                j14 = jC;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aq.x2(j14, cVar, i14, i15);
            }
        }
        jC = j8;
        int i28 = i14 | i25;
        if (o0VarE.B(cVar)) {
            i16 = 32;
        } else {
            i16 = 16;
        }
        i17 = i28 | i16;
        if ((i17 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) == 0) {
                if ((i15 & 1) != 0) {
                    jC = j.c(d92.b.f58623a, o0VarE);
                }
            } else if ((i15 & 1) != 0) {
                jC = j.c(d92.b.f58623a, o0VarE);
            }
            o0VarE.h0();
            x1 x1Var3 = n.f135158a;
            r rVarE2 = u1.n.e(r.S, jC, m1.f128891a);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY2 = l.y(rVarE2, j92.b.f97899b.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarY2, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            o0VarE.C(-1367168557);
            i18 = 0;
            while (r15.hasNext()) {
                i19 = i18 + 1;
                if (i18 >= 0) {
                    x.q();
                    throw null;
                }
                bVar2 = bVar3;
                if (i18 > 0) {
                    o0VarE.C(782123983);
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e5.t(aVar3, j92.b.f97899b.f97918c, o0VarE, false);
                } else {
                    o0VarE.C(782211434);
                    o0VarE.g0(false);
                }
                i24 = a.f22536a[bVar2.f22531d.ordinal()];
                if (i24 != 1) {
                    j15 = jC;
                    o0VarE.C(782319903);
                    o0 o0Var2 = o0VarE;
                    f0.f110999a.d(384, 1, bVar2.f22529b, x2.f(r.S, 1.0f), bVar2.f22528a, o0Var2, null, bVar2.f22530c);
                    o0VarE = o0Var2;
                    o0VarE.g0(false);
                } else if (i24 != 2) {
                    j15 = jC;
                    o0VarE.C(782641373);
                    f0.f110999a.i(bVar2.f22528a, x2.f(r.S, 1.0f), bVar2.f22530c, bVar2.f22529b, o0VarE, 48, 0);
                    o0VarE.g0(false);
                } else {
                    if (i24 == 3) {
                        throw kg.f.h(o0VarE, 1272160009, false);
                    }
                    o0VarE.C(782941298);
                    j15 = jC;
                    f0.f110999a.k(bVar2.f22528a, null, bVar2.f22530c, bVar2.f22529b, o0VarE, 0, 2);
                    o0VarE.g0(false);
                }
                i18 = i19;
                jC = j15;
            }
            long j17 = jC;
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var4 = n.f135158a;
            j14 = j17;
        } else {
            o0VarE.e();
            j14 = jC;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq.x2(j14, cVar, i14, i15);
        }
    }
}

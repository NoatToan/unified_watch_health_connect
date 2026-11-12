package rr0;

import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(Integer num, Integer num2, boolean z14, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        boolean z19;
        o0 o0VarE = mVar.E(473947924);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(num) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i16 | (o0VarE.B(num2) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                h4.r.a aVar2 = h4.r.S;
                h4.r rVarE = u1.n.e(x2.f(aVar2, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
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
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                w.a(Double.valueOf(num.intValue()), num2 != null ? Double.valueOf(num2.intValue()) : null, z18, o0VarE, i17 & 896, 0);
                boolean z24 = z18;
                if ((num2 == null && num2.intValue() == -1) || num2 == null || num.intValue() < num2.intValue()) {
                    z19 = true;
                    o0VarE.C(1329408216);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1329208979);
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar2, 8);
                    String strQ = gl1.y.Q(o0VarE, R.string.common_weekly_goal_met);
                    d92.b.f58624b.getClass();
                    z19 = true;
                    mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z19);
                z17 = z24;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cn1.a(num, num2, z17, i14, i15, 6);
            }
        }
        i17 |= 384;
        z15 = z14;
        if ((i17 & 147) != 146) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarE2 = u1.n.e(x2.f(aVar5, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, aVar6, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE2, o0VarE);
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
            w.a(Double.valueOf(num.intValue()), num2 != null ? Double.valueOf(num2.intValue()) : null, z18, o0VarE, i17 & 896, 0);
            boolean z25 = z18;
            if (num2 == null) {
                z19 = true;
                o0VarE.C(1329408216);
                o0VarE.g0(false);
            } else {
                z19 = true;
                o0VarE.C(1329408216);
                o0VarE.g0(false);
            }
            o0VarE.g0(z19);
            z17 = z25;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(num, num2, z17, i14, i15, 6);
        }
    }
}

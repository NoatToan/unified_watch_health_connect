package yy1;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r11v2, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void a(boolean z14, bb1.g gVar, w01.d dVar, e23.p<? super Long, ? super Long, Unit> pVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        bb1.g gVar2;
        e23.p<? super Long, ? super Long, Unit> pVar2;
        ?? r14;
        ?? r15;
        ?? r16;
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1579586728);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            gVar2 = gVar;
            i15 |= o0VarE.B(gVar2) ? 32 : 16;
        } else {
            gVar2 = gVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? 2048 : 1024;
        } else {
            pVar2 = pVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                o0VarE.C(1891846156);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_strategies_header);
                d92.b.f58624b.getClass();
                r15 = 0;
                mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                o0 o0Var = o0VarE;
                o0Var.g0(false);
                r16 = o0Var;
            } else {
                r15 = 0;
                o0VarE.C(1892071898);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.y(aVar2, j92.b.f97899b.f97920e), o0VarE);
                o0VarE.g0(false);
                r16 = o0VarE;
            }
            bb1.f.b(gVar2, null, null, pVar2, r16, ((i15 >> 3) & 14) | 432 | (i15 & 7168));
            if (dVar == null) {
                r16.C(1892370396);
                r16.g0(r15);
            } else {
                r16.C(1892370397);
                ?? r17 = (i15 & 57344) == 16384 ? 1 : r15;
                Object objQ = r16.q();
                if (r17 == 0) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d(aVar, r15);
                        r16.K(objQ);
                    }
                } else {
                    objQ = new d(aVar, r15);
                    r16.K(objQ);
                }
                z21.f.c(dVar, (e23.a) objQ, r16, r15);
                r16.g0(r15);
            }
            r16.g0(true);
            r14 = r16;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, gVar, dVar, pVar, aVar, i14);
        }
    }
}

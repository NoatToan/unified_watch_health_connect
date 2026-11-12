package wl;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.f;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import tf0.i;
import u1.a2;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:73:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yl.d dVar, o82.a aVar, i iVar, boolean z14, m mVar, int i14) {
        int i15;
        boolean z15;
        aVar.getClass();
        iVar.getClass();
        o0 o0VarE = mVar.E(-1223779463);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarB = a2.b(x2.d(aVar2, 1.0f), a2.a(o0VarE), true);
            h4.d.f81522a.getClass();
            g.a aVar3 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                o0VarE.C(-1084500865);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1084865084);
                if ((dVar != null ? dVar.f197640b : null) == null) {
                    o0VarE.C(-1084816415);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1084816414);
                    String str = dVar.f197640b;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE.g0(false);
                }
                tl.c.a(dVar != null ? dVar.f197639a : null, o0VarE, 0);
                l.f(b0Var.a(aVar2, 1.0f, true), o0VarE);
                o0VarE.g0(false);
            }
            boolean z16 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar5 = m.f135153a;
            if (z16) {
                if ((dVar != null ? dVar.f197639a : null) != null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                objQ = hb.a.n(z15, o0VarE);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    if ((dVar != null ? dVar.f197639a : null) != null || dVar.f197641c.a()) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    objQ = hb.a.n(z15, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVarF, j92.b.f97899b.f97920e);
            Object objQ2 = o0VarE.q();
            aVar5.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new vu1.b(b0Var, 16);
                o0VarE.K(objQ2);
            }
            r rVarA = wz1.i.a((e23.l) objQ2, rVarY, z14);
            boolean z17 = !z14;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a(0);
                o0VarE.K(objQ3);
            }
            r rVarA2 = wz1.i.a((e23.l) objQ3, rVarA, z17);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            LocalDate localDateH = g22.l.h(aVar.f130843a);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new w72.f(27);
                o0VarE.K(objQ4);
            }
            e23.a aVar6 = (e23.a) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new a(1);
                o0VarE.K(objQ5);
            }
            tf0.r.a(zBooleanValue, localDateH, iVar, rVarA2, aVar6, (e23.l) objQ5, z3.f.c(-1615946644, new wb1.i(dVar, rVarA2), o0VarE), o0VarE, (i15 & 896) | (i.f164439d << 6) | 1794048);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(dVar, aVar, iVar, z14, i14, 24);
        }
    }
}

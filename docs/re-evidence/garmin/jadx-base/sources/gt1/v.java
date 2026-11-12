package gt1;

import b82.f0;
import f5.z0;
import h5.e0;
import i3.p7;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class v {
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, us1.k kVar, List<? extends us1.k> list, e23.l<? super us1.k, Unit> lVar, p3.m mVar, int i14, int i15) {
        int i16;
        Object obj;
        e23.l<? super us1.k, Unit> lVar2;
        o0 o0Var;
        Object obj2;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        Object objQ2;
        kVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(724020144);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.k(kVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i15 & 4) == 0) {
                obj = list;
                int i17 = o0VarE.r(obj) ? 256 : 128;
                i16 |= i17;
            } else {
                obj = list;
            }
            i16 |= i17;
        } else {
            obj = list;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 4) != 0) {
                    obj2 = us1.k.f172429f;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
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
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                y3 y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1206758922, new g80.e(5, p1Var, kVar), o0VarE), o0VarE, 56);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                h4.r rVarE = u1.n.e(aVar2, d92.b.a(o0VarE).c().g(), m1.f128891a);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new gp.e(p1Var, 3);
                    o0VarE.K(objQ2);
                }
                i3.u.a(zBooleanValue, (e23.a) objQ2, rVarE, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(1483515739, new fb0.b(obj2, (e23.l) lVar2, (Object) p1Var, (Object) kVar, 5), o0VarE), o0VarE, 48, 48, 2040);
                o0Var = o0VarE;
                o0Var.g0(true);
                obj = obj2;
            } else {
                o0VarE.e();
            }
            obj2 = obj;
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            y3 y3Var2 = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1206758922, new g80.e(5, p1Var, kVar), o0VarE), o0VarE, 56);
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            h4.r rVarE2 = u1.n.e(aVar3, d92.b.a(o0VarE).c().g(), m1.f128891a);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new gp.e(p1Var, 3);
                o0VarE.K(objQ2);
            }
            i3.u.a(zBooleanValue2, (e23.a) objQ2, rVarE2, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(1483515739, new fb0.b(obj2, (e23.l) lVar2, (Object) p1Var, (Object) kVar, 5), o0VarE), o0VarE, 48, 48, 2040);
            o0Var = o0VarE;
            o0Var.g0(true);
            obj = obj2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar, kVar, obj, lVar, i14, i15, 10);
        }
    }
}

package g50;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import l72.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    public static final void a(i50.g gVar, e23.l<? super i50.a, Unit> lVar, p3.m mVar, int i14) {
        r.a aVar;
        i50.e eVar = gVar.f91758l;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1256923682);
        int i15 = (o0VarE.B(gVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (!gVar.f91749c || eVar == null) {
                o0VarE.C(1604686556);
                int i16 = i15 & 126;
                h50.i.a(gVar, lVar, o0VarE, i16);
                h50.m.b(gVar, lVar, b0Var.a(aVar2, 1.0f, true), o0VarE, i16);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1604527991);
                h50.h.a(eVar, b0Var.a(aVar2, 1.0f, true), o0VarE, 0);
                o0VarE.g0(false);
            }
            boolean z14 = gVar.f91760n;
            p3.m.a aVar4 = p3.m.f135153a;
            if (z14) {
                o0VarE.C(1604965463);
                f0 f0Var = f0.f110999a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_next);
                r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                boolean z15 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z15) {
                    objQ = new e40.g(lVar, 28);
                    o0VarE.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e40.g(lVar, 28);
                        o0VarE.K(objQ);
                    }
                }
                aVar = aVar2;
                f0Var.d(0, 9, (e23.a) objQ, rVarY, strQ, o0VarE, null, false);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                aVar = aVar2;
                o0VarE.C(1605233582);
                o0VarE.g0(false);
            }
            String str = gVar.f91759m;
            if (str == null) {
                o0VarE.C(1605276702);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1605276703);
                f0 f0Var2 = f0.f110999a;
                r rVarB = b0Var.b(aVar, h4.d.a.f81537o);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA = c2.l.A(rVarB, 0.0f, j92.b.f97899b.f97920e, 1);
                boolean z16 = (i15 & 112) == 32;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new e40.g(lVar, 29);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new e40.g(lVar, 29);
                        o0VarE.K(objQ2);
                    }
                }
                f0Var2.k(str, rVarA, false, (e23.a) objQ2, o0VarE, 0, 4);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(gVar, lVar, i14, 0);
        }
    }
}

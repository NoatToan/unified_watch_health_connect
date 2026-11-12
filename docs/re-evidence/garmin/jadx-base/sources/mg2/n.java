package mg2;

import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h5.e0;
import java.util.ArrayList;
import kd0.h6;
import kotlin.t1;
import l30.y0;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    public static final void a(g gVar, h4.r rVar, e23.q qVar, p3.m mVar, int i14) {
        gVar.getClass();
        c2 c2Var = gVar.f118387b;
        o0 o0VarE = mVar.E(1856301347);
        int i15 = i14 | 432;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            rVar = h4.r.S;
            j.f118398a.getClass();
            qVar = j.f118399b;
            x1 x1Var = p3.n.f135158a;
            f fVar = (f) c2Var.getF182175a();
            kotlin.h hVar = (kotlin.h) o0VarE.A(t1.f91483a);
            boolean zB = o0VarE.B(fVar) | o0VarE.r(hVar);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new k(fVar, hVar, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(fVar, hVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, fVar, o0VarE);
            b((f) c2Var.getF182175a(), rVar, qVar, o0VarE, 432);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        e23.q qVar2 = qVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) gVar, (Object) rVar2, (o13.h) qVar2, i14, 23);
        }
    }

    public static final void b(f fVar, h4.r rVar, e23.q qVar, p3.m mVar, int i14) {
        f fVar2 = fVar;
        o0 o0VarE = mVar.E(858549738);
        int i15 = (i14 & 6) == 0 ? (o0VarE.B(fVar2) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.ada_alert);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new v();
                o0VarE.K(objQ);
            }
            v vVar = (v) objQ;
            Object obj = vVar.f118429a;
            ArrayList arrayList = vVar.f118430b;
            if (p005kotlin.jvm.internal.s.g(fVar2, obj)) {
                o0VarE.C(527979032);
                o0VarE.g0(false);
            } else {
                o0VarE.C(525476588);
                vVar.f118429a = fVar2;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i16 = 0; i16 < size; i16++) {
                    arrayList2.add((f) ((u) arrayList.get(i16)).f118427a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(fVar2)) {
                    arrayList3.add(fVar2);
                }
                arrayList.clear();
                ArrayList arrayListA = i6.b.a(arrayList3);
                int size2 = arrayListA.size();
                int i17 = 0;
                while (i17 < size2) {
                    f fVar3 = (f) arrayListA.get(i17);
                    arrayList.add(new u(fVar3, z3.f.c(-1988093808, new ku1.l((Object) fVar3, (Object) fVar2, (Object) arrayList3, (Object) vVar, strQ, 5), o0VarE)));
                    i17++;
                    fVar2 = fVar;
                }
                o0VarE.g0(false);
            }
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            vVar.f118431c = p0.j(o0VarE);
            o0VarE.C(935499772);
            int size3 = arrayList.size();
            for (int i18 = 0; i18 < size3; i18++) {
                u uVar2 = (u) arrayList.get(i18);
                f fVar4 = (f) uVar2.f118427a;
                e23.q<e23.p<? super p3.m, ? super Integer, Unit>, p3.m, Integer, Unit> qVar2 = uVar2.f118428b;
                o0VarE.N(-1431620222, fVar4);
                qVar2.invoke(z3.f.c(126043659, new y0(22, qVar, fVar4), o0VarE), o0VarE, 6);
                o0VarE.g0(false);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(fVar, rVar, qVar, i14, 25);
        }
    }
}

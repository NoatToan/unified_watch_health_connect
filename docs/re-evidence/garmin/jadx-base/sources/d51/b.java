package d51;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import cn1.p;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.k;
import d4.h;
import g6.f;
import h4.d;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import o51.e;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void a(e eVar, e23.a aVar, r rVar, m mVar, int i14) {
        r rVar2;
        b0 b0Var;
        r.a aVar2;
        ?? r14;
        eVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(484729774);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | 384;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar3 = r.S;
            x1 x1Var = n.f135158a;
            ie2.n.f93149a.getClass();
            k kVarA = ie2.n.a();
            i.d dVar = eVar.f129228a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new h(1);
                o0VarE.K(objQ);
            }
            je2.b<?> bVarE = ((com.garmin.android.library.mapsdkadapter.r) kVarA).e(dVar, null, (e23.a) objQ, o0VarE, 432);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar3, o0VarE);
            g.V.getClass();
            e0.a aVar4 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if (bVarE == null) {
                o0VarE.C(1876670043);
                o0VarE.g0(false);
                b0Var = b0Var2;
                r14 = 1;
                aVar2 = aVar3;
            } else {
                o0VarE.C(1876670044);
                f.a aVar5 = f.f75994b;
                r rVarH = x2.h(x2.f(aVar3, 1.0f), 250);
                i53.c<le2.d> cVar = eVar.f129232e;
                i53.c<le2.c> cVar2 = eVar.f129234g;
                List<ke2.b> list = eVar.f129233f;
                int i16 = eVar.f129229b;
                boolean z14 = eVar.f129231d;
                int i17 = ((i15 << 15) & 3670016) | 196614 | (ke2.b.f104550d << 9) | 1073741824;
                b0Var = b0Var2;
                aVar2 = aVar3;
                r14 = 1;
                bVarE.b(rVarH, cVar, cVar2, list, i16, false, aVar, z14, null, o0VarE, i17, 256);
                o0VarE.g0(false);
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            z41.d.a(b0Var.b(l.A(aVar2, 0.0f, j92.b.f97899b.f97920e, r14), d.a.f81537o), o0VarE, 0);
            o0VarE.g0(r14);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(eVar, aVar, rVar2, i14, 10);
        }
    }
}

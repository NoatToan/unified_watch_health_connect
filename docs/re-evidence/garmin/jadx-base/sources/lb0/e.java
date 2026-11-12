package lb0;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import java.util.List;
import k2.h;
import k2.i;
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

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    public static final void a(List list, int i14, l lVar, r rVar, m mVar, int i15) {
        r rVar2;
        h hVar;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-610443376);
        int i16 = 256;
        int i17 = i15 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (list.isEmpty()) {
                vb.h.s("Options list cannot be empty");
                return;
            }
            if (i14 < 0 || i14 >= list.size()) {
                vb.h.s("Selected index must be within options range");
                return;
            }
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            rVar2 = rVar;
            r rVarC = k.c(rVar2, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-740436983);
            int i18 = 0;
            for (Object obj : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    x.q();
                    throw null;
                }
                f fVar = (f) obj;
                if (i18 == 0) {
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar2.getClass();
                    hVar = i.c(f14, eVar.f97920e, 0.0f, 0.0f, 12);
                } else if (i18 == list.size() - 1) {
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f15 = eVar2.f97920e;
                    bVar3.getClass();
                    hVar = i.c(0.0f, 0.0f, eVar2.f97920e, f15, 3);
                } else {
                    h hVar2 = i.f102406a;
                    int i24 = k2.c.f102402a;
                    k2.g gVar = new k2.g(0.0f);
                    hVar = new h(gVar, gVar, gVar, gVar);
                }
                h hVar3 = hVar;
                String str = fVar.f111711b;
                boolean z14 = i14 == i18;
                String str2 = fVar.f111710a;
                boolean zK = ((i17 & 896) == i16) | o0VarE.k(i18);
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new au0.m(lVar, i18, 14);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new au0.m(lVar, i18, 14);
                        o0VarE.K(objQ);
                    }
                }
                d.a(str, z14, str2, (e23.a) objQ, hVar3, o0VarE, 0);
                i18 = i19;
                i16 = 256;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.f(list, i14, lVar, rVar2, i15);
        }
    }
}

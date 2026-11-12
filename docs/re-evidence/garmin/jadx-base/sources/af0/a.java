package af0;

import a03.t0;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import e23.l;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:61:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0236  */
    public static final void a(we0.b bVar, i53.c<String> cVar, String str, l<? super List<String>, Unit> lVar, l<? super String, Unit> lVar2, m mVar, int i14) {
        l<? super String, Unit> lVar3;
        f82.c eVar;
        cVar.getClass();
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1856009286);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarA = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            bVar3.getClass();
            r rVarC2 = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
            String str2 = bVar.f184731a;
            d92.b.f58624b.getClass();
            mh.c(str2, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            bVar3.getClass();
            r rVarA2 = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            bVar3.getClass();
            r rVarC3 = c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
            List<we0.a> list = bVar.f184732b;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (we0.a aVar3 : list) {
                arrayList.add(new j0(aVar3.f184729b, aVar3.f184730c, null, false, cVar.contains(aVar3.f184728a), 12, null));
            }
            i53.c cVarE = i53.a.e(arrayList);
            int i16 = we0.c.a.f184738a[bVar.f184733c.ordinal()];
            if (i16 == 1) {
                eVar = new f82.e();
            } else {
                if (i16 != 2) {
                    u0.r();
                    return;
                }
                eVar = new f82.b();
            }
            f82.c cVar2 = eVar;
            boolean zR = o0VarE.r(bVar) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                objQ = new t0(4, bVar, lVar);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new t0(4, bVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            e82.a.a(cVarE, rVarC3, cVar2, (p) objQ, o0VarE, 0, 0);
            r.a aVar5 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), o0VarE);
            we0.f fVar = bVar.f184734d;
            boolean z14 = (57344 & i15) == 16384;
            Object objQ2 = o0VarE.q();
            if (z14) {
                lVar3 = lVar2;
                objQ2 = new a12.a(lVar3, 3);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    lVar3 = lVar2;
                    objQ2 = new a12.a(lVar3, 3);
                    o0VarE.K(objQ2);
                } else {
                    lVar3 = lVar2;
                }
            }
            b.a(null, fVar, str, (l) objQ2, o0VarE, i15 & 896);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            lVar3 = lVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.z((Object) bVar, (Object) cVar, (Object) str, (Object) lVar, (o13.h) lVar3, i14, 3);
        }
    }
}

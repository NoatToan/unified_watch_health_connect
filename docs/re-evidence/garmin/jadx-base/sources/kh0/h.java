package kh0;

import c2.b0;
import c2.y;
import c2.z;
import g02.q0;
import h5.e0;
import java.util.List;
import o53.f0;
import org.joda.time.DateTime;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ih0.s sVar, List<dh0.i> list, DateTime dateTime, DateTime dateTime2, int i14, p3.m mVar, int i15) {
        sVar.getClass();
        o0 o0VarE = mVar.E(1078661427);
        int i16 = i15 | (o0VarE.r(sVar) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(dateTime) ? 256 : 128) | (o0VarE.r(dateTime2) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarG = f0.G(sVar.f93489h, o0VarE);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            int i17 = i16 >> 3;
            a.a(list, dateTime, dateTime2, true, i14, o0VarE, (i17 & 896) | (i17 & 14) | 3072 | (i17 & 112) | (i16 & 57344));
            v60.a aVar3 = (v60.a) p1VarG.getF182175a();
            if (aVar3 == null || !aVar3.f175792a) {
                o0VarE.C(665388293);
                o0VarE.g0(false);
            } else {
                o0VarE.C(665243182);
                v60.a aVar4 = (v60.a) p1VarG.getF182175a();
                String str = aVar4 != null ? aVar4.f175793b : null;
                boolean zR = o0VarE.r(sVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new ih0.r(sVar, 2);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ih0.r(sVar, 2);
                        o0VarE.K(objQ);
                    }
                }
                l.a(0, (e23.a) objQ, str, o0VarE);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(sVar, (List) list, dateTime, dateTime2, i14, i15);
        }
    }
}

package ux;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
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
import sk0.k1;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    public static final void a(List<bx.f> list, DateTime dateTime, DateTime dateTime2, l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(-572317692);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            LocalDate localDate2 = dateTime2.toLocalDate();
            localDate2.getClass();
            int i16 = i15 & 14;
            f.a(i16, list, localDate, localDate2, o0VarE);
            LocalDate localDate3 = dateTime.toLocalDate();
            localDate3.getClass();
            LocalDate localDate4 = dateTime2.toLocalDate();
            localDate4.getClass();
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ta0.j(lVar, 14);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ta0.j(lVar, 14);
                    o0VarE.K(objQ);
                }
            }
            b.a(i16, (l) objQ, list, localDate3, localDate4, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1((Object) list, (Object) dateTime, (Object) dateTime2, (l) lVar, i14, 19);
        }
    }
}

package di0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.google.maps.android.compose.u;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.List;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(LocalDate localDate, LocalDate localDate2, sh0.e eVar, e23.l lVar, m mVar, int i14) {
        LocalDate localDate3;
        o0 o0Var;
        List<sh0.f> listG0;
        List<sh0.f> list;
        sh0.e eVar2 = eVar;
        lVar.getClass();
        o0 o0VarE = mVar.E(-2001860364);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(localDate) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            localDate3 = localDate2;
            i15 |= o0VarE.r(localDate3) ? 32 : 16;
        } else {
            localDate3 = localDate2;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(eVar2) : o0VarE.r(eVar2) ? 256 : 128;
        }
        e23.l lVar2 = lVar;
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(new xh0.c(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0Var = o0VarE;
            eVar2 = eVar;
            j.a(localDate, localDate3, eVar2, (xh0.c) p1Var.getF182175a(), o0Var, (i16 & 126) | (sh0.e.f159295b << 6) | (i16 & 896));
            d92.b.f58625c.getClass();
            r rVarD = x2.d(c2.l.y(aVar, j92.b.f97899b.f97918c), 1.0f);
            z zVarA2 = y.a(kVar, aVar2, o0Var, 0);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            r rVarC2 = h4.k.c(rVarD, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar3);
            } else {
                o0Var.c();
            }
            b4.c(eVar3, zVarA2, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0Var);
            if (eVar2 == null || (list = eVar2.f159296a) == null) {
                listG0 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    sh0.f.d dVar = ((sh0.f) obj).f159298b;
                    Integer num = dVar != null ? dVar.f159301a : null;
                    if (num != null && num.intValue() > 0) {
                        arrayList.add(obj);
                    }
                }
                listG0 = h0.G0(arrayList);
            }
            if (listG0 == null) {
                o0Var.C(-889095070);
                o0Var.g0(false);
            } else {
                o0Var.C(-889095069);
                for (sh0.f fVar2 : listG0) {
                    sh0.f.d dVar2 = fVar2.f159298b;
                    String str = fVar2.f159297a;
                    k.a(dVar2, str != null ? g22.k.v(str, "yyyy-MM-dd") : null, (xh0.c) p1Var.getF182175a(), lVar2, o0Var, sh0.f.d.f159300d | (i16 & 7168));
                    lVar2 = lVar;
                }
                o0Var.g0(false);
                Unit unit = Unit.INSTANCE;
            }
            o0Var.g0(true);
            o0Var.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(localDate, localDate2, eVar2, lVar, i14, 13);
        }
    }
}

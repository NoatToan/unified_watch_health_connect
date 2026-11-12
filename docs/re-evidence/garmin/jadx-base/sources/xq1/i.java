package xq1;

import androidx.room.a0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.util.List;
import l72.p2;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import w52.j0;
import wv0.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    public static final void a(jq1.i iVar, LocalDate localDate, LocalDate localDate2, e23.l<? super LocalDate, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        List<jq1.j> list;
        o0 o0VarP = a0.p(lVar, aVar, mVar, -177920971);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarP.B(iVar) : o0VarP.r(iVar) ? 4 : 2) | (o0VarP.r(localDate) ? 32 : 16) | (o0VarP.r(localDate2) ? 256 : 128) | (o0VarP.r(lVar) ? 2048 : 1024) | (o0VarP.r(aVar) ? 16384 : 8192);
        if (o0VarP.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarP), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            r rVarC = h4.k.c(rVarE, o0VarP);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            i53.c cVarE = null;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar2);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            m.a(iVar, localDate, localDate2, yd1.b.WEEKLY, o0VarP, (i15 & 896) | jq1.i.f100018d | 3072 | (i15 & 14) | (i15 & 112));
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(o0VarP, R.string.activity_view_personal_records_label);
            boolean z14 = (57344 & i15) == 16384;
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new v(aVar, 22);
                o0VarP.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(aVar, 22);
                    o0VarP.K(objQ);
                }
            }
            p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, o0VarP, 0, 254);
            if (iVar != null && (list = iVar.f100019a) != null) {
                cVarE = i53.a.e(list);
            }
            jq1.j.Companion companion = jq1.j.INSTANCE;
            h.a(cVarE, lVar, o0VarP, (i15 >> 6) & 112);
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(iVar, localDate, localDate2, lVar, aVar, i14, 6);
        }
    }
}

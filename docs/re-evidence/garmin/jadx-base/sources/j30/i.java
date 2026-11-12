package j30;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import k30.m;
import k30.n;
import k30.o;
import l72.r1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    public static final void a(n nVar, l<? super m, Unit> lVar, l<? super i53.c<o>, Unit> lVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-215041354);
        int i15 = (o0VarE.B(nVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r rVarB = a2.b(r.S, a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
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
            r1.b(gl1.y.Q(o0VarE, R.string.title_sort_by), z3.f.c(493874183, new f(nVar, lVar, 0), o0VarE), o0VarE, 48, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_filter_by);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_select_all);
            boolean z14 = ((i15 & 896) == 256) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new g(nVar, lVar2, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(nVar, lVar2, 0);
                    o0VarE.K(objQ);
                }
            }
            r1.c(strQ, strQ2, (e23.a) objQ, false, null, z3.f.c(-23004926, new f(nVar, lVar2, 1), o0VarE), o0VarE, 196608, 24);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(nVar, lVar, lVar2, i14);
        }
    }

    public static final void b(n nVar, e23.a<Unit> aVar, l<? super m, Unit> lVar, l<? super i53.c<o>, Unit> lVar2, p3.m mVar, int i14) {
        nVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1222671749);
        int i15 = (o0VarE.B(nVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(-1332034767, new b(aVar, nVar, lVar, lVar2), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(nVar, aVar, lVar, lVar2, i14);
        }
    }

    public static final void c(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        String str2;
        o0 o0VarE = mVar.E(2140425221);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(-1971546112);
                str2 = str + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.selected);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1971480888);
                o0VarE.g0(false);
                str2 = str;
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str2);
            b92.a aVarB = c0235a.b();
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(-2139734630, new d(z14, b14, b14), o0VarE);
            int i16 = b92.a.f16960b;
            p2Var.g(str, null, aVarB, null, eVarC, false, false, aVar, o0VarE, (i15 & 14) | 24576 | ((i15 << 18) & 234881024), 234);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 9);
        }
    }
}

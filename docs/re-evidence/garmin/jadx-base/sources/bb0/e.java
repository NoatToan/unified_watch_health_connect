package bb0;

import a03.g;
import a51.k;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import e23.l;
import gl1.y;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u62.i3;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    public static final void a(f fVar, l<? super Integer, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar, mVar, 1361864995);
        int i15 = (o0VarP.k(fVar == null ? -1 : fVar.ordinal()) ? 4 : 2) | i14 | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            w13.c cVar = f.f17299e;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new a12.a(lVar, 12);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a12.a(lVar, 12);
                    o0VarP.K(objQ);
                }
            }
            b(fVar, cVar, (l) objQ, aVar, o0VarP, (i15 & 14) | ((i15 << 3) & 7168));
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(fVar, lVar, aVar, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, List<? extends f> list, l<? super f, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(592174654);
        int i15 = (o0VarE.k(fVar == null ? -1 : fVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(fVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = y.Q(o0VarE, R.string.startup_activity_levels_selection_title);
            s62.a.f157643a.getClass();
            u4.d dVarA = i3.a(t62.a.f162797a);
            f fVar2 = (f) p1Var.getF182175a();
            String strL = null;
            Integer numValueOf = fVar2 != null ? Integer.valueOf(fVar2.f17302c) : null;
            if (numValueOf == null) {
                o0VarE.C(2045040553);
                o0VarE.g0(false);
            } else {
                strL = u0.l(o0VarE, 2045040554, numValueOf, o0VarE, false);
            }
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new k(p1Var, lVar, 2);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            p.b("user_profile_wheelchair_activity_level_screen", strQ, dVarA, strL, null, strQ2, (e23.a) objQ2, ((f) p1Var.getF182175a()) != null, null, null, false, null, null, false, false, aVar, null, null, null, null, null, z3.f.c(-867264194, new a(list, p1Var, 1), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161296);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(fVar, list, lVar, aVar, i14, 12);
        }
    }
}

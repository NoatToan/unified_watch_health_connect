package bb0;

import a03.g;
import a51.k;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import e23.l;
import gl1.y;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    public static final void a(c cVar, l<? super Integer, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar, mVar, 1659057721);
        int i15 = (o0VarP.k(cVar == null ? -1 : cVar.ordinal()) ? 4 : 2) | i14 | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            w13.c cVar2 = c.f17292d;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new a12.a(lVar, 11);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a12.a(lVar, 11);
                    o0VarP.K(objQ);
                }
            }
            b(cVar, cVar2, (l) objQ, aVar, o0VarP, (i15 & 14) | ((i15 << 3) & 7168));
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(cVar, lVar, aVar, i14, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c cVar, List<? extends c> list, l<? super c, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        e23.a<Unit> aVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(579641920);
        int i15 = (o0VarE.k(cVar == null ? -1 : cVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(cVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = y.Q(o0VarE, R.string.lbl_what_activity_level);
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            String strQ2 = y.Q(o0VarE, R.string.msg_medium_activity_level_description);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new k(p1Var, lVar, 1);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            p.b("user_profile_activity_level_screen", strQ, dVarA, strQ2, null, strQ3, (e23.a) objQ2, ((c) p1Var.getF182175a()) != null, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, z3.f.c(2088279360, new a(list, p1Var, 0), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161296);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(cVar, list, lVar, aVar, i14, 11);
        }
    }
}

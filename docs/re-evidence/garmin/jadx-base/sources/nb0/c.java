package nb0;

import com.garmin.android.apps.connectmobile.R;
import d53.w;
import da0.p;
import e23.l;
import gl1.y;
import gw1.e;
import lc.u0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s90.f;
import u4.d;
import v62.l4;
import x5.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f fVar, l<? super String, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        String strL;
        o0 o0VarE = mVar.E(-915450839);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n("");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new b(0);
                o0VarE.K(objQ2);
            }
            r0 r0Var = (r0) objQ2;
            String strQ = y.Q(o0VarE, R.string.lbl_enter_name_or_initials);
            Integer num = fVar.f158033b;
            if (num == null) {
                o0VarE.C(847171422);
                o0VarE.g0(false);
                strL = null;
            } else {
                strL = u0.l(o0VarE, 847171423, num, o0VarE, false);
            }
            s62.a.f157643a.getClass();
            d dVarA = l4.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            boolean z14 = !w.J((String) p1Var.getF182175a());
            boolean z15 = ((i15 & 896) == 256) | ((i15 & 112) == 32);
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new cv0.a(aVar, lVar, p1Var);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            p.b("user_profile_index_shortname_screen", strQ, dVarA, strL, null, strQ2, (e23.a) objQ3, z14, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, z3.f.c(1210251561, new e(fVar, 29, r0Var, p1Var), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161296);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(fVar, lVar, aVar, aVar2, i14, 1);
        }
    }

    public static final void b(f fVar, l<? super String, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        fVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(454869750);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            a(fVar, lVar, aVar, aVar2, o0VarE, i15 & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(fVar, lVar, aVar, aVar2, i14, 0);
        }
    }
}

package fv0;

import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import cq0.p;
import e11.c0;
import ew1.c2;
import gl1.y;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        ou0.e eVar;
        String str;
        aVar.getClass();
        o0 o0VarE = mVar.E(-465350233);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Object objA = o0VarE.A(c.n.f22332a);
            objA.getClass();
            b.g gVar = (b.g) objA;
            o0VarE.L(-1614864554);
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), gVar.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVar), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            g gVar2 = (g) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(gVar2.f73645e, o0VarE);
            ou0.e eVar2 = (ou0.e) ((g3) p1VarC.getF182175a()).f35301b;
            String str2 = "";
            if (!s.g(eVar2 != null ? eVar2.f133978a : null, y.Q(o0VarE, R.string.lbl_shared_livetrack)) && (eVar = (ou0.e) ((g3) p1VarC.getF182175a()).f35301b) != null && (str = eVar.f133978a) != null) {
                str2 = str;
            }
            String strQ = y.Q(o0VarE, R.string.live_tracking_session_name);
            boolean zR = o0VarE.r(gVar2) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new c2(19, gVar2, aVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c2(19, gVar2, aVar);
                    o0VarE.K(objQ);
                }
            }
            gl1.d.b(strQ, (e23.a) objQ, false, null, null, null, z3.f.c(299340085, new c0(15, str2, gVar2), o0VarE), o0VarE, 1572864, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(aVar, i14, 23);
        }
    }
}

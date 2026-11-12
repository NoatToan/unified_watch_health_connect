package ro0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import gl1.y;
import l72.c1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1813840617);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.feedback_report_successfully_sent);
            String strQ2 = y.Q(o0VarE, R.string.lbl_done);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new rk0.y(aVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.y(aVar, 1);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, strQ, null, null, null, strQ2, false, false, (e23.a) objQ, null, null, o0VarE, 0, 0, 1757);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.r(aVar, i14, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(boolean z14, q qVar, e23.a aVar, p3.m mVar, int i14) {
        q qVar2;
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1490528410);
        int i16 = (o0VarE.h(z14) ? 4 : 2) | i14 | 16 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(q.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                i15 = i16 & (-113);
                qVar2 = (q) u1VarResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                qVar2 = qVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n("");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.WRITE_EXTERNAL_STORAGE", null, o0VarE, 6, 2);
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ri1.b(29);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            p1 p1VarC = s9.c.c(qVar2.f153871b, o0VarE);
            String strQ = y.Q(o0VarE, R.string.feedback_page_description);
            String strQ2 = y.Q(o0VarE, R.string.feedback_could_not_send_report);
            if (((p) p1VarC.getF182175a()).f153869c) {
                strQ = strQ2;
            }
            g.g gVar = new g.g();
            boolean zR = o0VarE.r(qVar2) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new p90.h(qVar2, 29, context, p1Var);
                o0VarE.K(objQ3);
            }
            c.q qVarC = c.w.c(gVar, (e23.l) objQ3, o0VarE, 0);
            if (((p) p1VarC.getF182175a()).f153868b) {
                o0VarE.C(1336283214);
                boolean zR2 = ((i15 & 896) == 256) | o0VarE.r(qVar2);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new rk0.f(6, qVar2, aVar);
                    o0VarE.K(objQ4);
                }
                a((e23.a) objQ4, o0VarE, 0);
                o0VarE.g0(false);
            } else if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1336469245);
                boolean zB = o0VarE.B(p1Var2) | o0VarE.r(qVarC);
                Object objQ5 = o0VarE.q();
                if (zB || objQ5 == c2565a) {
                    objQ5 = new c42.g(qVarC, p1Var2, 6);
                    o0VarE.K(objQ5);
                }
                c((e23.a) objQ5, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1336658748);
                o0VarE.g0(false);
            }
            z02.d.a(((p) p1VarC.getF182175a()).f153867a, z3.f.c(1904300033, new a42.e(z14, aVar, 17), o0VarE), null, null, null, z3.f.c(242992765, new r11.k(strQ, qVar2, context, permissionStateRememberPermissionState, p1Var2, qVarC, p1Var, 2), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
            qVar2 = qVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.l(z14, qVar2, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public static final void c(e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(683423872);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1 c1Var = c1.f110940a;
            j22.b bVar = j22.b.f96736a;
            j22.a aVar2 = j22.a.f96722k;
            bVar.getClass();
            String strF = j22.b.f(aVar2);
            String strQ = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new rk0.y(aVar, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.y(aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, null, strF, null, null, strQ, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1754);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.r(aVar, i14, 25);
        }
    }
}

package yq0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.q1;
import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f72.n2;
import gl1.y;
import h4.r;
import java.util.List;
import java.util.Map;
import l72.i3;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ta0.g0;
import v62.b3;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public static final void a(t2 t2Var, b bVar, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1785958612);
        int i15 = i14 | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r.a aVar = r.S;
            r rVarA = t2Var.a(x2.f(c2.l.o(aVar, q1.Min), 1.0f), 0.75f, true);
            tq0.e eVar = bVar.f198734b;
            tq0.d dVar = bVar.f198733a;
            List<tq0.e> list = dVar.f166050d;
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new oy0.c(lVar, p1Var, 12);
                o0VarE.K(objQ2);
            }
            m.a(rVarA, eVar, list, (e23.l) objQ2, o0VarE, 0);
            r rVarA2 = t2Var.a(x2.f(aVar, 1.0f), 0.25f, true);
            c2.j.f22691a.getClass();
            c2.j.d dVar2 = c2.j.f22693c;
            String str = bVar.f198735c;
            List<String> list2 = dVar.f166048b;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new yq.d(1);
                o0VarE.K(objQ3);
            }
            e23.l lVar3 = (e23.l) objQ3;
            boolean zR = o0VarE.r(bVar) | ((i15 & 7168) == 2048);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new x9.b(29, lVar2, bVar);
                o0VarE.K(objQ4);
            }
            o0VarE = o0VarE;
            vq0.b.a(rVarA2, dVar2, 1, str, list2, lVar3, (e23.l) objQ4, o0VarE, 197040, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(t2Var, bVar, lVar, lVar2, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f fVar, List list, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        f fVar2;
        f fVar3;
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1903844960);
        int i15 = i14 | 2 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(f.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    fVar3 = (f) u1VarResolveViewModel;
                }
            } else {
                o0VarE.e();
                fVar3 = fVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(fVar3.f198752f, o0VarE);
            b bVar = ((c) p1VarC.getF182175a()).f198739b;
            p1 p1VarC2 = s9.c.c(fVar3.f198750d, o0VarE);
            boolean zR = o0VarE.r(fVar3) | o0VarE.r(list);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new i(fVar3, list, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i(fVar3, list, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, list, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_demographics_help);
            s62.a.f157643a.getClass();
            z02.d.a(((c) p1VarC.getF182175a()).f198738a, z3.f.c(-1957740869, new g0(aVar, i53.a.a(new i3("MENU_INFO", strQ, false, n2.a(t62.c.f162799a), y.Q(o0VarE, R.string.lbl_demographics_help), 4, (p005kotlin.jvm.internal.j) null), new i3("MENU_EDIT", y.Q(o0VarE, R.string.lbl_edit), false, b3.a(t62.b.f162798a), y.Q(o0VarE, R.string.lbl_edit), 4, (p005kotlin.jvm.internal.j) null)), i53.a.a(new i3("MENU_DATA_PRIVACY", y.Q(o0VarE, R.string.lbl_data_privacy), false, (u4.d) null, y.Q(o0VarE, R.string.lbl_data_privacy), 12, (p005kotlin.jvm.internal.j) null)), lVar, bVar, context), o0VarE), null, null, null, z3.f.c(-2104910025, new xr.n(p1VarC, bVar, fVar3, p1VarC2), o0VarE), o0VarE, 196656, 28);
            fVar2 = fVar3;
        } else {
            o0VarE.e();
            fVar2 = fVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(fVar2, list, lVar, aVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    public static final void c(Map<String, e> map, b bVar, e23.l<? super tq0.l, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-971131067);
        int i15 = i14 | (o0VarE.r(map) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarD = x2.d(r.S, 1.0f);
            boolean zR = o0VarE.r(map) | o0VarE.r(bVar) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new wn2.f(map, 19, bVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wn2.f(map, 19, bVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarD, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 6, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(map, bVar, lVar, i14, 22);
        }
    }
}

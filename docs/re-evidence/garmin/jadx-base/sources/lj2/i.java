package lj2;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import e23.l;
import e23.p;
import lc.y;
import o53.f0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static final void a(y yVar, nj2.a aVar, l lVar, m mVar, int i14) {
        nj2.a aVar2;
        yVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1145512857);
        int i15 = i14 | (o0VarE.r(yVar) ? 4 : 2) | 16 | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(nj2.a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    aVar2 = (nj2.a) u1VarResolveViewModel;
                }
            } else {
                o0VarE.e();
                aVar2 = aVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarF = f0.F(aVar2.f126262n, j0.f134944a, o0VarE, 48);
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
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(aVar2);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new h(aVar2, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, unit, o0VarE);
            lg.d.d(false, null, null, z3.f.c(-889516913, new hl1.j(yVar, aVar2, p1VarF, lVar, p1Var, p1Var2), o0VarE), o0VarE, 3072, 7);
        } else {
            o0VarE.e();
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) yVar, (Object) aVar2, (Object) lVar, i14, 4);
        }
    }
}

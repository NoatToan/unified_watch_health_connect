package ya0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n80.a aVar, g gVar, e23.a aVar2, p3.m mVar, int i14) {
        g gVar2;
        int i15;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-981194846);
        int i16 = i14 | ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | 16 | (o0VarE.r(aVar2) ? 256 : 128);
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
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                gVar2 = (g) u1VarResolveViewModel;
                i15 = i16 & (-113);
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                gVar2 = gVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(gVar2.f195433c, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Boolean bool = (Boolean) p1VarC.getF182175a();
            boolean zB = o0VarE.B(p1VarC) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new e(aVar2, p1VarC, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e(aVar2, p1VarC, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, bool, o0VarE);
            da0.p.d("device_pairing_companion_device_link_screen", false, null, null, null, null, z3.f.c(180388395, new xr.n(p1VarC, aVar, gVar2, context), o0VarE), o0VarE, 12582918, 126);
        } else {
            o0VarE.e();
            gVar2 = gVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.k0(aVar, gVar2, aVar2, i14, 12);
        }
    }
}

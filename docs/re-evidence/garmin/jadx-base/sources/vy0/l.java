package vy0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.n3;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import ty1.g2;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    public static final void a(boolean z14, ty0.b bVar, u uVar, e23.a aVar, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1557452905);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(bVar.ordinal()) ? 32 : 16) | (o0VarE.B(uVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z15) {
                objQ = new vc0.v(bVar, 17);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vc0.v(bVar, 17);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(n.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
            o0VarE.g0(false);
            n nVar = (n) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(nVar.f180752b, o0VarE);
            boolean zR = o0VarE.r(nVar) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new g2(26, uVar, nVar);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g2(26, uVar, nVar);
                    o0VarE.K(objQ2);
                }
            }
            z3.e eVarC = z3.f.c(-704053180, new r11.l(bVar, z14, aVar, 9), o0VarE);
            g6.f.a aVar4 = g6.f.f75994b;
            z02.d.a(false, eVarC, null, null, n3.b(0, 0.0f, 0.0f, 0.0f, 14), z3.f.c(270094272, new vq0.a(13, (e23.l) objQ2, p1VarC), o0VarE), o0VarE, 196662, 12);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(z14, bVar, uVar, aVar, i14, 20);
        }
    }
}

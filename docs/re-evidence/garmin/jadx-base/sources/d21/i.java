package d21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c.w;
import c42.c0;
import cw1.g0;
import cw1.p0;
import e23.p;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e21.a aVar, e23.a aVar2, m mVar, int i14) {
        e21.a aVar3;
        int i15;
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1013150298);
        int i16 = i14 | 2 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(e21.a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                e21.a aVar4 = (e21.a) u1VarResolveViewModel;
                i15 = i16 & (-15);
                aVar3 = aVar4;
            } else {
                o0VarE.e();
                i15 = i16 & (-15);
                aVar3 = aVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(aVar3.f62612e, o0VarE);
            l22.a aVar5 = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            int i17 = i15 & 112;
            boolean zB = o0VarE.B(p1VarC) | (i17 == 32) | o0VarE.r(aVar3);
            Object objQ = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (zB) {
                objQ = new g0(aVar2, 3, aVar3, p1VarC);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g0(aVar2, 3, aVar3, p1VarC);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar7 = (e23.a) objQ;
            boolean zB2 = o0VarE.B(aVar7);
            Object objQ2 = o0VarE.q();
            int i18 = 9;
            if (zB2) {
                objQ2 = new p0(aVar7, 9);
                o0VarE.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new p0(aVar7, 9);
                    o0VarE.K(objQ2);
                }
            }
            w.a(6, 0, (e23.a) objQ2, o0VarE, true);
            e21.d dVar = ((e21.a.d) p1VarC.getF182175a()).f62622b;
            boolean zB3 = (i17 == 32) | o0VarE.B(p1VarC);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                objQ3 = new c(aVar2, p1VarC, null);
                o0VarE.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new c(aVar2, p1VarC, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((p) objQ3, dVar, o0VarE);
            z02.d.a(((e21.a.d) p1VarC.getF182175a()).f62621a.f35300a == fw.p.LOADING || (((e21.a.d) p1VarC.getF182175a()).f62622b instanceof e21.d.c), z3.f.c(-514113109, new cq0.p(aVar7, i18), o0VarE), null, null, null, z3.f.c(1508965295, new c50.f(aVar3, 17, p1VarC, aVar5), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
            aVar3 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(aVar3, aVar2, i14, 26);
        }
    }
}

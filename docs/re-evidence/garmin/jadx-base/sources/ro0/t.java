package ro0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.g3;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import rk0.a1;

/* JADX INFO: loaded from: classes8.dex */
public final class t {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153886a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f153886a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(x xVar, e23.a aVar, p3.m mVar, int i14) {
        x xVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1301922517);
        int i15 = i14 | 2 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(x.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                    o0VarE.g0(false);
                    xVar2 = (x) u1VarResolveViewModel;
                }
            } else {
                o0VarE.e();
                xVar2 = xVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            p1 p1VarC = s9.c.c(xVar2.f153895c, o0VarE);
            z02.d.a(((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING, z3.f.c(-2101228602, new p40.r(aVar, 27), o0VarE), null, null, null, z3.f.c(2098248258, new pp.g(p1VarC, 22, context, b0Var), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
            xVar2 = xVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(xVar2, aVar, i14, 2);
        }
    }
}

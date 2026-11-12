package xy0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.u1;
import androidx.room.a0;
import e23.l;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import ta0.g0;
import vb.h;
import w51.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192657a;

        static {
            int[] iArr = new int[ty0.b.values().length];
            try {
                iArr[ty0.b.f166906p2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.b.f166909q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.b.f166899n2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ty0.b.f166895m2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f192657a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(c cVar, l lVar, e23.a aVar, m mVar, int i14) {
        c cVar2;
        c cVar3;
        o0 o0VarP = a0.p(lVar, aVar, mVar, -1045733926);
        int i15 = i14 | 2 | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarP.G0();
            if ((i14 & 1) == 0 || o0VarP.o0()) {
                o0VarP.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarP);
                if (viewModelStoreOwnerA == null) {
                    h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(c.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), null);
                    o0VarP.g0(false);
                    cVar3 = (c) u1VarResolveViewModel;
                }
            } else {
                o0VarP.e();
                cVar3 = cVar;
            }
            o0VarP.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(cVar3.f192667j, o0VarP);
            p1 p1VarC2 = s9.c.c(cVar3.f192669l, o0VarP);
            p1 p1VarC3 = s9.c.c(cVar3.f192671n, o0VarP);
            b0.a aVar2 = b0.a.ON_RESUME;
            boolean zR = o0VarP.r(cVar3);
            Object objQ = o0VarP.q();
            if (zR) {
                objQ = new xy0.a(cVar3, 0);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new xy0.a(cVar3, 0);
                    o0VarP.K(objQ);
                }
            }
            s9.e.a(aVar2, null, (e23.a) objQ, o0VarP, 6);
            c cVar4 = cVar3;
            z02.d.a(((c.C3603c) p1VarC.getF182175a()).f192678a, z3.f.c(-126428171, new n0(aVar, 18), o0VarP), null, null, null, z3.f.c(1162342513, new g0(context, cVar4, lVar, p1VarC, p1VarC3, p1VarC2), o0VarP), o0VarP, 196656, 28);
            cVar2 = cVar4;
        } else {
            o0VarP.e();
            cVar2 = cVar;
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(cVar2, lVar, aVar, i14, 3);
        }
    }
}

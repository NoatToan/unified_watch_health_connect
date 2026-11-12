package b21;

import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class d1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14602a;

        static {
            int[] iArr = new int[q11.a.values().length];
            try {
                iArr[q11.a.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q11.a.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q11.a.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14602a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(lc.v vVar, lc.m0 m0Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        String str;
        i21.b bVar;
        p3.o0 o0VarQ = androidx.room.a0.q(vVar, m0Var, mVar, -539233980);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(eVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarQ.B(vVar);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(fb.c.class));
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(fb.c.class));
                    o0VarQ.K(objQ);
                }
            }
            lc.v vVar2 = (lc.v) objQ;
            o0VarQ.L(-1614864554);
            CreationExtras creationExtrasDefaultExtras = CreationExtrasExtKt.defaultExtras(vVar2);
            Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarQ, 0);
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(i21.d.class), vVar2.getF189591b(), null, creationExtrasDefaultExtras, null, scopeCurrentKoinScope, null);
            o0VarQ.g0(false);
            i21.d dVar = (i21.d) u1VarResolveViewModel;
            Object objQ2 = o0VarQ.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarQ);
            }
            fe feVar = (fe) objQ2;
            p3.p1 p1VarC = s9.c.c(dVar.f87286r, o0VarQ);
            boolean zB2 = o0VarQ.B(((i21.c) p1VarC.getF182175a()).f87246a);
            Object objQ3 = o0VarQ.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = p3.p0.f(new ak0.z(p1VarC, 15));
                o0VarQ.K(objQ3);
            }
            p3.x3 x3Var = (p3.x3) objQ3;
            i21.a aVar2 = (i21.a) x3Var.getF182175a();
            b11.u uVar = (aVar2 == null || (bVar = aVar2.f87237a) == null) ? null : bVar.f87239a;
            if (uVar == null) {
                o0VarQ.C(-1140951788);
                o0VarQ.g0(false);
                str = null;
            } else {
                o0VarQ.C(1487215757);
                String strA = uVar.a(o0VarQ);
                o0VarQ.g0(false);
                str = strA;
            }
            String strQ = gl1.y.Q(o0VarQ, R.string.common_undo);
            i21.a aVar3 = (i21.a) x3Var.getF182175a();
            boolean zB3 = o0VarQ.B(x3Var) | o0VarQ.B(str) | o0VarQ.B(strQ) | o0VarQ.r(dVar);
            Object objQ4 = o0VarQ.q();
            if (zB3 || objQ4 == c2565a) {
                b1 b1Var = new b1(str, x3Var, feVar, strQ, dVar, null);
                o0VarQ.K(b1Var);
                objQ4 = b1Var;
            }
            p3.l0.e((e23.p) objQ4, aVar3, o0VarQ);
            eVar.invoke(dVar, feVar, o0VarQ, Integer.valueOf((i15 & 896) | 48));
            k23.d dVarB = t0Var.b(l4.y0.class);
            lc.h0.a aVar4 = lc.h0.f111771f;
            lc.h0 h0Var = vVar.f111882b;
            k23.d dVarB2 = t0Var.b(l4.y0.class);
            aVar4.getClass();
            boolean zC = lc.h0.a.c(h0Var, dVarB2);
            if (!zC) {
                dVarB = null;
            }
            boolean zH = o0VarQ.h(zC) | o0VarQ.r(dVar);
            Object objQ5 = o0VarQ.q();
            if (zH || objQ5 == c2565a) {
                objQ5 = new ad0.f(zC, feVar, dVar, 2);
                o0VarQ.K(objQ5);
            }
            p3.l0.a(dVarB, (e23.l) objQ5, o0VarQ);
        } else {
            o0VarQ.e();
        }
        p3.p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x0(vVar, m0Var, eVar, i14, 0);
        }
    }

    public static final <T> void b(lc.m0 m0Var, boolean z14, boolean z15, String str, T t7, e23.a<Unit> aVar) {
        Object bVar;
        androidx.lifecycle.j1 j1VarA;
        androidx.lifecycle.j1 j1VarA2;
        try {
            int i14 = o13.q.f128596b;
            m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.o.class));
            bVar = Boolean.TRUE;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof o13.q.b) {
            bVar = obj;
        }
        boolean zBooleanValue = ((Boolean) bVar).booleanValue();
        if (z15 && z14 && zBooleanValue) {
            k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(l4.o.class);
            boolean z16 = lc.y.f111902i;
            m0Var.o(dVarB, true);
            lc.v vVarI = m0Var.f111904b.i();
            if (vVarI == null || (j1VarA2 = vVarI.a()) == null) {
                return;
            }
            j1VarA2.f(t7, str);
            return;
        }
        if (!z15) {
            aVar.invoke();
            return;
        }
        lc.v vVarF = m0Var.f();
        if (vVarF != null && (j1VarA = vVarF.a()) != null) {
            j1VarA.f(t7, str);
        }
        aVar.invoke();
    }
}

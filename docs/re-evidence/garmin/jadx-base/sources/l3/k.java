package l3;

import android.content.Context;
import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.mh;
import i3.s2;
import p005kotlin.Unit;
import p006l2.w2;
import p3.p2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f109295a = new StackTraceElement[0];

    public static final void a(boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1339183247);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c.w.a(i15 & 126, 0, aVar, o0VarE, z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 3, (byte) 0);
        }
    }

    public static final void b(long j8, s5.x0 x0Var, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-684938728);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(x0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.j0 j0Var = mh.f89022a;
            p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(j8)), j0Var.c(((s5.x0) o0VarE.A(j0Var)).e(x0Var))}, pVar, o0VarE, ((i15 >> 3) & 112) | 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m1(j8, x0Var, pVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(e23.a aVar, e23.p pVar, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f109269b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f109269b = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar);
            }
        } else {
            iVar = new i(cVar);
        }
        Object obj = iVar.f109268a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f109269b;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                j jVar = new j(aVar, pVar, null);
                iVar.f109269b = 1;
                if (o53.c0.e(jVar, iVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return Unit.INSTANCE;
    }

    public static h4.r d(h4.r rVar) {
        return rVar.then(new j0(new w2(12)));
    }

    public static final h4.r e(h4.r rVar, m mVar, p008y1.b2 b2Var, e23.p pVar) {
        return rVar.then(new q0(mVar, pVar, b2Var));
    }

    public static final h4.r f(h4.r rVar, p008y1.r rVar2, p008y1.b2 b2Var, e23.p pVar) {
        return rVar.then(new r0(rVar2, pVar, b2Var));
    }

    public static final Object g(f5.w wVar) {
        Object objE = wVar.getF81969t();
        f5.i0 i0Var = objE instanceof f5.i0 ? (f5.i0) objE : null;
        if (i0Var != null) {
            return i0Var.getF110482c();
        }
        return null;
    }

    public static final String h(p3.m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        mVar.A(AndroidCompositionLocals_androidKt.f6041a);
        return ((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b)).getResources().getString(i14);
    }

    public static final int i(int i14, int i15) {
        if (i14 == Integer.MAX_VALUE) {
            return i14;
        }
        int i16 = i14 - i15;
        if (i16 < 0) {
            return 0;
        }
        return i16;
    }
}

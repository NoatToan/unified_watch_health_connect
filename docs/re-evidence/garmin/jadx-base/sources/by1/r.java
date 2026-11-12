package by1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import i3.fe;
import kotlin.t1;
import kotlin.t3;
import lc.m0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lby1/r;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "Ldy1/c;", "benchmarkScreenState", "", "isDataLoading", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f22207a = new r();

    private r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        Context context;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -792919368);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarQ.n(i16 & 1, (i16 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to SetBenchmarksRoute");
                return;
            }
            Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.f67290x, o0VarQ);
            p1 p1VarC3 = s9.c.c(aVarN.f67286r, o0VarQ);
            t3 t3Var = (t3) o0VarQ.A(t1.f91501s);
            boolean zY4 = aVarN.y4();
            p1 p1VarC4 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = mx1.g.f121403a;
                }
                objQ = Integer.valueOf(new mx1.h.g(fVar, zY4).f121427c);
                o0VarQ.K(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            int iIntValue2 = ((Number) p1VarC4.getF182175a()).intValue();
            dy1.c cVar = (dy1.c) p1VarC2.getF182175a();
            boolean zBooleanValue = ((Boolean) p1VarC3.getF182175a()).booleanValue();
            boolean zR = o0VarQ.r(context2) | o0VarQ.B(p1VarC2);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new p(context2, p1VarC2, 0);
                o0VarQ.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.B(p1VarC) | o0VarQ.r(m0Var) | o0VarQ.r(context2);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new f(aVarN, m0Var, context2, p1VarC);
                o0VarQ.K(objQ3);
            }
            e23.a aVar2 = (e23.a) objQ3;
            boolean zR3 = o0VarQ.r(aVarN) | o0VarQ.r(m0Var);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new k(aVarN, m0Var, 1);
                o0VarQ.K(objQ4);
            }
            e23.a aVar3 = (e23.a) objQ4;
            boolean zR4 = o0VarQ.r(t3Var);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new q(t3Var, 0);
                o0VarQ.K(objQ5);
            }
            e23.a aVar4 = (e23.a) objQ5;
            boolean zR5 = o0VarQ.r(aVarN);
            Object objQ6 = o0VarQ.q();
            if (zR5 || objQ6 == c2565a) {
                objQ6 = new a(aVarN, 4);
                o0VarQ.K(objQ6);
            }
            e23.l lVar = (e23.l) objQ6;
            boolean zR6 = o0VarQ.r(aVarN) | o0VarQ.r(context2) | o0VarQ.B(p1VarC) | o0VarQ.r(m0Var);
            Object objQ7 = o0VarQ.q();
            if (zR6 || objQ7 == c2565a) {
                context = context2;
                f fVar2 = new f(aVarN, context, m0Var, p1VarC, 2);
                o0VarQ.K(fVar2);
                objQ7 = fVar2;
            } else {
                context = context2;
            }
            e23.a aVar5 = (e23.a) objQ7;
            boolean zR7 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ8 = o0VarQ.q();
            if (zR7 || objQ8 == c2565a) {
                objQ8 = new a42.d(aVarN, context, 13);
                o0VarQ.K(objQ8);
            }
            e23.a aVar6 = (e23.a) objQ8;
            boolean zR8 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ9 = o0VarQ.q();
            if (zR8 || objQ9 == c2565a) {
                objQ9 = new ak0.i(onBackPressedDispatcher, 13);
                o0VarQ.K(objQ9);
            }
            wx1.r.a(iIntValue, iIntValue2, feVar, cVar, zBooleanValue, aVar, aVar2, aVar3, aVar4, lVar, aVar5, aVar6, (e23.a) objQ9, o0VarQ, (i16 & 896) | 6);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 20);
        }
    }
}

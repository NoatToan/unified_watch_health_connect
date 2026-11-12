package by1;

import a03.t0;
import android.app.Activity;
import androidx.room.a0;
import i3.fe;
import lc.m0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lby1/m;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "Li53/c;", "", "selectableStartDatesUtcMillisState", "", "isDataLoading", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f22196a = new m();

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -441047620);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to ReviewTrainingPlanRoute");
                return;
            }
            Activity activity = (Activity) o0VarQ.A(c.n.f22332a);
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.E, o0VarQ);
            p1 p1VarC3 = s9.c.c(aVarN.f67286r, o0VarQ);
            p1 p1VarC4 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = mx1.g.f121403a;
                }
                objQ = Integer.valueOf(new mx1.h.f(fVar, aVarN.f67285q != null, aVarN.y4()).f121424d);
                o0VarQ.K(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            int iIntValue2 = ((Number) p1VarC4.getF182175a()).intValue();
            dy1.p pVar = (dy1.p) p1VarC.getF182175a();
            i53.c cVar = (i53.c) p1VarC2.getF182175a();
            boolean zBooleanValue = ((Boolean) p1VarC3.getF182175a()).booleanValue();
            boolean zR = o0VarQ.r(activity) | o0VarQ.r(aVarN);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new bp.h(2, activity, aVarN);
                o0VarQ.K(objQ2);
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR2 = o0VarQ.r(activity) | o0VarQ.r(aVarN);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new t0(24, activity, aVarN);
                o0VarQ.K(objQ3);
            }
            e23.p pVar2 = (e23.p) objQ3;
            boolean zR3 = o0VarQ.r(aVarN);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new a(aVarN, 2);
                o0VarQ.K(objQ4);
            }
            e23.l lVar2 = (e23.l) objQ4;
            boolean zR4 = o0VarQ.r(aVarN);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new a(aVarN, 3);
                o0VarQ.K(objQ5);
            }
            e23.l lVar3 = (e23.l) objQ5;
            boolean zR5 = o0VarQ.r(aVarN) | o0VarQ.r(m0Var);
            Object objQ6 = o0VarQ.q();
            if (zR5 || objQ6 == c2565a) {
                objQ6 = new k(aVarN, m0Var, 0);
                o0VarQ.K(objQ6);
            }
            e23.a aVar = (e23.a) objQ6;
            boolean zR6 = o0VarQ.r(activity) | o0VarQ.r(aVarN);
            Object objQ7 = o0VarQ.q();
            if (zR6 || objQ7 == c2565a) {
                objQ7 = new bb0.d(12, activity, aVarN);
                o0VarQ.K(objQ7);
            }
            e23.a aVar2 = (e23.a) objQ7;
            boolean zR7 = o0VarQ.r(aVarN) | o0VarQ.r(activity);
            Object objQ8 = o0VarQ.q();
            if (zR7 || objQ8 == c2565a) {
                objQ8 = new l(aVarN, activity);
                o0VarQ.K(objQ8);
            }
            e23.a aVar3 = (e23.a) objQ8;
            boolean zR8 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ9 = o0VarQ.q();
            if (zR8 || objQ9 == c2565a) {
                objQ9 = new ak0.i(onBackPressedDispatcher, 11);
                o0VarQ.K(objQ9);
            }
            o0Var = o0VarQ;
            wx1.p.a(iIntValue, iIntValue2, feVar, pVar, cVar, zBooleanValue, lVar, pVar2, lVar2, lVar3, aVar, aVar2, aVar3, (e23.a) objQ9, o0Var, (i15 & 896) | 6);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 18);
        }
    }
}

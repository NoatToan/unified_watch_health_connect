package by1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b21.v4;
import i3.fe;
import lc.m0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lby1/j;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "Ldy1/c;", "benchmarkScreenState", "", "canEstimateCurrentBenchmarks", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f22190a = new j();

    private j() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        Context context;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1995267000);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarQ.r(m0Var) ? 32 : 16);
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.f67290x, o0VarQ);
            Object[] objArr = new Object[0];
            boolean zB = o0VarQ.B(p1VarC);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new h(p1VarC, 0);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(p1VarC, 0);
                    o0VarQ.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarQ, 0);
            Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC3 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ2 = o0VarQ.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = mx1.g.f121403a;
                }
                objQ2 = Integer.valueOf(new mx1.h.d(fVar).f121418b);
                o0VarQ.K(objQ2);
            }
            int iIntValue = ((Number) objQ2).intValue();
            int iIntValue2 = ((Number) p1VarC3.getF182175a()).intValue();
            Boolean bool = (Boolean) p1Var.getF182175a();
            boolean zB2 = o0VarQ.B(p1Var) | o0VarQ.r(aVarN);
            Object objQ3 = o0VarQ.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new i(aVarN, p1Var, 0);
                o0VarQ.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR = o0VarQ.r(context2) | o0VarQ.B(p1VarC2);
            Object objQ4 = o0VarQ.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new bb0.d(11, context2, p1VarC2);
                o0VarQ.K(objQ4);
            }
            e23.a aVar2 = (e23.a) objQ4;
            boolean zB3 = o0VarQ.B(p1Var) | o0VarQ.r(aVarN) | o0VarQ.B(p1VarC) | o0VarQ.r(m0Var) | o0VarQ.r(context2);
            Object objQ5 = o0VarQ.q();
            if (zB3 || objQ5 == c2565a) {
                context = context2;
                v4 v4Var = new v4((Object) aVarN, m0Var, (Object) context, (Object) p1Var, (Object) p1VarC, 1);
                o0VarQ.K(v4Var);
                objQ5 = v4Var;
            } else {
                context = context2;
            }
            e23.a aVar3 = (e23.a) objQ5;
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ6 = o0VarQ.q();
            if (zR2 || objQ6 == c2565a) {
                objQ6 = new a42.d(aVarN, context, 11);
                o0VarQ.K(objQ6);
            }
            e23.a aVar4 = (e23.a) objQ6;
            boolean zR3 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ7 = o0VarQ.q();
            if (zR3 || objQ7 == c2565a) {
                objQ7 = new ak0.i(onBackPressedDispatcher, 10);
                o0VarQ.K(objQ7);
            }
            o0Var = o0VarQ;
            wx1.l.a(iIntValue, iIntValue2, bool, lVar, aVar2, aVar3, aVar4, (e23.a) objQ7, o0Var, 6);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 17);
        }
    }
}

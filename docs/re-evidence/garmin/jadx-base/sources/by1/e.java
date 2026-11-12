package by1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import i3.fe;
import lc.m0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lby1/e;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "Li53/c;", "Ldy1/v;", "workoutStepsState", "Ldy1/q;", "trainingDaysState", "", "selectableStartDatesUtcMillisState", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f22178a = new e();

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -988085480);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarQ.r(m0Var) ? 32 : 16);
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.A, o0VarQ);
            p1 p1VarC3 = s9.c.c(aVarN.C, o0VarQ);
            p1 p1VarC4 = s9.c.c(aVarN.E, o0VarQ);
            p1 p1VarC5 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = mx1.g.f121403a;
                }
                mx1.h.b bVar = new mx1.h.b(fVar, aVarN.y4(), aVarN.f67285q != null);
                o0VarQ.K(bVar);
                objQ = bVar;
            }
            mx1.h.b bVar2 = (mx1.h.b) objQ;
            boolean zR = o0VarQ.r(aVarN) | o0VarQ.r(bVar2) | o0VarQ.r(m0Var);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ak0.m(aVarN, 16, bVar2, m0Var);
                o0VarQ.K(objQ2);
            }
            c.w.a(0, 1, (e23.a) objQ2, o0VarQ, false);
            mx1.f fVar2 = bVar2.f121411a;
            int i16 = fVar2.f121398d;
            if (i16 == 0) {
                i16 = 3;
            }
            int i17 = new mx1.h.i(fVar2, bVar2.f121413c, bVar2.f121412b, i16).f121435e + 1;
            int iIntValue = ((Number) p1VarC5.getF182175a()).intValue();
            i53.c cVar = (i53.c) p1VarC2.getF182175a();
            i53.c cVar2 = (i53.c) p1VarC3.getF182175a();
            dy1.p pVar = (dy1.p) p1VarC.getF182175a();
            i53.c cVar3 = (i53.c) p1VarC4.getF182175a();
            mx1.f fVar3 = ((dy1.p) p1VarC.getF182175a()).f61598d;
            boolean z14 = fVar3 != null && fVar3.c();
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.B(p1VarC) | o0VarQ.r(m0Var);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new b(aVarN, m0Var, p1VarC, 1);
                o0VarQ.K(objQ3);
            }
            e23.a aVar = (e23.a) objQ3;
            boolean zR3 = o0VarQ.r(aVarN);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new d(aVarN, 0);
                o0VarQ.K(objQ4);
            }
            e23.p pVar2 = (e23.p) objQ4;
            boolean zR4 = o0VarQ.r(aVarN);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new a(aVarN, 1);
                o0VarQ.K(objQ5);
            }
            e23.l lVar = (e23.l) objQ5;
            boolean zR5 = o0VarQ.r(aVarN) | o0VarQ.r(context) | o0VarQ.r(m0Var);
            Object objQ6 = o0VarQ.q();
            if (zR5 || objQ6 == c2565a) {
                objQ6 = new ak0.m(aVarN, 17, context, m0Var);
                o0VarQ.K(objQ6);
            }
            e23.a aVar2 = (e23.a) objQ6;
            boolean zR6 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ7 = o0VarQ.q();
            if (zR6 || objQ7 == c2565a) {
                objQ7 = new a42.d(aVarN, context, 9);
                o0VarQ.K(objQ7);
            }
            e23.a aVar3 = (e23.a) objQ7;
            boolean zR7 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ8 = o0VarQ.q();
            if (zR7 || objQ8 == c2565a) {
                objQ8 = new ak0.i(onBackPressedDispatcher, 8);
                o0VarQ.K(objQ8);
            }
            o0Var = o0VarQ;
            wx1.h.a(i17, iIntValue, cVar, cVar2, cVar3, pVar, z14, aVar, pVar2, lVar, aVar2, aVar3, (e23.a) objQ8, o0Var, 0);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 15);
        }
    }
}

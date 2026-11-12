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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lby1/c;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22175a = new c();

    private c() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1193593624);
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
            i53.c cVarE = i53.a.e(mx1.c.f121372g);
            mx1.c cVar = ((dy1.p) p1VarC.getF182175a()).f61596b;
            boolean zR = o0VarQ.r(aVarN);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new a(aVarN, 0);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(aVarN, 0);
                    o0VarQ.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zB = o0VarQ.B(p1VarC) | o0VarQ.r(aVarN) | o0VarQ.r(m0Var);
            Object objQ2 = o0VarQ.q();
            if (zB) {
                objQ2 = new b(aVarN, m0Var, p1VarC, 0);
                o0VarQ.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(aVarN, m0Var, p1VarC, 0);
                    o0VarQ.K(objQ2);
                }
            }
            e23.a aVar2 = (e23.a) objQ2;
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ3 = o0VarQ.q();
            if (zR2) {
                objQ3 = new a42.d(aVarN, context, 8);
                o0VarQ.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new a42.d(aVarN, context, 8);
                    o0VarQ.K(objQ3);
                }
            }
            e23.a aVar3 = (e23.a) objQ3;
            boolean zR3 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ4 = o0VarQ.q();
            if (zR3) {
                objQ4 = new ak0.i(onBackPressedDispatcher, 7);
                o0VarQ.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ak0.i(onBackPressedDispatcher, 7);
                    o0VarQ.K(objQ4);
                }
            }
            wx1.a.a(cVarE, cVar, lVar, aVar2, aVar3, (e23.a) objQ4, o0VarQ, 0);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 14);
        }
    }
}

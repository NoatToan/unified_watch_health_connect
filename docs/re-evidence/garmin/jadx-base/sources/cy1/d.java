package cy1;

import ak0.i;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b.u;
import b.w;
import by1.k;
import c.p;
import e23.l;
import i3.fe;
import lc.m0;
import lc.v;
import mx1.g;
import mx1.h;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcy1/d;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f56799a = new d();

    private d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 261196653);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarQ.r(m0Var) ? 32 : 16);
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            p.f22335a.getClass();
            w wVarA = p.a(o0VarQ);
            u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = g.f121403a;
                }
                objQ = Integer.valueOf(new h.e(fVar).f121420b);
                o0VarQ.K(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            int iIntValue2 = ((Number) p1VarC2.getF182175a()).intValue();
            mx1.f fVar2 = ((dy1.p) p1VarC.getF182175a()).f61598d;
            mx1.e eVar = fVar2 != null ? fVar2.f121399e : null;
            boolean zR = o0VarQ.r(aVarN);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new by1.a(aVarN, 7);
                o0VarQ.K(objQ2);
            }
            l lVar = (l) objQ2;
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(m0Var);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new k(aVarN, m0Var, 2);
                o0VarQ.K(objQ3);
            }
            e23.a aVar = (e23.a) objQ3;
            boolean zR3 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new a(aVarN, context, 1);
                o0VarQ.K(objQ4);
            }
            e23.a aVar2 = (e23.a) objQ4;
            boolean zR4 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new i(onBackPressedDispatcher, 22);
                o0VarQ.K(objQ5);
            }
            xx1.g.a(iIntValue, iIntValue2, eVar, lVar, aVar, aVar2, (e23.a) objQ5, o0VarQ, 6);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(this, vVar, m0Var, feVar, i14, 3);
        }
    }
}

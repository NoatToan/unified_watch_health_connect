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
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import xx1.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcy1/e;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f56800a = new e();

    private e() {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1743750957);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
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
            mx1.f fVar = ((dy1.p) s9.c.c(aVarN.f67289w, o0VarQ).getF182175a()).f61598d;
            Integer numValueOf = fVar != null ? Integer.valueOf(fVar.f121398d) : null;
            boolean zR = o0VarQ.r(aVarN);
            Object objQ = o0VarQ.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new by1.a(aVarN, 8);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new by1.a(aVarN, 8);
                    o0VarQ.K(objQ);
                }
            }
            l lVar = (l) objQ;
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(m0Var);
            Object objQ2 = o0VarQ.q();
            if (zR2) {
                objQ2 = new k(aVarN, m0Var, 3);
                o0VarQ.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new k(aVarN, m0Var, 3);
                    o0VarQ.K(objQ2);
                }
            }
            e23.a aVar2 = (e23.a) objQ2;
            boolean zR3 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ3 = o0VarQ.q();
            if (zR3) {
                objQ3 = new a(aVarN, context, 2);
                o0VarQ.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a(aVarN, context, 2);
                    o0VarQ.K(objQ3);
                }
            }
            e23.a aVar3 = (e23.a) objQ3;
            boolean zR4 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ4 = o0VarQ.q();
            if (zR4) {
                objQ4 = new i(onBackPressedDispatcher, 23);
                o0VarQ.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new i(onBackPressedDispatcher, 23);
                    o0VarQ.K(objQ4);
                }
            }
            h.a(numValueOf, lVar, aVar2, aVar3, (e23.a) objQ4, o0VarQ, 0);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(this, vVar, m0Var, feVar, i14, 4);
        }
    }
}

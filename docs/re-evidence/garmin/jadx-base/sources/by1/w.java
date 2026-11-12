package by1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import i3.fe;
import lc.m0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lby1/w;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "selectedStrengthTrainingPlanState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f22220a = new w();

    private w() {
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        Context context;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -1388793352);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarQ.r(m0Var) ? 32 : 16);
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            mx1.f fVar = ((dy1.p) s9.c.c(aVarN.f67289w, o0VarQ).getF182175a()).f61598d;
            if (fVar == null) {
                o0VarQ.C(-122169698);
                o0VarQ.g0(false);
                o0Var = o0VarQ;
            } else {
                o0VarQ.C(-122169697);
                boolean zR = o0VarQ.r(aVarN) | o0VarQ.r(fVar) | o0VarQ.r(context2) | o0VarQ.r(m0Var);
                Object objQ = o0VarQ.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zR) {
                    context = context2;
                    af0.e eVar = new af0.e(aVarN, fVar, context, m0Var, 9);
                    o0VarQ.K(eVar);
                    objQ = eVar;
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        context = context2;
                        af0.e eVar2 = new af0.e(aVarN, fVar, context, m0Var, 9);
                        o0VarQ.K(eVar2);
                        objQ = eVar2;
                    } else {
                        context = context2;
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ2 = o0VarQ.q();
                if (zR2) {
                    objQ2 = new a42.d(aVarN, context, 16);
                    o0VarQ.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a42.d(aVarN, context, 16);
                        o0VarQ.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                boolean zR3 = o0VarQ.r(onBackPressedDispatcher);
                Object objQ3 = o0VarQ.q();
                if (zR3) {
                    objQ3 = new ak0.i(onBackPressedDispatcher, 16);
                    o0VarQ.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ak0.i(onBackPressedDispatcher, 16);
                        o0VarQ.K(objQ3);
                    }
                }
                o0Var = o0VarQ;
                wx1.t.a(fVar, aVar2, aVar3, (e23.a) objQ3, o0Var, 0);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 22);
        }
    }
}

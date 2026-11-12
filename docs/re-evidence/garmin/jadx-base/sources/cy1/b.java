package cy1;

import ak0.i;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b.u;
import by1.t;
import by1.y;
import c.p;
import e23.l;
import i3.fe;
import java.util.List;
import lc.m0;
import lc.r;
import lc.v;
import mx1.g;
import mx1.h;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcy1/b;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "Li53/c;", "Ldy1/v;", "workoutStepsState", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f56796a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<r> f56797b = w.c(gl1.d.M(new com.google.maps.android.compose.clustering.d(18), "dayIndexKey"));

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -1758257587);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarQ.r(vVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(m0Var) ? 32 : 16;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            p.f22335a.getClass();
            b.w wVarA = p.a(o0VarQ);
            u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.A, o0VarQ);
            Bundle bundleA = vVar.f111888h.a();
            int i16 = bundleA != null ? bundleA.getInt("dayIndexKey") : 0;
            p1 p1VarC3 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = g.f121403a;
                }
                objQ = Integer.valueOf(new h.j(fVar, i16 + 1, aVarN.y4()).f121439d);
                o0VarQ.K(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            dy1.v vVar2 = (dy1.v) h0.e0(i16, (i53.c) p1VarC2.getF182175a());
            if (vVar2 == null) {
                o0VarQ.C(1170660338);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1170660339);
                int iIntValue2 = ((Number) p1VarC3.getF182175a()).intValue();
                boolean zR = o0VarQ.r(aVarN) | o0VarQ.r(vVar2);
                Object objQ2 = o0VarQ.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new t(aVarN, vVar2, 5);
                    o0VarQ.K(objQ2);
                }
                e23.p pVar = (e23.p) objQ2;
                boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(vVar2);
                Object objQ3 = o0VarQ.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new t(aVarN, vVar2, 6);
                    o0VarQ.K(objQ3);
                }
                e23.p pVar2 = (e23.p) objQ3;
                boolean zR3 = o0VarQ.r(aVarN) | o0VarQ.r(context) | o0VarQ.r(m0Var);
                Object objQ4 = o0VarQ.q();
                if (zR3 || objQ4 == c2565a) {
                    objQ4 = new by1.n(aVarN, context, m0Var, 2);
                    o0VarQ.K(objQ4);
                }
                l lVar = (l) objQ4;
                boolean zK = o0VarQ.k(i16) | o0VarQ.B(p1VarC2) | o0VarQ.r(aVarN) | o0VarQ.r(m0Var);
                Object objQ5 = o0VarQ.q();
                if (zK || objQ5 == c2565a) {
                    y yVar = new y(i16, aVarN, m0Var, p1VarC2, 1);
                    o0VarQ.K(yVar);
                    objQ5 = yVar;
                }
                e23.a aVar = (e23.a) objQ5;
                boolean zR4 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ6 = o0VarQ.q();
                if (zR4 || objQ6 == c2565a) {
                    objQ6 = new a(aVarN, context, 0);
                    o0VarQ.K(objQ6);
                }
                e23.a aVar2 = (e23.a) objQ6;
                boolean zR5 = o0VarQ.r(onBackPressedDispatcher);
                Object objQ7 = o0VarQ.q();
                if (zR5 || objQ7 == c2565a) {
                    objQ7 = new i(onBackPressedDispatcher, 20);
                    o0VarQ.K(objQ7);
                }
                xx1.b.a(iIntValue, iIntValue2, 6, vVar2, aVar, aVar2, (e23.a) objQ7, lVar, pVar, pVar2, o0VarQ);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(this, vVar, m0Var, feVar, i14, 1);
        }
    }

    @Override // zx1.a
    public final List<r> b() {
        return f56797b;
    }
}

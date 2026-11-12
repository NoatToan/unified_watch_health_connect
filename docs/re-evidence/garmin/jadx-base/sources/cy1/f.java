package cy1;

import a42.q;
import ak0.i;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b.u;
import c.p;
import dy1.k;
import dy1.l;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcy1/f;", "Lzx1/a;", "<init>", "()V", "Ldy1/p;", "strengthTrainingPlanState", "Ldy1/l;", "primaryLiftsScreenState", "Li53/c;", "Ldy1/k;", "primaryLiftsStates", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f56801a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<r> f56802b = w.c(gl1.d.M(new com.google.maps.android.compose.clustering.d(19), "dayIndexKey"));

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -1549285075);
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
            p1 p1VarC2 = s9.c.c(aVarN.f67291y, o0VarQ);
            p1 p1VarC3 = s9.c.c(aVarN.f67292z, o0VarQ);
            Bundle bundleA = vVar.f111888h.a();
            int i16 = bundleA != null ? bundleA.getInt("dayIndexKey") : 0;
            p1 p1VarC4 = s9.c.c(aVarN.f67288v, o0VarQ);
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                int i17 = i16 + 1;
                mx1.f fVar = ((dy1.p) p1VarC.getF182175a()).f61598d;
                if (fVar == null) {
                    fVar = g.f121403a;
                }
                objQ = Integer.valueOf(new h.C2300h(fVar, i17).f121430c);
                o0VarQ.K(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            boolean zR = o0VarQ.r(aVarN) | o0VarQ.k(i16) | o0VarQ.r(m0Var);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a83.a(aVarN, i16, m0Var, 5);
                o0VarQ.K(objQ2);
            }
            c.w.a(0, 1, (e23.a) objQ2, o0VarQ, false);
            k kVar = (k) h0.e0(i16, (i53.c) p1VarC3.getF182175a());
            if (kVar == null) {
                o0VarQ.C(-1031489300);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-1031489299);
                int iIntValue2 = ((Number) p1VarC4.getF182175a()).intValue();
                int i18 = i16 + 1;
                int size = ((i53.c) p1VarC3.getF182175a()).size();
                mx1.b bVar = kVar.f61572a;
                l lVar = (l) p1VarC2.getF182175a();
                boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.B(kVar);
                Object objQ3 = o0VarQ.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new cn1.d(16, aVarN, kVar);
                    o0VarQ.K(objQ3);
                }
                e23.l lVar2 = (e23.l) objQ3;
                boolean zK = o0VarQ.k(i16) | o0VarQ.B(p1VarC3) | o0VarQ.r(aVarN) | o0VarQ.r(m0Var) | o0VarQ.r(context);
                Object objQ4 = o0VarQ.q();
                if (zK || objQ4 == c2565a) {
                    q qVar = new q(i16, aVarN, m0Var, context, p1VarC3);
                    o0VarQ.K(qVar);
                    objQ4 = qVar;
                }
                e23.a aVar = (e23.a) objQ4;
                boolean zR3 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ5 = o0VarQ.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new a(aVarN, context, 3);
                    o0VarQ.K(objQ5);
                }
                e23.a aVar2 = (e23.a) objQ5;
                boolean zR4 = o0VarQ.r(onBackPressedDispatcher);
                Object objQ6 = o0VarQ.q();
                if (zR4 || objQ6 == c2565a) {
                    objQ6 = new i(onBackPressedDispatcher, 24);
                    o0VarQ.K(objQ6);
                }
                xx1.i.a(iIntValue, iIntValue2, i18, size, bVar, lVar, lVar2, aVar, aVar2, (e23.a) objQ6, o0VarQ, 6);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(this, vVar, m0Var, feVar, i14, 5);
        }
    }

    @Override // zx1.a
    public final List<r> b() {
        return f56802b;
    }
}

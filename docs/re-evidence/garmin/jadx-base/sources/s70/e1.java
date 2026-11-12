package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls70/e1;", "Lr70/r;", "Ly70/q;", "stateHolder", "Ln70/g;", "dashboardDelegate", "<init>", "(Ly70/q;Ln70/g;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.q f157688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n70.g f157689b;

    public e1(y70.q qVar, n70.g gVar) {
        qVar.getClass();
        gVar.getClass();
        this.f157688a = qVar;
        this.f157689b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 1127270838);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarQ.B(this) : o0VarQ.r(this) ? 256 : 128;
        }
        int i16 = i15;
        boolean z14 = true;
        if (o0VarQ.n(i16 & 1, (i16 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = this.f157688a.f194678a.f124736a.z();
                o0VarQ.K(objQ);
            }
            if (((Boolean) s9.c.b((r53.i) objQ, Boolean.FALSE, o0VarQ, 48).getF182175a()).booleanValue()) {
                o0VarQ.C(176560908);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
                if ((i16 & 896) != 256 && ((i16 & 512) == 0 || !o0VarQ.r(this))) {
                    z14 = false;
                }
                boolean zR = o0VarQ.r(context) | z14;
                Object objQ2 = o0VarQ.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new rk0.f(28, this, context);
                    o0VarQ.K(objQ2);
                }
                f1.a(u1.w.d(rVarC, false, null, null, (e23.a) objQ2, 15), o0VarQ, 0);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(177022188);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 11);
        }
    }
}

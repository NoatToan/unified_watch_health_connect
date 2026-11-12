package ay1;

import a03.g;
import ak0.i;
import android.app.Activity;
import androidx.room.a0;
import b.u;
import b.w;
import c.p;
import ey1.j;
import i3.fe;
import lc.m0;
import lc.v;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lay1/c;", "Lzx1/a;", "", "planId", "", "showUpNavigation", "<init>", "(JZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13659b;

    public c(long j8, boolean z14) {
        this.f13658a = j8;
        this.f13659b = z14;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 481808643);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarQ.B(this) ? 2048 : 1024;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 1169) != 1168)) {
            x1 x1Var = n.f135158a;
            if (feVar == null) {
                h.s("Snackbar host state must be passed to TrainingPlanDashboardRoute");
                return;
            }
            Activity activity = (Activity) o0VarQ.A(c.n.f22332a);
            p.f22335a.getClass();
            w wVarA = p.a(o0VarQ);
            u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            j jVarP = zf.b.P(this.f13658a, o0VarQ, 0);
            boolean zR = o0VarQ.r(onBackPressedDispatcher);
            Object objQ = o0VarQ.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new i(onBackPressedDispatcher, 5);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new i(onBackPressedDispatcher, 5);
                    o0VarQ.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zR2 = o0VarQ.r(activity) | o0VarQ.r(jVarP) | o0VarQ.r(onBackPressedDispatcher);
            Object objQ2 = o0VarQ.q();
            if (zR2) {
                objQ2 = new ak0.m(activity, 2, jVarP, onBackPressedDispatcher);
                o0VarQ.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ak0.m(activity, 2, jVarP, onBackPressedDispatcher);
                    o0VarQ.K(objQ2);
                }
            }
            ux1.j.k(jVarP, m0Var, feVar, aVar2, (e23.a) objQ2, this.f13659b, o0VarQ, i15 & 1008);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, vVar, m0Var, feVar, i14, 8);
        }
    }
}

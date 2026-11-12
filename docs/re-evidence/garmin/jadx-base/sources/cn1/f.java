package cn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import lc.u0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn1/f;", "Lr70/r;", "Ldn1/a;", "stateHolder", "<init>", "(Ldn1/a;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn1.a f28013a;

    public f(dn1.a aVar) {
        aVar.getClass();
        this.f28013a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 403671189);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarQ.B(this) : o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            qm1.m mVarInvoke = this.f28013a.f60531a.invoke();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarQ.r(context);
            Object objQ = o0VarQ.q();
            if (zR) {
                objQ = new a42.d(context, 21);
                o0VarQ.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a42.d(context, 21);
                    o0VarQ.K(objQ);
                }
            }
            g.b(rVar, mVarInvoke, (e23.a) objQ, o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, rVar, qVar, i14, 25);
        }
    }
}

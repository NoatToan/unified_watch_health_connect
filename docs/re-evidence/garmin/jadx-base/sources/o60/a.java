package o60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import kh0.d;
import lc.u0;
import mx.h;
import nw0.f;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.i;
import r70.q;
import r70.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo60/a;", "Lr70/r;", "Lp60/a;", "stateHolder", "<init>", "(Lp60/a;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p60.a f129551a;

    public a(p60.a aVar) {
        aVar.getClass();
        this.f129551a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -1825005378);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = (i) this.f129551a.f136200a.invoke();
                o0VarQ.K(objQ);
            }
            m60.a aVar = (m60.a) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            s60.a aVar2 = new s60.a((Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b));
            boolean zR = o0VarQ.r(aVar2);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new f(aVar2, 1);
                o0VarQ.K(objQ2);
            }
            c.a(rVar, aVar, (l) objQ2, new d(aVar2, 29), o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(this, rVar, qVar, i14, 2);
        }
    }
}

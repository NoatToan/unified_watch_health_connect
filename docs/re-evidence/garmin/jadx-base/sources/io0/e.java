package io0;

import h82.p;
import lc.u0;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio0/e;", "Lr70/r;", "Ljo0/a;", "stateHolder", "<init>", "(Ljo0/a;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo0.a f94592a;

    public e(jo0.a aVar) {
        aVar.getClass();
        this.f94592a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1103087108);
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
            if (objQ == m.a.f135155b) {
                objQ = (i) this.f94592a.f99761a.invoke();
                o0VarQ.K(objQ);
            }
            go0.e eVar = (go0.e) s9.c.b((i) objQ, null, o0VarQ, 48).getF182175a();
            if (eVar instanceof go0.e.b) {
                o0VarQ.C(-790201817);
                d.a(rVar, (go0.e.b) eVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (eVar instanceof go0.e.a) {
                o0VarQ.C(-790197723);
                b.a(rVar, (go0.e.a) eVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-790194979);
                b.a(rVar, null, o0VarQ, (i15 & 14) | 48);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, rVar, qVar, i14, 17);
        }
    }
}

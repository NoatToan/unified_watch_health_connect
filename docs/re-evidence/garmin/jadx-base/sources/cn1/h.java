package cn1;

import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn1/h;", "Lr70/r;", "Ldn1/b;", "stateHolder", "<init>", "(Ldn1/b;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn1.b f28014a;

    public h(dn1.b bVar) {
        bVar.getClass();
        this.f28014a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -25670883);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                qm1.j jVar = this.f28014a.f60532a;
                objQ = r53.s.A(new qm1.f(jVar.f145618a, jVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            k.b(rVar, (qm1.k) p0.b((r53.i) objQ, null, null, o0VarQ, 48, 2).getF182175a(), o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, rVar, qVar, i14, 27);
        }
    }
}

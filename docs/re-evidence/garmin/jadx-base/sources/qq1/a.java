package qq1;

import f12.l;
import lc.u0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;
import yz1.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lqq1/a;", "Lr70/r;", "Lrq1/b;", "stateHolder", "<init>", "(Lrq1/b;)V", "", "isWheelchairModeOn", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq1.b f146052a;

    public a(rq1.b bVar) {
        bVar.getClass();
        this.f146052a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -1365673939);
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
                objQ = (r53.i) this.f146052a.f154132a.invoke();
                o0VarQ.K(objQ);
            }
            a0.a aVar = (a0.a) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            Object objQ2 = o0VarQ.q();
            if (objQ2 == c2565a) {
                l.f68084a.getClass();
                objQ2 = p0.n(Boolean.valueOf(l.a.a().B3()));
                o0VarQ.K(objQ2);
            }
            b.a(rVar, aVar, ((Boolean) ((p1) objQ2).getF182175a()).booleanValue(), o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(this, rVar, qVar, i14, 12);
        }
    }
}

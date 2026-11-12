package f71;

import d71.j;
import f21.a0;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.s;
import r70.q;
import r70.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf71/i;", "Lr70/r;", "Lg71/b;", "stateHolder", "<init>", "(Lg71/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g71.b f69449a;

    public i(g71.b bVar) {
        bVar.getClass();
        this.f69449a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -633727366);
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
                d71.h hVar = this.f69449a.f76198a;
                objQ = s.A(new d71.e(hVar.f58151a, hVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            j jVar = (j) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            if (jVar instanceof j.a) {
                o0VarQ.C(873366183);
                a.a(rVar, (j.a) jVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else if (jVar instanceof j.b) {
                o0VarQ.C(873370508);
                d.a(rVar, (j.b) jVar, o0VarQ, i15 & 14);
                o0VarQ.g0(false);
            } else {
                if (jVar != null) {
                    throw kg.f.h(o0VarQ, 873360285, false);
                }
                o0VarQ.C(873373791);
                d.a(rVar, null, o0VarQ, (i15 & 14) | 48);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r) this, rVar, qVar, i14, 11);
        }
    }
}

package s70;

import c2.x2;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/g0;", "Lr70/r;", "Ly70/g;", "stateHolder", "<init>", "(Ly70/g;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.g f157698a;

    public g0(y70.g gVar) {
        gVar.getClass();
        this.f157698a = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -456452136);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarQ.r(this);
            Object objQ = o0VarQ.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new s5.a(this, 5);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new s5.a(this, 5);
                    o0VarQ.K(objQ);
                }
            }
            i0.b(null, (e23.p) objQ, o0VarQ, 0);
            n70.n1 n1Var = this.f157698a.f194659a;
            Boolean bool = (Boolean) s9.c.b(r53.s.A(r53.s.l(n1Var.f124430c.e(), n1Var.f124431d.b(), n1Var.f124428a, new n70.o1(n1Var, null)), o53.s0.f129406a), null, o0VarQ, 48).getF182175a();
            if (bool == null) {
                o0VarQ.C(-298700979);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-298700978);
                if (bool.booleanValue()) {
                    o0VarQ.C(-2065845045);
                    boolean zR2 = o0VarQ.r(this);
                    Object objQ2 = o0VarQ.q();
                    if (zR2) {
                        objQ2 = new ro0.g(this, 12);
                        o0VarQ.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ro0.g(this, 12);
                            o0VarQ.K(objQ2);
                        }
                    }
                    i0.a(0, (e23.a) objQ2, x2.x(x2.f(rVar, 1.0f), null, 3), o0VarQ);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(-2065381843);
                    o0VarQ.g0(false);
                }
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 5);
        }
    }
}

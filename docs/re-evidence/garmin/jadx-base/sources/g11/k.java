package g11;

import f21.a0;
import lc.u0;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import r53.u1;
import r70.q;
import r70.r;
import v01.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg11/k;", "Lr70/r;", "Lh11/b;", "stateHolder", "<init>", "(Lh11/b;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h11.b f74862a;

    public k(h11.b bVar) {
        bVar.getClass();
        this.f74862a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 954839496);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        int i16 = 1;
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                v0 v0Var = this.f74862a.f80819a;
                objQ = new u1(v0Var.f174556a, v0Var.f174557b, new v01.u0(v0Var, null));
                o0VarQ.K(objQ);
            }
            q01.f fVar = (q01.f) s9.c.b((r53.i) objQ, q01.f.c.f142008b, o0VarQ, 48).getF182175a();
            Object objQ2 = o0VarQ.q();
            if (objQ2 == c2565a) {
                objQ2 = new e(i16);
                o0VarQ.K(objQ2);
            }
            m.a(v.c((e23.l) objQ2, rVar, true), null, fVar, o0VarQ, 0);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r) this, rVar, qVar, i14, 17);
        }
    }
}

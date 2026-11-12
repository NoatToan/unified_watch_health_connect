package tz1;

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
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltz1/c;", "Lr70/r;", "Luz1/b;", "stateHolder", "<init>", "(Luz1/b;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz1.b f167297a;

    public c(uz1.b bVar) {
        bVar.getClass();
        this.f167297a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -672117481);
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
                rz1.d dVar = this.f167297a.f173602a;
                objQ = s.A(new rz1.a(dVar.f155220a, dVar), s0.f129406a);
                o0VarQ.K(objQ);
            }
            e.b(rVar, (rz1.h) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a(), o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(this, rVar, qVar, false, i14, 11);
        }
    }
}

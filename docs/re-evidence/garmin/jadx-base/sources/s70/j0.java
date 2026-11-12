package s70;

import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Ls70/j0;", "Lr70/r;", "Ly70/h;", "stateHolder", "<init>", "(Ly70/h;)V", "", "isLoading", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.h f157712a;

    public j0(y70.h hVar) {
        hVar.getClass();
        this.f157712a = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -1122696104);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (((Boolean) s9.c.b(this.f157712a.f194661a, Boolean.TRUE, o0VarQ, 48).getF182175a()).booleanValue()) {
                o0VarQ.C(-1328335094);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-1329088518);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarQ.U);
                i2 i2VarA0 = o0VarQ.a0();
                h4.r rVarC = h4.k.c(rVar, o0VarQ);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (o0VarQ.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar);
                } else {
                    o0VarQ.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarQ);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarQ);
                h4.r rVarC2 = c2.u.f22885a.c(h4.r.S, h4.d.a.f81528f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(rVarC2, 0.0f, eVar.f97922g, 1);
                i3.c1 c1Var = i3.c1.f87691a;
                long jB = d92.b.a(o0VarQ).d().a().b();
                c1Var.getClass();
                i3.b1 b1VarA = i3.c1.a(jB, 0L, 0L, 0L, o0VarQ, 14);
                bVar2.getClass();
                k2.h hVarA = k2.i.a(eVar.f97917b);
                boolean zR = o0VarQ.r(qVar);
                Object objQ = o0VarQ.q();
                if (zR) {
                    objQ = new fp0.d(qVar, 2);
                    o0VarQ.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fp0.d(qVar, 2);
                        o0VarQ.K(objQ);
                    }
                }
                y.f157831a.getClass();
                i3.h1.a((e23.a) objQ, rVarA, false, hVarA, b1VarA, null, null, null, null, y.f157832b, o0VarQ, C.ENCODING_PCM_32BIT, 484);
                o0VarQ = o0VarQ;
                o0VarQ.g0(true);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 6);
        }
    }
}

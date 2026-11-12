package s70;

import c2.x2;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import n70.a6;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/v1;", "Lr70/r;", "Ly70/u;", "stateHolder", "<init>", "(Ly70/u;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.u f157812a;

    public v1(y70.u uVar) {
        uVar.getClass();
        this.f157812a = uVar;
    }

    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -538931092);
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
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = r53.s.A(new a6(this.f157812a.f194682a.f124823a), o53.s0.f129406a);
                o0VarQ.K(objQ);
            }
            List list = (List) s9.c.b((r53.i) objQ, null, o0VarQ, 48).getF182175a();
            if (list == null || list.isEmpty()) {
                list = null;
            }
            if (list == null) {
                o0VarQ.C(-708150101);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-708150100);
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarQ, 0);
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarQ);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarQ);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarQ.T || !p005kotlin.jvm.internal.s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarQ);
                c2.b0 b0Var = c2.b0.f22601a;
                o0VarQ.C(1421407048);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r70.r rVarA = m70.f.a((r70.s) it.next());
                    if (rVarA == null) {
                        o0VarQ.C(-2054266551);
                        o0VarQ.g0(false);
                    } else {
                        o0VarQ.C(-1174645320);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f15 = eVar.f97920e;
                        bVar2.getClass();
                        float f16 = eVar.f97921f;
                        bVar2.getClass();
                        rVarA.a(c2.l.C(rVarF, f15, f16, eVar.f97920e, 0.0f, 8), qVar, o0VarQ, i15 & 112);
                        o0VarQ.g0(false);
                    }
                }
                e5.u(o0VarQ, false, true, false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 16);
        }
    }
}

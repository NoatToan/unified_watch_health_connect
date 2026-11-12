package s70;

import i3.e5;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p3.b4;
import p3.i2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/e0;", "Lr70/r;", "Ly70/f;", "stateHolder", "<init>", "(Ly70/f;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.f f157687a;

    public e0(y70.f fVar) {
        fVar.getClass();
        this.f157687a = fVar;
    }

    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        boolean z14;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, 408435992);
        int i15 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        boolean z15 = true;
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            p2 p2Var = this.f157687a.f194658b;
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            Map map = (Map) p3.p0.b(p2Var, k0Var, null, o0VarQ, 48, 2).getF182175a();
            if (map.isEmpty()) {
                o0VarQ.C(75655082);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(74549932);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarQ, 0);
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
                o0VarQ.C(2004008321);
                for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((Number) entry.getKey()).longValue();
                    z90.a aVar2 = (z90.a) entry.getValue();
                    if ((aVar2 instanceof z90.a.d) || (aVar2 instanceof z90.a.C3788a)) {
                        o0VarQ.C(664303715);
                        xz1.a.f192853a.getClass();
                        z14 = z15;
                        r1.c0.c(b0Var, true, null, xz1.a.a(o0VarQ), xz1.a.b(o0VarQ), org.apache.commons.lang3.e.e(aVar2.getF203116a().f143493a, "FirmwareUpdateRequiredCard:"), z3.f.c(-1559869415, new ry0.g(3, aVar2, this), o0VarQ), o0VarQ, 1572918, 2);
                        o0VarQ.g0(false);
                    } else {
                        o0VarQ.C(665152278);
                        o0VarQ.g0(false);
                        z14 = z15;
                    }
                    z15 = z14;
                }
                e5.u(o0VarQ, false, z15, false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarQ.e();
        }
        p3.p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar, qVar, i14, 4);
        }
    }
}

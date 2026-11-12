package l72;

import i3.dd;
import i3.fb;
import i3.i7;
import i3.mh;
import i3.uc;
import i3.ud;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e2 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110989a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f110990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f110992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f110993e;

    public /* synthetic */ e2(long j8, long j14, a2.j jVar, uc ucVar) {
        this.f110990b = j8;
        this.f110991c = j14;
        this.f110992d = jVar;
        this.f110993e = ucVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f110989a;
        Object obj4 = this.f110993e;
        Object obj5 = this.f110992d;
        switch (i14) {
            case 0:
                String str = (String) obj5;
                u4.d dVar = (u4.d) obj4;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    long j8 = this.f110990b;
                    if (str != null || dVar == null) {
                        long j14 = this.f110991c;
                        if (str != null && dVar == null) {
                            mVar.C(-602700992);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarA = s5.x0.a(j92.f.f97935l, 0L, j14, null, null, 0L, null, null, 0, 0L, null, null, 16777213);
                            d6.h.f57752b.getClass();
                            int i15 = d6.h.f57755e;
                            g6.f.a aVar = g6.f.f75994b;
                            mh.c(str, c2.l.y(h4.r.S, 4), j8, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 1, 0, null, x0VarA, mVar, 48, 24576, 113656);
                            mVar.f();
                        } else if (str == null || dVar == null) {
                            mVar.C(-601468494);
                            mVar.f();
                        } else {
                            mVar.C(-602277129);
                            h4.d.f81522a.getClass();
                            h4.g.b bVar = h4.d.a.f81534l;
                            h4.r.a aVar2 = h4.r.S;
                            float f14 = 6;
                            g6.f.a aVar3 = g6.f.f75994b;
                            float f15 = 3;
                            float f16 = 16;
                            h4.r rVarH = c2.x2.h(c2.l.B(aVar2, f14, f15, f14, f15), f16);
                            c2.j.f22691a.getClass();
                            c2.s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar, mVar, 48);
                            int iHashCode = Long.hashCode(mVar.getU());
                            p3.i2 i2VarX = mVar.x();
                            h4.r rVarC = h4.k.c(rVarH, mVar);
                            h5.g.V.getClass();
                            h5.e0.a aVar4 = h5.g.a.f81805b;
                            if (mVar.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar4);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            c2.u2 u2Var = c2.u2.f22900a;
                            i7.b(dVar, null, c2.x2.q(aVar2, f16), j8, mVar, 432, 0);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(str, c2.l.C(aVar2, 4, 0.0f, 0.0f, 0.0f, 14), j8, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, s5.x0.a(j92.f.f97935l, 0L, j14, null, null, 0L, null, null, 0, 0L, null, null, 16777213), mVar, 48, 24576, 114680);
                            mVar.y();
                            mVar.f();
                        }
                    } else {
                        mVar.C(-603064374);
                        g6.f.a aVar5 = g6.f.f75994b;
                        i7.b(dVar, null, c2.x2.q(c2.l.y(h4.r.S, 3), 16), j8, mVar, 432, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                a2.j jVar = (a2.j) obj5;
                uc ucVar = (uc) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ud) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    c2.k0 k0Var = c2.x2.f22930a;
                    long j15 = this.f110990b;
                    h4.r rVarR = c2.x2.r(aVar6, g6.h.c(j15), g6.h.b(j15));
                    g6.f.a aVar7 = g6.f.f75994b;
                    k2.h hVar = k2.i.f102406a;
                    dd.f87874a.a(jVar, u1.b1.a(l4.w.a(u1.q.b((float) 0.7d, this.f110991c, rVarR, hVar), 2, hVar, false, 24), jVar, fb.a(20, 4, 0L, false)), ucVar, false, 0L, mVar2, 196614, 24);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e2(String str, u4.d dVar, long j8, long j14) {
        this.f110992d = str;
        this.f110993e = dVar;
        this.f110990b = j8;
        this.f110991c = j14;
    }
}

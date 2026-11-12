package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class qf implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f89460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f89461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.j f89462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.f1 f89463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f89464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f89465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89467h;

    /* JADX WARN: Multi-variable type inference failed */
    public qf(h4.r rVar, boolean z14, a2.j jVar, u1.f1 f1Var, boolean z15, e23.a<Unit> aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f89460a = rVar;
        this.f89461b = z14;
        this.f89462c = jVar;
        this.f89463d = f1Var;
        this.f89464e = z15;
        this.f89465f = aVar;
        this.f89466g = pVar;
        this.f89467h = pVar2;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarH = c2.x2.h(this.f89460a, uf.f89931a);
            p5.l.f136032b.getClass();
            h4.r rVarF = c2.x2.f(c2.l.A(j2.b.a(rVarH, this.f89461b, this.f89462c, this.f89463d, this.f89464e, p5.l.a(p5.l.f136036f), this.f89465f), uf.f89933c, 0.0f, 2), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(cVar, h4.d.a.f81534l, mVar2, 54);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarF, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u2 u2Var = c2.u2.f22900a;
            this.f89466g.invoke(mVar2, 0);
            c2.l.f(c2.x2.p(h4.r.S, uf.f89937g), mVar2);
            n3.q0.f123226a.getClass();
            s5.x0 x0VarA = sj.a(n3.q0.f123231f, mVar2);
            d6.h.f57752b.getClass();
            mh.a(s5.x0.a(x0VarA, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447), this.f89467h, mVar2, 0);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

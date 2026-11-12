package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class xe implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f90330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f90331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f90333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.u f90334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f90335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2.j f90336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f90337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f90338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f90339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90340k;

    /* JADX WARN: Multi-variable type inference failed */
    public xe(h4.r rVar, o4.r1 r1Var, long j8, float f14, u1.u uVar, boolean z14, a2.j jVar, boolean z15, e23.a<Unit> aVar, float f15, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f90330a = rVar;
        this.f90331b = r1Var;
        this.f90332c = j8;
        this.f90333d = f14;
        this.f90334e = uVar;
        this.f90335f = z14;
        this.f90336g = jVar;
        this.f90337h = z15;
        this.f90338i = aVar;
        this.f90339j = f15;
        this.f90340k = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            f5.p pVar = p7.f89279a;
            h4.r rVarD = l3.k.d(j2.b.a(ve.d(this.f90330a.then(d8.f87832a), this.f90331b, ve.e(this.f90332c, this.f90333d, mVar2), this.f90334e, ((g6.c) mVar2.A(kotlin.t1.f91490h)).s0(this.f90339j)), this.f90335f, this.f90336g, fb.a(0.0f, 7, 0L, false), this.f90337h, null, this.f90338i));
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarD, mVar2);
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
            p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(this.f90340k, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

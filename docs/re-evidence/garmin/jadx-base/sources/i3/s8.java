package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class s8 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f89625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f89626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f89627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f9 f89628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.b<Float, s1.n> f89629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f89630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f89631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h4.r f89632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f89633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f89634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f89635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f89636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f89637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f89638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, c2.k3> f89640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f89641q;

    /* JADX WARN: Multi-variable type inference failed */
    public s8(long j8, e23.a<Unit> aVar, mc mcVar, f9 f9Var, s1.b<Float, s1.n> bVar, o53.b0 b0Var, e23.l<? super Float, Unit> lVar, h4.r rVar, float f14, boolean z14, o4.r1 r1Var, long j14, long j15, float f15, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, ? extends c2.k3> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f89625a = j8;
        this.f89626b = aVar;
        this.f89627c = mcVar;
        this.f89628d = f9Var;
        this.f89629e = bVar;
        this.f89630f = b0Var;
        this.f89631g = lVar;
        this.f89632h = rVar;
        this.f89633i = f14;
        this.f89634j = z14;
        this.f89635k = r1Var;
        this.f89636l = j14;
        this.f89637m = j15;
        this.f89638n = f15;
        this.f89639o = pVar;
        this.f89640p = pVar2;
        this.f89641q = qVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarP = c2.l.p(c2.x2.d(h4.r.S, 1.0f));
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i11.f(20);
                mVar2.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarP, false);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
            p3.b4.c(h5.g.a.f81807d, rVarC2, mVar2);
            c2.u uVar = c2.u.f22885a;
            mc mcVar = this.f89627c;
            boolean z14 = ((pc) mcVar.f88996e.f109326h.getF182175a()) != pc.Hidden;
            boolean z15 = this.f89628d.f88094c;
            long j8 = this.f89625a;
            e23.a<Unit> aVar2 = this.f89626b;
            e9.c(0, j8, aVar2, mVar2, z14, z15);
            e9.b(uVar, this.f89629e, this.f89630f, aVar2, this.f89631g, this.f89632h, mcVar, this.f89633i, this.f89634j, this.f89635k, this.f89636l, this.f89637m, this.f89638n, this.f89639o, this.f89640p, this.f89641q, mVar2, 70);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

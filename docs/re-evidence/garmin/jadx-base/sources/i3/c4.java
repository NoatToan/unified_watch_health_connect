package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c4 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f87711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.h0 f87712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f87713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3.d0 f87714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f87715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f87716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bc f87717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b3 f87718h;

    /* JADX WARN: Multi-variable type inference failed */
    public c4(l3.e0 e0Var, l3.h0 h0Var, e23.l<? super Long, Unit> lVar, l3.d0 d0Var, Long l14, l3 l3Var, bc bcVar, b3 b3Var) {
        this.f87711a = e0Var;
        this.f87712b = h0Var;
        this.f87713c = lVar;
        this.f87714d = d0Var;
        this.f87715e = l14;
        this.f87716f = l3Var;
        this.f87717g = bcVar;
        this.f87718h = b3Var;
    }

    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            l3.h0 h0Var = this.f87712b;
            l3.e0 e0Var = this.f87711a;
            l3.h0 h0VarK = e0Var.k(h0Var, iIntValue);
            h4.r rVarE = dVar2.e(h4.r.S);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarE, mVar2);
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
            x3.i(h0VarK, this.f87713c, this.f87714d.f109211d, this.f87715e, null, null, this.f87716f, this.f87717g, this.f87718h, e0Var.f109226a, mVar2, 221184);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

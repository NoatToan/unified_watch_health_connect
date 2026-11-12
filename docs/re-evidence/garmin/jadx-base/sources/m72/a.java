package m72;

import c2.q;
import c2.u;
import c2.x2;
import f5.z0;
import h4.r;
import h5.e0;
import i3.i7;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import v62.h4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117088a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f117090c;

    public /* synthetic */ a(float f14, float f15) {
        this.f117089b = f14;
        this.f117090c = f15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f117088a;
        float f14 = this.f117090c;
        float f15 = this.f117089b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar = r.S;
                    r rVarQ = x2.q(aVar, f15);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarQ, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    s62.a.f157643a.getClass();
                    i7.b(h4.a(t62.b.f162798a), null, uVar.c(x2.q(aVar, f14), h4.d.a.f81528f), com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar), mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xe1.e.a(f15, f14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(float f14, float f15, int i14) {
        this.f117089b = f14;
        this.f117090c = f15;
    }
}

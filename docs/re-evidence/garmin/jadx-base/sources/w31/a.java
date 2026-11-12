package w31;

import c2.b0;
import c2.j;
import c2.l;
import c2.y;
import c2.z;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import l72.x0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f181837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i41.f f181838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f181839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f181840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z31.a f181841f;

    public /* synthetic */ a(c cVar, i41.f fVar, Integer num, boolean z14, z31.a aVar, int i14) {
        this.f181836a = i14;
        this.f181837b = cVar;
        this.f181838c = fVar;
        this.f181839d = num;
        this.f181840e = z14;
        this.f181841f = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        switch (this.f181836a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                c.a aVar = c.f181844f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1379763399, new a(this.f181837b, this.f181838c, this.f181839d, this.f181840e, this.f181841f, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                c.a aVar2 = c.f181844f;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(aVar3, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    int i14 = i41.f.f90926i;
                    c cVar = this.f181837b;
                    i41.f fVar = this.f181838c;
                    cVar.d(fVar, mVar, i14);
                    Integer num = this.f181839d;
                    if (num != null) {
                        mVar.C(-712629727);
                        x0 x0Var = x0.f111346a;
                        float f14 = 16;
                        g6.f.a aVar5 = g6.f.f75994b;
                        x0Var.e(l.B(aVar3, f14, f14, f14, f14), z3.f.c(-1751690063, new vv0.e(8, num, fVar), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                        mVar.f();
                    } else {
                        mVar.C(-711180539);
                        mVar.f();
                    }
                    if (this.f181840e) {
                        mVar.C(-711009915);
                        mVar.f();
                    } else {
                        mVar.C(-711123313);
                        y31.b.b(num, this.f181841f, mVar, 64);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}

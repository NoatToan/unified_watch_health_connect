package sz1;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f161573b;

    public /* synthetic */ r(t tVar, int i14) {
        this.f161572a = i14;
        this.f161573b = tVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Unit unit;
        int i14 = this.f161572a;
        t tVar = this.f161573b;
        int i15 = 1;
        switch (i14) {
            case 0:
                o82.a aVar = (o82.a) obj2;
                p3.m mVar = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, (o82.g) obj, aVar);
                if ((iD & 48) == 0) {
                    iD |= mVar.B(aVar) ? 32 : 16;
                }
                if (mVar.n(iD & 1, (iD & 145) != 144)) {
                    x1 x1Var = p3.n.f135158a;
                    u82.e.b(aVar, tVar.f161576c, null, false, z3.f.c(-540018707, new r(tVar, i15), mVar), mVar, ((iD >> 3) & 14) | 24576, 12);
                } else {
                    mVar.e();
                }
                break;
            default:
                u82.f fVar = (u82.f) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar2.B(fVar) : mVar2.r(fVar) ? 32 : 16;
                }
                if (mVar2.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var2 = p3.n.f135158a;
                    oz1.b bVar = (oz1.b) fVar.a();
                    if (bVar == null) {
                        mVar2.C(1250246783);
                        mVar2.f();
                        unit = null;
                    } else {
                        mVar2.C(1250246784);
                        l.b(bVar, tVar, mVar2, oz1.b.F);
                        mVar2.f();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        mVar2.C(733068997);
                        l.a(mVar2, 0);
                    } else {
                        mVar2.C(733066672);
                    }
                    mVar2.f();
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

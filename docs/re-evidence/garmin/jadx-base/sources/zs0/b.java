package zs0;

import c2.l;
import c2.x2;
import e23.p;
import h4.r;
import i3.i7;
import k2.i;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import u62.f3;
import u62.z2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f206819b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f206818a = i14;
        this.f206819b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u4.d dVarA;
        int i14 = this.f206818a;
        d dVar = this.f206819b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1592154779, new b(dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                xs0.a aVar = dVar.f206831b;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(u1.n.e(x2.q(aVar2, j92.b.f97901d.f97907f), d92.b.a(mVar2).e().g(), i.f102406a), j92.b.f97899b.f97920e);
                    if (d.a.f206842a[aVar.ordinal()] == 1) {
                        s62.a.f157643a.getClass();
                        dVarA = z2.a(t62.a.f162797a);
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = f3.a(t62.a.f162797a);
                    }
                    i7.b(dVarA, gl1.d.T(aVar.f192069b, mVar2, 0), rVarY, sn.a.b(mVar2), mVar2, 0, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

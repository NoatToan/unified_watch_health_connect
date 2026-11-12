package fx0;

import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.i7;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f73795b;

    public /* synthetic */ f(Integer num, int i14) {
        this.f73794a = i14;
        this.f73795b = num;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f73794a;
        Integer num = this.f73795b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h.a(num, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (num != null) {
                        mVar.C(1350218139);
                        ng2.f.a(num.intValue(), mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(1350312317);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                tl.c.a(num, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if ((num != null ? num.intValue() : 0) < 1) {
                        mVar2.C(-1573006583);
                        r.a aVar2 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.c cVar = j92.b.f97901d;
                        float f14 = cVar.f97904c;
                        float f15 = cVar.f97903b;
                        r rVarN = x2.n(aVar2, f14, f14);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC = h4.k.c(rVarN, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar3);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        i7.a(n5.c.a(R.drawable.ic_exclamation, mVar2, 0), null, u1.n.e(l4.k.b(u.f22885a.c(x2.u(x2.h(aVar2, f15), f15), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(mVar2).f().f(), m1.f128891a), d92.b.a(mVar2).f().f63508c, mVar2, 48, 0);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(-1572188772);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xr1.a.a(num, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Integer num, int i14, int i15) {
        this.f73794a = i15;
        this.f73795b = num;
    }
}

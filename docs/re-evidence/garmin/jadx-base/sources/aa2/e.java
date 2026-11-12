package aa2;

import c2.c1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2319b;

    public /* synthetic */ e(long j8, int i14) {
        this.f2318a = i14;
        this.f2319b = j8;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f2318a;
        long j8 = this.f2319b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(821234681, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                h4.r rVarE = u1.n.e(rVar, j8, k2.i.f102406a);
                mVar.f();
                return rVarE;
            case 1:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(229505279, rVar2, (Integer) obj3, mVar2);
                x1 x1Var2 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarB = u1.q.b(eVar.f97916a, j8, rVar2, k2.i.a(eVar.f97918c));
                mVar2.f();
                return rVarB;
            case 2:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(-1985239014, rVar3, (Integer) obj3, mVar3);
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarE2 = u1.n.e(rVar3, j8, m1.f128891a);
                mVar3.f();
                return rVarE2;
            case 3:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(-448085909, rVar4, (Integer) obj3, mVar4);
                x1 x1Var4 = p3.n.f135158a;
                h4.r rVarE3 = u1.n.e(rVar4, j8, m1.f128891a);
                mVar4.f();
                return rVarE3;
            default:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar5.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar, eVar2.f97918c, 0.0f, 2);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar5, 48);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar2);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar5);
                    u2 u2Var = u2.f22900a;
                    h4.r rVarR = x2.r(aVar, eVar2.f97920e, y31.b.f194369b);
                    m1.a aVar3 = m1.f128891a;
                    c2.q.a(u1.n.e(l4.k.b(rVarR, aVar3), j8, aVar3), mVar5, 0);
                    String strQ = y.Q(mVar5, R.string.hrv);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, c2.l.C(aVar, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, mVar5), mVar5, 0, 0, 131068);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }
}

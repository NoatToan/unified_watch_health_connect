package p006l2;

import c2.q;
import c2.u;
import c2.x2;
import e23.p;
import f5.z0;
import g6.h;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import zd0.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108333a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f108334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f108335c;

    public /* synthetic */ a(long j8, r rVar) {
        this.f108335c = j8;
        this.f108334b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f108333a;
        long j8 = this.f108335c;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar = this.f108334b;
                    if (j8 != 9205357640488583168L) {
                        mVar.C(-1244013944);
                        r rVarO = x2.o(rVar, h.c(j8), h.b(j8), 0.0f, 0.0f, 12);
                        d.f81522a.getClass();
                        z0 z0VarD = q.d(d.a.f81525c, false);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        r rVarC = k.c(rVarO, mVar);
                        g.V.getClass();
                        e0.a aVar = g.a.f81805b;
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar);
                        } else {
                            mVar.c();
                        }
                        b4.c(g.a.f81810g, z0VarD, mVar);
                        b4.c(g.a.f81809f, i2VarX, mVar);
                        b4.a(mVar, Integer.valueOf(iHashCode), g.a.f81813j);
                        b4.b(g.a.f81814k, mVar);
                        b4.c(g.a.f81807d, rVarC, mVar);
                        u uVar = u.f22885a;
                        b.b(null, mVar, 0, 1);
                        mVar.y();
                        mVar.f();
                    } else {
                        mVar.C(-1243644858);
                        b.b(rVar, mVar, 0, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                e.d(this.f108334b, j8, mVar, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(r rVar, long j8, int i14) {
        this.f108334b = rVar;
        this.f108335c = j8;
    }
}

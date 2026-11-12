package gs;

import b82.a1;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import g02.h0;
import gl1.y;
import h5.e0;
import ht1.w;
import l72.w1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78667a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f78668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f78669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f78670d;

    public /* synthetic */ r(int i14, e23.a aVar, p1 p1Var, boolean z14) {
        this.f78668b = p1Var;
        this.f78669c = z14;
        this.f78670d = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f78667a;
        e23.a aVar = this.f78670d;
        p1 p1Var = this.f78668b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    n4.d dVar = (n4.d) p1Var.getF182175a();
                    if (dVar == null) {
                        mVar.C(-1719320523);
                        mVar.f();
                    } else {
                        mVar.C(-1719320522);
                        h4.r.a aVar2 = h4.r.S;
                        boolean zB = mVar.B(dVar);
                        Object objQ = mVar.q();
                        p3.m.a aVar3 = p3.m.f135153a;
                        if (zB) {
                            objQ = new g12.f(dVar, 17);
                            mVar.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new g12.f(dVar, 17);
                                mVar.K(objQ);
                            }
                        }
                        h4.r rVarT = c2.l.t(aVar2, (e23.l) objQ);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC = c2.l.C(rVarT, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        h4.r rVarC2 = h4.k.c(rVarC, mVar);
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
                        b4.c(h5.g.a.f81810g, z0VarD, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar);
                        c2.u uVar = c2.u.f22885a;
                        long j8 = (((long) 0) << 32) | (((long) 10) & 4294967295L);
                        g6.k.a aVar5 = g6.k.f76003b;
                        w1 w1Var = w1.TopStart;
                        l72.x1 x1Var2 = l72.x1.StartMedium;
                        String strQ = y.Q(mVar, R.string.txt_tap_to_change_color);
                        boolean zB2 = mVar.B(aVar);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new h0(aVar, 20);
                            mVar.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new h0(aVar, 20);
                                mVar.K(objQ2);
                            }
                        }
                        d.f78592a.getClass();
                        a1.a(strQ, w1Var, x1Var2, 150, j8, this.f78669c, (e23.a) objQ2, d.f78593b, mVar, 100887936, 2);
                        mVar.y();
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                w.c(p1Var, this.f78669c, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(e23.a aVar, p1 p1Var, boolean z14) {
        this.f78668b = p1Var;
        this.f78669c = z14;
        this.f78670d = aVar;
    }
}

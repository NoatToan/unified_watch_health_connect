package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f55993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f55994c;

    public /* synthetic */ b0(x3 x3Var, p3.p1 p1Var, int i14) {
        this.f55992a = i14;
        this.f55993b = x3Var;
        this.f55994c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55992a;
        p3.p1 p1Var = this.f55994c;
        x3 x3Var = this.f55993b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (((Boolean) x3Var.getF182175a()).booleanValue() || ((x5.l0) p1Var.getF182175a()).f188878a.f157138b.length() != 0) {
                        mVar.C(213612768);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        String strQ = gl1.y.Q(mVar, R.string.lbl_course_profile_custom_elevation);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 48, 0, 131068);
                        mVar.f();
                    } else {
                        mVar.C(212969146);
                        h4.r.a aVar = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        h4.r rVarC = h4.k.c(aVar, mVar);
                        h5.g.V.getClass();
                        h5.e0.a aVar2 = h5.g.a.f81805b;
                        if (mVar.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar2);
                        } else {
                            mVar.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar);
                        c2.b0 b0Var = c2.b0.f22601a;
                        h4.r rVarF2 = x2.f(aVar, 1.0f);
                        String strQ2 = gl1.y.Q(mVar, R.string.lbl_course_profile_custom_elevation);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarF2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 48, 0, 131068);
                        mh.c(gl1.y.Q(mVar, R.string.lbl_enter_custom_elevation), x2.f(aVar, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 48, 0, 131068);
                        mVar.y();
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new zk1.d(p1Var, 12);
                        mVar2.K(objQ);
                    }
                    zo1.w0.a(zBooleanValue, (e23.a) objQ, mVar2, 48);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}

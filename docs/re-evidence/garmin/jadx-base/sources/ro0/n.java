package ro0;

import android.content.Context;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import l72.p2;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f153865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f153866c;

    public /* synthetic */ n(int i14, Context context, e23.l lVar) {
        this.f153864a = i14;
        this.f153865b = context;
        this.f153866c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153864a;
        e23.l lVar = this.f153866c;
        Context context = this.f153865b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    r1.b(gl1.y.Q(mVar, R.string.lbl_app_help), z3.f.c(-1344011800, new n(i15, context, lVar), mVar), mVar, 48, 0);
                    r1.b(gl1.y.Q(mVar, R.string.help_device_help), z3.f.c(-1969544239, new b71.n(lVar, 17, (byte) 0), mVar), mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar2, R.string.product_support_connect_support);
                    a.f153748a.getClass();
                    z3.e eVar = a.f153749b;
                    boolean zR = mVar2.r(context);
                    Object objQ = mVar2.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new o72.f(context, 28);
                        mVar2.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o72.f(context, 28);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.g(strQ, null, null, null, eVar, false, false, (e23.a) objQ, mVar2, 24576, 238);
                    String strQ2 = gl1.y.Q(mVar2, R.string.feedback_diagnostic_report);
                    boolean zB = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new me2.d(lVar, 14);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new me2.d(lVar, 14);
                            mVar2.K(objQ2);
                        }
                    }
                    p2Var.g(strQ2, null, null, null, null, false, false, (e23.a) objQ2, mVar2, 0, 254);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}

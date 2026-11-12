package pf0;

import c2.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailActivity;
import h5.e0;
import l72.p2;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf0.c f137497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EcgDetailActivity f137498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f137499d;

    public /* synthetic */ m(gf0.c cVar, EcgDetailActivity ecgDetailActivity, String str, int i14) {
        this.f137496a = i14;
        this.f137497b = cVar;
        this.f137498c = ecgDetailActivity;
        this.f137499d = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String productName;
        int i14 = this.f137496a;
        String str = this.f137499d;
        EcgDetailActivity ecgDetailActivity = this.f137498c;
        gf0.c cVar = this.f137497b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                EcgDetailActivity.a aVar = EcgDetailActivity.f34869p;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-97249644, new m(cVar, ecgDetailActivity, str, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                EcgDetailActivity.a aVar2 = EcgDetailActivity.f34869p;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    r1.b(gl1.y.Q(mVar2, R.string.lbl_device), z3.f.c(-1962522011, new m(cVar, ecgDetailActivity, str, i15), mVar2), mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                EcgDetailActivity.a aVar5 = EcgDetailActivity.f34869p;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (cVar != null) {
                        mVar3.C(1896663873);
                        com.garmin.android.apps.connectmobile.devices.model.l device = cVar.getDevice();
                        if (device == null || (productName = device.getDeviceName()) == null) {
                            com.garmin.android.apps.connectmobile.devices.model.l device2 = cVar.getDevice();
                            if (device2 != null) {
                                productName = device2.getF143516f();
                            } else {
                                productName = cVar.getProductName();
                                if (productName == null) {
                                    productName = ecgDetailActivity.getString(R.string.lbl_unknown);
                                    productName.getClass();
                                }
                            }
                        }
                        String str2 = productName;
                        String firmwareVersion = cVar.getFirmwareVersion();
                        if (firmwareVersion == null) {
                            firmwareVersion = "";
                        }
                        p2.f111205a.h(str2, firmwareVersion, null, null, null, false, false, z3.f.c(-1839489714, new ov1.q(cVar, 9), mVar3), null, null, null, mVar3, 12582912, 0, 1916);
                        mVar3.f();
                    } else {
                        mVar3.C(1898013117);
                        mVar3.f();
                    }
                    String str3 = this.f137499d;
                    if (str3 != null) {
                        mVar3.C(1898151780);
                        p2 p2Var = p2.f111205a;
                        String strQ = gl1.y.Q(mVar3, R.string.lbl_ecg_app);
                        a.f137464a.getClass();
                        p2Var.h(strQ, str3, null, null, null, false, false, a.f137465b, null, null, null, mVar3, 12582912, 0, 1916);
                        mVar3.f();
                    } else {
                        mVar3.C(1899435645);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}

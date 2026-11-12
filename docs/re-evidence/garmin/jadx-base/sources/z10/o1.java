package z10;

import com.garmin.android.apps.connectmobile.consent.DataConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataConsentActivity f201188b;

    public /* synthetic */ o1(DataConsentActivity dataConsentActivity, int i14) {
        this.f201187a = i14;
        this.f201188b = dataConsentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201187a;
        DataConsentActivity dataConsentActivity = this.f201188b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DataConsentActivity.a aVar = DataConsentActivity.f32169h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1007251354, new o1(dataConsentActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DataConsentActivity.a aVar2 = DataConsentActivity.f32169h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(dataConsentActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new p1(dataConsentActivity, 2);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p1(dataConsentActivity, 2);
                            mVar2.K(objQ);
                        }
                    }
                    r1.a((e23.a) objQ, dataConsentActivity.ea(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

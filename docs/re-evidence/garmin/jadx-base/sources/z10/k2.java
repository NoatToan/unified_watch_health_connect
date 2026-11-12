package z10;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivacyPolicyConsentActivity f201095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f201096c;

    public /* synthetic */ k2(boolean z14, PrivacyPolicyConsentActivity privacyPolicyConsentActivity) {
        this.f201094a = 2;
        this.f201096c = z14;
        this.f201095b = privacyPolicyConsentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201094a;
        PrivacyPolicyConsentActivity privacyPolicyConsentActivity = this.f201095b;
        boolean z14 = this.f201096c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PrivacyPolicyConsentActivity.a aVar = PrivacyPolicyConsentActivity.f32218d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1882777588, new k2(privacyPolicyConsentActivity, z14, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PrivacyPolicyConsentActivity.a aVar2 = PrivacyPolicyConsentActivity.f32218d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    p3.p1 p1VarC = s9.c.c(r53.s.d(((p2) privacyPolicyConsentActivity.f32221c.getValue()).f201203a), mVar2);
                    z02.d.a(((q2) p1VarC.getF182175a()).f201218a, z3.f.c(1154231567, new k2(z14, privacyPolicyConsentActivity), mVar2), null, null, null, z3.f.c(-507204213, new xm0.h(24, privacyPolicyConsentActivity, p1VarC), mVar2), mVar2, 196656, 28);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                PrivacyPolicyConsentActivity.a aVar3 = PrivacyPolicyConsentActivity.f32218d;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    if (z14) {
                        mVar3.C(204498073);
                        z02.f.a(0, 59, null, null, null, gl1.y.Q(mVar3, R.string.txt_privacy_policy), mVar3, null);
                        mVar3.f();
                    } else {
                        mVar3.C(204638348);
                        String strQ = gl1.y.Q(mVar3, R.string.txt_privacy_policy);
                        boolean zR = mVar3.r(privacyPolicyConsentActivity);
                        Object objQ = mVar3.q();
                        if (zR) {
                            objQ = new l2(privacyPolicyConsentActivity, 3);
                            mVar3.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l2(privacyPolicyConsentActivity, 3);
                                mVar3.K(objQ);
                            }
                        }
                        z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar3, null);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k2(PrivacyPolicyConsentActivity privacyPolicyConsentActivity, boolean z14, int i14) {
        this.f201094a = i14;
        this.f201095b = privacyPolicyConsentActivity;
        this.f201096c = z14;
    }
}

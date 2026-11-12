package f20;

import c22.w1;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hl.a.b f68390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f68391c;

    public /* synthetic */ g(hl.a.b bVar, String str, int i14) {
        this.f68389a = i14;
        this.f68390b = bVar;
        this.f68391c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f68389a;
        String str = this.f68391c;
        hl.a.b bVar = this.f68390b;
        boolean z14 = false;
        int i15 = 2;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ContactActivity.a aVar = ContactActivity.T;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    w1.a(bVar.f84252b, this.f68391c, bVar.f84254d, false, null, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ContactActivity.a aVar2 = ContactActivity.T;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(269903565, new g(bVar, str, z14 ? 1 : 0), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AuthorizedViewersActivity.a aVar3 = AuthorizedViewersActivity.f34974m;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    w1.a(bVar.f84252b, this.f68391c, bVar.f84254d, false, null, mVar3, 0, 24);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                AuthorizedViewersActivity.a aVar4 = AuthorizedViewersActivity.f34974m;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-346021089, new g(bVar, str, i15), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                SafetyFeaturesActivity.a aVar5 = SafetyFeaturesActivity.f43691f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1585990606, new g(bVar, str, 5), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                SafetyFeaturesActivity.a aVar6 = SafetyFeaturesActivity.f43691f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    w1.a(bVar.f84252b, this.f68391c, bVar.f84254d, false, null, mVar6, 0, 24);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i16 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    w1.a(bVar.f84252b, this.f68391c, bVar.f84254d, false, null, mVar7, 3072, 16);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i17 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-702979200, new g(bVar, str, 6), mVar8), mVar8, 196608, 31);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ProductImprovementConsentActivity.a aVar7 = ProductImprovementConsentActivity.f32230h;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1713173998, new g(bVar, str, 9), mVar9), mVar9, 196608, 31);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ProductImprovementConsentActivity.a aVar8 = ProductImprovementConsentActivity.f32230h;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    w1.a(bVar.f84252b, this.f68391c, bVar.f84254d, false, c2.l.C(aVar9, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), mVar10, 3072, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                SafetyFeatureSetupWizardActivity.a aVar10 = SafetyFeatureSetupWizardActivity.f43851k;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(72043380, new g(bVar, str, 11), mVar11), mVar11, 196608, 31);
                } else {
                    mVar11.e();
                }
                break;
            default:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                SafetyFeatureSetupWizardActivity.a aVar11 = SafetyFeatureSetupWizardActivity.f43851k;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    w1.a(bVar.f84252b, this.f68391c, bVar.f84254d, false, null, mVar12, 0, 24);
                } else {
                    mVar12.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

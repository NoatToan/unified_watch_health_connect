package u12;

import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaggingPrivacyActivity f167811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.o f167812c;

    public /* synthetic */ p(TaggingPrivacyActivity taggingPrivacyActivity, com.garmin.android.apps.connectmobile.userprofile.model.o oVar, int i14) {
        this.f167810a = i14;
        this.f167811b = taggingPrivacyActivity;
        this.f167812c = oVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167810a;
        com.garmin.android.apps.connectmobile.userprofile.model.o oVar = this.f167812c;
        TaggingPrivacyActivity taggingPrivacyActivity = this.f167811b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                TaggingPrivacyActivity.a aVar = TaggingPrivacyActivity.f47117a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1871317510, new p(taggingPrivacyActivity, oVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                TaggingPrivacyActivity.a aVar2 = TaggingPrivacyActivity.f47117a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    taggingPrivacyActivity.ea(oVar, mVar2, com.garmin.android.apps.connectmobile.d.$stable << 3);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

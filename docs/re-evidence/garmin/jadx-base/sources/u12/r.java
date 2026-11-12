package u12;

import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaggingPrivacyActivity f167817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.o f167818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f167819d;

    public /* synthetic */ r(TaggingPrivacyActivity taggingPrivacyActivity, com.garmin.android.apps.connectmobile.userprofile.model.o oVar, p1 p1Var, int i14) {
        this.f167816a = i14;
        this.f167817b = taggingPrivacyActivity;
        this.f167818c = oVar;
        this.f167819d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f167816a;
        p1 p1Var = this.f167819d;
        com.garmin.android.apps.connectmobile.userprofile.model.o oVar = this.f167818c;
        TaggingPrivacyActivity taggingPrivacyActivity = this.f167817b;
        switch (i14) {
            case 0:
                TaggingPrivacyActivity.a aVar = TaggingPrivacyActivity.f47117a;
                taggingPrivacyActivity.fa(oVar, (com.garmin.android.apps.connectmobile.userprofile.model.o) p1Var.getF182175a());
                break;
            default:
                TaggingPrivacyActivity.a aVar2 = TaggingPrivacyActivity.f47117a;
                taggingPrivacyActivity.fa(oVar, (com.garmin.android.apps.connectmobile.userprofile.model.o) p1Var.getF182175a());
                break;
        }
        return Unit.INSTANCE;
    }
}

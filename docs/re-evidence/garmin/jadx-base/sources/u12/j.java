package u12;

import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FollowerRequestsPrivacyActivity f167796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f167797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f167798d;

    public /* synthetic */ j(FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity, p1 p1Var, p1 p1Var2, int i14) {
        this.f167795a = i14;
        this.f167796b = followerRequestsPrivacyActivity;
        this.f167797c = p1Var;
        this.f167798d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f167795a;
        p1 p1Var = this.f167798d;
        p1 p1Var2 = this.f167797c;
        FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity = this.f167796b;
        switch (i14) {
            case 0:
                FollowerRequestsPrivacyActivity.a aVar = FollowerRequestsPrivacyActivity.f47109c;
                if (((Boolean) p1Var2.getValue()).booleanValue()) {
                    followerRequestsPrivacyActivity.ga(true);
                } else {
                    p1Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                FollowerRequestsPrivacyActivity.a aVar2 = FollowerRequestsPrivacyActivity.f47109c;
                if (((Boolean) p1Var2.getValue()).booleanValue()) {
                    followerRequestsPrivacyActivity.ga(true);
                } else {
                    p1Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

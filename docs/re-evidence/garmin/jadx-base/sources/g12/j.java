package g12;

import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public j(Object obj) {
        super(0, obj, UserProfileActivity.class, "onReportProfileImage", "onReportProfileImage()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        UserProfileActivity userProfileActivity = (UserProfileActivity) this.receiver;
        UserProfileActivity.a aVar = UserProfileActivity.f46494x;
        userProfileActivity.getClass();
        ca1.d.f26580m.getClass();
        ca1.d dVarA = ca1.d.a.a(userProfileActivity);
        if (dVarA != null) {
            dVarA.show(userProfileActivity.getSupportFragmentManager(), "reportImage");
        }
        return Unit.INSTANCE;
    }
}

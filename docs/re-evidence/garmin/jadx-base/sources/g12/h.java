package g12;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserProfileActivity f74893b;

    public /* synthetic */ h(UserProfileActivity userProfileActivity, int i14) {
        this.f74892a = i14;
        this.f74893b = userProfileActivity;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        Boolean boolValueOf;
        String displayName;
        String str;
        int i14 = this.f74892a;
        boolean z14 = true;
        UserProfileActivity userProfileActivity = this.f74893b;
        v2 v2Var = (v2) obj;
        switch (i14) {
            case 0:
                UserProfileActivity.a aVar = UserProfileActivity.f46494x;
                v2Var.getClass();
                if (v2Var instanceof v2.b) {
                    Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                    if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                        z14 = false;
                    } else {
                        Iterator it = iterable.iterator();
                        do {
                            if (it.hasNext()) {
                                displayName = ((hi0.a) it.next()).getDisplayName();
                                str = userProfileActivity.f46495e;
                                if (str == null) {
                                    p005kotlin.jvm.internal.s.m("displayName");
                                    throw null;
                                }
                            } else {
                                z14 = false;
                            }
                        } while (!p005kotlin.jvm.internal.s.g(displayName, str));
                    }
                    boolValueOf = Boolean.valueOf(z14);
                    i2.f36769a.getClass();
                    i2.a.k(a2.USER, "UserProfileActivity", "fetchMutualFollowing getWheelchairModeEnabled = " + boolValueOf);
                } else {
                    boolValueOf = null;
                }
                m12.r rVar = userProfileActivity.f46510v;
                com.garmin.android.apps.connectmobile.userprofile.model.q qVar = userProfileActivity.f46496f;
                userProfileActivity.startActivity(rVar.h(userProfileActivity, qVar != null ? qVar.getUserFollowProfile() : null, boolValueOf));
                userProfileActivity.f46510v.k();
                return;
            default:
                UserProfileActivity.a aVar2 = UserProfileActivity.f46494x;
                v2Var.getClass();
                userProfileActivity.fa(true);
                return;
        }
    }
}

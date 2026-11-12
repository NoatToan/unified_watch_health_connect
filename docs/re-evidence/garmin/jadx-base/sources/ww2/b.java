package ww2;

import com.garmin.android.connectiq.BuildConfig;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lww2/b;", "", "", "playStoreDeepLink", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum b {
    GARMIN_CONNECT_MOBILE("com.garmin.android.apps.connectmobile"),
    GARMIN_DIVE("com.garmin.android.apps.dive"),
    GARMIN_GOLF("com.garmin.android.apps.golf"),
    GARMIN_TOY_STORE(BuildConfig.ARTIFACT_GROUP_ID),
    GARMIN_VIRB("com.garmin.android.apps.virb");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187905a;

    b(String str) {
        this.f187905a = str;
    }
}

package bi1;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbi1/u;", "", "", FirebaseAnalytics.Param.INDEX, "displayResId", "", "resourceName", "<init>", "(Ljava/lang/String;IIILjava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum u {
    Top(0, R.string.device_setting_watch_face_top, "top"),
    Bottom(1, R.string.device_setting_watch_face_bottom, "bottom");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18088c;

    u(int i14, int i15, String str) {
        this.f18086a = i14;
        this.f18087b = i15;
        this.f18088c = str;
    }
}

package cx;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcx/c;", "", "", Action.KEY_ATTRIBUTE, "", "levelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    VERY_LOW("VERY_LOW", R.string.gcm_body_battery_lbl_very_low),
    /* JADX INFO: Fake field, exist only in values array */
    LOW("LOW", R.string.gcm_body_battery_lbl_low),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE("MODERATE", R.string.lbl_moderate),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH("HIGH", R.string.gcm_body_battery_lbl_high);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56331b;

    c(String str, int i14) {
        this.f56330a = str;
        this.f56331b = i14;
    }
}

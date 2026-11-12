package eg1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Leg1/d;", "", "", "headerTitleResId", "", "weight", "<init>", "(Ljava/lang/String;IIF)V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    SPEED(R.string.lbl_speed, 1.2f),
    PACE(R.string.lbl_pace, 1.3f),
    TIME(R.string.lbl_time, 1.0f),
    WIND(R.string.lbl_wind, 1.0f),
    DATE(R.string.txt_date, 1.2f),
    HR(R.string.lbl_heart_rate_initials, 1.2f),
    POWER(R.string.lbl_power_cap, 1.2f);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f63995b;

    d(int i14, float f14) {
        this.f63994a = i14;
        this.f63995b = f14;
    }
}

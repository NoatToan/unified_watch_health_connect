package iu0;

import com.garmin.android.apps.connectmobile.R;
import com.mapbox.turf.TurfConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Liu0/b;", "", "", TurfConstants.UNIT_METERS, "", "stringId", "<init>", "(Ljava/lang/String;IDI)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    FIVE_K(5000.0d, R.string.personal_records_label_5k_run),
    TEN_K(10000.0d, R.string.personal_records_label_10k_run),
    HALF_MARATHON(21097.5d, R.string.personal_records_label_half_marathon),
    MARATHON(42195.0d, R.string.personal_records_label_full_marathon),
    METRIC_CENTURY(100000.0d, R.string.lbl_metric_century_distance_option),
    CENTURY(160934.4d, R.string.lbl_century_distance_option);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f95011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95012b;

    b(double d14, int i14) {
        this.f95011a = d14;
        this.f95012b = i14;
    }
}

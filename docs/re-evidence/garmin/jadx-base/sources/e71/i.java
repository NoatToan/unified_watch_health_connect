package e71;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le71/i;", "", "", "status", "feedbackPhraseId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum i {
    NONE(-1, -1),
    LOW(R.string.txt_activity_level_low_label, R.string.msg_ts_load_ratio_feedback_1),
    OPTIMAL(R.string.lbl_optimal, R.string.msg_ts_load_ratio_feedback_2),
    HIGH_OPTIMAL(R.string.lbl_optimal, R.string.msg_ts_load_ratio_feedback_3),
    HIGH(R.string.txt_activity_level_high_label, R.string.msg_ts_load_ratio_feedback_4),
    VERY_HIGH(R.string.tr_acwr_display_poor_very_poor, R.string.msg_ts_load_ratio_feedback_5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63315b;

    i(int i14, int i15) {
        this.f63314a = i14;
        this.f63315b = i15;
    }
}

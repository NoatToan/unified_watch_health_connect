package aq;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Laq/p3;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "selectedColor", "unselectedColor", "", "intervalLimit", "<init>", "(Ljava/lang/String;IIIILjava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum p3 {
    /* JADX INFO: Fake field, exist only in values array */
    OVERREACHING(R.string.aerobic_overreaching, R.color.gcm_training_effect_red_selected, R.color.gcm_training_effect_red_unselected, "5.0"),
    /* JADX INFO: Fake field, exist only in values array */
    HIGHLY_IMPROVING(R.string.activities_highly_improving_title, R.color.gcm_training_effect_orange_selected, R.color.gcm_training_effect_orange_unselected, "4.0 - 4.9"),
    /* JADX INFO: Fake field, exist only in values array */
    IMPROVING(R.string.activities_training_effect_improving_title, R.color.gcm_training_effect_green_selected, R.color.gcm_training_effect_green_unselected, "3.0 - 3.9"),
    /* JADX INFO: Fake field, exist only in values array */
    MAINTAINING(R.string.lbl_maintaining, R.color.gcm_training_effect_blue_selected, R.color.gcm_training_effect_blue_unselected, "2.0 - 2.9"),
    /* JADX INFO: Fake field, exist only in values array */
    MINOR_BENEFIT(R.string.activities_minor_benefit, R.color.gcm_training_effect_neutral_selected, R.color.gcm_training_effect_neutral_unselected, "1.0 - 1.9"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_BENEFIT(R.string.activities_no_benefit, R.color.gcm_training_effect_neutral_selected, R.color.gcm_training_effect_neutral_unselected, "0.0 - 0.9");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12161d;

    p3(int i14, int i15, int i16, String str) {
        this.f12158a = i14;
        this.f12159b = i15;
        this.f12160c = i16;
        this.f12161d = str;
    }
}

package sq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsq/b;", "", "", "stepTypeKey", "", "stepTypeLabelRes", "stepTypeColorRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    WARM_UP("WARM_UP", R.string.workout_step_type_warmup, R.color.gcm3_workout_warmup),
    /* JADX INFO: Fake field, exist only in values array */
    WORKOUT("ACTIVE", R.string.lbl_workout, R.color.gcm3_workout_other),
    REST("REST", R.string.workout_step_type_rest, R.color.gcm3_workout_rest),
    /* JADX INFO: Fake field, exist only in values array */
    COOLDOWN("COOLDOWN", R.string.workout_step_type_cooldown, R.color.gcm3_workout_cooldown);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160525a;

    b(String str, int i14, int i15) {
        this.f160525a = str;
    }
}

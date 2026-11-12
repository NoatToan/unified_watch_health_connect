package sr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsr/r;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f160582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160583b;

    static {
        new a(null);
    }

    public r(l22.b bVar) {
        bVar.getClass();
        this.f160582a = bVar;
        this.f160583b = bVar.getString(R.string.lbl_none);
    }

    public static int b(int i14) {
        if (j23.t.o(1, 30).d(i14)) {
            return R.color.gcm_workout_metrics_blue_color;
        }
        if (j23.t.o(30, 40).d(i14)) {
            return R.color.gcm_workout_metrics_green_color;
        }
        if (j23.t.o(40, 50).d(i14)) {
            return R.color.gcm_workout_metrics_light_green_color;
        }
        if (j23.t.o(50, 70).d(i14)) {
            return R.color.gcm_workout_metrics_yellow_color;
        }
        if (j23.t.o(70, 90).d(i14)) {
            return R.color.gcm_workout_metrics_orange_color;
        }
        if (j23.t.o(90, 100).d(i14)) {
            return R.color.gcm_workout_metrics_light_red_color;
        }
        return i14 >= 100 ? R.color.gcm_workout_metrics_red_color : R.color.gcm_rpe_seekbar_thumb_stroke;
    }

    public static int c(int i14) {
        if (j23.t.o(1, 20).d(i14)) {
            return R.string.workout_rpe_very_light;
        }
        if (j23.t.o(20, 30).d(i14)) {
            return R.string.workout_rpe_light;
        }
        if (j23.t.o(30, 40).d(i14)) {
            return R.string.workout_rpe_moderate;
        }
        if (j23.t.o(40, 50).d(i14)) {
            return R.string.workout_rpe_somewhat_hard;
        }
        if (j23.t.o(50, 70).d(i14)) {
            return R.string.workout_rpe_hard;
        }
        if (j23.t.o(70, 90).d(i14)) {
            return R.string.workout_rpe_very_hard;
        }
        if (j23.t.o(90, 100).d(i14)) {
            return R.string.workout_rpe_extremely_hard;
        }
        return i14 >= 100 ? R.string.workout_rpe_max_effort : R.string.lbl_none;
    }

    public final String a(Integer num) {
        if (num.intValue() <= 0) {
            return this.f160583b;
        }
        Integer numValueOf = Integer.valueOf(num.intValue() / 10);
        int iC = c(num.intValue());
        l22.b bVar = this.f160582a;
        return bVar.a(R.string.string_short_dash_line_string_pattern, numValueOf, bVar.getString(iC));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lsr/r$a;", "", "<init>", "()V", "", "RPE_MAX_VALUE", "I", "WORKOUT_FEEL_VERY_STRONG", "WORKOUT_FEEL_STRONG", "WORKOUT_FEEL_NORMAL", "WORKOUT_FEEL_WEAK", "WORKOUT_FEEL_VERY_WEAK", "WORKOUT_RPE_NOT_SELECTED", "WORKOUT_RPE_LIGHT", "WORKOUT_RPE_MODERATE", "WORKOUT_SOMEWHAT_HARD", "WORKOUT_HARD", "WORKOUT_RPE_VERY_HARD", "WORKOUT_EXTREMELY_HARD", "WORKOUT_RPE_MAX_EFFORT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

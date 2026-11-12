package j61;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lj61/g;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    AEROBIC_ENDURANCE_MODERATE("AEROBIC_ENDURANCE_MODERATE", R.string.lbl_course_demands_feedback_aerobic_endurance_moderate),
    AEROBIC_ENDURANCE_HIGH("AEROBIC_ENDURANCE_HIGH", R.string.lbl_course_demands_feedback_aerobic_endurance_high),
    AEROBIC_ENDURANCE_VERY_HIGH("AEROBIC_ENDURANCE_VERY_HIGH", R.string.lbl_course_demands_feedback_aerobic_endurance_very_high),
    AEROBIC_CAPACITY_MODERATE_FAIRLY_SHORT("AEROBIC_CAPACITY_MODERATE_FAIRLY_SHORT", R.string.lbl_course_demands_feedback_aerobic_capacity_moderate_fairly_short),
    AEROBIC_CAPACITY_MODERATE_FAIRLY_HILLY("AEROBIC_CAPACITY_MODERATE_FAIRLY_HILLY", R.string.lbl_course_demands_feedback_aerobic_capacity_moderate_fairly_hilly),
    AEROBIC_CAPACITY_HIGH_SHORT("AEROBIC_CAPACITY_HIGH_SHORT", R.string.lbl_course_demands_feedback_aerobic_capacity_high_short),
    AEROBIC_CAPACITY_HIGH_FAIRLY_SHORT("AEROBIC_CAPACITY_HIGH_FAIRLY_SHORT", R.string.lbl_course_demands_feedback_aerobic_capacity_high_fairly_short),
    AEROBIC_CAPACITY_HIGH_HILLY("AEROBIC_CAPACITY_HIGH_HILLY", R.string.lbl_course_demands_feedback_aerobic_capacity_high_hilly),
    AEROBIC_CAPACITY_VERY_HIGH("AEROBIC_CAPACITY_VERY_HIGH", R.string.lbl_course_demands_feedback_aerobic_capacity_very_high),
    ANAEROBIC_CAPACITY_MODERATE("ANAEROBIC_CAPACITY_MODERATE", R.string.lbl_course_demands_feedback_aerobic_capacity_moderate),
    ANAEROBIC_CAPACITY_HIGH("ANAEROBIC_CAPACITY_HIGH", R.string.lbl_course_demands_feedback_aerobic_capacity_high),
    INVALID("INVALID", 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97340a;

    static {
        new a(null);
    }

    g(String str, int i14) {
        this.f97340a = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj61/g$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

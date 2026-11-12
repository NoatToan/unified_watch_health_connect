package j61;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v11 j61.b[], still in use, count: 1, list:
  (r0v11 j61.b[]) from 0x0147: CONSTRUCTOR (r0v11 j61.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lj61/b;", "", "", Action.KEY_ATTRIBUTE, "", "stringResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", JWKParameterNames.OCT_KEY_VALUE, "l", "m", JWKParameterNames.RSA_MODULUS, "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "v", "w", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    VERY_HIGH_STRONGEST("VERY_HIGH_STRONGEST", R.string.lbl_aerobic_endurance_feedback_very_high_strongest),
    VERY_HIGH("VERY_HIGH", R.string.lbl_aerobic_endurance_feedback_very_high),
    HIGH_STRONGEST_LOAD_DEFICIT("HIGH_STRONGEST_LOAD_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_strongest_load_deficit),
    HIGH_STRONGEST_LOAD_DEFICIT_OVER_RECOMMENDED("HIGH_STRONGEST_LOAD_DEFICIT_OVER_RECOMMENDED", R.string.lbl_aerobic_endurance_feedback_high_strongest_load_deficit_over_recommended),
    HIGH_STRONGEST_VO2MAX_DEFICIT("HIGH_STRONGEST_VO2MAX_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_strongest_vo2_max_deficit),
    HIGH_STRONGEST_LONG_RIDES_DURATION_DEFICIT("HIGH_STRONGEST_LONG_RIDES_DURATION_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_strongest_long_ride_duration_deficit),
    HIGH_STRONGEST_120MIN_POWER_DEFICIT("HIGH_STRONGEST_120MIN_POWER_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_strongest_120_min_power_deficit),
    HIGH_STRONGEST_LONG_RIDES_INTENSITY_DEFICIT("HIGH_STRONGEST_LONG_RIDES_INTENSITY_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_strongest_long_rides_intensity_deficit),
    HIGH_LOAD_DEFICIT("HIGH_LOAD_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_load_deficit),
    HIGH_LOAD_DEFICIT_OVER_RECOMMENDED("HIGH_LOAD_DEFICIT_OVER_RECOMMENDED", R.string.lbl_aerobic_endurance_feedback_high_load_deficit_over_recommended),
    HIGH_VO2MAX_DEFICIT("HIGH_VO2MAX_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_vo2_max_deficit),
    HIGH_LONG_RIDES_DURATION_DEFICIT("HIGH_LONG_RIDES_DURATION_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_long_rides_duration_deficit),
    HIGH_120MIN_POWER_DEFICIT("HIGH_120MIN_POWER_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_strongest_120_min_power_deficit),
    HIGH_LONG_RIDES_INTENSITY_DEFICIT("HIGH_LONG_RIDES_INTENSITY_DEFICIT", R.string.lbl_aerobic_endurance_feedback_high_long_rides_intensity_deficit),
    MODERATE_LOAD_DEFICIT("MODERATE_LOAD_DEFICIT", R.string.lbl_aerobic_endurance_feedback_moderate_load_deficit),
    MODERATE_LOAD_DEFICIT_OVER_RECOMMENDED("MODERATE_LOAD_DEFICIT_OVER_RECOMMENDED", R.string.lbl_aerobic_endurance_feedback_moderate_load_deficit_over_recommended),
    MODERATE_VO2MAX_DEFICIT("MODERATE_VO2MAX_DEFICIT", R.string.lbl_aerobic_endurance_feedback_moderate_vo2_max_deficit),
    MODERATE_LONG_RIDES_DURATION_DEFICIT("MODERATE_LONG_RIDES_DURATION_DEFICIT", R.string.lbl_aerobic_endurance_feedback_moderate_long_rides_duration_deficit),
    MODERATE_120MIN_POWER_DEFICIT("MODERATE_120MIN_POWER_DEFICIT", R.string.lbl_aerobic_endurance_feedback_moderate_120_min_power_deficit),
    MODERATE_LONG_RIDES_INTENSITY_DEFICIT("MODERATE_LONG_RIDES_INTENSITY_DEFICIT", R.string.lbl_aerobic_endurance_feedback_moderate_long_rides_intensity_deficit),
    INVALID("INVALID", 0);

    public static final /* synthetic */ w13.c B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f97277c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97300b;

    static {
        B = new w13.c(new b[]{r1, r2, r0, r4, r5, r6, r7, r8, r9, r11, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1});
    }

    private b(String str, int i14) {
        super(str, i);
        this.f97299a = str;
        this.f97300b = i14;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) A.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj61/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

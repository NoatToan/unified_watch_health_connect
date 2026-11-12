package hg1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v24 hg1.k[], still in use, count: 1, list:
  (r0v24 hg1.k[]) from 0x0191: CONSTRUCTOR (r0v24 hg1.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhg1/k;", "", "", Action.KEY_ATTRIBUTE, "", "labelResourceID", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    DATA_FIELD_TIME("TIME", R.string.run_options_timer),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_TOTAL_ASCENT("DISTANCE", R.string.lbl_distance),
    DATA_FIELD_PACE("PACE", R.string.lbl_pace),
    DATA_FIELD_SPEED("SPEED", R.string.lbl_speed),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_CALORIES("CALORIES", R.string.lbl_calories),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_STEPS("STEPS", R.string.lbl_steps),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_TIME_LAP("TIME_LAP", R.string.run_options_time_lap),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_DISTANCE_LAP("DISTANCE_LAP", R.string.run_options_distance_lap),
    DATA_FIELD_PACE_LAP("PACE_LAP", R.string.run_options_pace_lap),
    DATA_FIELD_SPEED_LAP("SPEED_LAP", R.string.run_options_speed_lap),
    DATA_FIELD_PACE_AVG("PACE_AVG", R.string.lbl_avg_pace),
    DATA_FIELD_SPEED_AVG("SPEED_AVG", R.string.lbl_avg_speed),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_HEART_RATE("HEART_RATE", R.string.lbl_heart_rate_cap),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_HEART_RATE_ZONE_NUMBER("HEART_RATE_ZONE_NUMBER", R.string.devices_lbl_heart_rate_zones),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_WORKOUT_SET_REPS("WORKOUT_SET_REPS", R.string.strength_training_reps),
    DATA_FIELD_LAPS("LAPS", R.string.lbl_laps),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_STRESS("CADENCE", R.string.activity_details_cadence),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_RESPIRATION_RATE("ELEVATION", R.string.activity_details_elevation),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_TOTAL_ASCENT("TOTAL_ASCENT", R.string.activity_details_elevation),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_RESPIRATION_RATE("TIME_OF_DAY", R.string.device_settings_time_slash_date),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_STRESS("STRESS", R.string.title_stress),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_FIELD_RESPIRATION_RATE("BREATHING_RATE", R.string.activities_respiration_rate),
    DATA_FIELD_NONE("NONE", R.string.lbl_none),
    DATA_FIELD_INVALID("INVALID", -1);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f83699c = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w13.c f83711o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83713b;

    static {
        f83711o = new w13.c(new k[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r2, r0, r1, r0, r1, r0});
    }

    private k(String str, int i14) {
        super(str, i);
        this.f83712a = str;
        this.f83713b = i14;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f83710n.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhg1/k$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static k a(String str) {
            w13.c cVar = k.f83711o;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                k kVar = (k) bVarN.next();
                if (s.g(kVar.f83712a, str)) {
                    return kVar;
                }
            }
            return k.DATA_FIELD_TIME;
        }

        private a() {
        }
    }
}

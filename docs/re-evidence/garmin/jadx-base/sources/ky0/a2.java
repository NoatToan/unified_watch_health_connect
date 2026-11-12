package ky0;

import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ky0.a2[], still in use, count: 1, list:
  (r0v1 ky0.a2[]) from 0x008c: CONSTRUCTOR (r0v1 ky0.a2[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lky0/a2;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;II)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a2 {
    SLEEP_SCORE(R.string.lbl_sleep_score),
    SLEEP_DURATION(R.string.lbl_sleep_duration),
    VO2_MAX(R.string.lbl_vo2_max),
    TRAINING_READINESS(R.string.training_readiness),
    ACUTE_TRAINING_LOAD(R.string.gcm_training_status_acute_training_load),
    ENDURANCE_SCORE(R.string.lbl_endurance_score),
    RACE_PREDICTOR(R.string.lbl_race_predictor),
    HEAT_ACCLIMATION(R.string.lbl_heat_acclimation),
    ALTITUDE_ACCLIMATION(R.string.lbl_altitude_acclimation),
    CYCLING_ABILITY(R.string.cycling_ability);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f107187m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107188a;

    static {
        f107187m = new w13.c(a2VarArr);
    }

    private a2(int i14) {
        super(str, i);
        this.f107188a = i14;
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) f107186l.clone();
    }
}

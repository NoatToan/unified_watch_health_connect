package in0;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v23 in0.k[], still in use, count: 1, list:
  (r0v23 in0.k[]) from 0x0149: CONSTRUCTOR (r0v23 in0.k[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lin0/k;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {
    /* JADX INFO: Fake field, exist only in values array */
    BLOOD_OXYGEN_BELOW_HEALTHY("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_UNKNOWN"),
    HRV_BELOW_RANGE_HRV_STATUS_POOR("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_BELOW_RANGE_HRV_STATUS_POOR"),
    HRV_IN_RANGE_HRV_STATUS_POOR("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_IN_RANGE_HRV_STATUS_POOR"),
    HRV_ABOVE_RANGE_HRV_STATUS_POOR("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_ABOVE_RANGE_HRV_STATUS_POOR"),
    HRV_BELOW_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_BELOW_RANGE"),
    HRV_IN_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_IN_RANGE"),
    HRV_ABOVE_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_HRV_ABOVE_RANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    SKIN_TEMPERATURE_UNKNOWN("LHA_OFF_YOUR_BASELINE_FEEDBACK_SKIN_TEMPERATURE_UNKNOWN"),
    SKIN_TEMPERATURE_BELOW_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_SKIN_TEMPERATURE_BELOW_RANGE"),
    SKIN_TEMPERATURE_IN_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_SKIN_TEMPERATURE_IN_RANGE"),
    SKIN_TEMPERATURE_ABOVE_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_SKIN_TEMPERATURE_ABOVE_RANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    HEART_RATE_UNKNOWN("LHA_OFF_YOUR_BASELINE_FEEDBACK_HEART_RATE_UNKNOWN"),
    HEART_RATE_BELOW_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_HEART_RATE_BELOW_RANGE"),
    HEART_RATE_IN_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_HEART_RATE_IN_RANGE"),
    HEART_RATE_ABOVE_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_HEART_RATE_ABOVE_RANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOOD_OXYGEN_UNKNOWN("LHA_OFF_YOUR_BASELINE_FEEDBACK_RESPIRATION_RATE_UNKNOWN"),
    RESPIRATION_RATE_BELOW_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_RESPIRATION_RATE_BELOW_RANGE"),
    RESPIRATION_RATE_IN_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_RESPIRATION_RATE_IN_RANGE"),
    RESPIRATION_RATE_ABOVE_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_RESPIRATION_RATE_ABOVE_RANGE"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOOD_OXYGEN_UNKNOWN("LHA_OFF_YOUR_BASELINE_FEEDBACK_BLOOD_OXYGEN_UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOOD_OXYGEN_BELOW_HEALTHY("LHA_OFF_YOUR_BASELINE_FEEDBACK_BLOOD_OXYGEN_BELOW_HEALTHY"),
    BLOOD_OXYGEN_BELOW_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_BLOOD_OXYGEN_BELOW_RANGE"),
    BLOOD_OXYGEN_IN_RANGE("LHA_OFF_YOUR_BASELINE_FEEDBACK_BLOOD_OXYGEN_IN_RANGE");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ w13.c f94495v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94496a;

    static {
        f94495v = new w13.c(kVarArr);
    }

    private k(String str) {
        super(str, i);
        this.f94496a = str;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f94494t.clone();
    }
}

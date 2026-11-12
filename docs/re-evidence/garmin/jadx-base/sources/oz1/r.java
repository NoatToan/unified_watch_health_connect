package oz1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v112 oz1.r[], still in use, count: 1, list:
  (r0v112 oz1.r[]) from 0x06cb: CONSTRUCTOR (r0v112 oz1.r[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loz1/r;", "", "", "text", "<init>", "(Ljava/lang/String;II)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {
    /* JADX INFO: Fake field, exist only in values array */
    POOR_HRV_LOW(R.string.tr_fbl_poor_hrv_low),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_HRV_UNBALANCED(R.string.tr_fbl_poor_hrv_unbalanced),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_HIGH_SS_GOOD_OR_MOD(R.string.tr_fbl_poor_rt_high_ss_good_or_mod),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_HIGH_SS_POOR(R.string.tr_fbl_poor_rt_high_ss_poor),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_HIGH_SS_UNKNOWN(R.string.tr_fbl_poor_rt_high_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_GOOD_ACWR_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_good_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_GOOD_SLEEP_HISTORY_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_good_sleep_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_GOOD_STRESS_HISTORY_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_good_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_GOOD_AWAKE_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_good_awake_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_MOD(R.string.tr_fbl_poor_rt_mod_or_low_ss_mod),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_MOD_ACWR_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_mod_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_MOD_SLEEP_HISTORY_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_mod_sleep_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_MOD_STRESS_HISTORY_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_mod_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_MOD_AWAKE_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_mod_awake_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_POOR(R.string.tr_fbl_poor_rt_mod_low_ss_poor),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_UNKNOWN_ACWR_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_unknown_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_UNKNOWN_SLEEP_HISTORY_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_unknown_sleep_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_MOD_OR_LOW_SS_UNKNOWN_STRESS_HISTORY_NEG(R.string.tr_fbl_poor_rt_mod_or_low_ss_unknown_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_HRV_LOW(R.string.tr_fbl_low_hrv_low),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_HRV_UNBALANCED(R.string.tr_fbl_low_hrv_unbalanced),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_HIGH_SS_GOOD_OR_MOD(R.string.tr_fbl_low_rt_high_ss_good_or_mod),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_HIGH_SS_POOR(R.string.tr_fbl_low_rt_high_ss_poor),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_HIGH_SS_UNKNOWN(R.string.tr_fbl_low_rt_high_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_GOOD(R.string.tr_fbl_low_rt_mod_or_low_ss_good),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_GOOD_ACWR_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_good_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_GOOD_SLEEP_HISTORY_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_good_sleep_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_GOOD_STRESS_HISTORY_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_good_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_GOOD_AWAKE_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_good_awake_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_MOD(R.string.tr_fbl_low_rt_mod_or_low_ss_mod),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_MOD_ACWR_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_mod_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_MOD_SLEEP_HISTORY_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_mod_sleep_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_MOD_STRESS_HISTORY_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_mod_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_MOD_AWAKE_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_mod_awake_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_POOR(R.string.tr_fbl_low_rt_mod_or_low_ss_poor),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_UNKNOWN(R.string.tr_fbl_low_rt_mod_or_low_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_UNKNOWN_ACWR_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_unknown_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_UNKNOWN_SLEEP_HISTORY_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_unknown_sleep_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_MOD_OR_LOW_SS_UNKNOWN_STRESS_HISTORY_NEG(R.string.tr_fbl_low_rt_mod_or_low_ss_unknown_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_HRV_LOW(R.string.tr_fbl_mod_hrv_low),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_HRV_UNBALANCED(R.string.tr_fbl_mod_hrv_unbalanced),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_GOOD(R.string.tr_fbl_mod_rt_high_ss_good),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_MOD(R.string.tr_fbl_mod_rt_high_ss_mod),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_MOD_ACWR_POS(R.string.tr_fbl_mod_rt_high_ss_mod_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_MOD_SLEEP_HISTORY_POS(R.string.tr_fbl_mod_rt_high_ss_mod_sleep_history_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_POOR(R.string.tr_fbl_mod_rt_high_ss_poor),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_UNKNOWN(R.string.tr_fbl_mod_rt_high_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_UNKNOWN_ACWR_POS(R.string.tr_fbl_mod_rt_high_ss_unknown_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_UNKNOWN_SLEEP_HISTORY_POS(R.string.tr_fbl_mod_rt_high_ss_unknown_sleep_history_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_GOOD(R.string.tr_fbl_mod_rt_mod_ss_good_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_GOOD(R.string.tr_fbl_mod_rt_low_ss_good),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_GOOD_ACWR_NEG(R.string.tr_fbl_mod_rt_low_ss_good_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_GOOD_ACWR_NEG(R.string.tr_fbl_mod_rt_mod_ss_good_acwr_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_GOOD_SLEEP_HISTORY_NEG(R.string.tr_fbl_mod_rt_mod_or_low_ss_good_sleep_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_GOOD_STRESS_HISTORY_NEG(R.string.tr_fbl_mod_rt_mod_or_low_ss_good_stress_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_GOOD_AWAKE_NEG(R.string.tr_fbl_mod_rt_mod_or_low_ss_good_awake_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_MOD(R.string.tr_fbl_mod_rt_mod_ss_mod),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_MOD_ACWR_POS(R.string.tr_fbl_mod_rt_mod_ss_mod_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_MOD_SLEEP_HISTORY_POS(R.string.tr_fbl_mod_rt_mod_ss_mod_sleep_history_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_POOR(R.string.tr_fbl_mod_rt_mod_or_low_ss_poor),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_POOR_ACWR_POS(R.string.tr_fbl_mod_rt_mod_or_low_ss_poor_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_POOR_SLEEP_HISTORY_POS(R.string.tr_fbl_mod_rt_mod_or_low_ss_poor_sleep_history_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_MOD(R.string.tr_fbl_mod_rt_low_ss_mod),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_MOD_ACWR_NEG(R.string.tr_fbl_mod_rt_low_ss_mod_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_MOD_SLEEP_HISTORY_NEG(R.string.tr_fbl_mod_rt_low_ss_mod_sleep_history_neg_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_MOD_STRESS_HISTORY_NEG(R.string.tr_fbl_mod_rt_low_ss_mod_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_MOD_AWAKE_NEG(R.string.tr_fbl_mod_rt_low_ss_mod_awake_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_UNKNOWN(R.string.tr_fbl_mod_rt_mod_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_UNKNOWN_ACWR_POS(R.string.tr_fbl_mod_rt_mod_or_low_ss_unknown_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_OR_LOW_SS_UNKNOWN_SLEEP_HISTORY_POS(R.string.tr_fbl_mod_rt_mod_or_low_ss_unknown_sleep_history_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_UNKNOWN(R.string.tr_fbl_mod_rt_low_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_UNKNOWN_ACWR_NEG(R.string.tr_fbl_mod_rt_low_ss_unknown_acwr_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_UNKNOWN_SLEEP_HISTORY_NEG(R.string.tr_fbl_mod_rt_low_ss_unknown_sleep_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_LOW_SS_UNKNOWN_STRESS_HISTORY_NEG(R.string.tr_fbl_mod_rt_low_ss_unknown_stress_history_neg),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_HRV_LOW(R.string.tr_fbl_high_hrv_low),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_HRV_UNBALANCED(R.string.tr_fbl_high_hrv_unbalanced),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_HIGHEST_SS_AVAILABLE(R.string.tr_fbl_high_rt_highest_ss_available),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_HIGHEST_SS_AVAILABLE_ACWR_POS(R.string.tr_fbl_high_rt_highest_ss_available_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_HIGHEST_SS_AVAILABLE_SLEEP_HISTORY_POS(R.string.tr_fbl_high_rt_highest_ss_available_sleep_history_pos),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_AVAILABLE_SS_HIGHEST(R.string.tr_fbl_high_rt_available_ss_highest),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_AVAILABLE_SS_HIGHEST_ACWR_POS(R.string.tr_fbl_high_rt_available_ss_highest_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_AVAILABLE_SS_HIGHEST_SLEEP_HISTORY_POS(R.string.tr_fbl_high_rt_available_ss_highest_sleep_history_pos),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_AVAILABLE_SS_UNKNOWN(R.string.tr_fbl_high_rt_available_ss_unknown),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_AVAILABLE_SS_UNKNOWN_ACWR_POS(R.string.tr_fbl_high_rt_available_ss_unknown_acwr_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RT_AVAILABLE_SS_UNKNOWN_SLEEP_HISTORY_POS(R.string.tr_fbl_high_rt_available_ss_unknown_sleep_history_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_RT_HIGHEST_SS_AVAILABLE(R.string.tr_fbl_prime_rt_highest_ss_available),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_RT_HIGHEST_SS_AVAILABLE_ACWR_POS(R.string.tr_fbl_prime_rt_highest_ss_available_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_RT_HIGHEST_SS_AVAILABLE_SLEEP_HISTORY_POS(R.string.tr_fbl_prime_rt_highest_ss_available_sleep_history_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_SS_HIGHEST_SS_AVAILABLE(R.string.tr_fbl_prime_ss_highest_ss_available),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_SS_HIGHEST_SS_AVAILABLE_ACWR_POS(R.string.tr_fbl_prime_ss_highest_ss_available_acwr_pos),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_SS_HIGHEST_SS_AVAILABLE_SLEEP_HISTORY_POS(R.string.tr_fbl_prime_ss_highest_ss_available_sleep_history_pos_v2),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_HIGH_SS_GOOD_WORKOUT_COMPLETED(R.string.tr_fbl_mod_rt_high_ss_good_workout_completed),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_RT_MOD_SS_GOOD_WORKOUT_COMPLETED(R.string.tr_fbl_mod_rt_mod_ss_good_workout_completed),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_EVENT_DATE(R.string.tr_fbl_poor_event_date),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_EVENT_DATE(R.string.tr_fbl_low_event_date),
    /* JADX INFO: Fake field, exist only in values array */
    MOD_EVENT_DATE(R.string.tr_fbl_mod_event_date),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_EVENT_DATE(R.string.tr_fbl_high_event_date),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_EVENT_DATE(R.string.tr_fbl_prime_event_date),
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_DATE_COMPLETED(R.string.tr_fbl_event_date_completed),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_SS_POOR_JET_LAG(R.string.tr_fbl_poor_ss_poor_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_RT_HIGH_JET_LAG(R.string.tr_fbl_poor_rt_high_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_JET_LAG(R.string.tr_fbl_poor_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_SS_POOR_JET_LAG(R.string.tr_fbl_low_ss_poor_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RT_HIGH_JET_LAG(R.string.tr_fbl_low_rt_high_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_JET_LAG(R.string.tr_fbl_low_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_NAP(R.string.tr_fbl_poor_low_nap),
    /* JADX INFO: Fake field, exist only in values array */
    POOR_NAP_SHORT(R.string.tr_fbl_poor_low_nap_short),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_NAP(R.string.tr_fbl_poor_low_nap),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_NAP_SHORT(R.string.tr_fbl_poor_low_nap_short),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE_NAP(R.string.tr_fbl_moderate_nap),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE_NAP_SHORT(R.string.tr_fbl_moderate_nap_short),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_NAP(R.string.tr_fbl_high_prime_nap),
    /* JADX INFO: Fake field, exist only in values array */
    PRIME_NAP(R.string.tr_fbl_high_prime_nap);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w13.c f134610c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f134611a;

    static {
        f134610c = new w13.c(rVarArr);
    }

    private r(int i14) {
        super(str, i);
        this.f134611a = i14;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f134609b.clone();
    }
}

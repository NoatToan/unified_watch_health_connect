package oz1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 oz1.s[], still in use, count: 1, list:
  (r0v1 oz1.s[]) from 0x0352: CONSTRUCTOR (r0v1 oz1.s[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Loz1/s;", "", "", Action.KEY_ATTRIBUTE, "", "realTimeDataId", "text", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS_ON_RECOVERY("FOCUS_ON_RECOVERY", 1, R.string.tr_fbs_focus_on_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_SLOW_DOWN("TIME_TO_SLOW_DOWN", 2, R.string.tr_fbs_time_to_slow_down),
    /* JADX INFO: Fake field, exist only in values array */
    LET_YOUR_BODY_RECOVER("LET_YOUR_BODY_RECOVER", 3, R.string.tr_fbs_let_your_body_recover),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_RECHARGE("TIME_TO_RECHARGE", 4, R.string.tr_fbs_time_to_recharge),
    /* JADX INFO: Fake field, exist only in values array */
    TAKE_IT_EASY("TAKE_IT_EASY", 5, R.string.tr_fbs_take_it_easy),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS_ON_SLEEP_PATTERNS("FOCUS_ON_SLEEP_PATTERNS", 6, R.string.tr_fbs_focus_on_sleep_patterns),
    /* JADX INFO: Fake field, exist only in values array */
    LISTEN_TO_YOUR_BODY("LISTEN_TO_YOUR_BODY", 7, R.string.tr_fbs_listen_to_your_body),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_RECOVERY_NEEDS("HIGH_RECOVERY_NEEDS", 8, R.string.tr_fbs_high_recovery_needs),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVERY_IN_PROGRESS("RECOVERY_IN_PROGRESS", 9, R.string.tr_fbs_recovery_in_progress),
    /* JADX INFO: Fake field, exist only in values array */
    BALANCE_YOUR_TRAINING_LOAD("BALANCE_YOUR_TRAINING_LOAD", 10, R.string.tr_fbs_balance_your_training_load),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS_ON_ENERGY_LEVELS("FOCUS_ON_ENERGY_LEVELS", 11, R.string.tr_fbs_focus_on_energy_levels),
    /* JADX INFO: Fake field, exist only in values array */
    FIND_TIME_TO_RELAX("FIND_TIME_TO_RELAX", 12, R.string.tr_fbs_find_time_to_relax),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS_ON_SLEEP_QUALITY("FOCUS_ON_SLEEP_QUALITY", 13, R.string.tr_fbs_focus_on_sleep_quality),
    /* JADX INFO: Fake field, exist only in values array */
    WORKING_HARD("WORKING_HARD", 14, R.string.tr_fbs_working_hard),
    /* JADX INFO: Fake field, exist only in values array */
    TAKE_ON_THE_DAY("TAKE_ON_THE_DAY", 15, R.string.tr_fbs_take_on_the_day),
    /* JADX INFO: Fake field, exist only in values array */
    BOOSTED_BY_LIGHTER_TRAINING("BOOSTED_BY_GOOD_SLEEP", 16, R.string.tr_fbs_boosted_by_good_sleep),
    /* JADX INFO: Fake field, exist only in values array */
    BOOSTED_BY_LIGHTER_TRAINING("BOOSTED_BY_LIGHTER_TRAINING", 17, R.string.tr_fbs_boosted_by_lighter_training),
    /* JADX INFO: Fake field, exist only in values array */
    GOOD_SLEEP_HISTORY("GOOD_SLEEP_HISTORY", 18, R.string.tr_fbs_you_got_this),
    /* JADX INFO: Fake field, exist only in values array */
    FIND_TIME_TO_RECHARGE("FIND_TIME_TO_RECHARGE", 19, R.string.tr_fbs_find_time_to_recharge),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVERED_AND_READY("RECOVERED_AND_READY", 20, R.string.tr_fbs_recovered_and_ready),
    /* JADX INFO: Fake field, exist only in values array */
    WELL_RESTED("WELL_RESTED", 21, R.string.tr_fbs_well_rested),
    /* JADX INFO: Fake field, exist only in values array */
    GOOD_SLEEP_LAST_NIGHT("GOOD_SLEEP_LAST_NIGHT", 22, R.string.tr_fbs_good_sleep_last_night),
    /* JADX INFO: Fake field, exist only in values array */
    READY_FOR_THE_DAY("READY_FOR_THE_DAY", 23, R.string.tr_fbs_ready_for_the_day),
    /* JADX INFO: Fake field, exist only in values array */
    BALANCE_STRESS_AND_RECOVERY("BALANCE_STRESS_AND_RECOVERY", 24, R.string.tr_fbs_balance_stress_and_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    WELL_RECOVERED("WELL_RECOVERED", 25, R.string.tr_fbs_well_recovered),
    /* JADX INFO: Fake field, exist only in values array */
    EXCELLENT_RECOVERY("EXCELLENT_RECOVERY", 26, R.string.tr_fbs_excellent_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    WELL_RESTED_AND_RECOVERED("WELL_RESTED_AND_RECOVERED", 27, R.string.tr_fbs_well_rested_and_recovered),
    /* JADX INFO: Fake field, exist only in values array */
    RESTED_AND_READY("RESTED_AND_READY", 28, R.string.tr_fbs_rested_and_ready),
    /* JADX INFO: Fake field, exist only in values array */
    ENERGIZED_BY_GOOD_SLEEP("ENERGIZED_BY_GOOD_SLEEP", 29, R.string.tr_fbs_energized_by_good_sleep),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_RECOVERY_NEEDS("LOW_RECOVERY_NEEDS", 30, R.string.tr_fbs_low_recovery_needs),
    /* JADX INFO: Fake field, exist only in values array */
    GOOD_RECOVERY("GOOD_RECOVERY", 31, R.string.tr_fbs_good_recovery),
    /* JADX INFO: Fake field, exist only in values array */
    READY_FOR_ACTION("PRIMED_FOR_PERFORMANCE", 32, R.string.tr_fbs_primed_for_performance),
    /* JADX INFO: Fake field, exist only in values array */
    READY_FOR_ACTION("READY_FOR_ACTION", 33, R.string.tr_fbs_ready_for_action),
    /* JADX INFO: Fake field, exist only in values array */
    READY_TO_GO("READY_TO_GO", 34, R.string.tr_fbs_ready_to_go),
    /* JADX INFO: Fake field, exist only in values array */
    PRIMED_AND_READY("PRIMED_AND_READY", 35, R.string.tr_fbs_primed_and_ready),
    /* JADX INFO: Fake field, exist only in values array */
    AT_YOUR_BEST("AT_YOUR_BEST", 36, R.string.tr_fbs_at_your_best),
    /* JADX INFO: Fake field, exist only in values array */
    STAY_STRONG("STAY_STRONG", 37, R.string.tr_fbs_stay_strong),
    /* JADX INFO: Fake field, exist only in values array */
    BELIEVE_IN_YOURSELF("BELIEVE_IN_YOURSELF", 38, R.string.tr_fbs_believe_in_yourself),
    /* JADX INFO: Fake field, exist only in values array */
    REACH_FOR_YOUR_GOALS("REACH_FOR_YOUR_GOALS", 39, R.string.tr_fbs_reach_for_your_goals),
    /* JADX INFO: Fake field, exist only in values array */
    GO_GET_IT("GO_GET_IT", 40, R.string.tr_fbs_go_get_it),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_TO_SHINE("TIME_TO_SHINE", 41, R.string.tr_fbs_time_to_shine),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVER_FROM_JET_LAG("RECOVER_FROM_JET_LAG", 42, R.string.tr_fbs_recover_from_jet_lag),
    /* JADX INFO: Fake field, exist only in values array */
    RELAX_WHILE_TRAVELING("RELAX_WHILE_TRAVELING", 43, R.string.tr_fbs_relax_while_traveling),
    /* JADX INFO: Fake field, exist only in values array */
    IMPROVED_BY_NAPPING("IMPROVED_BY_NAPPING", 44, R.string.tr_fbs_poor_low_nap),
    /* JADX INFO: Fake field, exist only in values array */
    BOOSTED_BY_NAPPING("BOOSTED_BY_NAPPING", 45, R.string.tr_fbs_moderate_nap),
    /* JADX INFO: Fake field, exist only in values array */
    ENERGIZING_NAP("ENERGIZING_NAP", 46, R.string.tr_fbs_high_prime_nap),
    /* JADX INFO: Fake field, exist only in values array */
    WELL_DONE("WELL_DONE", 47, R.string.lbl_well_done),
    DO_NOT_EXERCISE("DO_NOT_EXERCISE", -1, R.string.post_dive_do_not_exercise_short);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f134612d = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f134615g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f134617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f134618c;

    static {
        f134615g = new w13.c(new s[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48});
    }

    private s(String str, int i14, int i15) {
        super(str, i);
        this.f134616a = str;
        this.f134617b = i14;
        this.f134618c = i15;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f134614f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loz1/s$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static s a(String str) {
            Object next;
            w13.c cVar = s.f134615g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((s) next).f134616a, str)) {
                    return (s) next;
                }
            }
            next = null;
            return (s) next;
        }

        public static s b(Integer num) {
            Object next;
            w13.c cVar = s.f134615g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                int i14 = ((s) next).f134617b;
                if (num != null && i14 == num.intValue()) {
                    return (s) next;
                }
            }
            next = null;
            return (s) next;
        }

        private a() {
        }
    }
}

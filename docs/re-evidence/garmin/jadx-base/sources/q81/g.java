package q81;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lq81/g;", "", "", Action.KEY_ATTRIBUTE, "stringResource", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING(1, R.string.lbl_hill_score_one_day_empty_state_message_v2),
    /* JADX INFO: Fake field, exist only in values array */
    NO_VO2MAX(2, R.string.lbl_hill_score_feedback_no_vo2_max_v2),
    RECREATIONAL_TO_CHALLENGER(3, R.string.lbl_hill_score_feedback_recreational_to_challenger),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_GOOD_VO2(4, R.string.lbl_hill_score_feedback_recreational_good_vo2_v2),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_GOOD_VO2_2(42, R.string.lbl_hill_score_feedback_trained_low_endurance_3),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_GOOD_VO2_3(43, R.string.lbl_hill_score_feedback_trained_good_endurance_1),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_GOOD_VO2_4(44, R.string.lbl_hill_score_feedback_trained_moderate_endurance_1),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_INSUFFICIENT_VO2(5, R.string.lbl_hill_score_feedback_recreational_insufficient_vo2_v2),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_INSUFFICIENT_VO2_2(45, R.string.lbl_hill_score_feedback_trained_low_endurance_1),
    /* JADX INFO: Fake field, exist only in values array */
    RECREATIONAL_INSUFFICIENT_VO2_3(46, R.string.lbl_hill_score_feedback_trained_low_endurance_4_v2),
    /* JADX INFO: Fake field, exist only in values array */
    CHALLENGER_TO_TRAINED(6, R.string.lbl_hill_score_feedback_challenger_to_trained),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_LOW_ENDURANCE_1(7, R.string.lbl_hill_score_feedback_trained_low_endurance_1),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_LOW_ENDURANCE_2(8, R.string.lbl_hill_score_feedback_trained_low_endurance_2),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_LOW_ENDURANCE_3(9, R.string.lbl_hill_score_feedback_trained_low_endurance_3),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_LOW_ENDURANCE_4(10, R.string.lbl_hill_score_feedback_trained_low_endurance_4_v2),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_MODERATE_ENDURANCE_1(11, R.string.lbl_hill_score_feedback_trained_moderate_endurance_1),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_MODERATE_ENDURANCE_2(12, R.string.lbl_hill_score_feedback_trained_moderate_endurance_2),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_MODERATE_ENDURANCE_3(13, R.string.lbl_hill_score_feedback_trained_moderate_endurance_3),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_GOOD_ENDURANCE_1(14, R.string.lbl_hill_score_feedback_trained_good_endurance_1),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_GOOD_ENDURANCE_2(15, R.string.lbl_hill_score_feedback_trained_good_endurance_2),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_GOOD_ENDURANCE_3(16, R.string.lbl_hill_score_feedback_trained_good_endurance_3_v2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_TO_EXPERT(17, R.string.lbl_hill_score_feedback_skilled_to_expert),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINED_TO_SKILLED(18, R.string.lbl_hill_score_feedback_trained_to_skilled),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_INCREASING_1(19, R.string.lbl_hill_score_feedback_skilled_balanced_increasing_1),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_INCREASING_2(20, R.string.lbl_hill_score_feedback_skilled_balanced_increasing_2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_STEADY_DECREASE_1(21, R.string.lbl_hill_score_feedback_skilled_balanced_steady_decreasing_1_v2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_STEADY_DECREASE_2(22, R.string.lbl_hill_score_feedback_skilled_balanced_steady_decreasing_2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_STEADY_DECREASE_3(23, R.string.lbl_hill_score_feedback_skilled_balanced_steady_decreasing_3),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_STEADY_DECREASE_4(40, R.string.lbl_hill_score_feedback_skilled_balanced_steady_decreasing_4),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_BALANCED_STEADY_DECREASE_5(41, R.string.lbl_hill_score_feedback_skilled_balanced_steady_decreasing_5),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_ENDURANCE_INCREASING_1(24, R.string.lbl_hill_score_feedback_skilled_weaker_endurance_increasing_1),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_ENDURANCE_INCREASING_2(25, R.string.lbl_hill_score_feedback_skilled_weaker_endurance_increasing_2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_ENDURANCE_STEADY_DECREASE_1(26, R.string.lbl_hill_score_feedback_skilled_weaker_endurance_steady_decreasing_1),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_ENDURANCE_STEADY_DECREASE_2(27, R.string.lbl_hill_score_feedback_skilled_weaker_endurance_steady_decreasing_2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_ENDURANCE_STEADY_DECREASE_3(28, R.string.lbl_hill_score_feedback_skilled_weaker_endurance_steady_decreasing_3),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_INCREASING_1(29, R.string.lbl_hill_score_feedback_skilled_weaker_strength_increasing_1),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_INCREASING_2(30, R.string.lbl_hill_score_feedback_skilled_weaker_strength_increasing_2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_STEADY_DECREASE_1(31, R.string.lbl_hill_score_feedback_skilled_weaker_strength_steady_decrease_1),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_STEADY_DECREASE_2(32, R.string.lbl_hill_score_feedback_skilled_weaker_strength_steady_decrease_2),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_STEADY_DECREASE_3(33, R.string.lbl_hill_score_feedback_skilled_weaker_strength_steady_decrease_3),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_STEADY_DECREASE_4(34, R.string.lbl_hill_score_feedback_skilled_weaker_strength_steady_decrease_4),
    /* JADX INFO: Fake field, exist only in values array */
    SKILLED_WEAKER_STRENGTH_STEADY_DECREASE_5(35, R.string.lbl_hill_score_feedback_skilled_weaker_strength_steady_decrease_5),
    /* JADX INFO: Fake field, exist only in values array */
    EXPERT_TO_ELITE(36, R.string.lbl_hill_score_feedback_expert_to_elite),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_INCREASING(37, R.string.lbl_hill_score_feedback_elite_increasing),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_STEADY_DECREASING_1(38, R.string.lbl_hill_score_feedback_elite_steady_decreasing_1),
    /* JADX INFO: Fake field, exist only in values array */
    ELITE_STEADY_DECREASING_2(39, R.string.lbl_hill_score_feedback_elite_steady_decreasing_2);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f143317c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143321b;

    g(int i14, int i15) {
        this.f143320a = i14;
        this.f143321b = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq81/g$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

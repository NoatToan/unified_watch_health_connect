package a81;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"La81/c;", "", "", Action.KEY_ATTRIBUTE, "stringResource", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    EARLY_ONBOARDING_NO_VO2MAX(1, R.string.lbl_endurance_score_feedback_early_onboarding),
    /* JADX INFO: Fake field, exist only in values array */
    EARLY_ONBOARDING_WITH_VO2MAX(2, R.string.lbl_endurance_score_feedback_early_onboarding),
    EARLY_ONBOARDING_FIRST_OUTPUT(3, R.string.lbl_endurance_score_feedback_early_onboarding_first_output),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_NO_VO2MAX_LOW_VOLUME(4, R.string.lbl_endurance_score_feedback_onboarding_no_vo2max_low_or_high_volume),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_NO_VO2MAX_HIGH_VOLUME(5, R.string.lbl_endurance_score_feedback_onboarding_no_vo2max_low_or_high_volume),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_POOR_FITNESS_LOW_VOLUME(6, R.string.lbl_endurance_score_feedback_onboarding_poor_fitness_low_volume),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_POOR_FITNESS_HIGH_VOLUME(7, R.string.lbl_endurance_score_feedback_onboarding_poor_fitness_high_volume),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_FAIR_FITNESS_LOW_VOLUME(8, R.string.lbl_endurance_score_feedback_onboarding_fair_fitness_low_volume),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_FAIR_FITNESS_HIGH_VOLUME(9, R.string.lbl_endurance_score_feedback_onboarding_fair_fitness_high_volume),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_GOOD_FITNESS_LOW_VOLUME(10, R.string.lbl_endurance_score_feedback_onboarding_good_fitness_low_volume_v2),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_GOOD_FITNESS_HIGH_VOLUME(11, R.string.lbl_endurance_score_feedback_onboarding_good_fitness_high_volume_v2),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_EXCELLENT_FITNESS_LOW_VOLUME(12, R.string.lbl_endurance_score_feedback_onboarding_excellent_fitness_low_volume_v2),
    /* JADX INFO: Fake field, exist only in values array */
    ONBOARDING_EXCELLENT_FITNESS_HIGH_VOLUME(13, R.string.lbl_endurance_score_feedback_onboarding_excellent_fitness_high_volume_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_VO2MAX(14, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_LTWV(15, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_ltwv_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_STWV(16, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_stwv_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_LTWTL(17, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_ltwtl_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_STWTL(18, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_5L(19, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_5l_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_TLF(20, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_tlf_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_GOOD_FITNESS_RTP(21, R.string.lbl_endurance_score_feedback_decreasing_fair_class_good_fitness_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_VO2MAX(22, R.string.lbl_endurance_score_feedback_decreasing_fair_class_vo2max),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_LTWV(23, R.string.lbl_endurance_score_feedback_decreasing_fair_class_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_STWV(24, R.string.lbl_endurance_score_feedback_decreasing_fair_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_LTWTL(25, R.string.lbl_endurance_score_feedback_decreasing_fair_class_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_STWTL(26, R.string.lbl_endurance_score_feedback_decreasing_fair_class_stwtl),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_5L(27, R.string.lbl_endurance_score_feedback_decreasing_fair_class_5l),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_TLF(28, R.string.lbl_endurance_score_feedback_decreasing_fair_class_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_FAIR_CLASS_RTP(29, R.string.lbl_endurance_score_feedback_decreasing_fair_class_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    STEADY_FAIR_CLASS(30, R.string.lbl_endurance_score_feedback_steady_fair_class),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_VO2MAX(31, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_LTWV(32, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_STWV(33, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_LTWTL(34, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_STWTL(35, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_5L(36, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_5l),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNES_TLF(37, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_GOOD_FITNESS_RTP(38, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_VO2MAX(39, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_LTWV(40, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_STWV(41, R.string.lbl_endurance_score_feedback_increasing_fair_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_LTWTL(42, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_STWTL(43, R.string.lbl_endurance_score_feedback_increasing_fair_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_5L(44, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_5l),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_TLF(45, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_FAIR_CLASS_RTP(46, R.string.lbl_endurance_score_feedback_increasing_fair_class_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_VO2MAX(47, R.string.lbl_endurance_score_feedback_decreasing_good_class_vo2max),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_LTWV(48, R.string.lbl_endurance_score_feedback_decreasing_good_class_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_STWV(49, R.string.lbl_endurance_score_feedback_decreasing_good_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_LTWTL(50, R.string.lbl_endurance_score_feedback_decreasing_good_class_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_STWTL(51, R.string.lbl_endurance_score_feedback_decreasing_good_class_stwtl),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_5L(52, R.string.lbl_endurance_score_feedback_decreasing_good_class_5l),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_TLF(53, R.string.lbl_endurance_score_feedback_decreasing_good_class_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_GOOD_CLASS_RTP(54, R.string.lbl_endurance_score_feedback_decreasing_fair_class_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    STEADY_GOOD_CLASS(55, R.string.lbl_endurance_score_feedback_steady_good_class),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_VO2MAX(56, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_LTWV(57, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_STWV(58, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_LTWTL(59, R.string.lbl_endurance_score_feedback_increasing_good_class_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_STWTL(60, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_5L(61, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_5l),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_TLF(62, R.string.lbl_endurance_score_feedback_increasing_fair_class_good_fitness_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_GOOD_CLASS_RTP(63, R.string.lbl_endurance_score_feedback_increasing_fair_class_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_VO2MAX(64, R.string.lbl_endurance_score_feedback_decreasing_superior_class_vo2max),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_LTWV(65, R.string.lbl_endurance_score_feedback_decreasing_superior_class_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_STWV(66, R.string.lbl_endurance_score_feedback_decreasing_superior_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_LTWTL(67, R.string.lbl_endurance_score_feedback_decreasing_superior_class_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_STWTL(68, R.string.lbl_endurance_score_feedback_decreasing_superior_class_stwtl),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_5L(69, R.string.lbl_endurance_score_feedback_decreasing_superior_class_5l),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_TLF(70, R.string.lbl_endurance_score_feedback_decreasing_superior_class_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_SUPERIOR_CLASS_RTP(71, R.string.lbl_endurance_score_feedback_decreasing_superior_class_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    STEADY_SUPERIOR_CLASS(72, R.string.lbl_endurance_score_feedback_steady_superior_class),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_VO2MAX(73, R.string.lbl_endurance_score_feedback_increasing_superior_class_vo2max_v2),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_LTWV(74, R.string.lbl_endurance_score_feedback_increasing_superior_class_ltwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_STWV(75, R.string.lbl_endurance_score_feedback_increasing_superior_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_LTWTL(76, R.string.lbl_endurance_score_feedback_increasing_superior_class_ltwtl),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_STWTL(77, R.string.lbl_endurance_score_feedback_increasing_superior_class_stwv),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_5L(78, R.string.lbl_endurance_score_feedback_increasing_superior_class_5l),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_TLF(79, R.string.lbl_endurance_score_feedback_increasing_superior_class_tlf),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_SUPERIOR_CLASS_RTP(80, R.string.lbl_endurance_score_feedback_increasing_superior_class_rtp),
    /* JADX INFO: Fake field, exist only in values array */
    NO_TRAINING_HISTORY_CONTRIBUTION(81, R.string.lbl_endurance_score_feedback_no_training_history_contribution),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_INTERMEDIATE_CLASS(82, R.string.lbl_endurance_score_feedback_decreasing_intermediate_class),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_INTERMEDIATE_CLASS(83, R.string.lbl_endurance_score_feedback_increasing_intermediate_class),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_WELL_TRAINED_CLASS(84, R.string.lbl_endurance_score_feedback_decreasing_well_trained_class),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_WELL_TRAINED_CLASS(85, R.string.lbl_endurance_score_feedback_increasing_well_trained_class),
    /* JADX INFO: Fake field, exist only in values array */
    DECREASING_ELITE_CLASS(86, R.string.lbl_endurance_score_feedback_decreasing_elite_class),
    /* JADX INFO: Fake field, exist only in values array */
    INCREASING_ELITE_CLASS(87, R.string.lbl_endurance_score_feedback_increasing_elite_class);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1953c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1957b;

    c(int i14, int i15) {
        this.f1956a = i14;
        this.f1957b = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La81/c$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

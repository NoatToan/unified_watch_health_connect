package km1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkm1/e0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isPerformance", "<init>", "(Landroid/content/Context;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f105510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b10.c f105512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f105513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f105514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f105515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f105516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<String> f105517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f105518i;

    public e0(Context context, boolean z14) {
        context.getClass();
        this.f105510a = context;
        this.f105511b = z14;
        this.f105512c = new b10.c(new l22.a(context));
        this.f105513d = p13.x.k("HIGHLY_INCREASED", "LHA_SLEEP_NEED_FEEDBACK_HIGHLY_INCREASED");
        this.f105514e = p13.x.k("INCREASED", "LHA_SLEEP_NEED_FEEDBACK_INCREASED");
        this.f105515f = p13.x.k("NO_CHANGE_NO_ADJUSTMENTS", "LHA_SLEEP_NEED_FEEDBACK_NO_CHANGE_NO_ADJUSTMENTS");
        this.f105516g = p13.x.k("NO_CHANGE_BALANCED", "LHA_SLEEP_NEED_FEEDBACK_NO_CHANGE_BALANCED");
        this.f105517h = p13.x.k("DECREASED", "LHA_SLEEP_NEED_FEEDBACK_DECREASED");
        this.f105518i = p13.x.k("NONE", "LHA_SLEEP_NEED_FEEDBACK_NONE");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public final String a(String str) {
        int i14;
        if (str == null) {
            return null;
        }
        if (t.HIGHLY_INCREASED.f105583a.contains(str)) {
            i14 = R.string.lbl_sleep_need_feedback_highly_increased_today;
        } else if (t.INCREASED.f105583a.contains(str)) {
            i14 = R.string.lbl_sleep_need_feedback_increased_today;
        } else if (t.NO_CHANGE_NO_ADJUSTMENTS.f105583a.contains(str) || t.NO_CHANGE_BALANCED.f105583a.contains(str)) {
            i14 = R.string.lbl_sleep_need_feedback_no_change_today;
        } else if (t.DECREASED.f105583a.contains(str)) {
            i14 = R.string.lbl_sleep_need_feedback_decrease_today;
        } else if (t.NONE.f105583a.contains(str)) {
            i14 = R.string.lbl_sleep_need_feedback_no_change_today;
        } else {
            i14 = -1;
        }
        if (i14 != -1) {
            return this.f105510a.getString(i14);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x024b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x029f  */
    /* JADX WARN: Code duplicated, block: B:16:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:175:0x0352  */
    /* JADX WARN: Code duplicated, block: B:20:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:248:0x0489  */
    /* JADX WARN: Code duplicated, block: B:259:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:336:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:371:0x0694  */
    /* JADX WARN: Code duplicated, block: B:40:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01af  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String b(String str) {
        Integer numValueOf = Integer.valueOf(R.string.msg_your_training_yesterday_promoted_good_141);
        Integer numValueOf2 = Integer.valueOf(R.string.msg_your_training_later_in_the_129);
        Integer numValueOf3 = Integer.valueOf(R.string.msg_your_poor_sleep_may_be_149);
        if (str != null) {
            g.f105523a.getClass();
            if (g.a(str)) {
                return str;
            }
            if (!this.f105511b) {
                return c(str);
            }
            Integer numValueOf4 = Integer.valueOf(R.string.msg_your_restless_sleep_could_be_163);
            Integer numValueOf5 = Integer.valueOf(R.string.msg_increased_restlessness_is_normal_during_87);
            Integer numValueOf6 = Integer.valueOf(R.string.msg_your_training_done_late_yesterday_151);
            Integer numValueOf7 = Integer.valueOf(R.string.msg_during_pregnancy_its_normal_to_132);
            Integer numValueOf8 = Integer.valueOf(R.string.msg_its_normal_to_see_deep_112);
            Integer numValueOf9 = Integer.valueOf(R.string.msg_on_the_night_before_a_130);
            Integer numValueOf10 = Integer.valueOf(R.string.msg_you_had_a_lot_of_133);
            Integer numValueOf11 = Integer.valueOf(R.string.msg_sleep_like_this_may_be_145);
            Integer numValueOf12 = Integer.valueOf(R.string.msg_youll_be_unstoppable_in_todays_40);
            Integer numValueOf13 = Integer.valueOf(R.string.msg_throughout_pregnancy_sleep_like_this_90);
            Integer numValueOf14 = Integer.valueOf(R.string.msg_sleep_like_this_will_help_97);
            Integer numValueOf15 = Integer.valueOf(R.string.msg_during_pregnancy_its_normal_to_95);
            Integer numValueOf16 = Integer.valueOf(R.string.msg_your_very_stressful_day_yesterday_111);
            Integer numValueOf17 = Integer.valueOf(R.string.msg_after_an_event_like_yesterdays_129);
            Integer numValueOf18 = Integer.valueOf(R.string.msg_your_sleep_may_have_been_163);
            switch (str.hashCode()) {
                case -2123003026:
                    if (!str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_MODERATE_DURING_DAY")) {
                        numValueOf = null;
                    }
                    break;
                case -2063809082:
                    numValueOf = !str.equals("ALTITUDE_NEG_POOR_SLEEP") ? null : Integer.valueOf(R.string.msg_your_sleep_may_have_been_128);
                    break;
                case -1997240889:
                    numValueOf = !str.equals("NAPPING_NEG_POOR_SLEEP_UNBALANCED") ? null : Integer.valueOf(R.string.msg_long_naps_and_naps_late_108);
                    break;
                case -1981236665:
                    if (!str.equals("STRESS_NEG_POOR_SLEEP_STRESSFUL_EVENING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf10;
                    }
                    break;
                case -1974796121:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_your_non_restorative_sleep_may_118);
                    break;
                case -1964530582:
                    numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_STRESSFUL_DAY") ? null : Integer.valueOf(R.string.msg_even_though_you_had_a_69);
                    break;
                case -1934624365:
                    numValueOf = !str.equals("JET_LAG_POS_GOOD_SLEEP") ? null : Integer.valueOf(R.string.msg_your_body_is_acclimating_well_64);
                    break;
                case -1931259724:
                    if (!str.equals("AFTER_EVENT_DAY_NEG_POOR_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf17;
                    }
                    break;
                case -1929095011:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_nice_work_getting_outdoor_training_148);
                    break;
                case -1923215184:
                    numValueOf = !str.equals("AFTER_EVENT_DAY_POS_FAIR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_after_an_event_like_yesterday_138);
                    break;
                case -1919079714:
                    numValueOf = !str.equals("PREGNANCY_POSTP_POS_GOOD_OR_WORSE_SLEEP_HIGH_REM") ? null : Integer.valueOf(R.string.msg_this_is_a_great_sign_103);
                    break;
                case -1901250701:
                    numValueOf = !str.equals("EVENT_DAY_POS_FAIR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_even_though_you_didnt_sleep_95);
                    break;
                case -1886786549:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_MODERATE_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_your_training_yesterday_was_great_164);
                    break;
                case -1838082486:
                    if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf18;
                    }
                    break;
                case -1832365232:
                    numValueOf = !str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_sleep_like_this_may_be_138);
                    break;
                case -1815175066:
                    numValueOf = !str.equals("EVENT_DAY_POS_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_you_slept_long_enough_to_60);
                    break;
                case -1794271159:
                    numValueOf = !str.equals("AFTER_EVENT_DAY_POS_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_after_an_event_like_yesterday_152);
                    break;
                case -1764784360:
                    numValueOf = !str.equals("RHYTHM_NEG_FAIR_SLEEP_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_may_have_150);
                    break;
                case -1760359525:
                    if (!str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_VIGOROUS_DURING_DAY")) {
                        numValueOf = null;
                    }
                    break;
                case -1744510737:
                    if (!str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf3;
                    }
                    break;
                case -1715277096:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_your_poor_restoration_may_have_155);
                    break;
                case -1712426260:
                    if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf16;
                    }
                    break;
                case -1692097007:
                    numValueOf = !str.equals("JET_LAG_POS_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_sleep_like_this_will_help_102);
                    break;
                case -1613530087:
                    numValueOf = !str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_DEEP") ? null : Integer.valueOf(R.string.msg_its_normal_for_your_amount_118);
                    break;
                case -1598995953:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_ACTIVE_DAY") ? null : Integer.valueOf(R.string.msg_you_were_very_physically_active_96);
                    break;
                case -1564584645:
                    numValueOf = !str.equals("EVENT_DAY_POS_EXCELLENT_SLEEP") ? null : Integer.valueOf(R.string.msg_for_todays_event_youre_ready_53);
                    break;
                case -1548876549:
                    if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_VIGOROUS_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf2;
                    }
                    break;
                case -1538443228:
                    numValueOf = !str.equals("STRESS_POS_FAIR_OR_POOR_SLEEP_RESTFUL_EVENING") ? null : Integer.valueOf(R.string.msg_you_had_a_relaxing_period_103);
                    break;
                case -1482708447:
                    if (!str.equals("NAPPING_NEG_GOOD_SLEEP_GOOD_DURATION_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -1458459965:
                    numValueOf = !str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_EXCELLENT_TIMING") ? null : Integer.valueOf(R.string.msg_the_timing_of_your_sleep_158);
                    break;
                case -1456548548:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_114);
                    break;
                case -1393753093:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_hard_training_yesterday_promoted_95);
                    break;
                case -1352916767:
                    numValueOf = !str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_sleep_like_this_may_be_99);
                    break;
                case -1185500755:
                    numValueOf = !str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS") ? null : Integer.valueOf(R.string.msg_in_your_third_trimester_sleep_147);
                    break;
                case -1180365074:
                    numValueOf = !str.equals("NAPPING_NEG_GOOD_SLEEP_GOOD_DURATION_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_your_interrupted_sleep_could_be_163);
                    break;
                case -1132969377:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_your_training_yesterday_helped_your_149);
                    break;
                case -1070080545:
                    numValueOf = !str.equals("MOD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_INACTIVITY") ? null : Integer.valueOf(R.string.msg_your_sleep_may_have_suffered_114);
                    break;
                case -1061366425:
                    numValueOf = !str.equals("RHYTHM_POS_EXCELLENT_SLEEP_GOOD_TIMING") ? null : Integer.valueOf(R.string.msg_your_excellent_sleep_is_partially_139);
                    break;
                case -1004421699:
                    if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_VIGOROUS_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf2;
                    }
                    break;
                case -936917345:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_RELAX_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_the_light_exercise_you_did_105);
                    break;
                case -915518379:
                    numValueOf = !str.equals("PREGNANCY_POSTP_POS_EXCELLENT_OR_WORSE_SLEEP_GOOD_RECOVERY") ? null : Integer.valueOf(R.string.msg_after_giving_birth_restorative_sleep_135);
                    break;
                case -871535295:
                    numValueOf = !str.equals("RHYTHM_NEG_GOOD_SLEEP_REALLY_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_may_have_151);
                    break;
                case -812865398:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_MODERATE_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_training_done_late_in_140);
                    break;
                case -693691027:
                    numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_after_giving_birth_this_is_124);
                    break;
                case -661880296:
                    numValueOf = !str.equals("RHYTHM_POS_EXCELLENT_SLEEP_EXCELLENT_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_timing_was_perfect_143);
                    break;
                case -648768179:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_TO_STRENUOUS_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_your_outdoor_training_earlier_in_150);
                    break;
                case -612209574:
                    if (!str.equals("PREGNANCY_3TRIM_POS_GOOD_OR_WORSE_SLEEP_GOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf14;
                    }
                    break;
                case -594552984:
                    if (!str.equals("NAPPING_NEG_POOR_SLEEP_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf3;
                    }
                    break;
                case -553554130:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_REM")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf13;
                    }
                    break;
                case -532230140:
                    numValueOf = !str.equals("ALTITUDE_POS_FAIR_SLEEP") ? null : Integer.valueOf(R.string.msg_sleep_like_this_will_help_83);
                    break;
                case -502933192:
                    numValueOf = !str.equals("STRESS_POS_FAIR_OR_POOR_SLEEP_RESTFUL_DAY") ? null : Integer.valueOf(R.string.msg_you_effectively_balanced_your_stress_143);
                    break;
                case -442412288:
                    numValueOf = !str.equals("ALTITUDE_POS_EXCELLENT_OR_GOOD_SLEEP") ? null : Integer.valueOf(R.string.msg_high_quality_sleep_like_this_96);
                    break;
                case -373398824:
                    numValueOf = !str.equals("NAPPING_NEG_POOR_SLEEP_DISTURBED") ? null : Integer.valueOf(R.string.msg_your_disrupted_sleep_could_be_161);
                    break;
                case -341487611:
                    numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_RESTFUL_EVENING") ? null : Integer.valueOf(R.string.msg_you_rested_late_in_the_124);
                    break;
                case -337204736:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_DURING_DAY") ? null : Integer.valueOf(R.string.msg_even_with_your_very_hard_181);
                    break;
                case -312571478:
                    numValueOf = !str.equals("JET_LAG_NEG_GOOD_SLEEP_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_your_non_restorative_sleep_may_117);
                    break;
                case -298091352:
                    if (!str.equals("EVENT_DAY_POS_GOOD_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case -295929134:
                    numValueOf = !str.equals("AFTER_EVENT_DAY_POS_EXCELLENT_OR_GOOD_SLEEP") ? null : Integer.valueOf(R.string.msg_after_yesterdays_event_your_sleep_74);
                    break;
                case -223788369:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_REM")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf13;
                    }
                    break;
                case -164543338:
                    numValueOf = !str.equals("RHYTHM_NEG_POOR_SLEEP_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_poor_sleep_quality_was_99);
                    break;
                case -163512935:
                    if (!str.equals("PREGNANCY_2TRIM_POS_GOOD_OR_WORSE_SLEEP_GOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf14;
                    }
                    break;
                case -156141457:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case -138334424:
                    numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_hard_training_late_in_87);
                    break;
                case -130408559:
                    if (!str.equals("EVENT_DAY_NEG_POOR_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf9;
                    }
                    break;
                case -110682384:
                    numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_STRENUOUS") ? null : Integer.valueOf(R.string.msg_your_strenuous_training_yesterday_may_76);
                    break;
                case -98597330:
                    numValueOf = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_INACTIVE") ? null : Integer.valueOf(R.string.msg_you_had_a_day_of_117);
                    break;
                case -32447120:
                    if (!str.equals("AFTER_EVENT_DAY_POS_POOR_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf17;
                    }
                    break;
                case -5312712:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_VIGOROUS_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_your_training_yesterday_was_great_156);
                    break;
                case 19273912:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_DEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf13;
                    }
                    break;
                case 82792921:
                    numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_lower_quality_sleep_is_very_139);
                    break;
                case 279339452:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf15;
                    }
                    break;
                case 285183704:
                    if (!str.equals("PREGNANCY_1TRIM_POS_GOOD_OR_WORSE_SLEEP_GOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf14;
                    }
                    break;
                case 297212175:
                    numValueOf = !str.equals("AFTER_EVENT_DAY_NEG_GOOD_SLEEP") ? null : Integer.valueOf(R.string.msg_after_yesterdays_event_your_sleep_74);
                    break;
                case 381301552:
                    numValueOf = !str.equals("JET_LAG_POS_EXCELLENT_SLEEP") ? null : Integer.valueOf(R.string.msg_your_body_is_acclimating_well_63);
                    break;
                case 385328375:
                    if (!str.equals("STRESS_NEG_GOOD_OR_WORSE_SLEEP_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf16;
                    }
                    break;
                case 412682581:
                    numValueOf = !str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_your_interrupted_sleep_could_be_163);
                    break;
                case 416437357:
                    numValueOf = !str.equals("NAPPING_POS_POOR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_your_short_sleep_could_be_150);
                    break;
                case 427451210:
                    numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_RESTFUL_DAY") ? null : Integer.valueOf(R.string.msg_you_had_a_very_relaxing_82);
                    break;
                case 489506092:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_UNBALANCED") ? null : Integer.valueOf(R.string.msg_your_unbalanced_sleep_stages_may_121);
                    break;
                case 537858825:
                    numValueOf = !str.equals("JET_LAG_NEG_GOOD_SLEEP_UNBALANCED") ? null : Integer.valueOf(R.string.msg_your_unbalanced_sleep_stages_may_121);
                    break;
                case 539627830:
                    numValueOf = !str.equals("RHYTHM_POS_GOOD_SLEEP_GOOD_TIMING") ? null : Integer.valueOf(R.string.msg_your_good_sleep_is_partially_134);
                    break;
                case 559689341:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf15;
                    }
                    break;
                case 582743520:
                    numValueOf = !str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_sleep_like_this_may_be_99);
                    break;
                case 605572425:
                    numValueOf = !str.equals("JET_LAG_POS_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_while_youre_acclimating_to_a_152);
                    break;
                case 610750377:
                    numValueOf = !str.equals("RHYTHM_POS_GOOD_SLEEP_EXCELLENT_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_timing_was_perfect_143);
                    break;
                case 637653768:
                    numValueOf = !str.equals("PREGNANCY_POSTP_POS_GOOD_OR_WORSE_SLEEP_HIGH_DEEP") ? null : Integer.valueOf(R.string.msg_this_is_a_great_sign_104);
                    break;
                case 713311609:
                    if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_UNBALANCED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf18;
                    }
                    break;
                case 762934722:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_training_yesterday_helped_your_120);
                    break;
                case 790685851:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_UNBALANCED") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_129);
                    break;
                case 835898872:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_strenuous_training_later_in_110);
                    break;
                case 840039230:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf15;
                    }
                    break;
                case 861400765:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_VIGOROUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_training_yesterday_promoted_good_150);
                    break;
                case 874449305:
                    numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_RESTFUL_DAY") ? null : Integer.valueOf(R.string.msg_you_effectively_balanced_your_stress_136);
                    break;
                case 907308984:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_even_with_your_hard_training_84);
                    break;
                case 952108442:
                    numValueOf = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_POOR_HISTORY") ? null : Integer.valueOf(R.string.msg_youve_had_high_stress_days_84);
                    break;
                case 961235130:
                    numValueOf = !str.equals("RHYTHM_NEG_FAIR_SLEEP_REALLY_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_was_impacted_124);
                    break;
                case 1006390242:
                    numValueOf = !str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_in_your_third_trimester_sleep_147);
                    break;
                case 1049903173:
                    if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf18;
                    }
                    break;
                case 1063011598:
                    numValueOf = !str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_UNBALANCED") ? null : Integer.valueOf(R.string.msg_long_naps_and_naps_late_108);
                    break;
                case 1071824584:
                    if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_MODERATE_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 1084304074:
                    numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_HIGH_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_sleep_interruptions_are_very_normal_139);
                    break;
                case 1126244634:
                    if (!str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 1167479181:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_119);
                    break;
                case 1344314909:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_DURING_DAY") ? null : Integer.valueOf(R.string.msg_the_hard_training_you_did_146);
                    break;
                case 1358439350:
                    numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_training_done_late_in_108);
                    break;
                case 1476662542:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 1496216218:
                    if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf18;
                    }
                    break;
                case 1505689980:
                    numValueOf = !str.equals("RHYTHM_NEG_POOR_SLEEP_REALLY_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_poor_sleep_quality_was_101);
                    break;
                case 1536826146:
                    numValueOf = !str.equals("ALTITUDE_NEG_GOOD_OR_FAIR_SLEEP") ? null : Integer.valueOf(R.string.msg_while_your_body_is_acclimating_144);
                    break;
                case 1542767661:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_RESTLESS_OR_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_your_disrupted_sleep_may_have_111);
                    break;
                case 1565208786:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf11;
                    }
                    break;
                case 1590822058:
                    numValueOf = !str.equals("EVENT_DAY_NEG_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_may_have_128);
                    break;
                case 1604693468:
                    numValueOf = !str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_GOOD_TIMING") ? null : Integer.valueOf(R.string.msg_the_timing_of_your_sleep_161);
                    break;
                case 1607587984:
                    numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_hard_training_yesterday_may_71);
                    break;
                case 1611725965:
                    numValueOf = !str.equals("AFTER_EVENT_DAY_NEG_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_after_an_event_like_yesterday_151);
                    break;
                case 1616279434:
                    if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_MODERATE_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 1652077911:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_DEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf8;
                    }
                    break;
                case 1704858893:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case 1704928624:
                    numValueOf = !str.equals("JET_LAG_NEG_GOOD_SLEEP_RESTLESS_OR_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_your_disrupted_sleep_may_have_113);
                    break;
                case 1725196268:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case 1744049088:
                    numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_strenuous_training_earlier_in_141);
                    break;
                case 1745533643:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf8;
                    }
                    break;
                case 1768404045:
                    numValueOf = !str.equals("EVENT_DAY_POS_POOR_SLEEP") ? null : Integer.valueOf(R.string.msg_one_night_of_poor_sleep_122);
                    break;
                case 1769181128:
                    if (!str.equals("STRESS_NEG_POOR_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf16;
                    }
                    break;
                case 1829705196:
                    if (!str.equals("AFTER_EVENT_DAY_NEG_FAIR_SLEEP_NOTGOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf17;
                    }
                    break;
                case 1851669679:
                    if (!str.equals("EVENT_DAY_NEG_FAIR_SLEEP_NOTGOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf9;
                    }
                    break;
                case 1863924552:
                    numValueOf = !str.equals("ALTITUDE_NEG_FAIR_SLEEP") ? null : Integer.valueOf(R.string.msg_while_your_body_is_acclimating_159);
                    break;
                case 1907843600:
                    numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_lower_quality_sleep_is_very_137);
                    break;
                case 1924326051:
                    if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_STRESSFUL_EVENING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf10;
                    }
                    break;
                case 1936485662:
                    numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_RESTLESS_OR_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_127);
                    break;
                case 2013905425:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf11;
                    }
                    break;
                case 2098063340:
                    if (!str.equals("EVENT_DAY_NEG_GOOD_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            if (numValueOf != null) {
                return this.f105510a.getString(numValueOf.intValue());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:109:0x0264  */
    /* JADX WARN: Code duplicated, block: B:125:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:12:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:167:0x0357  */
    /* JADX WARN: Code duplicated, block: B:190:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:198:0x03db  */
    /* JADX WARN: Code duplicated, block: B:209:0x0405  */
    /* JADX WARN: Code duplicated, block: B:20:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:224:0x0442  */
    /* JADX WARN: Code duplicated, block: B:235:0x046c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0479  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:326:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0129  */
    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
    /* JADX WARN: Code duplicated, block: B:40:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Code duplicated, block: B:56:0x0186  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:8:0x00c6  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String c(String str) {
        Integer numValueOf = Integer.valueOf(R.string.msg_your_activity_later_in_the_129);
        Integer numValueOf2 = Integer.valueOf(R.string.msg_your_poor_sleep_may_be_149);
        Integer numValueOf3 = Integer.valueOf(R.string.msg_your_activity_yesterday_was_great_164);
        Integer numValueOf4 = Integer.valueOf(R.string.msg_after_yesterdays_event_your_sleep_74);
        Integer numValueOf5 = Integer.valueOf(R.string.msg_your_interrupted_sleep_could_be_163);
        Integer numValueOf6 = Integer.valueOf(R.string.msg_your_unbalanced_sleep_stages_may_121);
        Integer numValueOf7 = Integer.valueOf(R.string.msg_sleep_like_this_may_be_99);
        Integer numValueOf8 = Integer.valueOf(R.string.msg_your_sleep_timing_was_perfect_143);
        Integer numValueOf9 = Integer.valueOf(R.string.msg_in_your_third_trimester_sleep_147);
        Integer numValueOf10 = Integer.valueOf(R.string.msg_long_naps_and_naps_late_108);
        Integer numValueOf11 = Integer.valueOf(R.string.msg_your_restless_sleep_could_be_163);
        Integer numValueOf12 = Integer.valueOf(R.string.msg_increased_restlessness_is_normal_during_87);
        Integer numValueOf13 = Integer.valueOf(R.string.msg_your_activity_late_yesterday_may_146);
        Integer numValueOf14 = Integer.valueOf(R.string.msg_during_pregnancy_its_normal_to_132);
        Integer numValueOf15 = Integer.valueOf(R.string.msg_its_normal_to_see_deep_112);
        Integer numValueOf16 = Integer.valueOf(R.string.msg_on_the_night_before_a_130);
        Integer numValueOf17 = Integer.valueOf(R.string.msg_you_had_a_lot_of_133);
        Integer numValueOf18 = Integer.valueOf(R.string.msg_sleep_like_this_may_be_145);
        Integer numValueOf19 = Integer.valueOf(R.string.msg_youll_be_unstoppable_in_todays_40);
        Integer numValueOf20 = Integer.valueOf(R.string.msg_throughout_pregnancy_sleep_like_this_90);
        Integer numValueOf21 = Integer.valueOf(R.string.msg_sleep_like_this_will_help_97);
        Integer numValueOf22 = Integer.valueOf(R.string.msg_during_pregnancy_its_normal_to_95);
        Integer numValueOf23 = Integer.valueOf(R.string.msg_your_very_stressful_day_yesterday_111);
        Integer numValueOf24 = Integer.valueOf(R.string.msg_after_an_event_like_yesterdays_129);
        Integer numValueOf25 = Integer.valueOf(R.string.msg_your_sleep_may_have_been_163);
        switch (str.hashCode()) {
            case -2123003026:
                numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_MODERATE_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_activity_yesterday_promoted_good_141);
                break;
            case -2063809082:
                numValueOf = !str.equals("ALTITUDE_NEG_POOR_SLEEP") ? null : Integer.valueOf(R.string.msg_your_sleep_may_have_been_128);
                break;
            case -1997240889:
                if (!str.equals("NAPPING_NEG_POOR_SLEEP_UNBALANCED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf10;
                }
                break;
            case -1981236665:
                if (!str.equals("STRESS_NEG_POOR_SLEEP_STRESSFUL_EVENING")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf17;
                }
                break;
            case -1974796121:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_your_non_restorative_sleep_may_118);
                break;
            case -1964530582:
                numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_STRESSFUL_DAY") ? null : Integer.valueOf(R.string.msg_even_though_you_had_a_69);
                break;
            case -1934624365:
                numValueOf = !str.equals("JET_LAG_POS_GOOD_SLEEP") ? null : Integer.valueOf(R.string.msg_your_body_is_acclimating_well_64);
                break;
            case -1931259724:
                if (!str.equals("AFTER_EVENT_DAY_NEG_POOR_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf24;
                }
                break;
            case -1929095011:
                numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_nice_work_getting_outdoor_activity_148);
                break;
            case -1923215184:
                numValueOf = !str.equals("AFTER_EVENT_DAY_POS_FAIR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_after_an_event_like_yesterday_138);
                break;
            case -1919079714:
                numValueOf = !str.equals("PREGNANCY_POSTP_POS_GOOD_OR_WORSE_SLEEP_HIGH_REM") ? null : Integer.valueOf(R.string.msg_this_is_a_great_sign_103);
                break;
            case -1901250701:
                numValueOf = !str.equals("EVENT_DAY_POS_FAIR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_even_though_you_didnt_sleep_95);
                break;
            case -1886786549:
                if (!str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_MODERATE_DURING_DAY_OUTDOOR")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf3;
                }
                break;
            case -1838082486:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_INTERRUPTED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf25;
                }
                break;
            case -1832365232:
                numValueOf = !str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_sleep_like_this_may_be_138);
                break;
            case -1815175066:
                numValueOf = !str.equals("EVENT_DAY_POS_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_you_slept_long_enough_to_60);
                break;
            case -1794271159:
                numValueOf = !str.equals("AFTER_EVENT_DAY_POS_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_after_an_event_like_yesterday_152);
                break;
            case -1764784360:
                numValueOf = !str.equals("RHYTHM_NEG_FAIR_SLEEP_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_may_have_150);
                break;
            case -1760359525:
                numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_VIGOROUS_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_activity_yesterday_promoted_good_142);
                break;
            case -1744510737:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf2;
                }
                break;
            case -1715277096:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_your_poor_restoration_may_have_155);
                break;
            case -1712426260:
                if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_VERY_STRESSFUL_DAY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf23;
                }
                break;
            case -1692097007:
                numValueOf = !str.equals("JET_LAG_POS_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_sleep_like_this_will_help_102);
                break;
            case -1613530087:
                numValueOf = !str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_DEEP") ? null : Integer.valueOf(R.string.msg_its_normal_for_your_amount_118);
                break;
            case -1598995953:
                numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_ACTIVE_DAY") ? null : Integer.valueOf(R.string.msg_you_were_very_physically_active_96);
                break;
            case -1564584645:
                numValueOf = !str.equals("EVENT_DAY_POS_EXCELLENT_SLEEP") ? null : Integer.valueOf(R.string.msg_for_todays_event_youre_ready_53);
                break;
            case -1548876549:
                if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_VIGOROUS_CLOSE_BED")) {
                    numValueOf = null;
                }
                break;
            case -1538443228:
                numValueOf = !str.equals("STRESS_POS_FAIR_OR_POOR_SLEEP_RESTFUL_EVENING") ? null : Integer.valueOf(R.string.msg_you_had_a_relaxing_period_103);
                break;
            case -1482708447:
                if (!str.equals("NAPPING_NEG_GOOD_SLEEP_GOOD_DURATION_RESTLESS")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf11;
                }
                break;
            case -1458459965:
                numValueOf = !str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_EXCELLENT_TIMING") ? null : Integer.valueOf(R.string.msg_the_timing_of_your_sleep_158);
                break;
            case -1456548548:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_114);
                break;
            case -1393753093:
                numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_hard_activity_yesterday_promoted_95);
                break;
            case -1352916767:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf7;
                }
                break;
            case -1185500755:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf9;
                }
                break;
            case -1180365074:
                if (!str.equals("NAPPING_NEG_GOOD_SLEEP_GOOD_DURATION_INTERRUPTED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf5;
                }
                break;
            case -1132969377:
                numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_your_activity_yesterday_helped_your_157);
                break;
            case -1070080545:
                numValueOf = !str.equals("MOD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_INACTIVITY") ? null : Integer.valueOf(R.string.msg_your_sleep_may_have_suffered_114);
                break;
            case -1061366425:
                numValueOf = !str.equals("RHYTHM_POS_EXCELLENT_SLEEP_GOOD_TIMING") ? null : Integer.valueOf(R.string.msg_your_excellent_sleep_is_partially_139);
                break;
            case -1004421699:
                if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_VIGOROUS_CLOSE_BED")) {
                    numValueOf = null;
                }
                break;
            case -936917345:
                numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_RELAX_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_the_light_exercise_you_did_105);
                break;
            case -915518379:
                numValueOf = !str.equals("PREGNANCY_POSTP_POS_EXCELLENT_OR_WORSE_SLEEP_GOOD_RECOVERY") ? null : Integer.valueOf(R.string.msg_after_giving_birth_restorative_sleep_135);
                break;
            case -871535295:
                numValueOf = !str.equals("RHYTHM_NEG_GOOD_SLEEP_REALLY_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_may_have_151);
                break;
            case -812865398:
                numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_MODERATE_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_activity_done_late_in_150);
                break;
            case -693691027:
                numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_after_giving_birth_this_is_124);
                break;
            case -661880296:
                if (!str.equals("RHYTHM_POS_EXCELLENT_SLEEP_EXCELLENT_TIMING")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf8;
                }
                break;
            case -648768179:
                numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_TO_STRENUOUS_DURING_DAY_OUTDOOR") ? null : Integer.valueOf(R.string.msg_your_outdoor_activity_earlier_in_150);
                break;
            case -612209574:
                if (!str.equals("PREGNANCY_3TRIM_POS_GOOD_OR_WORSE_SLEEP_GOOD_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf21;
                }
                break;
            case -594552984:
                if (!str.equals("NAPPING_NEG_POOR_SLEEP_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf2;
                }
                break;
            case -553554130:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_REM")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf20;
                }
                break;
            case -532230140:
                numValueOf = !str.equals("ALTITUDE_POS_FAIR_SLEEP") ? null : Integer.valueOf(R.string.msg_sleep_like_this_will_help_83);
                break;
            case -502933192:
                numValueOf = !str.equals("STRESS_POS_FAIR_OR_POOR_SLEEP_RESTFUL_DAY") ? null : Integer.valueOf(R.string.msg_you_effectively_balanced_your_stress_143);
                break;
            case -442412288:
                numValueOf = !str.equals("ALTITUDE_POS_EXCELLENT_OR_GOOD_SLEEP") ? null : Integer.valueOf(R.string.msg_high_quality_sleep_like_this_96);
                break;
            case -373398824:
                numValueOf = !str.equals("NAPPING_NEG_POOR_SLEEP_DISTURBED") ? null : Integer.valueOf(R.string.msg_your_disrupted_sleep_could_be_161);
                break;
            case -341487611:
                numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_RESTFUL_EVENING") ? null : Integer.valueOf(R.string.msg_you_rested_late_in_the_124);
                break;
            case -337204736:
                numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_DURING_DAY") ? null : Integer.valueOf(R.string.msg_even_with_your_very_hard_174);
                break;
            case -312571478:
                numValueOf = !str.equals("JET_LAG_NEG_GOOD_SLEEP_POOR_RECOVERY") ? null : Integer.valueOf(R.string.msg_your_non_restorative_sleep_may_117);
                break;
            case -298091352:
                if (!str.equals("EVENT_DAY_POS_GOOD_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf19;
                }
                break;
            case -295929134:
                if (!str.equals("AFTER_EVENT_DAY_POS_EXCELLENT_OR_GOOD_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf4;
                }
                break;
            case -223788369:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_REM")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf20;
                }
                break;
            case -164543338:
                numValueOf = !str.equals("RHYTHM_NEG_POOR_SLEEP_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_poor_sleep_quality_was_99);
                break;
            case -163512935:
                if (!str.equals("PREGNANCY_2TRIM_POS_GOOD_OR_WORSE_SLEEP_GOOD_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf21;
                }
                break;
            case -156141457:
                if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf12;
                }
                break;
            case -138334424:
                numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_hard_activity_late_in_128);
                break;
            case -130408559:
                if (!str.equals("EVENT_DAY_NEG_POOR_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf16;
                }
                break;
            case -110682384:
                numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_STRENUOUS") ? null : Integer.valueOf(R.string.msg_your_strenuous_activity_yesterday_may_117);
                break;
            case -98597330:
                numValueOf = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_INACTIVE") ? null : Integer.valueOf(R.string.msg_you_had_a_day_of_117);
                break;
            case -32447120:
                if (!str.equals("AFTER_EVENT_DAY_POS_POOR_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf24;
                }
                break;
            case -5312712:
                if (!str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_VIGOROUS_DURING_DAY_OUTDOOR")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf3;
                }
                break;
            case 19273912:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_DEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf20;
                }
                break;
            case 82792921:
                numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_lower_quality_sleep_is_very_139);
                break;
            case 279339452:
                if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf22;
                }
                break;
            case 285183704:
                if (!str.equals("PREGNANCY_1TRIM_POS_GOOD_OR_WORSE_SLEEP_GOOD_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf21;
                }
                break;
            case 297212175:
                if (!str.equals("AFTER_EVENT_DAY_NEG_GOOD_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf4;
                }
                break;
            case 381301552:
                numValueOf = !str.equals("JET_LAG_POS_EXCELLENT_SLEEP") ? null : Integer.valueOf(R.string.msg_your_body_is_acclimating_well_63);
                break;
            case 385328375:
                if (!str.equals("STRESS_NEG_GOOD_OR_WORSE_SLEEP_STRESSFUL_DAY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf23;
                }
                break;
            case 412682581:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_INTERRUPTED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf5;
                }
                break;
            case 416437357:
                numValueOf = !str.equals("NAPPING_POS_POOR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_your_short_sleep_could_be_150);
                break;
            case 427451210:
                numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_RESTFUL_DAY") ? null : Integer.valueOf(R.string.msg_you_had_a_very_relaxing_82);
                break;
            case 489506092:
                if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_UNBALANCED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf6;
                }
                break;
            case 537858825:
                if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_UNBALANCED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf6;
                }
                break;
            case 539627830:
                numValueOf = !str.equals("RHYTHM_POS_GOOD_SLEEP_GOOD_TIMING") ? null : Integer.valueOf(R.string.msg_your_good_sleep_is_partially_134);
                break;
            case 559689341:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf22;
                }
                break;
            case 582743520:
                if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf7;
                }
                break;
            case 605572425:
                numValueOf = !str.equals("JET_LAG_POS_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION") ? null : Integer.valueOf(R.string.msg_while_youre_acclimating_to_a_152);
                break;
            case 610750377:
                if (!str.equals("RHYTHM_POS_GOOD_SLEEP_EXCELLENT_TIMING")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf8;
                }
                break;
            case 637653768:
                numValueOf = !str.equals("PREGNANCY_POSTP_POS_GOOD_OR_WORSE_SLEEP_HIGH_DEEP") ? null : Integer.valueOf(R.string.msg_this_is_a_great_sign_104);
                break;
            case 713311609:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_UNBALANCED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf25;
                }
                break;
            case 762934722:
                numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_activity_yesterday_helped_your_114);
                break;
            case 790685851:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_UNBALANCED") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_129);
                break;
            case 835898872:
                numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_strenuous_activity_later_in_110);
                break;
            case 840039230:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf22;
                }
                break;
            case 861400765:
                numValueOf = !str.equals("MOD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_VIGOROUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_activity_yesterday_promoted_good_150);
                break;
            case 874449305:
                numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_RESTFUL_DAY") ? null : Integer.valueOf(R.string.msg_you_effectively_balanced_your_stress_136);
                break;
            case 907308984:
                numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_even_with_your_hard_activity_84);
                break;
            case 952108442:
                numValueOf = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_POOR_HISTORY") ? null : Integer.valueOf(R.string.msg_youve_had_high_stress_days_84);
                break;
            case 961235130:
                numValueOf = !str.equals("RHYTHM_NEG_FAIR_SLEEP_REALLY_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_was_impacted_124);
                break;
            case 1006390242:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf9;
                }
                break;
            case 1049903173:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_RESTLESS")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf25;
                }
                break;
            case 1063011598:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_UNBALANCED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf10;
                }
                break;
            case 1071824584:
                if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_MODERATE_CLOSE_BED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf13;
                }
                break;
            case 1084304074:
                numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_HIGH_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_sleep_interruptions_are_very_normal_139);
                break;
            case 1126244634:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_GOOD_DURATION_RESTLESS")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf11;
                }
                break;
            case 1167479181:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_119);
                break;
            case 1344314909:
                numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_DURING_DAY") ? null : Integer.valueOf(R.string.msg_the_hard_activity_you_did_150);
                break;
            case 1358439350:
                numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_your_activity_done_late_in_107);
                break;
            case 1476662542:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf12;
                }
                break;
            case 1496216218:
                if (!str.equals("NAPPING_NEG_FAIR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf25;
                }
                break;
            case 1505689980:
                numValueOf = !str.equals("RHYTHM_NEG_POOR_SLEEP_REALLY_LATE_TIMING") ? null : Integer.valueOf(R.string.msg_your_poor_sleep_quality_was_101);
                break;
            case 1536826146:
                numValueOf = !str.equals("ALTITUDE_NEG_GOOD_OR_FAIR_SLEEP") ? null : Integer.valueOf(R.string.msg_while_your_body_is_acclimating_144);
                break;
            case 1542767661:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_RESTLESS_OR_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_your_disrupted_sleep_may_have_111);
                break;
            case 1565208786:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf18;
                }
                break;
            case 1590822058:
                numValueOf = !str.equals("EVENT_DAY_NEG_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_your_sleep_quality_may_have_128);
                break;
            case 1604693468:
                numValueOf = !str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_GOOD_TIMING") ? null : Integer.valueOf(R.string.msg_the_timing_of_your_sleep_161);
                break;
            case 1607587984:
                numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_hard_activity_yesterday_may_112);
                break;
            case 1611725965:
                numValueOf = !str.equals("AFTER_EVENT_DAY_NEG_FAIR_SLEEP_GOOD_DURATION") ? null : Integer.valueOf(R.string.msg_after_an_event_like_yesterday_151);
                break;
            case 1616279434:
                if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_MODERATE_CLOSE_BED")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf13;
                }
                break;
            case 1652077911:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_LOW_DEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf15;
                }
                break;
            case 1704858893:
                if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf14;
                }
                break;
            case 1704928624:
                numValueOf = !str.equals("JET_LAG_NEG_GOOD_SLEEP_RESTLESS_OR_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_your_disrupted_sleep_may_have_113);
                break;
            case 1725196268:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf14;
                }
                break;
            case 1744049088:
                numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_DURING_DAY") ? null : Integer.valueOf(R.string.msg_your_strenuous_activity_earlier_in_141);
                break;
            case 1745533643:
                if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf15;
                }
                break;
            case 1768404045:
                numValueOf = !str.equals("EVENT_DAY_POS_POOR_SLEEP") ? null : Integer.valueOf(R.string.msg_one_night_of_poor_sleep_122);
                break;
            case 1769181128:
                if (!str.equals("STRESS_NEG_POOR_SLEEP_VERY_STRESSFUL_DAY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf23;
                }
                break;
            case 1829705196:
                if (!str.equals("AFTER_EVENT_DAY_NEG_FAIR_SLEEP_NOTGOOD_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf24;
                }
                break;
            case 1851669679:
                if (!str.equals("EVENT_DAY_NEG_FAIR_SLEEP_NOTGOOD_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf16;
                }
                break;
            case 1863924552:
                numValueOf = !str.equals("ALTITUDE_NEG_FAIR_SLEEP") ? null : Integer.valueOf(R.string.msg_while_your_body_is_acclimating_159);
                break;
            case 1907843600:
                numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY") ? null : Integer.valueOf(R.string.msg_lower_quality_sleep_is_very_137);
                break;
            case 1924326051:
                if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_STRESSFUL_EVENING")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf17;
                }
                break;
            case 1936485662:
                numValueOf = !str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_RESTLESS_OR_INTERRUPTED") ? null : Integer.valueOf(R.string.msg_while_youre_adapting_to_a_127);
                break;
            case 2013905425:
                if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_POOR_RECOVERY")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf18;
                }
                break;
            case 2098063340:
                if (!str.equals("EVENT_DAY_NEG_GOOD_SLEEP")) {
                    numValueOf = null;
                } else {
                    numValueOf = numValueOf19;
                }
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            return this.f105510a.getString(numValueOf.intValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0108  */
    /* JADX WARN: Code duplicated, block: B:20:0x0114  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:222:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:234:0x041c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0428  */
    /* JADX WARN: Code duplicated, block: B:251:0x044c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0458  */
    /* JADX WARN: Code duplicated, block: B:266:0x0478  */
    /* JADX WARN: Code duplicated, block: B:270:0x0484  */
    /* JADX WARN: Code duplicated, block: B:284:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:299:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x0138  */
    /* JADX WARN: Code duplicated, block: B:357:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0168  */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:97:0x020e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String d(String str) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3 = Integer.valueOf(R.string.msg_to_prevent_potential_sleep_disruptions_in_the_future);
        Integer numValueOf4 = Integer.valueOf(R.string.msg_help_your_body_get_the_rest_it_needs);
        Integer numValueOf5 = Integer.valueOf(R.string.msg_if_youre_feeling_groggy_steer_away_from_heavy);
        Integer numValueOf6 = Integer.valueOf(R.string.msg_be_patient_with_yourself_today_and_find_more);
        Integer numValueOf7 = Integer.valueOf(R.string.msg_try_going_for_a_walk_in_the_daylight);
        Integer numValueOf8 = Integer.valueOf(R.string.msg_for_guidance_on_how_to_reduce_jet_lag);
        Integer numValueOf9 = Integer.valueOf(R.string.msg_aim_for_a_consistent_bedtime_and_waketime_each);
        Integer numValueOf10 = Integer.valueOf(R.string.msg_be_patient_with_yourself_today__remember_to);
        Integer numValueOf11 = Integer.valueOf(R.string.msg_continue_to_focus_on_getting_enough_sleep_to);
        Integer numValueOf12 = Integer.valueOf(R.string.msg_limiting_caffeine_adding_regular_exercise_and_relaxing_before);
        Integer numValueOf13 = Integer.valueOf(R.string.msg_try_adding_relaxation_routines_and_reducing_fluid_intake);
        Integer numValueOf14 = Integer.valueOf(R.string.msg_focus_on_getting_enough_sleep_to_help_offset);
        Integer numValueOf15 = Integer.valueOf(R.string.msg_promote_restful_sleep_by_setting_aside_time_to);
        Integer numValueOf16 = Integer.valueOf(R.string.msg_after_hard_days_like_yesterday_prioritize_long_quality);
        if (str != null) {
            g.f105523a.getClass();
            if (g.a(str)) {
                return str;
            }
            if (this.f105511b) {
                Integer numValueOf17 = Integer.valueOf(R.string.msg_to_optimize_your_sleep_and_70);
                switch (str.hashCode()) {
                    case -2063809082:
                        numValueOf2 = !str.equals("ALTITUDE_NEG_POOR_SLEEP") ? null : Integer.valueOf(R.string.msg_try_to_take_it_easy_and_rest_today);
                        break;
                    case -1981236665:
                        if (!str.equals("STRESS_NEG_POOR_SLEEP_STRESSFUL_EVENING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf15;
                        }
                        break;
                    case -1974796121:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_RECOVERY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case -1964530582:
                        numValueOf2 = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_STRESSFUL_DAY") ? null : Integer.valueOf(R.string.msg_take_relaxation_breaks_to_help_settle_your_stress);
                        break;
                    case -1934624365:
                        if (!str.equals("JET_LAG_POS_GOOD_SLEEP")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case -1764784360:
                        if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_LATE_TIMING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf9;
                        }
                        break;
                    case -1715277096:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_RECOVERY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case -1712426260:
                        if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_VERY_STRESSFUL_DAY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf10;
                        }
                        break;
                    case -1692097007:
                        if (!str.equals("JET_LAG_POS_FAIR_SLEEP_GOOD_DURATION")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case -1548876549:
                        if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_VIGOROUS_CLOSE_BED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf17;
                        }
                        break;
                    case -1458459965:
                        numValueOf2 = !str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_EXCELLENT_TIMING") ? null : Integer.valueOf(R.string.msg_continue_to_stick_to_consistent_sleep_times_each);
                        break;
                    case -1456548548:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case -1393753093:
                        numValueOf2 = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_to_prevent_potential_sleep_disruptions_plan_your_hard);
                        break;
                    case -1352916767:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf13;
                        }
                        break;
                    case -1185500755:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf12;
                        }
                        break;
                    case -1070080545:
                        numValueOf2 = !str.equals("MOD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_INACTIVITY") ? null : Integer.valueOf(R.string.msg_for_better_sleep_find_more_80);
                        break;
                    case -1004421699:
                        if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_VIGOROUS_CLOSE_BED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf17;
                        }
                        break;
                    case -871535295:
                        if (!str.equals("RHYTHM_NEG_GOOD_SLEEP_REALLY_LATE_TIMING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf9;
                        }
                        break;
                    case -312571478:
                        if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_POOR_RECOVERY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case -164543338:
                        if (!str.equals("RHYTHM_NEG_POOR_SLEEP_LATE_TIMING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf9;
                        }
                        break;
                    case -156141457:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf12;
                        }
                        break;
                    case -138334424:
                        numValueOf2 = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_to_optimize_your_sleep_and_recovery_plan_hard);
                        break;
                    case -110682384:
                        if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_STRENUOUS")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf16;
                        }
                        break;
                    case -98597330:
                        numValueOf2 = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_INACTIVE") ? null : Integer.valueOf(R.string.msg_during_stressful_times_be_active__get_moderate);
                        break;
                    case 279339452:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf14;
                        }
                        break;
                    case 381301552:
                        if (!str.equals("JET_LAG_POS_EXCELLENT_SLEEP")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 385328375:
                        if (!str.equals("STRESS_NEG_GOOD_OR_WORSE_SLEEP_STRESSFUL_DAY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf10;
                        }
                        break;
                    case 489506092:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_UNBALANCED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 537858825:
                        if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_UNBALANCED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 559689341:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf14;
                        }
                        break;
                    case 582743520:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf13;
                        }
                        break;
                    case 605572425:
                        if (!str.equals("JET_LAG_POS_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 790685851:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_UNBALANCED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 835898872:
                        if (!str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_CLOSE_BED")) {
                            numValueOf2 = null;
                        }
                        break;
                    case 840039230:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf14;
                        }
                        break;
                    case 907308984:
                        numValueOf2 = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_to_optimize_your_sleep_plan_your_hard_training);
                        break;
                    case 952108442:
                        numValueOf2 = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_POOR_HISTORY") ? null : numValueOf4;
                        break;
                    case 961235130:
                        if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_REALLY_LATE_TIMING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf9;
                        }
                        break;
                    case 1006390242:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf13;
                        }
                        break;
                    case 1071824584:
                        if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_MODERATE_CLOSE_BED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf17;
                        }
                        break;
                    case 1167479181:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 1358439350:
                        numValueOf2 = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_plan_training_earlier_in_the_76);
                        break;
                    case 1476662542:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf12;
                        }
                        break;
                    case 1505689980:
                        if (!str.equals("RHYTHM_NEG_POOR_SLEEP_REALLY_LATE_TIMING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf9;
                        }
                        break;
                    case 1536826146:
                        numValueOf2 = !str.equals("ALTITUDE_NEG_GOOD_OR_FAIR_SLEEP") ? null : numValueOf5;
                        break;
                    case 1542767661:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 1607587984:
                        if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_DURING_DAY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf16;
                        }
                        break;
                    case 1616279434:
                        if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_MODERATE_CLOSE_BED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf17;
                        }
                        break;
                    case 1704858893:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf11;
                        }
                        break;
                    case 1704928624:
                        if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_RESTLESS_OR_INTERRUPTED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    case 1725196268:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf11;
                        }
                        break;
                    case 1745533643:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf11;
                        }
                        break;
                    case 1769181128:
                        if (!str.equals("STRESS_NEG_POOR_SLEEP_VERY_STRESSFUL_DAY")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf10;
                        }
                        break;
                    case 1863924552:
                        numValueOf2 = !str.equals("ALTITUDE_NEG_FAIR_SLEEP") ? null : numValueOf6;
                        break;
                    case 1907843600:
                        numValueOf2 = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY") ? null : numValueOf7;
                        break;
                    case 1924326051:
                        if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_STRESSFUL_EVENING")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf15;
                        }
                        break;
                    case 1936485662:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                            numValueOf2 = null;
                        } else {
                            numValueOf2 = numValueOf8;
                        }
                        break;
                    default:
                        numValueOf2 = null;
                        break;
                }
                if (numValueOf2 != null) {
                    numValueOf2 = numValueOf3;
                    return this.f105510a.getString(numValueOf2.intValue());
                }
            } else {
                Integer numValueOf18 = Integer.valueOf(R.string.msg_to_optimize_your_sleep_and_84);
                Integer numValueOf19 = Integer.valueOf(R.string.msg_to_optimize_your_sleep_and_79);
                switch (str.hashCode()) {
                    case -2063809082:
                        numValueOf = !str.equals("ALTITUDE_NEG_POOR_SLEEP") ? null : Integer.valueOf(R.string.msg_try_to_take_it_easy_and_rest_today);
                        break;
                    case -1981236665:
                        if (!str.equals("STRESS_NEG_POOR_SLEEP_STRESSFUL_EVENING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf15;
                        }
                        break;
                    case -1974796121:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_RECOVERY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case -1964530582:
                        numValueOf = !str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_STRESSFUL_DAY") ? null : Integer.valueOf(R.string.msg_take_relaxation_breaks_to_help_settle_your_stress);
                        break;
                    case -1934624365:
                        if (!str.equals("JET_LAG_POS_GOOD_SLEEP")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case -1764784360:
                        if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_LATE_TIMING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf9;
                        }
                        break;
                    case -1715277096:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_RECOVERY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case -1712426260:
                        if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_VERY_STRESSFUL_DAY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf10;
                        }
                        break;
                    case -1692097007:
                        if (!str.equals("JET_LAG_POS_FAIR_SLEEP_GOOD_DURATION")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case -1548876549:
                        if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_VIGOROUS_CLOSE_BED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf18;
                        }
                        break;
                    case -1458459965:
                        numValueOf = !str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_EXCELLENT_TIMING") ? null : Integer.valueOf(R.string.msg_continue_to_stick_to_consistent_sleep_times_each);
                        break;
                    case -1456548548:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case -1393753093:
                        numValueOf = !str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_to_prevent_potential_sleep_disruptions_plan_your_hard);
                        break;
                    case -1352916767:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf13;
                        }
                        break;
                    case -1185500755:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf12;
                        }
                        break;
                    case -1070080545:
                        numValueOf = !str.equals("MOD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_INACTIVITY") ? null : Integer.valueOf(R.string.msg_for_better_sleep_find_more_80);
                        break;
                    case -1004421699:
                        if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_VIGOROUS_CLOSE_BED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf18;
                        }
                        break;
                    case -871535295:
                        if (!str.equals("RHYTHM_NEG_GOOD_SLEEP_REALLY_LATE_TIMING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf9;
                        }
                        break;
                    case -312571478:
                        if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_POOR_RECOVERY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case -164543338:
                        if (!str.equals("RHYTHM_NEG_POOR_SLEEP_LATE_TIMING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf9;
                        }
                        break;
                    case -156141457:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf12;
                        }
                        break;
                    case -138334424:
                        numValueOf = !str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_to_optimize_your_sleep_and_recovery_plan_hard);
                        break;
                    case -110682384:
                        if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_STRENUOUS")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf16;
                        }
                        break;
                    case -98597330:
                        numValueOf = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_INACTIVE") ? null : Integer.valueOf(R.string.msg_during_stressful_times_be_active__get_moderate);
                        break;
                    case 279339452:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf14;
                        }
                        break;
                    case 381301552:
                        if (!str.equals("JET_LAG_POS_EXCELLENT_SLEEP")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 385328375:
                        if (!str.equals("STRESS_NEG_GOOD_OR_WORSE_SLEEP_STRESSFUL_DAY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf10;
                        }
                        break;
                    case 489506092:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_UNBALANCED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 537858825:
                        if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_UNBALANCED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 559689341:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf14;
                        }
                        break;
                    case 582743520:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf13;
                        }
                        break;
                    case 605572425:
                        if (!str.equals("JET_LAG_POS_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 790685851:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_UNBALANCED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 835898872:
                        if (!str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_CLOSE_BED")) {
                            numValueOf = null;
                        }
                        break;
                    case 840039230:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf14;
                        }
                        break;
                    case 907308984:
                        numValueOf = !str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_to_optimize_your_sleep_plan_your_hardest_activity);
                        break;
                    case 952108442:
                        numValueOf = !str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_POOR_HISTORY") ? null : numValueOf4;
                        break;
                    case 961235130:
                        if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_REALLY_LATE_TIMING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf9;
                        }
                        break;
                    case 1006390242:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf13;
                        }
                        break;
                    case 1071824584:
                        if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_MODERATE_CLOSE_BED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf19;
                        }
                        break;
                    case 1167479181:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 1358439350:
                        numValueOf = !str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_CLOSE_BED") ? null : Integer.valueOf(R.string.msg_plan_physical_activity_earlier_in_85);
                        break;
                    case 1476662542:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf12;
                        }
                        break;
                    case 1505689980:
                        if (!str.equals("RHYTHM_NEG_POOR_SLEEP_REALLY_LATE_TIMING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf9;
                        }
                        break;
                    case 1536826146:
                        numValueOf = !str.equals("ALTITUDE_NEG_GOOD_OR_FAIR_SLEEP") ? null : numValueOf5;
                        break;
                    case 1542767661:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 1607587984:
                        if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_DURING_DAY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf16;
                        }
                        break;
                    case 1616279434:
                        if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_MODERATE_CLOSE_BED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf19;
                        }
                        break;
                    case 1704858893:
                        if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf11;
                        }
                        break;
                    case 1704928624:
                        if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_RESTLESS_OR_INTERRUPTED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    case 1725196268:
                        if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf11;
                        }
                        break;
                    case 1745533643:
                        if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf11;
                        }
                        break;
                    case 1769181128:
                        if (!str.equals("STRESS_NEG_POOR_SLEEP_VERY_STRESSFUL_DAY")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf10;
                        }
                        break;
                    case 1863924552:
                        numValueOf = !str.equals("ALTITUDE_NEG_FAIR_SLEEP") ? null : numValueOf6;
                        break;
                    case 1907843600:
                        numValueOf = !str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY") ? null : numValueOf7;
                        break;
                    case 1924326051:
                        if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_STRESSFUL_EVENING")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf15;
                        }
                        break;
                    case 1936485662:
                        if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                            numValueOf = null;
                        } else {
                            numValueOf = numValueOf8;
                        }
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
                if (numValueOf != null) {
                    numValueOf = numValueOf3;
                    return this.f105510a.getString(numValueOf.intValue());
                }
            }
            numValueOf = numValueOf3;
            numValueOf2 = numValueOf3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:200:0x0370  */
    /* JADX WARN: Code duplicated, block: B:204:0x037c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:212:0x0394  */
    /* JADX WARN: Code duplicated, block: B:219:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:232:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:236:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:246:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String e(String str) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3 = Integer.valueOf(R.string.lbl_sleep_tip_post_partum);
        Integer numValueOf4 = Integer.valueOf(R.string.lbl_sleep_tip_for_jet_lag);
        Integer numValueOf5 = Integer.valueOf(R.string.lbl_sleep_tip_for_pregnancy);
        Integer numValueOf6 = Integer.valueOf(R.string.lbl_sleep_tip_for_balancing_stress);
        Integer numValueOf7 = Integer.valueOf(R.string.lbl_sleep_tip_for_sleep_consistency);
        Integer numValueOf8 = Integer.valueOf(R.string.lbl_sleep_tip_for_altitude_acclimation);
        if (str == null) {
            return null;
        }
        g.f105523a.getClass();
        if (g.a(str)) {
            return str;
        }
        if (this.f105511b) {
            Integer numValueOf9 = Integer.valueOf(R.string.lbl_sleep_tip_for_high_training_strain);
            Integer numValueOf10 = Integer.valueOf(R.string.lbl_sleep_tip_for_timing_training);
            switch (str.hashCode()) {
                case -2063809082:
                    if (!str.equals("ALTITUDE_NEG_POOR_SLEEP")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf8;
                    }
                    break;
                case -1981236665:
                    if (!str.equals("STRESS_NEG_POOR_SLEEP_STRESSFUL_EVENING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case -1974796121:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_RECOVERY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case -1964530582:
                    if (!str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case -1934624365:
                    if (!str.equals("JET_LAG_POS_GOOD_SLEEP")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case -1764784360:
                    if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_LATE_TIMING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf7;
                    }
                    break;
                case -1715277096:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_RECOVERY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case -1712426260:
                    if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case -1692097007:
                    if (!str.equals("JET_LAG_POS_FAIR_SLEEP_GOOD_DURATION")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case -1548876549:
                    if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_VIGOROUS_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case -1458459965:
                    if (!str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_EXCELLENT_TIMING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf7;
                    }
                    break;
                case -1456548548:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case -1352916767:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case -1185500755:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case -1070080545:
                    numValueOf2 = !str.equals("MOD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_INACTIVITY") ? null : Integer.valueOf(R.string.lbl_sleep_tip_for_daily_physical_activity);
                    break;
                case -1004421699:
                    if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_VIGOROUS_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case -871535295:
                    if (!str.equals("RHYTHM_NEG_GOOD_SLEEP_REALLY_LATE_TIMING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf7;
                    }
                    break;
                case -312571478:
                    if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_POOR_RECOVERY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case -164543338:
                    if (!str.equals("RHYTHM_NEG_POOR_SLEEP_LATE_TIMING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf7;
                    }
                    break;
                case -156141457:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case -138334424:
                    if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case -110682384:
                    if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_STRENUOUS")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf9;
                    }
                    break;
                case -98597330:
                    if (!str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_INACTIVE")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case 279339452:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 381301552:
                    if (!str.equals("JET_LAG_POS_EXCELLENT_SLEEP")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 385328375:
                    if (!str.equals("STRESS_NEG_GOOD_OR_WORSE_SLEEP_STRESSFUL_DAY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case 489506092:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_UNBALANCED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 537858825:
                    if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_UNBALANCED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 559689341:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 582743520:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 605572425:
                    if (!str.equals("JET_LAG_POS_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 790685851:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_UNBALANCED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 835898872:
                    if (!str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case 840039230:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 907308984:
                    if (!str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case 952108442:
                    if (!str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_POOR_HISTORY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case 961235130:
                    if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_REALLY_LATE_TIMING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf7;
                    }
                    break;
                case 1006390242:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 1071824584:
                    if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_MODERATE_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case 1167479181:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 1358439350:
                    if (!str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case 1476662542:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 1505689980:
                    if (!str.equals("RHYTHM_NEG_POOR_SLEEP_REALLY_LATE_TIMING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf7;
                    }
                    break;
                case 1536826146:
                    if (!str.equals("ALTITUDE_NEG_GOOD_OR_FAIR_SLEEP")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf8;
                    }
                    break;
                case 1542767661:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 1607587984:
                    if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_DURING_DAY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf9;
                    }
                    break;
                case 1616279434:
                    if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_MODERATE_CLOSE_BED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf10;
                    }
                    break;
                case 1704858893:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 1704928624:
                    if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_RESTLESS_OR_INTERRUPTED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                case 1725196268:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 1745533643:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf5;
                    }
                    break;
                case 1769181128:
                    if (!str.equals("STRESS_NEG_POOR_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case 1863924552:
                    if (!str.equals("ALTITUDE_NEG_FAIR_SLEEP")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf8;
                    }
                    break;
                case 1907843600:
                    if (!str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf2 = null;
                    }
                    break;
                case 1924326051:
                    if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_STRESSFUL_EVENING")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf6;
                    }
                    break;
                case 1936485662:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = numValueOf4;
                    }
                    break;
                default:
                    numValueOf2 = null;
                    break;
            }
            if (numValueOf2 != null) {
                numValueOf2 = numValueOf3;
                return this.f105510a.getString(numValueOf2.intValue());
            }
        } else {
            Integer numValueOf11 = Integer.valueOf(R.string.lbl_sleep_tip_for_high_activity_strain);
            Integer numValueOf12 = Integer.valueOf(R.string.lbl_sleep_tip_for_timing_activities);
            switch (str.hashCode()) {
                case -2063809082:
                    if (!str.equals("ALTITUDE_NEG_POOR_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf8;
                    }
                    break;
                case -1981236665:
                    if (!str.equals("STRESS_NEG_POOR_SLEEP_STRESSFUL_EVENING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case -1974796121:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_RECOVERY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -1964530582:
                    if (!str.equals("STRESS_POS_EXCELLENT_OR_GOOD_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case -1934624365:
                    if (!str.equals("JET_LAG_POS_GOOD_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -1764784360:
                    if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_LATE_TIMING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case -1715277096:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_RECOVERY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -1712426260:
                    if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case -1692097007:
                    if (!str.equals("JET_LAG_POS_FAIR_SLEEP_GOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -1548876549:
                    if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_VIGOROUS_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case -1458459965:
                    if (!str.equals("RHYTHM_POS_FAIR_OR_POOR_SLEEP_EXCELLENT_TIMING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case -1456548548:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -1393753093:
                    if (!str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_HARD_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case -1352916767:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case -1185500755:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case -1070080545:
                    numValueOf = !str.equals("MOD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_INACTIVITY") ? null : Integer.valueOf(R.string.lbl_sleep_tip_for_daily_physical_activity);
                    break;
                case -1004421699:
                    if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_VIGOROUS_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case -871535295:
                    if (!str.equals("RHYTHM_NEG_GOOD_SLEEP_REALLY_LATE_TIMING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case -312571478:
                    if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_POOR_RECOVERY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case -164543338:
                    if (!str.equals("RHYTHM_NEG_POOR_SLEEP_LATE_TIMING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case -156141457:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case -138334424:
                    if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case -110682384:
                    if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_STRENUOUS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf11;
                    }
                    break;
                case -98597330:
                    if (!str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_INACTIVE")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 279339452:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 381301552:
                    if (!str.equals("JET_LAG_POS_EXCELLENT_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 385328375:
                    if (!str.equals("STRESS_NEG_GOOD_OR_WORSE_SLEEP_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 489506092:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_UNBALANCED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 537858825:
                    if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_UNBALANCED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 559689341:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 582743520:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 605572425:
                    if (!str.equals("JET_LAG_POS_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 790685851:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_UNBALANCED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 835898872:
                    if (!str.equals("HARD_EXERCISE_POS_EXCELLENT_OR_GOOD_SLEEP_STRENUOUS_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case 840039230:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_NOTGOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 907308984:
                    if (!str.equals("HARD_EXERCISE_POS_FAIR_SLEEP_HARD_TO_STRENUOUS_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case 952108442:
                    if (!str.equals("STRESS_NEG_FAIR_OR_POOR_SLEEP_STRESSFUL_DAY_POOR_HISTORY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 961235130:
                    if (!str.equals("RHYTHM_NEG_FAIR_SLEEP_REALLY_LATE_TIMING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case 1006390242:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 1071824584:
                    if (!str.equals("MOD_EXERCISE_NEG_FAIR_SLEEP_MODERATE_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case 1167479181:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 1358439350:
                    if (!str.equals("MOD_EXERCISE_POS_FAIR_SLEEP_MOD_TO_VIG_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case 1476662542:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_RESTLESS")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 1505689980:
                    if (!str.equals("RHYTHM_NEG_POOR_SLEEP_REALLY_LATE_TIMING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf7;
                    }
                    break;
                case 1536826146:
                    if (!str.equals("ALTITUDE_NEG_GOOD_OR_FAIR_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf8;
                    }
                    break;
                case 1542767661:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_GOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 1607587984:
                    if (!str.equals("HARD_EXERCISE_NEG_FAIR_OR_POOR_SLEEP_HARD_DURING_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf11;
                    }
                    break;
                case 1616279434:
                    if (!str.equals("MOD_EXERCISE_NEG_POOR_SLEEP_MODERATE_CLOSE_BED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf12;
                    }
                    break;
                case 1704858893:
                    if (!str.equals("PREGNANCY_1TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 1704928624:
                    if (!str.equals("JET_LAG_NEG_GOOD_SLEEP_RESTLESS_OR_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                case 1725196268:
                    if (!str.equals("PREGNANCY_2TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 1745533643:
                    if (!str.equals("PREGNANCY_3TRIM_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf5;
                    }
                    break;
                case 1769181128:
                    if (!str.equals("STRESS_NEG_POOR_SLEEP_VERY_STRESSFUL_DAY")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 1863924552:
                    if (!str.equals("ALTITUDE_NEG_FAIR_SLEEP")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf8;
                    }
                    break;
                case 1907843600:
                    if (!str.equals("PREGNANCY_POSTP_NEG_GOOD_OR_WORSE_SLEEP_GOOD_DURATION_POOR_QUALITY")) {
                        numValueOf = null;
                    }
                    break;
                case 1924326051:
                    if (!str.equals("STRESS_NEG_GOOD_OR_FAIR_SLEEP_STRESSFUL_EVENING")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf6;
                    }
                    break;
                case 1936485662:
                    if (!str.equals("JET_LAG_NEG_FAIR_OR_POOR_SLEEP_NOTGOOD_DURATION_RESTLESS_OR_INTERRUPTED")) {
                        numValueOf = null;
                    } else {
                        numValueOf = numValueOf4;
                    }
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            if (numValueOf != null) {
                numValueOf = numValueOf3;
                return this.f105510a.getString(numValueOf.intValue());
            }
        }
        numValueOf = numValueOf3;
        numValueOf2 = numValueOf3;
        return null;
    }
}

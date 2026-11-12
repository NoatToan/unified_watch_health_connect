package km1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkm1/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isPerformance", "<init>", "(Landroid/content/Context;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f105519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105520b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105521a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.SLEEP_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.ACTIVITY_HISTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.NAPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105521a = iArr;
        }
    }

    public f(Context context, boolean z14) {
        context.getClass();
        this.f105519a = context;
        this.f105520b = z14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    public final String a(String str) {
        Integer numValueOf;
        switch (str.hashCode()) {
            case -2117576890:
                if (!str.equals("LATE_TIMING_IDEAL_DURATION_LOW_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_duration_of_your_nap_200);
                }
                break;
            case -2110110418:
                if (!str.equals("LATE_TIMING_IDEAL_DURATION_HIGH_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_duration_of_your_nap_244);
                }
                break;
            case -1610640608:
                if (!str.equals("IDEAL_TIMING_LONG_DURATION_HIGH_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_timing_of_your_nap_225);
                }
                break;
            case -1489616584:
                if (!str.equals("MULTIPLE_NAPS_DURING_DAY")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_pay_attention_to_your_napping_236);
                }
                break;
            case -1408728300:
                if (!str.equals("IDEAL_TIMING_LONG_DURATION_LOW_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_timing_of_your_nap_197);
                }
                break;
            case -942192681:
                if (!str.equals("IDEAL_TIMING_IDEAL_DURATION_LOW_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_timing_and_duration_of_low_need);
                }
                break;
            case -753907259:
                if (!str.equals("LATE_TIMING_LONG_DURATION_LOW_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_to_optimize_your_naps_and_130);
                }
                break;
            case -443446848:
                if (!str.equals("JETLAG_LATE_TIMING_IDEAL_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_duration_of_your_nap_229);
                }
                break;
            case -45072846:
                if (!str.equals("JETLAG_IDEAL_TIMING_LONG_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_timing_of_your_nap_217);
                }
                break;
            case -32938307:
                if (!str.equals("IDEAL_TIMING_IDEAL_DURATION_HIGH_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_timing_and_duration_of_high_need);
                }
                break;
            case 2402104:
                str.equals("NONE");
                numValueOf = null;
                break;
            case 29716565:
                if (!str.equals("JETLAG_LATE_TIMING_LONG_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_to_recover_from_jet_lag_172);
                }
                break;
            case 79398603:
                if (!str.equals("LONG_DURATION_HIGH_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_your_body_needed_this_rest_112);
                }
                break;
            case 747846530:
                if (!str.equals("IDEAL_DURATION_LOW_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_duration_of_your_nap_94);
                }
                break;
            case 818669682:
                if (!str.equals("IDEAL_DURATION_HIGH_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_the_duration_of_your_nap_126);
                }
                break;
            case 1508942479:
                if (!str.equals("LATE_TIMING_LONG_DURATION_HIGH_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_your_body_needed_this_rest_146);
                }
                break;
            case 1533048707:
                if (!str.equals("JETLAG_IDEAL_TIMING_IDEAL_DURATION")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_well_done_your_naps_timing_160);
                }
                break;
            case 1970925065:
                if (!str.equals("LONG_DURATION_LOW_NEED")) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(R.string.msg_to_avoid_feeling_groggy_or_97);
                }
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            return this.f105519a.getString(numValueOf.intValue());
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String b(c0 c0Var, String str) {
        Integer num;
        Integer numValueOf;
        Integer num2;
        Integer num3;
        Integer numValueOf2;
        Integer num4;
        Integer numValueOf3 = Integer.valueOf(R.string.msg_youve_had_low_quality_sleep_73);
        Integer numValueOf4 = Integer.valueOf(R.string.msg_theres_not_enough_data_on_136);
        Integer numValueOf5 = Integer.valueOf(R.string.msg_youve_had_high_quality_sleep_73);
        Integer numValueOf6 = Integer.valueOf(R.string.msg_your_sleep_duration_has_been_90);
        Integer numValueOf7 = Integer.valueOf(R.string.msg_youve_had_a_pattern_of_167);
        Integer numValueOf8 = Integer.valueOf(R.string.msg_youve_had_good_sleep_duration_105);
        Integer numValueOf9 = Integer.valueOf(R.string.msg_you_had_a_very_active_82);
        Integer numValueOf10 = Integer.valueOf(R.string.msg_theres_not_enough_data_on_121);
        Integer numValueOf11 = Integer.valueOf(R.string.msg_your_recent_hrv_readings_are_101);
        Integer numValueOf12 = Integer.valueOf(R.string.msg_your_hrv_has_been_lower_119);
        Integer numValueOf13 = Integer.valueOf(R.string.msg_your_hrv_readings_are_showing_143);
        c0Var.getClass();
        if (str == null) {
            return null;
        }
        boolean z14 = this.f105520b;
        Context context = this.f105519a;
        if (z14) {
            int i14 = a.f105521a[c0Var.ordinal()];
            if (i14 == 1) {
                switch (str.hashCode()) {
                    case -1781646060:
                        if (!str.equals("INCREASING_LOW_QUALITY")) {
                            num3 = null;
                        }
                        break;
                    case -1437628568:
                        num3 = !str.equals("NO_DATA") ? null : numValueOf4;
                        break;
                    case -1079203034:
                        num3 = !str.equals("DECREASING_HIGH_QUALITY") ? null : numValueOf5;
                        break;
                    case 1395699694:
                        num3 = !str.equals("NO_CHANGE") ? null : numValueOf6;
                        break;
                    case 1894907519:
                        num3 = !str.equals("INCREASING") ? null : numValueOf7;
                        break;
                    case 1964696027:
                        num3 = !str.equals("DECREASING") ? null : numValueOf8;
                        break;
                    default:
                        num3 = null;
                        break;
                }
                if (num3 != null) {
                    num3 = numValueOf3;
                    return context.getString(num3.intValue());
                }
                num3 = numValueOf3;
                return null;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 == 4) {
                        return a(str);
                    }
                    u0.r();
                    return null;
                }
                switch (str.hashCode()) {
                    case -1437628568:
                        if (!str.equals("NO_DATA")) {
                            num4 = null;
                        }
                        break;
                    case 1395699694:
                        num4 = !str.equals("NO_CHANGE") ? null : numValueOf11;
                        break;
                    case 1894907519:
                        num4 = !str.equals("INCREASING") ? null : numValueOf12;
                        break;
                    case 1964696027:
                        num4 = !str.equals("DECREASING") ? null : numValueOf13;
                        break;
                    default:
                        num4 = null;
                        break;
                }
                if (num4 != null) {
                    num4 = numValueOf10;
                    return context.getString(num4.intValue());
                }
                num4 = numValueOf10;
                return null;
            }
            switch (str.hashCode()) {
                case -1298475371:
                    if (!str.equals("DAILY_ACTIVITY")) {
                        numValueOf2 = null;
                    }
                    break;
                case -1253335167:
                    numValueOf2 = !str.equals("DAILY_ACTIVITY_AND_TODAYS_LOAD") ? null : Integer.valueOf(R.string.msg_you_had_hard_training_today_111);
                    break;
                case -803541935:
                    numValueOf2 = !str.equals("LOW_ACWR_BUT_CHRONIC") ? null : Integer.valueOf(R.string.msg_your_training_has_been_lighter_201);
                    break;
                case -220647374:
                    numValueOf2 = !str.equals("TODAYS_LOAD_AND_CHRONIC") ? null : Integer.valueOf(R.string.msg_you_had_a_hard_training_149);
                    break;
                case -149308493:
                    numValueOf2 = !str.equals("TODAYS_LOAD") ? null : Integer.valueOf(R.string.msg_you_had_a_hard_effort_128);
                    break;
                case 724397305:
                    numValueOf2 = !str.equals("HIGH_ACWR_AND_CHRONIC") ? null : Integer.valueOf(R.string.msg_your_training_load_has_been_134);
                    break;
                case 1071262280:
                    numValueOf2 = !str.equals("DAILY_ACTIVITY_AND_HIGH_ACWR") ? null : Integer.valueOf(R.string.msg_youve_had_a_high_training_149);
                    break;
                case 1395591188:
                    numValueOf2 = !str.equals("DAILY_ACTIVITY_AND_CHRONIC") ? null : Integer.valueOf(R.string.msg_youve_been_training_actively_over_182);
                    break;
                case 1395699694:
                    numValueOf2 = !str.equals("NO_CHANGE") ? null : Integer.valueOf(R.string.msg_training_is_not_causing_any_56);
                    break;
                case 1472662854:
                    numValueOf2 = !str.equals("CHRONIC") ? null : Integer.valueOf(R.string.msg_youve_been_training_actively_over_121);
                    break;
                case 2122689274:
                    numValueOf2 = !str.equals("HIGH_ACWR") ? null : Integer.valueOf(R.string.msg_youve_had_a_high_training_142);
                    break;
                default:
                    numValueOf2 = null;
                    break;
            }
            if (numValueOf2 != null) {
                numValueOf2 = numValueOf9;
                return context.getString(numValueOf2.intValue());
            }
            numValueOf2 = numValueOf9;
            return null;
        }
        int i15 = a.f105521a[c0Var.ordinal()];
        if (i15 == 1) {
            switch (str.hashCode()) {
                case -1781646060:
                    if (!str.equals("INCREASING_LOW_QUALITY")) {
                        num = null;
                    }
                    break;
                case -1437628568:
                    num = !str.equals("NO_DATA") ? null : numValueOf4;
                    break;
                case -1079203034:
                    num = !str.equals("DECREASING_HIGH_QUALITY") ? null : numValueOf5;
                    break;
                case 1395699694:
                    num = !str.equals("NO_CHANGE") ? null : numValueOf6;
                    break;
                case 1894907519:
                    num = !str.equals("INCREASING") ? null : numValueOf7;
                    break;
                case 1964696027:
                    num = !str.equals("DECREASING") ? null : numValueOf8;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num != null) {
                num = numValueOf3;
                return context.getString(num.intValue());
            }
            num = numValueOf3;
            return null;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                if (i15 == 4) {
                    return a(str);
                }
                u0.r();
                return null;
            }
            switch (str.hashCode()) {
                case -1437628568:
                    if (!str.equals("NO_DATA")) {
                        num2 = null;
                    }
                    break;
                case 1395699694:
                    num2 = !str.equals("NO_CHANGE") ? null : numValueOf11;
                    break;
                case 1894907519:
                    num2 = !str.equals("INCREASING") ? null : numValueOf12;
                    break;
                case 1964696027:
                    num2 = !str.equals("DECREASING") ? null : numValueOf13;
                    break;
                default:
                    num2 = null;
                    break;
            }
            if (num2 != null) {
                num2 = numValueOf10;
                return context.getString(num2.intValue());
            }
            num2 = numValueOf10;
            return null;
        }
        switch (str.hashCode()) {
            case -1298475371:
                if (!str.equals("DAILY_ACTIVITY")) {
                    numValueOf = null;
                }
                break;
            case -1253335167:
                numValueOf = !str.equals("DAILY_ACTIVITY_AND_TODAYS_LOAD") ? null : Integer.valueOf(R.string.msg_you_had_a_very_active_108);
                break;
            case -803541935:
                numValueOf = !str.equals("LOW_ACWR_BUT_CHRONIC") ? null : Integer.valueOf(R.string.msg_youve_been_less_active_recently_210);
                break;
            case -220647374:
                numValueOf = !str.equals("TODAYS_LOAD_AND_CHRONIC") ? null : Integer.valueOf(R.string.msg_youve_been_more_active_than_151);
                break;
            case -149308493:
                numValueOf = !str.equals("TODAYS_LOAD") ? null : Integer.valueOf(R.string.msg_you_were_very_active_today_165);
                break;
            case 724397305:
                numValueOf = !str.equals("HIGH_ACWR_AND_CHRONIC") ? null : Integer.valueOf(R.string.msg_youve_been_more_active_recently_160);
                break;
            case 1071262280:
                numValueOf = !str.equals("DAILY_ACTIVITY_AND_HIGH_ACWR") ? null : Integer.valueOf(R.string.msg_youve_had_higher_activity_levels_112);
                break;
            case 1395591188:
                numValueOf = !str.equals("DAILY_ACTIVITY_AND_CHRONIC") ? null : Integer.valueOf(R.string.msg_youve_had_high_activity_levels_165);
                break;
            case 1395699694:
                numValueOf = !str.equals("NO_CHANGE") ? null : Integer.valueOf(R.string.msg_your_recent_activities_are_not_71);
                break;
            case 1472662854:
                numValueOf = !str.equals("CHRONIC") ? null : Integer.valueOf(R.string.msg_your_high_activity_levels_over_169);
                break;
            case 2122689274:
                numValueOf = !str.equals("HIGH_ACWR") ? null : Integer.valueOf(R.string.msg_your_higher_recent_activity_levels_154);
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            numValueOf = numValueOf9;
            return context.getString(numValueOf.intValue());
        }
        numValueOf = numValueOf9;
        return null;
    }
}

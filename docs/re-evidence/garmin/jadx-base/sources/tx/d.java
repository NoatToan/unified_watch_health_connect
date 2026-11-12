package tx;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltx/d;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f166811a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166812a;

        static {
            int[] iArr = new int[cx.d.values().length];
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_NO_GOOD_FACTOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_RECOVERY_SCORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_SLEEP_DURATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_HIGH_BB_BEFORE_SLEEP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_HIGH_BB_YESTERDAY_MORNING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_HIGH_HRV.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_RECOVERY_SCORE_SLEEP_DURATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_RECOVERY_SCORE_HIGH_BB_BEFORE_SLEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_RECOVERY_SCORE_HIGH_BB_YESTERDAY_MORNING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_RECOVERY_SCORE_HIGH_HRV.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_SLEEP_DURATION_HIGH_BB_BEFORE_SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_SLEEP_DURATION_HIGH_BB_YESTERDAY_MORNING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_GOOD_SLEEP_DURATION_HIGH_HRV.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_HIGH_BB_BEFORE_SLEEP_BB_YESTERDAY_MORNING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_HIGH_BB_BEFORE_SLEEP_HRV.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_HIGH_BB_YESTERDAY_MORNING_HRV.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_NO_GOOD_FACTOR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_GOOD_RECOVERY_SCORE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_GOOD_SLEEP_DURATION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_HIGH_HRV.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_GOOD_RECOVERY_SCORE_SLEEP_DURATION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_GOOD_RECOVERY_SCORE_HIGH_HRV.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_BB_BEFORE_SLEEP_AT_LEAST_2_CATEGORY_LOWER_GOOD_SLEEP_DURATION_HIGH_HRV.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_NO_GOOD_FACTOR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_RECOVERY_SCORE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_SLEEP_DURATION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_HIGH_BB_BEFORE_SLEEP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_HIGH_HRV.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_RECOVERY_SCORE_SLEEP_DURATION.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_RECOVERY_SCORE_HIGH_BB_BEFORE_SLEEP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_RECOVERY_SCORE_HIGH_HRV.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_SLEEP_DURATION_HIGH_BB_BEFORE_SLEEP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_GOOD_SLEEP_DURATION_HIGH_HRV.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_HIGH_MODERATE_JET_LAG_HIGH_BB_BEFORE_SLEEP_HRV.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_EVENT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_NO_POOR_FACTOR.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_RECOVERY_SCORE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_SLEEP_DURATION.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_LOW_BB_BEFORE_SLEEP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_LOW_BB_YESTERDAY_MORNING.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_LOW_HRV.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_RECOVERY_SCORE_SLEEP_DURATION.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_RECOVERY_SCORE_LOW_BB_BEFORE_SLEEP.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_RECOVERY_SCORE_LOW_BB_YESTERDAY_MORNING.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_RECOVERY_SCORE_LOW_HRV.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_SLEEP_DURATION_LOW_BB_BEFORE_SLEEP.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_SLEEP_DURATION_LOW_BB_YESTERDAY_MORNING.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_POOR_SLEEP_DURATION_LOW_HRV.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_LOW_BB_BEFORE_SLEEP_BB_YESTERDAY_MORNING.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_LOW_BB_BEFORE_SLEEP_HRV.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_SHORT_SLEEP_LOW_BB_YESTERDAY_MORNING_HRV.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_NO_POOR_FACTOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_POOR_RECOVERY_SCORE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_BB_BEFORE_SLEEP.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_BB_YESTERDAY_MORNING.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_HRV.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_POOR_RECOVERY_SCORE_LOW_BB_BEFORE_SLEEP.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_POOR_RECOVERY_SCORE_LOW_BB_YESTERDAY_MORNING.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_RECOVERY_SCORE_HRV.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_BB_BEFORE_SLEEP_BB_YESTERDAY_MORNING.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_BB_BEFORE_SLEEP_HRV.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_GOOD_SLEEP_DURATION_LOW_BB_YESTERDAY_MORNING_HRV.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_NO_POOR_FACTOR.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_RECOVERY_SCORE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_SLEEP_DURATION.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_LOW_BB_BEFORE_SLEEP.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_LOW_HRV.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_RECOVERY_SCORE_SLEEP_DURATION.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_RECOVERY_SCORE_LOW_BB_BEFORE_SLEEP.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_RECOVERY_SCORE_LOW_HRV.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_SLEEP_DURATION_LOW_BB_BEFORE_SLEEP.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_POOR_SLEEP_DURATION_LOW_HRV.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_LOW_JET_LAG_LOW_BB_BEFORE_SLEEP_HRV.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_EVENT.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_NO_POOR_FACTOR.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_RECOVERY_SCORE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_SLEEP_DURATION.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_LOW_BB_BEFORE_SLEEP.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_LOW_BB_YESTERDAY_MORNING.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_LOW_HRV.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_RECOVERY_SCORE_SLEEP_DURATION.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_RECOVERY_SCORE_LOW_BB_BEFORE_SLEEP.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_RECOVERY_SCORE_LOW_BB_YESTERDAY_MORNING.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_RECOVERY_SCORE_LOW_HRV.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_SLEEP_DURATION_LOW_BB_BEFORE_SLEEP.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_SLEEP_DURATION_LOW_BB_YESTERDAY_MORNING.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_POOR_SLEEP_DURATION_LOW_HRV.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_LOW_BB_BEFORE_SLEEP_BB_YESTERDAY_MORNING.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_LOW_BB_BEFORE_SLEEP_HRV.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_LOW_BB_YESTERDAY_MORNING_HRV.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_VERY_LOW_JET_LAG.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_MORNING_FEEDBACK_NO_DATA.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_NO_DATA.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_INACTIVE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_INACTIVE_AND_BB_LOW.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_INACTIVE.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_INACTIVE_AND_BB_LOW.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_INACTIVE.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_EXERCISE.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_EXERCISE_AND_BB_LOW.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_EXERCISE.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_EXERCISE_AND_BB_LOW.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_EXERCISE.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_RACE.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESSFUL_AND_RACE.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_RACE_AND_BB_LOW.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_RACE.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_INACTIVE_AND_BB_LOW.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_EXERCISE_AND_BB_LOW.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_HARD_EXERCISE_AND_BB_LOW.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_INACTIVE.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_INACTIVE_AND_BB_LOW.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_INACTIVE.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_INACTIVE_AND_BB_LOW.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_INACTIVE.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_EXERCISE.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_EXERCISE_AND_BB_LOW.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_EXERCISE.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_EXERCISE_AND_BB_LOW.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_EXERCISE.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_RACE.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESSFUL_AND_RACE.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_RACE_AND_BB_LOW.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_RACE.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_INACTIVE_AND_BB_LOW.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_EXERCISE_AND_BB_LOW.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_HARD_EXERCISE_AND_BB_LOW.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_DAY_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_INACTIVE.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INACTIVE_AND_BB_LOW.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INACTIVE.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INACTIVE_AND_BB_LOW.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INACTIVE.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_EXERCISE.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_EXERCISE_AND_BB_LOW.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_EXERCISE.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_EXERCISE_AND_BB_LOW.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_EXERCISE.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 266;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 267;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 268;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 269;
            } catch (NoSuchFieldError unused269) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 270;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 271;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 272;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 273;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 274;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 275;
            } catch (NoSuchFieldError unused275) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 276;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 277;
            } catch (NoSuchFieldError unused277) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 278;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 279;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 280;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 281;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 282;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 283;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 284;
            } catch (NoSuchFieldError unused284) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 285;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 286;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 287;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 288;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 289;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 290;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_RACE.ordinal()] = 291;
            } catch (NoSuchFieldError unused291) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 292;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 293;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 294;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESSFUL_AND_RACE.ordinal()] = 295;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 296;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 297;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_RACE_AND_BB_LOW.ordinal()] = 298;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_RACE.ordinal()] = 299;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 300;
            } catch (NoSuchFieldError unused300) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 301;
            } catch (NoSuchFieldError unused301) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_INACTIVE_AND_BB_LOW.ordinal()] = 302;
            } catch (NoSuchFieldError unused302) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 303;
            } catch (NoSuchFieldError unused303) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_EXERCISE_AND_BB_LOW.ordinal()] = 304;
            } catch (NoSuchFieldError unused304) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 305;
            } catch (NoSuchFieldError unused305) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 306;
            } catch (NoSuchFieldError unused306) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 307;
            } catch (NoSuchFieldError unused307) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_HARD_EXERCISE_AND_BB_LOW.ordinal()] = 308;
            } catch (NoSuchFieldError unused308) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 309;
            } catch (NoSuchFieldError unused309) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 310;
            } catch (NoSuchFieldError unused310) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 311;
            } catch (NoSuchFieldError unused311) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 312;
            } catch (NoSuchFieldError unused312) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 313;
            } catch (NoSuchFieldError unused313) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_INACTIVE_AND_BB_LOW.ordinal()] = 314;
            } catch (NoSuchFieldError unused314) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_INACTIVE.ordinal()] = 315;
            } catch (NoSuchFieldError unused315) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INACTIVE_AND_BB_LOW.ordinal()] = 316;
            } catch (NoSuchFieldError unused316) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 317;
            } catch (NoSuchFieldError unused317) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INACTIVE.ordinal()] = 318;
            } catch (NoSuchFieldError unused318) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INACTIVE_AND_BB_LOW.ordinal()] = 319;
            } catch (NoSuchFieldError unused319) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INACTIVE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 320;
            } catch (NoSuchFieldError unused320) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INACTIVE.ordinal()] = 321;
            } catch (NoSuchFieldError unused321) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 322;
            } catch (NoSuchFieldError unused322) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 323;
            } catch (NoSuchFieldError unused323) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_EXERCISE_AND_BB_LOW.ordinal()] = 324;
            } catch (NoSuchFieldError unused324) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_EXERCISE.ordinal()] = 325;
            } catch (NoSuchFieldError unused325) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_EXERCISE_AND_BB_LOW.ordinal()] = 326;
            } catch (NoSuchFieldError unused326) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 327;
            } catch (NoSuchFieldError unused327) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_EXERCISE.ordinal()] = 328;
            } catch (NoSuchFieldError unused328) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_EXERCISE_AND_BB_LOW.ordinal()] = 329;
            } catch (NoSuchFieldError unused329) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 330;
            } catch (NoSuchFieldError unused330) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_EXERCISE.ordinal()] = 331;
            } catch (NoSuchFieldError unused331) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 332;
            } catch (NoSuchFieldError unused332) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 333;
            } catch (NoSuchFieldError unused333) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 334;
            } catch (NoSuchFieldError unused334) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 335;
            } catch (NoSuchFieldError unused335) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 336;
            } catch (NoSuchFieldError unused336) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 337;
            } catch (NoSuchFieldError unused337) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 338;
            } catch (NoSuchFieldError unused338) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 339;
            } catch (NoSuchFieldError unused339) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 340;
            } catch (NoSuchFieldError unused340) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 341;
            } catch (NoSuchFieldError unused341) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 342;
            } catch (NoSuchFieldError unused342) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 343;
            } catch (NoSuchFieldError unused343) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 344;
            } catch (NoSuchFieldError unused344) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 345;
            } catch (NoSuchFieldError unused345) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 346;
            } catch (NoSuchFieldError unused346) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 347;
            } catch (NoSuchFieldError unused347) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 348;
            } catch (NoSuchFieldError unused348) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 349;
            } catch (NoSuchFieldError unused349) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 350;
            } catch (NoSuchFieldError unused350) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 351;
            } catch (NoSuchFieldError unused351) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 352;
            } catch (NoSuchFieldError unused352) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 353;
            } catch (NoSuchFieldError unused353) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 354;
            } catch (NoSuchFieldError unused354) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 355;
            } catch (NoSuchFieldError unused355) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 356;
            } catch (NoSuchFieldError unused356) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 357;
            } catch (NoSuchFieldError unused357) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 358;
            } catch (NoSuchFieldError unused358) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 359;
            } catch (NoSuchFieldError unused359) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW_MORNING_AND_NOW.ordinal()] = 360;
            } catch (NoSuchFieldError unused360) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 361;
            } catch (NoSuchFieldError unused361) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 362;
            } catch (NoSuchFieldError unused362) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_RACE.ordinal()] = 363;
            } catch (NoSuchFieldError unused363) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 364;
            } catch (NoSuchFieldError unused364) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 365;
            } catch (NoSuchFieldError unused365) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESSFUL_AND_RACE_AND_BB_LOW.ordinal()] = 366;
            } catch (NoSuchFieldError unused366) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESSFUL_AND_RACE.ordinal()] = 367;
            } catch (NoSuchFieldError unused367) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESSFUL_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 368;
            } catch (NoSuchFieldError unused368) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 369;
            } catch (NoSuchFieldError unused369) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_RACE_AND_BB_LOW.ordinal()] = 370;
            } catch (NoSuchFieldError unused370) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_RACE.ordinal()] = 371;
            } catch (NoSuchFieldError unused371) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_RACE_COMPLETED_AND_BB_LOW.ordinal()] = 372;
            } catch (NoSuchFieldError unused372) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 373;
            } catch (NoSuchFieldError unused373) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_INACTIVE_AND_BB_LOW.ordinal()] = 374;
            } catch (NoSuchFieldError unused374) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 375;
            } catch (NoSuchFieldError unused375) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_EXERCISE_AND_BB_LOW.ordinal()] = 376;
            } catch (NoSuchFieldError unused376) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 377;
            } catch (NoSuchFieldError unused377) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE_AND_BB_LOW.ordinal()] = 378;
            } catch (NoSuchFieldError unused378) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 379;
            } catch (NoSuchFieldError unused379) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_HARD_EXERCISE_AND_BB_LOW.ordinal()] = 380;
            } catch (NoSuchFieldError unused380) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 381;
            } catch (NoSuchFieldError unused381) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE_AND_BB_LOW.ordinal()] = 382;
            } catch (NoSuchFieldError unused382) {
            }
            try {
                iArr[cx.d.LHA_BODY_BATTERY_DYNAMIC_LONG_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 383;
            } catch (NoSuchFieldError unused383) {
            }
            f166812a = iArr;
        }
    }

    public d(l22.b bVar) {
        bVar.getClass();
        this.f166811a = bVar;
    }
}

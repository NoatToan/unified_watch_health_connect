package tx;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltx/e;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f166813a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166814a;

        static {
            int[] iArr = new int[cx.e.values().length];
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_NO_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_EXERCISE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_BALANCED_AND_EXERCISE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_RECOVERING_AND_EXERCISE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_RECOVERING_AND_INACTIVE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_BALANCED_AND_INACTIVE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_BALANCED_AND_INACTIVE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_INACTIVE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_EXERCISE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_INACTIVE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_EXERCISE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_RECOVERING_AND_EXERCISE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_EXERCISE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_BALANCED_AND_EXERCISE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_EXERCISE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_RACE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESSFUL_AND_RACE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_RACE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_MORNING_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_RACE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESSFUL_AND_RACE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_RACE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_RACE.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESSFUL_AND_RACE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_RACE.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_RECOVERING_AND_INACTIVE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INACTIVE.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INACTIVE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_DAY_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_PREPARATION_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_INACTIVE.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_INACTIVE.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INACTIVE.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INACTIVE.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_EXERCISE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_EXERCISE.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_EXERCISE.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_EXERCISE.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_EXERCISE.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_EXERCISE.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_EXERCISE.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_INTENSIVE_EXERCISE.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_INTENSIVE_EXERCISE.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_INTENSIVE_EXERCISE.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_JET_LAG_AND_STRESSFUL_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_BALANCED_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_RECOVERING_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_RACE.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESSFUL_AND_RACE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESSFUL_AND_RACE_COMPLETED.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_RACE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_RACE_COMPLETED.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_INACTIVE.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_EXERCISE.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_ACTIVE_AND_EXERCISE.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_INTENSIVE_EXERCISE.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[cx.e.LHA_BODY_BATTERY_DYNAMIC_SHORT_FEEDBACK_SLEEP_TIME_PASSED_NOT_STRESS_DATA_AND_ACTIVE_AND_INTENSIVE_EXERCISE.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            f166814a = iArr;
        }
    }

    public e(l22.b bVar) {
        bVar.getClass();
        this.f166813a = bVar;
    }
}

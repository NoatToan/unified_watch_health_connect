package is;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import lc.u0;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94880a;

        static {
            int[] iArr = new int[jr.p.values().length];
            try {
                iArr[jr.p.ACTIVE_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.p.ACTIVE_SPLIT_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.p.ACTIVE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jr.p.AAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jr.p.AMP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jr.p.AT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[jr.p.ATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[jr.p.AEROBIC_EFFECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[jr.p.AIR_TEMPERATURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[jr.p.ALTITUDE_GAIN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[jr.p.ALTITUDE_LOSS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[jr.p.ANAEROBIC_EFFECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[jr.p.ASCENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[jr.p.AVERAGE_BIKE_FORCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[jr.p.AVERAGE_CLIMB_ASCENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[jr.p.AVERAGE_CYCLING_CADENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[jr.p.AVERAGE_CYCLING_SPLIT_POWER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[jr.p.AVERAGE_DEPTH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[jr.p.AVERAGE_DISTANCE_PER_STROKE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[jr.p.AVERAGE_DIVE_VELOCITY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[jr.p.AVERAGE_FLOOR_CLIMBING_SPEED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[jr.p.AVERAGE_GRADE_ADJUSTED_PACE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[jr.p.AVERAGE_GRADE_ADJUSTED_PACE_RUN_ACTIVE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[jr.p.AVERAGE_GRADE_ADJUSTED_SPEED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[jr.p.AVERAGE_GROUND_CONTACT_TIME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[jr.p.AVERAGE_GROUND_CONTACT_TIME_ACTIVE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[jr.p.AVERAGE_GROUND_CONTACT_TIME_BALANCE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[jr.p.AVERAGE_GROUND_CONTACT_TIME_BALANCE_ACTIVE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[jr.p.AVERAGE_GROUND_SPEED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[jr.p.AVERAGE_HEART_RATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[jr.p.AVERAGE_JUMP_ROPE_SPEED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[jr.p.AVERAGE_MOVING_GROUND_SPEED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[jr.p.AVERAGE_MOVING_PACE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[jr.p.AVERAGE_MOVING_PACE_RUN_ACTIVE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[jr.p.AVERAGE_MOVING_SPEED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[jr.p.AVERAGE_MOVING_SWIMMING_PACE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[jr.p.AVERAGE_MOVING_SWIM_SPEED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[jr.p.AVERAGE_NAUTICAL_PACE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[jr.p.AVERAGE_NAUTICAL_MOVING_PACE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[jr.p.AVERAGE_NAUTICAL_MOVING_SPEED.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[jr.p.AVERAGE_NAUTICAL_STROKE_RATE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[jr.p.AVERAGE_NAUTICAL_SOG.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[jr.p.AVERAGE_NAUTICAL_SPEED.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[jr.p.AVERAGE_OFFSHORE_CADENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[jr.p.AVERAGE_ONSHORE_CADENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[jr.p.AVERAGE_PACE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[jr.p.AVERAGE_PACE_RUN_ACTIVE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[jr.p.AVERAGE_PACK_WEIGHT.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[jr.p.AVERAGE_POWER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[jr.p.AVERAGE_POWER_PER_KG.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[jr.p.AVERAGE_PUSH_CADENCE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[jr.p.AVERAGE_REPS_PER_ROUND.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[jr.p.AVERAGE_SKI_POWER.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[jr.p.AVERAGE_REPS_SET.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[jr.p.AVERAGE_RESPIRATION_RATE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[jr.p.AVERAGE_RUN_CADENCE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[jr.p.AVERAGE_RUN_CADENCE_ACTIVE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[jr.p.AVERAGE_ROWING_DISTANCE_PER_STROKE.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[jr.p.AVERAGE_ROWING_MOVING_PACE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[jr.p.AVERAGE_ROWING_MOVING_SPEED.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[jr.p.AVERAGE_ROWING_PACE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[jr.p.AVERAGE_ROWING_SPEED.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[jr.p.AVERAGE_SURFING_SPEED.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[jr.p.AVERAGE_SKI_CADENCE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[jr.p.AVERAGE_SPEED.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[jr.p.AVERAGE_SPLIT_PACE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[jr.p.AVERAGE_SPO2.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[jr.p.AVERAGE_STEP_SPEED_LOSS.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[jr.p.AVERAGE_STEP_SPEED_LOSS_PERCENT.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[jr.p.AVERAGE_STRESS.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[jr.p.AVERAGE_STRIDE_LENGTH.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[jr.p.AVERAGE_STRIDE_LENGTH_ACTIVE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[jr.p.AVERAGE_STROKE_RATE.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[jr.p.AVERAGE_STROKES.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[jr.p.AVERAGE_SWIMMING_PACE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[jr.p.AVERAGE_SWIM_CADENCE.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[jr.p.AVERAGE_SWIM_SPEED.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[jr.p.AVERAGE_SWOLF.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[jr.p.AVERAGE_TANK_PRESSURE.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[jr.p.AVERAGE_TEMPERATURE.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[jr.p.AVERAGE_TEMPO.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[jr.p.AVERAGE_TIME_PER_MOVE.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[jr.p.AVERAGE_TIME_PER_POSE.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[jr.p.AVERAGE_TIME_PER_SET.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[jr.p.AVERAGE_VERTICAL_OSCILLATION.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[jr.p.AVERAGE_VERTICAL_OSCILLATION_ACTIVE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[jr.p.AVERAGE_VERTICAL_RATIO.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[jr.p.AVERAGE_VERTICAL_RATIO_ACTIVE.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[jr.p.AVERAGE_WALK_CADENCE.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[jr.p.AVERAGE_WATER_TEMPERATURE.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[jr.p.BEGINNING_POTENTIAL.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[jr.p.BEST_GRADE_ADJUSTED_PACE.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[jr.p.BEST_LAP_AVERAGE_PACE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[jr.p.BEST_LAP_TIME.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[jr.p.BEST_NAUTICAL_PACE.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[jr.p.BEST_PACE.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[jr.p.BEST_PACE_RUN_ACTIVE.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[jr.p.BEST_ROWING_PACE.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[jr.p.BEST_SPLIT_PACE.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[jr.p.BEST_SWIMMING_PACE.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[jr.p.BEST_SWOLF.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[jr.p.BIKE_TIME.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[jr.p.BIKE_DISTANCE.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[jr.p.BIKE_SPEED.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[jr.p.BODY_BATTERY_DRAIN.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[jr.p.BOTTOM_TIME.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[jr.p.BREATH_HOLD_TIME.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[jr.p.CALORIES.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[jr.p.CALORIES_BURNED.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[jr.p.CALORIES_CONSUMED.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[jr.p.CALORIES_NET.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[jr.p.CLIMB_FALLS.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[jr.p.CLIMB_SENDS.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[jr.p.CLIMB_ROUTES_ATTEMPTED.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[jr.p.CLIMB_ROUTES_COMPLETED.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[jr.p.CLIMB_TIME.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[jr.p.COMMON_TYPE.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[jr.p.CYCLING_LIFT_TIME.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_DISTANCE.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_IDLE_TIME.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_AVG_MOVING_SPEED.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_AVG_SPEED.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_MAX_DESCENT_SPEED.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_MOVING_TIME.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[jr.p.CYCLING_RUN_TOTAL_DESCENT.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[jr.p.DANCE_TIME.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[jr.p.DESCENT.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[jr.p.DEEPEST_DIVE.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[jr.p.DISTANCE.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[jr.p.DISTANCE_METERS.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[jr.p.DISTANCE_METERS_ROUNDED.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[jr.p.DIVE_BOTTOM_TIME.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[jr.p.DIVE_DYNAMIC_AVERAGE_VELOCITY.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[jr.p.DIVE_DYNAMIC_AVG_HR.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[jr.p.DIVE_DYNAMIC_MAX_HR.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[jr.p.DIVE_DYNAMIC_MAX_VELOCITY.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[jr.p.DIVE_DYNAMIC_MIN_HR.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[jr.p.DIVE_INTERVALS.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[jr.p.DIVE_MIN_HEART_RATE.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[jr.p.DIVE_REST_AVG_HR.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[jr.p.DIVE_REST_MAX_HR.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[jr.p.DIVE_REST_MIN_HR.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[jr.p.DIVE_STA_AVG_HR.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[jr.p.DIVE_STA_MAX_HR.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[jr.p.DIVE_STA_MIN_HR.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[jr.p.DIVE_LOCATION_NAME.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[jr.p.DIVE_WEIGHT.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[jr.p.DIVING_CONSERVATISM.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[jr.p.ELAPSED_TIME.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[jr.p.ELAPSED_TIME_MILLIS.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[jr.p.DIVE_ELEVATION.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[jr.p.ENDING_POTENTIAL.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[jr.p.ENDING_STRESS_LEVEL.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[jr.p.ENTERING_CNS.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[jr.p.ENTERING_NITROGEN.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[jr.p.ENTRY_COORDINATES.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[jr.p.ENTRY_TYPE.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[jr.p.ESTIMATED_SWEAT_LOSS.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[jr.p.EXERCISE_LOAD.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[jr.p.EXERCISE_REST_TIME.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[jr.p.EXERCISE_WORK_TIME.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[jr.p.EXIT_COORDINATES.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[jr.p.FLOORS_CLIMBED.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[jr.p.FLOW.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[jr.p.FLUID_CONSUMED.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[jr.p.FLUID_NET.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[jr.p.FTP.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[jr.p.GAME_NAME.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[jr.p.GAME_TYPE.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[jr.p.GAS.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[jr.p.GAS_MIXTURE.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[jr.p.GAS_MODE.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[jr.p.GAS_TYPE.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[jr.p.GAS_VOLUME.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[jr.p.GYM_FLOORS_CLIMBED.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[jr.p.GYM_TOTAL_DISTANCE.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[jr.p.GRIT.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[jr.p.HIGH_DEPT_SET_POINT.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[jr.p.HIGH_SET_POINT.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[jr.p.IDLE_TIME.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[jr.p.INTERVALS.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[jr.p.INTENSITY_FACTOR.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[jr.p.JUMP_ROPE_MAX_STREAK.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[jr.p.JUMP_ROPE_TOTAL_REPS.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[jr.p.JUMP_TIME.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[jr.p.LAP_DISTANCE.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[jr.p.LEAVING_CNS.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[jr.p.LEAVING_NITROGEN.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[jr.p.LEFT_BALANCE.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[jr.p.LEFT_GROUND_CONTACT_TIME_BALANCE.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[jr.p.LEFT_PEAK_POWER_PHASE_INTERVAL.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[jr.p.LEFT_PEAK_POWER_PHASE_ARC_LENGTH.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[jr.p.LEFT_PCO.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[jr.p.LEFT_POWER_PHASE_INTERVAL.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[jr.p.LEFT_POWER_PHASE_ARC_LENGTH.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[jr.p.LEFT_RIGHT_BALANCE.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[jr.p.LEFT_RIGHT_PEDAL_SMOOTHNESS.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[jr.p.LEFT_RIGHT_TORQUE_EFFECTIVENESS.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[jr.p.LOCATION.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[jr.p.LONGEST_DISTANCE.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[jr.p.LONGEST_DIVE.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[jr.p.LONGEST_DIVE_DYNAMIC_DISTANCE.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[jr.p.LONGEST_DIVE_INTERVAL.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[jr.p.LONGEST_RUN.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[jr.p.LONGEST_RUN_EXTENDED.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[jr.p.LONGEST_WAVE.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[jr.p.LOW_DEPTH_SET_POINT.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[jr.p.LOW_SET_POINT.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[jr.p.LAP.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[jr.p.LMP.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[jr.p.LT.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[jr.p.LTA.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[jr.p.MAX_ALTITUDE.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[jr.p.MAX_AVERAGE_20_MINUTES.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[jr.p.MAX_BIKE_FORCE.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[jr.p.MAX_CLIMB_ASCENT.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[jr.p.MAX_CLIMB_DIFFICULTY.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[jr.p.MAX_CYCLING_CADENCE.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[jr.p.MAX_CYCLING_SPLIT_POWER.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[jr.p.MAX_DEPTH.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[jr.p.MAX_DIFFICULTY.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[jr.p.MAX_ELEVATION.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[jr.p.MAX_FLOOR_CLIMBING_SPEED.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[jr.p.MAX_GROUND_SPEED.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[jr.p.MAX_HEART_RATE.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[jr.p.MAX_JUMP_ROPE_SPEED.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[jr.p.MAX_NAUTICAL_SOG.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[jr.p.MAX_NAUTICAL_SPEED.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[jr.p.MAX_NAUTICAL_STROKE_RATE.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[jr.p.MAX_OFFSHORE_CADENCE.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[jr.p.MAX_PACK_WEIGHT.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[jr.p.MAX_POWER.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[jr.p.MAX_POWER_PER_KG.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[jr.p.MAX_PUSH_CADENCE.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[jr.p.MAX_RESPIRATION_RATE.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[jr.p.MAX_ROWING_SPEED.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[jr.p.MAX_RUN_CADENCE.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[jr.p.MAX_RUN_CADENCE_ACTIVE.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[jr.p.IMPACT_LOAD.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[jr.p.REAL_DISTANCE.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[jr.p.MAX_SPEED.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[jr.p.MAX_SPLIT_POWER.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[jr.p.MAX_SPLIT_POWER_PER_KG.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[jr.p.MAX_SKI_CADENCE.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[jr.p.MAX_SKI_POWER.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[jr.p.MAX_SPO2.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[jr.p.MAX_STRESS.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[jr.p.MAX_STROKE_RATE.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[jr.p.MAX_SURFING_SPEED.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[jr.p.MAX_SWIM_CADENCE.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[jr.p.MAX_SWIM_SPEED.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[jr.p.MAX_TANK_PRESSURE.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            try {
                iArr[jr.p.MAX_TEMPERATURE.ordinal()] = 253;
            } catch (NoSuchFieldError unused253) {
            }
            try {
                iArr[jr.p.MAX_TEMPO.ordinal()] = 254;
            } catch (NoSuchFieldError unused254) {
            }
            try {
                iArr[jr.p.MAX_WALK_CADENCE.ordinal()] = 255;
            } catch (NoSuchFieldError unused255) {
            }
            try {
                iArr[jr.p.MAX_WATER_TEMPERATURE.ordinal()] = 256;
            } catch (NoSuchFieldError unused256) {
            }
            try {
                iArr[jr.p.MIN_ACTUAL.ordinal()] = 257;
            } catch (NoSuchFieldError unused257) {
            }
            try {
                iArr[jr.p.MIN_ALTITUDE.ordinal()] = 258;
            } catch (NoSuchFieldError unused258) {
            }
            try {
                iArr[jr.p.MIN_ELEVATION.ordinal()] = 259;
            } catch (NoSuchFieldError unused259) {
            }
            try {
                iArr[jr.p.MIN_RESPIRATION_RATE.ordinal()] = 260;
            } catch (NoSuchFieldError unused260) {
            }
            try {
                iArr[jr.p.MIN_SPO2.ordinal()] = 261;
            } catch (NoSuchFieldError unused261) {
            }
            try {
                iArr[jr.p.MIN_TEMPERATURE.ordinal()] = 262;
            } catch (NoSuchFieldError unused262) {
            }
            try {
                iArr[jr.p.MIN_WATER_TEMPERATURE.ordinal()] = 263;
            } catch (NoSuchFieldError unused263) {
            }
            try {
                iArr[jr.p.MODERATE_INTENSITY.ordinal()] = 264;
            } catch (NoSuchFieldError unused264) {
            }
            try {
                iArr[jr.p.MOVING_TIME.ordinal()] = 265;
            } catch (NoSuchFieldError unused265) {
            }
            try {
                iArr[jr.p.MOVING_TIME_MILLIS.ordinal()] = 266;
            } catch (NoSuchFieldError unused266) {
            }
            try {
                iArr[jr.p.NAUTICAL_DISTANCE.ordinal()] = 267;
            } catch (NoSuchFieldError unused267) {
            }
            try {
                iArr[jr.p.NET_IMPACT.ordinal()] = 268;
            } catch (NoSuchFieldError unused268) {
            }
            try {
                iArr[jr.p.NON_PACK_CALORIES.ordinal()] = 269;
            } catch (NoSuchFieldError unused269) {
            }
            try {
                iArr[jr.p.NORMALIZED_FORCE.ordinal()] = 270;
            } catch (NoSuchFieldError unused270) {
            }
            try {
                iArr[jr.p.NORMALIZED_POWER.ordinal()] = 271;
            } catch (NoSuchFieldError unused271) {
            }
            try {
                iArr[jr.p.OBSTACLE_TIME.ordinal()] = 272;
            } catch (NoSuchFieldError unused272) {
            }
            try {
                iArr[jr.p.PACK_CALORIES.ordinal()] = 273;
            } catch (NoSuchFieldError unused273) {
            }
            try {
                iArr[jr.p.PACK_WEIGHT.ordinal()] = 274;
            } catch (NoSuchFieldError unused274) {
            }
            try {
                iArr[jr.p.POOL_SIZE.ordinal()] = 275;
            } catch (NoSuchFieldError unused275) {
            }
            try {
                iArr[jr.p.PRESSURE_RATE.ordinal()] = 276;
            } catch (NoSuchFieldError unused276) {
            }
            try {
                iArr[jr.p.PRIMARY_BENEFIT.ordinal()] = 277;
            } catch (NoSuchFieldError unused277) {
            }
            try {
                iArr[jr.p.RACE_LOCATION.ordinal()] = 278;
            } catch (NoSuchFieldError unused278) {
            }
            try {
                iArr[jr.p.RECOVERY_HEART_RATE.ordinal()] = 279;
            } catch (NoSuchFieldError unused279) {
            }
            try {
                iArr[jr.p.REST_TIME.ordinal()] = 280;
            } catch (NoSuchFieldError unused280) {
            }
            try {
                iArr[jr.p.RESTING_CALORIES.ordinal()] = 281;
            } catch (NoSuchFieldError unused281) {
            }
            try {
                iArr[jr.p.RIGHT_BALANCE.ordinal()] = 282;
            } catch (NoSuchFieldError unused282) {
            }
            try {
                iArr[jr.p.RIGHT_GROUND_CONTACT_TIME_BALANCE.ordinal()] = 283;
            } catch (NoSuchFieldError unused283) {
            }
            try {
                iArr[jr.p.RIGHT_PEAK_POWER_PHASE_INTERVAL.ordinal()] = 284;
            } catch (NoSuchFieldError unused284) {
            }
            try {
                iArr[jr.p.RIGHT_PEAK_POWER_PHASE_ARC_LENGTH.ordinal()] = 285;
            } catch (NoSuchFieldError unused285) {
            }
            try {
                iArr[jr.p.RIGHT_PCO.ordinal()] = 286;
            } catch (NoSuchFieldError unused286) {
            }
            try {
                iArr[jr.p.RIGHT_POWER_PHASE_INTERVAL.ordinal()] = 287;
            } catch (NoSuchFieldError unused287) {
            }
            try {
                iArr[jr.p.RIGHT_POWER_PHASE_ARC_LENGTH.ordinal()] = 288;
            } catch (NoSuchFieldError unused288) {
            }
            try {
                iArr[jr.p.ROAD_SURFACE_PAVED.ordinal()] = 289;
            } catch (NoSuchFieldError unused289) {
            }
            try {
                iArr[jr.p.ROAD_SURFACE_UNPAVED.ordinal()] = 290;
            } catch (NoSuchFieldError unused290) {
            }
            try {
                iArr[jr.p.ROUTES_ATTEMPTED.ordinal()] = 291;
            } catch (NoSuchFieldError unused291) {
            }
            try {
                iArr[jr.p.ROUTES_COMPLETED.ordinal()] = 292;
            } catch (NoSuchFieldError unused292) {
            }
            try {
                iArr[jr.p.ROWING_PACE.ordinal()] = 293;
            } catch (NoSuchFieldError unused293) {
            }
            try {
                iArr[jr.p.RUN_AVERAGE_PACE.ordinal()] = 294;
            } catch (NoSuchFieldError unused294) {
            }
            try {
                iArr[jr.p.RUN_DISTANCE.ordinal()] = 295;
            } catch (NoSuchFieldError unused295) {
            }
            try {
                iArr[jr.p.RUN_DISTANCE_METERS.ordinal()] = 296;
            } catch (NoSuchFieldError unused296) {
            }
            try {
                iArr[jr.p.RUN_REST_TIME.ordinal()] = 297;
            } catch (NoSuchFieldError unused297) {
            }
            try {
                iArr[jr.p.RUN_TIME.ordinal()] = 298;
            } catch (NoSuchFieldError unused298) {
            }
            try {
                iArr[jr.p.RUNS.ordinal()] = 299;
            } catch (NoSuchFieldError unused299) {
            }
            try {
                iArr[jr.p.RUNS_COUNT.ordinal()] = 300;
            } catch (NoSuchFieldError unused300) {
            }
            try {
                iArr[jr.p.SEATED_AVERAGE_POWER.ordinal()] = 301;
            } catch (NoSuchFieldError unused301) {
            }
            try {
                iArr[jr.p.SEATED_MAX_POWER.ordinal()] = 302;
            } catch (NoSuchFieldError unused302) {
            }
            try {
                iArr[jr.p.SEATED_TIME.ordinal()] = 303;
            } catch (NoSuchFieldError unused303) {
            }
            try {
                iArr[jr.p.SESSION_DIVE_TIME.ordinal()] = 304;
            } catch (NoSuchFieldError unused304) {
            }
            try {
                iArr[jr.p.SESSION_TIME.ordinal()] = 305;
            } catch (NoSuchFieldError unused305) {
            }
            try {
                iArr[jr.p.SKI_LIFT_TIME.ordinal()] = 306;
            } catch (NoSuchFieldError unused306) {
            }
            try {
                iArr[jr.p.SKI_RUN_AVG_MOVING_SPEED.ordinal()] = 307;
            } catch (NoSuchFieldError unused307) {
            }
            try {
                iArr[jr.p.SKI_RUN_AVG_SPEED.ordinal()] = 308;
            } catch (NoSuchFieldError unused308) {
            }
            try {
                iArr[jr.p.SKI_RUN_DISTANCE.ordinal()] = 309;
            } catch (NoSuchFieldError unused309) {
            }
            try {
                iArr[jr.p.SKI_RUN_IDLE_TIME.ordinal()] = 310;
            } catch (NoSuchFieldError unused310) {
            }
            try {
                iArr[jr.p.SKI_RUN_MAX_SPEED.ordinal()] = 311;
            } catch (NoSuchFieldError unused311) {
            }
            try {
                iArr[jr.p.SKI_RUN_MOVING_TIME.ordinal()] = 312;
            } catch (NoSuchFieldError unused312) {
            }
            try {
                iArr[jr.p.SKI_RUN_TOTAL_DESCENT.ordinal()] = 313;
            } catch (NoSuchFieldError unused313) {
            }
            try {
                iArr[jr.p.SONG_COUNT.ordinal()] = 314;
            } catch (NoSuchFieldError unused314) {
            }
            try {
                iArr[jr.p.STANDING_AVERAGE_POWER.ordinal()] = 315;
            } catch (NoSuchFieldError unused315) {
            }
            try {
                iArr[jr.p.STANDING_MAX_POWER.ordinal()] = 316;
            } catch (NoSuchFieldError unused316) {
            }
            try {
                iArr[jr.p.STANDING_TIME.ordinal()] = 317;
            } catch (NoSuchFieldError unused317) {
            }
            try {
                iArr[jr.p.STA.ordinal()] = 318;
            } catch (NoSuchFieldError unused318) {
            }
            try {
                iArr[jr.p.START_TIME.ordinal()] = 319;
            } catch (NoSuchFieldError unused319) {
            }
            try {
                iArr[jr.p.STARTING_STRESS_LEVEL.ordinal()] = 320;
            } catch (NoSuchFieldError unused320) {
            }
            try {
                iArr[jr.p.STEPS.ordinal()] = 321;
            } catch (NoSuchFieldError unused321) {
            }
            try {
                iArr[jr.p.STRENGTH_SETS.ordinal()] = 322;
            } catch (NoSuchFieldError unused322) {
            }
            try {
                iArr[jr.p.STRESS_CHANGE.ordinal()] = 323;
            } catch (NoSuchFieldError unused323) {
            }
            try {
                iArr[jr.p.STROKES.ordinal()] = 324;
            } catch (NoSuchFieldError unused324) {
            }
            try {
                iArr[jr.p.SUIT_THICKNESS.ordinal()] = 325;
            } catch (NoSuchFieldError unused325) {
            }
            try {
                iArr[jr.p.SUIT_TYPE.ordinal()] = 326;
            } catch (NoSuchFieldError unused326) {
            }
            try {
                iArr[jr.p.SURF_DISTANCE.ordinal()] = 327;
            } catch (NoSuchFieldError unused327) {
            }
            try {
                iArr[jr.p.DISTANCE_METERS_OR_FEET.ordinal()] = 328;
            } catch (NoSuchFieldError unused328) {
            }
            try {
                iArr[jr.p.SURF_TIME.ordinal()] = 329;
            } catch (NoSuchFieldError unused329) {
            }
            try {
                iArr[jr.p.SURFACE_CONDITION.ordinal()] = 330;
            } catch (NoSuchFieldError unused330) {
            }
            try {
                iArr[jr.p.TOTAL_SURFACE_INTERVAL_TIME.ordinal()] = 331;
            } catch (NoSuchFieldError unused331) {
            }
            try {
                iArr[jr.p.SWIMMING_DISTANCE.ordinal()] = 332;
            } catch (NoSuchFieldError unused332) {
            }
            try {
                iArr[jr.p.SWIMMING_PACE.ordinal()] = 333;
            } catch (NoSuchFieldError unused333) {
            }
            try {
                iArr[jr.p.TANK_END_PRESSURE.ordinal()] = 334;
            } catch (NoSuchFieldError unused334) {
            }
            try {
                iArr[jr.p.TANK_SIZE.ordinal()] = 335;
            } catch (NoSuchFieldError unused335) {
            }
            try {
                iArr[jr.p.TANK_START_PRESSURE.ordinal()] = 336;
            } catch (NoSuchFieldError unused336) {
            }
            try {
                iArr[jr.p.TANK_TYPE.ordinal()] = 337;
            } catch (NoSuchFieldError unused337) {
            }
            try {
                iArr[jr.p.TANK_USED_PRESSURE.ordinal()] = 338;
            } catch (NoSuchFieldError unused338) {
            }
            try {
                iArr[jr.p.TIME.ordinal()] = 339;
            } catch (NoSuchFieldError unused339) {
            }
            try {
                iArr[jr.p.TOP_SONG_TEMPO.ordinal()] = 340;
            } catch (NoSuchFieldError unused340) {
            }
            try {
                iArr[jr.p.TA.ordinal()] = 341;
            } catch (NoSuchFieldError unused341) {
            }
            try {
                iArr[jr.p.TOTAL_ASCENT.ordinal()] = 342;
            } catch (NoSuchFieldError unused342) {
            }
            try {
                iArr[jr.p.TOTAL_CLIMB_ASCENT.ordinal()] = 343;
            } catch (NoSuchFieldError unused343) {
            }
            try {
                iArr[jr.p.TOTAL_CYCLING_STROKES.ordinal()] = 344;
            } catch (NoSuchFieldError unused344) {
            }
            try {
                iArr[jr.p.TOTAL_DESCENT.ordinal()] = 345;
            } catch (NoSuchFieldError unused345) {
            }
            try {
                iArr[jr.p.TOTAL_DISTANCE.ordinal()] = 346;
            } catch (NoSuchFieldError unused346) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_DYNAMIC_DISTANCE.ordinal()] = 347;
            } catch (NoSuchFieldError unused347) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_DYNAMIC_INTERVALS.ordinal()] = 348;
            } catch (NoSuchFieldError unused348) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_DYNAMIC_TIME.ordinal()] = 349;
            } catch (NoSuchFieldError unused349) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_REST_INTERVALS.ordinal()] = 350;
            } catch (NoSuchFieldError unused350) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_REST_TIME.ordinal()] = 351;
            } catch (NoSuchFieldError unused351) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_STATIC_INTERVALS.ordinal()] = 352;
            } catch (NoSuchFieldError unused352) {
            }
            try {
                iArr[jr.p.TOTAL_DIVE_STATIC_TIME.ordinal()] = 353;
            } catch (NoSuchFieldError unused353) {
            }
            try {
                iArr[jr.p.TOTAL_DIVES.ordinal()] = 354;
            } catch (NoSuchFieldError unused354) {
            }
            try {
                iArr[jr.p.TOTAL_FLOORS_ASCENT.ordinal()] = 355;
            } catch (NoSuchFieldError unused355) {
            }
            try {
                iArr[jr.p.TOTAL_FLOORS_DESCENT.ordinal()] = 356;
            } catch (NoSuchFieldError unused356) {
            }
            try {
                iArr[jr.p.TOTAL_HIIT_REPS.ordinal()] = 357;
            } catch (NoSuchFieldError unused357) {
            }
            try {
                iArr[jr.p.TOTAL_HIIT_SETS.ordinal()] = 358;
            } catch (NoSuchFieldError unused358) {
            }
            try {
                iArr[jr.p.TOTAL_HIIT_VOLUME.ordinal()] = 359;
            } catch (NoSuchFieldError unused359) {
            }
            try {
                iArr[jr.p.TOTAL_INTENSITY.ordinal()] = 360;
            } catch (NoSuchFieldError unused360) {
            }
            try {
                iArr[jr.p.TOTAL_JUMPS.ordinal()] = 361;
            } catch (NoSuchFieldError unused361) {
            }
            try {
                iArr[jr.p.TOTAL_LAPS.ordinal()] = 362;
            } catch (NoSuchFieldError unused362) {
            }
            try {
                iArr[jr.p.TOTAL_MOVES.ordinal()] = 363;
            } catch (NoSuchFieldError unused363) {
            }
            try {
                iArr[jr.p.TOTAL_POSES.ordinal()] = 364;
            } catch (NoSuchFieldError unused364) {
            }
            try {
                iArr[jr.p.TOTAL_PUSHES.ordinal()] = 365;
            } catch (NoSuchFieldError unused365) {
            }
            try {
                iArr[jr.p.TOTAL_ROWING_STROKES.ordinal()] = 366;
            } catch (NoSuchFieldError unused366) {
            }
            try {
                iArr[jr.p.TOTAL_SETS.ordinal()] = 367;
            } catch (NoSuchFieldError unused367) {
            }
            try {
                iArr[jr.p.TOTAL_SWIMMING_STROKES.ordinal()] = 368;
            } catch (NoSuchFieldError unused368) {
            }
            try {
                iArr[jr.p.TOTAL_TIME.ordinal()] = 369;
            } catch (NoSuchFieldError unused369) {
            }
            try {
                iArr[jr.p.TOTAL_TIME_MILLIS.ordinal()] = 370;
            } catch (NoSuchFieldError unused370) {
            }
            try {
                iArr[jr.p.TOTAL_TIME_MILLIS_EXTENDED_PRECISION.ordinal()] = 371;
            } catch (NoSuchFieldError unused371) {
            }
            try {
                iArr[jr.p.TOTAL_FLYING_TIME.ordinal()] = 372;
            } catch (NoSuchFieldError unused372) {
            }
            try {
                iArr[jr.p.TOTAL_REPS.ordinal()] = 373;
            } catch (NoSuchFieldError unused373) {
            }
            try {
                iArr[jr.p.TOTAL_REST.ordinal()] = 374;
            } catch (NoSuchFieldError unused374) {
            }
            try {
                iArr[jr.p.TOTAL_ROUNDS.ordinal()] = 375;
            } catch (NoSuchFieldError unused375) {
            }
            try {
                iArr[jr.p.TOTAL_ROUTES.ordinal()] = 376;
            } catch (NoSuchFieldError unused376) {
            }
            try {
                iArr[jr.p.TOTAL_RUN_DISTANCE.ordinal()] = 377;
            } catch (NoSuchFieldError unused377) {
            }
            try {
                iArr[jr.p.TOTAL_RUNS.ordinal()] = 378;
            } catch (NoSuchFieldError unused378) {
            }
            try {
                iArr[jr.p.TOTAL_VOLUME.ordinal()] = 379;
            } catch (NoSuchFieldError unused379) {
            }
            try {
                iArr[jr.p.TOTAL_WAVES.ordinal()] = 380;
            } catch (NoSuchFieldError unused380) {
            }
            try {
                iArr[jr.p.TRAINING_STRESS_SCORE.ordinal()] = 381;
            } catch (NoSuchFieldError unused381) {
            }
            try {
                iArr[jr.p.UAP.ordinal()] = 382;
            } catch (NoSuchFieldError unused382) {
            }
            try {
                iArr[jr.p.UMP.ordinal()] = 383;
            } catch (NoSuchFieldError unused383) {
            }
            try {
                iArr[jr.p.UT.ordinal()] = 384;
            } catch (NoSuchFieldError unused384) {
            }
            try {
                iArr[jr.p.UTA.ordinal()] = 385;
            } catch (NoSuchFieldError unused385) {
            }
            try {
                iArr[jr.p.VIGOROUS_INTENSITY.ordinal()] = 386;
            } catch (NoSuchFieldError unused386) {
            }
            try {
                iArr[jr.p.WAKE_SPORT_ACTIVE_TIME.ordinal()] = 387;
            } catch (NoSuchFieldError unused387) {
            }
            try {
                iArr[jr.p.WALK_TIME.ordinal()] = 388;
            } catch (NoSuchFieldError unused388) {
            }
            try {
                iArr[jr.p.WATER_CURRENT.ordinal()] = 389;
            } catch (NoSuchFieldError unused389) {
            }
            try {
                iArr[jr.p.WATER_TYPE_AND_DENSITY.ordinal()] = 390;
            } catch (NoSuchFieldError unused390) {
            }
            try {
                iArr[jr.p.WATER_VISIBILITY.ordinal()] = 391;
            } catch (NoSuchFieldError unused391) {
            }
            try {
                iArr[jr.p.WAVES.ordinal()] = 392;
            } catch (NoSuchFieldError unused392) {
            }
            try {
                iArr[jr.p.WEATHER.ordinal()] = 393;
            } catch (NoSuchFieldError unused393) {
            }
            try {
                iArr[jr.p.WIND_DATA.ordinal()] = 394;
            } catch (NoSuchFieldError unused394) {
            }
            try {
                iArr[jr.p.WORK.ordinal()] = 395;
            } catch (NoSuchFieldError unused395) {
            }
            try {
                iArr[jr.p.WORK_TIME.ordinal()] = 396;
            } catch (NoSuchFieldError unused396) {
            }
            try {
                iArr[jr.p.WORKOUT_RUN_TIME.ordinal()] = 397;
            } catch (NoSuchFieldError unused397) {
            }
            f94880a = iArr;
        }
    }

    public static final ls.e a(jr.p pVar) {
        pVar.getClass();
        switch (a.f94880a[pVar.ordinal()]) {
            case 1:
                return ls.e.ACTIVE_CALORIES;
            case 2:
                return ls.e.ACTIVE_SPLIT_MODE;
            case 3:
                return ls.e.ACTIVE_TIME;
            case 4:
                return ls.e.AAP;
            case 5:
                return ls.e.AMP;
            case 6:
                return ls.e.AT;
            case 7:
                return ls.e.ATA;
            case 8:
                return ls.e.AEROBIC_EFFECT;
            case 9:
                return ls.e.AIR_TEMPERATURE;
            case 10:
                return ls.e.ALTITUDE_GAIN;
            case 11:
                return ls.e.ALTITUDE_LOSS;
            case 12:
                return ls.e.ANAEROBIC_EFFECT;
            case 13:
                return ls.e.ASCENT;
            case 14:
                return ls.e.AVERAGE_BIKE_FORCE;
            case 15:
                return ls.e.AVERAGE_CLIMB_ASCENT;
            case 16:
                return ls.e.AVERAGE_CYCLING_CADENCE;
            case 17:
                return ls.e.AVERAGE_CYCLING_SPLIT_POWER;
            case 18:
                return ls.e.AVERAGE_DEPTH;
            case 19:
                return ls.e.AVERAGE_DISTANCE_PER_STROKE;
            case 20:
                return ls.e.AVERAGE_DIVE_VELOCITY;
            case 21:
                return ls.e.AVERAGE_FLOOR_CLIMBING_SPEED;
            case 22:
                return ls.e.AVERAGE_GRADE_ADJUSTED_PACE;
            case 23:
                return ls.e.AVERAGE_GRADE_ADJUSTED_PACE_RUN_ACTIVE;
            case 24:
                return ls.e.AVERAGE_GRADE_ADJUSTED_SPEED;
            case 25:
                return ls.e.AVERAGE_GROUND_CONTACT_TIME;
            case 26:
                return ls.e.AVERAGE_GROUND_CONTACT_TIME_ACTIVE;
            case 27:
                return ls.e.AVERAGE_GROUND_CONTACT_TIME_BALANCE;
            case 28:
                return ls.e.AVERAGE_GROUND_CONTACT_TIME_BALANCE_ACTIVE;
            case 29:
                return ls.e.AVERAGE_GROUND_SPEED;
            case 30:
                return ls.e.AVERAGE_HEART_RATE;
            case 31:
                return ls.e.AVERAGE_JUMP_ROPE_SPEED;
            case 32:
                return ls.e.AVERAGE_MOVING_GROUND_SPEED;
            case 33:
                return ls.e.AVERAGE_MOVING_PACE;
            case 34:
                return ls.e.AVERAGE_MOVING_PACE_RUN_ACTIVE;
            case 35:
                return ls.e.AVERAGE_MOVING_SPEED;
            case 36:
                return ls.e.AVERAGE_MOVING_SWIMMING_PACE;
            case 37:
                return ls.e.AVERAGE_MOVING_SWIM_SPEED;
            case 38:
                return ls.e.AVERAGE_NAUTICAL_PACE;
            case 39:
                return ls.e.AVERAGE_NAUTICAL_MOVING_PACE;
            case 40:
                return ls.e.AVERAGE_NAUTICAL_MOVING_SPEED;
            case 41:
                return ls.e.AVERAGE_NAUTICAL_STROKE_RATE;
            case 42:
                return ls.e.AVERAGE_NAUTICAL_SOG;
            case 43:
                return ls.e.AVERAGE_NAUTICAL_SPEED;
            case 44:
                return ls.e.AVERAGE_OFFSHORE_CADENCE;
            case 45:
                return ls.e.AVERAGE_ONSHORE_CADENCE;
            case 46:
                return ls.e.AVERAGE_PACE;
            case 47:
                return ls.e.AVERAGE_PACE_RUN_ACTIVE;
            case 48:
                return ls.e.AVERAGE_PACK_WEIGHT;
            case 49:
                return ls.e.AVERAGE_POWER;
            case 50:
                return ls.e.AVERAGE_POWER_PER_KG;
            case 51:
                return ls.e.AVERAGE_PUSH_CADENCE;
            case 52:
                return ls.e.AVERAGE_REPS_PER_ROUND;
            case 53:
                return ls.e.AVERAGE_SKI_POWER;
            case 54:
                return ls.e.AVERAGE_REPS_SET;
            case 55:
                return ls.e.AVERAGE_RESPIRATION_RATE;
            case 56:
                return ls.e.AVERAGE_RUN_CADENCE;
            case 57:
                return ls.e.AVERAGE_RUN_CADENCE_ACTIVE;
            case 58:
                return ls.e.AVERAGE_ROWING_DISTANCE_PER_STROKE;
            case 59:
                return ls.e.AVERAGE_ROWING_MOVING_PACE;
            case 60:
                return ls.e.AVERAGE_ROWING_MOVING_SPEED;
            case 61:
                return ls.e.AVERAGE_ROWING_PACE;
            case 62:
                return ls.e.AVERAGE_ROWING_SPEED;
            case 63:
                return ls.e.AVERAGE_SURFING_SPEED;
            case 64:
                return ls.e.AVERAGE_SKI_CADENCE;
            case 65:
                return ls.e.AVERAGE_SPEED;
            case 66:
                return ls.e.AVERAGE_SPLIT_PACE;
            case 67:
                return ls.e.AVERAGE_SPO2;
            case 68:
                return ls.e.AVERAGE_STEP_SPEED_LOSS;
            case 69:
                return ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT;
            case 70:
                return ls.e.AVERAGE_STRESS;
            case 71:
                return ls.e.AVERAGE_STRIDE_LENGTH;
            case 72:
                return ls.e.AVERAGE_STRIDE_LENGTH_ACTIVE;
            case 73:
                return ls.e.AVERAGE_STROKE_RATE;
            case 74:
                return ls.e.AVERAGE_STROKES;
            case 75:
                return ls.e.SWIMMING_PACE;
            case 76:
                return ls.e.AVERAGE_SWIM_CADENCE;
            case 77:
                return ls.e.AVERAGE_SWIM_SPEED;
            case 78:
                return ls.e.AVERAGE_SWOLF;
            case 79:
                return ls.e.AVERAGE_TANK_PRESSURE;
            case 80:
                return ls.e.AVERAGE_TEMPERATURE;
            case 81:
                return ls.e.AVERAGE_TEMPO;
            case 82:
                return ls.e.AVERAGE_TIME_PER_MOVE;
            case 83:
                return ls.e.AVERAGE_TIME_PER_POSE;
            case 84:
                return ls.e.AVERAGE_TIME_PER_SET;
            case 85:
                return ls.e.AVERAGE_VERTICAL_OSCILLATION;
            case 86:
                return ls.e.AVERAGE_VERTICAL_OSCILLATION_ACTIVE;
            case 87:
                return ls.e.AVERAGE_VERTICAL_RATIO;
            case 88:
                return ls.e.AVERAGE_VERTICAL_RATIO_ACTIVE;
            case 89:
                return ls.e.AVERAGE_WALK_CADENCE;
            case 90:
                return ls.e.AVERAGE_WATER_TEMPERATURE;
            case 91:
                return ls.e.BEGINNING_POTENTIAL;
            case 92:
                return ls.e.BEST_GRADE_ADJUSTED_PACE;
            case 93:
                return ls.e.BEST_LAP_AVERAGE_PACE;
            case 94:
                return ls.e.BEST_LAP_TIME;
            case 95:
                return ls.e.BEST_NAUTICAL_PACE;
            case 96:
                return ls.e.BEST_PACE;
            case 97:
                return ls.e.BEST_PACE_RUN_ACTIVE;
            case 98:
                return ls.e.BEST_ROWING_PACE;
            case 99:
                return ls.e.BEST_SPLIT_PACE;
            case 100:
                return ls.e.BEST_SWIMMING_PACE;
            case 101:
                return ls.e.BEST_SWOLF;
            case 102:
                return ls.e.BIKE_TIME;
            case 103:
                return ls.e.BIKE_DISTANCE;
            case 104:
                return ls.e.BIKE_SPEED;
            case 105:
                return ls.e.BODY_BATTERY_DRAIN;
            case 106:
                return ls.e.BOTTOM_TIME;
            case 107:
                return ls.e.BREATH_HOLD_TIME;
            case 108:
                return ls.e.CALORIES;
            case 109:
                return ls.e.CALORIES_BURNED;
            case 110:
                return ls.e.CALORIES_CONSUMED;
            case 111:
                return ls.e.CALORIES_NET;
            case 112:
                return ls.e.CLIMB_FALLS;
            case 113:
                return ls.e.CLIMB_SENDS;
            case 114:
                return ls.e.CLIMB_ROUTES_ATTEMPTED;
            case 115:
                return ls.e.CLIMB_ROUTES_COMPLETED;
            case 116:
                return ls.e.CLIMB_TIME;
            case 117:
                return ls.e.COMMON_TYPE;
            case 118:
                return ls.e.CYCLING_LIFT_TIME;
            case 119:
                return ls.e.CYCLING_RUN_DISTANCE;
            case 120:
                return ls.e.CYCLING_RUN_IDLE_TIME;
            case 121:
                return ls.e.CYCLING_RUN_AVG_MOVING_SPEED;
            case 122:
                return ls.e.CYCLING_RUN_AVG_SPEED;
            case 123:
                return ls.e.CYCLING_RUN_MAX_DESCENT_SPEED;
            case 124:
                return ls.e.CYCLING_RUN_MOVING_TIME;
            case 125:
                return ls.e.CYCLING_RUN_TOTAL_DESCENT;
            case 126:
                return ls.e.DANCE_TIME;
            case 127:
                return ls.e.DESCENT;
            case 128:
                return ls.e.DEEPEST_DIVE;
            case 129:
                return ls.e.DISTANCE;
            case 130:
                return ls.e.DISTANCE_METERS;
            case 131:
                return ls.e.DISTANCE_METERS_ROUNDED;
            case 132:
                return ls.e.DIVE_BOTTOM_TIME;
            case 133:
                return ls.e.DIVE_DYNAMIC_AVERAGE_VELOCITY;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                return ls.e.DIVE_DYNAMIC_AVG_HR;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                return ls.e.DIVE_DYNAMIC_MAX_HR;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                return ls.e.DIVE_DYNAMIC_MAX_VELOCITY;
            case 137:
                return ls.e.DIVE_DYNAMIC_MIN_HR;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                return ls.e.INTERVALS;
            case 139:
                return ls.e.MIN_HEART_RATE;
            case 140:
                return ls.e.DIVE_REST_AVG_HR;
            case 141:
                return ls.e.DIVE_REST_MAX_HR;
            case 142:
                return ls.e.DIVE_REST_MIN_HR;
            case 143:
                return ls.e.DIVE_STATIC_AVG_HR;
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                return ls.e.DIVE_STATIC_MAX_HR;
            case 145:
                return ls.e.DIVE_STATIC_MIN_HR;
            case 146:
                return ls.e.DIVE_LOCATION_NAME;
            case 147:
                return ls.e.DIVE_WEIGHT;
            case 148:
                return ls.e.DIVING_CONSERVATISM;
            case 149:
                return ls.e.ELAPSED_TIME;
            case 150:
                return ls.e.ELAPSED_TIME_MILLIS;
            case 151:
                return ls.e.ELEVATION;
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                return ls.e.ENDING_POTENTIAL;
            case 153:
                return ls.e.ENDING_STRESS_LEVEL;
            case 154:
                return ls.e.ENTERING_CNS;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                return ls.e.ENTERING_NITROGEN;
            case 156:
                return ls.e.ENTRY_COORDINATES;
            case 157:
                return ls.e.ENTRY_TYPE;
            case 158:
                return ls.e.ESTIMATED_SWEAT_LOSS;
            case 159:
                return ls.e.EXERCISE_LOAD;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
                return ls.e.EXERCISE_REST_TIME;
            case 161:
                return ls.e.EXERCISE_WORK_TIME;
            case 162:
                return ls.e.EXIT_COORDINATES;
            case 163:
                return ls.e.FLOORS_CLIMBED;
            case 164:
                return ls.e.FLOW;
            case 165:
                return ls.e.FLUID_CONSUMED;
            case 166:
                return ls.e.FLUID_NET;
            case 167:
                return ls.e.FTP;
            case 168:
                return ls.e.GAME_NAME;
            case 169:
                return ls.e.GAME_TYPE;
            case 170:
                return ls.e.GAS;
            case 171:
                return ls.e.GAS_MIXTURE;
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                return ls.e.GAS_MODE;
            case 173:
                return ls.e.GAS_TYPE;
            case 174:
                return ls.e.GAS_VOLUME;
            case 175:
                return ls.e.GYM_FLOORS_CLIMBED;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                return ls.e.GYM_TOTAL_DISTANCE;
            case 177:
                return ls.e.GRIT;
            case 178:
                return ls.e.HIGH_DEPT_SET_POINT;
            case 179:
                return ls.e.HIGH_SET_POINT;
            case 180:
                return ls.e.IDLE_TIME;
            case 181:
                return ls.e.INTERVALS;
            case 182:
                return ls.e.INTENSITY_FACTOR;
            case 183:
                return ls.e.JUMP_ROPE_MAX_STREAK;
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
                return ls.e.JUMP_ROPE_TOTAL_REPS;
            case 185:
                return ls.e.JUMP_TIME;
            case 186:
                return ls.e.LAP_DISTANCE;
            case 187:
                return ls.e.LEAVING_CNS;
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                return ls.e.LEAVING_NITROGEN;
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return ls.e.LEFT_BALANCE;
            case 190:
                return ls.e.LEFT_GROUND_CONTACT_TIME_BALANCE;
            case 191:
                return ls.e.LEFT_PEAK_POWER_PHASE_INTERVAL;
            case 192:
                return ls.e.LEFT_PEAK_POWER_PHASE_ARC_LENGTH;
            case 193:
                return ls.e.LEFT_PCO;
            case 194:
                return ls.e.LEFT_POWER_PHASE_INTERVAL;
            case 195:
                return ls.e.LEFT_POWER_PHASE_ARC_LENGTH;
            case 196:
                return ls.e.LEFT_RIGHT_BALANCE;
            case 197:
                return ls.e.LEFT_RIGHT_PEDAL_SMOOTHNESS;
            case 198:
                return ls.e.LEFT_RIGHT_TORQUE_EFFECTIVENESS;
            case 199:
                return ls.e.LOCATION;
            case 200:
                return ls.e.LONGEST_DISTANCE;
            case 201:
                return ls.e.LONGEST_DIVE;
            case 202:
                return ls.e.LONGEST_DIVE_DYNAMIC_DISTANCE;
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                return ls.e.LONGEST_DIVE_INTERVAL;
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                return ls.e.LONGEST_RUN;
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                return ls.e.LONGEST_RUN_EXTENDED;
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                return ls.e.LONGEST_WAVE;
            case MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD /* 207 */:
                return ls.e.LOW_DEPTH_SET_POINT;
            case 208:
                return ls.e.LOW_SET_POINT;
            case 209:
                return ls.e.LAP;
            case 210:
                return ls.e.LMP;
            case 211:
                return ls.e.LT;
            case 212:
                return ls.e.LTA;
            case 213:
                return ls.e.MAX_ALTITUDE;
            case 214:
                return ls.e.MAX_AVERAGE_20_MINUTES;
            case 215:
                return ls.e.MAX_BIKE_FORCE;
            case 216:
                return ls.e.MAX_CLIMB_ASCENT;
            case 217:
                return ls.e.MAX_CLIMB_DIFFICULTY;
            case 218:
                return ls.e.MAX_CYCLING_CADENCE;
            case 219:
                return ls.e.MAX_CYCLING_SPLIT_POWER;
            case 220:
                return ls.e.MAX_DEPTH;
            case 221:
                return ls.e.MAX_DIFFICULTY;
            case 222:
                return ls.e.MAX_ELEVATION;
            case 223:
                return ls.e.MAX_FLOOR_CLIMBING_SPEED;
            case 224:
                return ls.e.MAX_GROUND_SPEED;
            case 225:
                return ls.e.MAX_HEART_RATE;
            case 226:
                return ls.e.MAX_JUMP_ROPE_SPEED;
            case 227:
                return ls.e.MAX_NAUTICAL_SOG;
            case 228:
                return ls.e.MAX_NAUTICAL_SPEED;
            case 229:
                return ls.e.MAX_NAUTICAL_STROKE_RATE;
            case 230:
                return ls.e.MAX_OFFSHORE_CADENCE;
            case 231:
                return ls.e.MAX_PACK_WEIGHT;
            case 232:
                return ls.e.MAX_POWER;
            case 233:
                return ls.e.MAX_POWER_PER_KG;
            case 234:
                return ls.e.MAX_PUSH_CADENCE;
            case 235:
                return ls.e.MAX_RESPIRATION_RATE;
            case 236:
                return ls.e.MAX_ROWING_SPEED;
            case 237:
                return ls.e.MAX_RUN_CADENCE;
            case 238:
                return ls.e.MAX_RUN_CADENCE_ACTIVE;
            case 239:
                return ls.e.IMPACT_LOAD;
            case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                return ls.e.REAL_DISTANCE;
            case 241:
                return ls.e.MAX_SPEED;
            case 242:
                return ls.e.MAX_SPLIT_POWER;
            case 243:
                return ls.e.MAX_SPLIT_POWER_PER_KG;
            case 244:
                return ls.e.MAX_SKI_CADENCE;
            case 245:
                return ls.e.MAX_SKI_POWER;
            case 246:
                return ls.e.MAX_SPO2;
            case 247:
                return ls.e.MAX_STRESS;
            case 248:
                return ls.e.MAX_STROKE_RATE;
            case 249:
                return ls.e.MAX_SURFING_SPEED;
            case 250:
                return ls.e.MAX_SWIM_CADENCE;
            case 251:
                return ls.e.MAX_SWIM_SPEED;
            case 252:
                return ls.e.MAX_TANK_PRESSURE;
            case 253:
                return ls.e.MAX_TEMPERATURE;
            case 254:
                return ls.e.MAX_TEMPO;
            case 255:
                return ls.e.MAX_WALK_CADENCE;
            case 256:
                return ls.e.MAX_WATER_TEMPERATURE;
            case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                return ls.e.MIN_ACTUAL;
            case 258:
                return ls.e.MIN_ALTITUDE;
            case 259:
                return ls.e.MIN_ELEVATION;
            case 260:
                return ls.e.MIN_RESPIRATION_RATE;
            case 261:
                return ls.e.MIN_SPO2;
            case 262:
                return ls.e.MIN_TEMPERATURE;
            case 263:
                return ls.e.MIN_WATER_TEMPERATURE;
            case 264:
                return ls.e.MODERATE_INTENSITY;
            case 265:
                return ls.e.MOVING_TIME;
            case 266:
                return ls.e.MOVING_TIME_MILLIS;
            case 267:
                return ls.e.NAUTICAL_DISTANCE;
            case 268:
                return ls.e.NET_IMPACT;
            case 269:
                return ls.e.NON_PACK_CALORIES;
            case 270:
                return ls.e.NORMALIZED_FORCE;
            case 271:
                return ls.e.NORMALIZED_POWER;
            case 272:
                return ls.e.OBSTACLE_TIME;
            case 273:
                return ls.e.PACK_CALORIES;
            case 274:
                return ls.e.PACK_WEIGHT;
            case 275:
                return ls.e.POOL_SIZE;
            case 276:
                return ls.e.PRESSURE_RATE;
            case 277:
                return ls.e.PRIMARY_BENEFIT;
            case 278:
                return ls.e.RACE_LOCATION;
            case 279:
                return ls.e.RECOVERY_HEART_RATE;
            case 280:
                return ls.e.REST_TIME;
            case 281:
                return ls.e.RESTING_CALORIES;
            case 282:
                return ls.e.RIGHT_BALANCE;
            case 283:
                return ls.e.RIGHT_GROUND_CONTACT_TIME_BALANCE;
            case 284:
                return ls.e.RIGHT_PEAK_POWER_PHASE_INTERVAL;
            case 285:
                return ls.e.RIGHT_PEAK_POWER_PHASE_ARC_LENGTH;
            case 286:
                return ls.e.RIGHT_PCO;
            case 287:
                return ls.e.RIGHT_POWER_PHASE_INTERVAL;
            case 288:
                return ls.e.RIGHT_POWER_PHASE_ARC_LENGTH;
            case 289:
                return ls.e.ROAD_SURFACE_PAVED;
            case 290:
                return ls.e.ROAD_SURFACE_UNPAVED;
            case 291:
                return ls.e.ROUTES_ATTEMPTED;
            case 292:
                return ls.e.ROUTES_COMPLETED;
            case 293:
                return ls.e.ROWING_PACE;
            case 294:
                return ls.e.RUN_AVERAGE_PACE;
            case 295:
                return ls.e.RUN_DISTANCE;
            case 296:
                return ls.e.RUN_DISTANCE_METERS;
            case 297:
                return ls.e.RUN_REST_TIME;
            case 298:
                return ls.e.RUN_TIME;
            case 299:
                return ls.e.RUNS;
            case 300:
                return ls.e.RUNS_COUNT;
            case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                return ls.e.SEATED_AVERAGE_POWER;
            case 302:
                return ls.e.SEATED_MAX_POWER;
            case 303:
                return ls.e.SEATED_TIME;
            case 304:
                return ls.e.SESSION_TIME;
            case 305:
                return ls.e.SESSION_TIME;
            case 306:
                return ls.e.SKI_LIFT_TIME;
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                return ls.e.SKI_RUN_AVG_MOVING_SPEED;
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return ls.e.SKI_RUN_AVG_SPEED;
            case 309:
                return ls.e.SKI_RUN_DISTANCE;
            case 310:
                return ls.e.SKI_RUN_IDLE_TIME;
            case 311:
                return ls.e.SKI_RUN_MAX_SPEED;
            case 312:
                return ls.e.SKI_RUN_MOVING_TIME;
            case 313:
                return ls.e.SKI_RUN_TOTAL_DESCENT;
            case 314:
                return ls.e.SONG_COUNT;
            case 315:
                return ls.e.STANDING_AVERAGE_POWER;
            case 316:
                return ls.e.STANDING_MAX_POWER;
            case 317:
                return ls.e.STANDING_TIME;
            case 318:
                return ls.e.STA;
            case 319:
                return ls.e.START_TIME;
            case 320:
                return ls.e.STARTING_STRESS_LEVEL;
            case 321:
                return ls.e.STEPS;
            case 322:
                return ls.e.STRENGTH_SETS;
            case 323:
                return ls.e.STRESS_CHANGE;
            case 324:
                return ls.e.ROWING_STROKES;
            case 325:
                return ls.e.SUIT_THICKNESS;
            case 326:
                return ls.e.SUIT_TYPE;
            case 327:
                return ls.e.SURF_DISTANCE;
            case 328:
                return ls.e.DISTANCE_METERS_OR_FEET;
            case 329:
                return ls.e.SURF_TIME;
            case 330:
                return ls.e.SURFACE_CONDITION;
            case 331:
                return ls.e.TOTAL_SURFACE_INTERVAL_TIME;
            case 332:
                return ls.e.SWIMMING_DISTANCE;
            case 333:
                return ls.e.SWIMMING_PACE;
            case 334:
                return ls.e.TANK_END_PRESSURE;
            case 335:
                return ls.e.TANK_SIZE;
            case 336:
                return ls.e.TANK_START_PRESSURE;
            case 337:
                return ls.e.TANK_TYPE;
            case 338:
                return ls.e.TANK_USED_PRESSURE;
            case 339:
                return ls.e.TIME;
            case 340:
                return ls.e.TOP_SONG_TEMPO;
            case 341:
                return ls.e.TA;
            case 342:
                return ls.e.TOTAL_ASCENT;
            case 343:
                return ls.e.TOTAL_CLIMB_ASCENT;
            case 344:
                return ls.e.TOTAL_CYCLING_STROKES;
            case 345:
                return ls.e.TOTAL_DESCENT;
            case 346:
                return ls.e.TOTAL_DISTANCE;
            case 347:
                return ls.e.TOTAL_DIVE_DYNAMIC_DISTANCE;
            case 348:
                return ls.e.TOTAL_DIVE_DYNAMIC_INTERVALS;
            case 349:
                return ls.e.TOTAL_DIVE_DYNAMIC_TIME;
            case 350:
                return ls.e.TOTAL_DIVE_REST_INTERVALS;
            case 351:
                return ls.e.TOTAL_DIVE_REST_TIME;
            case 352:
                return ls.e.TOTAL_DIVE_STATIC_INTERVALS;
            case 353:
                return ls.e.TOTAL_DIVE_STATIC_TIME;
            case 354:
                return ls.e.TOTAL_DIVES;
            case 355:
                return ls.e.TOTAL_FLOORS_ASCENT;
            case 356:
                return ls.e.TOTAL_FLOORS_DESCENT;
            case 357:
                return ls.e.TOTAL_HIIT_REPS;
            case 358:
                return ls.e.TOTAL_HIIT_SETS;
            case 359:
                return ls.e.TOTAL_HIIT_VOLUME;
            case 360:
                return ls.e.TOTAL_INTENSITY;
            case 361:
                return ls.e.TOTAL_JUMPS;
            case 362:
                return ls.e.TOTAL_LAPS;
            case 363:
                return ls.e.TOTAL_MOVES;
            case 364:
                return ls.e.TOTAL_POSES;
            case 365:
                return ls.e.TOTAL_PUSHES;
            case 366:
                return ls.e.ROWING_STROKES;
            case 367:
                return ls.e.TOTAL_SETS;
            case 368:
                return ls.e.TOTAL_SWIMMING_STROKES;
            case 369:
                return ls.e.TOTAL_TIME;
            case 370:
                return ls.e.TOTAL_TIME_MILLIS;
            case 371:
                return ls.e.TOTAL_TIME_MILLIS_EXTENDED_PRECISION;
            case 372:
                return ls.e.TOTAL_FLYING_TIME;
            case 373:
                return ls.e.TOTAL_REPS;
            case 374:
                return ls.e.TOTAL_REST;
            case 375:
                return ls.e.TOTAL_ROUNDS;
            case 376:
                return ls.e.TOTAL_ROUTES;
            case 377:
                return ls.e.TOTAL_RUN_DISTANCE;
            case 378:
                return ls.e.TOTAL_RUNS;
            case 379:
                return ls.e.TOTAL_VOLUME;
            case 380:
                return ls.e.TOTAL_WAVES;
            case 381:
                return ls.e.TRAINING_STRESS_SCORE;
            case 382:
                return ls.e.UAP;
            case 383:
                return ls.e.UMP;
            case 384:
                return ls.e.UT;
            case 385:
                return ls.e.UTA;
            case 386:
                return ls.e.VIGOROUS_INTENSITY;
            case 387:
                return ls.e.WAKE_SPORT_ACTIVE_TIME;
            case 388:
                return ls.e.WALK_TIME;
            case 389:
                return ls.e.WATER_CURRENT;
            case 390:
                return ls.e.WATER_TYPE_AND_DENSITY;
            case 391:
                return ls.e.WATER_VISIBILITY;
            case 392:
                return ls.e.WAVES;
            case 393:
                return ls.e.WEATHER;
            case 394:
                return ls.e.WIND_DATA;
            case 395:
                return ls.e.WORK;
            case 396:
                return ls.e.WORK_TIME;
            case 397:
                return ls.e.WORKOUT_RUN_TIME;
            default:
                u0.r();
                return null;
        }
    }
}

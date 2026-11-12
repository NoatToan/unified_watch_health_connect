package kd0;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/l3;", "Lbv/f;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l3 implements bv.f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104208a;

        static {
            int[] iArr = new int[ro0.l.values().length];
            try {
                iArr[ro0.l.RESPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ro0.l.RESPIRATION_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ro0.l.HEALTH_SNAPSHOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ro0.l.MOVE_IQ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ro0.l.SLEEP_ENHANCED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ro0.l.HYDRATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ro0.l.INTENSITY_MINUTES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ro0.l.SOLAR_INTENSITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ro0.l.SKI_POWER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ro0.l.WEIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ro0.l.ACTIVITY_WORKOUT_SELF_EVALUATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ro0.l.CALORIE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ro0.l.LIVETRACK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ro0.l.SURF_WAVE_DISTANCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ro0.l.WAKESPORTS_RUN_DISTANCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ro0.l.TRAINING_EFFECT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ro0.l.HEART_RATE_ZONES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ro0.l.SAFETY_FEATURES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ro0.l.NUTRITION_HYDRATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ro0.l.CYCLING_NUTRITION_HYDRATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ro0.l.ECG.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ro0.l.TRAINING_READINESS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ro0.l.OVERNIGHT_HRV.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ro0.l.PULSE_OX.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ro0.l.FITNESS_AGE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ro0.l.EPOCH_DATA_RELOAD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ro0.l.FUNCTIONAL_THRESHOLD_POWER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ro0.l.BENCHMARK_EXERCISE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ro0.l.PREGNANCY_SETTINGS_HELP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ro0.l.PREGNANCY_TRACKING_HELP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ro0.l.ACTIVITY_DETAILS_WORKOUTS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ro0.l.ACTIVITY_DETAILS_HIIT_WORKOUTS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ro0.l.ACTIVITY_DETAILS_PILATES.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ro0.l.ACTIVITY_DETAILS_MOBILITY.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ro0.l.ACTIVITY_DETAILS_BREATHWORK.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ro0.l.LACTATE_THRESHOLD.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ro0.l.SPORT_SPECIFIC_LACTATE_THRESHOLD.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ro0.l.RUNNING_DYNAMICS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ro0.l.PERFORMANCE_CONDITION.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ro0.l.HRV_STRESS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ro0.l.BODY_BATTERY.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ro0.l.POWER_ZONES.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ro0.l.RALLY_FW_UPDATE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ro0.l.ACTIVITY_HIIT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ro0.l.ACTIVITY_BIKE_FORCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ro0.l.HEART_RATE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ro0.l.STAMINA.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ro0.l.RACE_PREDICTOR_TRENDS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[ro0.l.BLOOD_PRESSURE_REMINDERS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[ro0.l.BLOOD_PRESSURE.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[ro0.l.STRESS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[ro0.l.RUN_WALK.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[ro0.l.RUNNING_TOLERANCE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[ro0.l.RUNNING_ECONOMY.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[ro0.l.RACE_TIME_PREDICTION.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[ro0.l.IMPACT_LOAD.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[ro0.l.MULTISPORT_EDIT_LEGS.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[ro0.l.PROFILE_PRIVACY.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[ro0.l.CLIMB_PRO.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[ro0.l.PACE_PRO.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[ro0.l.ACTIVITY_LAP_RACING.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[ro0.l.STRENGTH_TRAINING.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[ro0.l.CREATE_COURSE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[ro0.l.SAVED_COURSE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[ro0.l.ACTIVITY_TRIM.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[ro0.l.TRAINING_ACTIVITY.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[ro0.l.CRITICAL_SWIM_SPEED.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[ro0.l.PACE.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[ro0.l.INDOOR_ROWING_PACE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[ro0.l.JET_LAG.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[ro0.l.POWER_CURVE_TARGET_HELP.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[ro0.l.WORKOUT_STEP_TARGET_HELP.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[ro0.l.POWER_GUIDE_HELP.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[ro0.l.EDGE_SOLAR_CHARGE_HELP.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[ro0.l.RUN_POWER.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[ro0.l.ACCESSIBILITY_SETTINGS.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[ro0.l.USER_SETTINGS.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[ro0.l.INDEX_DEVICES_USER_SETTINGS.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[ro0.l.CONNECTED_GPS.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[ro0.l.MENSTRUAL_CYCLE.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[ro0.l.TRAINING_STATUS.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[ro0.l.ACCOUNT_ACCESS.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[ro0.l.INSTANT_INPUT.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[ro0.l.BLE_INDEX_SCALE.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[ro0.l.ACTIVITY_TRACKING_SETTINGS.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[ro0.l.WORKOUT_ESTIMATE.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[ro0.l.ADVANCED_BODY_METRICS.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[ro0.l.PRIMARY_TRAINING_DEVICE.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[ro0.l.TRAINING_PRIORITY.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[ro0.l.HILL_SCORE.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[ro0.l.ENDURANCE_SCORE.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[ro0.l.COURSE_CLIMB_PRO.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[ro0.l.ACTIVITY_HEART_RATE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[ro0.l.INDOOR_ROWING_HEART_RATE.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[ro0.l.SKI_CADENCE.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[ro0.l.GAMING_WIN_RATE.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[ro0.l.DANCE_METRICS.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[ro0.l.JUMP_ROPE_SPEED.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[ro0.l.HOME_SETTINGS.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[ro0.l.STEPS.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[ro0.l.PUSHES.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[ro0.l.SOCIAL_GROUP_RIDE.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[ro0.l.CDTA.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[ro0.l.CYCLING_DYNAMICS_POSITION.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[ro0.l.CYCLING_DYNAMICS_POWER_PHASE.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[ro0.l.CYCLING_DYNAMICS_TIME_IN_POSITION.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[ro0.l.PLATFORM_CENTER_OFFSET.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[ro0.l.STP_BENCHMARK_EXERCISES.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[ro0.l.STP_DASHBOARD.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[ro0.l.GRIT_FLOW.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[ro0.l.SKI_GLIDE_LENGTH.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[ro0.l.TRAIL_DIFFICULTY.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[ro0.l.TRAIL_POPULARITY.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[ro0.l.TRAIL_REVIEW_HIDDEN.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[ro0.l.TRAIL_REVIEW_PHOTOS_HIDDEN.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[ro0.l.LIFESTYLE_LOGGING.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[ro0.l.PACK_WEIGHT.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[ro0.l.SLOPE_DIFFICULTY_GUIDE.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[ro0.l.TRAINABLE_EVENTS.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[ro0.l.TRAINING_PLANS.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[ro0.l.ACTIVITY_RECORDING.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[ro0.l.FIVE_HZ_DATA_RECORDING.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[ro0.l.CYCLING_ABILITY.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[ro0.l.HEALTH_STATUS.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[ro0.l.NUTRITION.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[ro0.l.BIKE_ALARM.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[ro0.l.COURSE_PLANNING.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[ro0.l.CHILD_ACCOUNTS.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[ro0.l.INDEX_S2_LOCATION_SETTINGS.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[ro0.l.EXCLUSIVE_OFFERS.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[ro0.l.VO2_MAX.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[ro0.l.PACK_CALORIES.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[ro0.l.ENDURANCE_STAMINA.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[ro0.l.IRON_SETUP.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[ro0.l.PERSONAL_RECORDS.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[ro0.l.DOGS.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            f104208a = iArr;
        }
    }

    @Override // bv.f
    public final h82.c a(ro0.l lVar) {
        switch (a.f104208a[lVar.ordinal()]) {
            case 1:
                h82.c cVar = (h82.c) fe1.g.class.getDeclaredConstructor(null).newInstance(null);
                cVar.getClass();
                return cVar;
            case 2:
                h82.c cVar2 = (h82.c) fe1.k.class.getDeclaredConstructor(null).newInstance(null);
                cVar2.getClass();
                return cVar2;
            case 3:
                h82.c cVar3 = (h82.c) tn.r.class.getDeclaredConstructor(null).newInstance(null);
                cVar3.getClass();
                return cVar3;
            case 4:
                h82.c cVar4 = (h82.c) zx0.l.class.getDeclaredConstructor(null).newInstance(null);
                cVar4.getClass();
                return cVar4;
            case 5:
                h82.c cVar5 = (h82.c) com.garmin.android.apps.connectmobile.sleep.presentation.a.class.getDeclaredConstructor(null).newInstance(null);
                cVar5.getClass();
                return cVar5;
            case 6:
                h82.c cVar6 = (h82.c) yp0.k.class.getDeclaredConstructor(null).newInstance(null);
                cVar6.getClass();
                return cVar6;
            case 7:
                h82.c cVar7 = (h82.c) or0.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar7.getClass();
                return cVar7;
            case 8:
                h82.c cVar8 = (h82.c) vp1.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar8.getClass();
                return cVar8;
            case 9:
                h82.c cVar9 = (h82.c) aq.a3.class.getDeclaredConstructor(null).newInstance(null);
                cVar9.getClass();
                return cVar9;
            case 10:
                h82.c cVar10 = (h82.c) q42.p.class.getDeclaredConstructor(null).newInstance(null);
                cVar10.getClass();
                return cVar10;
            case 11:
                h82.c cVar11 = (h82.c) aq.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar11.getClass();
                return cVar11;
            case 12:
                h82.c cVar12 = (h82.c) com.garmin.android.apps.connectmobile.calories.presentation.a.class.getDeclaredConstructor(null).newInstance(null);
                cVar12.getClass();
                return cVar12;
            case 13:
                h82.c cVar13 = (h82.c) vu0.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar13.getClass();
                return cVar13;
            case 14:
                h82.c cVar14 = (h82.c) yn.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar14.getClass();
                return cVar14;
            case 15:
                h82.c cVar15 = (h82.c) yn.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar15.getClass();
                return cVar15;
            case 16:
                h82.c cVar16 = (h82.c) aq.o3.class.getDeclaredConstructor(null).newInstance(null);
                cVar16.getClass();
                return cVar16;
            case 17:
                h82.c cVar17 = (h82.c) xk1.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar17.getClass();
                return cVar17;
            case 18:
                h82.c cVar18 = (h82.c) uj1.i0.class.getDeclaredConstructor(null).newInstance(null);
                cVar18.getClass();
                return cVar18;
            case 19:
                h82.c cVar19 = (h82.c) xn.p.class.getDeclaredConstructor(null).newInstance(null);
                cVar19.getClass();
                return cVar19;
            case 20:
                h82.c cVar20 = (h82.c) p50.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar20.getClass();
                return cVar20;
            case 21:
                h82.c cVar21 = (h82.c) com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar21.getClass();
                return cVar21;
            case 22:
                h82.c cVar22 = (h82.c) sz1.p.class.getDeclaredConstructor(null).newInstance(null);
                cVar22.getClass();
                return cVar22;
            case 23:
                h82.c cVar23 = (h82.c) t31.g.class.getDeclaredConstructor(null).newInstance(null);
                cVar23.getClass();
                return cVar23;
            case 24:
                h82.c cVar24 = (h82.c) ic1.i.class.getDeclaredConstructor(null).newInstance(null);
                cVar24.getClass();
                return cVar24;
            case 25:
                h82.c cVar25 = (h82.c) ih0.m.class.getDeclaredConstructor(null).newInstance(null);
                cVar25.getClass();
                return cVar25;
            case 26:
                h82.c cVar26 = (h82.c) sf0.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar26.getClass();
                return cVar26;
            case 27:
                h82.c cVar27 = (h82.c) dj0.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar27.getClass();
                return cVar27;
            case 28:
                h82.c cVar28 = (h82.c) s52.g.class.getDeclaredConstructor(null).newInstance(null);
                cVar28.getClass();
                return cVar28;
            case 29:
                h82.c cVar29 = (h82.c) pb1.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar29.getClass();
                return cVar29;
            case 30:
                h82.c cVar30 = (h82.c) ix0.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar30.getClass();
                return cVar30;
            case 31:
                h82.c cVar31 = (h82.c) kq.g1.class.getDeclaredConstructor(null).newInstance(null);
                cVar31.getClass();
                return cVar31;
            case 32:
                h82.c cVar32 = (h82.c) kq.r0.class.getDeclaredConstructor(null).newInstance(null);
                cVar32.getClass();
                return cVar32;
            case 33:
                h82.c cVar33 = (h82.c) kq.b1.class.getDeclaredConstructor(null).newInstance(null);
                cVar33.getClass();
                return cVar33;
            case 34:
                h82.c cVar34 = (h82.c) kq.x0.class.getDeclaredConstructor(null).newInstance(null);
                cVar34.getClass();
                return cVar34;
            case 35:
                h82.c cVar35 = (h82.c) kq.k.class.getDeclaredConstructor(null).newInstance(null);
                cVar35.getClass();
                return cVar35;
            case 36:
                h82.c cVar36 = (h82.c) ht0.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar36.getClass();
                return cVar36;
            case 37:
                h82.c cVar37 = (h82.c) ht0.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar37.getClass();
                return cVar37;
            case 38:
                h82.c cVar38 = (h82.c) xn.x.class.getDeclaredConstructor(null).newInstance(null);
                cVar38.getClass();
                return cVar38;
            case 39:
                h82.c cVar39 = (h82.c) aq.o2.class.getDeclaredConstructor(null).newInstance(null);
                cVar39.getClass();
                return cVar39;
            case 40:
                h82.c cVar40 = (h82.c) t61.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar40.getClass();
                return cVar40;
            case 41:
                h82.c cVar41 = (h82.c) ix.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar41.getClass();
                return cVar41;
            case 42:
                h82.c cVar42 = (h82.c) xk1.n.class.getDeclaredConstructor(null).newInstance(null);
                cVar42.getClass();
                return cVar42;
            case 43:
                h82.c cVar43 = (h82.c) aw.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar43.getClass();
                return cVar43;
            case 44:
                h82.c cVar44 = (h82.c) kq.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar44.getClass();
                return cVar44;
            case 45:
                h82.c cVar45 = (h82.c) kq.q0.class.getDeclaredConstructor(null).newInstance(null);
                cVar45.getClass();
                return cVar45;
            case 46:
                h82.c cVar46 = (h82.c) ho0.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar46.getClass();
                return cVar46;
            case 47:
                h82.c cVar47 = (h82.c) kq.e1.class.getDeclaredConstructor(null).newInstance(null);
                cVar47.getClass();
                return cVar47;
            case 48:
                h82.c cVar48 = (h82.c) kq.c1.class.getDeclaredConstructor(null).newInstance(null);
                cVar48.getClass();
                return cVar48;
            case 49:
                h82.c cVar49 = (h82.c) xw.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar49.getClass();
                return cVar49;
            case 50:
                h82.c cVar50 = (h82.c) ww.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar50.getClass();
                return cVar50;
            case 51:
                h82.c cVar51 = (h82.c) com.garmin.android.apps.connectmobile.stress.presentation.view.a.class.getDeclaredConstructor(null).newInstance(null);
                cVar51.getClass();
                return cVar51;
            case 52:
                h82.c cVar52 = (h82.c) xn.u.class.getDeclaredConstructor(null).newInstance(null);
                cVar52.getClass();
                return cVar52;
            case 53:
                h82.c cVar53 = (h82.c) pf1.g.class.getDeclaredConstructor(null).newInstance(null);
                cVar53.getClass();
                return cVar53;
            case 54:
                h82.c cVar54 = (h82.c) cf1.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar54.getClass();
                return cVar54;
            case 55:
                h82.c cVar55 = (h82.c) xc1.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar55.getClass();
                return cVar55;
            case 56:
                h82.c cVar56 = (h82.c) pf1.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar56.getClass();
                return cVar56;
            case 57:
                h82.c cVar57 = (h82.c) xo.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar57.getClass();
                return cVar57;
            case 58:
                h82.c cVar58 = (h82.c) t12.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar58.getClass();
                return cVar58;
            case 59:
                h82.c cVar59 = (h82.c) cq.w.class.getDeclaredConstructor(null).newInstance(null);
                cVar59.getClass();
                return cVar59;
            case 60:
                h82.c cVar60 = (h82.c) g51.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar60.getClass();
                return cVar60;
            case 61:
                h82.c cVar61 = (h82.c) kq.g.class.getDeclaredConstructor(null).newInstance(null);
                cVar61.getClass();
                return cVar61;
            case 62:
                h82.c cVar62 = (h82.c) cr.b0.class.getDeclaredConstructor(null).newInstance(null);
                cVar62.getClass();
                return cVar62;
            case 63:
                h82.c cVar63 = (h82.c) i40.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar63.getClass();
                return cVar63;
            case 64:
                h82.c cVar64 = (h82.c) i40.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar64.getClass();
                return cVar64;
            case 65:
                h82.c cVar65 = (h82.c) cm.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar65.getClass();
                return cVar65;
            case 66:
                h82.c cVar66 = (h82.c) com.garmin.android.apps.connectmobile.training.atp.dashboard.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar66.getClass();
                return cVar66;
            case 67:
                h82.c cVar67 = (h82.c) xh1.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar67.getClass();
                return cVar67;
            case 68:
                h82.c cVar68 = (h82.c) kq.z0.class.getDeclaredConstructor(null).newInstance(null);
                cVar68.getClass();
                return cVar68;
            case 69:
                h82.c cVar69 = (h82.c) kq.v0.class.getDeclaredConstructor(null).newInstance(null);
                cVar69.getClass();
                return cVar69;
            case 70:
                h82.c cVar70 = (h82.c) ds0.l.class.getDeclaredConstructor(null).newInstance(null);
                cVar70.getClass();
                return cVar70;
            case 71:
                h82.c cVar71 = (h82.c) o62.l.class.getDeclaredConstructor(null).newInstance(null);
                cVar71.getClass();
                return cVar71;
            case 72:
                h82.c cVar72 = (h82.c) o62.t0.class.getDeclaredConstructor(null).newInstance(null);
                cVar72.getClass();
                return cVar72;
            case 73:
                h82.c cVar73 = (h82.c) xa1.b0.class.getDeclaredConstructor(null).newInstance(null);
                cVar73.getClass();
                return cVar73;
            case 74:
                h82.c cVar74 = (h82.c) hp1.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar74.getClass();
                return cVar74;
            case 75:
                h82.c cVar75 = (h82.c) kq.d1.class.getDeclaredConstructor(null).newInstance(null);
                cVar75.getClass();
                return cVar75;
            case 76:
                h82.c cVar76 = (h82.c) qk1.a.class.getDeclaredConstructor(null).newInstance(null);
                cVar76.getClass();
                return cVar76;
            case 77:
                h82.c cVar77 = (h82.c) pk1.q.class.getDeclaredConstructor(null).newInstance(null);
                cVar77.getClass();
                return cVar77;
            case 78:
                h82.c cVar78 = (h82.c) pk1.k.class.getDeclaredConstructor(null).newInstance(null);
                cVar78.getClass();
                return cVar78;
            case 79:
                h82.c cVar79 = (h82.c) xn.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar79.getClass();
                return cVar79;
            case 80:
                h82.c cVar80 = (h82.c) ix0.i.class.getDeclaredConstructor(null).newInstance(null);
                cVar80.getClass();
                return cVar80;
            case 81:
                h82.c cVar81 = (h82.c) com.garmin.android.apps.connectmobile.performance.stats.improvement.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar81.getClass();
                return cVar81;
            case 82:
                h82.c cVar82 = (h82.c) rg0.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar82.getClass();
                return cVar82;
            case 83:
                h82.c cVar83 = (h82.c) cr0.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar83.getClass();
                return cVar83;
            case 84:
                h82.c cVar84 = (h82.c) bd0.n.class.getDeclaredConstructor(null).newInstance(null);
                cVar84.getClass();
                return cVar84;
            case 85:
                h82.c cVar85 = (h82.c) gg1.a.class.getDeclaredConstructor(null).newInstance(null);
                cVar85.getClass();
                return cVar85;
            case 86:
                h82.c cVar86 = (h82.c) kq.f1.class.getDeclaredConstructor(null).newInstance(null);
                cVar86.getClass();
                return cVar86;
            case 87:
                h82.c cVar87 = (h82.c) ph1.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar87.getClass();
                return cVar87;
            case 88:
                h82.c cVar88 = (h82.c) ij1.r.class.getDeclaredConstructor(null).newInstance(null);
                cVar88.getClass();
                return cVar88;
            case 89:
                h82.c cVar89 = (h82.c) iz1.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar89.getClass();
                return cVar89;
            case 90:
                h82.c cVar90 = (h82.c) o81.a.class.getDeclaredConstructor(null).newInstance(null);
                cVar90.getClass();
                return cVar90;
            case 91:
                h82.c cVar91 = (h82.c) h81.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar91.getClass();
                return cVar91;
            case 92:
                h82.c cVar92 = (h82.c) w30.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar92.getClass();
                return cVar92;
            case 93:
                h82.c cVar93 = (h82.c) kq.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar93.getClass();
                return cVar93;
            case 94:
                h82.c cVar94 = (h82.c) kq.t0.class.getDeclaredConstructor(null).newInstance(null);
                cVar94.getClass();
                return cVar94;
            case 95:
                h82.c cVar95 = (h82.c) aq.y2.class.getDeclaredConstructor(null).newInstance(null);
                cVar95.getClass();
                return cVar95;
            case 96:
                h82.c cVar96 = (h82.c) xn.k.class.getDeclaredConstructor(null).newInstance(null);
                cVar96.getClass();
                return cVar96;
            case 97:
                h82.c cVar97 = (h82.c) kq.p0.class.getDeclaredConstructor(null).newInstance(null);
                cVar97.getClass();
                return cVar97;
            case 98:
                h82.c cVar98 = (h82.c) kq.w0.class.getDeclaredConstructor(null).newInstance(null);
                cVar98.getClass();
                return cVar98;
            case 99:
                h82.c cVar99 = (h82.c) q70.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar99.getClass();
                return cVar99;
            case 100:
                h82.c cVar100 = (h82.c) pq1.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar100.getClass();
                return cVar100;
            case 101:
                h82.c cVar101 = (h82.c) d52.i.class.getDeclaredConstructor(null).newInstance(null);
                cVar101.getClass();
                return cVar101;
            case 102:
                h82.c cVar102 = (h82.c) zo1.z.class.getDeclaredConstructor(null).newInstance(null);
                cVar102.getClass();
                return cVar102;
            case 103:
                h82.c cVar103 = (h82.c) kq.o0.class.getDeclaredConstructor(null).newInstance(null);
                cVar103.getClass();
                return cVar103;
            case 104:
                h82.c cVar104 = (h82.c) kq.g0.class.getDeclaredConstructor(null).newInstance(null);
                cVar104.getClass();
                return cVar104;
            case 105:
                h82.c cVar105 = (h82.c) kq.j0.class.getDeclaredConstructor(null).newInstance(null);
                cVar105.getClass();
                return cVar105;
            case 106:
                h82.c cVar106 = (h82.c) kq.l0.class.getDeclaredConstructor(null).newInstance(null);
                cVar106.getClass();
                return cVar106;
            case 107:
                h82.c cVar107 = (h82.c) kq.c0.class.getDeclaredConstructor(null).newInstance(null);
                cVar107.getClass();
                return cVar107;
            case 108:
                h82.c cVar108 = (h82.c) vx1.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar108.getClass();
                return cVar108;
            case 109:
                h82.c cVar109 = (h82.c) vx1.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar109.getClass();
                return cVar109;
            case 110:
                h82.c cVar110 = (h82.c) aq.n2.class.getDeclaredConstructor(null).newInstance(null);
                cVar110.getClass();
                return cVar110;
            case 111:
                h82.c cVar111 = (h82.c) aq.z2.class.getDeclaredConstructor(null).newInstance(null);
                cVar111.getClass();
                return cVar111;
            case 112:
                h82.c cVar112 = (h82.c) ft1.g.class.getDeclaredConstructor(null).newInstance(null);
                cVar112.getClass();
                return cVar112;
            case 113:
                h82.c cVar113 = (h82.c) ft1.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar113.getClass();
                return cVar113;
            case 114:
                h82.c cVar114 = (h82.c) ft1.e.class.getDeclaredConstructor(null).newInstance(null);
                cVar114.getClass();
                return cVar114;
            case 115:
                h82.c cVar115 = (h82.c) ft1.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar115.getClass();
                return cVar115;
            case 116:
                h82.c cVar116 = (h82.c) vv0.f.class.getDeclaredConstructor(null).newInstance(null);
                cVar116.getClass();
                return cVar116;
            case 117:
                h82.c cVar117 = (h82.c) kq.a1.class.getDeclaredConstructor(null).newInstance(null);
                cVar117.getClass();
                return cVar117;
            case 118:
                h82.c cVar118 = (h82.c) aq.e3.class.getDeclaredConstructor(null).newInstance(null);
                cVar118.getClass();
                return cVar118;
            case 119:
                h82.c cVar119 = (h82.c) iv1.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar119.getClass();
                return cVar119;
            case 120:
                h82.c cVar120 = (h82.c) iv1.d.class.getDeclaredConstructor(null).newInstance(null);
                cVar120.getClass();
                return cVar120;
            case 121:
                h82.c cVar121 = (h82.c) et.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar121.getClass();
                return cVar121;
            case 122:
                h82.c cVar122 = (h82.c) xn.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar122.getClass();
                return cVar122;
            case 123:
                h82.c cVar123 = (h82.c) c70.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar123.getClass();
                return cVar123;
            case 124:
                h82.c cVar124 = (h82.c) qn0.i.class.getDeclaredConstructor(null).newInstance(null);
                cVar124.getClass();
                return cVar124;
            case 125:
                h82.c cVar125 = (h82.c) t11.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar125.getClass();
                return cVar125;
            case 126:
                h82.c cVar126 = (h82.c) vg1.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar126.getClass();
                return cVar126;
            case 127:
                h82.c cVar127 = (h82.c) p40.j.class.getDeclaredConstructor(null).newInstance(null);
                cVar127.getClass();
                return cVar127;
            case 128:
                h82.c cVar128 = (h82.c) sg0.s.class.getDeclaredConstructor(null).newInstance(null);
                cVar128.getClass();
                return cVar128;
            case 129:
                h82.c cVar129 = (h82.c) mh1.m.class.getDeclaredConstructor(null).newInstance(null);
                cVar129.getClass();
                return cVar129;
            case 130:
                h82.c cVar130 = (h82.c) ck0.r.class.getDeclaredConstructor(null).newInstance(null);
                cVar130.getClass();
                return cVar130;
            case 131:
                h82.c cVar131 = (h82.c) a42.s.class.getDeclaredConstructor(null).newInstance(null);
                cVar131.getClass();
                return cVar131;
            case 132:
                h82.c cVar132 = (h82.c) xn.s.class.getDeclaredConstructor(null).newInstance(null);
                cVar132.getClass();
                return cVar132;
            case 133:
                h82.c cVar133 = (h82.c) h81.h.class.getDeclaredConstructor(null).newInstance(null);
                cVar133.getClass();
                return cVar133;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                h82.c cVar134 = (h82.c) xn.l.class.getDeclaredConstructor(null).newInstance(null);
                cVar134.getClass();
                return cVar134;
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                h82.c cVar135 = (h82.c) y91.b.class.getDeclaredConstructor(null).newInstance(null);
                cVar135.getClass();
                return cVar135;
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                h82.c cVar136 = (h82.c) wd0.c.class.getDeclaredConstructor(null).newInstance(null);
                cVar136.getClass();
                return cVar136;
            default:
                return null;
        }
    }
}

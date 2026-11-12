package ah2;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3304a;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.DISTANCE_METERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.c.a.LAP_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.c.a.STEP_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ag2.c.a.TIMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ag2.c.a.WORKING_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ag2.c.a.REST_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ag2.c.a.STEP_TIMER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ag2.c.a.REST_TIMER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ag2.c.a.AVG_PACE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ag2.c.a.AVG_SPEED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ag2.c.a.REPS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ag2.c.a.SETS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ag2.c.a.ROUNDS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ag2.c.a.SONG_COUNT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ag2.c.a.AVG_HEART_RATE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ag2.c.a.MAX_HEART_RATE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ag2.c.a.CALORIES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ag2.c.a.TOTAL_CALORIES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ag2.c.a.STEP_CALORIES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ag2.c.a.ACTIVE_CALORIES.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ag2.c.a.POWER.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ag2.c.a.AVG_POWER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ag2.c.a.AVG_STROKE_RATE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ag2.c.a.STROKE_RATE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ag2.c.a.TOTAL_STROKES.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ag2.c.a.RESPIRATION_RATE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ag2.c.a.POSES.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ag2.c.a.MOVES.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ag2.c.a.HEART_RATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ag2.c.a.SPEED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ag2.c.a.PACE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ag2.c.a.GRADE_ADJUSTED_PACE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ag2.c.a.SET_TIMER.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ag2.c.a.LAP_TIMER.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ag2.c.a.LAP_PACE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ag2.c.a.LAP_AVG_HEART_RATE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ag2.c.a.LAP_AVG_POWER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ag2.c.a.LAP_POWER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ag2.c.a.LAP_COUNT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ag2.c.a.BIKE_CADENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ag2.c.a.RUN_CADENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ag2.c.a.CIRCUITS.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ag2.c.a.INTERVALS.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ag2.c.a.ROUND.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ag2.c.a.REST_DURATION.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ag2.c.a.STEP_DURATION.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ag2.c.a.POWER_ZONE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[ag2.c.a.HEART_RATE_ZONE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[ag2.c.a.STRESS.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[ag2.c.a.MAX_STRESS.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[ag2.c.a.AVG_STRESS.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[ag2.c.a.ELEVATION.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[ag2.c.a.TOTAL_ASCENT.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[ag2.c.a.TOTAL_DESCENT.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[ag2.c.a.STEPS.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[ag2.c.a.TOTAL_ROUTES.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_LAST_ROUND_REPS.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_ROUNDS.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_REPS.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_ACTIVE_TIME.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_AVG_SPEED.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[ag2.c.a.AVG_TEMPO.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[ag2.c.a.FLOORS_CLIMBED.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[ag2.c.a.FLOOR_CLIMB_RATE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[ag2.c.a.ROW_PACE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[ag2.c.a.AVG_ROW_PACE_500M.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[ag2.c.a.WORKOUT_CURRENT_REPEAT_TIME_REMAINING.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[ag2.c.a.MEDITATION_TIMER.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[ag2.c.a.MEDITATION_CARD.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[ag2.c.a.BREATHWORK.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[ag2.c.a.BREATHWORK_PHASE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[ag2.c.a.STEP_TARGET.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[ag2.c.a.ANIMATED_WORKOUT.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[ag2.c.a.PRIMARY_TARGET.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[ag2.c.a.SECONDARY_TARGET.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[ag2.c.a.MUSCLE_MAP.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            f3304a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:1037:0x17a0  */
    /* JADX WARN: Code duplicated, block: B:1039:0x17c1  */
    /* JADX WARN: Code duplicated, block: B:1050:0x17f9  */
    /* JADX WARN: Code duplicated, block: B:1052:0x17ff  */
    /* JADX WARN: Code duplicated, block: B:1055:0x182a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:1067:0x1863  */
    /* JADX WARN: Code duplicated, block: B:1069:0x1869  */
    /* JADX WARN: Code duplicated, block: B:1070:0x1874  */
    /* JADX WARN: Code duplicated, block: B:1073:0x187e  */
    /* JADX WARN: Code duplicated, block: B:1076:0x189c  */
    /* JADX WARN: Code duplicated, block: B:1086:0x18d3  */
    /* JADX WARN: Code duplicated, block: B:1088:0x18f4  */
    /* JADX WARN: Code duplicated, block: B:1098:0x192b  */
    /* JADX WARN: Code duplicated, block: B:1100:0x194c  */
    /* JADX WARN: Code duplicated, block: B:1111:0x1984  */
    /* JADX WARN: Code duplicated, block: B:1114:0x198f  */
    /* JADX WARN: Code duplicated, block: B:1116:0x19b0  */
    /* JADX WARN: Code duplicated, block: B:1126:0x19e7  */
    /* JADX WARN: Code duplicated, block: B:1128:0x1a0a  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:1139:0x1a42  */
    /* JADX WARN: Code duplicated, block: B:1141:0x1a48  */
    /* JADX WARN: Code duplicated, block: B:1143:0x1a69  */
    /* JADX WARN: Code duplicated, block: B:1146:0x1a73  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:1151:0x1a88  */
    /* JADX WARN: Code duplicated, block: B:1153:0x1aa9  */
    /* JADX WARN: Code duplicated, block: B:1155:0x1ac1  */
    /* JADX WARN: Code duplicated, block: B:1166:0x1af9  */
    /* JADX WARN: Code duplicated, block: B:1169:0x1b03  */
    /* JADX WARN: Code duplicated, block: B:1175:0x1b19  */
    /* JADX WARN: Code duplicated, block: B:1177:0x1b23  */
    /* JADX WARN: Code duplicated, block: B:1178:0x1b25  */
    /* JADX WARN: Code duplicated, block: B:117:0x0313 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:1184:0x1b67  */
    /* JADX WARN: Code duplicated, block: B:1187:0x1b71  */
    /* JADX WARN: Code duplicated, block: B:1193:0x1b87  */
    /* JADX WARN: Code duplicated, block: B:1195:0x1b8d  */
    /* JADX WARN: Code duplicated, block: B:1206:0x1bd4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:1218:0x1c0d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:1219:0x1c0f  */
    /* JADX WARN: Code duplicated, block: B:1220:0x1c24  */
    /* JADX WARN: Code duplicated, block: B:1223:0x1c2e  */
    /* JADX WARN: Code duplicated, block: B:1229:0x1c44  */
    /* JADX WARN: Code duplicated, block: B:1231:0x1c4e  */
    /* JADX WARN: Code duplicated, block: B:1239:0x1c92 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:1250:0x1cca  */
    /* JADX WARN: Code duplicated, block: B:1252:0x1ceb  */
    /* JADX WARN: Code duplicated, block: B:129:0x034c  */
    /* JADX WARN: Code duplicated, block: B:1313:0x083e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1319:0x09a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0352  */
    /* JADX WARN: Code duplicated, block: B:1325:0x0ae1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1331:0x0bb8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1334:0x0bf6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1340:0x0cf3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1342:? A[LOOP:28: B:589:0x0cde->B:1342:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x037b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:1352:0x0e78 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1397:0x1484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1450:0x1a82 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1451:? A[LOOP:63: B:1144:0x1a6d->B:1451:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1455:0x1b13 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1458:0x1b81 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1464:0x1c3e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:1470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:163:0x041c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0422  */
    /* JADX WARN: Code duplicated, block: B:168:0x044b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    /* JADX WARN: Code duplicated, block: B:180:0x0484  */
    /* JADX WARN: Code duplicated, block: B:183:0x048c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0492  */
    /* JADX WARN: Code duplicated, block: B:188:0x04bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    /* JADX WARN: Code duplicated, block: B:200:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:202:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:205:0x0523 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:223:0x0571  */
    /* JADX WARN: Code duplicated, block: B:225:0x0577  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:240:0x05da  */
    /* JADX WARN: Code duplicated, block: B:242:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:245:0x060a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:257:0x0643  */
    /* JADX WARN: Code duplicated, block: B:259:0x0649  */
    /* JADX WARN: Code duplicated, block: B:260:0x0653  */
    /* JADX WARN: Code duplicated, block: B:263:0x065d  */
    /* JADX WARN: Code duplicated, block: B:266:0x067b  */
    /* JADX WARN: Code duplicated, block: B:277:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:279:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:282:0x06fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:294:0x0733  */
    /* JADX WARN: Code duplicated, block: B:296:0x0739  */
    /* JADX WARN: Code duplicated, block: B:299:0x077a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:311:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:313:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:316:0x07e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:328:0x081d  */
    /* JADX WARN: Code duplicated, block: B:329:0x0822  */
    /* JADX WARN: Code duplicated, block: B:333:0x082e  */
    /* JADX WARN: Code duplicated, block: B:339:0x0845  */
    /* JADX WARN: Code duplicated, block: B:340:0x084a  */
    /* JADX WARN: Code duplicated, block: B:342:0x084e  */
    /* JADX WARN: Code duplicated, block: B:345:0x085e  */
    /* JADX WARN: Code duplicated, block: B:348:0x0864 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:364:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:366:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:367:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:370:0x08da  */
    /* JADX WARN: Code duplicated, block: B:373:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:386:0x0935  */
    /* JADX WARN: Code duplicated, block: B:387:0x093a  */
    /* JADX WARN: Code duplicated, block: B:389:0x093e  */
    /* JADX WARN: Code duplicated, block: B:392:0x094e  */
    /* JADX WARN: Code duplicated, block: B:395:0x0954  */
    /* JADX WARN: Code duplicated, block: B:397:0x095a  */
    /* JADX WARN: Code duplicated, block: B:398:0x0965  */
    /* JADX WARN: Code duplicated, block: B:401:0x096f  */
    /* JADX WARN: Code duplicated, block: B:404:0x098d  */
    /* JADX WARN: Code duplicated, block: B:407:0x0997  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:413:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:414:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:416:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:418:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:421:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:426:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x014a  */
    /* JADX WARN: Code duplicated, block: B:431:0x0a22 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:452:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:453:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:458:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:464:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:467:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:470:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:473:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:479:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:480:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:482:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:485:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:488:0x0b07  */
    /* JADX WARN: Code duplicated, block: B:490:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:491:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:494:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:497:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:510:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:511:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:515:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:525:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:531:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:532:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:534:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:537:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:541:0x0be6  */
    /* JADX WARN: Code duplicated, block: B:547:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:548:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:550:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:553:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:556:0x0c1c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:557:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:559:0x0c24  */
    /* JADX WARN: Code duplicated, block: B:560:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:563:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:566:0x0c57 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:567:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:569:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:572:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:583:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:585:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:587:0x0cd5  */
    /* JADX WARN: Code duplicated, block: B:588:0x0cda  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:591:0x0ce4  */
    /* JADX WARN: Code duplicated, block: B:596:0x0cf9  */
    /* JADX WARN: Code duplicated, block: B:598:0x0d1c  */
    /* JADX WARN: Code duplicated, block: B:601:0x0d37 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:613:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:616:0x0d78  */
    /* JADX WARN: Code duplicated, block: B:618:0x0d80  */
    /* JADX WARN: Code duplicated, block: B:619:0x0d8a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:622:0x0d96  */
    /* JADX WARN: Code duplicated, block: B:625:0x0db3  */
    /* JADX WARN: Code duplicated, block: B:636:0x0deb  */
    /* JADX WARN: Code duplicated, block: B:638:0x0df3  */
    /* JADX WARN: Code duplicated, block: B:639:0x0dfd  */
    /* JADX WARN: Code duplicated, block: B:642:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:645:0x0e26  */
    /* JADX WARN: Code duplicated, block: B:656:0x0e5e  */
    /* JADX WARN: Code duplicated, block: B:659:0x0e68  */
    /* JADX WARN: Code duplicated, block: B:666:0x0e80  */
    /* JADX WARN: Code duplicated, block: B:671:0x0ead  */
    /* JADX WARN: Code duplicated, block: B:681:0x0ee4  */
    /* JADX WARN: Code duplicated, block: B:683:0x0f05  */
    /* JADX WARN: Code duplicated, block: B:693:0x0f3c  */
    /* JADX WARN: Code duplicated, block: B:695:0x0f5f  */
    /* JADX WARN: Code duplicated, block: B:705:0x0f96  */
    /* JADX WARN: Code duplicated, block: B:707:0x0fb7  */
    /* JADX WARN: Code duplicated, block: B:717:0x0fee  */
    /* JADX WARN: Code duplicated, block: B:719:0x1011  */
    /* JADX WARN: Code duplicated, block: B:729:0x1048  */
    /* JADX WARN: Code duplicated, block: B:731:0x106b  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:742:0x10a3  */
    /* JADX WARN: Code duplicated, block: B:745:0x10ab  */
    /* JADX WARN: Code duplicated, block: B:747:0x10cc  */
    /* JADX WARN: Code duplicated, block: B:757:0x1103  */
    /* JADX WARN: Code duplicated, block: B:759:0x1124  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:776:0x119f  */
    /* JADX WARN: Code duplicated, block: B:778:0x11c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0200  */
    /* JADX WARN: Code duplicated, block: B:796:0x122b  */
    /* JADX WARN: Code duplicated, block: B:798:0x1233  */
    /* JADX WARN: Code duplicated, block: B:799:0x123d  */
    /* JADX WARN: Code duplicated, block: B:802:0x1249  */
    /* JADX WARN: Code duplicated, block: B:805:0x1266  */
    /* JADX WARN: Code duplicated, block: B:816:0x129e  */
    /* JADX WARN: Code duplicated, block: B:818:0x12a6  */
    /* JADX WARN: Code duplicated, block: B:819:0x12b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0229 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:822:0x12bc  */
    /* JADX WARN: Code duplicated, block: B:825:0x12d9  */
    /* JADX WARN: Code duplicated, block: B:836:0x1311  */
    /* JADX WARN: Code duplicated, block: B:838:0x1319  */
    /* JADX WARN: Code duplicated, block: B:839:0x1323  */
    /* JADX WARN: Code duplicated, block: B:842:0x132f  */
    /* JADX WARN: Code duplicated, block: B:845:0x134c  */
    /* JADX WARN: Code duplicated, block: B:856:0x1384  */
    /* JADX WARN: Code duplicated, block: B:858:0x138c  */
    /* JADX WARN: Code duplicated, block: B:859:0x1396  */
    /* JADX WARN: Code duplicated, block: B:862:0x13a2  */
    /* JADX WARN: Code duplicated, block: B:865:0x13bf  */
    /* JADX WARN: Code duplicated, block: B:876:0x13f7  */
    /* JADX WARN: Code duplicated, block: B:878:0x13ff  */
    /* JADX WARN: Code duplicated, block: B:879:0x1409  */
    /* JADX WARN: Code duplicated, block: B:882:0x1415  */
    /* JADX WARN: Code duplicated, block: B:885:0x1432  */
    /* JADX WARN: Code duplicated, block: B:896:0x146a  */
    /* JADX WARN: Code duplicated, block: B:899:0x1474  */
    /* JADX WARN: Code duplicated, block: B:906:0x148c  */
    /* JADX WARN: Code duplicated, block: B:911:0x14b9  */
    /* JADX WARN: Code duplicated, block: B:922:0x14f1  */
    /* JADX WARN: Code duplicated, block: B:925:0x14f9  */
    /* JADX WARN: Code duplicated, block: B:927:0x151a  */
    /* JADX WARN: Code duplicated, block: B:937:0x1551  */
    /* JADX WARN: Code duplicated, block: B:939:0x1572  */
    /* JADX WARN: Code duplicated, block: B:949:0x15a9  */
    /* JADX WARN: Code duplicated, block: B:951:0x15ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x027a  */
    /* JADX WARN: Code duplicated, block: B:961:0x1601  */
    /* JADX WARN: Code duplicated, block: B:963:0x1622  */
    /* JADX WARN: Code duplicated, block: B:97:0x0280  */
    /* JADX WARN: Code duplicated, block: B:980:0x166e  */
    /* JADX WARN: Code duplicated, block: B:982:0x1674  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v19 java.lang.Object, still in use, count: 2, list:
          (r2v19 java.lang.Object) from 0x1c09: PHI (r2 I:??) = (r2v8 java.lang.Object), (r2v19 java.lang.Object) binds: [B:1215:0x1c07, B:1462:0x1c09] A[DONT_GENERATE, DONT_INLINE]
          (r2v19 java.lang.Object) from 0x1bfc: CHECK_CAST (rf2.b) (r2v19 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final ah2.e a(ag2.c.a r17, java.lang.String r18, java.util.List r19, rf2.l r20, boolean r21, ah2.h.b r22, ah2.h.b r23, ah2.h.a r24, boolean r25, ah2.j r26, rg2.j r27, rg2.k r28, rg2.l r29, boolean r30, boolean r31, android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 7604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah2.i.a(ag2.c$a, java.lang.String, java.util.List, rf2.l, boolean, ah2.h$b, ah2.h$b, ah2.h$a, boolean, ah2.j, rg2.j, rg2.k, rg2.l, boolean, boolean, android.content.Context):ah2.e");
    }

    public static final e b(List<rf2.b> list, rf2.a aVar, h hVar, boolean z14) {
        e eVar;
        Object next;
        Iterator<T> it = list.iterator();
        do {
            eVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((rf2.b) next).f152455a != aVar);
        rf2.b bVar = (rf2.b) next;
        if (bVar != null) {
            if (bVar.d()) {
                return null;
            }
            Float f14 = bVar.f152460f;
            if (f14 != null) {
                float fFloatValue = f14.floatValue();
                eVar = new e(hVar.z(Float.valueOf(fFloatValue), z14), Float.valueOf(fFloatValue), false, 4, null);
            }
            if (eVar != null) {
                return eVar;
            }
        }
        return new e("--", null, false, 6, null);
    }
}

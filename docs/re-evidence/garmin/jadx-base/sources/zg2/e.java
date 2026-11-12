package zg2;

import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDILiveSessionProto;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import rf2.k;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204693a;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.STEP_CALORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag2.c.a.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ag2.c.a.ROW_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ag2.c.a.PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ag2.c.a.GRADE_ADJUSTED_PACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ag2.c.a.AVG_ROW_PACE_500M.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ag2.c.a.AVG_PACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ag2.c.a.SPEED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ag2.c.a.AVG_SPEED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ag2.c.a.HEART_RATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ag2.c.a.AVG_HEART_RATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ag2.c.a.HEART_RATE_ZONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ag2.c.a.POWER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ag2.c.a.POWER_ZONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ag2.c.a.AVG_POWER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ag2.c.a.TIMER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ag2.c.a.WORKING_TIME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ag2.c.a.REST_TIME.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ag2.c.a.STEP_TIMER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ag2.c.a.REST_TIMER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ag2.c.a.REST_DURATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ag2.c.a.STEP_DURATION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ag2.c.a.REPS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ag2.c.a.SETS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ag2.c.a.ROUNDS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ag2.c.a.TOTAL_CALORIES.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ag2.c.a.ACTIVE_CALORIES.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ag2.c.a.AVG_STROKE_RATE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ag2.c.a.STROKE_RATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ag2.c.a.TOTAL_STROKES.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ag2.c.a.RESPIRATION_RATE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ag2.c.a.POSES.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ag2.c.a.MOVES.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ag2.c.a.DISTANCE_METERS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ag2.c.a.LAP_DISTANCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ag2.c.a.STEP_DISTANCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ag2.c.a.SET_TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ag2.c.a.LAP_TIMER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ag2.c.a.LAP_PACE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ag2.c.a.LAP_AVG_HEART_RATE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ag2.c.a.LAP_COUNT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ag2.c.a.LAP_AVG_POWER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ag2.c.a.LAP_POWER.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ag2.c.a.BIKE_CADENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ag2.c.a.RUN_CADENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ag2.c.a.ROUND.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ag2.c.a.CIRCUITS.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[ag2.c.a.INTERVALS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[ag2.c.a.STRESS.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[ag2.c.a.MAX_HEART_RATE.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[ag2.c.a.ELEVATION.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[ag2.c.a.MAX_STRESS.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[ag2.c.a.AVG_STRESS.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[ag2.c.a.SONG_COUNT.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[ag2.c.a.TOTAL_ASCENT.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[ag2.c.a.TOTAL_DESCENT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_ACTIVE_TIME.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_REPS.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_AVG_SPEED.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_ROUNDS.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[ag2.c.a.JUMP_ROPE_LAST_ROUND_REPS.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[ag2.c.a.STEPS.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[ag2.c.a.TOTAL_ROUTES.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[ag2.c.a.AVG_TEMPO.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[ag2.c.a.FLOORS_CLIMBED.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[ag2.c.a.FLOOR_CLIMB_RATE.ordinal()] = 67;
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
            f204693a = iArr;
        }
    }

    public static final boolean a(ag2.c.a aVar) {
        switch (a.f204693a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 72:
            case 77:
                return true;
            case 70:
            case 71:
            case 73:
            case 74:
            case 75:
            case 76:
                return false;
            default:
                u0.r();
                return false;
        }
    }

    public static final ArrayList b(ag2.c.a aVar) {
        ArrayList arrayList = new ArrayList();
        switch (a.f204693a[aVar.ordinal()]) {
            case 1:
                arrayList.add(rf2.a.CALORIES);
                return arrayList;
            case 2:
                arrayList.add(rf2.a.WORKOUT_CALS_TO_GO);
                return arrayList;
            case 3:
                arrayList.add(rf2.a.DISTANCE);
                return arrayList;
            case 4:
            case 5:
                arrayList.add(rf2.a.PACE);
                return arrayList;
            case 6:
                arrayList.add(rf2.a.GRADE_ADJUSTED_PACE);
                return arrayList;
            case 7:
            case 8:
                arrayList.add(rf2.a.PACE_AVG);
                return arrayList;
            case 9:
                arrayList.add(rf2.a.SPEED);
                return arrayList;
            case 10:
                arrayList.add(rf2.a.SPEED_AVG);
                return arrayList;
            case 11:
                arrayList.add(rf2.a.HEART_RATE);
                return arrayList;
            case 12:
                arrayList.add(rf2.a.HEART_RATE_AVG);
                return arrayList;
            case 13:
                arrayList.add(rf2.a.HEART_RATE_ZONE_NUMBER);
                return arrayList;
            case 14:
                arrayList.add(rf2.a.POWER);
                return arrayList;
            case 15:
                arrayList.add(rf2.a.POWER_ZONE);
                return arrayList;
            case 16:
                arrayList.add(rf2.a.POWER_AVG);
                return arrayList;
            case 17:
                arrayList.add(rf2.a.TIME);
                return arrayList;
            case 18:
                arrayList.add(rf2.a.TIME_ACTIVE);
                arrayList.add(rf2.a.TIME_LAP);
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 19:
                arrayList.add(rf2.a.TIME);
                arrayList.add(rf2.a.TIME_ACTIVE);
                arrayList.add(rf2.a.TIME_LAP);
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 20:
            case 21:
                arrayList.add(rf2.a.WORKOUT_INTERVAL_TIMER);
                arrayList.add(rf2.a.TIME_LAP);
                return arrayList;
            case 22:
            case 23:
                arrayList.add(rf2.a.WORKOUT_TIME_TO_GO);
                return arrayList;
            case 24:
                arrayList.add(rf2.a.WORKOUT_SET_REPS);
                return arrayList;
            case 25:
                arrayList.add(rf2.a.WORKOUT_SET_COUNT);
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 26:
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 27:
                arrayList.add(rf2.a.CALORIES);
                return arrayList;
            case 28:
                arrayList.add(rf2.a.ACTIVE_CALORIES);
                return arrayList;
            case 29:
                arrayList.add(rf2.a.STROKE_RATE_AVG);
                return arrayList;
            case 30:
                arrayList.add(rf2.a.STROKE_RATE);
                return arrayList;
            case 31:
                arrayList.add(rf2.a.STROKES);
                return arrayList;
            case 32:
                arrayList.add(rf2.a.BREATHING_RATE);
                return arrayList;
            case 33:
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 34:
                arrayList.add(rf2.a.WORKOUT_SET_COUNT);
                return arrayList;
            case 35:
                arrayList.add(rf2.a.DISTANCE);
                return arrayList;
            case 36:
                arrayList.add(rf2.a.DISTANCE_LAP);
                return arrayList;
            case 37:
                arrayList.add(rf2.a.WORKOUT_DIST_TO_GO);
                return arrayList;
            case 38:
            case 39:
                arrayList.add(rf2.a.TIME_LAP);
                return arrayList;
            case 40:
                arrayList.add(rf2.a.PACE_LAP);
                return arrayList;
            case 41:
                arrayList.add(rf2.a.HEART_RATE_LAP);
                return arrayList;
            case 42:
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 43:
            case 44:
                arrayList.add(rf2.a.POWER_LAP);
                return arrayList;
            case 45:
            case 46:
                arrayList.add(rf2.a.CADENCE);
                return arrayList;
            case 47:
            case 48:
                arrayList.add(rf2.a.WORKOUT_SET_COUNT);
                arrayList.add(rf2.a.WORKOUT_REPS_TO_GO);
                return arrayList;
            case 49:
                arrayList.add(rf2.a.LAPS);
                arrayList.add(rf2.a.WORKOUT_SET_COUNT);
                arrayList.add(rf2.a.WORKOUT_REPS_TO_GO);
                return arrayList;
            case 50:
                arrayList.add(rf2.a.STRESS);
                return arrayList;
            case 51:
                arrayList.add(rf2.a.HEART_RATE);
                return arrayList;
            case 52:
                arrayList.add(rf2.a.ELEVATION);
                return arrayList;
            case 53:
                arrayList.add(rf2.a.MAX_STRESS);
                return arrayList;
            case 54:
                arrayList.add(rf2.a.STRESS_AVG);
                return arrayList;
            case 55:
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 56:
                arrayList.add(rf2.a.TOTAL_ASCENT);
                return arrayList;
            case 57:
                arrayList.add(rf2.a.TOTAL_DESCENT);
                return arrayList;
            case 58:
                arrayList.add(rf2.a.JUMP_ROPE_ACTIVE_TIME);
                return arrayList;
            case 59:
                arrayList.add(rf2.a.JUMP_ROPE_NUM_COUNT);
                return arrayList;
            case 60:
                arrayList.add(rf2.a.JUMP_ROPE_AVG_SPEED);
                return arrayList;
            case 61:
                arrayList.add(rf2.a.JUMP_ROPE_NUM_ROUNDS);
                return arrayList;
            case 62:
                arrayList.add(rf2.a.JUMP_ROPE_NUM_LAST_ROUND_COUNT);
                return arrayList;
            case 63:
                arrayList.add(rf2.a.STEPS);
                return arrayList;
            case 64:
                arrayList.add(rf2.a.LAPS);
                return arrayList;
            case 65:
                arrayList.add(rf2.a.CADENCE_AVG);
                return arrayList;
            case 66:
                arrayList.add(rf2.a.FLOORS_CLIMBED);
                return arrayList;
            case 67:
                arrayList.add(rf2.a.FLOOR_CLIMB_RATE);
                return arrayList;
            case 68:
                arrayList.add(rf2.a.WORKOUT_CURRENT_REPEAT_TIME_TO_GO);
                return arrayList;
            case 69:
                arrayList.add(rf2.a.TIME);
                return arrayList;
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                return arrayList;
            default:
                u0.r();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    public static final rf2.b c(GDILiveSessionProto.Metric metric) {
        Object next;
        Object obj;
        Object stringVal;
        int i14;
        k kVar = null;
        if (metric != null) {
            rf2.a.C2866a c2866a = rf2.a.f152429b;
            int type = metric.getType();
            c2866a.getClass();
            Iterator<T> it = rf2.a.f152430b1.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((rf2.a) next).f152454a != type);
            rf2.a aVar = (rf2.a) next;
            if (aVar != null) {
                rf2.a.f152429b.getClass();
                Float fValueOf = metric.hasFloatVal() ? Float.valueOf(metric.getFloatVal()) : null;
                if (fValueOf == null) {
                    Integer numValueOf = metric.hasIntVal() ? Integer.valueOf(metric.getIntVal()) : null;
                    fValueOf = numValueOf != null ? Float.valueOf(numValueOf.intValue()) : null;
                }
                if (fValueOf != null) {
                    float fFloatValue = fValueOf.floatValue();
                    stringVal = (Float.isNaN(fFloatValue) || fFloatValue == 2.1474836E9f) ? "--" : Float.valueOf(fFloatValue);
                } else {
                    if (metric.hasStringVal()) {
                        stringVal = metric.getStringVal();
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        if (metric.hasMeasurementUnit()) {
                            GDIDataTypes.MeasurementUnit measurementUnit = metric.getMeasurementUnit();
                            measurementUnit.getClass();
                            i14 = rf2.c.f152462a[measurementUnit.ordinal()];
                            if (i14 != 1) {
                                kVar = k.METRIC;
                            } else {
                                if (i14 == 2) {
                                    u0.r();
                                    return null;
                                }
                                kVar = k.STATUTE;
                            }
                        }
                        return new rf2.b(aVar, metric.getTimestamp(), kVar, obj, null, 16, null);
                    }
                }
                obj = stringVal;
                if (obj != null) {
                    if (metric.hasMeasurementUnit()) {
                        GDIDataTypes.MeasurementUnit measurementUnit2 = metric.getMeasurementUnit();
                        measurementUnit2.getClass();
                        i14 = rf2.c.f152462a[measurementUnit2.ordinal()];
                        if (i14 != 1) {
                            kVar = k.METRIC;
                        } else {
                            if (i14 == 2) {
                                u0.r();
                                return null;
                            }
                            kVar = k.STATUTE;
                        }
                    }
                    return new rf2.b(aVar, metric.getTimestamp(), kVar, obj, null, 16, null);
                }
            }
        }
        return null;
    }
}

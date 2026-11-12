package zg2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.proto.generated.GDILiveSessionProto;
import lc.u0;
import mt2.l;
import vf2.j;
import vf2.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f204695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f204696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f204697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f204698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f204699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f204700g;

        static {
            int[] iArr = new int[vf2.g.values().length];
            try {
                iArr[vf2.g.FIT_INTENSITY_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_REST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_WARMUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_COOLDOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_RECOVERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_INTERVAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[vf2.g.FIT_INTENSITY_MAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f204694a = iArr;
            int[] iArr2 = new int[vf2.i.values().length];
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_HR_LESS_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_HR_LESS_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_HR_GREATER_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_HR_GREATER_THAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_CALORIES.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_CALORIES.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_OPEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_STEPS_CMPLT.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_POWER_LESS_THAN.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_POWER_LESS_THAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_POWER_GREATER_THAN.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPEAT_UNTIL_POWER_GREATER_THAN.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPETITION_TIME.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[vf2.i.FIT_WKT_STEP_DURATION_REPS.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            f204695b = iArr2;
            int[] iArr3 = new int[mt2.c.values().length];
            try {
                iArr3[mt2.c.LAP_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[mt2.c.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[mt2.c.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[mt2.c.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[mt2.c.POWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[mt2.c.HEART_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[mt2.c.FIXED_REST.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[mt2.c.FIXED_REPETITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[mt2.c.REPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            f204696c = iArr3;
            int[] iArr4 = new int[mt2.i.values().length];
            try {
                iArr4[mt2.i.INHALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[mt2.i.INHALE_HOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[mt2.i.EXHALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[mt2.i.EXHALE_HOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[mt2.i.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[mt2.i.CADENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[mt2.i.SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr4[mt2.i.PACE.ordinal()] = 8;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[mt2.i.CUSTOM_HEART_RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[mt2.i.HEART_RATE_ZONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[mt2.i.CUSTOM_POWER.ordinal()] = 11;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr4[mt2.i.POWER_CURVE.ordinal()] = 12;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr4[mt2.i.POWER_ZONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused48) {
            }
            f204697d = iArr4;
            int[] iArr5 = new int[j.values().length];
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_POWER_3S.ordinal()] = 4;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_POWER_10S.ordinal()] = 5;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_POWER_30S.ordinal()] = 6;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_SPEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_HEART_RATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_CADENCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_HEART_RATE_LAP.ordinal()] = 10;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_POWER_CURVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_INHALE_DURATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_INHALE_HOLD_DURATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_EXHALE_DURATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr5[j.FIT_WKT_STEP_TARGET_EXHALE_HOLD_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused63) {
            }
            f204698e = iArr5;
            int[] iArr6 = new int[GDILiveSessionProto.WorkoutSession.Type.values().length];
            try {
                iArr6[GDILiveSessionProto.WorkoutSession.Type.OPEN_REPEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr6[GDILiveSessionProto.WorkoutSession.Type.STRUCTURED_REPEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr6[GDILiveSessionProto.WorkoutSession.Type.TARGET_WORKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr6[GDILiveSessionProto.WorkoutSession.Type.STRUCTURED_WORKOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr6[GDILiveSessionProto.WorkoutSession.Type.HIIT_TIMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused68) {
            }
            f204699f = iArr6;
            int[] iArr7 = new int[mt2.b.values().length];
            try {
                iArr7[mt2.b.ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr7[mt2.b.BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused70) {
            }
            f204700g = iArr7;
        }
    }

    public static final mt2.b a(vf2.i iVar) {
        int i14 = a.f204695b[iVar.ordinal()];
        if (i14 == 5 || i14 == 6) {
            return mt2.b.BELOW;
        }
        if (i14 == 7 || i14 == 8) {
            return mt2.b.ABOVE;
        }
        switch (i14) {
            case 13:
            case 14:
                return mt2.b.BELOW;
            case 15:
            case 16:
                return mt2.b.ABOVE;
            default:
                return null;
        }
    }

    public static final mt2.c b(vf2.i iVar) {
        switch (a.f204695b[iVar.ordinal()]) {
            case 1:
            case 2:
                return mt2.c.TIME;
            case 3:
            case 4:
                return mt2.c.DISTANCE;
            case 5:
            case 6:
                return mt2.c.HEART_RATE;
            case 7:
            case 8:
                return mt2.c.HEART_RATE;
            case 9:
            case 10:
                return mt2.c.CALORIES;
            case 11:
                return mt2.c.LAP_BUTTON;
            case 12:
                return mt2.c.REPS;
            case 13:
            case 14:
                return mt2.c.POWER;
            case 15:
            case 16:
                return mt2.c.POWER;
            case 17:
                return mt2.c.FIXED_REPETITION;
            case 18:
                return mt2.c.REPS;
            default:
                return mt2.c.LAP_BUTTON;
        }
    }

    public static final lt2.b c(j jVar, w wVar, zf2.d dVar) {
        mt2.i iVar;
        mt2.i iVar2;
        double dFloatValue;
        mt2.i iVar3;
        boolean z14;
        Float target;
        dVar.getClass();
        Float fValueOf = null;
        fValueOf = null;
        fValueOf = null;
        fValueOf = null;
        fValueOf = null;
        switch (a.f204698e[jVar.ordinal()]) {
            case 1:
            case 2:
                iVar = mt2.i.NONE;
                iVar2 = iVar;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                iVar = mt2.i.POWER_ZONE;
                iVar2 = iVar;
                break;
            case 7:
                iVar = dVar == zf2.d.f204609p ? mt2.i.PACE : mt2.i.SPEED;
                iVar2 = iVar;
                break;
            case 8:
                iVar = mt2.i.HEART_RATE_ZONE;
                iVar2 = iVar;
                break;
            case 9:
                iVar = mt2.i.CADENCE;
                iVar2 = iVar;
                break;
            case 10:
                iVar = mt2.i.HEART_RATE_ZONE;
                iVar2 = iVar;
                break;
            case 11:
                iVar = mt2.i.POWER_CURVE;
                iVar2 = iVar;
                break;
            case 12:
                iVar = mt2.i.INHALE;
                iVar2 = iVar;
                break;
            case 13:
                iVar = mt2.i.INHALE_HOLD;
                iVar2 = iVar;
                break;
            case 14:
                iVar = mt2.i.EXHALE;
                iVar2 = iVar;
                break;
            case 15:
                iVar = mt2.i.EXHALE_HOLD;
                iVar2 = iVar;
                break;
            default:
                iVar2 = null;
                break;
        }
        if (iVar2 == null) {
            return null;
        }
        int i14 = a.f204697d[iVar2.ordinal()];
        if (i14 == 8) {
            Float targetHigh = wVar.getTargetHigh();
            double dFloatValue2 = (targetHigh == null && (targetHigh = wVar.getTarget()) == null) ? 0.0d : targetHigh.floatValue();
            Float targetLow = wVar.getTargetLow();
            return new lt2.b(iVar2, dFloatValue2, targetLow != null ? targetLow.floatValue() : 0.0d, null, 0, 0, 0, 0, 248, null);
        }
        int iFloatValue = 0;
        if (i14 == 10) {
            if (wVar.getTargetHigh() == null) {
                mt2.i iVar4 = mt2.i.HEART_RATE_ZONE;
                Float target2 = wVar.getTarget();
                return new lt2.b(iVar4, 0.0d, 0.0d, null, 0, 0, 0, target2 != null ? (int) target2.floatValue() : 0, 126, null);
            }
            Float targetLow2 = wVar.getTargetLow();
            dFloatValue = (targetLow2 == null && (targetLow2 = wVar.getTarget()) == null) ? 0.0d : targetLow2.floatValue();
            double dFloatValue3 = wVar.getTargetHigh().floatValue();
            double d14 = vf2.h.FIT_WORKOUT_HR_BPM_OFFSET.f177951a;
            if (dFloatValue > d14 && dFloatValue3 > d14) {
                dFloatValue -= d14;
                dFloatValue3 -= d14;
            }
            return new lt2.b(mt2.i.CUSTOM_HEART_RATE, dFloatValue, dFloatValue3, null, 0, 0, 0, 0, 248, null);
        }
        if (i14 == 12) {
            Float powerCurveDuration = wVar.getPowerCurveDuration();
            Integer numValueOf = powerCurveDuration != null ? Integer.valueOf((int) powerCurveDuration.floatValue()) : null;
            Float powerCurveScale = wVar.getPowerCurveScale();
            Integer numValueOf2 = powerCurveScale != null ? Integer.valueOf((int) powerCurveScale.floatValue()) : null;
            if (wVar.getTargetLow() != null && wVar.getTargetHigh() != null && wVar.getTargetLow().floatValue() > 0.0f && wVar.getTargetHigh().floatValue() > 0.0f && wVar.getTargetHigh().floatValue() > wVar.getTargetLow().floatValue()) {
                Float targetLow3 = wVar.getTargetLow();
                Float targetHigh2 = wVar.getTargetHigh();
                float fFloatValue = targetLow3.floatValue();
                vf2.h hVar = vf2.h.FIT_WORKOUT_POWER_WATTS_OFFSET;
                int i15 = hVar.f177951a;
                int i16 = hVar.f177951a;
                if (fFloatValue > i15 && targetHigh2.floatValue() > i16) {
                    targetLow3 = Float.valueOf(targetLow3.floatValue() - i16);
                    targetHigh2 = Float.valueOf(targetHigh2.floatValue() - i16);
                }
                fValueOf = Float.valueOf((targetHigh2.floatValue() - targetLow3.floatValue()) / 2);
            }
            Float targetLow4 = wVar.getTargetLow();
            double dFloatValue4 = (targetLow4 == null && (targetLow4 = wVar.getTarget()) == null) ? 0.0d : targetLow4.floatValue();
            Float targetHigh3 = wVar.getTargetHigh();
            dFloatValue = targetHigh3 != null ? targetHigh3.floatValue() : 0.0d;
            Integer num = numValueOf2;
            return new lt2.b(iVar2, dFloatValue4, dFloatValue, null, numValueOf != null ? numValueOf.intValue() : -1, num != null ? num.intValue() : -1, fValueOf != null ? (int) fValueOf.floatValue() : -1, 0, SyslogConstants.LOG_LOCAL1, null);
        }
        if (i14 != 13) {
            Float targetLow5 = wVar.getTargetLow();
            double dFloatValue5 = (targetLow5 == null && (targetLow5 = wVar.getTarget()) == null) ? 0.0d : targetLow5.floatValue();
            Float targetHigh4 = wVar.getTargetHigh();
            return new lt2.b(iVar2, dFloatValue5, targetHigh4 != null ? targetHigh4.floatValue() : 0.0d, null, 0, 0, 0, 0, 248, null);
        }
        Float targetLow6 = wVar.getTargetLow();
        Double dValueOf = (targetLow6 == null && (targetLow6 = wVar.getTarget()) == null) ? null : Double.valueOf(targetLow6.floatValue());
        Float targetHigh5 = wVar.getTargetHigh();
        Double dValueOf2 = targetHigh5 != null ? Double.valueOf(targetHigh5.floatValue()) : null;
        if (dValueOf == null || dValueOf2 == null) {
            iVar3 = mt2.i.POWER_ZONE;
            z14 = false;
        } else {
            double dDoubleValue = dValueOf.doubleValue();
            vf2.h hVar2 = vf2.h.FIT_WORKOUT_POWER_WATTS_OFFSET;
            int i17 = hVar2.f177951a;
            int i18 = hVar2.f177951a;
            if (dDoubleValue <= i17 || dValueOf2.doubleValue() <= i18) {
                z14 = true;
            } else {
                dValueOf = Double.valueOf(dValueOf.doubleValue() - ((double) i18));
                dValueOf2 = Double.valueOf(dValueOf2.doubleValue() - ((double) i18));
                z14 = false;
            }
            iVar3 = mt2.i.CUSTOM_POWER;
        }
        mt2.i iVar5 = iVar3;
        if (iVar5 == mt2.i.POWER_ZONE && (target = wVar.getTarget()) != null) {
            iFloatValue = (int) target.floatValue();
        }
        return new lt2.b(iVar5, dValueOf != null ? dValueOf.doubleValue() : 0.0d, dValueOf2 != null ? dValueOf2.doubleValue() : 0.0d, z14 ? mt2.j.PERCENT : null, 0, 0, 0, iFloatValue, 112, null);
    }

    public static final l d(vf2.g gVar) {
        switch (a.f204694a[gVar.ordinal()]) {
            case 1:
                return l.INTERVAL;
            case 2:
                return l.REST;
            case 3:
                return l.WARM_UP;
            case 4:
                return l.COOL_DOWN;
            case 5:
                return l.RECOVERY;
            case 6:
                return l.INTERVAL;
            case 7:
                return l.OTHER;
            case 8:
                return l.INTERVAL;
            default:
                u0.r();
                return null;
        }
    }

    public static final ag2.c.a e(mt2.c cVar, boolean z14) {
        cVar.getClass();
        switch (a.f204696c[cVar.ordinal()]) {
            case 1:
                return z14 ? ag2.c.a.REST_TIMER : ag2.c.a.STEP_TIMER;
            case 2:
                return z14 ? ag2.c.a.REST_DURATION : ag2.c.a.STEP_DURATION;
            case 3:
                return ag2.c.a.STEP_DISTANCE;
            case 4:
                return ag2.c.a.STEP_CALORIES;
            case 5:
                return ag2.c.a.POWER;
            case 6:
                return ag2.c.a.HEART_RATE;
            case 7:
                return ag2.c.a.REST_TIME;
            case 8:
                return ag2.c.a.REPS;
            case 9:
                return ag2.c.a.REPS;
            default:
                return null;
        }
    }

    public static final ag2.c.a f(mt2.i iVar, zf2.d dVar) {
        iVar.getClass();
        dVar.getClass();
        switch (a.f204697d[iVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return null;
            case 6:
                return dVar.f204633e == 2 ? ag2.c.a.BIKE_CADENCE : ag2.c.a.RUN_CADENCE;
            case 7:
                return ag2.c.a.SPEED;
            case 8:
                return ag2.c.a.PACE;
            case 9:
                return ag2.c.a.HEART_RATE;
            case 10:
                return ag2.c.a.HEART_RATE_ZONE;
            case 11:
            case 12:
                return ag2.c.a.POWER;
            case 13:
                return ag2.c.a.POWER_ZONE;
            default:
                u0.r();
                return null;
        }
    }
}

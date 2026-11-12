package mq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.o1;
import ps.x1;
import qs.w;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/i;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f120185a = new i();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120186a;

        static {
            int[] iArr = new int[mq.a.values().length];
            try {
                iArr[mq.a.INTERVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mq.a.INTERVAL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mq.a.SPLIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mq.a.LAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mq.a.RUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mq.a.SPLIT_TYPE_LANDSCAPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mq.a.INTERVAL_LENGTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mq.a.SPLIT_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[mq.a.TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[mq.a.TOTAL_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[mq.a.LAP_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[mq.a.CUMULATIVE_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[mq.a.MOVING_TIME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[mq.a.RUN_MOVING_TIME.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[mq.a.DISTANCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[mq.a.DISTANCE_SHORT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[mq.a.LAP_DISTANCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[mq.a.ELEV_GAIN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[mq.a.ASCENT_ELEV_GAIN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[mq.a.ELEV_LOSS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[mq.a.DESCENT_ELEV_LOSS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[mq.a.AVG_SPEED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[mq.a.AVG_SPEED_IN_USER_UNIT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[mq.a.AVG_VERTICAL_SPEED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[mq.a.AVG_MOVING_SPEED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[mq.a.MAX_SPEED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[mq.a.MAX_SPEED_IN_USER_UNIT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[mq.a.AVG_PACE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[mq.a.AVG_GAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[mq.a.BEST_PACE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[mq.a.AVG_MOVING_PACE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[mq.a.AVG_HR.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[mq.a.AVG_HR_SHORT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[mq.a.MAX_HR.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[mq.a.MAX_HR_SHORT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[mq.a.AVG_RUN_CADENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[mq.a.AVG_CADENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[mq.a.AVG_TEMPO.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[mq.a.MAX_RUN_CADENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[mq.a.MAX_CADENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[mq.a.NORMALIZED_POWER.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[mq.a.AVG_POWER.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[mq.a.MAX_POWER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[mq.a.WEIGHT_AVG_POWER.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[mq.a.WEIGHT_MAX_POWER.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[mq.a.AVG_STRIDE_LENGTH.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[mq.a.CALORIES.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[mq.a.AVG_GCT.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[mq.a.AVG_GCT_BAL.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[mq.a.AVG_VERT_OSC.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[mq.a.AVG_VERT_OSC_RATIO.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[mq.a.STATUS.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[mq.a.TARGET_TYPE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[mq.a.IDLE_TIME.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[mq.a.AVG_SKI_CADENCE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            f120186a = iArr;
        }
    }

    private i() {
    }

    public static void a(Context context, o oVar, ArrayList arrayList, o1 o1Var, to.j jVar, double d14, int i14, Boolean bool) {
        Double groundContactBalanceLeft;
        Double movingDuration;
        Double duration;
        context.getClass();
        oVar.f120193a.setBackgroundColor(aq.a.h0(i14 + 1, context));
        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
        ArrayList arrayList2 = oVar.f120194b;
        int size = arrayList2.size();
        for (int i15 = 0; i15 < size; i15++) {
            l lVar = (l) arrayList.get(i15);
            String string = "";
            if (lVar instanceof mq.a) {
                boolean zBooleanValue = jVar.f165809d;
                double dDoubleValue = 0.0d;
                switch (a.f120186a[((mq.a) lVar).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        string = context.getString(R.string.challenge_leaderboard_header_total_label);
                        string.getClass();
                        break;
                    case 7:
                    case 19:
                    case 21:
                    case 24:
                    case 52:
                    default:
                        string = context.getString(R.string.no_value);
                        string.getClass();
                        break;
                    case 8:
                    case 53:
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        string = aq.a.W(context, o1Var != null ? o1Var.getDuration() : null);
                        break;
                    case 13:
                    case 14:
                        string = aq.a.W(context, o1Var != null ? o1Var.getMovingDuration() : null);
                        break;
                    case 15:
                    case 16:
                    case 17:
                        Double distance = o1Var != null ? o1Var.getDistance() : null;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        string = aq.a.h(context, distance, zBooleanValue);
                        break;
                    case 18:
                        string = aq.a.j(context, o1Var != null ? o1Var.getElevationGain() : null, o0VarG);
                        break;
                    case 20:
                        string = aq.a.j(context, o1Var != null ? o1Var.getElevationLoss() : null, o0VarG);
                        break;
                    case 22:
                        string = aq.a.K(context, o1Var != null ? o1Var.getAverageSpeed() : null, zBooleanValue);
                        break;
                    case 23:
                        string = aq.a.K(context, o1Var != null ? o1Var.getAverageSpeed() : null, zBooleanValue);
                        break;
                    case 25:
                        string = aq.a.K(context, o1Var != null ? o1Var.getAverageMovingSpeed() : null, zBooleanValue);
                        break;
                    case 26:
                        string = aq.a.K(context, o1Var != null ? o1Var.getMaxSpeed() : null, zBooleanValue);
                        break;
                    case 27:
                        string = aq.a.K(context, o1Var != null ? o1Var.getMaxSpeed() : null, zBooleanValue);
                        break;
                    case 28:
                        Double averageSpeed = o1Var != null ? o1Var.getAverageSpeed() : null;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        string = aq.a.D(context, averageSpeed, zBooleanValue);
                        break;
                    case 29:
                        Double avgGradeAdjustedSpeed = o1Var != null ? o1Var.getAvgGradeAdjustedSpeed() : null;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        string = aq.a.D(context, avgGradeAdjustedSpeed, zBooleanValue);
                        break;
                    case 30:
                        Double maxSpeed = o1Var != null ? o1Var.getMaxSpeed() : null;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        string = aq.a.D(context, maxSpeed, zBooleanValue);
                        break;
                    case 31:
                        Double averageMovingSpeed = o1Var != null ? o1Var.getAverageMovingSpeed() : null;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        string = aq.a.D(context, averageMovingSpeed, zBooleanValue);
                        break;
                    case 32:
                    case 33:
                        string = aq.a.q(context, o1Var != null ? o1Var.getAverageHR() : null);
                        break;
                    case 34:
                    case 35:
                        string = aq.a.q(context, o1Var != null ? o1Var.getMaxHR() : null);
                        break;
                    case 36:
                    case 37:
                    case 38:
                    case 55:
                        string = aq.a.I(context, o1Var != null ? o1Var.getAverageRunCadence() : null);
                        break;
                    case 39:
                    case 40:
                        string = aq.a.I(context, o1Var != null ? o1Var.getMaxRunCadence() : null);
                        break;
                    case 41:
                        string = aq.a.E(context, o1Var != null ? o1Var.getNormalizedPower() : null);
                        break;
                    case 42:
                        string = aq.a.E(context, o1Var != null ? o1Var.getAvgPower() : null);
                        break;
                    case 43:
                        string = aq.a.E(context, o1Var != null ? o1Var.getMaxPower() : null);
                        break;
                    case 44:
                        string = aq.a.F(context, o1Var != null ? o1Var.getAvgPower() : null, d14);
                        break;
                    case 45:
                        string = aq.a.F(context, o1Var != null ? o1Var.getMaxPower() : null, d14);
                        break;
                    case 46:
                        string = aq.a.O(context, o1Var != null ? o1Var.getStrideLength() : null);
                        break;
                    case 47:
                        string = aq.a.d(context, o1Var != null ? o1Var.getCalories() : null);
                        break;
                    case 48:
                        string = aq.a.n(context, o1Var != null ? o1Var.getGroundContactTime() : null);
                        break;
                    case 49:
                        l3.a aVar = l3.f23124b;
                        l22.a aVar2 = new l22.a(context);
                        if (o1Var != null && (groundContactBalanceLeft = o1Var.getGroundContactBalanceLeft()) != null) {
                            dDoubleValue = groundContactBalanceLeft.doubleValue();
                        }
                        aVar.getClass();
                        string = l3.a.j0(aVar2, dDoubleValue);
                        break;
                    case 50:
                        string = aq.a.f0(context, o1Var != null ? o1Var.getVerticalOscillation() : null);
                        break;
                    case 51:
                        string = aq.a.g0(context, o1Var != null ? o1Var.getVerticalRatio() : null);
                        break;
                    case 54:
                        double dDoubleValue2 = (o1Var == null || (duration = o1Var.getDuration()) == null) ? 0.0d : duration.doubleValue();
                        if (o1Var != null && (movingDuration = o1Var.getMovingDuration()) != null) {
                            dDoubleValue = movingDuration.doubleValue();
                        }
                        string = aq.a.W(context, Double.valueOf(dDoubleValue2 - dDoubleValue));
                        break;
                }
            }
            ((TextView) arrayList2.get(i15)).setText(string);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void b(Context context, o oVar, ArrayList arrayList, ArrayList arrayList2, to.j jVar, double d14, int i14, Boolean bool) {
        String strJ0;
        int i15;
        int i16;
        context.getClass();
        arrayList2.getClass();
        x1 x1Var = (x1) arrayList2.get(jVar.f165806a);
        oVar.f120193a.setBackgroundColor(aq.a.h0(i14 + 1, context));
        o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
        ArrayList arrayList3 = oVar.f120194b;
        int size = arrayList3.size();
        int i17 = 0;
        while (i17 < size) {
            l lVar = (l) arrayList.get(i17);
            TextView textView = (TextView) arrayList3.get(i17);
            String strU = "";
            if (lVar instanceof mq.a) {
                int i18 = jVar.f165807b;
                boolean zBooleanValue = jVar.f165809d;
                switch (a.f120186a[((mq.a) lVar).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        size = size;
                        strU = aq.a.u(i18);
                        break;
                    case 7:
                        size = size;
                        int i19 = jVar.f165808c;
                        if (i18 > 0) {
                            strU = context.getString(R.string.string_dot_string_pattern, String.valueOf(i19), String.valueOf(i18));
                            strU.getClass();
                        }
                        break;
                    case 8:
                        size = size;
                        break;
                    case 9:
                    case 10:
                        size = size;
                        strU = aq.a.W(context, x1Var.getDuration());
                        break;
                    case 11:
                        size = size;
                        strU = aq.a.W(context, x1Var.getDuration());
                        break;
                    case 12:
                        size = size;
                        int size2 = arrayList2.size();
                        int i24 = 0;
                        double dDoubleValue = 0.0d;
                        while (true) {
                            if (i24 >= size2) {
                                dDoubleValue = Double.NaN;
                            } else {
                                x1 x1Var2 = (x1) arrayList2.get(i24);
                                Double duration = x1Var2.getDuration();
                                dDoubleValue += duration != null ? duration.doubleValue() : 0.0d;
                                if (!x1Var2.equals(x1Var)) {
                                    i24++;
                                }
                            }
                        }
                        strU = aq.a.W(context, Double.valueOf(dDoubleValue));
                        break;
                    case 13:
                    case 14:
                        size = size;
                        strU = aq.a.W(context, x1Var.getMovingDuration());
                        break;
                    case 15:
                    case 16:
                    case 17:
                        size = size;
                        Double distance = x1Var.getDistance();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        strU = aq.a.h(context, distance, zBooleanValue);
                        break;
                    case 18:
                        size = size;
                        strU = aq.a.j(context, x1Var.getElevationGain(), o0VarG);
                        break;
                    case 19:
                        size = size;
                        strU = aq.a.J(context, x1Var.getElevationGain(), o0VarG);
                        break;
                    case 20:
                        size = size;
                        strU = aq.a.j(context, x1Var.getElevationLoss(), o0VarG);
                        break;
                    case 21:
                        size = size;
                        strU = aq.a.J(context, x1Var.getElevationLoss(), o0VarG);
                        break;
                    case 22:
                        size = size;
                        strU = aq.a.K(context, x1Var.getAverageSpeed(), zBooleanValue);
                        break;
                    case 23:
                        size = size;
                        strU = aq.a.K(context, x1Var.getAverageSpeed(), zBooleanValue);
                        break;
                    case 24:
                        size = size;
                        strU = aq.a.K(context, x1Var.getAvgVerticalSpeed(), zBooleanValue);
                        break;
                    case 25:
                        size = size;
                        strU = aq.a.K(context, x1Var.getAverageMovingSpeed(), zBooleanValue);
                        break;
                    case 26:
                        size = size;
                        strU = aq.a.K(context, x1Var.getMaxSpeed(), zBooleanValue);
                        break;
                    case 27:
                        size = size;
                        strU = aq.a.K(context, x1Var.getMaxSpeed(), zBooleanValue);
                        break;
                    case 28:
                        size = size;
                        Double averageSpeed = x1Var.getAverageSpeed();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        strU = aq.a.D(context, averageSpeed, zBooleanValue);
                        break;
                    case 29:
                        size = size;
                        Double avgGradeAdjustedSpeed = x1Var.getAvgGradeAdjustedSpeed();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        strU = aq.a.D(context, avgGradeAdjustedSpeed, zBooleanValue);
                        break;
                    case 30:
                        size = size;
                        Double maxSpeed = x1Var.getMaxSpeed();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        strU = aq.a.D(context, maxSpeed, zBooleanValue);
                        break;
                    case 31:
                        size = size;
                        Double averageMovingSpeed = x1Var.getAverageMovingSpeed();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        strU = aq.a.D(context, averageMovingSpeed, zBooleanValue);
                        break;
                    case 32:
                    case 33:
                        size = size;
                        strU = aq.a.q(context, x1Var.getAverageHR());
                        break;
                    case 34:
                    case 35:
                        size = size;
                        strU = aq.a.q(context, x1Var.getMaxHR());
                        break;
                    case 36:
                    case 37:
                    case 38:
                        size = size;
                        strU = aq.a.I(context, x1Var.getAverageRunCadence());
                        break;
                    case 39:
                    case 40:
                        size = size;
                        strU = aq.a.I(context, x1Var.getMaxRunCadence());
                        break;
                    case 41:
                        size = size;
                        strU = aq.a.E(context, x1Var.getNormalizedPower());
                        break;
                    case 42:
                        size = size;
                        strU = aq.a.E(context, x1Var.getAvgPower());
                        break;
                    case 43:
                        size = size;
                        strU = aq.a.E(context, x1Var.getMaxPower());
                        break;
                    case 44:
                        size = size;
                        strU = aq.a.F(context, x1Var.getAvgPower(), d14);
                        break;
                    case 45:
                        size = size;
                        strU = aq.a.F(context, x1Var.getMaxPower(), d14);
                        break;
                    case 46:
                        size = size;
                        strU = aq.a.O(context, x1Var.getStrideLength());
                        break;
                    case 47:
                        size = size;
                        strU = aq.a.d(context, x1Var.getCalories());
                        break;
                    case 48:
                        size = size;
                        strU = aq.a.n(context, x1Var.getGroundContactTime());
                        break;
                    case 49:
                        Double groundContactBalanceLeft = x1Var.getGroundContactBalanceLeft();
                        if (groundContactBalanceLeft != null) {
                            l3.a aVar = l3.f23124b;
                            l22.a aVar2 = new l22.a(context);
                            double dDoubleValue2 = groundContactBalanceLeft.doubleValue();
                            aVar.getClass();
                            strJ0 = l3.a.j0(aVar2, dDoubleValue2);
                        } else {
                            strJ0 = null;
                        }
                        strU = aq.a.A(context, strJ0);
                        break;
                    case 50:
                        strU = aq.a.f0(context, x1Var.getVerticalOscillation());
                        size = size;
                        break;
                    case 51:
                        strU = aq.a.g0(context, x1Var.getVerticalRatio());
                        size = size;
                        break;
                    case 52:
                        w wVarG1 = x1Var.G1();
                        Integer numValueOf = wVarG1 != null ? Integer.valueOf(wVarG1.f147195b) : null;
                        strU = aq.a.A(context, numValueOf == null ? null : context.getString(numValueOf.intValue()));
                        size = size;
                        break;
                    default:
                        strU = context.getString(R.string.no_value);
                        strU.getClass();
                        size = size;
                        break;
                }
                if (x1Var.a2() != null) {
                    if (x1Var.a2() == x.ASCENT) {
                        i15 = R.drawable.ic_arrow_up_filled;
                        i16 = R.color.gcm_polyline_activity_lap_ascent;
                    } else if (x1Var.a2() == x.DESCENT) {
                        i15 = R.drawable.ic_arrow_down_filled;
                        i16 = R.color.gcm_polyline_activity_lap_descent;
                    } else {
                        i15 = 0;
                        i16 = 0;
                    }
                    Drawable drawable = i15 > 0 ? a7.b.getDrawable(context, i15) : null;
                    if (drawable != null) {
                        drawable.mutate().setTint(a7.b.getColor(context, i16));
                    }
                    if (lVar == mq.a.SPLIT_TYPE) {
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else if (lVar == mq.a.SPLIT_TYPE_LANDSCAPE) {
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    }
                }
            } else {
                size = size;
            }
            textView.setText(strU);
            i17++;
            size = size;
        }
    }
}

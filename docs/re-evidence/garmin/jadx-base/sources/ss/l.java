package ss;

import com.garmin.android.apps.connectmobile.activities.newmodel.o;
import com.google.android.flexbox.FlexItem;
import d53.u;
import java.util.List;
import p005kotlin.jvm.internal.s;
import ps.o1;
import ps.q1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    public static final o1 a(String str, List list) {
        str.getClass();
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (u.q(((o1) obj2).getSplitType(), str, false)) {
                obj = obj2;
                break;
            }
        }
        return (o1) obj;
    }

    public static final q1 b(q1 q1Var) {
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        Double dValueOf5;
        Double dValueOf6;
        Double dValueOf7;
        Double dValueOf8 = null;
        if (q1Var == null) {
            return null;
        }
        Double averageRunCadence = q1Var.getAverageRunCadence();
        if (averageRunCadence != null) {
            double dDoubleValue = averageRunCadence.doubleValue();
            if (dDoubleValue < 1.0d) {
                dDoubleValue = 1.0d;
            }
            dValueOf = Double.valueOf(dDoubleValue);
        } else {
            dValueOf = null;
        }
        Double maxRunCadence = q1Var.getMaxRunCadence();
        if (maxRunCadence != null) {
            double dDoubleValue2 = maxRunCadence.doubleValue();
            if (dDoubleValue2 < 1.0d) {
                dDoubleValue2 = 1.0d;
            }
            dValueOf2 = Double.valueOf(dDoubleValue2);
        } else {
            dValueOf2 = null;
        }
        Double averageBikeCadence = q1Var.getAverageBikeCadence();
        if (averageBikeCadence != null) {
            double dDoubleValue3 = averageBikeCadence.doubleValue();
            if (dDoubleValue3 < 1.0d) {
                dDoubleValue3 = 1.0d;
            }
            dValueOf3 = Double.valueOf(dDoubleValue3);
        } else {
            dValueOf3 = null;
        }
        Double maxBikeCadence = q1Var.getMaxBikeCadence();
        if (maxBikeCadence != null) {
            double dDoubleValue4 = maxBikeCadence.doubleValue();
            if (dDoubleValue4 < 1.0d) {
                dDoubleValue4 = 1.0d;
            }
            dValueOf4 = Double.valueOf(dDoubleValue4);
        } else {
            dValueOf4 = null;
        }
        Double averageSwimCadence = q1Var.getAverageSwimCadence();
        if (averageSwimCadence != null) {
            double dDoubleValue5 = averageSwimCadence.doubleValue();
            if (dDoubleValue5 < 1.0d) {
                dDoubleValue5 = 1.0d;
            }
            dValueOf5 = Double.valueOf(dDoubleValue5);
        } else {
            dValueOf5 = null;
        }
        Double maxSwimCadence = q1Var.getMaxSwimCadence();
        if (maxSwimCadence != null) {
            double dDoubleValue6 = maxSwimCadence.doubleValue();
            if (dDoubleValue6 < 1.0d) {
                dDoubleValue6 = 1.0d;
            }
            dValueOf6 = Double.valueOf(dDoubleValue6);
        } else {
            dValueOf6 = null;
        }
        Double maxStrokeCadence = q1Var.getMaxStrokeCadence();
        if (maxStrokeCadence != null) {
            double dDoubleValue7 = maxStrokeCadence.doubleValue();
            if (dDoubleValue7 < 1.0d) {
                dDoubleValue7 = 1.0d;
            }
            dValueOf7 = Double.valueOf(dDoubleValue7);
        } else {
            dValueOf7 = null;
        }
        Double averageStrokeCadence = q1Var.getAverageStrokeCadence();
        if (averageStrokeCadence != null) {
            double dDoubleValue8 = averageStrokeCadence.doubleValue();
            dValueOf8 = Double.valueOf(dDoubleValue8 >= 1.0d ? dDoubleValue8 : 1.0d);
        }
        return q1.b(q1Var, dValueOf3, dValueOf, dValueOf8, dValueOf5, dValueOf4, dValueOf2, dValueOf7, dValueOf6, null, null, null, -33555457, -73, Integer.MAX_VALUE, -659457, -1, FlexItem.MAX_SIZE);
    }

    public static final o1 c(List<o1> list, x xVar) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (s.g(((o1) obj2).getSplitType(), xVar != null ? xVar.f147220a : null)) {
                obj = obj2;
                break;
            }
        }
        return (o1) obj;
    }

    public static final o.a d(q1 q1Var) {
        if (q1Var == null) {
            return null;
        }
        Double leftPlatformCenterOffset = q1Var.getLeftPlatformCenterOffset();
        double dDoubleValue = leftPlatformCenterOffset != null ? leftPlatformCenterOffset.doubleValue() : Double.NaN;
        Double rightPlatformCenterOffset = q1Var.getRightPlatformCenterOffset();
        return new o.a(dDoubleValue, rightPlatformCenterOffset != null ? rightPlatformCenterOffset.doubleValue() : Double.NaN);
    }

    public static final o.c e(q1 q1Var) {
        if (q1Var == null) {
            return null;
        }
        Double leftPowerPhaseStart = q1Var.getLeftPowerPhaseStart();
        double dDoubleValue = leftPowerPhaseStart != null ? leftPowerPhaseStart.doubleValue() : Double.NaN;
        Double leftPowerPhaseEnd = q1Var.getLeftPowerPhaseEnd();
        double dDoubleValue2 = leftPowerPhaseEnd != null ? leftPowerPhaseEnd.doubleValue() : Double.NaN;
        Double leftPowerPhaseArcLength = q1Var.getLeftPowerPhaseArcLength();
        double dDoubleValue3 = leftPowerPhaseArcLength != null ? leftPowerPhaseArcLength.doubleValue() : Double.NaN;
        Double leftPowerPhasePeakArcLength = q1Var.getLeftPowerPhasePeakArcLength();
        double dDoubleValue4 = leftPowerPhasePeakArcLength != null ? leftPowerPhasePeakArcLength.doubleValue() : Double.NaN;
        Double leftPowerPhasePeakStart = q1Var.getLeftPowerPhasePeakStart();
        double dDoubleValue5 = leftPowerPhasePeakStart != null ? leftPowerPhasePeakStart.doubleValue() : Double.NaN;
        Double leftPowerPhasePeakEnd = q1Var.getLeftPowerPhasePeakEnd();
        double dDoubleValue6 = leftPowerPhasePeakEnd != null ? leftPowerPhasePeakEnd.doubleValue() : Double.NaN;
        Double rightPowerPhaseStart = q1Var.getRightPowerPhaseStart();
        double dDoubleValue7 = rightPowerPhaseStart != null ? rightPowerPhaseStart.doubleValue() : Double.NaN;
        Double rightPowerPhaseEnd = q1Var.getRightPowerPhaseEnd();
        double dDoubleValue8 = rightPowerPhaseEnd != null ? rightPowerPhaseEnd.doubleValue() : Double.NaN;
        Double rightPowerPhaseArcLength = q1Var.getRightPowerPhaseArcLength();
        double dDoubleValue9 = rightPowerPhaseArcLength != null ? rightPowerPhaseArcLength.doubleValue() : Double.NaN;
        Double rightPowerPhasePeakArcLength = q1Var.getRightPowerPhasePeakArcLength();
        double dDoubleValue10 = rightPowerPhasePeakArcLength != null ? rightPowerPhasePeakArcLength.doubleValue() : Double.NaN;
        Double rightPowerPhasePeakStart = q1Var.getRightPowerPhasePeakStart();
        double dDoubleValue11 = rightPowerPhasePeakStart != null ? rightPowerPhasePeakStart.doubleValue() : Double.NaN;
        Double rightPowerPhasePeakEnd = q1Var.getRightPowerPhasePeakEnd();
        double dDoubleValue12 = rightPowerPhasePeakEnd != null ? rightPowerPhasePeakEnd.doubleValue() : Double.NaN;
        Double leftBalance = q1Var.getLeftBalance();
        double dDoubleValue13 = leftBalance != null ? leftBalance.doubleValue() : Double.NaN;
        Double rightBalance = q1Var.getRightBalance();
        return new o.c(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, dDoubleValue8, dDoubleValue9, dDoubleValue10, dDoubleValue11, dDoubleValue12, dDoubleValue13, rightBalance != null ? rightBalance.doubleValue() : Double.NaN);
    }

    public static final o.d f(q1 q1Var) {
        if (q1Var == null) {
            return null;
        }
        Double seatedTime = q1Var.getSeatedTime();
        double dDoubleValue = seatedTime != null ? seatedTime.doubleValue() : Double.NaN;
        Double standingTime = q1Var.getStandingTime();
        double dDoubleValue2 = standingTime != null ? standingTime.doubleValue() : Double.NaN;
        Double aeroTime = q1Var.getAeroTime();
        double dDoubleValue3 = aeroTime != null ? aeroTime.doubleValue() : Double.NaN;
        Double uprightTime = q1Var.getUprightTime();
        double dDoubleValue4 = uprightTime != null ? uprightTime.doubleValue() : Double.NaN;
        Double loweredTime = q1Var.getLoweredTime();
        double dDoubleValue5 = loweredTime != null ? loweredTime.doubleValue() : Double.NaN;
        Double torsoAngleLowThreshold = q1Var.getTorsoAngleLowThreshold();
        return new o.d(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, torsoAngleLowThreshold != null ? torsoAngleLowThreshold.doubleValue() : Double.NaN);
    }
}

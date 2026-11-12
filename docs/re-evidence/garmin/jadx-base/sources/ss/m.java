package ss;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import ps.x0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lss/m;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    static {
        new m();
    }

    private m() {
    }

    public static final x0 a(x1 x1Var) {
        x1Var.getClass();
        Integer messageIndex = x1Var.getMessageIndex();
        int iIntValue = messageIndex != null ? messageIndex.intValue() + 1 : -1;
        DateTime startDateTime = x1Var.getStartDateTime();
        String string = startDateTime != null ? startDateTime.toString() : null;
        Double averageSpeed = x1Var.getAverageSpeed();
        double dDoubleValue = averageSpeed != null ? averageSpeed.doubleValue() : -1.0d;
        Double averageMovingSpeed = x1Var.getAverageMovingSpeed();
        double dDoubleValue2 = averageMovingSpeed != null ? averageMovingSpeed.doubleValue() : -1.0d;
        Double distance = x1Var.getDistance();
        double dDoubleValue3 = distance != null ? distance.doubleValue() : -1.0d;
        Double duration = x1Var.getDuration();
        double dDoubleValue4 = duration != null ? duration.doubleValue() : -1.0d;
        Double movingDuration = x1Var.getMovingDuration();
        double dDoubleValue5 = movingDuration != null ? movingDuration.doubleValue() : -1.0d;
        Double averageHR = x1Var.getAverageHR();
        double dDoubleValue6 = averageHR != null ? averageHR.doubleValue() : -1.0d;
        Double maxHR = x1Var.getMaxHR();
        double dDoubleValue7 = maxHR != null ? maxHR.doubleValue() : -1.0d;
        Double elevationGain = x1Var.getElevationGain();
        double dDoubleValue8 = elevationGain != null ? elevationGain.doubleValue() : -1.0d;
        Double elevationLoss = x1Var.getElevationLoss();
        double dDoubleValue9 = elevationLoss != null ? elevationLoss.doubleValue() : -1.0d;
        Double calories = x1Var.getCalories();
        double dDoubleValue10 = calories != null ? calories.doubleValue() : -1.0d;
        Double strideLength = x1Var.getStrideLength();
        double dDoubleValue11 = strideLength != null ? strideLength.doubleValue() : -1.0d;
        String internalType = x1Var.getInternalType();
        Double minTemperature = x1Var.getMinTemperature();
        double dDoubleValue12 = minTemperature != null ? minTemperature.doubleValue() : -1.0d;
        Double maxTemperature = x1Var.getMaxTemperature();
        double dDoubleValue13 = maxTemperature != null ? maxTemperature.doubleValue() : -1.0d;
        Double avgTemperature = x1Var.getAvgTemperature();
        double dDoubleValue14 = avgTemperature != null ? avgTemperature.doubleValue() : -1.0d;
        Double maxSpeed = x1Var.getMaxSpeed();
        double dDoubleValue15 = maxSpeed != null ? maxSpeed.doubleValue() : -1.0d;
        Double startLatitude = x1Var.getStartLatitude();
        double dDoubleValue16 = startLatitude != null ? startLatitude.doubleValue() : Double.NaN;
        Double startLongitude = x1Var.getStartLongitude();
        double dDoubleValue17 = startLongitude != null ? startLongitude.doubleValue() : Double.NaN;
        Double endLatitude = x1Var.getEndLatitude();
        double dDoubleValue18 = endLatitude != null ? endLatitude.doubleValue() : Double.NaN;
        Double endLongitude = x1Var.getEndLongitude();
        double dDoubleValue19 = endLongitude != null ? endLongitude.doubleValue() : Double.NaN;
        Double avgGradeAdjustedSpeed = x1Var.getAvgGradeAdjustedSpeed();
        double dDoubleValue20 = avgGradeAdjustedSpeed != null ? avgGradeAdjustedSpeed.doubleValue() : Double.NaN;
        Double surfaceInterval = x1Var.getSurfaceInterval();
        Double duration2 = x1Var.getDuration();
        return new x0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue20), null, Double.valueOf(dDoubleValue6), null, null, Double.valueOf(dDoubleValue2), null, null, null, null, Double.valueOf(dDoubleValue), null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue14), null, null, null, null, null, null, null, Double.valueOf((duration2 == null && (duration2 = x1Var.getBottomTime()) == null) ? -1.0d : duration2.doubleValue()), Double.valueOf(dDoubleValue10), null, null, false, null, null, Double.valueOf(dDoubleValue3), Double.valueOf(dDoubleValue4), null, Double.valueOf(dDoubleValue8), Double.valueOf(dDoubleValue9), null, Double.valueOf(dDoubleValue18), Double.valueOf(dDoubleValue19), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, iIntValue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, x1Var.getMaxDepth(), null, Double.valueOf(dDoubleValue7), null, null, null, null, null, null, Double.valueOf(dDoubleValue15), null, null, null, null, Double.valueOf(dDoubleValue13), null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue12), null, Double.valueOf(dDoubleValue5), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue16), Double.valueOf(dDoubleValue17), null, null, string, null, null, null, null, Double.valueOf(dDoubleValue11), null, null, surfaceInterval, null, null, null, null, null, internalType, null, null, null, null, null, null, null, null, 0, null, 0, null, null, null, -69533697, -57415689, -1342179329, -20972577, -1212940289, 524271, null);
    }
}

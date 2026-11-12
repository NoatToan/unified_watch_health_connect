package tq;

import java.util.List;
import p005kotlin.Metadata;
import ps.x1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltq/f;", "", "Ltq/j;", "direction", "", "entryCount", "Luq/i;", "metric", "", "Lqs/x;", "splitTypes", "<init>", "(Ltq/j;ILuq/i;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f166021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uq.i f166023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<x> f166024d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166025a;

        static {
            int[] iArr = new int[uq.i.values().length];
            try {
                iArr[uq.i.DURATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq.i.SURF_DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uq.i.WAKESPORTS_ACTIVE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uq.i.DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uq.i.DISTANCE_SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uq.i.TOTAL_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uq.i.CUMULATIVE_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uq.i.START_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uq.i.STOP_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uq.i.MOVING_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uq.i.RUN_MOVING_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[uq.i.IDLE_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[uq.i.BOTTOM_TIME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[uq.i.SURFACE_INTERVAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[uq.i.AVG_COMPARISON_PACE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[uq.i.GOAL_PACE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[uq.i.AVG_PACE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[uq.i.AVG_GAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[uq.i.AVG_MOVING_PACE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[uq.i.BEST_PACE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[uq.i.MIN_HR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[uq.i.AVG_HR_SHORT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[uq.i.AVG_HR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[uq.i.MAX_HR_SHORT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[uq.i.MAX_HR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[uq.i.AVG_SPEED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[uq.i.AVG_MOVING_SPEED.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[uq.i.MAX_SPEED.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[uq.i.AVG_NAUT_SOG.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[uq.i.MAX_NAUT_SOG.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[uq.i.ELEVATION_GAIN.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[uq.i.ELEVATION_LOSS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[uq.i.ASCENT_ELEVATION_GAIN.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[uq.i.MAX_DEPTH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[uq.i.DESCENT_ELEVATION_LOSS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[uq.i.AVG_DESCENT_SPEED.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[uq.i.NORMALIZED_POWER.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[uq.i.AVG_POWER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[uq.i.MAX_POWER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[uq.i.NORMALIZED_FORCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[uq.i.AVG_BIKE_FORCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[uq.i.MAX_BIKE_FORCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[uq.i.WEIGHT_AVG_POWER.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[uq.i.WEIGHT_MAX_POWER.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[uq.i.AVG_RUN_CADENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[uq.i.MAX_RUN_CADENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[uq.i.AVG_BIKE_CADENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[uq.i.MAX_BIKE_CADENCE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[uq.i.AVG_STEP_SPEED_LOSS.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[uq.i.AVG_STEP_SPEED_LOSS_PERCENT.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[uq.i.AVG_STRIDE_LENGTH.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[uq.i.FALLS.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[uq.i.MIN_TEMPERATURE.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[uq.i.MAX_TEMPERATURE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[uq.i.AVG_TEMPERATURE.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[uq.i.MIN_WATER_TEMPERATURE.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[uq.i.AVG_GCT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[uq.i.AVG_GCT_BAL.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[uq.i.AVG_VERT_OSC.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[uq.i.AVG_VERT_OSC_RATIO.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[uq.i.CALORIES.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[uq.i.SPEED_10S_NAUTICAL.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[uq.i.AVG_POOL_VELOCITY.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[uq.i.PACK_WEIGHT.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            f166025a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(j jVar, int i14, uq.i iVar, List<? extends x> list) {
        jVar.getClass();
        iVar.getClass();
        list.getClass();
        this.f166021a = jVar;
        this.f166022b = i14;
        this.f166023c = iVar;
        this.f166024d = list;
    }

    public static final double a(f fVar, x1 x1Var, double d14) {
        switch (a.f166025a[fVar.f166023c.ordinal()]) {
            case 1:
                Double duration = x1Var.getDuration();
                if (duration != null) {
                    return duration.doubleValue();
                }
                return 0.0d;
            case 2:
                Double movingDuration = x1Var.getMovingDuration();
                if (movingDuration != null) {
                    return movingDuration.doubleValue();
                }
                return 0.0d;
            case 3:
                Double movingDuration2 = x1Var.getMovingDuration();
                if (movingDuration2 != null) {
                    return movingDuration2.doubleValue();
                }
                return 0.0d;
            case 4:
            case 5:
                Double distance = x1Var.getDistance();
                if (distance != null) {
                    return distance.doubleValue();
                }
                return 0.0d;
            case 6:
                Double duration2 = x1Var.getDuration();
                if (duration2 != null) {
                    return duration2.doubleValue();
                }
                return 0.0d;
            case 7:
                Double duration3 = x1Var.getDuration();
                if (duration3 != null) {
                    return duration3.doubleValue();
                }
                return 0.0d;
            case 8:
                Double d15 = x1Var.f140407z1;
                if (d15 != null) {
                    return d15.doubleValue();
                }
                return 0.0d;
            case 9:
                Double d16 = x1Var.A1;
                if (d16 != null) {
                    return d16.doubleValue();
                }
                return 0.0d;
            case 10:
            case 11:
                Double movingDuration3 = x1Var.getMovingDuration();
                if (movingDuration3 != null) {
                    return movingDuration3.doubleValue();
                }
                return 0.0d;
            case 12:
                Double duration4 = x1Var.getDuration();
                double dDoubleValue = duration4 != null ? duration4.doubleValue() : 0.0d;
                Double movingDuration4 = x1Var.getMovingDuration();
                return dDoubleValue - (movingDuration4 != null ? movingDuration4.doubleValue() : 0.0d);
            case 13:
                Double bottomTime = x1Var.getBottomTime();
                if (bottomTime != null) {
                    return bottomTime.doubleValue();
                }
                return 0.0d;
            case 14:
                Double surfaceInterval = x1Var.getSurfaceInterval();
                if (surfaceInterval != null) {
                    return surfaceInterval.doubleValue();
                }
                return 0.0d;
            case 15:
                Double averageSpeed = x1Var.getAverageSpeed();
                if (averageSpeed != null) {
                    return averageSpeed.doubleValue();
                }
                return 0.0d;
            case 16:
                Double targetAvgSpeed = x1Var.getTargetAvgSpeed();
                if (targetAvgSpeed != null) {
                    return targetAvgSpeed.doubleValue();
                }
                return 0.0d;
            case 17:
                Double averageSpeed2 = x1Var.getAverageSpeed();
                if (averageSpeed2 != null) {
                    return averageSpeed2.doubleValue();
                }
                return 0.0d;
            case 18:
                Double avgGradeAdjustedSpeed = x1Var.getAvgGradeAdjustedSpeed();
                if (avgGradeAdjustedSpeed != null) {
                    return avgGradeAdjustedSpeed.doubleValue();
                }
                return 0.0d;
            case 19:
                Double averageMovingSpeed = x1Var.getAverageMovingSpeed();
                if (averageMovingSpeed != null) {
                    return averageMovingSpeed.doubleValue();
                }
                return 0.0d;
            case 20:
                Double maxSpeed = x1Var.getMaxSpeed();
                if (maxSpeed != null) {
                    return maxSpeed.doubleValue();
                }
                return 0.0d;
            case 21:
                Double d17 = x1Var.C1;
                if (d17 != null) {
                    return d17.doubleValue();
                }
                return 0.0d;
            case 22:
            case 23:
                Double averageHR = x1Var.getAverageHR();
                if (averageHR != null) {
                    return averageHR.doubleValue();
                }
                return 0.0d;
            case 24:
            case 25:
                Double maxHR = x1Var.getMaxHR();
                if (maxHR != null) {
                    return maxHR.doubleValue();
                }
                return 0.0d;
            case 26:
                Double averageSpeed3 = x1Var.getAverageSpeed();
                if (averageSpeed3 != null) {
                    return averageSpeed3.doubleValue();
                }
                return 0.0d;
            case 27:
                Double averageMovingSpeed2 = x1Var.getAverageMovingSpeed();
                if (averageMovingSpeed2 != null) {
                    return averageMovingSpeed2.doubleValue();
                }
                return 0.0d;
            case 28:
                Double maxSpeed2 = x1Var.getMaxSpeed();
                if (maxSpeed2 != null) {
                    return maxSpeed2.doubleValue();
                }
                return 0.0d;
            case 29:
                Double averageSpeed4 = x1Var.getAverageSpeed();
                if (averageSpeed4 != null) {
                    return averageSpeed4.doubleValue();
                }
                return 0.0d;
            case 30:
                Double maxSpeed3 = x1Var.getMaxSpeed();
                if (maxSpeed3 != null) {
                    return maxSpeed3.doubleValue();
                }
                return 0.0d;
            case 31:
                Double elevationGain = x1Var.getElevationGain();
                if (elevationGain != null) {
                    return elevationGain.doubleValue();
                }
                return 0.0d;
            case 32:
                Double elevationLoss = x1Var.getElevationLoss();
                if (elevationLoss != null) {
                    return elevationLoss.doubleValue();
                }
                return 0.0d;
            case 33:
                Double elevationGain2 = x1Var.getElevationGain();
                if (elevationGain2 != null) {
                    return elevationGain2.doubleValue();
                }
                return 0.0d;
            case 34:
                Double maxDepth = x1Var.getMaxDepth();
                if (maxDepth != null) {
                    return maxDepth.doubleValue();
                }
                return 0.0d;
            case 35:
                Double elevationLoss2 = x1Var.getElevationLoss();
                if (elevationLoss2 != null) {
                    return elevationLoss2.doubleValue();
                }
                return 0.0d;
            case 36:
                Double avgDescentSpeed = x1Var.getAvgDescentSpeed();
                if (avgDescentSpeed != null) {
                    return avgDescentSpeed.doubleValue();
                }
                return 0.0d;
            case 37:
                Double normalizedPower = x1Var.getNormalizedPower();
                if (normalizedPower != null) {
                    return normalizedPower.doubleValue();
                }
                return 0.0d;
            case 38:
                Double avgPower = x1Var.getAvgPower();
                if (avgPower != null) {
                    return avgPower.doubleValue();
                }
                return 0.0d;
            case 39:
                Double maxPower = x1Var.getMaxPower();
                if (maxPower != null) {
                    return maxPower.doubleValue();
                }
                return 0.0d;
            case 40:
                Double normalizedForce = x1Var.getNormalizedForce();
                if (normalizedForce != null) {
                    return normalizedForce.doubleValue();
                }
                return 0.0d;
            case 41:
                Double avgBikeForce = x1Var.getAvgBikeForce();
                if (avgBikeForce != null) {
                    return avgBikeForce.doubleValue();
                }
                return 0.0d;
            case 42:
                Double maxBikeForce = x1Var.getMaxBikeForce();
                if (maxBikeForce != null) {
                    return maxBikeForce.doubleValue();
                }
                return 0.0d;
            case 43:
                Double avgPower2 = x1Var.getAvgPower();
                double dDoubleValue2 = avgPower2 != null ? avgPower2.doubleValue() : 0.0d;
                if (d14 == 0.0d) {
                    d14 = 1.0d;
                }
                return dDoubleValue2 / d14;
            case 44:
                Double maxPower2 = x1Var.getMaxPower();
                double dDoubleValue3 = maxPower2 != null ? maxPower2.doubleValue() : 0.0d;
                if (d14 == 0.0d) {
                    d14 = 1.0d;
                }
                return dDoubleValue3 / d14;
            case 45:
                Double averageRunCadence = x1Var.getAverageRunCadence();
                if (averageRunCadence != null) {
                    return averageRunCadence.doubleValue();
                }
                return 0.0d;
            case 46:
                Double maxRunCadence = x1Var.getMaxRunCadence();
                if (maxRunCadence != null) {
                    return maxRunCadence.doubleValue();
                }
                return 0.0d;
            case 47:
                Double avgBikeCadence = x1Var.getAvgBikeCadence();
                if (avgBikeCadence != null) {
                    return avgBikeCadence.doubleValue();
                }
                return 0.0d;
            case 48:
                Double maxBikeCadence = x1Var.getMaxBikeCadence();
                if (maxBikeCadence != null) {
                    return maxBikeCadence.doubleValue();
                }
                return 0.0d;
            case 49:
                Double stepSpeedLoss = x1Var.getStepSpeedLoss();
                if (stepSpeedLoss != null) {
                    return stepSpeedLoss.doubleValue();
                }
                return 0.0d;
            case 50:
                Double stepSpeedLossPercent = x1Var.getStepSpeedLossPercent();
                if (stepSpeedLossPercent != null) {
                    return stepSpeedLossPercent.doubleValue();
                }
                return 0.0d;
            case 51:
                Double strideLength = x1Var.getStrideLength();
                if (strideLength != null) {
                    return strideLength.doubleValue();
                }
                return 0.0d;
            case 52:
                Integer numFalls = x1Var.getNumFalls();
                return numFalls != null ? numFalls.intValue() : 0;
            case 53:
                Double minTemperature = x1Var.getMinTemperature();
                if (minTemperature != null) {
                    return minTemperature.doubleValue();
                }
                return 0.0d;
            case 54:
                Double maxTemperature = x1Var.getMaxTemperature();
                if (maxTemperature != null) {
                    return maxTemperature.doubleValue();
                }
                return 0.0d;
            case 55:
                Double avgTemperature = x1Var.getAvgTemperature();
                if (avgTemperature != null) {
                    return avgTemperature.doubleValue();
                }
                return 0.0d;
            case 56:
                Double minTemperature2 = x1Var.getMinTemperature();
                if (minTemperature2 != null) {
                    return minTemperature2.doubleValue();
                }
                return 0.0d;
            case 57:
                Double groundContactTime = x1Var.getGroundContactTime();
                if (groundContactTime != null) {
                    return groundContactTime.doubleValue();
                }
                return 0.0d;
            case 58:
                Double groundContactBalanceLeft = x1Var.getGroundContactBalanceLeft();
                if (groundContactBalanceLeft != null) {
                    return groundContactBalanceLeft.doubleValue();
                }
                return 0.0d;
            case 59:
                Double verticalOscillation = x1Var.getVerticalOscillation();
                if (verticalOscillation != null) {
                    return verticalOscillation.doubleValue();
                }
                return 0.0d;
            case 60:
                Double verticalRatio = x1Var.getVerticalRatio();
                if (verticalRatio != null) {
                    return verticalRatio.doubleValue();
                }
                return 0.0d;
            case 61:
                Double calories = x1Var.getCalories();
                if (calories != null) {
                    return calories.doubleValue();
                }
                return 0.0d;
            case 62:
                Double max10SecondSpeed = x1Var.getMax10SecondSpeed();
                if (max10SecondSpeed != null) {
                    return max10SecondSpeed.doubleValue();
                }
                return 0.0d;
            case 63:
                Double averageSpeed5 = x1Var.getAverageSpeed();
                if (averageSpeed5 != null) {
                    return averageSpeed5.doubleValue();
                }
                return 0.0d;
            case 64:
                Double packWeight = x1Var.getPackWeight();
                if (packWeight != null) {
                    return packWeight.doubleValue();
                }
                return 0.0d;
            default:
                Integer messageIndex = x1Var.getMessageIndex();
                return messageIndex != null ? messageIndex.intValue() : 0;
        }
    }
}

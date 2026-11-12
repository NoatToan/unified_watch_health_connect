package com.xiaomi.fit.data.common.data.sport.util;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0017J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/util/SportReportComputeUtil;", "", "<init>", "()V", "computeAvgStepLengthInCM", "", "distanceInMeter", "", "steps", "computeCadenceOneMinute", "count", "durationInSec", "computeStrokeOneMinute", FitnessReportKey.strokeCount, "computeSwimAvgPace", "distance", "computeAvgPace", "computeAvgSpeed", "getAvgSpeed", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/lang/Float;", "getAvgPace", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/lang/Integer;", "getAvgCadence", "getAvgStrokeFeq", "getAvgStepLength", "getCorrectedSportValue", "report", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportReportComputeUtil {

    @NotNull
    public static final SportReportComputeUtil INSTANCE = new SportReportComputeUtil();

    private SportReportComputeUtil() {
    }

    @JvmStatic
    public static final int computeAvgPace(float distance, int durationInSec) {
        if (distance == 0.0f) {
            return 0;
        }
        return (int) ((durationInSec * 1000) / distance);
    }

    @JvmStatic
    public static final float computeAvgSpeed(float distance, int durationInSec) {
        if (durationInSec == 0) {
            return 0.0f;
        }
        float f = 60;
        return ((distance * f) * f) / (durationInSec * 1000.0f);
    }

    @JvmStatic
    public static final int computeStrokeOneMinute(int strokeCount, int durationInSec) {
        if (durationInSec == 0) {
            return 0;
        }
        return (strokeCount * 60) / durationInSec;
    }

    @JvmStatic
    @Nullable
    public static final Integer getAvgCadence(@NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getAvgCadence() != null) {
            Integer avgCadence = sportReport.getAvgCadence();
            Intrinsics.checkNotNull(avgCadence);
            if (avgCadence.intValue() > 0) {
                return sportReport.getAvgCadence();
            }
        }
        if (sportReport.getSteps() == null) {
            return null;
        }
        SportReportComputeUtil sportReportComputeUtil = INSTANCE;
        Integer steps = sportReport.getSteps();
        Intrinsics.checkNotNull(steps);
        return Integer.valueOf(sportReportComputeUtil.computeCadenceOneMinute(steps.intValue(), sportReport.getDuration()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @JvmStatic
    @Nullable
    public static final Integer getAvgStepLength(@NotNull SportBasicReport sportReport) {
        int iComputeAvgStepLengthInCM;
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getAvgStride() == null) {
            return sportReport.getDistance() == null ? null : null;
        }
        Integer avgStride = sportReport.getAvgStride();
        Intrinsics.checkNotNull(avgStride);
        if (avgStride.intValue() > 0) {
            Integer avgStride2 = sportReport.getAvgStride();
            Intrinsics.checkNotNull(avgStride2);
            iComputeAvgStepLengthInCM = avgStride2.intValue();
        } else if (sportReport.getDistance() == null && sportReport.getSteps() != null) {
            SportReportComputeUtil sportReportComputeUtil = INSTANCE;
            Integer distance = sportReport.getDistance();
            Intrinsics.checkNotNull(distance);
            float fIntValue = distance.intValue();
            Integer steps = sportReport.getSteps();
            Intrinsics.checkNotNull(steps);
            iComputeAvgStepLengthInCM = sportReportComputeUtil.computeAvgStepLengthInCM(fIntValue, steps.intValue());
        }
        if (sportReport.getCorrectedDistance() != null) {
            Integer correctedDistance = sportReport.getCorrectedDistance();
            Intrinsics.checkNotNull(correctedDistance);
            if (correctedDistance.intValue() > 0 && sportReport.getSportType() == 3) {
                return Integer.valueOf((int) (iComputeAvgStepLengthInCM * INSTANCE.getCorrectedSportValue(sportReport)));
            }
        }
        return Integer.valueOf(iComputeAvgStepLengthInCM);
    }

    @JvmStatic
    @Nullable
    public static final Integer getAvgStrokeFeq(@NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getAvgStrokeFreq() != null) {
            return sportReport.getAvgStrokeFreq();
        }
        if (sportReport.getStrokeCount() == null) {
            return null;
        }
        Integer strokeCount = sportReport.getStrokeCount();
        Intrinsics.checkNotNull(strokeCount);
        return Integer.valueOf(computeStrokeOneMinute(strokeCount.intValue(), sportReport.getDuration()));
    }

    private final float getCorrectedSportValue(SportBasicReport report) {
        if (report.getDistance() != null) {
            Integer distance = report.getDistance();
            Intrinsics.checkNotNull(distance);
            if (distance.intValue() > 0) {
                Integer correctedDistance = report.getCorrectedDistance();
                Intrinsics.checkNotNull(correctedDistance);
                float fIntValue = correctedDistance.intValue();
                Integer distance2 = report.getDistance();
                Intrinsics.checkNotNull(distance2);
                return fIntValue / distance2.intValue();
            }
        }
        return 1.0f;
    }

    public final int computeAvgStepLengthInCM(float distanceInMeter, int steps) {
        if (steps == 0) {
            return 0;
        }
        return (int) ((distanceInMeter * 100) / steps);
    }

    public final int computeCadenceOneMinute(float count, int durationInSec) {
        if (durationInSec == 0) {
            return 0;
        }
        return (int) ((count * 60) / durationInSec);
    }

    public final int computeSwimAvgPace(int distance, int durationInSec) {
        if (distance == 0) {
            return 0;
        }
        return (durationInSec * 100) / distance;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[RETURN] */
    @Nullable
    public final Integer getAvgPace(@NotNull SportBasicReport sportReport) {
        int sportType;
        int iComputeSwimAvgPace;
        int iComputeAvgPace;
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getAvgPace() != null) {
            Integer avgPace = sportReport.getAvgPace();
            Intrinsics.checkNotNull(avgPace);
            if (avgPace.intValue() > 0) {
                Integer avgPace2 = sportReport.getAvgPace();
                Intrinsics.checkNotNull(avgPace2);
                iComputeSwimAvgPace = avgPace2.intValue();
            } else {
                if (sportReport.getDistance() == null) {
                    return null;
                }
                sportType = sportReport.getSportType();
                if (sportType != 9 || sportType == 10) {
                    Integer distance = sportReport.getDistance();
                    Intrinsics.checkNotNull(distance);
                    iComputeSwimAvgPace = computeSwimAvgPace(distance.intValue(), sportReport.getDuration());
                } else {
                    Integer distance2 = sportReport.getDistance();
                    Intrinsics.checkNotNull(distance2);
                    iComputeSwimAvgPace = computeAvgPace(distance2.intValue(), sportReport.getDuration());
                }
            }
        } else {
            if (sportReport.getDistance() == null) {
                return null;
            }
            sportType = sportReport.getSportType();
            if (sportType != 9) {
                Integer distance3 = sportReport.getDistance();
                Intrinsics.checkNotNull(distance3);
                iComputeSwimAvgPace = computeSwimAvgPace(distance3.intValue(), sportReport.getDuration());
            } else {
                Integer distance4 = sportReport.getDistance();
                Intrinsics.checkNotNull(distance4);
                iComputeSwimAvgPace = computeSwimAvgPace(distance4.intValue(), sportReport.getDuration());
            }
        }
        if (sportReport.getCorrectedDistance() != null) {
            Integer correctedDistance = sportReport.getCorrectedDistance();
            Intrinsics.checkNotNull(correctedDistance);
            if (correctedDistance.intValue() > 0 && sportReport.getSportType() == 3) {
                if (sportReport.getAvgPace() != null) {
                    Integer avgPace3 = sportReport.getAvgPace();
                    Intrinsics.checkNotNull(avgPace3);
                    if (avgPace3.intValue() > 0) {
                        iComputeAvgPace = (int) (iComputeSwimAvgPace / getCorrectedSportValue(sportReport));
                    } else {
                        Integer correctedDistance2 = sportReport.getCorrectedDistance();
                        Intrinsics.checkNotNull(correctedDistance2);
                        iComputeAvgPace = computeAvgPace(correctedDistance2.intValue(), sportReport.getDuration());
                    }
                } else {
                    Integer correctedDistance3 = sportReport.getCorrectedDistance();
                    Intrinsics.checkNotNull(correctedDistance3);
                    iComputeAvgPace = computeAvgPace(correctedDistance3.intValue(), sportReport.getDuration());
                }
                return Integer.valueOf(iComputeAvgPace);
            }
        }
        return Integer.valueOf(iComputeSwimAvgPace);
    }

    @Nullable
    public final Float getAvgSpeed(@NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getAvgSpeed() != null) {
            Float avgSpeed = sportReport.getAvgSpeed();
            Intrinsics.checkNotNull(avgSpeed);
            if (avgSpeed.floatValue() > 0.0f) {
                Float avgSpeed2 = sportReport.getAvgSpeed();
                Intrinsics.checkNotNull(avgSpeed2);
                return avgSpeed2;
            }
        }
        if (sportReport.getDistance() == null) {
            return null;
        }
        Integer distance = sportReport.getDistance();
        Intrinsics.checkNotNull(distance);
        return Float.valueOf(computeAvgSpeed(distance.intValue(), sportReport.getDuration()));
    }
}

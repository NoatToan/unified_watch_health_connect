package com.xiaomi.fit.data.common.data.sport.util;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/util/FitnessSportTypeUtils;", "", "<init>", "()V", "supportSport", "", DailyRecordKey.sportType, "", "supportGpsSport", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "commonGpsSport", "specialGpsSport", "supportSensorSport", "supportStepSensorSport", "supportSpeedSport", "showSpeedAndDistance", "supportPaceSport", "supportAbnormalPaceSport", "isGroupSport", "getTheSportRecordKeys", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "protoSportType", "(I)[Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "supportsDynamicTrace", "(Ljava/lang/Integer;)Z", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessSportTypeUtils {

    @NotNull
    public static final FitnessSportTypeUtils INSTANCE = new FitnessSportTypeUtils();

    private FitnessSportTypeUtils() {
    }

    private final boolean commonGpsSport(int sportType) {
        if (sportType == 1 || sportType == 2 || sportType == 4 || sportType == 5 || sportType == 6 || sportType == 10 || sportType == 15 || sportType == 17 || sportType == 25) {
            return true;
        }
        switch (sportType) {
            case 21:
            case 22:
            case 23:
                return true;
            default:
                return false;
        }
    }

    private final boolean specialGpsSport(int sportType) {
        return sportType == 24;
    }

    @NotNull
    public final SportRecordKey[] getTheSportRecordKeys(int protoSportType) {
        switch (protoSportType) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 15:
            case 22:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Step, SportRecordKey.StepsLength, SportRecordKey.StepsFrequency, SportRecordKey.Distance, SportRecordKey.Pace, SportRecordKey.WholeKMPoint, SportRecordKey.Height, SportRecordKey.TouchdownTime, SportRecordKey.InTheAirTime, SportRecordKey.TouchAirRatio, SportRecordKey.LandingImpact, SportRecordKey.EqualIntensityPace, SportRecordKey.RunningPower, SportRecordKey.VerticalAmplitude, SportRecordKey.VerticalStrideRatio};
            case 3:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Step, SportRecordKey.StepsLength, SportRecordKey.StepsFrequency, SportRecordKey.Distance, SportRecordKey.Pace, SportRecordKey.WholeKMPoint, SportRecordKey.TouchdownTime, SportRecordKey.InTheAirTime, SportRecordKey.TouchAirRatio, SportRecordKey.LandingImpact, SportRecordKey.VerticalAmplitude, SportRecordKey.VerticalStrideRatio};
            case 6:
            case 23:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Frequency, SportRecordKey.Distance, SportRecordKey.Speed, SportRecordKey.WholeKMPoint, SportRecordKey.Height};
            case 7:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Count, SportRecordKey.Distance, SportRecordKey.Resistance, SportRecordKey.Power, SportRecordKey.WholeKMPoint};
            case 8:
            case 17:
            default:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Spo2, SportRecordKey.Stress};
            case 9:
            case 10:
                return new SportRecordKey[]{SportRecordKey.SwimPassage, SportRecordKey.SwimSwolf, SportRecordKey.SwimStrokeFreq, SportRecordKey.SwimStrokeCount, SportRecordKey.SwimPace, SportRecordKey.SwimmingInfo, SportRecordKey.Hr, SportRecordKey.FreeBreathAngle, SportRecordKey.FreePitchAngle, SportRecordKey.FrogBreathAngle, SportRecordKey.FrogSkiDuration, SportRecordKey.SwimmingHr};
            case 11:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Step, SportRecordKey.StepsFrequency};
            case 12:
            case 16:
                return new SportRecordKey[]{SportRecordKey.Hr};
            case 13:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Count, SportRecordKey.Frequency};
            case 14:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Count, SportRecordKey.SkippingHeight, SportRecordKey.RopeSkipStumbleInfo, SportRecordKey.Frequency};
            case 18:
            case 19:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Count, SportRecordKey.Distance};
            case 20:
                return new SportRecordKey[]{SportRecordKey.GolfInfo};
            case 21:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.SkiInfo, SportRecordKey.Distance, SportRecordKey.Speed, SportRecordKey.Height};
            case 24:
                return new SportRecordKey[]{SportRecordKey.Hr, SportRecordKey.Height};
            case 25:
                return new SportRecordKey[]{SportRecordKey.DivingSportInfo, SportRecordKey.DivingTemperature, SportRecordKey.DivingDepth, SportRecordKey.Speed};
        }
    }

    public final boolean isGroupSport(int sportType) {
        return sportType == 13 || sportType == 14 || sportType == 16;
    }

    public final boolean showSpeedAndDistance(int sportType) {
        if (sportType != 4 && sportType != 5 && sportType != 6 && sportType != 15 && sportType != 100 && sportType != 105 && sportType != 107 && sportType != 115 && sportType != 206 && sportType != 333 && sportType != 700 && sportType != 10000 && sportType != 201 && sportType != 202) {
            switch (sportType) {
                case 708:
                case 709:
                case 710:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean supportAbnormalPaceSport(int sportType) {
        return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 4 || sportType == 5 || sportType == 207;
    }

    public final boolean supportGpsSport(@NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.getSportType() == 1001) {
            return true;
        }
        return commonGpsSport(sportReport.getProtoType());
    }

    public final boolean supportPaceSport(int sportType) {
        return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 207;
    }

    public final boolean supportSensorSport(int sportType) {
        return sportType == 1 || sportType == 2 || sportType == 3;
    }

    public final boolean supportSpeedSport(int sportType) {
        if (sportType != 4 && sportType != 5 && sportType != 6 && sportType != 15 && sportType != 100 && sportType != 105 && sportType != 107 && sportType != 115 && sportType != 206 && sportType != 333 && sportType != 700 && sportType != 10000 && sportType != 201 && sportType != 202) {
            switch (sportType) {
                case 708:
                case 709:
                case 710:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean supportSport(int sportType) {
        if (sportType != 810 && sportType != 812) {
            switch (sportType) {
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
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean supportStepSensorSport(int sportType) {
        return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 8;
    }

    public final boolean supportsDynamicTrace(@Nullable Integer sportType) {
        if (sportType != null && sportType.intValue() == 1) {
            return true;
        }
        if (sportType != null && sportType.intValue() == 6) {
            return true;
        }
        if (sportType != null && sportType.intValue() == 2) {
            return true;
        }
        if (sportType != null && sportType.intValue() == 4) {
            return true;
        }
        if (sportType != null && sportType.intValue() == 5) {
            return true;
        }
        if (sportType != null && sportType.intValue() == 10) {
            return true;
        }
        return sportType != null && sportType.intValue() == 17;
    }

    public final boolean supportPaceSport(int sportType, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (!sportReport.supportPace()) {
            return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 207;
        }
        Logger.i("supportPaceSport", "equal pace " + sportReport.getAvgEqualPace() + "  " + sportReport.getMaxEqualPace() + "sportReport type " + sportReport.getSportType() + "  version " + sportReport.getVersion());
        return true;
    }

    public final boolean supportSpeedSport(int sportType, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        if (sportReport.supportPace()) {
            Logger.i("no supportSpeedSport", "equal pace " + sportReport.getAvgEqualPace() + "  " + sportReport.getMaxEqualPace() + "sportReport type " + sportReport.getSportType() + "  version " + sportReport.getVersion());
            return false;
        }
        if (sportType != 4 && sportType != 5 && sportType != 6 && sportType != 7 && sportType != 15 && sportType != 100 && sportType != 105 && sportType != 107 && sportType != 115 && sportType != 206 && sportType != 333 && sportType != 700 && sportType != 10000 && sportType != 201 && sportType != 202) {
            switch (sportType) {
                case 708:
                case 709:
                case 710:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean supportGpsSport(int sportType) {
        return commonGpsSport(sportType) || specialGpsSport(sportType);
    }
}

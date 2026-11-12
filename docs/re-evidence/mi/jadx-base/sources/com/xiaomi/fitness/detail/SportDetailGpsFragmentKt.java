package com.xiaomi.fitness.detail;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.wearable.gpsalgorithm.utils.SportRecordComputeUtil;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"processRecordData", "", "resultMap", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportDetailGpsFragmentKt {
    /* JADX WARN: Code duplicated, block: B:67:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void processRecordData(@NotNull Map<SportRecordKey, List<Object>> resultMap, @NotNull SportBasicReport mBasicReport) {
        List<Object> list;
        Float fValueOf;
        Float fValueOf2;
        List<Object> list2;
        List<Object> list3;
        List<Object> list4;
        Intrinsics.checkNotNullParameter(resultMap, "resultMap");
        Intrinsics.checkNotNullParameter(mBasicReport, "mBasicReport");
        SportRecordKey sportRecordKey = SportRecordKey.Pace;
        if (resultMap.containsKey(sportRecordKey) && (list4 = resultMap.get(sportRecordKey)) != null && FitnessSportTypeUtils.INSTANCE.supportSpeedSport(mBasicReport.getSportType(), mBasicReport)) {
            SportRecordKey sportRecordKey2 = SportRecordKey.Speed;
            if (!resultMap.containsKey(sportRecordKey2)) {
                resultMap.put(sportRecordKey2, SportRecordComputeUtil.INSTANCE.computeSpeedByPace(list4));
            }
        }
        SportRecordKey sportRecordKey3 = SportRecordKey.Distance;
        Float fValueOf3 = null;
        if (resultMap.containsKey(sportRecordKey3) && (list3 = resultMap.get(sportRecordKey3)) != null && (FitnessSportTypeUtils.INSTANCE.supportSpeedSport(mBasicReport.getSportType()) || mBasicReport.getSportType() == 7)) {
            SportRecordKey sportRecordKey4 = SportRecordKey.Speed;
            if (!resultMap.containsKey(sportRecordKey4)) {
                resultMap.put(sportRecordKey4, SportRecordComputeUtil.INSTANCE.computeSpeed(list3, mBasicReport.getMaxSpeed(), null));
            }
        }
        SportRecordKey sportRecordKey5 = SportRecordKey.Step;
        if (resultMap.containsKey(sportRecordKey5)) {
            SportRecordKey sportRecordKey6 = SportRecordKey.StepsFrequency;
            if (!resultMap.containsKey(sportRecordKey6) && (list2 = resultMap.get(sportRecordKey5)) != null) {
                SportRecordComputeUtil sportRecordComputeUtil = SportRecordComputeUtil.INSTANCE;
                Integer maxCadence = mBasicReport.getMaxCadence();
                Float fValueOf4 = maxCadence != null ? Float.valueOf(maxCadence.intValue()) : null;
                Integer minCadence = mBasicReport.getMinCadence();
                resultMap.put(sportRecordKey6, sportRecordComputeUtil.computeFrequency(list2, fValueOf4, minCadence != null ? Float.valueOf(minCadence.intValue()) : null));
            }
        }
        SportRecordKey sportRecordKey7 = SportRecordKey.Count;
        if (resultMap.containsKey(sportRecordKey7)) {
            SportRecordKey sportRecordKey8 = SportRecordKey.Frequency;
            if (resultMap.containsKey(sportRecordKey8) || mBasicReport.getProtoType() == 19 || (list = resultMap.get(sportRecordKey7)) == null) {
                return;
            }
            int sportType = mBasicReport.getSportType();
            if (sportType == 6 || sportType == 7) {
                Integer maxCycleCadence = mBasicReport.getMaxCycleCadence();
                if (maxCycleCadence != null) {
                    fValueOf = Float.valueOf(maxCycleCadence.intValue());
                    fValueOf2 = fValueOf;
                } else {
                    fValueOf2 = null;
                }
            } else if (sportType == 9 || sportType == 10 || sportType == 13) {
                Integer maxStrokeFreq = mBasicReport.getMaxStrokeFreq();
                if (maxStrokeFreq != null) {
                    fValueOf = Float.valueOf(maxStrokeFreq.intValue());
                    fValueOf2 = fValueOf;
                } else {
                    fValueOf2 = null;
                }
            } else if (sportType != 14) {
                Integer maxCadence2 = mBasicReport.getMaxCadence();
                fValueOf2 = maxCadence2 != null ? Float.valueOf(maxCadence2.intValue()) : null;
                Integer minCadence2 = mBasicReport.getMinCadence();
                if (minCadence2 != null) {
                    fValueOf3 = Float.valueOf(minCadence2.intValue());
                }
            } else {
                Integer bestSkipFreq = mBasicReport.getBestSkipFreq();
                if (bestSkipFreq != null) {
                    fValueOf = Float.valueOf(bestSkipFreq.intValue());
                    fValueOf2 = fValueOf;
                } else {
                    fValueOf2 = null;
                }
            }
            resultMap.put(sportRecordKey8, SportRecordComputeUtil.INSTANCE.computeFrequency(list, fValueOf2, fValueOf3));
        }
    }
}

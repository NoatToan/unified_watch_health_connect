package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.hwsportmodel.TrackFreeDivingSegment;
import com.huawei.hwsportmodel.TrackGolfCourseSegment;
import defpackage.nto;
import defpackage.ntp;
import defpackage.ntr;
import defpackage.nts;
import defpackage.ntt;
import defpackage.ntu;
import defpackage.qrs;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public class HwExerciseCommonSegmentUtils {
    private static final String SECTION_AVERAGE_POWER = "300010351";
    private static final String SECTION_AVG_G_FORCE = "300010344";
    private static final String SECTION_AVG_SLOPE_DEGREE = "300010092";
    private static final String SECTION_AVG_SLOPE_PERCENT = "300010093";
    private static final String SECTION_AVG_TURNS_FREQUENCY = "300010340";
    private static final String SECTION_BACK_SW_ARC = "300010321";
    private static final String SECTION_CLUB_TYPE = "300010323";
    private static final String SECTION_DOWN_SW_PLANE = "300010322";
    private static final String SECTION_LEFT_TURNS = "300010338";
    private static final String SECTION_LONG_RADIUS_TURNS = "300010341";
    private static final String SECTION_MAX_G_FORCE = "300010343";
    private static final String SECTION_RIGHT_TURNS = "300010339";
    private static final String SECTION_SHORT_RADIUS_TURNS = "300010342";
    private static final String SECTION_TOTAL_DESCEND = "300010181";
    private static final String SECTION_TOTAL_TURNS = "300010337";
    private static final String TAG = "HwExerciseCommonSegmentUtils";

    private static boolean isHandleParameterEmpty(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        return list == null || commonSectionInfo == null;
    }

    private HwExerciseCommonSegmentUtils() {
    }

    public static void handleRunSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleRunSegment parameter is abnormal");
            return;
        }
        final ntu ntuVar = new ntu();
        ntuVar.h(commonSectionInfo.getSectionNum());
        ntuVar.e(commonSectionInfo.getSectionTime());
        ntuVar.a(commonSectionInfo.getSectionDistance());
        ntuVar.i(commonSectionInfo.getSectionPace());
        ntuVar.j(commonSectionInfo.getSectionHeartRate());
        ntuVar.b(commonSectionInfo.getSectionCadence());
        ntuVar.g(commonSectionInfo.getSectionStepLength());
        ntuVar.c(commonSectionInfo.getSectionTotalRise());
        ntuVar.b(commonSectionInfo.getSectionTotalDescend());
        ntuVar.d(commonSectionInfo.getSectionGroundContactTime());
        ntuVar.f(commonSectionInfo.getSectionGroundImpactAcceleration());
        ntuVar.l(commonSectionInfo.getSectionSwingAngle());
        ntuVar.e(commonSectionInfo.getSectionEversionExcursion());
        ntuVar.o(commonSectionInfo.getSectionIntervalTrainingType());
        Map<String, List<String>> commonFieldMap = commonSectionInfo.getCommonFieldMap();
        if (commonFieldMap != null) {
            setSegmentIntValue(commonFieldMap.get(SECTION_AVERAGE_POWER), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda5
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntuVar.a(((Integer) obj).intValue());
                }
            });
        }
        list.add(ntuVar);
        LogUtil.d(TAG, "saveRunningSegment data: ", commonSectionInfo.toString());
    }

    public static void handleGolfSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleGolfSegment parameter is abnormal");
            return;
        }
        final ntr ntrVar = new ntr();
        ntrVar.h(commonSectionInfo.getSectionNum());
        ntrVar.e(commonSectionInfo.getSectionBackSwingTime());
        ntrVar.a(commonSectionInfo.getSectionDownSwingTime());
        ntrVar.g(commonSectionInfo.getSectionHeadSpeed());
        ntrVar.j(commonSectionInfo.getSectionSwingTempo());
        Map<String, List<String>> commonFieldMap = commonSectionInfo.getCommonFieldMap();
        if (commonFieldMap != null) {
            setSegmentIntValue(commonFieldMap.get(SECTION_BACK_SW_ARC), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntrVar.d(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_DOWN_SW_PLANE), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda3
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntrVar.b(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_CLUB_TYPE), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntrVar.c(((Integer) obj).intValue());
                }
            });
        }
        list.add(ntrVar);
        LogUtil.a(TAG, "saveGolfSegment data: ", commonSectionInfo.toString());
    }

    public static void handleSkiSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleSkiSegment parameter is abnormal");
            return;
        }
        final nts ntsVar = new nts();
        ntsVar.i(commonSectionInfo.getSectionNum());
        ntsVar.i(commonSectionInfo.getSectionTime());
        ntsVar.c(commonSectionInfo.getSectionDistance());
        ntsVar.h(commonSectionInfo.getSectionMaxSpeed());
        ntsVar.a(commonSectionInfo.getSectionAvgSpeed());
        ntsVar.a(commonSectionInfo.getSectionStartGpsPointIndex());
        ntsVar.b(commonSectionInfo.getSectionEndGpsPointIndex());
        ntsVar.d(commonSectionInfo.getSectionCableStartGpsPointIndex());
        ntsVar.e(commonSectionInfo.getSectionCableEndGpsPointIndex());
        ntsVar.k(commonSectionInfo.getSectionSlopeDegree());
        ntsVar.n(commonSectionInfo.getSectionSlopePercent());
        Map<String, List<String>> commonFieldMap = commonSectionInfo.getCommonFieldMap();
        if (commonFieldMap != null) {
            setSegmentIntValue(commonFieldMap.get(SECTION_AVG_SLOPE_DEGREE), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.d(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_AVG_SLOPE_PERCENT), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda7
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.b(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_TOTAL_DESCEND), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda8
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.g(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_TOTAL_TURNS), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.o(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_LEFT_TURNS), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda10
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.c(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_RIGHT_TURNS), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda11
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.g(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_AVG_TURNS_FREQUENCY), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda12
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.e(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_LONG_RADIUS_TURNS), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda13
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.j(((Integer) obj).intValue());
                }
            });
            setSegmentIntValue(commonFieldMap.get(SECTION_SHORT_RADIUS_TURNS), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda14
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.f(((Integer) obj).intValue());
                }
            });
            setSegmentFloatValue(commonFieldMap.get(SECTION_MAX_G_FORCE), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.d(((Float) obj).floatValue());
                }
            });
            setSegmentFloatValue(commonFieldMap.get(SECTION_AVG_G_FORCE), new Consumer() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommonSegmentUtils$$ExternalSyntheticLambda6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ntsVar.e(((Float) obj).floatValue());
                }
            });
        }
        list.add(ntsVar);
        LogUtil.d(TAG, "saveSkiSegment data: ", commonSectionInfo.toString());
    }

    private static void setSegmentIntValue(List<String> list, Consumer<Integer> consumer) {
        Integer numE;
        if (CollectionUtils.a(list) || (numE = qrs.e(list.get(0))) == null) {
            return;
        }
        consumer.accept(numE);
    }

    private static void setSegmentFloatValue(List<String> list, Consumer<Float> consumer) {
        Float fC;
        if (CollectionUtils.a(list) || (fC = qrs.c(list.get(0))) == null) {
            return;
        }
        consumer.accept(fC);
    }

    public static void handleExerciseSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleExerciseSegment parameter is abnormal");
            return;
        }
        ntt nttVar = new ntt();
        nttVar.c(commonSectionInfo.getSectionActionId());
        nttVar.d(commonSectionInfo.getSectionActionType());
        nttVar.c(commonSectionInfo.getSectionActionResultValue());
        nttVar.a(commonSectionInfo.getSectionActionTargetValue());
        nttVar.f(commonSectionInfo.getSectionStrengthType());
        nttVar.e(commonSectionInfo.getSectionStrengthStatistics());
        nttVar.i(commonSectionInfo.getSectionStrengthUpper());
        nttVar.b(commonSectionInfo.getSectionStrengthLower());
        list.add(nttVar);
        LogUtil.d(TAG, "saveExerciseSegment data: ", commonSectionInfo.toString());
    }

    public static void handleCyclingSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleCyclingSegment parameter is abnormal");
            return;
        }
        ntp ntpVar = new ntp();
        ntpVar.e(commonSectionInfo.getSectionNum());
        ntpVar.b(commonSectionInfo.getSectionTime());
        ntpVar.e(commonSectionInfo.getSectionDistance());
        ntpVar.d(commonSectionInfo.getSectionHeartRate());
        ntpVar.d(commonSectionInfo.getSectionTotalRise());
        ntpVar.a(commonSectionInfo.getSectionTotalDescend());
        ntpVar.a(commonSectionInfo.getSectionIntervalTrainingType());
        ntpVar.b(commonSectionInfo.getSectionAvgSpeed());
        ntpVar.c(commonSectionInfo.getSectionAvgCadence());
        list.add(ntpVar);
    }

    public static void handleOwnTrainingSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleOwnTrainingSegment parameter is abnormal");
            return;
        }
        nto ntoVar = new nto();
        ntoVar.d(commonSectionInfo.getSectionNum());
        ntoVar.b(commonSectionInfo.getSectionTime());
        ntoVar.b(commonSectionInfo.getSectionHeartRate());
        ntoVar.e(commonSectionInfo.getSectionIntervalTrainingType());
        list.add(ntoVar);
    }

    public static void handleDivingOrBreathSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleDivingOrBreathSegment parameter is abnormal");
            return;
        }
        TrackFreeDivingSegment trackFreeDivingSegment = new TrackFreeDivingSegment();
        trackFreeDivingSegment.setSectionNum(commonSectionInfo.getSectionNum());
        trackFreeDivingSegment.setSectionDivingMaxDepth(commonSectionInfo.getSectionDivingMaxDepth());
        trackFreeDivingSegment.setSectionDivingUnderWaterTime(commonSectionInfo.getSectionDivingUnderwaterTime());
        trackFreeDivingSegment.setSectionDivingBreakTime(commonSectionInfo.getSectionDivingBreakTime());
        trackFreeDivingSegment.setMap(commonSectionInfo.getCommonFieldMap());
        list.add(trackFreeDivingSegment);
    }

    public static void handleGolfCourseSegment(List<CommonSegment> list, CommonSectionInfo commonSectionInfo) {
        if (isHandleParameterEmpty(list, commonSectionInfo)) {
            LogUtil.j(TAG, "handleGolfCourseSegment parameter is abnormal");
            return;
        }
        TrackGolfCourseSegment trackGolfCourseSegment = new TrackGolfCourseSegment();
        trackGolfCourseSegment.setSectionHoleSeq(commonSectionInfo.getSectionNum());
        trackGolfCourseSegment.setSectionHoleId(commonSectionInfo.getSectionHoleId());
        trackGolfCourseSegment.setSectionPar(commonSectionInfo.getSectionPar());
        trackGolfCourseSegment.setSectionHoleScore(commonSectionInfo.getSectionHoleScore());
        trackGolfCourseSegment.setSectionHolePutts(commonSectionInfo.getSectionHolePutts());
        trackGolfCourseSegment.setSectionHolePenalty(commonSectionInfo.getSectionHolePenalty());
        trackGolfCourseSegment.setSectionHoleFairwayHits(commonSectionInfo.getSectionHoleHits());
        trackGolfCourseSegment.setSectionHandicap(commonSectionInfo.getSectionHandicap());
        trackGolfCourseSegment.setSectionValidTracks(commonSectionInfo.getSectionValidTracks());
        trackGolfCourseSegment.setSectionGolfShotTracks(commonSectionInfo.getSectionTrackStruct());
        list.add(trackGolfCourseSegment);
    }
}

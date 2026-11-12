package com.xiaomi.fit.fitness.parser.schema.sport;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fit.fitness.parser.schema.BaseParser;
import com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0005H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/sport/SchemaReportParser;", "Lcom/xiaomi/fit/fitness/parser/schema/BaseParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "parser", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", SchemaNetUtils.SchemaDir, "convertReportData", "", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "subKey", "subValue", "", DailyRecordKey.sportType, "", "convertTargetIntValue", "sportReport", "type", "value", "addToReportTarget", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaReportParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaReportParser.kt\ncom/xiaomi/fit/fitness/parser/schema/sport/SchemaReportParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,533:1\n216#2,2:534\n*S KotlinDebug\n*F\n+ 1 SchemaReportParser.kt\ncom/xiaomi/fit/fitness/parser/schema/sport/SchemaReportParser\n*L\n40#1:534,2\n*E\n"})
public final class SchemaReportParser extends BaseParser {

    @NotNull
    public static final SchemaReportParser INSTANCE = new SchemaReportParser();

    @NotNull
    private static String TAG = "Schema_ReportParser";

    private SchemaReportParser() {
    }

    private final void addToReportTarget(SportBasicReport sportReport, int type, String value) {
        if (sportReport.getTargetValue() == null) {
            sportReport.setTargetValue(new LinkedHashMap());
        }
        Integer numValueOf = Integer.valueOf(type);
        Map<Integer, String> targetValue = sportReport.getTargetValue();
        Intrinsics.checkNotNull(targetValue);
        targetValue.put(numValueOf, value);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(SportBasicReport report, String subKey, Object subValue, int sportType) {
        int iIntValue;
        int iIntValue2;
        switch (subKey.hashCode()) {
            case -2129294769:
                if (subKey.equals("startTime")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setStartTime(((Long) subValue).longValue());
                    break;
                }
                break;
            case -2112115502:
                if (subKey.equals(FitnessReportKey.avgStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgStrokeFrequency((Integer) subValue);
                    break;
                }
                break;
            case -2110569986:
                if (!subKey.equals(FitnessReportKey.targetCount)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                convertTargetIntValue(report, 6, ((Integer) subValue).intValue());
                break;
            case -2108568907:
                if (subKey.equals(FitnessReportKey.hrZone1LowerLimit)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setLowerLimitHeartRateZoneOne((Integer) subValue);
                    break;
                }
                break;
            case -2102389978:
                if (subKey.equals(FitnessReportKey.manualRepairTotalDistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) subValue;
                    if (num.intValue() > 0) {
                        report.setCorrectedDistance(num);
                    }
                    break;
                }
                break;
            case -2095779530:
                if (subKey.equals(FitnessReportKey.targetSpeed)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    convertTargetIntValue(report, 8, (int) ((Float) subValue).floatValue());
                    break;
                }
                break;
            case -2094826367:
                if (subKey.equals(FitnessReportKey.maxFreeBreathingAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num2 = (Integer) subValue;
                    num2.intValue();
                    report.setMaxFreeBreathAngle(num2);
                    break;
                }
                break;
            case -2079970439:
                if (subKey.equals(FitnessReportKey.maxJumpHeight)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setMaxStartingHeight(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -2041149526:
                if (subKey.equals(FitnessReportKey.minVerticalStrideRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinVerticalStrideRatio(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -2039913686:
                if (subKey.equals(FitnessReportKey.avgVerticalStrideRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgVerticalStrideRatio(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -2018479655:
                if (subKey.equals(FitnessReportKey.anaerobicTrainingEffect)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setAnaerobicTrainEffect((Float) subValue);
                    break;
                }
                break;
            case -2010181599:
                if (subKey.equals(FitnessReportKey.foreFootLandingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setFullFootLandingDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -2006134627:
                if (subKey.equals(FitnessReportKey.shootsNumber)) {
                    if (sportType == 13) {
                        if (subValue instanceof Long) {
                            iIntValue = (int) ((Number) subValue).longValue();
                        } else {
                            Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                            iIntValue = ((Integer) subValue).intValue();
                        }
                        report.setRowCount(Integer.valueOf(iIntValue));
                        break;
                    } else if (sportType == 19) {
                        if (subValue instanceof Long) {
                            iIntValue2 = (int) ((Number) subValue).longValue();
                        } else {
                            Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                            iIntValue2 = ((Integer) subValue).intValue();
                        }
                        report.setShootCount(Integer.valueOf(iIntValue2));
                        break;
                    }
                }
                break;
            case -1996977173:
                if (subKey.equals(FitnessReportKey.cloudCourseId)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setCloudCourseId((Long) subValue);
                    break;
                }
                break;
            case -1965553416:
                if (subKey.equals(FitnessReportKey.totalDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setDuration((int) ((Long) subValue).longValue());
                    break;
                }
                break;
            case -1942792439:
                if (subKey.equals(FitnessReportKey.maxContactTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxTouchDownTime((Integer) subValue);
                    break;
                }
                break;
            case -1928588465:
                if (subKey.equals(FitnessReportKey.maxCycleCadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxCycleCadence((Integer) subValue);
                    break;
                }
                break;
            case -1897994360:
                if (subKey.equals(FitnessReportKey.dribbleDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setDribbleDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1888202289:
                if (subKey.equals(FitnessReportKey.hrZone1Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrWarmUpDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1884270829:
                if (subKey.equals(FitnessReportKey.avgImpactForce)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgLandingImpact(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -1868513472:
                if (subKey.equals(FitnessReportKey.serveCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setSmashBallCount((Integer) subValue);
                    break;
                }
                break;
            case -1866970881:
                if (subKey.equals(FitnessReportKey.avgBreastStrokeGlidingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num3 = (Integer) subValue;
                    num3.intValue();
                    report.setAvgFrogSkiDuration(num3);
                    break;
                }
                break;
            case -1803536044:
                if (subKey.equals(FitnessReportKey.maxStrokeFreq)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxStrokeFreq((Integer) subValue);
                    break;
                }
                break;
            case -1783802102:
                if (subKey.equals(FitnessReportKey.poolWidth)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setPoolWidth((Integer) subValue);
                    break;
                }
                break;
            case -1761050697:
                if (subKey.equals(FitnessReportKey.targetCalories)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    convertTargetIntValue(report, 4, ((Integer) subValue).intValue());
                    break;
                }
                break;
            case -1713314791:
                if (subKey.equals(FitnessReportKey.vo2maxLevel)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setVo2maxLevel((Integer) subValue);
                    break;
                }
                break;
            case -1661804237:
                if (subKey.equals(FitnessReportKey.planTrainingTimestamp)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setTrainingPlanTime(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1653657626:
                if (subKey.equals(FitnessReportKey.aerobicTrainingEffect)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setTrainEffect((Float) subValue);
                    break;
                }
                break;
            case -1638907115:
                if (subKey.equals(FitnessReportKey.totalSwingCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setSwingCount((Integer) subValue);
                    break;
                }
                break;
            case -1629308566:
                if (subKey.equals(FitnessReportKey.algorithmSource)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAlgorithmDataSource((Integer) subValue);
                    break;
                }
                break;
            case -1607243192:
                if (subKey.equals("endTime")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setEndTime(((Long) subValue).longValue());
                    break;
                }
                break;
            case -1491000813:
                if (subKey.equals(FitnessReportKey.heartRateZone1Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrWarmUpDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1484995036:
                if (subKey.equals(FitnessReportKey.flightDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHangInAirDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1449971520:
                if (subKey.equals(FitnessReportKey.targetCadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    convertTargetIntValue(report, 7, ((Integer) subValue).intValue());
                    break;
                }
                break;
            case -1440297406:
                if (subKey.equals(FitnessReportKey.trainingFeeling)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainingExperience((Integer) subValue);
                    break;
                }
                break;
            case -1407504329:
                if (subKey.equals(FitnessReportKey.hrZone3LowerLimit)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setLowerLimitHeartRateZoneThree((Integer) subValue);
                    break;
                }
                break;
            case -1396530585:
                if (subKey.equals(FitnessReportKey.paceZone2Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setTwoPaceZoneDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1353784120:
                if (subKey.equals(FitnessReportKey.freeSwimDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num4 = (Integer) subValue;
                    num4.intValue();
                    report.setFreeSwimDuration(num4);
                    break;
                }
                break;
            case -1351635283:
                if (subKey.equals(FitnessReportKey.retractionOarDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    Long l = (Long) subValue;
                    report.setLayOarsDuration(l.longValue() != 0 ? Integer.valueOf((int) l.longValue()) : null);
                    break;
                }
                break;
            case -1326540457:
                if (subKey.equals(FitnessReportKey.totalStrokes)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setGross((Integer) subValue);
                    break;
                }
                break;
            case -1303625562:
                if (subKey.equals(FitnessReportKey.targetDistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    convertTargetIntValue(report, 3, (int) ((Long) subValue).longValue());
                    break;
                }
                break;
            case -1296956883:
                if (subKey.equals(FitnessReportKey.effectiveRunningDistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setDistance(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1293292626:
                if (subKey.equals(FitnessReportKey.predictedHalfMarathonTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setHalfMarathonGradePrediction((Integer) subValue);
                    break;
                }
                break;
            case -1287908205:
                if (subKey.equals(FitnessReportKey.smashCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setServeBallCount((Integer) subValue);
                    break;
                }
                break;
            case -1285876389:
                if (subKey.equals(FitnessReportKey.minContactTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinTouchDownDuration((Integer) subValue);
                    break;
                }
                break;
            case -1276229425:
                if (!subKey.equals(FitnessReportKey.mainPosture)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setMainPosture((Integer) subValue);
                break;
            case -1260637875:
                if (subKey.equals(FitnessReportKey.totalBreastStrokeGlidingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num5 = (Integer) subValue;
                    num5.intValue();
                    report.setFrogSkiDuration(num5);
                    break;
                }
                break;
            case -1252232898:
                if (subKey.equals(FitnessReportKey.totalAscent)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setRiseHeight((Float) subValue);
                    break;
                }
                break;
            case -1247220884:
                if (subKey.equals(FitnessReportKey.effectiveSkiingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setValidDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1239719488:
                if (subKey.equals(FitnessReportKey.avgSlidingFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setAvgRowFreq(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1222874814:
                if (subKey.equals("maxHeartRate")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxHr((Integer) subValue);
                    break;
                }
                break;
            case -1209540803:
                if (subKey.equals(FitnessReportKey.minContactRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinTouchDownAirRatio(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -1208143919:
                if (subKey.equals(FitnessReportKey.hrZone3Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrAerobicDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1202567705:
                if (subKey.equals(FitnessReportKey.foreFootLandingPercentage)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setForeFootLandingRatio((Integer) subValue);
                    break;
                }
                break;
            case -1188525202:
                if (subKey.equals(FitnessReportKey.fullFootLandingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setFullFootLandingDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1183526741:
                if (subKey.equals(FitnessReportKey.avgResistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgResistance((Integer) subValue);
                    break;
                }
                break;
            case -1182522613:
                if (subKey.equals(FitnessReportKey.trainingEffect)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setTrainEffect((Float) subValue);
                    break;
                }
                break;
            case -1102325408:
                if (subKey.equals(FitnessReportKey.avgDivingDepth)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgDivingDepth(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -1085204485:
                if (subKey.equals(FitnessReportKey.predicted5kTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setFiveKilometreGradePrediction((Integer) subValue);
                    break;
                }
                break;
            case -1020765418:
                if (subKey.equals(FitnessReportKey.bestEqualIntensityPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setMaxEqualPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -1003160011:
                if (!subKey.equals(FitnessReportKey.targetCounts)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                convertTargetIntValue(report, 6, ((Integer) subValue).intValue());
                break;
            case -991330279:
                if (subKey.equals(FitnessReportKey.skiingRuns)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTurnCount((Integer) subValue);
                    break;
                }
                break;
            case -981239984:
                if (subKey.equals(FitnessReportKey.divesCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setDescentCount((Integer) subValue);
                    break;
                }
                break;
            case -931198001:
                if (subKey.equals(FitnessReportKey.avgFlightTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgAirDuration((Integer) subValue);
                    break;
                }
                break;
            case -903552236:
                if (subKey.equals(FitnessReportKey.minAltitude)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setMinHeight((Float) subValue);
                    break;
                }
                break;
            case -884951379:
                if (subKey.equals(FitnessReportKey.oxygenConcentration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setOxygenConcentration((Integer) subValue);
                    break;
                }
                break;
            case -877159392:
                if (subKey.equals(FitnessReportKey.freeDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setFreeSwimDuration((Integer) subValue);
                    break;
                }
                break;
            case -862201954:
                if (subKey.equals(FitnessReportKey.trainingPlanId)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setTrainingPlanId((Long) subValue);
                    break;
                }
                break;
            case -819975693:
                if (subKey.equals(FitnessReportKey.enterWaterLocationLatitudes)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setWaterInletLatitude((Float) subValue);
                    break;
                }
                break;
            case -812619221:
                if (subKey.equals("vo2max")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setVo2max((Integer) subValue);
                    break;
                }
                break;
            case -810942443:
                if (subKey.equals(FitnessReportKey.heartRateZone3Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrAerobicDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -785727108:
                if (subKey.equals(FitnessReportKey.rowingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    Long l2 = (Long) subValue;
                    report.setPullOarsDuration(l2.longValue() != 0 ? Integer.valueOf((int) l2.longValue()) : null);
                    break;
                }
                break;
            case -768919188:
                if (subKey.equals("trainingStatus")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainingPeriod((Integer) subValue);
                    break;
                }
                break;
            case -748448748:
                if (subKey.equals("minHeartRate")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinHr((Integer) subValue);
                    break;
                }
                break;
            case -746533926:
                if (subKey.equals(FitnessReportKey.peakTrainingEffectLevel)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setPeekTrainingEffectRating((Integer) subValue);
                    break;
                }
                break;
            case -729442191:
                if (subKey.equals(FitnessReportKey.avgFreePitchAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num6 = (Integer) subValue;
                    num6.intValue();
                    report.setAvgFreePitchAngle(num6);
                    break;
                }
                break;
            case -724750047:
                if (subKey.equals(FitnessReportKey.totalJumps)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setSkipCount(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -716475837:
                if (subKey.equals("totalSteps")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setSteps(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -716472215:
                if (subKey.equals(FitnessReportKey.paceZone4Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setFourPaceZoneDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -706439751:
                if (subKey.equals(FitnessReportKey.hrZone5LowerLimit)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setLowerLimitHeartRateZoneFive((Integer) subValue);
                    break;
                }
                break;
            case -635140388:
                if (subKey.equals("totalWeight")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setGymTrainingTotalWeight((Integer) subValue);
                    break;
                }
                break;
            case -630614011:
                if (subKey.equals(FitnessReportKey.avgPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setAvgPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -630509902:
                if (subKey.equals(FitnessReportKey.avgSpo2)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgSpo2((Integer) subValue);
                    break;
                }
                break;
            case -586221159:
                if (subKey.equals(FitnessReportKey.breastStrokeDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num7 = (Integer) subValue;
                    num7.intValue();
                    report.setFrogSwimDuration(num7);
                    break;
                }
                break;
            case -577025992:
                if (subKey.equals("maxStress")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxStress((Integer) subValue);
                    break;
                }
                break;
            case -538229238:
                if (subKey.equals(FitnessReportKey.maxRunningPower)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxRunningPower((Integer) subValue);
                    break;
                }
                break;
            case -528085549:
                if (subKey.equals(FitnessReportKey.hrZone5Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrExtremeDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -476762475:
                if (subKey.equals(FitnessReportKey.totalActionCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setGymTrainingTotalTimes((Integer) subValue);
                    break;
                }
                break;
            case -463416785:
                if (subKey.equals("totalMovementsCount")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setGymTrainingGroupTimes((Integer) subValue);
                    break;
                }
                break;
            case -453547441:
                if (subKey.equals(FitnessReportKey.minWaterTemperature)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinWaterTemperature(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -418708127:
                if (subKey.equals(FitnessReportKey.maxWaterTemperature)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxWaterTemperature(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -382657319:
                if (subKey.equals(FitnessReportKey.backhandCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setBackhandSwingCount((Integer) subValue);
                    break;
                }
                break;
            case -368959599:
                if (subKey.equals(FitnessReportKey.maxVerticalOscillation)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxVerticalAmplitude(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case -347408421:
                if (subKey.equals(FitnessReportKey.predictedMarathonTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setFullMarathonGradePrediction((Integer) subValue);
                    break;
                }
                break;
            case -345781981:
                if (subKey.equals(FitnessReportKey.aerobicTrainingEffectRating)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainEffectLevel((Integer) subValue);
                    break;
                }
                break;
            case -327746939:
                if (subKey.equals(FitnessReportKey.avgDescentVelocity)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setAvgDescentRate((Float) subValue);
                    break;
                }
                break;
            case -325790938:
                if (subKey.equals("avgStress")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgStress((Integer) subValue);
                    break;
                }
                break;
            case -325787573:
                if (subKey.equals(FitnessReportKey.avgStride)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgStride((Integer) subValue);
                    break;
                }
                break;
            case -257664281:
                if (subKey.equals(FitnessReportKey.minJumpHeight)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setMinStartingHeight(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -226762980:
                if (subKey.equals(FitnessReportKey.avgJumpFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setAvgSkipFreq(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -226119642:
                if (subKey.equals(FitnessReportKey.maxAltitude)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setMaxHeight((Float) subValue);
                    break;
                }
                break;
            case -214145807:
                if (subKey.equals(FitnessReportKey.waterType)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setWaterBodyType((Integer) subValue);
                    break;
                }
                break;
            case -205156127:
                if (subKey.equals(FitnessReportKey.predicted10kTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTenKilometreGradePrediction((Integer) subValue);
                    break;
                }
                break;
            case -184527139:
                if (!subKey.equals("totalArmPull")) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setStrokeCount((Integer) subValue);
                break;
            case -163990771:
                if (subKey.equals(FitnessReportKey.enterWaterLocationAccuracy)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setWaterInletLongitude((Float) subValue);
                    break;
                }
                break;
            case -150231406:
                if (subKey.equals("turnCount")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTurnCount((Integer) subValue);
                    break;
                }
                break;
            case -142506390:
                if (subKey.equals("totalCalories")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num8 = (Integer) subValue;
                    if (num8.intValue() > 0) {
                        report.setTotalCal(num8);
                    }
                    break;
                }
                break;
            case -139861480:
                if (subKey.equals(FitnessReportKey.OpticalTransformUnit)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setDivingOTU((Integer) subValue);
                    break;
                }
                break;
            case -130884073:
                if (subKey.equals(FitnessReportKey.heartRateZone5Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrExtremeDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case -48371537:
                if (!subKey.equals(FitnessReportKey.totalIntergroupRestDuration)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                report.setTotalRestDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                break;
            case -24034703:
                if (subKey.equals(FitnessReportKey.bodyEnergyConsumption)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setEnergyConsume((Integer) subValue);
                    break;
                }
                break;
            case -13841773:
                if (subKey.equals(FitnessReportKey.heartRateZoneMethod)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setReserveHrZone((Integer) subValue);
                    break;
                }
                break;
            case 15752678:
                if (subKey.equals(FitnessReportKey.oxygenPressureThreshold)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setOxygenPartialPressureThreshold(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 34369075:
                if (subKey.equals(FitnessReportKey.workDone)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setEnergyWorking(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 63008987:
                if (subKey.equals(FitnessReportKey.avgContactTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgTouchDownDuration((Integer) subValue);
                    break;
                }
                break;
            case 78622391:
                if (subKey.equals(FitnessReportKey.minPressure)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinStress((Integer) subValue);
                    break;
                }
                break;
            case 115963020:
                if (subKey.equals(FitnessReportKey.enterWaterTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setEntryTime((Long) subValue);
                    break;
                }
                break;
            case 121713597:
                if (subKey.equals(FitnessReportKey.avgCycleCadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgCycleCadence((Integer) subValue);
                    break;
                }
                break;
            case 129908431:
                if (subKey.equals(FitnessReportKey.avgWaterTemperature)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgWaterTemperature(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 166327564:
                if (subKey.equals(FitnessReportKey.totalDiveDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setTotalDivingDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 168617214:
                if (!subKey.equals(FitnessReportKey.totalInterSetDuration)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                report.setTotalRestDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                break;
            case 195452582:
                if (subKey.equals("minStress")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinStress((Integer) subValue);
                    break;
                }
                break;
            case 209357014:
                if (subKey.equals(FitnessReportKey.anaerobicTrainingEffectRating)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAnaerobicTrainEffectLevel((Integer) subValue);
                    break;
                }
                break;
            case 234898523:
                if (subKey.equals(FitnessReportKey.effectiveDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setValidDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 245503140:
                if (subKey.equals(FitnessReportKey.forehandCount)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setForehandSwingCount((Integer) subValue);
                    break;
                }
                break;
            case 278427947:
                if (subKey.equals(FitnessReportKey.anaerobicTrainingEffectLevel)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAnaerobicTrainEffectLevel((Integer) subValue);
                    break;
                }
                break;
            case 291701842:
                if (subKey.equals(FitnessReportKey.lactateThresholdPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setLactateThresholdPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 314918745:
                if (subKey.equals("totalDistance")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setDistance(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 320265091:
                if (subKey.equals(FitnessReportKey.maxFreePitchAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num9 = (Integer) subValue;
                    num9.intValue();
                    report.setMaxFreePitchAngle(num9);
                    break;
                }
                break;
            case 340037479:
                if (subKey.equals(FitnessReportKey.avgJumpHeight)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setAvgStartingHeight(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 355842503:
                if (subKey.equals(FitnessReportKey.heelLandingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHeelLandingDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 364039168:
                if (subKey.equals(FitnessReportKey.maxStrokeFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxStrokeFreq((Integer) subValue);
                    break;
                }
                break;
            case 389447030:
                if (subKey.equals(FitnessReportKey.hrZone2LowerLimit)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setLowerLimitHeartRateZoneTwo((Integer) subValue);
                    break;
                }
                break;
            case 396787367:
                if (subKey.equals("maxSlope")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxSlope((Integer) subValue);
                    break;
                }
                break;
            case 396896579:
                if (subKey.equals("maxSpeed")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setMaxSpeed((Float) subValue);
                    break;
                }
                break;
            case 404895041:
                if (subKey.equals(FitnessReportKey.maxImpactForce)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxLandingImpact(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 410923878:
                if (subKey.equals(FitnessReportKey.paceZone1Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setOnePaceZoneDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 464943441:
                if (!subKey.equals("mainStroke")) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setMainPosture((Integer) subValue);
                break;
            case 486479684:
                if (subKey.equals(FitnessReportKey.targetPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    convertTargetIntValue(report, 1, (int) ((Long) subValue).longValue());
                    break;
                }
                break;
            case 495736634:
                if (subKey.equals(FitnessReportKey.maxBreastStrokeBreathingAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num10 = (Integer) subValue;
                    num10.intValue();
                    report.setMaxFrogBreathAngle(num10);
                    break;
                }
                break;
            case 508894733:
                if (subKey.equals(FitnessReportKey.heelLandingPercentage)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setHeelLandingRatio((Integer) subValue);
                    break;
                }
                break;
            case 546381608:
                if (subKey.equals(FitnessReportKey.avgBreastStrokeBreathingAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num11 = (Integer) subValue;
                    num11.intValue();
                    report.setAvgFrogBreathAngle(num11);
                    break;
                }
                break;
            case 552824372:
                if (subKey.equals(FitnessReportKey.algorithmDataSource)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAlgorithmDataSource((Integer) subValue);
                    break;
                }
                break;
            case 556055148:
                if (subKey.equals(FitnessReportKey.optimalJumpFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setBestSkipFreq(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 599310544:
                if (subKey.equals(FitnessReportKey.hrZone2Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrFatBurningDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 606135423:
                if (subKey.equals(FitnessReportKey.ventilationFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num12 = (Integer) subValue;
                    num12.intValue();
                    report.setVentilationFrequency(num12);
                    break;
                }
                break;
            case 616471874:
                if (subKey.equals(FitnessReportKey.avgStrokeFreq)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgStrokeFreq((Integer) subValue);
                    break;
                }
                break;
            case 642610665:
                if (subKey.equals(FitnessReportKey.outWaterLocationLatitudes)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setWaterOutletLatitude((Float) subValue);
                    break;
                }
                break;
            case 644951610:
                if (subKey.equals(FitnessReportKey.earnedPoints)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setVitality((Integer) subValue);
                    break;
                }
                break;
            case 692598676:
                if (subKey.equals(FitnessReportKey.avgAltitude)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setAvgHeight((Float) subValue);
                    break;
                }
                break;
            case 710869573:
                if (subKey.equals(FitnessReportKey.targetDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    convertTargetIntValue(report, 2, (int) ((Long) subValue).longValue());
                    break;
                }
                break;
            case 713646084:
                if (subKey.equals(FitnessReportKey.trainingStressScore)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainingPressure((Integer) subValue);
                    break;
                }
                break;
            case 756054985:
                if (subKey.equals(FitnessReportKey.maxPressure)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxStress((Integer) subValue);
                    break;
                }
                break;
            case 769735512:
                if (subKey.equals(FitnessReportKey.maxVerticalStrideRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxVerticalStrideRatio(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 814709566:
                if (subKey.equals(FitnessReportKey.aerobicTrainingEffectLevel)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainEffectLevel((Integer) subValue);
                    break;
                }
                break;
            case 843983255:
                if (!subKey.equals(FitnessReportKey.maxPace)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                report.setMaxPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                break;
            case 844087364:
                if (subKey.equals(FitnessReportKey.maxSpo2)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxSpo2((Integer) subValue);
                    break;
                }
                break;
            case 853020759:
                if (subKey.equals(FitnessReportKey.outWaterLocationAccuracy)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setWaterOutletLongitude((Float) subValue);
                    break;
                }
                break;
            case 858002221:
                if (subKey.equals(FitnessReportKey.maxBreastStrokeGlidingDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num13 = (Integer) subValue;
                    num13.intValue();
                    report.setMaxFrogSkiDuration(num13);
                    break;
                }
                break;
            case 868041898:
                if (subKey.equals(FitnessReportKey.totalSkiingDistance)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setDistance(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 913337439:
                if (subKey.equals(FitnessReportKey.avgCadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgCadence((Integer) subValue);
                    break;
                }
                break;
            case 941888625:
                if (subKey.equals(FitnessReportKey.totalClimbing)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setTotalClimbing((Long) subValue);
                    break;
                }
                break;
            case 943761377:
                if (subKey.equals(FitnessReportKey.maxFlightTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxAirDuration((Integer) subValue);
                    break;
                }
                break;
            case 961495718:
                if (subKey.equals(FitnessReportKey.noFlyDuration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setNoFlyDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 996512020:
                if (subKey.equals(FitnessReportKey.heartRateZone2Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrFatBurningDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1012330636:
                if (subKey.equals(FitnessReportKey.centralNervousSystem)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setDivingCNS((Integer) subValue);
                    break;
                }
                break;
            case 1033102598:
                if (subKey.equals(FitnessReportKey.avgUpwardVelocity)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setAvgAscentRate((Float) subValue);
                    break;
                }
                break;
            case 1063885362:
                if (subKey.equals(FitnessReportKey.minSpo2)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinSpo2((Integer) subValue);
                    break;
                }
                break;
            case 1089488096:
                if (subKey.equals(FitnessReportKey.trainingLoad)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainingLoad((Integer) subValue);
                    break;
                }
                break;
            case 1090511608:
                if (subKey.equals(FitnessReportKey.hrZone4LowerLimit)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setLowerLimitHeartRateZoneFour((Integer) subValue);
                    break;
                }
                break;
            case 1090982248:
                if (subKey.equals(FitnessReportKey.paceZone3Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setThreePaceZoneDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1115122659:
                if (subKey.equals(FitnessReportKey.minVerticalOscillation)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinVerticalAmplitude(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 1116358499:
                if (subKey.equals(FitnessReportKey.avgVerticalOscillation)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgVerticalAmplitude(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 1124776558:
                if (!subKey.equals(FitnessReportKey.subSportType)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setSportType(((Integer) subValue).intValue());
                break;
            case 1139675759:
                if (subKey.equals(FitnessReportKey.avgFreeBreathingAngle)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    Integer num14 = (Integer) subValue;
                    num14.intValue();
                    report.setAvgFreeBreathAngle(num14);
                    break;
                }
                break;
            case 1186840462:
                if (subKey.equals(FitnessReportKey.maxDivingDepth)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxDivingDepth(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 1188796908:
                if (subKey.equals(FitnessReportKey.runningPowerIndex)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setRunningIndicator((Float) subValue);
                    break;
                }
                break;
            case 1191316638:
                if (subKey.equals(FitnessReportKey.runningPowerLevel)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setRunningIndicatorLevel((Integer) subValue);
                    break;
                }
                break;
            case 1217148586:
                if (subKey.equals(FitnessReportKey.avgFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgRowFreq((Integer) subValue);
                    break;
                }
                break;
            case 1256497616:
                if (!subKey.equals(FitnessReportKey.groupCount)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setGroupCount((Integer) subValue);
                break;
            case 1278085315:
                if (subKey.equals(FitnessReportKey.bestSpeed)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setMaxSpeed((Float) subValue);
                    break;
                }
                break;
            case 1278303681:
                if (subKey.equals(FitnessReportKey.bestSwolf)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setBestSwolf((Integer) subValue);
                    break;
                }
                break;
            case 1279368914:
                if (subKey.equals(FitnessReportKey.hrZone4Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrAnaerobicDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1337867566:
                if (subKey.equals(FitnessReportKey.worstPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setMinPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1380298244:
                if (subKey.equals("strokeFrequency")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setRowCount(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1389564365:
                if (!subKey.equals(FitnessReportKey.setCount)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setGroupCount((Integer) subValue);
                break;
            case 1398152854:
                if (subKey.equals(FitnessReportKey.selectedCourse)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setSportCourseId((Integer) subValue);
                    break;
                }
                break;
            case 1456578692:
                if (subKey.equals(FitnessReportKey.avgEqualIntensityPace)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setAvgEqualPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1469902282:
                if (subKey.equals(FitnessReportKey.peakTrainingEffect)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setPeekTrainingEffect((Float) subValue);
                    break;
                }
                break;
            case 1487589268:
                if (subKey.equals("avgHeartRate")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgHr((Integer) subValue);
                    break;
                }
                break;
            case 1497414362:
                if (subKey.equals(FitnessReportKey.expectedRecoveryTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setRecoveryTime((Integer) subValue);
                    break;
                }
                break;
            case 1512072824:
                if (subKey.equals(FitnessReportKey.avgRunningPower)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgRunningPower((Integer) subValue);
                    break;
                }
                break;
            case 1575181307:
                if (subKey.equals(FitnessReportKey.heartRateRecovery)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setHrRecoveryRate((Float) subValue);
                    break;
                }
                break;
            case 1585967064:
                if (subKey.equals(FitnessReportKey.bestFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setBestRowFreq((Integer) subValue);
                    break;
                }
                break;
            case 1630958212:
                if (subKey.equals("trainingLoadLevel")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainingLoadLevel((Integer) subValue);
                    break;
                }
                break;
            case 1671665874:
                if (subKey.equals(FitnessReportKey.bestSlidingFrequency)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setBestRowFreq(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1674773303:
                if (subKey.equals(FitnessReportKey.avgPressure)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgStress((Integer) subValue);
                    break;
                }
                break;
            case 1676570390:
                if (subKey.equals(FitnessReportKey.heartRateZone4Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setHrAnaerobicDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1679428455:
                if (subKey.equals(FitnessReportKey.lactateThresholdHeartRate)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setLactateThresholdHeartRate((Integer) subValue);
                    break;
                }
                break;
            case 1698584589:
                if (subKey.equals(FitnessReportKey.totaltripCounts)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setStumbleTimes((Integer) subValue);
                    break;
                }
                break;
            case 1714985357:
                if (subKey.equals(FitnessReportKey.maxCadence)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxCadence((Integer) subValue);
                    break;
                }
                break;
            case 1771040618:
                if (subKey.equals(FitnessReportKey.paceZone5Duration)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setFivePaceZoneDuration(Integer.valueOf((int) ((Long) subValue).longValue()));
                    break;
                }
                break;
            case 1842240023:
                if (!subKey.equals(FitnessReportKey.bestPace)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                report.setMaxPace(Integer.valueOf((int) ((Long) subValue).longValue()));
                break;
            case 1883220655:
                if (subKey.equals(FitnessReportKey.pronationAmplitude)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setValgusRange((Integer) subValue);
                    break;
                }
                break;
            case 1905790391:
                if (!subKey.equals(FitnessReportKey.strokeCount)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setStrokeCount((Integer) subValue);
                break;
            case 1923303468:
                if (subKey.equals("activeCalories")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setCalories((Integer) subValue);
                    break;
                }
                break;
            case 1926238547:
                if (subKey.equals(FitnessReportKey.avgPower)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgPower((Integer) subValue);
                    break;
                }
                break;
            case 1929021589:
                if (subKey.equals("avgSpeed")) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setAvgSpeed((Float) subValue);
                    break;
                }
                break;
            case 1929239955:
                if (subKey.equals(FitnessReportKey.avgSwolf)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgSwolf((Integer) subValue);
                    break;
                }
                break;
            case 1951200189:
                if (subKey.equals(FitnessReportKey.avgContactRatio)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgTouchDownAirRatio(Float.valueOf(((Integer) subValue).intValue() / 10.0f));
                    break;
                }
                break;
            case 2056609400:
                if (subKey.equals(FitnessReportKey.mainLandingType)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                    report.setMainLandingMode((Integer) subValue);
                    break;
                }
                break;
            case 2107696720:
                if (!subKey.equals(FitnessReportKey.submotionType)) {
                }
                Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Int");
                report.setSportType(((Integer) subValue).intValue());
                break;
            case 2111896790:
                if (subKey.equals(FitnessReportKey.totalDescent)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Float");
                    report.setFallHeight((Float) subValue);
                    break;
                }
                break;
            case 2122445014:
                if (subKey.equals(FitnessReportKey.outWaterTime)) {
                    Intrinsics.checkNotNull(subValue, "null cannot be cast to non-null type kotlin.Long");
                    report.setExitTime((Long) subValue);
                    break;
                }
                break;
        }
    }

    private final void convertTargetIntValue(SportBasicReport sportReport, int type, int value) {
        if (value == 0) {
            return;
        }
        addToReportTarget(sportReport, type, String.valueOf(value));
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @NotNull
    public String getTAG() {
        return TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @Nullable
    public FitnessParseResult parser(@NotNull FitnessBinaryData binaryData, @NotNull String schema) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(schema, "schema");
        Logger.d(getTAG(), "byte dataId ------>:" + ByteUtil.bytesToHex$default(binaryData.getDataId().toByteArray(), false, 2, null));
        JsonObject schemaElement = getSchemaElement(schema);
        Intrinsics.checkNotNull(schemaElement);
        BinarySchemaDecoder binarySchemaDecoder = new BinarySchemaDecoder(schemaElement);
        binarySchemaDecoder.setBuffer(getBinaryData(binaryData));
        Map<String, Object> mapDecode = binarySchemaDecoder.decode();
        Logger.d(getTAG(), "result:" + mapDecode);
        SportBasicReport sportBasicReport = new SportBasicReport(binaryData.getDataId());
        Intrinsics.checkNotNull(mapDecode);
        Object obj = mapDecode.get("root");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Object obj2 = ((Map) obj).get("body");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            INSTANCE.convertReportData(sportBasicReport, (String) entry.getKey(), entry.getValue(), binaryData.getDataId().getSportType());
        }
        return new FitnessParseResult.Builder().sportReport(sportBasicReport).build();
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TAG = str;
    }
}

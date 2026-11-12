package com.xiaomi.fit.fitness.device.hm.parse.repo;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.hm.api.ParseResultItem;
import com.xiaomi.fit.fitness.device.hm.data.HmSportMode;
import com.xiaomi.fit.fitness.device.hm.parse.repo.HmSportReportParse;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/HmSportReportParse;", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/IHmDataParseByCategory;", "<init>", "()V", "sendDataRecord", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "getSendDataRecord", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "sendDataRecord$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/device/hm/api/ParseResultItem;", "sid", "", "data", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNotDistance", "", "miSportType", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HmSportReportParse implements IHmDataParseByCategory {

    /* JADX INFO: renamed from: sendDataRecord$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendDataRecord = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z9c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HmSportReportParse.sendDataRecord_delegate$lambda$0();
        }
    });

    private final FitnessDataRecorder getSendDataRecord() {
        return (FitnessDataRecorder) this.sendDataRecord.getValue();
    }

    private final boolean hasNotDistance(int miSportType) {
        return miSportType == 8 || miSportType == 14 || miSportType == 16 || miSportType == 13 || miSportType == 12 || miSportType == 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder sendDataRecord_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    @Override // com.xiaomi.fit.fitness.device.hm.parse.repo.IHmDataParseByCategory
    @Nullable
    public Object parse(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ParseResultItem> continuation) {
        long j;
        Integer numBoxInt;
        int currentTZOffsetIn15min = FitnessDateUtils.getCurrentTZOffsetIn15min();
        long jOptLong = 0;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            jOptLong = jSONObject.optLong(PaiData.LAST_SYNC_TIME);
            long jObtainLongReturnNotNull = JsonUtilKt.obtainLongReturnNotNull(jSONObject, "trackid");
            int iOptInt = jSONObject.optInt("type");
            int iSwitchHmToMiProtoSportType = HMParseUtilKt.switchHmToMiProtoSportType(iOptInt);
            FitnessDataId.Builder builder = new FitnessDataId.Builder();
            builder.setFileType(1);
            builder.setVersion(2);
            builder.setDataType(1);
            builder.setTzIn15Min(currentTZOffsetIn15min);
            builder.setTimeStamp(jObtainLongReturnNotNull);
            builder.setSportType(iSwitchHmToMiProtoSportType);
            SportBasicReport sportBasicReport = new SportBasicReport(builder.build());
            sportBasicReport.setSportType(HMParseUtilKt.matchHundredSportType(iOptInt));
            sportBasicReport.setStartTime(jObtainLongReturnNotNull);
            sportBasicReport.setEndTime(JsonUtilKt.obtainLongReturnNotNull(jSONObject, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME));
            sportBasicReport.setDuration(JsonUtilKt.obtainIntReturnNotNull(jSONObject, "run_time"));
            try {
                if (!hasNotDistance(iSwitchHmToMiProtoSportType)) {
                    sportBasicReport.setDistance(JsonUtilKt.obtainInt(jSONObject, StepsInfo.KEY_DISTANCE));
                }
                Integer numObtainValidInt = JsonUtilKt.obtainValidInt(jSONObject, "target_type");
                Integer numObtainInt = JsonUtilKt.obtainInt(jSONObject, "target_value");
                if (numObtainValidInt != null && numObtainInt != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(numObtainValidInt, numObtainInt.toString());
                    sportBasicReport.setTargetValue(linkedHashMap);
                }
                sportBasicReport.setCalories(JsonUtilKt.obtainInt(jSONObject, "calorie"));
                sportBasicReport.setAvgHr(JsonUtilKt.obtainIntFormStr(jSONObject, "avg_heart_rate"));
                sportBasicReport.setMaxHr(JsonUtilKt.obtainInt(jSONObject, FitnessPersistKey.ReportMaxHr));
                sportBasicReport.setMinHr(JsonUtilKt.obtainValidInt(jSONObject, FitnessPersistKey.ReportMinHr));
                sportBasicReport.setRiseHeight(JsonUtilKt.obtainFloat(jSONObject, "altitude_ascend"));
                sportBasicReport.setFallHeight(JsonUtilKt.obtainFloat(jSONObject, "altitude_descend"));
                sportBasicReport.setMaxHeight(JsonUtilKt.obtainFloat(jSONObject, "max_altitude"));
                sportBasicReport.setMinHeight(JsonUtilKt.obtainFloat(jSONObject, "min_altitude"));
                Float fObtainFloatFromInt = JsonUtilKt.obtainFloatFromInt(jSONObject, "te");
                sportBasicReport.setTrainEffect(fObtainFloatFromInt != null ? Boxing.boxFloat(fObtainFloatFromInt.floatValue() / 10.0f) : null);
                Float fObtainFloatFromInt2 = JsonUtilKt.obtainFloatFromInt(jSONObject, "anaerobic_te");
                sportBasicReport.setAnaerobicTrainEffect(fObtainFloatFromInt2 != null ? Boxing.boxFloat(fObtainFloatFromInt2.floatValue() / 10.0f) : null);
                sportBasicReport.setSteps(JsonUtilKt.obtainInt(jSONObject, "total_step"));
                int protoType = sportBasicReport.getProtoType();
                if (protoType == 6 || protoType == 7 || protoType == 23) {
                    sportBasicReport.setMaxCadence(JsonUtilKt.obtainValidInt(jSONObject, "max_cadence"));
                    sportBasicReport.setAvgCadence(JsonUtilKt.obtainValidInt(jSONObject, "avg_cadence"));
                } else {
                    sportBasicReport.setMaxCadence(JsonUtilKt.obtainValidInt(jSONObject, "max_frequency"));
                    sportBasicReport.setAvgCadence(JsonUtilKt.obtainValidInt(jSONObject, "avg_frequency"));
                    sportBasicReport.setAvgStride(JsonUtilKt.obtainValidInt(jSONObject, "avg_stride_length"));
                }
                sportBasicReport.setTotalClimbing(JsonUtilKt.obtainLong(jSONObject, "distance_ascend"));
                sportBasicReport.setRiseClimbDuration(JsonUtilKt.obtainValidInt(jSONObject, "climb_dis_ascend_time"));
                sportBasicReport.setFallClimbDuration(JsonUtilKt.obtainValidInt(jSONObject, "climb_dis_descend_time"));
                sportBasicReport.setStrokeCount(JsonUtilKt.obtainValidInt(jSONObject, "total_strokes"));
                sportBasicReport.setPoolWidth(JsonUtilKt.obtainValidInt(jSONObject, "swim_pool_length"));
                Integer numObtainInt2 = JsonUtilKt.obtainInt(jSONObject, "swim_style");
                sportBasicReport.setMainPosture(numObtainInt2 != null ? Boxing.boxInt(HMParseUtilKt.matchSwimType(numObtainInt2.intValue())) : null);
                sportBasicReport.setTurnCount(JsonUtilKt.obtainValidInt(jSONObject, "total_trips"));
                Double dObtainValidDouble = JsonUtilKt.obtainValidDouble(jSONObject, "avg_stroke_speed");
                if (dObtainValidDouble != null) {
                    try {
                        j = jOptLong;
                        try {
                            numBoxInt = Boxing.boxInt(MathKt__MathJVMKt.roundToInt(dObtainValidDouble.doubleValue() * ((double) 60)));
                        } catch (Exception e) {
                            e = e;
                            jOptLong = j;
                            FitnessLogUtils.e(HMParseUtilKt.TAG, "HmSportReportParse " + e.getMessage(), e);
                            return new ParseResultItem(true, currentTZOffsetIn15min, jOptLong);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        FitnessLogUtils.e(HMParseUtilKt.TAG, "HmSportReportParse " + e.getMessage(), e);
                        return new ParseResultItem(true, currentTZOffsetIn15min, jOptLong);
                    }
                } else {
                    j = jOptLong;
                    numBoxInt = null;
                }
                sportBasicReport.setAvgStrokeFreq(numBoxInt);
                Double dObtainValidDouble2 = JsonUtilKt.obtainValidDouble(jSONObject, "max_stroke_speed");
                sportBasicReport.setMaxStrokeFreq(dObtainValidDouble2 != null ? Boxing.boxInt(MathKt__MathJVMKt.roundToInt(dObtainValidDouble2.doubleValue() * ((double) 60))) : null);
                sportBasicReport.setSwingCount(JsonUtilKt.obtainInt(jSONObject, "strokes"));
                sportBasicReport.setForehandSwingCount(JsonUtilKt.obtainInt(jSONObject, "fore_hand"));
                sportBasicReport.setBackhandSwingCount(JsonUtilKt.obtainInt(jSONObject, "back_hand"));
                sportBasicReport.setServeBallCount(JsonUtilKt.obtainInt(jSONObject, "serve"));
                sportBasicReport.setTotalRestDuration(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_rest_time"));
                sportBasicReport.setGroupCount(JsonUtilKt.obtainInt(jSONObject, "total_group"));
                Double dObtainDouble = JsonUtilKt.obtainDouble(jSONObject, "min_pace");
                Double dObtainDouble2 = JsonUtilKt.obtainDouble(jSONObject, "max_pace");
                Double dObtainDoubleFromStr = JsonUtilKt.obtainDoubleFromStr(jSONObject, "avg_pace");
                if (sportBasicReport.getSportType() == 9 || sportBasicReport.getSportType() == 10) {
                    sportBasicReport = sportBasicReport;
                    sportBasicReport.setMaxPace(dObtainDouble != null ? Boxing.boxInt((int) (dObtainDouble.doubleValue() * ((double) 100))) : null);
                    sportBasicReport.setMinPace(dObtainDouble2 != null ? Boxing.boxInt((int) (dObtainDouble2.doubleValue() * ((double) 100))) : null);
                    sportBasicReport.setAvgPace(dObtainDoubleFromStr != null ? Boxing.boxInt((int) (dObtainDoubleFromStr.doubleValue() * ((double) 100))) : null);
                } else {
                    sportBasicReport.setMaxPace(dObtainDouble != null ? Boxing.boxInt((int) (((double) 1000) * dObtainDouble.doubleValue())) : null);
                    sportBasicReport.setMinPace(dObtainDouble2 != null ? Boxing.boxInt((int) (dObtainDouble2.doubleValue() * ((double) 1000))) : null);
                    sportBasicReport.setAvgPace(dObtainDoubleFromStr != null ? Boxing.boxInt((int) (dObtainDoubleFromStr.doubleValue() * ((double) 1000))) : null);
                }
                sportBasicReport.setMaxSpeed((dObtainDouble == null || dObtainDouble.doubleValue() <= 0.0d) ? null : Boxing.boxFloat((float) ((((double) 1) / dObtainDouble.doubleValue()) * 3.6d)));
                sportBasicReport.setAvgSpeed((dObtainDoubleFromStr == null || dObtainDoubleFromStr.doubleValue() <= 0.0d) ? null : Boxing.boxFloat((float) ((((double) 1) / dObtainDoubleFromStr.doubleValue()) * 3.6d)));
                String strOptString = jSONObject.optString("heart_range");
                Intrinsics.checkNotNull(strOptString);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strOptString, new String[]{";"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() > 5) {
                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(0), new String[]{","}, false, 0, 6, (Object) null);
                    sportBasicReport.setHrSmoothRelaxDuration(listSplit$default2.isEmpty() ^ true ? Boxing.boxInt(Integer.parseInt((String) listSplit$default2.get(0))) : null);
                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(1), new String[]{","}, false, 0, 6, (Object) null);
                    sportBasicReport.setHrWarmUpDuration(listSplit$default3.isEmpty() ^ true ? Boxing.boxInt(Integer.parseInt((String) listSplit$default3.get(0))) : null);
                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{","}, false, 0, 6, (Object) null);
                    sportBasicReport.setHrFatBurningDuration(listSplit$default4.isEmpty() ^ true ? Boxing.boxInt(Integer.parseInt((String) listSplit$default4.get(0))) : null);
                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(3), new String[]{","}, false, 0, 6, (Object) null);
                    sportBasicReport.setHrAerobicDuration(listSplit$default5.isEmpty() ^ true ? Boxing.boxInt(Integer.parseInt((String) listSplit$default5.get(0))) : null);
                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(4), new String[]{","}, false, 0, 6, (Object) null);
                    sportBasicReport.setHrAnaerobicDuration(listSplit$default6.isEmpty() ^ true ? Boxing.boxInt(Integer.parseInt((String) listSplit$default6.get(0))) : null);
                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(5), new String[]{","}, false, 0, 6, (Object) null);
                    sportBasicReport.setHrExtremeDuration(listSplit$default7.isEmpty() ^ true ? Boxing.boxInt(Integer.parseInt((String) listSplit$default7.get(0))) : null);
                }
                sportBasicReport.setReserveHrZone(Boxing.boxInt(0));
                int sportType = sportBasicReport.getSportType();
                if (sportType == 13) {
                    sportBasicReport.setRowCount(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_count"));
                    sportBasicReport.setAvgRowFreq(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_avg_frequency"));
                    sportBasicReport.setBestRowFreq(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_max_frequency"));
                } else if (sportType == 14) {
                    sportBasicReport.setSkipCount(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_count"));
                    sportBasicReport.setAvgSkipFreq(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_avg_frequency"));
                    sportBasicReport.setBestSkipFreq(JsonUtilKt.obtainInt(jSONObject, "rope_skipping_max_frequency"));
                }
                sportBasicReport.setAvgStress(JsonUtilKt.obtainInt(jSONObject, "avg_pressure"));
                sportBasicReport.setMaxStress(JsonUtilKt.obtainInt(jSONObject, "max_pressure"));
                sportBasicReport.setMinStress(JsonUtilKt.obtainInt(jSONObject, "min_pressure"));
                Integer numObtainInt3 = JsonUtilKt.obtainInt(jSONObject, "sport_mode");
                if (numObtainInt3 != null && numObtainInt3.intValue() == HmSportMode.IntervalTraining.getValue()) {
                    sportBasicReport.setSportCourseId(Boxing.boxInt(254));
                }
                boolean zRecordSportReport = getSendDataRecord().recordSportReport(str, FitnessDateUtils.getTzOffsetInSecBy15min(currentTZOffsetIn15min), sportBasicReport);
                FitnessLogUtils.i(HMParseUtilKt.TAG, "HmSportReportParse item=" + sportBasicReport + "**result=" + zRecordSportReport + "**time=" + jObtainLongReturnNotNull);
                jOptLong = j;
                return new ParseResultItem(zRecordSportReport, currentTZOffsetIn15min, jOptLong);
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }
}

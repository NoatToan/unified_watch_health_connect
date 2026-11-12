package com.xiaomi.fit.fitness.parser.daily;

import android.util.Log;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.base.OneDimenDataParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyReport;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fit.fitness.parser.schema.ParserWayControl;
import com.xiaomi.fit.fitness.parser.schema.daily.SchemaDailyParser;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/DailyReportParser;", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "<init>", "()V", "TAG", "", "reportDataTypeArray", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "[Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "nativeParseDailyReport", "processDailyDataReport", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "resultMap", "", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "setDailyData", "", "valueItem", "report", "DataType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyReportParser extends FitnessDataBaseParser {

    @NotNull
    private final String TAG = "DailyReportParser";

    @NotNull
    private final FitnessDataBaseParser.OneDimenDataType[] reportDataTypeArray = {new FitnessDataBaseParser.OneDimenDataType(0, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(1, 2, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(2, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(3, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(4, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(5, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(6, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(7, 4, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(8, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(9, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(10, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(11, 1, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(12, 3, 1, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(13, 2, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(14, 2, 2, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(15, 1, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(16, 1, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(17, 4, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(18, 1, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(19, 4, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(20, 1, 3, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(21, 2, 4, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(22, 2, 4, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(23, 1, 4, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(24, 1, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(25, 1, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(26, 1, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(27, 2, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(28, 1, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(29, 1, 5, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(30, 2, 6, false, null, false, null, 88, null), new FitnessDataBaseParser.OneDimenDataType(31, 2, 6, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(32, 2, 6, false, null, false, null, 120, null), new FitnessDataBaseParser.OneDimenDataType(33, 2, 6, false, null, false, null, 120, null)};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/daily/DailyReportParser$DataType;", "", "<init>", "()V", "steps", "", "calories", "curHr", "restHr", "maxHr", "maxHrTime", "minHr", "minHrTime", "avgHr", "avgStress", "maxStress", "minStress", "validStand", "totalCalories", "recoveryTime", "curSpo2", FitnessReportKey.maxSpo2, "maxSpo2Time", FitnessReportKey.minSpo2, "minSpo2Time", FitnessReportKey.avgSpo2, "dayTrainingLoad", "weekTrainingLoad", "trainingLoadLevel", "dayLowIntensityVitality", "dayMediumIntensityVitality", "dayHighIntensityVitality", "total7daysVitality", "suggestActivityType", "suggestActivityDuration", "physicalFitnessStatus", "physicalFitnessLevel", "fatigueLevel", "physicalStatusStress", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataType {

        @NotNull
        public static final DataType INSTANCE = new DataType();
        public static final int avgHr = 8;
        public static final int avgSpo2 = 20;
        public static final int avgStress = 9;
        public static final int calories = 1;
        public static final int curHr = 2;
        public static final int curSpo2 = 15;
        public static final int dayHighIntensityVitality = 26;
        public static final int dayLowIntensityVitality = 24;
        public static final int dayMediumIntensityVitality = 25;
        public static final int dayTrainingLoad = 21;
        public static final int fatigueLevel = 32;
        public static final int maxHr = 4;
        public static final int maxHrTime = 5;
        public static final int maxSpo2 = 16;
        public static final int maxSpo2Time = 17;
        public static final int maxStress = 10;
        public static final int minHr = 6;
        public static final int minHrTime = 7;
        public static final int minSpo2 = 18;
        public static final int minSpo2Time = 19;
        public static final int minStress = 11;
        public static final int physicalFitnessLevel = 31;
        public static final int physicalFitnessStatus = 30;
        public static final int physicalStatusStress = 33;
        public static final int recoveryTime = 14;
        public static final int restHr = 3;
        public static final int steps = 0;
        public static final int suggestActivityDuration = 29;
        public static final int suggestActivityType = 28;
        public static final int total7daysVitality = 27;
        public static final int totalCalories = 13;
        public static final int trainingLoadLevel = 23;
        public static final int validStand = 12;
        public static final int weekTrainingLoad = 22;

        private DataType() {
        }
    }

    private final FitnessParseResult nativeParseDailyReport(FitnessBinaryData binaryData) {
        FitnessLogUtils.i(this.TAG, "native parse daily report");
        Map<Integer, FitnessDataBaseParser.DataValueItem> reportData = OneDimenDataParser.INSTANCE.parseReportData(this.reportDataTypeArray, binaryData);
        if (reportData == null || reportData.isEmpty()) {
            FitnessLogUtils.w(this.TAG, "parse failed (" + binaryData + ".dataId)");
            return null;
        }
        ParsedDailyReport parsedDailyReportProcessDailyDataReport = processDailyDataReport(binaryData.getDataId(), reportData);
        FitnessLogUtils.i(this.TAG, "dailyDataReport(" + getMGson().toJson(parsedDailyReportProcessDailyDataReport) + ")");
        return new FitnessParseResult.Builder().dailyDataReport(parsedDailyReportProcessDailyDataReport).build();
    }

    private final ParsedDailyReport processDailyDataReport(FitnessDataId dataId, Map<Integer, FitnessDataBaseParser.DataValueItem> resultMap) {
        ParsedDailyReport parsedDailyReport = new ParsedDailyReport(dataId.getTimeStamp(), dataId.getTzOffsetInSec());
        for (FitnessDataBaseParser.OneDimenDataType oneDimenDataType : this.reportDataTypeArray) {
            setDailyData(resultMap.get(Integer.valueOf(oneDimenDataType.getType())), parsedDailyReport);
        }
        return parsedDailyReport;
    }

    private final void setDailyData(FitnessDataBaseParser.DataValueItem valueItem, ParsedDailyReport report) {
        if (valueItem == null || !valueItem.getValid()) {
            return;
        }
        switch (valueItem.getType()) {
            case 0:
                report.setSteps(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 1:
                report.setCalories(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 2:
                report.setHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 3:
                report.setRestHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 4:
                report.setMaxHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 5:
                report.setMaxHrTime(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 6:
                report.setMinHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 7:
                report.setMinHrTime(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 8:
                report.setAvgHr(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 9:
                report.setAvgStress(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 10:
                report.setMaxStress(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 11:
                report.setMinStress(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 12:
                report.setValidStand(valueItem.getBytes());
                break;
            case 13:
                report.setTotalCal(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 14:
                report.setRecoveryTime(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 15:
                report.setSpo2(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 16:
                report.setMaxSpo2(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 17:
                report.setMaxSpo2Time(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 18:
                report.setMinSpo2(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 19:
                report.setMinSpo2Time(Long.valueOf(valueItem.getValue().longValue()));
                break;
            case 20:
                report.setAvgSpo2(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 21:
                report.setDayTrainingLoad(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 22:
                report.setWeekTrainingLoad(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 23:
                report.setTrainingLoadLevel(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 24:
                report.setDayLowIntensityVitality(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 25:
                report.setDayMediumIntensityVitality(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 26:
                report.setDayHighIntensityVitality(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 27:
                report.setTotal7daysVitality(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 28:
                report.setSuggestActivityType(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 29:
                report.setSuggestActivityDuration(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 30:
                report.setPhysicalFitnessStatus(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 31:
                report.setPhysicalFitnessLevel(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 32:
                report.setFatigueLevel(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            case 33:
                report.setPhysicalStatusStress(Integer.valueOf(valueItem.getValue().intValue()));
                break;
            default:
                FitnessLogUtils.w(this.TAG, "no support type = " + valueItem.getType());
                break;
        }
    }

    @Override // com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser
    @Nullable
    public FitnessParseResult parse(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        if (binaryData.getDataValid() == null) {
            FitnessLogUtils.w(this.TAG, "not support parse " + binaryData.getDataId());
            return null;
        }
        ParserWayControl parserWayControl = ParserWayControl.INSTANCE;
        String schema = parserWayControl.getSchema(binaryData);
        if (schema == null || !(!StringsKt__StringsKt.isBlank(schema))) {
            FitnessLogUtils.i(this.TAG, "parse daily report by native");
            if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                return nativeParseDailyReport(binaryData);
            }
        } else {
            try {
                FitnessLogUtils.i(this.TAG, "parse daily report by schema");
                SchemaDailyParser schemaDailyParser = SchemaDailyParser.INSTANCE;
                String schema2 = parserWayControl.getSchema(binaryData);
                Intrinsics.checkNotNull(schema2);
                return schemaDailyParser.parser(binaryData, schema2);
            } catch (Exception e) {
                FitnessLogUtils.i(this.TAG, "parse daily report by schema error , e:" + e + " , trace:" + Log.getStackTraceString(e));
                if (ParserPreference.INSTANCE.getIS_USE_NATIVE_PARSER()) {
                    return nativeParseDailyReport(binaryData);
                }
            }
        }
        return null;
    }
}

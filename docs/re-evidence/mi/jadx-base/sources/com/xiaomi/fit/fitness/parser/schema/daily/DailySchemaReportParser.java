package com.xiaomi.fit.fitness.parser.schema.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyReport;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/DailySchemaReportParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "convertReportData", "", "key", "value", "report", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailySchemaReportParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailySchemaReportParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/DailySchemaReportParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n216#2:74\n216#2,2:75\n217#2:77\n*S KotlinDebug\n*F\n+ 1 DailySchemaReportParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/DailySchemaReportParser\n*L\n20#1:74\n24#1:75,2\n20#1:77\n*E\n"})
public final class DailySchemaReportParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "DailySchemaReportParser";

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, ParsedDailyReport report) {
        switch (key.hashCode()) {
            case -2021521369:
                if (key.equals(DailyReportKey.residualrecoverytime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setRecoveryTime((Integer) value);
                    break;
                }
                break;
            case -2015077852:
                if (key.equals(DailyReportKey.totaltrainingLoad)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setDayTrainingLoad((Integer) value);
                    break;
                }
                break;
            case -1866780415:
                if (key.equals(DailyReportKey.minHeartRateTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setMinHrTime((Long) value);
                    break;
                }
                break;
            case -1802911953:
                if (key.equals(DailyReportKey.maxHeartRateTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setMaxHrTime((Long) value);
                    break;
                }
                break;
            case -1427374863:
                if (key.equals(DailyReportKey.minOxygenSaturationTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setMinSpo2Time((Long) value);
                    break;
                }
                break;
            case -1222874814:
                if (key.equals("maxHeartRate")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxHr((Integer) value);
                    break;
                }
                break;
            case -1170745340:
                if (key.equals(DailyReportKey.minOxygenSaturation)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinSpo2((Integer) value);
                    break;
                }
                break;
            case -1135906026:
                if (key.equals(DailyReportKey.maxOxygenSaturation)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxSpo2((Integer) value);
                    break;
                }
                break;
            case -857269136:
                if (key.equals(DailyReportKey.totalactiveCalories)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setCalories((Integer) value);
                    break;
                }
                break;
            case -748448748:
                if (key.equals("minHeartRate")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinHr((Integer) value);
                    break;
                }
                break;
            case -716475837:
                if (key.equals("totalSteps")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setSteps(Integer.valueOf((int) ((Long) value).longValue()));
                    break;
                }
                break;
            case -587289468:
                if (key.equals(DailyReportKey.avgOxygenSaturation)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgSpo2((Integer) value);
                    break;
                }
                break;
            case -577025992:
                if (key.equals("maxStress")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMaxStress((Integer) value);
                    break;
                }
                break;
            case -325790938:
                if (key.equals("avgStress")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgStress((Integer) value);
                    break;
                }
                break;
            case -189284605:
                if (key.equals(DailyReportKey.maxOxygenSaturationTime)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setMaxSpo2Time((Long) value);
                    break;
                }
                break;
            case -174105863:
                if (key.equals(DailyReportKey.lowIntensityearnedPoints)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setDayLowIntensityVitality((Integer) value);
                    break;
                }
                break;
            case -142506390:
                if (key.equals("totalCalories")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setTotalCal((Integer) value);
                    break;
                }
                break;
            case -129788093:
                if (key.equals(DailyReportKey.standingindicator)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.ByteArray");
                    report.setValidStand((byte[]) value);
                    break;
                }
                break;
            case 96921:
                if (key.equals(DailyReportKey.atl)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setFatigueLevel((Integer) value);
                    break;
                }
                break;
            case 98843:
                if (key.equals(DailyReportKey.ctl)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setPhysicalFitnessLevel((Integer) value);
                    break;
                }
                break;
            case 115139:
                if (key.equals("tsb")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setPhysicalFitnessStatus((Integer) value);
                    break;
                }
                break;
            case 115156:
                if (key.equals(DailyReportKey.tss)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setPhysicalStatusStress((Integer) value);
                    break;
                }
                break;
            case 72746552:
                if (key.equals(DailyReportKey.totalPast7daystrainingLoad)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setWeekTrainingLoad((Integer) value);
                    break;
                }
                break;
            case 195452582:
                if (key.equals("minStress")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMinStress((Integer) value);
                    break;
                }
                break;
            case 200416838:
                if (key.equals("heartRate")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setHr((Integer) value);
                    break;
                }
                break;
            case 303354258:
                if (key.equals("oxygenSaturation")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setSpo2((Integer) value);
                    break;
                }
                break;
            case 1105510235:
                if (key.equals(DailyReportKey.targetNextearnedPointsTiem)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setSuggestActivityDuration((Integer) value);
                    break;
                }
                break;
            case 1105525944:
                if (key.equals(DailyReportKey.targetNextearnedPointsType)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setSuggestActivityType((Integer) value);
                    break;
                }
                break;
            case 1118502264:
                if (key.equals(DailyReportKey.mediumIntensityearnedPoints)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setDayMediumIntensityVitality((Integer) value);
                    break;
                }
                break;
            case 1146394677:
                if (key.equals(DailyReportKey.totalPast7dayearnedPoints)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setTotal7daysVitality((Integer) value);
                    break;
                }
                break;
            case 1487589268:
                if (key.equals("avgHeartRate")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setAvgHr((Integer) value);
                    break;
                }
                break;
            case 1603838552:
                if (key.equals(DailyReportKey.restingHeartRate)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setRestHr((Integer) value);
                    break;
                }
                break;
            case 1630958212:
                if (key.equals("trainingLoadLevel")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setTrainingLoadLevel((Integer) value);
                    break;
                }
                break;
            case 1768964841:
                if (key.equals(DailyReportKey.maxIntensityearnedPoints)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setDayHighIntensityVitality((Integer) value);
                    break;
                }
                break;
        }
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.daily.BaseDailyParser
    @NotNull
    public FitnessParseResult parse$fitness_parser_release(@NotNull Map<String, ? extends Object> root, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Object obj = root.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        ParsedDailyReport parsedDailyReport = new ParsedDailyReport(dataId.getTimeStamp(), dataId.getTzOffsetInSec());
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-------------------");
            sb.append(value);
            if (value instanceof Map) {
                for (Map.Entry entry2 : ((Map) value).entrySet()) {
                    convertReportData((String) entry2.getKey(), entry2.getValue(), parsedDailyReport);
                }
            } else {
                convertReportData(str, value, parsedDailyReport);
            }
        }
        return new FitnessParseResult.Builder().dailyDataReport(parsedDailyReport).build();
    }
}

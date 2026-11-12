package com.xiaomi.fit.fitness.parser.schema.daily;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/DailySchemaRecordParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "convertReportData", "", "key", "value", "parsedDailyRecord", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailySchemaRecordParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailySchemaRecordParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/DailySchemaRecordParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,85:1\n1863#2:86\n1864#2:91\n216#3:87\n216#3,2:88\n217#3:90\n*S KotlinDebug\n*F\n+ 1 DailySchemaRecordParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/DailySchemaRecordParser\n*L\n30#1:86\n30#1:91\n34#1:87\n35#1:88,2\n34#1:90\n*E\n"})
public final class DailySchemaRecordParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "DailySchemaRecordParser";

    @NotNull
    private final Gson gson = new Gson();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, ParsedDailyRecord parsedDailyRecord) {
        switch (key.hashCode()) {
            case -1887893257:
                if (key.equals(DailyRecordKey.energyStatusValue)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    int iDoubleValue = (int) ((Double) value).doubleValue();
                    parsedDailyRecord.setEnergyStateValue(Integer.valueOf(((iDoubleValue & 128) <= 0 ? -1 : 1) * (iDoubleValue & 127)));
                    break;
                }
                break;
            case -1704439750:
                if (key.equals(DailyRecordKey.bloodOxygen)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setSpo2(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case -1049386187:
                if (key.equals(DailyRecordKey.activityCalories)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setCalories(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case -970436402:
                if (key.equals(DailyRecordKey.sportType)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setSportType(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case -882120550:
                if (key.equals(DailyRecordKey.energyStatus)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setEnergyState(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case -155790008:
                if (key.equals(DailyRecordKey.lightSensation)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setLightValue(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case -129778523:
                if (key.equals(DailyRecordKey.curPressure)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setStress(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 193794460:
                if (key.equals(DailyRecordKey.dumpEnergy)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setEnergy(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 200416838:
                if (key.equals("heartRate")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setHr(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 1087781062:
                if (key.equals("newCalories")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setTotalCal(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 1125687762:
                if (key.equals(DailyRecordKey.volumeMomentum)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setBodyMomentum(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 1366244711:
                if (key.equals("newSteps")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setSteps(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 1425268659:
                if (key.equals(DailyRecordKey.activeStreng)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setActivityHILevel(Integer.valueOf((int) ((Double) value).doubleValue()));
                    FitnessLogUtils.i(this.TAG, "activityHILevel:" + parsedDailyRecord.getActivityHILevel());
                    break;
                }
                break;
            case 1545206197:
                if (key.equals("newDistance")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setDistance(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 1840540207:
                if (key.equals(DailyRecordKey.heartRateRise)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setAbnormalHr(Boolean.valueOf(((int) ((Double) value).doubleValue()) > 0));
                    break;
                }
                break;
            case 1932249472:
                if (key.equals(DailyRecordKey.abnormalityHeartRate)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setHrPreAbnormal(Integer.valueOf((int) ((Double) value).doubleValue()));
                    break;
                }
                break;
            case 2043973472:
                if (key.equals(DailyRecordKey.activeType)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
                    parsedDailyRecord.setActivityType(Integer.valueOf((int) ((Double) value).doubleValue()));
                    FitnessLogUtils.i(this.TAG, "activeType:" + parsedDailyRecord.getActivityType());
                    break;
                }
                break;
        }
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.daily.BaseDailyParser
    @NotNull
    public FitnessParseResult parse$fitness_parser_release(@NotNull Map<String, ? extends Object> root, @NotNull FitnessDataId dataId) {
        Map map;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        ArrayList arrayList = new ArrayList();
        try {
            Object obj = root.get("body");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            long timeStamp = dataId.getTimeStamp();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Map map2 = (Map) this.gson.fromJson((String) it.next(), new TypeToken<Map<String, ? extends Map<String, ? extends Object>>>() { // from class: com.xiaomi.fit.fitness.parser.schema.daily.DailySchemaRecordParser$parse$1$mapType$1
                }.getType());
                ParsedDailyRecord parsedDailyRecord = new ParsedDailyRecord(timeStamp);
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        if (entry != null && (map = (Map) entry.getValue()) != null) {
                            for (Map.Entry entry2 : map.entrySet()) {
                                Object key = entry2.getKey();
                                Object value = entry2.getValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append(key);
                                sb.append(" ==================");
                                sb.append(value);
                                convertReportData((String) entry2.getKey(), entry2.getValue(), parsedDailyRecord);
                            }
                        }
                    }
                }
                arrayList.add(parsedDailyRecord);
                timeStamp += (long) 60;
            }
        } catch (Exception e) {
            String str = this.TAG;
            e.printStackTrace();
            FitnessLogUtils.e(str, "e:" + e + " , " + Unit.INSTANCE);
        }
        FitnessParseResult fitnessParseResultBuild = new FitnessParseResult.Builder().dailyDataRecord(arrayList).build();
        FitnessLogUtils.i(this.TAG, "result:" + fitnessParseResultBuild);
        return fitnessParseResultBuild;
    }
}

package com.xiaomi.fit.fitness.parser.schema.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.WeightRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/WeightParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "convertReportData", "", "key", "value", "weightRecord", "Lcom/xiaomi/fit/fitness/parser/data/WeightRecord;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeightParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/WeightParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n1863#2:48\n1863#2:49\n1864#2:52\n1864#2:53\n216#3,2:50\n*S KotlinDebug\n*F\n+ 1 WeightParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/WeightParser\n*L\n16#1:48\n17#1:49\n17#1:52\n16#1:53\n19#1:50,2\n*E\n"})
public final class WeightParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "WeightParser";

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, WeightRecord weightRecord) {
        switch (key.hashCode()) {
            case -1547065371:
                if (key.equals(DailyReportKey.musclemass)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setMuscleMass(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case -1479361005:
                if (key.equals(DailyReportKey.bonemineralcontent)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setBoneMass(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case -1076404851:
                if (key.equals(DailyReportKey.fatmass)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setFatMass(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case -791592328:
                if (key.equals("weight")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setWeight(((Integer) value).intValue() / 10.0f);
                    break;
                }
                break;
            case -524655369:
                if (key.equals(DailyReportKey.proteinmass)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setProteinMass(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case -309012605:
                if (key.equals(DailyReportKey.protein)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setProteinRate(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case -275727819:
                if (key.equals(DailyReportKey.basalmetabolicrate)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setBasalMetabolism((Integer) value);
                    break;
                }
                break;
            case 97662:
                if (key.equals("bmi")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setBmi(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case 54941239:
                if (key.equals(DailyReportKey.bodyfat)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setBodyFatRate(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case 55126294:
                if (key.equals("timestamp")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    weightRecord.setTime(((Long) value).longValue());
                    break;
                }
                break;
            case 1274626229:
                if (key.equals(DailyReportKey.bodywater)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setMoistureRate(Float.valueOf(((Integer) value).intValue() / 10.0f));
                    break;
                }
                break;
            case 1971386650:
                if (key.equals(DailyReportKey.bonesalt)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    weightRecord.setBoneSaltRate(Float.valueOf(((Integer) value).intValue() / 10.0f));
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
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>>");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            for (Map map : (List) it.next()) {
                WeightRecord weightRecord = new WeightRecord();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        convertReportData((String) entry.getKey(), entry.getValue(), weightRecord);
                    }
                }
                arrayList.add(weightRecord);
            }
        }
        FitnessParseResult fitnessParseResultBuild = new FitnessParseResult.Builder().weightRecordList(arrayList).build();
        FitnessLogUtils.d(this.TAG, "result:" + ListExtKt.toArrayList(fitnessParseResultBuild.getWeightRecordList()));
        return fitnessParseResultBuild;
    }
}

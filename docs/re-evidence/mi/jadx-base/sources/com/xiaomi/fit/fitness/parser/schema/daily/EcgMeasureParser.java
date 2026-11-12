package com.xiaomi.fit.fitness.parser.schema.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.data.EcgMeasureResult;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/EcgMeasureParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "convertReportData", "", "key", "value", "report", "Lcom/xiaomi/fit/fitness/parser/data/EcgMeasureResult;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcgMeasureParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgMeasureParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/EcgMeasureParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,62:1\n216#2:63\n216#2,2:64\n217#2:66\n*S KotlinDebug\n*F\n+ 1 EcgMeasureParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/EcgMeasureParser\n*L\n21#1:63\n25#1:64,2\n21#1:66\n*E\n"})
public final class EcgMeasureParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "EcgMeasureParser";

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertReportData(String key, Object value, EcgMeasureResult report) {
        Float floatOrNull;
        switch (key.hashCode()) {
            case -1743016407:
                if (key.equals(EcgReportKey.symptom)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setSymptomValue((Long) value);
                    break;
                }
                break;
            case 55126294:
                if (key.equals("timestamp")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    report.setStartMeasureTime(((Long) value).longValue());
                }
                break;
            case 127878503:
                if (key.equals(EcgReportKey.samplingRate)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setSampleFrequency(((Integer) value).intValue());
                    break;
                }
                break;
            case 724635061:
                if (key.equals(EcgReportKey.analyticalResult)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setAnalysisResult((Integer) value);
                    break;
                }
                break;
            case 1272470629:
                if (key.equals(EcgReportKey.dataSource)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setDataSource(((Integer) value).intValue());
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
            case 1917954797:
                if (key.equals("heartRates")) {
                    LinkedList linkedList = new LinkedList();
                    if (value instanceof ArrayList) {
                        Iterator it = ((ArrayList) value).iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof Number) {
                                linkedList.add(Float.valueOf(((Number) next).floatValue()));
                            } else if ((next instanceof String) && (floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull((String) next)) != null) {
                                linkedList.add(floatOrNull);
                            }
                        }
                    }
                    report.setSrcData(linkedList);
                    break;
                }
                break;
            case 2085097840:
                if (key.equals(EcgReportKey.measurementDuration)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    report.setMeasureDuration(((Integer) value).intValue());
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
        EcgMeasureResult ecgMeasureResult = new EcgMeasureResult(dataId.getTimeStamp(), dataId.getTzOffsetInSec());
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-------------------");
            sb.append(value);
            if (value instanceof Map) {
                for (Map.Entry entry2 : ((Map) value).entrySet()) {
                    convertReportData((String) entry2.getKey(), entry2.getValue(), ecgMeasureResult);
                }
            } else {
                convertReportData(str, value, ecgMeasureResult);
            }
        }
        return new FitnessParseResult.Builder().ecgMeasureResult(ecgMeasureResult).build();
    }
}

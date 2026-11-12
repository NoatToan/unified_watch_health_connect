package com.xiaomi.fit.fitness.parser.schema.daily;

import com.xiaomi.fit.data.common.data.sport.RecoverRateData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fit.fitness.parser.schema.BaseParser;
import com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder;
import com.xiaomi.fit.fitness.parser.schema.RecoverRateReportKey;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/SchemaRecoverRateParser;", "Lcom/xiaomi/fit/fitness/parser/schema/BaseParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "parser", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", SchemaNetUtils.SchemaDir, "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaRecoverRateParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaRecoverRateParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/SchemaRecoverRateParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,62:1\n216#2,2:63\n*S KotlinDebug\n*F\n+ 1 SchemaRecoverRateParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/SchemaRecoverRateParser\n*L\n33#1:63,2\n*E\n"})
public final class SchemaRecoverRateParser extends BaseParser {

    @NotNull
    public static final SchemaRecoverRateParser INSTANCE = new SchemaRecoverRateParser();

    @NotNull
    private static String TAG = "SchemaRecoverRateParser";

    private SchemaRecoverRateParser() {
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @NotNull
    public String getTAG() {
        return TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    @NotNull
    public FitnessParseResult parser(@NotNull FitnessBinaryData binaryData, @NotNull String schema) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        Intrinsics.checkNotNullParameter(schema, "schema");
        JsonObject schemaElement = getSchemaElement(schema);
        Intrinsics.checkNotNull(schemaElement);
        BinarySchemaDecoder binarySchemaDecoder = new BinarySchemaDecoder(schemaElement);
        binarySchemaDecoder.setBuffer(getBinaryData(binaryData));
        Map<String, Object> mapDecode = binarySchemaDecoder.decode();
        Logger.d(getTAG(), "result:" + mapDecode);
        Object obj = mapDecode.get("root");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Object obj2 = ((Map) obj).get("body");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        LinkedList linkedList = new LinkedList();
        long jLongValue = 0;
        float fIntValue = 0.0f;
        int iIntValue = 0;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            INSTANCE.getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append("-------------------");
            sb.append(value);
            if (Intrinsics.areEqual(key, "startTime")) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                jLongValue = ((Long) value).longValue();
            } else if (Intrinsics.areEqual(key, RecoverRateReportKey.restoreHeartRate)) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) value).intValue();
            } else if (Intrinsics.areEqual(key, RecoverRateReportKey.restoreRateHeartRate)) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                fIntValue = ((Integer) value).intValue() / 10.0f;
            } else if (Intrinsics.areEqual(key, RecoverRateReportKey.heartRateList) && (value instanceof ArrayList)) {
                Iterator it = ((ArrayList) value).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        Object obj3 = ((Map) next).get("heartRate");
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) obj3;
                        num.intValue();
                        linkedList.add(num);
                    }
                }
            }
        }
        FitnessLogUtils.i(getTAG(), "record size = " + linkedList.size());
        RecoverRateData recoverRateData = new RecoverRateData(jLongValue, iIntValue, fIntValue);
        recoverRateData.setRecoverRateList(linkedList);
        if (!linkedList.isEmpty()) {
            recoverRateData.setStartRate((Integer) linkedList.get(0));
            recoverRateData.setEndRate((Integer) linkedList.get(linkedList.size() - 1));
        }
        return new FitnessParseResult.Builder().recoverRateRecord(recoverRateData).build();
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TAG = str;
    }
}

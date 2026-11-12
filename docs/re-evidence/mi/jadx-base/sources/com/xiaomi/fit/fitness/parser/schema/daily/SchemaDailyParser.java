package com.xiaomi.fit.fitness.parser.schema.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fit.fitness.parser.schema.BaseParser;
import com.xiaomi.fit.fitness.parser.schema.BinarySchemaDecoder;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/SchemaDailyParser;", "Lcom/xiaomi/fit/fitness/parser/schema/BaseParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "parser", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", SchemaNetUtils.SchemaDir, "getDailyParse", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SchemaDailyParser extends BaseParser {

    @NotNull
    public static final SchemaDailyParser INSTANCE = new SchemaDailyParser();

    @NotNull
    private static String TAG = "Schema_DailyReportParser";

    private SchemaDailyParser() {
    }

    private final BaseDailyParser getDailyParse(FitnessDataId dataId) {
        BaseDailyParser manualMeasureSchemaParser;
        int dailyType = dataId.getDailyType();
        if (dailyType == 0) {
            return dataId.getFileType() == 0 ? new DailySchemaRecordParser() : new DailySchemaReportParser();
        }
        if (dailyType != 6) {
            switch (dailyType) {
                case 8:
                    manualMeasureSchemaParser = new AllDaySleepSchemaParser();
                    break;
                case 9:
                    manualMeasureSchemaParser = new AbnormalParser();
                    break;
                case 10:
                    manualMeasureSchemaParser = new WeightParser();
                    break;
                case 11:
                    manualMeasureSchemaParser = new EcgMeasureParser();
                    break;
                default:
                    manualMeasureSchemaParser = null;
                    break;
            }
        } else {
            manualMeasureSchemaParser = new ManualMeasureSchemaParser();
        }
        FitnessLogUtils.i(getTAG(), "dailyType:" + dataId.getDailyType() + " , dailyParser:" + manualMeasureSchemaParser);
        return manualMeasureSchemaParser;
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
        Intrinsics.checkNotNull(mapDecode);
        Object obj = mapDecode.get("root");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map<String, ? extends Object> map = (Map) obj;
        BaseDailyParser dailyParse = getDailyParse(binaryData.getDataId());
        FitnessParseResult fitnessParseResult = dailyParse != null ? dailyParse.parse$fitness_parser_release(map, binaryData.getDataId()) : null;
        Intrinsics.checkNotNull(fitnessParseResult);
        return fitnessParseResult;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.BaseParser
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        TAG = str;
    }
}

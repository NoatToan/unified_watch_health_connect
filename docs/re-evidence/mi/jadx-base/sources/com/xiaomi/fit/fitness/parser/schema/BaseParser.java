package com.xiaomi.fit.fitness.parser.schema;

import com.google.gson.JsonParseException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H&J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/BaseParser;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "parser", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", SchemaNetUtils.SchemaDir, "getBinaryData", "", "getDataIdArray", "data", "getSchemaElement", "Lkotlinx/serialization/json/JsonObject;", "jsonSchema", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseParser {

    @NotNull
    private String TAG = "Schema_BaseParser";

    private final byte[] getDataIdArray(FitnessBinaryData data) {
        return data.getDataId().getSportType() == 22 ? data.getDataId().toByteArray() : data.getDataId().toByteArray();
    }

    @NotNull
    public final byte[] getBinaryData(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(getDataIdArray(binaryData), new byte[]{0});
        byte[] dataValid = binaryData.getDataValid();
        Intrinsics.checkNotNull(dataValid);
        byte[] bArrPlus2 = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus, dataValid), binaryData.getBodyData());
        FitnessLogUtils.d(getTAG(), "dataId:" + binaryData.getDataId() + ",valid:" + ByteUtil.bytesToHex$default(binaryData.getDataValid(), false, 2, null) + " , binaryData:" + ByteUtil.bytesToHex$default(binaryData.getBodyData(), false, 2, null));
        FitnessLogUtils.d(getTAG(), "dataId:" + binaryData.getDataId() + ", binaryData:" + ByteUtil.bytesToHex$default(bArrPlus2, false, 2, null));
        return bArrPlus2;
    }

    @Nullable
    public final JsonObject getSchemaElement(@NotNull String jsonSchema) {
        Intrinsics.checkNotNullParameter(jsonSchema, "jsonSchema");
        try {
            return JsonElementKt.getJsonObject(Json.INSTANCE.parseToJsonElement(jsonSchema));
        } catch (JsonParseException e) {
            Logger.e(getTAG(), "report parse error:" + e);
            return null;
        } catch (Exception e2) {
            Logger.e(getTAG(), "report error:" + e2);
            return null;
        }
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @Nullable
    public abstract FitnessParseResult parser(@NotNull FitnessBinaryData binaryData, @NotNull String schema);

    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.TAG = str;
    }
}

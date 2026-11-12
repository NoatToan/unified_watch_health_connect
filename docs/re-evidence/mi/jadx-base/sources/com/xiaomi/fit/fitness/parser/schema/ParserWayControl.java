package com.xiaomi.fit.fitness.parser.schema;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.schema.utils.SchemaAssetsUtils;
import com.xiaomi.fit.fitness.parser.schema.utils.SchemaFilesUtilsKt;
import com.xiaomi.fit.fitness.parser.utils.ParserPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/ParserWayControl;", "", "<init>", "()V", "TAG", "", "getSchema", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParserWayControl {

    @NotNull
    public static final ParserWayControl INSTANCE = new ParserWayControl();

    @NotNull
    public static final String TAG = "Schema_ParserWayControl";

    private ParserWayControl() {
    }

    @Nullable
    public final String getSchema(@NotNull FitnessBinaryData binaryData) {
        String jsonBySchemaPath$fitness_parser_release;
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        FitnessLogUtils.i(TAG, "binaryData:" + binaryData.getDataId());
        ParserPreference parserPreference = ParserPreference.INSTANCE;
        if (!parserPreference.getIS_SUPPORT_SCHEMA()) {
            FitnessLogUtils.i(TAG, "parser ,  config is_support_schema:" + parserPreference.getIS_SUPPORT_SCHEMA());
            return null;
        }
        boolean zIsMd5Updated = parserPreference.getIS_USE_LOCAL_SCHEMA() ? false : parserPreference.isMd5Updated();
        FitnessLogUtils.i(TAG, "isMd5Updated:" + zIsMd5Updated + " , isUseLocalSchema:" + parserPreference.getIS_USE_LOCAL_SCHEMA());
        if (zIsMd5Updated) {
            FitnessLogUtils.i(TAG, "getSchema from files");
            jsonBySchemaPath$fitness_parser_release = SchemaFilesUtilsKt.getFileSchema(binaryData);
        } else {
            FitnessLogUtils.i(TAG, "getSchema from assets");
            jsonBySchemaPath$fitness_parser_release = SchemaAssetsUtils.INSTANCE.readJsonBySchemaPath$fitness_parser_release(binaryData);
        }
        FitnessLogUtils.i(TAG, "isMd5Updated:" + zIsMd5Updated + " , schema is null: " + (jsonBySchemaPath$fitness_parser_release == null));
        return jsonBySchemaPath$fitness_parser_release;
    }
}

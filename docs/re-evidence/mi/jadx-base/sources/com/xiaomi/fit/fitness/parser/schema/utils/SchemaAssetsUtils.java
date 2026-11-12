package com.xiaomi.fit.fitness.parser.schema.utils;

import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\b\u001a\u0004\u0018\u00010\u00052,\u0010\t\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\n\u0018\u00010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H\u0002¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J6\u0010\u0017\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\n\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/utils/SchemaAssetsUtils;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getSchemaPath", "map", "", "keys", "", "(Ljava/util/Map;[Ljava/lang/String;)Ljava/lang/String;", "readJsonFromZip", "assetManager", "Landroid/content/res/AssetManager;", "zipName", "entryPath", "readJsonBySchemaPath", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "readJsonBySchemaPath$fitness_parser_release", "parseJsonToMap", "jsonString", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SchemaAssetsUtils {

    @NotNull
    public static final SchemaAssetsUtils INSTANCE = new SchemaAssetsUtils();

    @NotNull
    private static final String TAG = "Schema_AssetsUtils";

    private SchemaAssetsUtils() {
    }

    private final String getSchemaPath(Map<String, ? extends Map<String, ? extends Map<String, String>>> map, String... keys) {
        int length = keys.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            String str = keys[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(str);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final Map<String, Map<String, Map<String, String>>> parseJsonToMap(String jsonString) {
        try {
            return (Map) new Gson().fromJson(jsonString, new TypeToken<Map<String, ? extends Map<String, ? extends Map<String, ? extends String>>>>() { // from class: com.xiaomi.fit.fitness.parser.schema.utils.SchemaAssetsUtils$parseJsonToMap$jsonMap$1
            }.getType());
        } catch (JsonSyntaxException e) {
            String str = TAG;
            e.printStackTrace();
            FitnessLogUtils.e(str, "e:" + e + " , trace:" + Unit.INSTANCE);
            return null;
        } catch (Exception e2) {
            String str2 = TAG;
            e2.printStackTrace();
            FitnessLogUtils.e(str2, "e:" + e2 + " , track:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0045 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String readJsonFromZip(android.content.res.AssetManager r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            java.io.InputStream r4 = r4.open(r5)     // Catch: java.lang.Exception -> L4c
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L45
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L45
            java.util.zip.ZipEntry r1 = r5.getNextEntry()     // Catch: java.lang.Throwable -> L24
        Le:
            if (r1 == 0) goto L2b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L24
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L24
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = kotlin.io.TextStreamsKt.readText(r6)     // Catch: java.lang.Throwable -> L24
            goto L2c
        L24:
            r6 = move-exception
            goto L3f
        L26:
            java.util.zip.ZipEntry r1 = r5.getNextEntry()     // Catch: java.lang.Throwable -> L24
            goto Le
        L2b:
            r6 = r0
        L2c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3b
            kotlin.io.CloseableKt.closeFinally(r5, r0)     // Catch: java.lang.Throwable -> L38
            kotlin.io.CloseableKt.closeFinally(r4, r0)     // Catch: java.lang.Exception -> L35
            goto L68
        L35:
            r4 = move-exception
            r0 = r6
            goto L4d
        L38:
            r5 = move-exception
            r0 = r6
            goto L46
        L3b:
            r0 = move-exception
            r2 = r0
            r0 = r6
            r6 = r2
        L3f:
            throw r6     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r6)     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L45:
            r5 = move-exception
        L46:
            throw r5     // Catch: java.lang.Throwable -> L47
        L47:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch: java.lang.Exception -> L4c
            throw r6     // Catch: java.lang.Exception -> L4c
        L4c:
            r4 = move-exception
        L4d:
            java.lang.String r5 = com.xiaomi.fit.fitness.parser.schema.utils.SchemaAssetsUtils.TAG
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "e:"
            r6.append(r1)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.xiaomi.fit.data.common.log.FitnessLogUtils.i(r5, r4)
            r6 = r0
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.parser.schema.utils.SchemaAssetsUtils.readJsonFromZip(android.content.res.AssetManager, java.lang.String, java.lang.String):java.lang.String");
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    @Nullable
    public final String readJsonBySchemaPath$fitness_parser_release(@NotNull FitnessBinaryData binaryData) {
        Map<String, Map<String, Map<String, String>>> jsonToMap;
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        AssetManager assets = AppUtil.getApp().getAssets();
        Intrinsics.checkNotNull(assets);
        String jsonFromZip = readJsonFromZip(assets, "schemas.zip", "index.json");
        if (jsonFromZip == null || (jsonToMap = parseJsonToMap(jsonFromZip)) == null) {
            return null;
        }
        Triple<String, String, String> schemaInfo = SchemaFilesUtilsKt.getSchemaInfo(binaryData);
        String schemaPath = getSchemaPath(jsonToMap, schemaInfo.getFirst(), schemaInfo.getSecond(), schemaInfo.getThird());
        if (schemaPath == null) {
            return null;
        }
        return readJsonFromZip(assets, "schemas.zip", schemaPath);
    }
}

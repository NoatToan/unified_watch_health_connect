package com.xiaomi.fit.fitness.parser.schema.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.net.SchemaNetUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001\u001a4\u0010\u0013\u001a(\u0012\u0004\u0012\u00020\u0001\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00140\u0014\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u0006\u001aO\u0010\u0015\u001a\u0004\u0018\u00010\u00012,\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0001\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00140\u0014\u0018\u00010\u00142\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0018\"\u00020\u0001¢\u0006\u0002\u0010\u0019\u001a\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0001\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"TAG", "", "getTAG", "()Ljava/lang/String;", "outputSchemaDir", "schemaFliePath", "Ljava/io/File;", "getSchemaFliePath", "()Ljava/io/File;", "getFileSchema", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "getSchemaInfo", "Lkotlin/Triple;", "extractZip", "", "filePath", "zipFileName", "outputFolderName", "readIndexJsonAsMap", "", "getSchemaPath", "map", "keys", "", "(Ljava/util/Map;[Ljava/lang/String;)Ljava/lang/String;", "readJsonFromFileDir", MediaStoreUtil.MediaInfo.RELATIVE_PATH, "fitness-parser_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SchemaFilesUtilsKt {

    @NotNull
    private static final String TAG = "Schema_FileUtils";

    @NotNull
    public static final String outputSchemaDir = "schemas";

    @NotNull
    private static final File schemaFliePath = new File(AppUtil.getApp().getFilesDir(), SchemaNetUtils.SchemaDir);

    public static final boolean extractZip(@NotNull File filePath, @NotNull String zipFileName, @NotNull String outputFolderName) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(zipFileName, "zipFileName");
        Intrinsics.checkNotNullParameter(outputFolderName, "outputFolderName");
        File file = new File(filePath, zipFileName);
        File file2 = new File(filePath, outputFolderName);
        if (!file.exists()) {
            Logger.e(TAG, "zip 文件不存在");
            return false;
        }
        if (file2.exists()) {
            FilesKt__UtilsKt.deleteRecursively(file2);
        }
        file2.mkdirs();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    File file3 = new File(file2, nextEntry.getName());
                    if (nextEntry.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        File parentFile = file3.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            ByteStreamsKt.copyTo$default(zipInputStream, fileOutputStream, 0, 2, null);
                            CloseableKt.closeFinally(fileOutputStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                CloseableKt.closeFinally(fileInputStream, null);
                return true;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(zipInputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                CloseableKt.closeFinally(fileInputStream, th5);
                throw th6;
            }
        }
    }

    @Nullable
    public static final String getFileSchema(@NotNull FitnessBinaryData binaryData) {
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        File file = schemaFliePath;
        Map<String, Map<String, Map<String, String>>> indexJsonAsMap = readIndexJsonAsMap(file);
        if (indexJsonAsMap == null) {
            return null;
        }
        Triple<String, String, String> schemaInfo = getSchemaInfo(binaryData);
        String schemaPath = getSchemaPath(indexJsonAsMap, schemaInfo.getFirst(), schemaInfo.getSecond(), schemaInfo.getThird());
        FitnessLogUtils.i(TAG, "path:" + schemaPath);
        String jsonFromFileDir = readJsonFromFileDir(file, "schemas/" + schemaPath);
        if (jsonFromFileDir == null) {
            return null;
        }
        return jsonFromFileDir;
    }

    @NotNull
    public static final File getSchemaFliePath() {
        return schemaFliePath;
    }

    @NotNull
    public static final Triple<String, String, String> getSchemaInfo(@NotNull FitnessBinaryData binaryData) {
        String str;
        Intrinsics.checkNotNullParameter(binaryData, "binaryData");
        String str2 = "v" + binaryData.getDataId().getVersion();
        String str3 = "";
        new Triple("", "", "");
        int fileType = binaryData.getDataId().getFileType();
        if (fileType == 0) {
            str = "record";
        } else if (fileType != 1) {
            str = fileType != 2 ? "hrr" : "gps";
        } else {
            str = "report";
        }
        if (binaryData.getDataId().getDataType() == 1) {
            switch (binaryData.getDataId().getSportType()) {
                case 3:
                    str3 = "indoor_running";
                    break;
                case 7:
                    str3 = "indoor_cycling";
                    break;
                case 8:
                    str3 = "free_training";
                    break;
                case 9:
                case 10:
                    str3 = "swimming";
                    break;
                case 11:
                    str3 = "elliptical_training";
                    break;
                case 12:
                    str3 = "yoga";
                    break;
                case 13:
                    str3 = "rowing_workout";
                    break;
                case 14:
                    str3 = "rope_skipping";
                    break;
                case 16:
                    str3 = "hiit";
                    break;
                case 17:
                    str3 = "triathlon";
                    break;
                case 18:
                    str3 = "ball_games";
                    break;
                case 19:
                    str3 = "basketball";
                    break;
                case 20:
                    str3 = "golf";
                    break;
                case 21:
                    str3 = "skiing";
                    break;
                case 22:
                    str3 = "outdoor_foot";
                    break;
                case 23:
                    str3 = "outdoor_non_foot";
                    break;
                case 24:
                    str3 = "climbing";
                    break;
                case 25:
                    str3 = "diving";
                    break;
            }
        } else if (binaryData.getDataId().getDataType() == 0) {
            int dailyType = binaryData.getDataId().getDailyType();
            if (dailyType == 0) {
                str3 = "daily_activity";
            } else if (dailyType != 6) {
                switch (dailyType) {
                    case 8:
                        str3 = "full_day_sleep";
                        break;
                    case 9:
                        str3 = "abnormal";
                        break;
                    case 10:
                        str3 = "weight_fat";
                        break;
                    case 11:
                        str3 = "ecg";
                        break;
                    case 12:
                        str3 = "temperature";
                        break;
                }
            } else {
                str3 = "manual_measurement";
            }
        }
        FitnessLogUtils.i(TAG, "dataType:" + str3 + " , fileType:" + str + " , version:" + str2);
        return new Triple<>(str3, str, str2);
    }

    @Nullable
    public static final String getSchemaPath(@Nullable Map<String, ? extends Map<String, ? extends Map<String, String>>> map, @NotNull String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
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

    @NotNull
    public static final String getTAG() {
        return TAG;
    }

    @Nullable
    public static final Map<String, Map<String, Map<String, String>>> readIndexJsonAsMap(@NotNull File filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath, "schemas/index.json");
        if (!file.exists()) {
            FitnessLogUtils.e(TAG, "index.json  unknown");
            return null;
        }
        try {
            return (Map) new Gson().fromJson(FilesKt__FileReadWriteKt.readText(file, Charsets.UTF_8), new TypeToken<Map<String, ? extends Map<String, ? extends Map<String, ? extends String>>>>() { // from class: com.xiaomi.fit.fitness.parser.schema.utils.SchemaFilesUtilsKt$readIndexJsonAsMap$jsonMap$1
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

    @Nullable
    public static final String readJsonFromFileDir(@NotNull File filePath, @NotNull String relativePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        String text$default = null;
        try {
            File file = new File(filePath, relativePath);
            if (file.exists()) {
                text$default = FilesKt__FileReadWriteKt.readText$default(file, null, 1, null);
            } else {
                Logger.e(TAG, "文件不存在: " + relativePath);
            }
        } catch (Exception e) {
            Logger.e(TAG, "读取文件失败: " + relativePath, e);
        }
        return text$default;
    }
}

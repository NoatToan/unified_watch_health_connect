package com.huami.rawdata_uploader.ext;

import android.content.Context;
import android.text.TextUtils;
import com.huami.rawdata_uploader.file.RawDataFileManager;
import com.huami.rawdata_uploader.vo.BLOOD_PRESSURE_CHARACTERISTIC;
import com.huami.rawdata_uploader.vo.BLOOD_PRESSURE_CORRECT_PPG;
import com.huami.rawdata_uploader.vo.BLOOD_PRESSURE_MEASURE_PPG;
import com.huami.rawdata_uploader.vo.IRawDataType;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a \u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000\u001a,\u0010\u000e\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\"\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\"\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a*\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "uid", "", "generateTime", "Ljava/io/File;", "getBPRealFile", "subDir", "fileName", "getBPRealPath", "Lcom/huami/rawdata_uploader/file/RawDataFileManager;", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "rawDataType", "getZipPathByType", "getBPCharacterFile", "getBPCorrectFile", "getFileByDataType", "a", "rawdata-uploader_release"}, k = 2, mv = {1, 5, 1})
public final class FileManagerExKt {
    private static final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "1_";
        }
        return str + "_";
    }

    @Nullable
    public static final File getBPCharacterFile(@NotNull Context context, @NotNull String str, long j) {
        return getFileByDataType(context, str, j, BLOOD_PRESSURE_CHARACTERISTIC.INSTANCE);
    }

    @Nullable
    public static final File getBPCorrectFile(@NotNull Context context, @NotNull String str, long j) {
        return getFileByDataType(context, str, j, BLOOD_PRESSURE_CORRECT_PPG.INSTANCE);
    }

    @Nullable
    public static final File getBPRealFile(@NotNull Context context, @NotNull String str, long j) {
        return getFileByDataType(context, str, j, BLOOD_PRESSURE_MEASURE_PPG.INSTANCE);
    }

    @NotNull
    public static final File getBPRealPath(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return getZipPathByType(RawDataFileManager.INSTANCE, context, str, str2, BLOOD_PRESSURE_MEASURE_PPG.INSTANCE);
    }

    @Nullable
    public static final File getFileByDataType(@NotNull Context context, @NotNull String str, long j, @NotNull IRawDataType iRawDataType) {
        return RawDataFileManager.INSTANCE.getRawDataPath(context, str, iRawDataType.getValueStr(), iRawDataType.getFileNamePrefix() + "_" + a(str) + j + ".txt");
    }

    @NotNull
    public static final File getZipPathByType(@NotNull RawDataFileManager rawDataFileManager, @NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull IRawDataType iRawDataType) {
        return rawDataFileManager.getDir(new File(context.getFilesDir(), iRawDataType.getValueStr()), str, str2);
    }
}

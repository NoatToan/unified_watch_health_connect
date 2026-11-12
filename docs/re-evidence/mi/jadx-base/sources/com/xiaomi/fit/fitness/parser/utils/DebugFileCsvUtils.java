package com.xiaomi.fit.fitness.parser.utils;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/utils/DebugFileCsvUtils;", "", "<init>", "()V", "TAG", "", "SPLIT", "getSPLIT", "()Ljava/lang/String;", "writeCSV", "", "file", "Ljava/io/File;", MiuiCursorConstants.CONTENT, "append", "getTheCsvStorageFile", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", DailyRecordKey.sportType, "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DebugFileCsvUtils {

    @NotNull
    public static final DebugFileCsvUtils INSTANCE = new DebugFileCsvUtils();

    @NotNull
    private static final String SPLIT = ",";

    @NotNull
    public static final String TAG = "CsvUtils";

    private DebugFileCsvUtils() {
    }

    public static /* synthetic */ File getTheCsvStorageFile$default(DebugFileCsvUtils debugFileCsvUtils, FitnessDataId fitnessDataId, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return debugFileCsvUtils.getTheCsvStorageFile(fitnessDataId, i);
    }

    @NotNull
    public final String getSPLIT() {
        return SPLIT;
    }

    @NotNull
    public final File getTheCsvStorageFile(@NotNull FitnessDataId dataId, int sportType) {
        String string;
        String str;
        StringBuilder sb;
        String str2;
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        String dateStr = FitnessDateUtils.getDateStr(dataId.getTimeStamp());
        if (dataId.getDataType() == 0) {
            str = "daily";
            if (dataId.getDailyType() == 0) {
                if (dataId.getFileType() == 0) {
                    sb = new StringBuilder();
                    sb.append(dateStr);
                    str2 = "_daily_record";
                } else {
                    sb = new StringBuilder();
                    sb.append(dateStr);
                    str2 = "_daily_report";
                }
                sb.append(str2);
                string = sb.toString();
            } else {
                string = dateStr + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + dataId.getDailyType();
            }
        } else {
            int fileType = dataId.getFileType();
            if (fileType == 0) {
                string = dateStr + "_sport_" + dataId.getSportType() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + sportType + "_record";
                str = "sport/record";
            } else if (fileType != 2) {
                string = dateStr + "_sport_" + dataId.getSportType();
                str = "sport/report";
            } else {
                string = dateStr + "_sport_" + dataId.getSportType() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + sportType + "_gps";
                str = "sport/gps";
            }
        }
        File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir(null), "/fitness/csv/" + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, string + "_v" + dataId.getVersion() + ".csv");
        if (file2.exists()) {
            file2.delete();
        }
        return file2;
    }

    public final boolean writeCSV(@NotNull File file, @NotNull String content, boolean append) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, append);
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            FitnessLogUtils.e(TAG, "writeCSV " + e.getMessage());
            return false;
        } catch (IOException e2) {
            FitnessLogUtils.e(TAG, "writeCSV" + e2.getMessage());
            return false;
        }
    }
}

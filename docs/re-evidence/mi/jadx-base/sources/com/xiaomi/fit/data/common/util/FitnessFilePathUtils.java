package com.xiaomi.fit.data.common.util;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003!\"#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0017\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J \u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessFilePathUtils;", "", "<init>", "()V", "TAG", "", "FILE_NAME_SEPARATOR", "parseFitnessFileName", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataType", "", "fileName", "parseFileType", "fileTypeStr", "(Ljava/lang/String;)Ljava/lang/Integer;", "getDailyFiles", "", "Ljava/io/File;", "baseFile", "getSportFilePath", "getAllDataFile", "addInListIfNeed", "", "fileList", "", "file", "getDataIdFilePath", "dataId", "getDataIdFilePathIgnoreVersion", "getDataIdFileDir", "getDataIdFileName", "fitnessDataId", "getDataIdFileNameWithoutVersion", "DataTypeConstant", "FileTypeConstant", "TimeZoneConstant", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessFilePathUtils {

    @NotNull
    private static final String FILE_NAME_SEPARATOR = "_";

    @NotNull
    public static final FitnessFilePathUtils INSTANCE = new FitnessFilePathUtils();

    @NotNull
    private static final String TAG = "FitnessFilePathUtils";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessFilePathUtils$DataTypeConstant;", "", "<init>", "()V", "DAILY", "", ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT, "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DataTypeConstant {

        @NotNull
        public static final String DAILY = "daily";

        @NotNull
        public static final DataTypeConstant INSTANCE = new DataTypeConstant();

        @NotNull
        public static final String SPORT = "sport";

        private DataTypeConstant() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessFilePathUtils$FileTypeConstant;", "", "<init>", "()V", "RECORD", "", "REPORT", "GPS", "RECOVER_RATE", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FileTypeConstant {

        @NotNull
        public static final String GPS = "gps";

        @NotNull
        public static final FileTypeConstant INSTANCE = new FileTypeConstant();

        @NotNull
        public static final String RECORD = "record";

        @NotNull
        public static final String RECOVER_RATE = "recover";

        @NotNull
        public static final String REPORT = "report";

        private FileTypeConstant() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessFilePathUtils$TimeZoneConstant;", "", "<init>", "()V", "NEGATIVE", "", "POSITIVE", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimeZoneConstant {

        @NotNull
        public static final TimeZoneConstant INSTANCE = new TimeZoneConstant();

        @NotNull
        public static final String NEGATIVE = "n";

        @NotNull
        public static final String POSITIVE = "p";

        private TimeZoneConstant() {
        }
    }

    private FitnessFilePathUtils() {
    }

    private final void addInListIfNeed(List<File> fileList, File file) {
        if (file == null || !file.isFile()) {
            return;
        }
        if (file.canRead()) {
            fileList.add(file);
            return;
        }
        FitnessLogUtils.w(TAG, "can not read: " + file.getAbsolutePath());
    }

    private final List<File> getAllDataFile(File baseFile) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        if (!baseFile.exists() || !baseFile.isDirectory() || (fileArrListFiles = baseFile.listFiles()) == null) {
            return arrayList;
        }
        for (File file : fileArrListFiles) {
            if (!file.isDirectory() || file.listFiles() == null) {
                addInListIfNeed(arrayList, file);
            } else {
                Iterator it = ArrayIteratorKt.iterator(file.listFiles());
                while (it.hasNext()) {
                    addInListIfNeed(arrayList, (File) it.next());
                }
            }
        }
        return arrayList;
    }

    private final String getDataIdFileDir(FitnessDataId dataId) {
        String strValueOf;
        int tzIn15Min = dataId.getTzIn15Min();
        String str = tzIn15Min < 0 ? "n" : TimeZoneConstant.POSITIVE;
        String str2 = str + Math.abs(tzIn15Min);
        int dataType = dataId.getDataType();
        if (dataType != 0) {
            strValueOf = dataType != 1 ? String.valueOf(dataId.getDataType()) : "sport";
        } else {
            strValueOf = "daily";
        }
        return strValueOf + "/" + str2;
    }

    private final String getDataIdFileName(FitnessDataId fitnessDataId) {
        return getDataIdFileNameWithoutVersion(fitnessDataId) + "_v" + fitnessDataId.getVersion();
    }

    private final String getDataIdFileNameWithoutVersion(FitnessDataId dataId) {
        String strValueOf;
        int dailyType = dataId.getDataType() == 0 ? dataId.getDailyType() : dataId.getSportType();
        int fileType = dataId.getFileType();
        if (fileType == 0) {
            strValueOf = "record";
        } else if (fileType == 1) {
            strValueOf = "report";
        } else if (fileType != 2) {
            strValueOf = fileType != 3 ? String.valueOf(dataId.getFileType()) : FileTypeConstant.RECOVER_RATE;
        } else {
            strValueOf = "gps";
        }
        return dataId.getTimeStamp() + "_" + dailyType + "_" + strValueOf;
    }

    private final Integer parseFileType(String fileTypeStr) {
        int iHashCode = fileTypeStr.hashCode();
        if (iHashCode != -934908847) {
            if (iHashCode != -934521548) {
                if (iHashCode == 102570 && fileTypeStr.equals("gps")) {
                    return 2;
                }
            } else if (fileTypeStr.equals("report")) {
                return 1;
            }
        } else if (fileTypeStr.equals("record")) {
            return 0;
        }
        return null;
    }

    @NotNull
    public final List<File> getDailyFiles(@NotNull File baseFile) {
        Intrinsics.checkNotNullParameter(baseFile, "baseFile");
        return getAllDataFile(new File(baseFile, "daily"));
    }

    @NotNull
    public final String getDataIdFilePath(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return getDataIdFileDir(dataId) + "/" + getDataIdFileName(dataId);
    }

    @NotNull
    public final String getDataIdFilePathIgnoreVersion(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return getDataIdFileDir(dataId) + "/" + getDataIdFileNameWithoutVersion(dataId);
    }

    @NotNull
    public final List<File> getSportFilePath(@NotNull File baseFile) {
        Intrinsics.checkNotNullParameter(baseFile, "baseFile");
        return getAllDataFile(new File(baseFile, "sport"));
    }

    @Nullable
    public final FitnessDataId parseFitnessFileName(int dataType, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) fileName, new String[]{"_"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() < 3) {
            return null;
        }
        Integer fileType = parseFileType((String) listSplit$default.get(2));
        if (fileType != null) {
            FitnessDataId.Builder builderFileType = new FitnessDataId.Builder().timeStampInSec(Long.parseLong((String) listSplit$default.get(0))).fileType(fileType.intValue());
            if (dataType == 0) {
                builderFileType.dailyType(Integer.parseInt((String) listSplit$default.get(1)));
            } else {
                builderFileType.sportType(Integer.parseInt((String) listSplit$default.get(1)));
            }
            return builderFileType.build();
        }
        FitnessLogUtils.w(TAG, "no support file type = " + listSplit$default + "[2]");
        return null;
    }
}

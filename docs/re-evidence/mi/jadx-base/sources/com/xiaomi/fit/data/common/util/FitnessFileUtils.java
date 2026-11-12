package com.xiaomi.fit.data.common.util;

import android.content.Context;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010 \u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessFileUtils;", "", "<init>", "()V", "TAG", "", "FITNESS_BASE_PATH", "writeFile", "", "file", "Ljava/io/File;", "data", "", "deleteFile", "readFile", "getFDSDataFile", "context", "Landroid/content/Context;", "did", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getRouteFDSDataFile", "dir", "name", "getCacheDataFile", "getFitnessFileBasePath", "subPath", "isFdsStoreFile", "getDeviceDataFile", "getDailyFileList", "", "getSportFileList", "parseFileNameToDataId", "dataType", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessFileUtils {

    @NotNull
    private static final String FITNESS_BASE_PATH = "fitness";

    @NotNull
    public static final FitnessFileUtils INSTANCE = new FitnessFileUtils();

    @NotNull
    private static final String TAG = "FitnessFileUtils";

    private FitnessFileUtils() {
    }

    @JvmStatic
    @NotNull
    public static final File getCacheDataFile(@NotNull Context context, @NotNull String did, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new File(context.getExternalCacheDir(), INSTANCE.getFitnessFileBasePath(did, FitnessFilePathUtils.INSTANCE.getDataIdFilePath(dataId)));
    }

    @JvmStatic
    @NotNull
    public static final File getDeviceDataFile(@NotNull Context context, @NotNull String did) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        return new File(context.getExternalFilesDir(null), INSTANCE.getFitnessFileBasePath(did, ""));
    }

    @JvmStatic
    @NotNull
    public static final File getFDSDataFile(@NotNull Context context, @NotNull String did, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new File(context.getFilesDir(), INSTANCE.getFitnessFileBasePath(did, FitnessFilePathUtils.INSTANCE.getDataIdFilePathIgnoreVersion(dataId)));
    }

    private final String getFitnessFileBasePath(String did, String subPath) {
        return "fitness/d" + did + "/" + subPath;
    }

    @JvmStatic
    @NotNull
    public static final File getRouteFDSDataFile(@NotNull Context context, @NotNull String dir, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(name, "name");
        return new File(context.getFilesDir(), INSTANCE.getFitnessFileBasePath(dir, name));
    }

    @JvmStatic
    public static final boolean writeFile(@NotNull File file, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(data, "data");
        INSTANCE.deleteFile(file);
        boolean zWriteFile = FileUtils.INSTANCE.writeFile(file, new ByteArrayInputStream(data));
        FitnessLogUtils.i(TAG, "saveAsFile: " + zWriteFile);
        return zWriteFile;
    }

    public final boolean deleteFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    @NotNull
    public final List<File> getDailyFileList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File parentFile = getDeviceDataFile(context, "did").getParentFile();
        LinkedList linkedList = new LinkedList();
        if ((parentFile != null ? parentFile.listFiles() : null) == null) {
            return linkedList;
        }
        Iterator it = ArrayIteratorKt.iterator(parentFile.listFiles());
        while (it.hasNext()) {
            File file = (File) it.next();
            FitnessFilePathUtils fitnessFilePathUtils = FitnessFilePathUtils.INSTANCE;
            Intrinsics.checkNotNull(file);
            linkedList.addAll(fitnessFilePathUtils.getDailyFiles(file));
        }
        return linkedList;
    }

    @NotNull
    public final List<File> getSportFileList(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File parentFile = getDeviceDataFile(context, "did").getParentFile();
        LinkedList linkedList = new LinkedList();
        if ((parentFile != null ? parentFile.list() : null) == null) {
            return linkedList;
        }
        Iterator it = ArrayIteratorKt.iterator(parentFile.listFiles());
        while (it.hasNext()) {
            File file = (File) it.next();
            FitnessFilePathUtils fitnessFilePathUtils = FitnessFilePathUtils.INSTANCE;
            Intrinsics.checkNotNull(file);
            linkedList.addAll(fitnessFilePathUtils.getSportFilePath(file));
        }
        return linkedList;
    }

    public final boolean isFdsStoreFile(@NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        int dataType = dataId.getDataType();
        if (dataType != 0) {
            if (dataType != 1 || dataId.getFileType() == 1) {
                return false;
            }
        } else if (dataId.getDailyType() != 31 || dataId.getFileType() != 0) {
            return false;
        }
        return true;
    }

    @Nullable
    public final FitnessDataId parseFileNameToDataId(int dataType, @NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        FitnessFilePathUtils fitnessFilePathUtils = FitnessFilePathUtils.INSTANCE;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return fitnessFilePathUtils.parseFitnessFileName(dataType, name);
    }

    @Nullable
    public final byte[] readFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            FitnessLogUtils.w(TAG, "file not exist");
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                randomAccessFile.readFully(bArr);
                CloseableKt.closeFinally(randomAccessFile, null);
                return bArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(randomAccessFile, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            FitnessLogUtils.e(TAG, "readFitnessFile", e);
            return null;
        }
    }
}

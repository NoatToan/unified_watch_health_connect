package com.xiaomi.fitness.motion.recognition.pressure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/pressure/PressureFileUtils;", "", "<init>", "()V", "syncHelper", "Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSyncHelper;", "getSyncHelper", "()Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSyncHelper;", "setSyncHelper", "(Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSyncHelper;)V", "savePressuresToFile", "", "context", "Landroid/content/Context;", "type", "endTime", "", "segment", "Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;", "uploadPressureFile", "", "fileName", "deletePressureFile", "readPressureFile", "generateFileName", "endTimeInMs", "getPressureFolderPath", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PressureFileUtils {

    @NotNull
    public static final PressureFileUtils INSTANCE = new PressureFileUtils();

    @SuppressLint({"StaticFieldLeak"})
    public static PressureSyncHelper syncHelper;

    private PressureFileUtils() {
    }

    @JvmStatic
    public static final void deletePressureFile(@NotNull Context context, @Nullable String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        PressureFileUtils pressureFileUtils = INSTANCE;
        File file = new File(pressureFileUtils.getPressureFolderPath(context) + File.separator + fileName);
        if (file.exists()) {
            file.delete();
        }
        PressureSyncHelper syncHelper2 = pressureFileUtils.getSyncHelper();
        Intrinsics.checkNotNull(fileName);
        syncHelper2.cancelUpload(fileName);
    }

    private final String generateFileName(Context context, String type, long endTimeInMs) {
        return "";
    }

    @JvmStatic
    @Nullable
    public static final PressureSegment readPressureFile(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(INSTANCE.getPressureFolderPath(context) + File.separator + fileName);
        if (!file.exists()) {
            return null;
        }
        return new PressureSegmentCoder().fromWire(new BufferedInputStream(new FileInputStream(file)));
    }

    @NotNull
    public final String getPressureFolderPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = FileUtils.getFilesPath(context) + File.separator + "air_pressure";
        FileUtils.createFolder(str);
        return str;
    }

    @NotNull
    public final PressureSyncHelper getSyncHelper() {
        PressureSyncHelper pressureSyncHelper = syncHelper;
        if (pressureSyncHelper != null) {
            return pressureSyncHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("syncHelper");
        return null;
    }

    @Nullable
    public final String savePressuresToFile(@NotNull Context context, @NotNull String type, long endTime, @NotNull PressureSegment segment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(segment, "segment");
        String strGenerateFileName = generateFileName(context, type, endTime);
        if (new PressureSegmentCoder().toWire(new File(getPressureFolderPath(context) + File.separator + strGenerateFileName), segment)) {
            return strGenerateFileName;
        }
        return null;
    }

    public final void setSyncHelper(@NotNull PressureSyncHelper pressureSyncHelper) {
        Intrinsics.checkNotNullParameter(pressureSyncHelper, "<set-?>");
        syncHelper = pressureSyncHelper;
    }

    public final void uploadPressureFile(@NotNull Context context, @Nullable String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        if (new File(getPressureFolderPath(context) + File.separator + fileName).exists()) {
            PressureSyncHelper syncHelper2 = getSyncHelper();
            Intrinsics.checkNotNull(fileName);
            syncHelper2.asyncUpload(fileName);
        }
    }
}

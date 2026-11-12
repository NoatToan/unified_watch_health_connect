package com.xiaomi.fitness.migration.exercise.transformation;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/migration/exercise/transformation/PressureFileUtils;", "", "<init>", "()V", "deletePressureFile", "", "context", "Landroid/content/Context;", "fileName", "", "readPressureFile", "Lcom/xiaomi/fitness/migration/exercise/transformation/PressureSegment;", "getPressureFolderPath", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PressureFileUtils {

    @NotNull
    public static final PressureFileUtils INSTANCE = new PressureFileUtils();

    private PressureFileUtils() {
    }

    @JvmStatic
    public static final void deletePressureFile(@NotNull Context context, @Nullable String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        File file = new File(INSTANCE.getPressureFolderPath(context) + File.separator + fileName);
        if (file.exists()) {
            file.delete();
        }
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
}

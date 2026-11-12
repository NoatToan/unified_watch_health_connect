package com.xiaomi.fitness.main.utils;

import android.content.Context;
import android.os.Build;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.common.utils.RomUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/main/utils/ActivityRecognitionPermissionUtil;", "", "<init>", "()V", "TAG", "", "TIME_24", "", "ANDROID_V", "", "DAY_COUNT_LIMITED", "isHyperOSNAndroidV", "", "context", "Landroid/content/Context;", "checkPermissionDialogEnable", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityRecognitionPermissionUtil {
    private static final int ANDROID_V = 35;
    private static final int DAY_COUNT_LIMITED = 2;

    @NotNull
    public static final ActivityRecognitionPermissionUtil INSTANCE = new ActivityRecognitionPermissionUtil();

    @NotNull
    public static final String TAG = "ActivityRecognitionPermissionUtil";
    private static final long TIME_24 = 86400000;

    private ActivityRecognitionPermissionUtil() {
    }

    public final boolean checkPermissionDialogEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long jCurrentTimeMillis = System.currentTimeMillis();
        FitnessDataPreference fitnessDataPreference = FitnessDataPreference.INSTANCE;
        if (jCurrentTimeMillis - fitnessDataPreference.getLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME() > 86400000) {
            fitnessDataPreference.setACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY(1);
            fitnessDataPreference.setLAST_ACTIVITY_RECOGNITION_PERMISSION_TIME(System.currentTimeMillis());
            return false;
        }
        if (fitnessDataPreference.getACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY() >= 2) {
            return true;
        }
        fitnessDataPreference.setACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY(fitnessDataPreference.getACTIVITY_RECOGNITION_PERMISSION_TIMES_TODAY() + 1);
        return false;
    }

    public final boolean isHyperOSNAndroidV(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RomUtils.isHyperOS(context) && Build.VERSION.SDK_INT >= 35;
    }
}

package com.xiaomi.fitness.sport_capture.manager;

import android.app.Activity;
import android.text.TextUtils;
import com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/manager/SportCaptureManager;", "Lcom/xiaomi/fitness/camera/sport_capture_export/ISportCaptureManager;", "<init>", "()V", "launchCapture", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "isProjecting", "", "isSportCaptureDeviceId", "deviceId", "", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportCaptureManager implements ISportCaptureManager {
    @Override // com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager
    public boolean isProjecting() {
        return SportCapturePreference.INSTANCE.isAppProjecting();
    }

    @Override // com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager
    public boolean isSportCaptureDeviceId(@NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return TextUtils.equals(deviceId, "app");
    }

    @Override // com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager
    public void launchCapture(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager
    public boolean useNativeCamera() {
        return ISportCaptureManager.DefaultImpls.useNativeCamera(this);
    }
}

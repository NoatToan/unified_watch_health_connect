package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class CameraThreadConfig {
    @NonNull
    public static CameraThreadConfig create(@NonNull Executor cameraExecutor, @NonNull Handler schedulerHandler) {
        return new AutoValue_CameraThreadConfig(cameraExecutor, schedulerHandler);
    }

    @NonNull
    public abstract Executor getCameraExecutor();

    @NonNull
    public abstract Handler getSchedulerHandler();
}

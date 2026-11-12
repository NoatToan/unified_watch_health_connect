package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.i;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CameraThreadConfig extends CameraThreadConfig {
    private final Executor cameraExecutor;
    private final Handler schedulerHandler;

    public AutoValue_CameraThreadConfig(Executor cameraExecutor, Handler schedulerHandler) {
        Objects.requireNonNull(cameraExecutor, "Null cameraExecutor");
        this.cameraExecutor = cameraExecutor;
        Objects.requireNonNull(schedulerHandler, "Null schedulerHandler");
        this.schedulerHandler = schedulerHandler;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) o;
        return this.cameraExecutor.equals(cameraThreadConfig.getCameraExecutor()) && this.schedulerHandler.equals(cameraThreadConfig.getSchedulerHandler());
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    @NonNull
    public Executor getCameraExecutor() {
        return this.cameraExecutor;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    @NonNull
    public Handler getSchedulerHandler() {
        return this.schedulerHandler;
    }

    public int hashCode() {
        return ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003) ^ this.schedulerHandler.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.cameraExecutor + ", schedulerHandler=" + this.schedulerHandler + i.d;
    }
}

package androidx.camera.core.impl;

import android.content.Context;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.InitializationException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface CameraDeviceSurfaceManager {

    public interface Provider {
        @NonNull
        CameraDeviceSurfaceManager newInstance(@NonNull Context context, @Nullable Object cameraManager, @NonNull Set<String> availableCameraIds) throws InitializationException;
    }

    boolean checkSupported(String cameraId, List<SurfaceConfig> surfaceConfigList);

    @NonNull
    Map<UseCaseConfig<?>, Size> getSuggestedResolutions(@NonNull String cameraId, @NonNull List<SurfaceConfig> existingSurfaces, @NonNull List<UseCaseConfig<?>> newUseCaseConfigs);

    SurfaceConfig transformSurfaceConfig(String cameraId, int imageFormat, Size size);
}

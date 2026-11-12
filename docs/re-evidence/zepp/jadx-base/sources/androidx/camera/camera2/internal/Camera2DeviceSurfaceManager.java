package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {
    private static final String TAG = "Camera2DeviceSurfaceManager";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final Map<String, SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2DeviceSurfaceManager(@NonNull Context context, @Nullable Object cameraManager, @NonNull Set<String> availableCameraIds) throws CameraUnavailableException {
        this(context, new CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.w
            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public final boolean hasProfile(int i, int i2) {
                return CamcorderProfile.hasProfile(i, i2);
            }
        }, cameraManager, availableCameraIds);
    }

    private void init(@NonNull Context context, @NonNull CameraManagerCompat cameraManager, @NonNull Set<String> availableCameraIds) throws CameraUnavailableException {
        Preconditions.checkNotNull(context);
        for (String str : availableCameraIds) {
            this.mCameraSupportedSurfaceCombinationMap.put(str, new SupportedSurfaceCombination(context, str, cameraManager, this.mCamcorderProfileHelper));
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public boolean checkSupported(@NonNull String cameraId, @Nullable List<SurfaceConfig> surfaceConfigList) {
        if (surfaceConfigList == null || surfaceConfigList.isEmpty()) {
            return true;
        }
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(cameraId);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.checkSupported(surfaceConfigList);
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @NonNull
    public Map<UseCaseConfig<?>, Size> getSuggestedResolutions(@NonNull String cameraId, @NonNull List<SurfaceConfig> existingSurfaces, @NonNull List<UseCaseConfig<?>> newUseCaseConfigs) {
        Preconditions.checkArgument(!newUseCaseConfigs.isEmpty(), "No new use cases to be bound.");
        ArrayList arrayList = new ArrayList(existingSurfaces);
        Iterator<UseCaseConfig<?>> it2 = newUseCaseConfigs.iterator();
        while (it2.hasNext()) {
            arrayList.add(transformSurfaceConfig(cameraId, it2.next().getInputFormat(), new Size(640, 480)));
        }
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(cameraId);
        if (supportedSurfaceCombination == null) {
            throw new IllegalArgumentException("No such camera id in supported combination list: " + cameraId);
        }
        if (supportedSurfaceCombination.checkSupported(arrayList)) {
            return supportedSurfaceCombination.getSuggestedResolutions(existingSurfaces, newUseCaseConfigs);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + cameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + existingSurfaces + " New configs: " + newUseCaseConfigs);
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    @Nullable
    public SurfaceConfig transformSurfaceConfig(@NonNull String cameraId, int imageFormat, @NonNull Size size) {
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(cameraId);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.transformSurfaceConfig(imageFormat, size);
        }
        return null;
    }

    public Camera2DeviceSurfaceManager(@NonNull Context context, @NonNull CamcorderProfileHelper camcorderProfileHelper, @Nullable Object cameraManager, @NonNull Set<String> availableCameraIds) throws CameraUnavailableException {
        this.mCameraSupportedSurfaceCombinationMap = new HashMap();
        Preconditions.checkNotNull(camcorderProfileHelper);
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        init(context, cameraManager instanceof CameraManagerCompat ? (CameraManagerCompat) cameraManager : CameraManagerCompat.from(context), availableCameraIds);
    }
}

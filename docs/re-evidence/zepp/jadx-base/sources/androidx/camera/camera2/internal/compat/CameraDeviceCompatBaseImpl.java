package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class CameraDeviceCompatBaseImpl implements CameraDeviceCompat.CameraDeviceCompatImpl {
    public final CameraDevice mCameraDevice;
    public final Object mImplParams;

    public static class CameraDeviceCompatParamsApi21 {
        public final Handler mCompatHandler;

        public CameraDeviceCompatParamsApi21(@NonNull Handler compatHandler) {
            this.mCompatHandler = compatHandler;
        }
    }

    public CameraDeviceCompatBaseImpl(@NonNull CameraDevice cameraDevice, @Nullable Object implParams) {
        this.mCameraDevice = (CameraDevice) Preconditions.checkNotNull(cameraDevice);
        this.mImplParams = implParams;
    }

    private static void checkPhysicalCameraIdValid(CameraDevice device, @NonNull List<OutputConfigurationCompat> outputConfigs) {
        String id = device.getId();
        Iterator<OutputConfigurationCompat> it2 = outputConfigs.iterator();
        while (it2.hasNext()) {
            String physicalCameraId = it2.next().getPhysicalCameraId();
            if (physicalCameraId != null && !physicalCameraId.isEmpty()) {
                Logger.w("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + physicalCameraId + ". Ignoring.");
            }
        }
    }

    public static void checkPreconditions(CameraDevice device, SessionConfigurationCompat config) {
        Preconditions.checkNotNull(device);
        Preconditions.checkNotNull(config);
        Preconditions.checkNotNull(config.getStateCallback());
        List<OutputConfigurationCompat> outputConfigurations = config.getOutputConfigurations();
        if (outputConfigurations == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (config.getExecutor() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        checkPhysicalCameraIdValid(device, outputConfigurations);
    }

    public static CameraDeviceCompatBaseImpl create(@NonNull CameraDevice cameraDevice, @NonNull Handler compatHandler) {
        return new CameraDeviceCompatBaseImpl(cameraDevice, new CameraDeviceCompatParamsApi21(compatHandler));
    }

    public static List<Surface> unpackSurfaces(@NonNull List<OutputConfigurationCompat> outputConfigs) {
        ArrayList arrayList = new ArrayList(outputConfigs.size());
        Iterator<OutputConfigurationCompat> it2 = outputConfigs.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getSurface());
        }
        return arrayList;
    }

    public void createBaseCaptureSession(@NonNull CameraDevice device, @NonNull List<Surface> surfaces, @NonNull CameraCaptureSession.StateCallback cb, @NonNull Handler handler) throws CameraAccessException {
        device.createCaptureSession(surfaces, cb, handler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(@NonNull SessionConfigurationCompat config) throws CameraAccessException {
        checkPreconditions(this.mCameraDevice, config);
        if (config.getInputConfiguration() != null) {
            throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
        }
        if (config.getSessionType() == 1) {
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraCaptureSessionCompat.StateCallbackExecutorWrapper(config.getExecutor(), config.getStateCallback());
        createBaseCaptureSession(this.mCameraDevice, unpackSurfaces(config.getOutputConfigurations()), stateCallbackExecutorWrapper, ((CameraDeviceCompatParamsApi21) this.mImplParams).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    @NonNull
    public CameraDevice unwrap() {
        return this.mCameraDevice;
    }
}

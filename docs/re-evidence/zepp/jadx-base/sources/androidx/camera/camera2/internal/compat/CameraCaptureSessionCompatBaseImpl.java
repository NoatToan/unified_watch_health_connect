package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    public final CameraCaptureSession mCameraCaptureSession;
    public final Object mObject;

    public static class CameraCaptureSessionCompatParamsApi21 {
        public final Handler mCompatHandler;

        public CameraCaptureSessionCompatParamsApi21(@NonNull Handler compatHandler) {
            this.mCompatHandler = compatHandler;
        }
    }

    public CameraCaptureSessionCompatBaseImpl(@NonNull CameraCaptureSession captureSession, @Nullable Object implParams) {
        this.mCameraCaptureSession = (CameraCaptureSession) Preconditions.checkNotNull(captureSession);
        this.mObject = implParams;
    }

    public static CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl create(@NonNull CameraCaptureSession captureSession, @NonNull Handler compatHandler) {
        return new CameraCaptureSessionCompatBaseImpl(captureSession, new CameraCaptureSessionCompatParamsApi21(compatHandler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mCameraCaptureSession.captureBurst(requests, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mCameraCaptureSession.capture(request, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mCameraCaptureSession.setRepeatingBurst(requests, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mCameraCaptureSession.setRepeatingRequest(request, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, listener), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    @NonNull
    public CameraCaptureSession unwrap() {
        return this.mCameraCaptureSession;
    }
}

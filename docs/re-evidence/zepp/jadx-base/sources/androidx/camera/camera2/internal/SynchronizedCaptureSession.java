package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
interface SynchronizedCaptureSession {

    public static abstract class StateCallback {
        public void onActive(@NonNull SynchronizedCaptureSession session) {
        }

        @RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@NonNull SynchronizedCaptureSession session) {
        }

        public void onClosed(@NonNull SynchronizedCaptureSession session) {
        }

        public void onConfigureFailed(@NonNull SynchronizedCaptureSession session) {
        }

        public void onConfigured(@NonNull SynchronizedCaptureSession session) {
        }

        public void onReady(@NonNull SynchronizedCaptureSession session) {
        }

        public void onSessionFinished(@NonNull SynchronizedCaptureSession session) {
        }

        @RequiresApi(api = 23)
        public void onSurfacePrepared(@NonNull SynchronizedCaptureSession session, @NonNull Surface surface) {
        }
    }

    void abortCaptures() throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest request, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    void close();

    void finishClose();

    @NonNull
    CameraDevice getDevice();

    @NonNull
    StateCallback getStateCallback();

    @NonNull
    ListenableFuture<Void> getSynchronizedBlocker(@NonNull String feature);

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest request, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

    void stopRepeating() throws CameraAccessException;

    @NonNull
    CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}

package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraCaptureSessionCompat {
    private final CameraCaptureSessionCompatImpl mImpl;

    public interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

        int captureSingleRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

        int setRepeatingBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

        int setSingleRepeatingRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException;

        @NonNull
        CameraCaptureSession unwrap();
    }

    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        public final CameraCaptureSession.CaptureCallback mWrappedCallback;

        public CaptureCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback wrappedCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = wrappedCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(24)
        public void onCaptureBufferLost(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final Surface target, final long frameNumber) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureBufferLost(session, request, target, frameNumber);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final TotalCaptureResult result) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureCompleted(session, request, result);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final CaptureFailure failure) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureFailed(session, request, failure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, @NonNull final CaptureResult partialResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureProgressed(session, request, partialResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull final CameraCaptureSession session, final int sequenceId) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureSequenceAborted(session, sequenceId);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull final CameraCaptureSession session, final int sequenceId, final long frameNumber) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureSequenceCompleted(session, sequenceId, frameNumber);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull final CameraCaptureSession session, @NonNull final CaptureRequest request, final long timestamp, final long frameNumber) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    CaptureCallbackExecutorWrapper.this.mWrappedCallback.onCaptureStarted(session, request, timestamp, frameNumber);
                }
            });
        }
    }

    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
        private final Executor mExecutor;
        public final CameraCaptureSession.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback wrappedCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = wrappedCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull final CameraCaptureSession session) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onActive(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(26)
        public void onCaptureQueueEmpty(@NonNull final CameraCaptureSession session) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onCaptureQueueEmpty(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull final CameraCaptureSession session) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onClosed(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull final CameraCaptureSession session) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onConfigureFailed(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull final CameraCaptureSession session) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onConfigured(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull final CameraCaptureSession session) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onReady(session);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(23)
        public void onSurfacePrepared(@NonNull final CameraCaptureSession session, @NonNull final Surface surface) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    StateCallbackExecutorWrapper.this.mWrappedCallback.onSurfacePrepared(session, surface);
                }
            });
        }
    }

    private CameraCaptureSessionCompat(@NonNull CameraCaptureSession captureSession, @NonNull Handler compatHandler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new CameraCaptureSessionCompatApi28Impl(captureSession);
        } else {
            this.mImpl = CameraCaptureSessionCompatBaseImpl.create(captureSession, compatHandler);
        }
    }

    @NonNull
    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(@NonNull CameraCaptureSession captureSession) {
        return toCameraCaptureSessionCompat(captureSession, MainThreadAsyncHandler.getInstance());
    }

    public int captureBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mImpl.captureBurstRequests(requests, executor, listener);
    }

    public int captureSingleRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mImpl.captureSingleRequest(request, executor, listener);
    }

    public int setRepeatingBurstRequests(@NonNull List<CaptureRequest> requests, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mImpl.setRepeatingBurstRequests(requests, executor, listener);
    }

    public int setSingleRepeatingRequest(@NonNull CaptureRequest request, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        return this.mImpl.setSingleRepeatingRequest(request, executor, listener);
    }

    @NonNull
    public CameraCaptureSession toCameraCaptureSession() {
        return this.mImpl.unwrap();
    }

    @NonNull
    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(@NonNull CameraCaptureSession captureSession, @NonNull Handler compatHandler) {
        return new CameraCaptureSessionCompat(captureSession, compatHandler);
    }
}

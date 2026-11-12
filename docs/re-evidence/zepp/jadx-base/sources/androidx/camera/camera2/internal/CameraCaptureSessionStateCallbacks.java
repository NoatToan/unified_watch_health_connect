package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CameraCaptureSessionStateCallbacks {

    public static final class ComboSessionStateCallback extends CameraCaptureSession.StateCallback {
        private final List<CameraCaptureSession.StateCallback> mCallbacks = new ArrayList();

        public ComboSessionStateCallback(@NonNull List<CameraCaptureSession.StateCallback> callbacks) {
            for (CameraCaptureSession.StateCallback stateCallback : callbacks) {
                if (!(stateCallback instanceof NoOpSessionStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull CameraCaptureSession session) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onActive(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@NonNull CameraCaptureSession session) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureQueueEmpty(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull CameraCaptureSession session) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onClosed(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession session) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onConfigureFailed(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession session) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onConfigured(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull CameraCaptureSession session) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onReady(session);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(api = 23)
        public void onSurfacePrepared(@NonNull CameraCaptureSession session, @NonNull Surface surface) {
            Iterator<CameraCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onSurfacePrepared(session, surface);
            }
        }
    }

    public static final class NoOpSessionStateCallback extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(@NonNull CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull CameraCaptureSession session) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(@NonNull CameraCaptureSession session, @NonNull Surface surface) {
        }
    }

    private CameraCaptureSessionStateCallbacks() {
    }

    @NonNull
    public static CameraCaptureSession.StateCallback createComboCallback(@NonNull List<CameraCaptureSession.StateCallback> callbacks) {
        if (callbacks.isEmpty()) {
            return createNoOpCallback();
        }
        return callbacks.size() == 1 ? callbacks.get(0) : new ComboSessionStateCallback(callbacks);
    }

    @NonNull
    public static CameraCaptureSession.StateCallback createNoOpCallback() {
        return new NoOpSessionStateCallback();
    }

    @NonNull
    public static CameraCaptureSession.StateCallback createComboCallback(@NonNull CameraCaptureSession.StateCallback... callbacks) {
        return createComboCallback((List<CameraCaptureSession.StateCallback>) Arrays.asList(callbacks));
    }
}

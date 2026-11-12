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
final class SynchronizedCaptureSessionStateCallbacks extends SynchronizedCaptureSession.StateCallback {
    private final List<SynchronizedCaptureSession.StateCallback> mCallbacks;

    public SynchronizedCaptureSessionStateCallbacks(@NonNull List<SynchronizedCaptureSession.StateCallback> callbacks) {
        ArrayList arrayList = new ArrayList();
        this.mCallbacks = arrayList;
        arrayList.addAll(callbacks);
    }

    @NonNull
    public static SynchronizedCaptureSession.StateCallback createComboCallback(@NonNull SynchronizedCaptureSession.StateCallback... callbacks) {
        return new SynchronizedCaptureSessionStateCallbacks(Arrays.asList(callbacks));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onActive(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @RequiresApi(api = 26)
    public void onCaptureQueueEmpty(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onCaptureQueueEmpty(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onClosed(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onConfigureFailed(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onConfigured(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onReady(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSessionFinished(@NonNull SynchronizedCaptureSession session) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onSessionFinished(session);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    @RequiresApi(api = 23)
    public void onSurfacePrepared(@NonNull SynchronizedCaptureSession session, @NonNull Surface surface) {
        Iterator<SynchronizedCaptureSession.StateCallback> it2 = this.mCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().onSurfacePrepared(session, surface);
        }
    }

    public static class Adapter extends SynchronizedCaptureSession.StateCallback {

        @NonNull
        private final CameraCaptureSession.StateCallback mCameraCaptureSessionStateCallback;

        public Adapter(@NonNull CameraCaptureSession.StateCallback cameraCaptureSessionStateCallback) {
            this.mCameraCaptureSessionStateCallback = cameraCaptureSessionStateCallback;
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onActive(@NonNull SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onActive(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        @RequiresApi(api = 26)
        public void onCaptureQueueEmpty(@NonNull SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onCaptureQueueEmpty(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onClosed(@NonNull SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onClosed(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onConfigureFailed(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(@NonNull SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onConfigured(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(@NonNull SynchronizedCaptureSession session) {
            this.mCameraCaptureSessionStateCallback.onReady(session.toCameraCaptureSessionCompat().toCameraCaptureSession());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(@NonNull SynchronizedCaptureSession session) {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        @RequiresApi(api = 23)
        public void onSurfacePrepared(@NonNull SynchronizedCaptureSession session, @NonNull Surface surface) {
            this.mCameraCaptureSessionStateCallback.onSurfacePrepared(session.toCameraCaptureSessionCompat().toCameraCaptureSession(), surface);
        }

        public Adapter(@NonNull List<CameraCaptureSession.StateCallback> callbackList) {
            this(CameraCaptureSessionStateCallbacks.createComboCallback(callbackList));
        }
    }
}

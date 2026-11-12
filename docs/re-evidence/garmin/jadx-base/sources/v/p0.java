package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f173980a = new ArrayList();

    public p0(List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof q0)) {
                this.f173980a.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        Iterator it = this.f173980a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
        }
    }
}

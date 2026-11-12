package v;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends androidx.camera.core.impl.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f174115a;

    private x0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f174115a = captureCallback;
        } else {
            j20.x.l("captureCallback is null");
            throw null;
        }
    }

    public static x0 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new x0(captureCallback);
    }
}

package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.w2;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.s f174105a;

    public w0(androidx.camera.core.impl.s sVar) {
        if (sVar != null) {
            this.f174105a = sVar;
        } else {
            j20.x.l("cameraCaptureCallback is null");
            throw null;
        }
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof w2) && (num = (Integer) ((w2) captureRequest.getTag()).f5841a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        w2 w2Var;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            k7.h.b(tag instanceof w2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            w2Var = (w2) tag;
        } else {
            w2Var = w2.f5840b;
        }
        this.f174105a.b(a(captureRequest), new g(w2Var, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f174105a.c(a(captureRequest), new androidx.camera.core.impl.u(androidx.camera.core.impl.u.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j14) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j8, j14);
        this.f174105a.d(a(captureRequest));
    }
}

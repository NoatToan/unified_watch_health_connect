package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureFailure;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oj3 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we3 f29212a;

    public oj3(we3 we3Var) {
        if (we3Var == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f29212a = we3Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        uzo uzoVarA;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            g6i.b(tag instanceof uzo, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            uzoVarA = (uzo) tag;
        } else {
            uzoVarA = uzo.a();
        }
        this.f29212a.b(new hc3(uzoVarA, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f29212a.c(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }
}

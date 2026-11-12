package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv/z1;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CaptureRequest;", "forwardedRequest", "delegate", "<init>", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "request", "", "timestamp", "frameNumber", "", "onReadoutStarted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z1 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureRequest f174140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f174141b;

    public z1(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        captureRequest.getClass();
        captureCallback.getClass();
        this.f174140a = captureRequest;
        this.f174141b = captureCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j8) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        this.f174141b.onCaptureBufferLost(cameraCaptureSession, this.f174140a, surface, j8);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        this.f174141b.onCaptureCompleted(cameraCaptureSession, this.f174140a, totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        this.f174141b.onCaptureFailed(cameraCaptureSession, this.f174140a, captureFailure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        this.f174141b.onCaptureProgressed(cameraCaptureSession, this.f174140a, captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i14) {
        cameraCaptureSession.getClass();
        this.f174141b.onCaptureSequenceAborted(cameraCaptureSession, i14);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i14, long j8) {
        cameraCaptureSession.getClass();
        this.f174141b.onCaptureSequenceCompleted(cameraCaptureSession, i14, j8);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j14) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        this.f174141b.onCaptureStarted(cameraCaptureSession, this.f174140a, j8, j14);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest request, long timestamp, long frameNumber) {
        session.getClass();
        request.getClass();
        this.f174141b.onReadoutStarted(session, this.f174140a, timestamp, frameNumber);
    }
}

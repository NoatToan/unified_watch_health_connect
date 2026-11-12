package vd2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvd2/c;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f177501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest.Builder f177502b;

    public c(b bVar, CaptureRequest.Builder builder) {
        this.f177501a = bVar;
        this.f177502b = builder;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        b.f177473q.error("Failed to create capture session.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CaptureRequest.Builder builder = this.f177502b;
        cameraCaptureSession.getClass();
        b bVar = this.f177501a;
        bVar.f177484i = cameraCaptureSession;
        try {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            CaptureRequest captureRequestBuild = builder.build();
            captureRequestBuild.getClass();
            cameraCaptureSession.setRepeatingRequest(captureRequestBuild, null, bVar.f177488m);
        } catch (CameraAccessException e4) {
            b.f177473q.error("Failed to set repeating request: " + e4);
        }
    }
}

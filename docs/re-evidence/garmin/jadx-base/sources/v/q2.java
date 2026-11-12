package v;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class q2 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.a f173994a;

    public q2(s2 s2Var, s2.a aVar) {
        this.f173994a = aVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1);
            s2.a aVar = this.f173994a;
            if (aVar.f174080b.get()) {
                ImageWriter imageWriter = aVar.f174079a;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                aVar.f174079a = imageWriterNewInstance;
            }
        }
    }
}

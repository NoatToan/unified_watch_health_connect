package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class b1 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f173680a;

    public b1(c1 c1Var) {
        this.f173680a = c1Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.f173680a.f173719a) {
            try {
                c1 c1Var = this.f173680a;
                androidx.camera.core.impl.l2 l2Var = c1Var.f173724f;
                if (l2Var == null) {
                    return;
                }
                androidx.camera.core.impl.v0 v0Var = l2Var.f5608g;
                c1Var.f173733o.getClass();
                c1Var.b(Collections.singletonList(y.v.a(v0Var)));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class n45 implements l1s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf3 f27528a;
    public cb3.a<Void> c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f27529b = null;
    public Rect d = null;

    public n45(vf3 vf3Var) {
        this.f27528a = vf3Var;
    }

    @Override // l1s.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.c.c(null);
            this.c = null;
            this.d = null;
        }
    }

    @Override // l1s.b
    public float b() {
        return 1.0f;
    }

    @Override // l1s.b
    public float c() {
        Float f = (Float) this.f27528a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue() < b() ? b() : f.floatValue();
    }

    @Override // l1s.b
    public void d(pe3.a aVar) {
        Rect rect = this.f27529b;
        if (rect != null) {
            aVar.e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // l1s.b
    public void e() {
        this.d = null;
        this.f27529b = null;
        cb3.a<Void> aVar = this.c;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.c = null;
        }
    }
}

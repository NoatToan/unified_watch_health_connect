package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
public final class ra1 implements l1s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf3 f32348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range<Float> f32349b;
    public cb3.a<Void> d;
    public float c = 1.0f;
    public float e = 1.0f;

    public ra1(vf3 vf3Var) {
        this.f32348a = vf3Var;
        this.f32349b = (Range) vf3Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // l1s.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.e == f.floatValue()) {
                this.d.c(null);
                this.d = null;
            }
        }
    }

    @Override // l1s.b
    public float b() {
        return ((Float) this.f32349b.getLower()).floatValue();
    }

    @Override // l1s.b
    public float c() {
        return ((Float) this.f32349b.getUpper()).floatValue();
    }

    @Override // l1s.b
    public void d(pe3.a aVar) {
        aVar.e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
    }

    @Override // l1s.b
    public void e() {
        this.c = 1.0f;
        cb3.a<Void> aVar = this.d;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.d = null;
        }
    }
}

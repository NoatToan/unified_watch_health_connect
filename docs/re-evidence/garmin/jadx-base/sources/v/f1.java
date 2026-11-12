package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements o2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f173801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f173803c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f173802b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f173804d = null;

    public f1(androidx.camera.camera2.internal.compat.h hVar) {
        this.f173801a = hVar;
    }

    @Override // v.o2.b
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.f173803c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f173804d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f173803c.b(null);
            this.f173803c = null;
            this.f173804d = null;
        }
    }

    @Override // v.o2.b
    public final float b() {
        return 1.0f;
    }

    @Override // v.o2.b
    public final float c() {
        Float f14 = (Float) this.f173801a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f14 != null && f14.floatValue() >= 1.0f) {
            return f14.floatValue();
        }
        return 1.0f;
    }

    @Override // v.o2.b
    public final void d(float f14, androidx.concurrent.futures.b.a<Void> aVar) {
        Rect rect = (Rect) this.f173801a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float fWidth = rect.width() / f14;
        float fHeight = rect.height() / f14;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        this.f173802b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        androidx.concurrent.futures.b.a<Void> aVar2 = this.f173803c;
        if (aVar2 != null) {
            aVar2.d(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f173804d = this.f173802b;
        this.f173803c = aVar;
    }

    @Override // v.o2.b
    public final void e() {
        this.f173804d = null;
        this.f173802b = null;
        androidx.concurrent.futures.b.a<Void> aVar = this.f173803c;
        if (aVar != null) {
            aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f173803c = null;
        }
    }

    @Override // v.o2.b
    public final Rect f() {
        Rect rect = this.f173802b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.f173801a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // v.o2.b
    public final void g(u.a.C3144a c3144a) {
        Rect rect = this.f173802b;
        if (rect != null) {
            c3144a.e(CaptureRequest.SCALER_CROP_REGION, rect, androidx.camera.core.impl.x0.b.REQUIRED);
        }
    }
}

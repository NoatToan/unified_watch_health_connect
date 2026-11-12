package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f173672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range<Float> f173673b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f173675d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f173677f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f173674c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f173676e = 1.0f;

    public b(androidx.camera.camera2.internal.compat.h hVar) {
        boolean z14 = false;
        this.f173677f = false;
        this.f173672a = hVar;
        this.f173673b = (Range) hVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) hVar.f5350b.f5348a.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i14 : iArr) {
                    if (i14 == 1) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        this.f173677f = z14;
    }

    @Override // v.o2.b
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.f173675d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f14 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f14 == null) {
                return;
            }
            if (this.f173676e == f14.floatValue()) {
                this.f173675d.b(null);
                this.f173675d = null;
            }
        }
    }

    @Override // v.o2.b
    public final float b() {
        return ((Float) this.f173673b.getLower()).floatValue();
    }

    @Override // v.o2.b
    public final float c() {
        return ((Float) this.f173673b.getUpper()).floatValue();
    }

    @Override // v.o2.b
    public final void d(float f14, androidx.concurrent.futures.b.a<Void> aVar) {
        this.f173674c = f14;
        androidx.concurrent.futures.b.a<Void> aVar2 = this.f173675d;
        if (aVar2 != null) {
            aVar2.d(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f173676e = this.f173674c;
        this.f173675d = aVar;
    }

    @Override // v.o2.b
    public final void e() {
        this.f173674c = 1.0f;
        androidx.concurrent.futures.b.a<Void> aVar = this.f173675d;
        if (aVar != null) {
            aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f173675d = null;
        }
    }

    @Override // v.o2.b
    public final Rect f() {
        Rect rect = (Rect) this.f173672a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // v.o2.b
    public final void g(u.a.C3144a c3144a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f173674c);
        androidx.camera.core.impl.x0.b bVar = androidx.camera.core.impl.x0.b.REQUIRED;
        c3144a.e(key, fValueOf, bVar);
        if (this.f173677f) {
            int i14 = w.a.f180960a;
            bVar.getClass();
            if (Build.VERSION.SDK_INT >= 34) {
                c3144a.e(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, bVar);
            }
        }
    }
}

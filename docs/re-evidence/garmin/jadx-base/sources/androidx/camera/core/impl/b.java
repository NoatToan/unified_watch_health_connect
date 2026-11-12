package androidx.camera.core.impl;

import android.util.Range;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public class b extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraControlInternal f5499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n2 f5500d;

    public b(CameraControlInternal cameraControlInternal, n2 n2Var) {
        super(cameraControlInternal);
        this.f5499c = cameraControlInternal;
        this.f5500d = n2Var;
    }

    @Override // androidx.camera.core.impl.h1, androidx.camera.core.CameraControl
    public final ListenableFuture<Void> a(float f14) {
        Range rangeF;
        n2 n2Var = this.f5500d;
        if (!j0.t.a(n2Var, 0)) {
            IllegalStateException illegalStateException = new IllegalStateException("Zoom is not supported");
            l0.j.a aVar = l0.j.f107810a;
            return new l0.m.a(illegalStateException);
        }
        CameraControlInternal cameraControlInternal = this.f5499c;
        if (n2Var != null && (rangeF = n2.f()) != null) {
            if (f14 <= 1.0f && f14 >= 0.0f) {
                return cameraControlInternal.b(c.z(f14, ((Float) rangeF.getLower()).floatValue(), ((Float) rangeF.getUpper()).floatValue()));
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Requested linearZoom " + f14 + " is not within valid range [0..1]");
            l0.j.a aVar2 = l0.j.f107810a;
            return new l0.m.a(illegalArgumentException);
        }
        return cameraControlInternal.a(f14);
    }

    @Override // androidx.camera.core.impl.h1, androidx.camera.core.CameraControl
    public final ListenableFuture<Void> b(float f14) {
        Range rangeF;
        n2 n2Var = this.f5500d;
        if (!j0.t.a(n2Var, 0)) {
            IllegalStateException illegalStateException = new IllegalStateException("Zoom is not supported");
            l0.j.a aVar = l0.j.f107810a;
            return new l0.m.a(illegalStateException);
        }
        if (n2Var == null || (rangeF = n2.f()) == null || (f14 >= ((Float) rangeF.getLower()).floatValue() && f14 <= ((Float) rangeF.getUpper()).floatValue())) {
            return this.f5499c.b(f14);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Requested zoomRatio " + f14 + " is not within valid range [" + rangeF.getLower() + " , " + rangeF.getUpper() + "]");
        l0.j.a aVar2 = l0.j.f107810a;
        return new l0.m.a(illegalArgumentException);
    }

    @Override // androidx.camera.core.impl.h1, androidx.camera.core.CameraControl
    public final ListenableFuture<Void> g(boolean z14) {
        if (j0.t.a(this.f5500d, 6)) {
            return this.f5499c.g(z14);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Torch is not supported");
        l0.j.a aVar = l0.j.f107810a;
        return new l0.m.a(illegalStateException);
    }

    @Override // androidx.camera.core.impl.h1, androidx.camera.core.CameraControl
    public final ListenableFuture<b0.e0> l(b0.d0 d0Var) {
        boolean z14;
        n2 n2Var = this.f5500d;
        if (n2Var != null) {
            b0.d0.a aVar = new b0.d0.a(d0Var);
            boolean z15 = true;
            if (d0Var.f13865a.isEmpty() || j0.t.a(n2Var, 1, 2)) {
                z14 = false;
            } else {
                aVar.b(1);
                z14 = true;
            }
            if (!d0Var.f13866b.isEmpty() && !j0.t.a(n2Var, 3)) {
                aVar.b(2);
                z14 = true;
            }
            if (d0Var.f13867c.isEmpty() || j0.t.a(n2Var, 4)) {
                z15 = z14;
            } else {
                aVar.b(4);
            }
            if (z15) {
                b0.d0 d0Var2 = new b0.d0(aVar);
                d0Var = (d0Var2.f13865a.isEmpty() && d0Var2.f13866b.isEmpty() && d0Var2.f13867c.isEmpty()) ? null : new b0.d0(aVar);
            }
        }
        if (d0Var != null) {
            return this.f5499c.l(d0Var);
        }
        IllegalStateException illegalStateException = new IllegalStateException("FocusMetering is not supported");
        l0.j.a aVar2 = l0.j.f107810a;
        return new l0.m.a(illegalStateException);
    }
}

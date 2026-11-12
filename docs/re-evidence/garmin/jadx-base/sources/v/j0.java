package v;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements b0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f173851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.e f173852c = new a0.e(this);

    public j0(String str, androidx.camera.camera2.internal.compat.q qVar) {
        this.f173850a = str;
        this.f173851b = qVar.b(str);
    }

    @Override // b0.r
    public final int b() {
        Integer num = (Integer) this.f173851b.a(CameraCharacteristics.LENS_FACING);
        k7.h.b(num != null, "Unable to get the lens facing of the camera.");
        return t1.a(num.intValue());
    }

    @Override // b0.r
    public final androidx.lifecycle.s0<b0.l1> g() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // b0.r
    public final int h() {
        return r(0);
    }

    @Override // b0.r
    public final androidx.lifecycle.s0<Integer> m() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // b0.r
    public final int r(int i14) {
        Integer num = (Integer) this.f173851b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return j0.c.a(j0.c.b(i14), num.intValue(), 1 == b());
    }
}

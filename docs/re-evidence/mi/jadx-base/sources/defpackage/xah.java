package defpackage;

import android.hardware.Camera;
import com.mi.health.qrcode.camera.open.CameraFacing;

/* JADX INFO: loaded from: classes5.dex */
public final class xah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Camera f38915b;
    public final CameraFacing c;
    public final int d;

    public xah(int i, Camera camera, CameraFacing cameraFacing, int i2) {
        this.f38914a = i;
        this.f38915b = camera;
        this.c = cameraFacing;
        this.d = i2;
    }

    public Camera a() {
        return this.f38915b;
    }

    public CameraFacing b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String toString() {
        return "Camera #" + this.f38914a + " : " + this.c + ',' + this.d;
    }
}

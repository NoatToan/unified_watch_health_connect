package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5345a;

    private a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f5345a = new b(cameraCaptureSession);
    }

    public static a a(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new a(cameraCaptureSession, handler);
    }
}

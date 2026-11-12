package u;

import a0.i;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.h;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.x0;
import b0.c0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public static final h O = x0.a.a(Integer.TYPE, "camera2.captureRequest.templateType");
    public static final h P = x0.a.a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");
    public static final h Q = x0.a.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");
    public static final h R = x0.a.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");
    public static final h S = x0.a.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");
    public static final h T;

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    public static final class C3144a implements c0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f167307a = w1.U();

        public final a a() {
            return new a(a2.T(this.f167307a));
        }

        public final void c(CaptureRequest.Key key, Object obj) {
            this.f167307a.X(a.T(key), obj);
        }

        @Override // b0.c0
        public final v1 d() {
            throw null;
        }

        public final void e(CaptureRequest.Key key, Object obj, x0.b bVar) {
            this.f167307a.W(a.T(key), bVar, obj);
        }
    }

    static {
        x0.a.a(Object.class, "camera2.captureRequest.tag");
        T = x0.a.a(String.class, "camera2.cameraCaptureSession.physicalCameraId");
    }

    public a(x0 x0Var) {
        super(x0Var);
    }

    public static h T(CaptureRequest.Key key) {
        return new h("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}

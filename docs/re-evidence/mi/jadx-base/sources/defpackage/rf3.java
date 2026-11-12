package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class rf3 implements bf3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession f32482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32483b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f32484a;

        public a(Handler handler) {
            this.f32484a = handler;
        }
    }

    public rf3(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f32482a = (CameraCaptureSession) g6i.g(cameraCaptureSession);
        this.f32483b = obj;
    }

    public static bf3.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new rf3(cameraCaptureSession, new a(handler));
    }

    @Override // bf3.a
    public CameraCaptureSession a() {
        return this.f32482a;
    }

    @Override // bf3.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f32482a.captureBurst(list, new bf3.b(executor, captureCallback), ((a) this.f32483b).f32484a);
    }

    @Override // bf3.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f32482a.setRepeatingRequest(captureRequest, new bf3.b(executor, captureCallback), ((a) this.f32483b).f32484a);
    }
}

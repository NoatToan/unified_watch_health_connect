package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface c2 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f173749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f173750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f173751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e1 f173752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.camera.core.impl.i2 f173753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.camera.core.impl.i2 f173754f;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, e1 e1Var, androidx.camera.core.impl.i2 i2Var, androidx.camera.core.impl.i2 i2Var2) {
            this.f173749a = executor;
            this.f173750b = scheduledExecutorService;
            this.f173751c = handler;
            this.f173752d = e1Var;
            this.f173753e = i2Var;
            this.f173754f = i2Var2;
        }
    }

    public static abstract class b {
        public void k(c2 c2Var) {
        }

        public void l(c2 c2Var) {
        }

        public void m(c2 c2Var) {
        }

        public void n(c2 c2Var) {
        }

        public void o(c2 c2Var) {
        }

        public void p(c2 c2Var) {
        }

        public void q(c2 c2Var) {
        }

        public void r(c2 c2Var, Surface surface) {
        }
    }

    void a();

    int b(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    androidx.camera.camera2.internal.compat.a c();

    void close();

    List<CaptureRequest> d(CaptureRequest captureRequest);

    void e(int i14);

    int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    e2 g();

    CameraDevice getDevice();

    ListenableFuture<Void> h();

    void i();

    int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
}

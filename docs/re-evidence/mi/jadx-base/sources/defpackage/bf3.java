package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class bf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4139a;

    public interface a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    @RequiresApi(21)
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f4140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f4141b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f4141b = executor;
            this.f4140a = captureCallback;
        }

        public final /* synthetic */ void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            wd1.a(this.f4140a, cameraCaptureSession, captureRequest, surface, j);
        }

        public final /* synthetic */ void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f4140a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final /* synthetic */ void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f4140a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        public final /* synthetic */ void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f4140a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public final /* synthetic */ void l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f4140a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public final /* synthetic */ void m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f4140a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public final /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f4140a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(24)
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f4141b.execute(new Runnable() { // from class: hf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20004a.h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f4141b.execute(new Runnable() { // from class: df3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15468a.i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f4141b.execute(new Runnable() { // from class: gf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18912a.j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f4141b.execute(new Runnable() { // from class: ef3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16580a.k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f4141b.execute(new Runnable() { // from class: if3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21077a.l(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f4141b.execute(new Runnable() { // from class: ff3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17726a.m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f4141b.execute(new Runnable() { // from class: cf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5268a.n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    @RequiresApi(21)
    public static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f4142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f4143b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f4143b = executor;
            this.f4142a = stateCallback;
        }

        public final /* synthetic */ void h(CameraCaptureSession cameraCaptureSession) {
            this.f4142a.onActive(cameraCaptureSession);
        }

        public final /* synthetic */ void i(CameraCaptureSession cameraCaptureSession) {
            xd1.b(this.f4142a, cameraCaptureSession);
        }

        public final /* synthetic */ void j(CameraCaptureSession cameraCaptureSession) {
            this.f4142a.onClosed(cameraCaptureSession);
        }

        public final /* synthetic */ void k(CameraCaptureSession cameraCaptureSession) {
            this.f4142a.onConfigureFailed(cameraCaptureSession);
        }

        public final /* synthetic */ void l(CameraCaptureSession cameraCaptureSession) {
            this.f4142a.onConfigured(cameraCaptureSession);
        }

        public final /* synthetic */ void m(CameraCaptureSession cameraCaptureSession) {
            this.f4142a.onReady(cameraCaptureSession);
        }

        public final /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            vd1.a(this.f4142a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f4143b.execute(new Runnable() { // from class: jf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22725a.h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(26)
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f4143b.execute(new Runnable() { // from class: mf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26094a.i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f4143b.execute(new Runnable() { // from class: kf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23795a.j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f4143b.execute(new Runnable() { // from class: pf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30340a.k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f4143b.execute(new Runnable() { // from class: nf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27875a.l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f4143b.execute(new Runnable() { // from class: of3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29098a.m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(23)
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f4143b.execute(new Runnable() { // from class: lf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24998a.n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public bf3(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4139a = new qf3(cameraCaptureSession);
        } else {
            this.f4139a = rf3.d(cameraCaptureSession, handler);
        }
    }

    public static bf3 d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new bf3(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f4139a.b(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f4139a.c(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f4139a.a();
    }
}

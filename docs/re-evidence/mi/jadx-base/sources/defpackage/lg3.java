package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class lg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25026a;

    public interface a {
        void a(pyl pylVar) throws CameraAccessExceptionCompat;
    }

    @RequiresApi(21)
    public static final class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f25027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f25028b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f25028b = executor;
            this.f25027a = stateCallback;
        }

        public final /* synthetic */ void e(CameraDevice cameraDevice) {
            this.f25027a.onClosed(cameraDevice);
        }

        public final /* synthetic */ void f(CameraDevice cameraDevice) {
            this.f25027a.onDisconnected(cameraDevice);
        }

        public final /* synthetic */ void g(CameraDevice cameraDevice, int i) {
            this.f25027a.onError(cameraDevice, i);
        }

        public final /* synthetic */ void h(CameraDevice cameraDevice) {
            this.f25027a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f25028b.execute(new Runnable() { // from class: mg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26127a.e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f25028b.execute(new Runnable() { // from class: og3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29128a.f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f25028b.execute(new Runnable() { // from class: ng3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27898a.g(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f25028b.execute(new Runnable() { // from class: pg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30361a.h(cameraDevice);
                }
            });
        }
    }

    public lg3(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f25026a = new sg3(cameraDevice);
        } else {
            this.f25026a = rg3.e(cameraDevice, handler);
        }
    }

    public static lg3 b(CameraDevice cameraDevice, Handler handler) {
        return new lg3(cameraDevice, handler);
    }

    public void a(pyl pylVar) throws CameraAccessExceptionCompat {
        this.f25026a.a(pylVar);
    }
}

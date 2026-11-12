package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5360a;

    public static final class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f5361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f5362b;

        public a(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f5362b = executor;
            this.f5361a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            this.f5362b.execute(new i(this, cameraDevice, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f5362b.execute(new i(this, cameraDevice, 1));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i14) {
            this.f5362b.execute(new j(this, cameraDevice, i14, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            this.f5362b.execute(new i(this, cameraDevice, 2));
        }
    }

    private k(CameraDevice cameraDevice, Handler handler) {
        this.f5360a = new n(cameraDevice);
    }

    public static k a(CameraDevice cameraDevice, Handler handler) {
        return new k(cameraDevice, handler);
    }
}

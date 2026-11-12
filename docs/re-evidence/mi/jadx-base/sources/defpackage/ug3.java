package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ug3 {

    public static final class a extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CameraDevice.StateCallback> f35729a = new ArrayList();

        public a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f35729a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f35729a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f35729a.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Iterator<CameraDevice.StateCallback> it = this.f35729a.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f35729a.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }
    }

    public static final class b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return b();
        }
        return list.size() == 1 ? list.get(0) : new a(list);
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }
}

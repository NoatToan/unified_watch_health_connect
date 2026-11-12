package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface wuo {

    public static abstract class a {
        public void m(wuo wuoVar) {
        }

        @RequiresApi(api = 26)
        public void n(wuo wuoVar) {
        }

        public void o(wuo wuoVar) {
        }

        public void p(wuo wuoVar) {
        }

        public void q(wuo wuoVar) {
        }

        public void r(wuo wuoVar) {
        }

        public void s(wuo wuoVar) {
        }

        @RequiresApi(api = 23)
        public void t(wuo wuoVar, Surface surface) {
        }
    }

    a b();

    void close();

    void d() throws CameraAccessException;

    int e(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    bf3 f();

    void g() throws CameraAccessException;

    CameraDevice getDevice();

    lhe<Void> h();

    void i();

    int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
}

package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public class sg3 extends rg3 {
    public sg3(CameraDevice cameraDevice) {
        super((CameraDevice) g6i.g(cameraDevice), null);
    }

    @Override // defpackage.rg3, lg3.a
    public void a(pyl pylVar) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) pylVar.i();
        g6i.g(sessionConfiguration);
        try {
            this.f34666a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}

package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public class rg3 extends qg3 {
    public rg3(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static rg3 e(CameraDevice cameraDevice, Handler handler) {
        return new rg3(cameraDevice, new tg3.a(handler));
    }

    @Override // lg3.a
    public void a(pyl pylVar) throws CameraAccessExceptionCompat {
        tg3.c(this.f34666a, pylVar);
        bf3.c cVar = new bf3.c(pylVar.a(), pylVar.e());
        List<jeh> listC = pylVar.c();
        Handler handler = ((tg3.a) g6i.g((tg3.a) this.f34667b)).f34668a;
        sad sadVarB = pylVar.b();
        try {
            if (sadVarB != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) sadVarB.a();
                g6i.g(inputConfiguration);
                this.f34666a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, pyl.g(listC), cVar, handler);
            } else if (pylVar.d() == 1) {
                this.f34666a.createConstrainedHighSpeedCaptureSession(tg3.d(listC), cVar, handler);
            } else {
                this.f34666a.createCaptureSessionByOutputConfigurations(pyl.g(listC), cVar, handler);
            }
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}

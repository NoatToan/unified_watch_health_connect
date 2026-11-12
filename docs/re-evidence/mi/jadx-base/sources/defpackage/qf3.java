package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public class qf3 extends rf3 {
    public qf3(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // defpackage.rf3, bf3.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f32482a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // defpackage.rf3, bf3.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f32482a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}

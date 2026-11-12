package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public class xd1 {
    public static <T> OutputConfiguration a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    public static void b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}

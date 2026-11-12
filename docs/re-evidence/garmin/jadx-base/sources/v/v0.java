package v;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    private v0() {
    }

    public static CameraUnavailableException a(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i14 = 1;
        if (reason != 1) {
            i14 = 2;
            if (reason != 2) {
                i14 = 3;
                if (reason != 3) {
                    i14 = 4;
                    if (reason != 4) {
                        i14 = 5;
                        if (reason != 5) {
                            i14 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i14, cameraAccessExceptionCompat);
    }
}

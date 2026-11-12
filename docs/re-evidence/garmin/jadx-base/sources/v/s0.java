package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    private s0() {
    }

    public static boolean a(String str, androidx.camera.camera2.internal.compat.q qVar) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) qVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i14 : iArr) {
                    if (i14 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e4) {
            throw new InitializationException(v0.a(e4));
        }
    }
}

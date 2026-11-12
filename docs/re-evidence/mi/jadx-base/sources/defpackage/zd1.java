package defpackage;

import android.hardware.camera2.CameraManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class zd1 {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}

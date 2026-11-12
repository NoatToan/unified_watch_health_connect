package w0;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice.CameraDeviceSetup f180991a;

    public b(CameraManager cameraManager, String str) {
        this.f180991a = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // w0.d
    public final d.a a(SessionConfiguration sessionConfiguration) {
        long j8;
        int i14 = this.f180991a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                j8 = Long.parseLong(property) * 1000;
            } catch (NumberFormatException unused) {
                j8 = 0;
            }
        } else {
            j8 = 0;
        }
        return new d.a(i14, 2, j8);
    }
}

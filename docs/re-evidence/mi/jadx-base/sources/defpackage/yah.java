package defpackage;

import android.hardware.Camera;
import com.mi.health.qrcode.camera.open.CameraFacing;

/* JADX INFO: loaded from: classes5.dex */
public final class yah {
    public static xah a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0 || i >= numberOfCameras) {
            return null;
        }
        if (i <= -1) {
            i = 0;
            int i2 = 0;
            while (i2 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (CameraFacing.values()[cameraInfo.facing] == CameraFacing.BACK) {
                    break;
                }
                i2++;
            }
            if (i2 != numberOfCameras) {
                i = i2;
            }
        }
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo2);
        Camera cameraOpen = Camera.open(i);
        if (cameraOpen == null) {
            return null;
        }
        return new xah(i, cameraOpen, CameraFacing.values()[cameraInfo2.facing], cameraInfo2.orientation);
    }
}

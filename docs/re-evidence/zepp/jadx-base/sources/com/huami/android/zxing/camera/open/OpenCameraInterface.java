package com.huami.android.zxing.camera.open;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenCameraInterface {
    public static final int NO_REQUESTED_CAMERA = -1;
    private static final String a = "com.huami.android.zxing.camera.open.OpenCameraInterface";

    private OpenCameraInterface() {
    }

    public static Camera open(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(a, "No cameras!");
            return null;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            Log.i(a, "Opening camera #" + i);
            return Camera.open(i);
        }
        if (!z) {
            Log.i(a, "No camera facing back; returning camera #0");
            return Camera.open(0);
        }
        Log.w(a, "Requested camera does not exist: " + i);
        return null;
    }
}

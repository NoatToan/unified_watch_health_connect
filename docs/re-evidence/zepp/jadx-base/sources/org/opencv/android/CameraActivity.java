package org.opencv.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class CameraActivity extends Activity {
    private static final int a = 200;

    public List<? extends CameraBridgeViewBase> getCameraViewList() {
        return new ArrayList();
    }

    public void onCameraPermissionGranted() {
        List<? extends CameraBridgeViewBase> cameraViewList = getCameraViewList();
        if (cameraViewList == null) {
            return;
        }
        for (CameraBridgeViewBase cameraBridgeViewBase : cameraViewList) {
            if (cameraBridgeViewBase != null) {
                cameraBridgeViewBase.setCameraPermissionGranted();
            }
        }
    }

    @Override // android.app.Activity
    @TargetApi(23)
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 200 && iArr.length > 0 && iArr[0] == 0) {
            onCameraPermissionGranted();
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onStart() {
        boolean z;
        super.onStart();
        if (Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.CAMERA") == 0) {
            z = true;
        } else {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 200);
            z = false;
        }
        if (z) {
            onCameraPermissionGranted();
        }
    }
}

package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import defpackage.th3;
import defpackage.xh3;
import defpackage.zpe;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraValidator {

    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(Context context, th3 th3Var, xh3 xh3Var) throws CameraIdListIncorrectException {
        Integer numD;
        if (xh3Var != null) {
            try {
                numD = xh3Var.d();
                if (numD == null) {
                    zpe.k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                zpe.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            numD = null;
        }
        zpe.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (xh3Var == null || numD.intValue() == 1)) {
                xh3.c.e(th3Var.a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (xh3Var == null || numD.intValue() == 0) {
                    xh3.f39114b.e(th3Var.a());
                }
            }
        } catch (IllegalArgumentException e2) {
            zpe.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + th3Var.a());
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e2);
        }
    }
}

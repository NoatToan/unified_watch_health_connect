package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class kh3 extends jh3 {
    public kh3(Context context) {
        super(context);
    }

    @Override // defpackage.jh3, defpackage.lh3, ih3.b
    @RequiresPermission("android.permission.CAMERA")
    public void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f25060a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // defpackage.jh3, defpackage.lh3, ih3.b
    public CameraCharacteristics d(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f25060a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}

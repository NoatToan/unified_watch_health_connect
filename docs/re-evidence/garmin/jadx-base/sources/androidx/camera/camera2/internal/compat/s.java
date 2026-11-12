package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class s extends r {
    public s(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.r, androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public final void a(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f5409a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.r, androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public final CameraCharacteristics b(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f5409a.getCameraCharacteristics(str);
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }
}

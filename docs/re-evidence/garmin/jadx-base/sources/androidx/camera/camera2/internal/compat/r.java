package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r extends u {
    public r(Context context) {
        super(context, null);
    }

    public static boolean f(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public void a(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f5409a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        } catch (IllegalArgumentException e14) {
        } catch (SecurityException e15) {
            throw e15;
        } catch (RuntimeException e16) {
            if (!f(e16)) {
                throw e16;
            }
            throw new CameraAccessExceptionCompat(10001, e16);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public CameraCharacteristics b(String str) throws CameraAccessExceptionCompat {
        try {
            return super.b(str);
        } catch (RuntimeException e4) {
            if (f(e4)) {
                throw new CameraAccessExceptionCompat(10001, e4);
            }
            throw e4;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public final void c(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f5409a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public final void e(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f5409a.unregisterAvailabilityCallback(availabilityCallback);
    }
}

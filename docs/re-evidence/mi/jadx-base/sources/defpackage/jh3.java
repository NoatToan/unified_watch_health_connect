package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public class jh3 extends lh3 {
    public jh3(Context context) {
        super(context, null);
    }

    public static jh3 h(Context context) {
        return new jh3(context);
    }

    public static boolean j(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // defpackage.lh3, ih3.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f25060a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // defpackage.lh3, ih3.b
    @RequiresPermission("android.permission.CAMERA")
    public void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f25060a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (i(e4)) {
                k(e4);
            }
            throw e4;
        }
    }

    @Override // defpackage.lh3, ih3.b
    public CameraCharacteristics d(String str) throws CameraAccessExceptionCompat {
        try {
            return super.d(str);
        } catch (RuntimeException e) {
            if (i(e)) {
                k(e);
            }
            throw e;
        }
    }

    @Override // defpackage.lh3, ih3.b
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f25060a.unregisterAvailabilityCallback(availabilityCallback);
    }

    public final boolean i(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && j(th);
    }

    public final void k(Throwable th) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th);
    }
}

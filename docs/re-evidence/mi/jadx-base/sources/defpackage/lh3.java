package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.xiaomi.passport.ui.page.UserAvatarUpdateActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class lh3 implements ih3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f25060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25061b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("mWrapperMap")
        public final Map<CameraManager.AvailabilityCallback, ih3.a> f25062a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f25063b;

        public a(Handler handler) {
            this.f25063b = handler;
        }
    }

    public lh3(Context context, Object obj) {
        this.f25060a = (CameraManager) context.getSystemService(UserAvatarUpdateActivity.CAMERA);
        this.f25061b = obj;
    }

    public static lh3 g(Context context, Handler handler) {
        return new lh3(context, new a(handler));
    }

    @Override // ih3.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ih3.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f25061b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f25062a) {
                try {
                    aVar = aVar2.f25062a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new ih3.a(executor, availabilityCallback);
                        aVar2.f25062a.put(availabilityCallback, aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            aVar = null;
        }
        this.f25060a.registerAvailabilityCallback(aVar, aVar2.f25063b);
    }

    @Override // ih3.b
    @RequiresPermission("android.permission.CAMERA")
    public void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        g6i.g(executor);
        g6i.g(stateCallback);
        try {
            this.f25060a.openCamera(str, new lg3.b(executor, stateCallback), ((a) this.f25061b).f25063b);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // ih3.b
    public CameraCharacteristics d(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f25060a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // ih3.b
    public String[] e() throws CameraAccessExceptionCompat {
        try {
            return this.f25060a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    @Override // ih3.b
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        ih3.a aVarRemove;
        if (availabilityCallback != null) {
            a aVar = (a) this.f25061b;
            synchronized (aVar.f25062a) {
                aVarRemove = aVar.f25062a.remove(availabilityCallback);
            }
        } else {
            aVarRemove = null;
        }
        if (aVarRemove != null) {
            aVarRemove.g();
        }
        this.f25060a.unregisterAvailabilityCallback(aVarRemove);
    }
}

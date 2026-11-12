package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final Map<CameraCharacteristics.Key<?>, Object> f36835a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36836b;

    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);
    }

    public vf3(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36836b = new tf3(cameraCharacteristics);
        } else {
            this.f36836b = new uf3(cameraCharacteristics);
        }
    }

    @VisibleForTesting(otherwise = 3)
    public static vf3 c(CameraCharacteristics cameraCharacteristics) {
        return new vf3(cameraCharacteristics);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (b(key)) {
            return (T) this.f36836b.a(key);
        }
        synchronized (this) {
            try {
                T t = (T) this.f36835a.get(key);
                if (t != null) {
                    return t;
                }
                T t2 = (T) this.f36836b.a(key);
                if (t2 != null) {
                    this.f36835a.put((CameraCharacteristics.Key<?>) key, t2);
                }
                return t2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }
}

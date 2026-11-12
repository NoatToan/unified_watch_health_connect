package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5351c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5349a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f5352d = null;

    private h(CameraCharacteristics cameraCharacteristics, String str) {
        this.f5350b = new d(cameraCharacteristics);
        this.f5351c = str;
    }

    public static h e(CameraCharacteristics cameraCharacteristics, String str) {
        return new h(cameraCharacteristics, str);
    }

    public final <T> T a(CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.f5350b.f5348a.get(key);
        }
        synchronized (this) {
            try {
                T t7 = (T) this.f5349a.get(key);
                if (t7 != null) {
                    return t7;
                }
                T t14 = (T) this.f5350b.f5348a.get(key);
                if (t14 != null) {
                    this.f5349a.put(key, t14);
                }
                return t14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final int b() {
        Integer num = (!d() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final v c() {
        if (this.f5352d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    vb.h.s("StreamConfigurationMap is null!");
                    return null;
                }
                this.f5352d = v.b(streamConfigurationMap, new y.l(this.f5351c));
            } catch (AssertionError | NullPointerException e4) {
                vb.h.s(e4.getMessage());
                return null;
            }
        }
        return this.f5352d;
    }

    public final boolean d() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }
}

package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DeviceInfo f32847a;
    private static DeviceCapability d;
    private static Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f32849c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, DeviceCapability> f32848b = new HashMap(16);

    private eej() {
    }

    public static DeviceCapability a(String str) {
        DeviceCapability deviceCapability;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (e()) {
            deviceCapability = f32848b.get(str);
        }
        return deviceCapability;
    }

    public static DeviceCapability c() {
        DeviceCapability deviceCapability;
        synchronized (e()) {
            deviceCapability = d;
        }
        return deviceCapability;
    }

    public static void b(DeviceCapability deviceCapability) {
        synchronized (e()) {
            if (deviceCapability != null) {
                d = deviceCapability;
            }
        }
    }

    public static void e(Map<String, DeviceCapability> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        synchronized (e()) {
            f32848b = map;
        }
    }

    public static void a(String str, DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            return;
        }
        synchronized (e()) {
            f32848b.put(str, deviceCapability);
        }
    }

    public static void b(String str) {
        synchronized (e()) {
            f32848b.remove(str);
        }
    }

    public static DeviceInfo a() {
        DeviceInfo deviceInfo;
        synchronized (d()) {
            deviceInfo = f32847a;
        }
        return deviceInfo;
    }

    public static void b(DeviceInfo deviceInfo) {
        synchronized (d()) {
            if (deviceInfo != null) {
                f32847a = deviceInfo;
            }
        }
    }

    private static Object e() {
        Object obj;
        synchronized (eej.class) {
            obj = e;
        }
        return obj;
    }

    private static Object d() {
        Object obj;
        synchronized (eej.class) {
            obj = f32849c;
        }
        return obj;
    }
}

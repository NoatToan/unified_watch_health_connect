package com.huawei.updatesdk.service.device;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Class<? extends c>> f29945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f29946b;

    public static c a() {
        synchronized (b.class) {
            c cVar = f29946b;
            if (cVar != null) {
                return cVar;
            }
            com.huawei.updatesdk.sdk.foundation.a.b("DeviceImplFactory", "deviceType: " + com.huawei.updatesdk.sdk.foundation.utils.device.c.b());
            Class<? extends c> cls = f29945a.get(Integer.valueOf(com.huawei.updatesdk.sdk.foundation.utils.device.c.b()));
            if (cls == null) {
                d dVar = new d();
                f29946b = dVar;
                return dVar;
            }
            try {
                f29946b = cls.newInstance();
            } catch (Throwable unused) {
                f29946b = new d();
                com.huawei.updatesdk.sdk.foundation.a.a("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
            }
            return f29946b;
        }
    }

    static {
        HashMap map = new HashMap();
        f29945a = map;
        map.put(3, a.class);
        map.put(1, e.class);
        map.put(2, f.class);
        map.put(0, d.class);
        map.put(4, d.class);
        map.put(7, a.class);
    }
}

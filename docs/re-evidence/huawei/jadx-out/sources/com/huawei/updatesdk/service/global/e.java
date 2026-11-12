package com.huawei.updatesdk.service.global;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f29963a = new ConcurrentHashMap();

    public static a a(boolean z) {
        String str = z ? "apptouch" : "default";
        if (TextUtils.isEmpty(str)) {
            return new c();
        }
        Map<String, a> map = f29963a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        map.put(str, "apptouch".equals(str) ? new b() : new c());
        return map.get(str);
    }
}

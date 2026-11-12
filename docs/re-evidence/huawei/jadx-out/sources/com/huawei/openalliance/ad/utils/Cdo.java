package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.openalliance.ad.utils.do, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f20649a = new ConcurrentHashMap();

    public static boolean a(String str, int i) {
        boolean z = true;
        if (str == null) {
            return true;
        }
        Map<String, Long> map = f20649a;
        Long l = map.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l != null) {
            z = jCurrentTimeMillis - l.longValue() > ((long) i);
            if (!z) {
                if (hw.a()) {
                    hw.a("TimeIntervalControl", "tag: %s isExpired %s", str, Boolean.valueOf(z));
                }
                return z;
            }
        }
        if (hw.a()) {
            hw.a("TimeIntervalControl", "tag: %s isExpired %s", str, Boolean.valueOf(z));
        }
        map.put(str, Long.valueOf(jCurrentTimeMillis));
        return z;
    }

    public static boolean a(String str) {
        return a(str, 60000);
    }
}

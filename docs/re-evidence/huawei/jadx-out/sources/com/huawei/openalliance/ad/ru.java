package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.VastVersion;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static VastVersion f20228a = VastVersion.VAST_30;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<VastVersion, ro> f20229b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<VastVersion, rm> f20230c = new HashMap();
    private static Map<VastVersion, rn> d = new HashMap();

    public static rm c() {
        return f20230c.get(f20228a);
    }

    public static rn b() {
        return d.get(f20228a);
    }

    public static void a(VastVersion vastVersion) {
        f20228a = vastVersion;
    }

    public static ro a() {
        return f20229b.get(f20228a);
    }

    static {
        f20229b.put(VastVersion.VAST_20, new rv());
        f20229b.put(VastVersion.VAST_30, new rw());
        f20230c.put(VastVersion.VAST_20, new rp());
        f20230c.put(VastVersion.VAST_30, new rq());
        d.put(VastVersion.VAST_20, new rr());
        d.put(VastVersion.VAST_30, new rs());
    }
}

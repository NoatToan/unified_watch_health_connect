package com.huawei.hwcloudjs.service.hms;

import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static r f17194a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Map<String, HuaweiApiClient>> f17195b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Map<String, HuaweiIdAuthService>> f17196c = new HashMap();

    public void b(String str) {
        synchronized (this.f17195b) {
            Map<String, HuaweiApiClient> mapRemove = this.f17195b.remove(str);
            if (mapRemove != null) {
                Iterator<Map.Entry<String, HuaweiApiClient>> it = mapRemove.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().disconnect();
                }
            }
        }
    }

    public HuaweiApiClient b(String str, String str2) {
        synchronized (this.f17195b) {
            Map<String, HuaweiApiClient> map = this.f17195b.get(str);
            if (map == null) {
                return null;
            }
            return map.get(str2);
        }
    }

    public void a(String str, String str2, HuaweiIdAuthService huaweiIdAuthService) {
        synchronized (this.f17196c) {
            Map<String, HuaweiIdAuthService> map = this.f17196c.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.f17196c.put(str, map);
            }
            map.put(str2, huaweiIdAuthService);
        }
    }

    public void a(String str, String str2, HuaweiApiClient huaweiApiClient) {
        synchronized (this.f17195b) {
            Map<String, HuaweiApiClient> map = this.f17195b.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.f17195b.put(str, map);
            }
            map.put(str2, huaweiApiClient);
        }
    }

    public void a(String str) {
        synchronized (this.f17196c) {
            this.f17196c.remove(str);
        }
    }

    public HuaweiIdAuthService a(String str, String str2) {
        synchronized (this.f17196c) {
            Map<String, HuaweiIdAuthService> map = this.f17196c.get(str);
            if (map == null) {
                return null;
            }
            return map.get(str2);
        }
    }

    public static r a() {
        return f17194a;
    }

    private r() {
    }
}

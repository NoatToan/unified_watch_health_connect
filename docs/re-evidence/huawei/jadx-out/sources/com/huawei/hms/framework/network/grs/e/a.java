package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final String e = "a";
    private static final Map<String, Map<String, Map<String, String>>> f = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f13285a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f13286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f13287c;
    private final g d;

    public c c() {
        return this.f13287c;
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        long j;
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String strA = this.f13286b.a(grsParasKey, "");
        String strA2 = this.f13286b.a(grsParasKey + "time", "0");
        if (TextUtils.isEmpty(strA2) || !strA2.matches("\\d+")) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(strA2);
            } catch (NumberFormatException e2) {
                Logger.w(e, "convert urlParamKey from String to Long catch NumberFormatException.", e2);
                j = 0;
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f;
        map.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(strA));
        Logger.d(e, "Cache size is: " + map.size());
        this.f13285a.put(grsParasKey, Long.valueOf(j));
        a(grsBaseInfo, grsParasKey, context);
    }

    public g b() {
        return this.d;
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.j.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(e, "update cache from server failed");
            return;
        }
        if (cVar.d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.f13286b.a(grsParasKey, "")));
            } else {
                this.f13286b.b(grsParasKey, dVar.j());
                f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!TextUtils.isEmpty(dVar.e())) {
                this.f13286b.b(grsParasKey + "ETag", dVar.e());
            }
            this.f13286b.b(grsParasKey + "time", dVar.a());
            this.f13285a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.f13286b.b("geoipCountryCode", dVar.j());
            this.f13286b.b("geoipCountryCodetime", dVar.a());
        }
        Logger.d(e, "Cache size is: " + f.size());
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f13286b.b(grsParasKey + "time", "0");
        this.f13286b.b(grsParasKey + "ETag", "");
        this.f13285a.remove(grsParasKey + "time");
        Map<String, Map<String, Map<String, String>>> map = f;
        map.remove(grsParasKey);
        Logger.d(e, "Cache size is: " + map.size());
        this.d.a(grsParasKey);
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            a(grsBaseInfo, bVar, context, str);
            return map2.get(str);
        }
        Logger.d(e, "Cache size is: " + map.size());
        return new HashMap();
    }

    public c a() {
        return this.f13286b;
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.f13285a.get(str), 300000L)) {
            this.d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, null, this.f13287c, -1);
        }
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l = this.f13285a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l)) {
            bVar.a(2);
            return;
        }
        if (e.a(l, 300000L)) {
            this.d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, str, this.f13287c, -1);
        }
        bVar.a(1);
    }

    public a(c cVar, c cVar2, g gVar) {
        this.f13287c = cVar2;
        this.f13286b = cVar;
        this.d = gVar;
        gVar.a(this);
    }
}

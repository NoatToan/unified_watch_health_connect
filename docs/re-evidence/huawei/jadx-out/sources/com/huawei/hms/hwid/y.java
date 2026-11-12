package com.huawei.hms.hwid;

import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y f13570a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f13571b = new ConcurrentHashMap();

    private y() {
    }

    public static y a() {
        return f13570a;
    }

    public void a(AuthHuaweiId authHuaweiId, HuaweiIdAuthParams huaweiIdAuthParams) {
        String json;
        ar.b("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "saveDefaultHuaweiIdSignInAccount start.", true);
        if (authHuaweiId != null) {
            try {
                json = authHuaweiId.toJson();
            } catch (Throwable th) {
                ar.d("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "store faild, exception:" + th.getClass().getSimpleName(), true);
                return;
            }
        } else {
            json = null;
        }
        a(json, huaweiIdAuthParams != null ? huaweiIdAuthParams.toJson() : null);
    }

    private void a(String str, String str2) {
        ar.b("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "saveDefaultHuaweiIdSignInAccount start.", true);
        this.f13571b.remove("HuaweiIdAccount");
        this.f13571b.remove("HuaweiIdAuthParams");
        if (str != null) {
            this.f13571b.put("HuaweiIdAccount", str);
        }
        if (str2 != null) {
            this.f13571b.put("HuaweiIdAuthParams", str2);
        }
    }

    public final AuthHuaweiId b() {
        try {
            String str = this.f13571b.get("HuaweiIdAccount");
            if (str != null) {
                return AuthHuaweiId.fromJson(str);
            }
            return null;
        } catch (Throwable th) {
            ar.d("[HUAWEIIDSDK]HuaweiIdAuthMemCache", "getHuaweiSignInAccount faild, exception:" + th.getClass().getSimpleName(), true);
            return null;
        }
    }

    public void c() {
        this.f13571b.clear();
    }
}

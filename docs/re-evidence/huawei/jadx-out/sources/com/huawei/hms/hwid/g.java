package com.huawei.hms.hwid;

import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AuthAccount;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f13560a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f13561b = new ConcurrentHashMap();

    private g() {
    }

    public static g a() {
        return f13560a;
    }

    public void a(AuthAccount authAccount, AccountAuthParams accountAuthParams) {
        String json;
        ar.b("[AccountSDK]AccountAuthMemCache", "saveDefaultAccountSignInAccount start.", true);
        if (authAccount != null) {
            try {
                json = authAccount.toJson();
            } catch (Throwable th) {
                ar.d("[AccountSDK]AccountAuthMemCache", "store faild, exception:" + th.getClass().getSimpleName(), true);
                return;
            }
        } else {
            json = null;
        }
        a(json, accountAuthParams != null ? accountAuthParams.toJson() : null);
    }

    private void a(String str, String str2) {
        ar.b("[AccountSDK]AccountAuthMemCache", "saveDefaultAccountSignInAccount start.", true);
        this.f13561b.remove("AccountAuth");
        this.f13561b.remove("AccountAuthParams");
        if (str != null) {
            this.f13561b.put("AccountAuth", str);
        }
        if (str2 != null) {
            this.f13561b.put("AccountAuthParams", str2);
        }
    }

    public final AuthAccount b() {
        ar.b("[AccountSDK]AccountAuthMemCache", "getSignInAccount start.", true);
        try {
            String str = this.f13561b.get("AccountAuth");
            if (str != null) {
                return AuthAccount.fromJson(str);
            }
            return null;
        } catch (Throwable th) {
            ar.d("[AccountSDK]AccountAuthMemCache", "getSignInAccount faild, exception:" + th.getClass().getSimpleName(), true);
            return null;
        }
    }

    public void c() {
        this.f13561b.clear();
    }
}

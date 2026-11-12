package defpackage;

import com.huawei.wearengine.auth.AuthInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes43.dex */
public class tro {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, AuthInfo> f49588b = new ConcurrentHashMap(16);

    public void a(String str, AuthInfo authInfo) {
        if (str == null || authInfo == null) {
            return;
        }
        if (this.f49588b == null) {
            this.f49588b = new ConcurrentHashMap(16);
        }
        this.f49588b.put(str, authInfo);
    }

    public AuthInfo e(String str) {
        if (str == null) {
            return null;
        }
        if (this.f49588b == null) {
            this.f49588b = new ConcurrentHashMap(6);
        }
        if (!this.f49588b.containsKey(str)) {
            return null;
        }
        AuthInfo authInfo = this.f49588b.get(str);
        this.f49588b.remove(str);
        return authInfo;
    }

    public Map<String, AuthInfo> c() {
        return this.f49588b;
    }
}

package defpackage;

import android.text.TextUtils;
import android.util.LruCache;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.x2;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes33.dex */
public class lfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LruCache<String, ldj.c> f40029a;

    public lfj() {
        String strB = SharedPreferenceManager.b("redirect_info_cache", x2.REDIRECT_INFO, "");
        if (TextUtils.isEmpty(strB)) {
            this.f40029a = new LruCache<>(20);
        } else {
            this.f40029a = (LruCache) HiJsonUtil.d(strB, new TypeToken<LruCache<String, ldj.c>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.ThirdPartyAppRedirectInfoCache$1
            }.getType());
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final lfj f40030a = new lfj();
    }

    public static lfj e() {
        return b.f40030a;
    }

    public ldj.c c(String str) {
        if (str == null) {
            return null;
        }
        ldj.c cVar = this.f40029a.get(str);
        if (cVar == null || !cVar.isExpired()) {
            return cVar;
        }
        this.f40029a.remove(str);
        a();
        return null;
    }

    public void a(String str, ldj.c cVar) {
        if (str == null) {
            return;
        }
        cVar.setExpiredTimestamp(System.currentTimeMillis() + 86400000);
        cVar.setSecret(null);
        this.f40029a.put(str, cVar);
        a();
    }

    public void a() {
        SharedPreferenceManager.c("redirect_info_cache", x2.REDIRECT_INFO, HiJsonUtil.d(this.f40029a));
    }
}

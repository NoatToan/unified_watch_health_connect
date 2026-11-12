package defpackage;

import android.util.LruCache;
import com.huawei.hihealth.HiAppInfo;

/* JADX INFO: loaded from: classes10.dex */
public class kxz {
    private static LruCache<String, HiAppInfo> e = new LruCache<>(500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LruCache<String, Integer> f39611a = new LruCache<>(20);

    public static HiAppInfo c(String str) {
        if (str == null) {
            return null;
        }
        return e.get(str);
    }

    public static void a(String str, HiAppInfo hiAppInfo) {
        if (str == null || hiAppInfo == null) {
            return;
        }
        e.put(str, hiAppInfo);
    }

    public static void b() {
        e.evictAll();
    }

    public static LruCache<String, Integer> e() {
        return f39611a;
    }
}

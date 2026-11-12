package com.huawei.openalliance.ad.utils;

import android.util.LruCache;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.PermissionEntity;
import java.lang.ref.SoftReference;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20537a = "ci";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f20538b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ci f20539c;
    private SoftReference<LruCache<String, List<PermissionEntity>>> d;

    public void a(String str, List<PermissionEntity> list) {
        try {
            b().put(str, list);
        } catch (Throwable th) {
            hw.c(f20537a, "put cache encounter: " + th.getClass().getSimpleName());
        }
    }

    public List<PermissionEntity> a(String str) {
        try {
            return b().get(str);
        } catch (Throwable th) {
            hw.c(f20537a, "get cache encounter: " + th.getClass().getSimpleName());
            return null;
        }
    }

    private LruCache<String, List<PermissionEntity>> b() {
        SoftReference<LruCache<String, List<PermissionEntity>>> softReference = this.d;
        LruCache<String, List<PermissionEntity>> lruCache = softReference != null ? softReference.get() : null;
        if (lruCache != null) {
            return lruCache;
        }
        LruCache<String, List<PermissionEntity>> lruCache2 = new LruCache<>(5);
        this.d = new SoftReference<>(lruCache2);
        return lruCache2;
    }

    public static ci a() {
        ci ciVar;
        synchronized (f20538b) {
            if (f20539c == null) {
                f20539c = new ci();
            }
            ciVar = f20539c;
        }
        return ciVar;
    }
}

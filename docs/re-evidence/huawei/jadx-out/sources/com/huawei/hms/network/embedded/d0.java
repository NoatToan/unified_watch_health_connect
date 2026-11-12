package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.m0;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class d0<T extends m0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14690b = "MemoryCache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14691c = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache<String, T> f14692a = new LruCache<>(128);

    public Map<String, T> b() {
        return this.f14692a.snapshot();
    }

    public T b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f14692a.get(str);
    }

    public boolean a(String str, T t) {
        if (y.b(t) || TextUtils.isEmpty(str)) {
            return false;
        }
        this.f14692a.put(str, t);
        return true;
    }

    public boolean a(String str) {
        Logger.v(f14690b, "[DNS Memory Cache]remove one record，host: %s", str);
        this.f14692a.remove(str);
        return true;
    }

    public void a() {
        this.f14692a.evictAll();
    }
}

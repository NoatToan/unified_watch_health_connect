package com.huawei.haf.router.core;

import android.util.LruCache;
import com.huawei.haf.router.facade.template.SyringeHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterAutowiredService {
    private final Set<String> e = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<String> f6017b = new HashSet();
    private final LruCache<String, SyringeHandler> d = new LruCache<>(10);

    AppRouterAutowiredService() {
    }

    void d(String[] strArr) {
        if (strArr.length > 0) {
            this.e.addAll(Arrays.asList(strArr));
        }
    }
}

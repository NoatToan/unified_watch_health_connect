package com.facebook.cache.common;

/* JADX INFO: loaded from: classes4.dex */
public interface CacheEventListener {

    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED
    }

    void a();

    void b(a aVar);

    void c(a aVar);

    void d(a aVar);

    void e(a aVar);

    void f(a aVar);

    void g(a aVar);

    void h(a aVar);
}

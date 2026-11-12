package com.facebook.cache.common;

/* JADX INFO: loaded from: classes4.dex */
public class b implements CacheErrorLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f7088a;

    public static synchronized b b() {
        try {
            if (f7088a == null) {
                f7088a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7088a;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    public void a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, Throwable th) {
    }
}

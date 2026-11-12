package defpackage;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.a;

/* JADX INFO: loaded from: classes4.dex */
public class rug implements CacheEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static rug f32913a;

    public static synchronized rug i() {
        try {
            if (f32913a == null) {
                f32913a = new rug();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f32913a;
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void a() {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void b(a aVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void c(a aVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void d(a aVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void e(a aVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void f(a aVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void g(a aVar) {
    }

    @Override // com.facebook.cache.common.CacheEventListener
    public void h(a aVar) {
    }
}

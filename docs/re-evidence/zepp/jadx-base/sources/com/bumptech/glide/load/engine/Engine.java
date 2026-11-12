package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Engine implements h, MemoryCache.ResourceRemovedListener, k.a {
    private static final int j = 150;
    private final l a;
    private final j b;
    private final MemoryCache c;
    private final b d;
    private final p e;
    private final c f;
    private final a g;
    private final com.bumptech.glide.load.engine.a h;
    private static final String i = "Engine";
    private static final boolean k = Log.isLoggable(i, 2);

    public static class LoadStatus {
        private final g<?> a;
        private final ResourceCallback b;

        public LoadStatus(ResourceCallback resourceCallback, g<?> gVar) {
            this.b = resourceCallback;
            this.a = gVar;
        }

        public void cancel() {
            this.a.n(this.b);
        }
    }

    @VisibleForTesting
    public static class a {
        public final f.e a;
        public final Pools.Pool<f<?>> b = FactoryPools.simple(150, new C0118a());
        private int c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.Engine$a$a, reason: collision with other inner class name */
        public class C0118a implements FactoryPools.Factory<f<?>> {
            public C0118a() {
            }

            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f<?> create() {
                a aVar = a.this;
                return new f<>(aVar.a, aVar.b);
            }
        }

        public a(f.e eVar) {
            this.a = eVar;
        }

        public <R> f<R> a(GlideContext glideContext, Object obj, i iVar, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, Options options, f.b<R> bVar) {
            f fVar = (f) Preconditions.checkNotNull(this.b.acquire());
            int i3 = this.c;
            this.c = i3 + 1;
            return fVar.i(glideContext, obj, iVar, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, z3, options, bVar, i3);
        }
    }

    @VisibleForTesting
    public static class b {
        public final GlideExecutor a;
        public final GlideExecutor b;
        public final GlideExecutor c;
        public final GlideExecutor d;
        public final h e;
        public final Pools.Pool<g<?>> f = FactoryPools.simple(150, new a());

        public class a implements FactoryPools.Factory<g<?>> {
            public a() {
            }

            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g<?> create() {
                b bVar = b.this;
                return new g<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
            }
        }

        public b(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, h hVar) {
            this.a = glideExecutor;
            this.b = glideExecutor2;
            this.c = glideExecutor3;
            this.d = glideExecutor4;
            this.e = hVar;
        }

        private static void c(ExecutorService executorService) {
            executorService.shutdown();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (executorService.awaitTermination(5L, timeUnit)) {
                    return;
                }
                executorService.shutdownNow();
                if (executorService.awaitTermination(5L, timeUnit)) {
                } else {
                    throw new RuntimeException("Failed to shutdown");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public <R> g<R> a(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((g) Preconditions.checkNotNull(this.f.acquire())).i(key, z, z2, z3, z4);
        }

        @VisibleForTesting
        public void b() {
            c(this.a);
            c(this.b);
            c(this.c);
            c(this.d);
        }
    }

    public static class c implements f.e {
        private final DiskCache.Factory a;
        private volatile DiskCache b;

        public c(DiskCache.Factory factory) {
            this.a = factory;
        }

        @Override // com.bumptech.glide.load.engine.f.e
        public DiskCache a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.build();
                    }
                    if (this.b == null) {
                        this.b = new DiskCacheAdapter();
                    }
                }
            }
            return this.b;
        }

        @VisibleForTesting
        public synchronized void b() {
            if (this.b == null) {
                return;
            }
            this.b.clear();
        }
    }

    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z) {
        this(memoryCache, factory, glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, null, null, null, null, null, null, z);
    }

    private k<?> a(Key key) {
        Resource<?> resourceRemove = this.c.remove(key);
        if (resourceRemove == null) {
            return null;
        }
        return resourceRemove instanceof k ? (k) resourceRemove : new k<>(resourceRemove, true, true);
    }

    @Nullable
    private k<?> b(Key key, boolean z) {
        if (!z) {
            return null;
        }
        k<?> kVarE = this.h.e(key);
        if (kVarE != null) {
            kVarE.a();
        }
        return kVarE;
    }

    private k<?> c(Key key, boolean z) {
        if (!z) {
            return null;
        }
        k<?> kVarA = a(key);
        if (kVarA != null) {
            kVarA.a();
            this.h.a(key, kVarA);
        }
        return kVarA;
    }

    private static void d(String str, long j2, Key key) {
        Log.v(i, str + " in " + LogTime.getElapsedMillis(j2) + "ms, key: " + key);
    }

    public void clearDiskCache() {
        this.f.a().clear();
    }

    public <R> LoadStatus load(GlideContext glideContext, Object obj, Key key, int i2, int i3, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback) {
        Util.assertMainThread();
        boolean z7 = k;
        long logTime = z7 ? LogTime.getLogTime() : 0L;
        i iVarA = this.b.a(obj, key, i2, i3, map, cls, cls2, options);
        k<?> kVarB = b(iVarA, z3);
        if (kVarB != null) {
            resourceCallback.onResourceReady(kVarB, DataSource.MEMORY_CACHE);
            if (z7) {
                d("Loaded resource from active resources", logTime, iVarA);
            }
            return null;
        }
        k<?> kVarC = c(iVarA, z3);
        if (kVarC != null) {
            resourceCallback.onResourceReady(kVarC, DataSource.MEMORY_CACHE);
            if (z7) {
                d("Loaded resource from cache", logTime, iVarA);
            }
            return null;
        }
        g<?> gVarA = this.a.a(iVarA, z6);
        if (gVarA != null) {
            gVarA.b(resourceCallback);
            if (z7) {
                d("Added to existing load", logTime, iVarA);
            }
            return new LoadStatus(resourceCallback, gVarA);
        }
        g<R> gVarA2 = this.d.a(iVarA, z3, z4, z5, z6);
        f<R> fVarA = this.g.a(glideContext, obj, iVarA, key, i2, i3, cls, cls2, priority, diskCacheStrategy, map, z, z2, z6, options, gVarA2);
        this.a.d(iVarA, gVarA2);
        gVarA2.b(resourceCallback);
        gVarA2.o(fVarA);
        if (z7) {
            d("Started new load", logTime, iVarA);
        }
        return new LoadStatus(resourceCallback, gVarA2);
    }

    @Override // com.bumptech.glide.load.engine.h
    public void onEngineJobCancelled(g<?> gVar, Key key) {
        Util.assertMainThread();
        this.a.e(key, gVar);
    }

    @Override // com.bumptech.glide.load.engine.h
    public void onEngineJobComplete(g<?> gVar, Key key, k<?> kVar) {
        Util.assertMainThread();
        if (kVar != null) {
            kVar.e(key, this);
            if (kVar.c()) {
                this.h.a(key, kVar);
            }
        }
        this.a.e(key, gVar);
    }

    @Override // com.bumptech.glide.load.engine.k.a
    public void onResourceReleased(Key key, k<?> kVar) {
        Util.assertMainThread();
        this.h.d(key);
        if (kVar.c()) {
            this.c.put(key, kVar);
        } else {
            this.e.a(kVar);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    public void onResourceRemoved(@NonNull Resource<?> resource) {
        Util.assertMainThread();
        this.e.a(resource);
    }

    public void release(Resource<?> resource) {
        Util.assertMainThread();
        if (!(resource instanceof k)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((k) resource).d();
    }

    @VisibleForTesting
    public void shutdown() {
        this.d.b();
        this.f.b();
        this.h.i();
    }

    @VisibleForTesting
    public Engine(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, l lVar, j jVar, com.bumptech.glide.load.engine.a aVar, b bVar, a aVar2, p pVar, boolean z) {
        this.c = memoryCache;
        c cVar = new c(factory);
        this.f = cVar;
        com.bumptech.glide.load.engine.a aVar3 = aVar == null ? new com.bumptech.glide.load.engine.a(z) : aVar;
        this.h = aVar3;
        aVar3.h(this);
        this.b = jVar == null ? new j() : jVar;
        this.a = lVar == null ? new l() : lVar;
        this.d = bVar == null ? new b(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this) : bVar;
        this.g = aVar2 == null ? new a(cVar) : aVar2;
        this.e = pVar == null ? new p() : pVar;
        memoryCache.setResourceRemovedListener(this);
    }
}

package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestOptions;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideBuilder {
    private Engine b;
    private BitmapPool c;
    private ArrayPool d;
    private MemoryCache e;
    private GlideExecutor f;
    private GlideExecutor g;
    private DiskCache.Factory h;
    private MemorySizeCalculator i;
    private ConnectivityMonitorFactory j;

    @Nullable
    private RequestManagerRetriever.RequestManagerFactory m;
    private GlideExecutor n;
    private boolean o;
    private final Map<Class<?>, TransitionOptions<?, ?>> a = new ArrayMap();
    private int k = 4;
    private RequestOptions l = new RequestOptions();

    @NonNull
    public Glide a(@NonNull Context context) {
        if (this.f == null) {
            this.f = GlideExecutor.newSourceExecutor();
        }
        if (this.g == null) {
            this.g = GlideExecutor.newDiskCacheExecutor();
        }
        if (this.n == null) {
            this.n = GlideExecutor.newAnimationExecutor();
        }
        if (this.i == null) {
            this.i = new MemorySizeCalculator.Builder(context).build();
        }
        if (this.j == null) {
            this.j = new DefaultConnectivityMonitorFactory();
        }
        if (this.c == null) {
            int bitmapPoolSize = this.i.getBitmapPoolSize();
            if (bitmapPoolSize > 0) {
                this.c = new LruBitmapPool(bitmapPoolSize);
            } else {
                this.c = new BitmapPoolAdapter();
            }
        }
        if (this.d == null) {
            this.d = new LruArrayPool(this.i.getArrayPoolSizeInBytes());
        }
        if (this.e == null) {
            this.e = new LruResourceCache(this.i.getMemoryCacheSize());
        }
        if (this.h == null) {
            this.h = new InternalCacheDiskCacheFactory(context);
        }
        if (this.b == null) {
            this.b = new Engine(this.e, this.h, this.g, this.f, GlideExecutor.newUnlimitedSourceExecutor(), GlideExecutor.newAnimationExecutor(), this.o);
        }
        return new Glide(context, this.b, this.e, this.c, this.d, new RequestManagerRetriever(this.m), this.j, this.k, this.l.lock(), this.a);
    }

    public GlideBuilder b(Engine engine) {
        this.b = engine;
        return this;
    }

    public void c(@Nullable RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.m = requestManagerFactory;
    }

    @NonNull
    public GlideBuilder setAnimationExecutor(@Nullable GlideExecutor glideExecutor) {
        this.n = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setArrayPool(@Nullable ArrayPool arrayPool) {
        this.d = arrayPool;
        return this;
    }

    @NonNull
    public GlideBuilder setBitmapPool(@Nullable BitmapPool bitmapPool) {
        this.c = bitmapPool;
        return this;
    }

    @NonNull
    public GlideBuilder setConnectivityMonitorFactory(@Nullable ConnectivityMonitorFactory connectivityMonitorFactory) {
        this.j = connectivityMonitorFactory;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@Nullable RequestOptions requestOptions) {
        this.l = requestOptions;
        return this;
    }

    @NonNull
    public <T> GlideBuilder setDefaultTransitionOptions(@NonNull Class<T> cls, @Nullable TransitionOptions<?, T> transitionOptions) {
        this.a.put(cls, transitionOptions);
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCache(@Nullable DiskCache.Factory factory) {
        this.h = factory;
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCacheExecutor(@Nullable GlideExecutor glideExecutor) {
        this.g = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setIsActiveResourceRetentionAllowed(boolean z) {
        this.o = z;
        return this;
    }

    @NonNull
    public GlideBuilder setLogLevel(int i) {
        if (i < 2 || i > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.k = i;
        return this;
    }

    @NonNull
    public GlideBuilder setMemoryCache(@Nullable MemoryCache memoryCache) {
        this.e = memoryCache;
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@NonNull MemorySizeCalculator.Builder builder) {
        return setMemorySizeCalculator(builder.build());
    }

    @Deprecated
    public GlideBuilder setResizeExecutor(@Nullable GlideExecutor glideExecutor) {
        return setSourceExecutor(glideExecutor);
    }

    @NonNull
    public GlideBuilder setSourceExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@Nullable MemorySizeCalculator memorySizeCalculator) {
        this.i = memorySizeCalculator;
        return this;
    }
}

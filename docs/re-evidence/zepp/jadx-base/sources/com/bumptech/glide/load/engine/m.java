package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* JADX INFO: loaded from: classes2.dex */
final class m<Z> implements Resource<Z>, FactoryPools.Poolable {
    private static final Pools.Pool<m<?>> e = FactoryPools.threadSafe(20, new a());
    private final StateVerifier a = StateVerifier.newInstance();
    private Resource<Z> b;
    private boolean c;
    private boolean d;

    public class a implements FactoryPools.Factory<m<?>> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m<?> create() {
            return new m<>();
        }
    }

    private void a(Resource<Z> resource) {
        this.d = false;
        this.c = true;
        this.b = resource;
    }

    @NonNull
    public static <Z> m<Z> b(Resource<Z> resource) {
        m<Z> mVar = (m) Preconditions.checkNotNull(e.acquire());
        mVar.a(resource);
        return mVar;
    }

    private void c() {
        this.b = null;
        e.release(this);
    }

    public synchronized void d() {
        this.a.throwIfRecycled();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Z get() {
        return this.b.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class<Z> getResourceClass() {
        return this.b.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.b.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    public StateVerifier getVerifier() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
        this.a.throwIfRecycled();
        this.d = true;
        if (!this.c) {
            this.b.recycle();
            c();
        }
    }
}

package com.bumptech.glide.load.engine;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
class k<Z> implements Resource<Z> {
    private final boolean a;
    private final boolean b;
    private a c;
    private Key d;
    private int e;
    private boolean f;
    private final Resource<Z> g;

    public interface a {
        void onResourceReleased(Key key, k<?> kVar);
    }

    public k(Resource<Z> resource, boolean z, boolean z2) {
        this.g = (Resource) Preconditions.checkNotNull(resource);
        this.a = z;
        this.b = z2;
    }

    public void a() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.e++;
    }

    public Resource<Z> b() {
        return this.g;
    }

    public boolean c() {
        return this.a;
    }

    public void d() {
        if (this.e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.c.onResourceReleased(this.d, this);
        }
    }

    public void e(Key key, a aVar) {
        this.d = key;
        this.c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Z get() {
        return this.g.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class<Z> getResourceClass() {
        return this.g.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.g.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        if (this.b) {
            this.g.recycle();
        }
    }

    public String toString() {
        return "EngineResource{isCacheable=" + this.a + ", listener=" + this.c + ", key=" + this.d + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + this.g + '}';
    }
}

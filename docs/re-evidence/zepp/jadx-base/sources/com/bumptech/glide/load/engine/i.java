package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class i implements Key {
    private final Object a;
    private final int b;
    private final int c;
    private final Class<?> d;
    private final Class<?> e;
    private final Key f;
    private final Map<Class<?>, Transformation<?>> g;
    private final Options h;
    private int i;

    public i(Object obj, Key key, int i, int i2, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options options) {
        this.a = Preconditions.checkNotNull(obj);
        this.f = (Key) Preconditions.checkNotNull(key, "Signature must not be null");
        this.b = i;
        this.c = i2;
        this.g = (Map) Preconditions.checkNotNull(map);
        this.d = (Class) Preconditions.checkNotNull(cls, "Resource class must not be null");
        this.e = (Class) Preconditions.checkNotNull(cls2, "Transcode class must not be null");
        this.h = (Options) Preconditions.checkNotNull(options);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f.equals(iVar.f) && this.c == iVar.c && this.b == iVar.b && this.g.equals(iVar.g) && this.d.equals(iVar.d) && this.e.equals(iVar.e) && this.h.equals(iVar.h);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.i == 0) {
            int iHashCode = this.a.hashCode();
            this.i = iHashCode;
            int iHashCode2 = (iHashCode * 31) + this.f.hashCode();
            this.i = iHashCode2;
            int i = (iHashCode2 * 31) + this.b;
            this.i = i;
            int i2 = (i * 31) + this.c;
            this.i = i2;
            int iHashCode3 = (i2 * 31) + this.g.hashCode();
            this.i = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.d.hashCode();
            this.i = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.e.hashCode();
            this.i = iHashCode5;
            this.i = (iHashCode5 * 31) + this.h.hashCode();
        }
        return this.i;
    }

    public String toString() {
        return "EngineKey{model=" + this.a + ", width=" + this.b + ", height=" + this.c + ", resourceClass=" + this.d + ", transcodeClass=" + this.e + ", signature=" + this.f + ", hashCode=" + this.i + ", transformations=" + this.g + ", options=" + this.h + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}

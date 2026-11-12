package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class o implements Key {
    private static final LruCache<Class<?>, byte[]> i = new LruCache<>(50);
    private final ArrayPool a;
    private final Key b;
    private final Key c;
    private final int d;
    private final int e;
    private final Class<?> f;
    private final Options g;
    private final Transformation<?> h;

    public o(ArrayPool arrayPool, Key key, Key key2, int i2, int i3, Transformation<?> transformation, Class<?> cls, Options options) {
        this.a = arrayPool;
        this.b = key;
        this.c = key2;
        this.d = i2;
        this.e = i3;
        this.h = transformation;
        this.f = cls;
        this.g = options;
    }

    private byte[] a() {
        LruCache<Class<?>, byte[]> lruCache = i;
        byte[] bArr = lruCache.get(this.f);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f.getName().getBytes(Key.CHARSET);
        lruCache.put(this.f, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.e == oVar.e && this.d == oVar.d && Util.bothNullOrEqual(this.h, oVar.h) && this.f.equals(oVar.f) && this.b.equals(oVar.b) && this.c.equals(oVar.c) && this.g.equals(oVar.g);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        int iHashCode = (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
        Transformation<?> transformation = this.h;
        if (transformation != null) {
            iHashCode = (iHashCode * 31) + transformation.hashCode();
        }
        return (((iHashCode * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.b + ", signature=" + this.c + ", width=" + this.d + ", height=" + this.e + ", decodedResourceClass=" + this.f + ", transformation='" + this.h + "', options=" + this.g + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.a.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.d).putInt(this.e).array();
        this.c.updateDiskCacheKey(messageDigest);
        this.b.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> transformation = this.h;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.g.updateDiskCacheKey(messageDigest);
        messageDigest.update(a());
        this.a.put(bArr);
    }
}

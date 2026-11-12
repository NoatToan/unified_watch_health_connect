package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class LruBitmapPool implements BitmapPool {
    private static final String k = "LruBitmapPool";
    private static final Bitmap.Config l = Bitmap.Config.ARGB_8888;
    private final e a;
    private final Set<Bitmap.Config> b;
    private final long c;
    private final a d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;

    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static final class b implements a {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.a
        public void b(Bitmap bitmap) {
        }
    }

    public static class c implements a {
        private final Set<Bitmap> a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.a
        public void a(Bitmap bitmap) {
            if (!this.a.contains(bitmap)) {
                this.a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.a
        public void b(Bitmap bitmap) {
            if (!this.a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.a.remove(bitmap);
        }
    }

    public LruBitmapPool(long j, e eVar, Set<Bitmap.Config> set) {
        this.c = j;
        this.e = j;
        this.a = eVar;
        this.b = set;
        this.d = new b();
    }

    @TargetApi(26)
    private static void a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    private static Bitmap b(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = l;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void c() {
        if (Log.isLoggable(k, 2)) {
            d();
        }
    }

    private void d() {
        Log.v(k, "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    private void e() {
        k(this.e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> f() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            hashSet.add(null);
        }
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static e g() {
        return Build.VERSION.SDK_INT >= 19 ? new SizeConfigStrategy() : new com.bumptech.glide.load.engine.bitmap_recycle.b();
    }

    @Nullable
    private synchronized Bitmap h(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap bitmap;
        a(config);
        bitmap = this.a.get(i, i2, config != null ? config : l);
        if (bitmap == null) {
            if (Log.isLoggable(k, 3)) {
                Log.d(k, "Missing bitmap=" + this.a.logBitmap(i, i2, config));
            }
            this.h++;
        } else {
            this.g++;
            this.f -= (long) this.a.getSize(bitmap);
            this.d.b(bitmap);
            j(bitmap);
        }
        if (Log.isLoggable(k, 2)) {
            Log.v(k, "Get bitmap=" + this.a.logBitmap(i, i2, config));
        }
        c();
        return bitmap;
    }

    @TargetApi(19)
    private static void i(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void j(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        i(bitmap);
    }

    private synchronized void k(long j) {
        while (this.f > j) {
            Bitmap bitmapRemoveLast = this.a.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable(k, 5)) {
                    Log.w(k, "Size mismatch, resetting");
                    d();
                }
                this.f = 0L;
                return;
            }
            this.d.b(bitmapRemoveLast);
            this.f -= (long) this.a.getSize(bitmapRemoveLast);
            this.j++;
            if (Log.isLoggable(k, 3)) {
                Log.d(k, "Evicting bitmap=" + this.a.logBitmap(bitmapRemoveLast));
            }
            c();
            bitmapRemoveLast.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        if (Log.isLoggable(k, 3)) {
            Log.d(k, "clearMemory");
        }
        k(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        if (bitmapH == null) {
            return b(i, i2, config);
        }
        bitmapH.eraseColor(0);
        return bitmapH;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapH = h(i, i2, config);
        return bitmapH == null ? b(i, i2, config) : bitmapH;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.a.getSize(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                int size = this.a.getSize(bitmap);
                this.a.put(bitmap);
                this.d.a(bitmap);
                this.i++;
                this.f += (long) size;
                if (Log.isLoggable(k, 2)) {
                    Log.v(k, "Put bitmap in pool=" + this.a.logBitmap(bitmap));
                }
                c();
                e();
                return;
            }
            if (Log.isLoggable(k, 2)) {
                Log.v(k, "Reject bitmap from pool, bitmap: " + this.a.logBitmap(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float f) {
        this.e = Math.round(this.c * f);
        e();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (Log.isLoggable(k, 3)) {
            Log.d(k, "trimMemory, level=" + i);
        }
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            k(getMaxSize() / 2);
        }
    }

    public LruBitmapPool(long j) {
        this(j, g(), f());
    }

    public LruBitmapPool(long j, Set<Bitmap.Config> set) {
        this(j, g(), set);
    }
}

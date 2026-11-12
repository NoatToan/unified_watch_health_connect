package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Runnable {

    @VisibleForTesting
    public static final String i = "PreFillRunner";
    public static final long k = 32;
    public static final long l = 40;
    public static final int m = 4;
    private final BitmapPool a;
    private final MemoryCache b;
    private final com.bumptech.glide.load.engine.prefill.b c;
    private final C0125a d;
    private final Set<PreFillType> e;
    private final Handler f;
    private long g;
    private boolean h;
    private static final C0125a j = new C0125a();
    public static final long n = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.prefill.a$a, reason: collision with other inner class name */
    @VisibleForTesting
    public static class C0125a {
        public long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    public static final class b implements Key {
        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(BitmapPool bitmapPool, MemoryCache memoryCache, com.bumptech.glide.load.engine.prefill.b bVar) {
        this(bitmapPool, memoryCache, bVar, j, new Handler(Looper.getMainLooper()));
    }

    private long b() {
        return this.b.getMaxSize() - this.b.getCurrentSize();
    }

    private long c() {
        long j2 = this.g;
        this.g = Math.min(4 * j2, n);
        return j2;
    }

    private boolean d(long j2) {
        return this.d.a() - j2 >= 32;
    }

    @VisibleForTesting
    public boolean a() {
        Bitmap bitmapCreateBitmap;
        long jA = this.d.a();
        while (!this.c.b() && !d(jA)) {
            PreFillType preFillTypeC = this.c.c();
            if (this.e.contains(preFillTypeC)) {
                bitmapCreateBitmap = Bitmap.createBitmap(preFillTypeC.d(), preFillTypeC.b(), preFillTypeC.a());
            } else {
                this.e.add(preFillTypeC);
                bitmapCreateBitmap = this.a.getDirty(preFillTypeC.d(), preFillTypeC.b(), preFillTypeC.a());
            }
            int bitmapByteSize = Util.getBitmapByteSize(bitmapCreateBitmap);
            if (b() >= bitmapByteSize) {
                this.b.put(new b(), BitmapResource.obtain(bitmapCreateBitmap, this.a));
            } else {
                this.a.put(bitmapCreateBitmap);
            }
            if (Log.isLoggable(i, 3)) {
                Log.d(i, "allocated [" + preFillTypeC.d() + "x" + preFillTypeC.b() + "] " + preFillTypeC.a() + " size: " + bitmapByteSize);
            }
        }
        return (this.h || this.c.b()) ? false : true;
    }

    public void cancel() {
        this.h = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a()) {
            this.f.postDelayed(this, c());
        }
    }

    @VisibleForTesting
    public a(BitmapPool bitmapPool, MemoryCache memoryCache, com.bumptech.glide.load.engine.prefill.b bVar, C0125a c0125a, Handler handler) {
        this.e = new HashSet();
        this.g = 40L;
        this.a = bitmapPool;
        this.b = memoryCache;
        this.c = bVar;
        this.d = c0125a;
        this.f = handler;
    }
}

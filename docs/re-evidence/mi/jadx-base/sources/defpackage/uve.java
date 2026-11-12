package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class uve implements cq2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f36186k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yve f36187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f36188b;
    public final long c;
    public final a d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;

    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static final class b implements a {
        @Override // uve.a
        public void a(Bitmap bitmap) {
        }

        @Override // uve.a
        public void b(Bitmap bitmap) {
        }
    }

    public uve(long j, yve yveVar, Set<Bitmap.Config> set) {
        this.c = j;
        this.e = j;
        this.f36187a = yveVar;
        this.f36188b = set;
        this.d = new b();
    }

    @TargetApi(26)
    public static void d(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    public static Bitmap e(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f36186k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> i() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    public static yve j() {
        return new xem();
    }

    @TargetApi(19)
    public static void m(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void n(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m(bitmap);
    }

    @Override // defpackage.cq2
    public synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f36187a.d(bitmap) <= this.e && this.f36188b.contains(bitmap.getConfig())) {
                int iD = this.f36187a.d(bitmap);
                this.f36187a.a(bitmap);
                this.d.a(bitmap);
                this.i++;
                this.f += (long) iD;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Put bitmap in pool=");
                    sb.append(this.f36187a.e(bitmap));
                }
                f();
                h();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reject bitmap from pool, bitmap: ");
                sb2.append(this.f36187a.e(bitmap));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f36188b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.cq2
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapK = k(i, i2, config);
        if (bitmapK == null) {
            return e(i, i2, config);
        }
        bitmapK.eraseColor(0);
        return bitmapK;
    }

    @Override // defpackage.cq2
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapK = k(i, i2, config);
        return bitmapK == null ? e(i, i2, config) : bitmapK;
    }

    @Override // defpackage.cq2
    public void clearMemory() {
        Log.isLoggable("LruBitmapPool", 3);
        o(0L);
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.g);
        sb.append(", misses=");
        sb.append(this.h);
        sb.append(", puts=");
        sb.append(this.i);
        sb.append(", evictions=");
        sb.append(this.j);
        sb.append(", currentSize=");
        sb.append(this.f);
        sb.append(", maxSize=");
        sb.append(this.e);
        sb.append("\nStrategy=");
        sb.append(this.f36187a);
    }

    public final void h() {
        o(this.e);
    }

    public final synchronized Bitmap k(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            d(config);
            bitmapB = this.f36187a.b(i, i2, config != null ? config : f36186k);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    sb.append(this.f36187a.c(i, i2, config));
                }
                this.h++;
            } else {
                this.g++;
                this.f -= (long) this.f36187a.d(bitmapB);
                this.d.b(bitmapB);
                n(bitmapB);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                sb2.append(this.f36187a.c(i, i2, config));
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public long l() {
        return this.e;
    }

    public final synchronized void o(long j) {
        while (this.f > j) {
            try {
                Bitmap bitmapRemoveLast = this.f36187a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        g();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.b(bitmapRemoveLast);
                this.f -= (long) this.f36187a.d(bitmapRemoveLast);
                this.j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.f36187a.e(bitmapRemoveLast));
                }
                f();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cq2
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 40 || i >= 20) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            o(l() / 2);
        }
    }

    public uve(long j) {
        this(j, j(), i());
    }
}

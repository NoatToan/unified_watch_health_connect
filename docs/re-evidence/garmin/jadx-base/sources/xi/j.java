package xi;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class j implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config f191089f = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f191090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f191091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f191092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f191093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f191094e;

    public static final class a {
    }

    public j(long j8) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        this(j8, mVar, Collections.unmodifiableSet(hashSet));
    }

    @Override // xi.d
    public final void a() {
        g(0L);
    }

    @Override // xi.d
    @SuppressLint({"InlinedApi"})
    public final void b(int i14) {
        if (i14 >= 40 || i14 >= 20) {
            a();
        } else if (i14 >= 20 || i14 == 15) {
            g(this.f191093d / 2);
        }
    }

    @Override // xi.d
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((m) this.f191090a).getClass();
                if (qj.m.c(bitmap) <= this.f191093d && this.f191091b.contains(bitmap.getConfig())) {
                    ((m) this.f191090a).getClass();
                    int iC = qj.m.c(bitmap);
                    ((m) this.f191090a).e(bitmap);
                    this.f191092c.getClass();
                    this.f191094e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((m) this.f191090a).getClass();
                        m.c(qj.m.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f191090a);
                    }
                    g(this.f191093d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((m) this.f191090a).getClass();
                m.c(qj.m.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.f191091b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // xi.d
    public final Bitmap d(int i14, int i15, Bitmap.Config config) {
        Bitmap bitmapF = f(i14, i15, config);
        if (bitmapF != null) {
            return bitmapF;
        }
        if (config == null) {
            config = f191089f;
        }
        return Bitmap.createBitmap(i14, i15, config);
    }

    @Override // xi.d
    public final Bitmap e(int i14, int i15, Bitmap.Config config) {
        Bitmap bitmapF = f(i14, i15, config);
        if (bitmapF != null) {
            bitmapF.eraseColor(0);
            return bitmapF;
        }
        if (config == null) {
            config = f191089f;
        }
        return Bitmap.createBitmap(i14, i15, config);
    }

    public final synchronized Bitmap f(int i14, int i15, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = ((m) this.f191090a).b(i14, i15, config != null ? config : f191089f);
            if (bitmapB != null) {
                long j8 = this.f191094e;
                ((m) this.f191090a).getClass();
                this.f191094e = j8 - ((long) qj.m.c(bitmapB));
                this.f191092c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                ((m) this.f191090a).getClass();
                m.c(qj.m.d(config) * i14 * i15, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((m) this.f191090a).getClass();
                m.c(qj.m.d(config) * i14 * i15, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f191090a);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return bitmapB;
    }

    public final synchronized void g(long j8) {
        while (this.f191094e > j8) {
            m mVar = (m) this.f191090a;
            Bitmap bitmapC = mVar.f191101b.c();
            if (bitmapC != null) {
                mVar.a(Integer.valueOf(qj.m.c(bitmapC)), bitmapC);
            }
            if (bitmapC == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f191090a);
                }
                this.f191094e = 0L;
                return;
            }
            this.f191092c.getClass();
            long j14 = this.f191094e;
            ((m) this.f191090a).getClass();
            this.f191094e = j14 - ((long) qj.m.c(bitmapC));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((m) this.f191090a).getClass();
                m.c(qj.m.c(bitmapC), bitmapC.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f191090a);
            }
            bitmapC.recycle();
        }
    }

    public j(long j8, k kVar, Set<Bitmap.Config> set) {
        this.f191093d = j8;
        this.f191090a = kVar;
        this.f191091b = set;
        this.f191092c = new a();
    }

    public j(long j8, Set<Bitmap.Config> set) {
        this(j8, new m(), set);
    }
}

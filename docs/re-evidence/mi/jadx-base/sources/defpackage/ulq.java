package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class ulq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f35917a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f35918b = new char[64];
    public static volatile Handler c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35919a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f35919a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35919a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35919a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35919a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35919a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(nb2<?> nb2Var, nb2<?> nb2Var2) {
        if (nb2Var == null) {
            return nb2Var2 == null;
        }
        return nb2Var.D(nb2Var2);
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof z6g ? ((z6g) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static String f(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f35917a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> g(int i) {
        return new ArrayDeque(i);
    }

    public static int h(int i, int i2, Bitmap.Config config) {
        return i * i2 * j(config);
    }

    @TargetApi(19)
    public static int i(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.f35919a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    public static <T> List<T> k(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static Handler l() {
        if (c == null) {
            synchronized (ulq.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static int m(float f) {
        return n(f, 17);
    }

    public static int n(float f, int i) {
        return o(Float.floatToIntBits(f), i);
    }

    public static int o(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int p(Object obj, int i) {
        return o(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int q(boolean z, int i) {
        return o(z ? 1 : 0, i);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean u(int i, int i2) {
        return t(i) && t(i2);
    }

    public static void v(Runnable runnable) {
        l().post(runnable);
    }

    public static void w(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String strF;
        char[] cArr = f35918b;
        synchronized (cArr) {
            strF = f(bArr, cArr);
        }
        return strF;
    }
}

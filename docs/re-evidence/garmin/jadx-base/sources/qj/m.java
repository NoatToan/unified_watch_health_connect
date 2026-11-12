package qj;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f144982a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f144983b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile Handler f144984c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f144985a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f144985a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f144985a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f144985a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f144985a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f144985a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private m() {
    }

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        vb.h.s("You must call this method on the main thread");
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @TargetApi(19)
    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb3 = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb3.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb3.append("[");
        sb3.append(width);
        sb3.append("x");
        sb3.append(height);
        sb3.append("] ");
        sb3.append(config);
        throw new IllegalStateException(sb3.toString());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i14 = a.f144985a[config.ordinal()];
        int i15 = 1;
        if (i14 != 1) {
            i15 = 2;
            if (i14 != 2 && i14 != 3) {
                return i14 != 4 ? 4 : 8;
            }
        }
        return i15;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f144984c == null) {
            synchronized (m.class) {
                try {
                    if (f144984c == null) {
                        f144984c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f144984c;
    }

    public static int g(int i14, int i15) {
        return (i15 * 31) + i14;
    }

    public static int h(int i14, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i14);
    }

    public static boolean i(int i14, int i15) {
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            return i15 > 0 || i15 == Integer.MIN_VALUE;
        }
        return false;
    }
}

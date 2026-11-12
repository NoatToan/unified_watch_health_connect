package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import androidx.core.util.Pools;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class jq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pools.SynchronizedPool<ByteBuffer> f23012a = new Pools.SynchronizedPool<>(12);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23013a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f23013a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23013a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23013a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23013a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23013a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        b6i.g(inputStream);
        ByteBuffer byteBufferAcquire = f23012a.acquire();
        if (byteBufferAcquire == null) {
            byteBufferAcquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAcquire.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f23012a.release(byteBufferAcquire);
        }
    }

    public static x4d b(InputStream inputStream) {
        b6i.g(inputStream);
        ByteBuffer byteBufferAcquire = f23012a.acquire();
        if (byteBufferAcquire == null) {
            byteBufferAcquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAcquire.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new x4d(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            f23012a.release(byteBufferAcquire);
        }
    }

    public static int c(Bitmap.Config config) {
        int i = a.f23013a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    public static int d(int i, int i2, Bitmap.Config config) {
        return i * i2 * c(config);
    }

    @SuppressLint({"NewApi"})
    public static int e(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}

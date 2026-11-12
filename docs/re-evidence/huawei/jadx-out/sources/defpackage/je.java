package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes21.dex */
public final class je {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f38446c = new ThreadLocal<PathMeasure>() { // from class: je.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Path> f38445b = new ThreadLocal<Path>() { // from class: je.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> d = new ThreadLocal<Path>() { // from class: je.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> e = new ThreadLocal<float[]>() { // from class: je.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f38444a = (float) (Math.sqrt(2.0d) / 2.0d);

    public static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static int c(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static Path b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float b(Matrix matrix) {
        float[] fArr = e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f38444a;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean d(Matrix matrix) {
        float[] fArr = e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void c(Path path, ev evVar) {
        if (evVar == null || evVar.b()) {
            return;
        }
        e(path, ((fd) evVar.a()).a() / 100.0f, ((fd) evVar.d()).a() / 100.0f, ((fd) evVar.c()).a() / 360.0f);
    }

    public static void e(Path path, float f, float f2, float f3) {
        if (cv.e()) {
            cv.c("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f38446c.get();
        Path path2 = f38445b.get();
        Path path3 = d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            if (cv.e()) {
                cv.e("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            if (cv.e()) {
                cv.e("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = jc.c(fMin, length);
            fMax = jc.c(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = jc.c(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = jc.c(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            if (cv.e()) {
                cv.e("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        if (cv.e()) {
            cv.e("applyTrimPathIfNeeded");
        }
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float e(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        c(canvas, rectF, paint, 31);
    }

    public static void c(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (cv.e()) {
            cv.c("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (cv.e()) {
            cv.e("Utils#saveLayer");
        }
    }
}

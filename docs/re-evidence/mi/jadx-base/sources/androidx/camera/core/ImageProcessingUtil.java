package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import defpackage.eem;
import defpackage.f6d;
import defpackage.p5d;
import defpackage.zpe;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1686a;

    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean c(m mVar) {
        if (!h(mVar)) {
            zpe.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(mVar) != a.ERROR_CONVERSION) {
            return true;
        }
        zpe.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    public static a d(m mVar) {
        int width = mVar.getWidth();
        int height = mVar.getHeight();
        int iA = mVar.x()[0].a();
        int iA2 = mVar.x()[1].a();
        int iA3 = mVar.x()[2].a();
        int iB = mVar.x()[0].b();
        int iB2 = mVar.x()[1].b();
        return nativeShiftPixel(mVar.x()[0].getBuffer(), iA, mVar.x()[1].getBuffer(), iA2, mVar.x()[2].getBuffer(), iA3, iB, iB2, width, height, iB, iB2, iB2) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static m e(final m mVar, p5d p5dVar, ByteBuffer byteBuffer, @IntRange(from = 0, to = 359) int i, boolean z) {
        if (!h(mVar)) {
            zpe.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!g(i)) {
            zpe.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (f(mVar, p5dVar.a(), byteBuffer, i, z) == a.ERROR_CONVERSION) {
            zpe.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            zpe.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f1686a)));
            f1686a++;
        }
        final m mVarG = p5dVar.g();
        if (mVarG == null) {
            zpe.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        eem eemVar = new eem(mVarG);
        eemVar.addOnImageCloseListener(new f.a() { // from class: androidx.camera.core.k
            @Override // androidx.camera.core.f.a
            public final void f(m mVar2) {
                ImageProcessingUtil.i(mVarG, mVar, mVar2);
            }
        });
        return eemVar;
    }

    public static a f(m mVar, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int width = mVar.getWidth();
        int height = mVar.getHeight();
        int iA = mVar.x()[0].a();
        int iA2 = mVar.x()[1].a();
        int iA3 = mVar.x()[2].a();
        int iB = mVar.x()[0].b();
        int iB2 = mVar.x()[1].b();
        return nativeConvertAndroid420ToABGR(mVar.x()[0].getBuffer(), iA, mVar.x()[1].getBuffer(), iA2, mVar.x()[2].getBuffer(), iA3, iB, iB2, surface, byteBuffer, width, height, z ? iB : 0, z ? iB2 : 0, z ? iB2 : 0, i) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static boolean g(@IntRange(from = 0, to = 359) int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean h(m mVar) {
        return mVar.getFormat() == 35 && mVar.x().length == 3;
    }

    public static /* synthetic */ void i(m mVar, m mVar2, m mVar3) {
        if (mVar == null || mVar2 == null) {
            return;
        }
        mVar2.close();
    }

    public static /* synthetic */ void j(m mVar, m mVar2, m mVar3) {
        if (mVar == null || mVar2 == null) {
            return;
        }
        mVar2.close();
    }

    public static m k(final m mVar, p5d p5dVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, @IntRange(from = 0, to = 359) int i) {
        if (!h(mVar)) {
            zpe.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!g(i)) {
            zpe.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar = a.ERROR_CONVERSION;
        if ((i > 0 ? l(mVar, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i) : aVar) == aVar) {
            zpe.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final m mVarG = p5dVar.g();
        if (mVarG == null) {
            zpe.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        eem eemVar = new eem(mVarG);
        eemVar.addOnImageCloseListener(new f.a() { // from class: androidx.camera.core.l
            @Override // androidx.camera.core.f.a
            public final void f(m mVar2) {
                ImageProcessingUtil.j(mVarG, mVar, mVar2);
            }
        });
        return eemVar;
    }

    @RequiresApi(23)
    public static a l(m mVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int width = mVar.getWidth();
        int height = mVar.getHeight();
        int iA = mVar.x()[0].a();
        int iA2 = mVar.x()[1].a();
        int iA3 = mVar.x()[2].a();
        int iB = mVar.x()[1].b();
        Image imageB = f6d.b(imageWriter);
        if (imageB != null && nativeRotateYUV(mVar.x()[0].getBuffer(), iA, mVar.x()[1].getBuffer(), iA2, mVar.x()[2].getBuffer(), iA3, iB, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
            f6d.e(imageWriter, imageB);
            return a.SUCCESS;
        }
        return a.ERROR_CONVERSION;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}

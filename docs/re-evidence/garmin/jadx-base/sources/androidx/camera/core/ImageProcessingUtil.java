package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.o1;
import b0.b1;
import b0.n0;
import java.nio.ByteBuffer;
import java.util.Locale;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f5418a;

    public static class a extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e.a[] f5419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5421f;

        public a(e eVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i14, int i15, int i16) {
            super(eVar);
            this.f5419d = new e.a[]{new d(this, i14, byteBuffer), new b(byteBuffer2, i14), new b(byteBuffer3, i14)};
            this.f5420e = i14;
            this.f5421f = i15;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.e
        public final e.a[] A2() {
            return this.f5419d;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.e
        public final int getHeight() {
            return this.f5421f;
        }

        @Override // androidx.camera.core.b, androidx.camera.core.e
        public final int getWidth() {
            return this.f5420e;
        }
    }

    public static class b implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5423b;

        public b(ByteBuffer byteBuffer, int i14) {
            this.f5422a = byteBuffer;
            this.f5423b = i14;
        }

        @Override // androidx.camera.core.e.a
        public final ByteBuffer d() {
            return this.f5422a;
        }

        @Override // androidx.camera.core.e.a
        public final int e() {
            return this.f5423b;
        }

        @Override // androidx.camera.core.e.a
        public final int f() {
            return 2;
        }
    }

    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    private ImageProcessingUtil() {
    }

    public static void a(e eVar) {
        if (h(eVar)) {
            int width = eVar.getWidth();
            int height = eVar.getHeight();
            int iE = eVar.A2()[0].e();
            int iE2 = eVar.A2()[1].e();
            int iE3 = eVar.A2()[2].e();
            int iF = eVar.A2()[0].f();
            int iF2 = eVar.A2()[1].f();
            if (nativeShiftPixel(eVar.A2()[0].d(), iE, eVar.A2()[1].d(), iE2, eVar.A2()[2].d(), iE3, iF, iF2, width, height, iF, iF2, iF2) != 0) {
                c cVar = c.SUCCESS;
            } else {
                c cVar2 = c.SUCCESS;
            }
            c cVar3 = c.SUCCESS;
        }
    }

    public static e b(g gVar, byte[] bArr) {
        h.a(gVar.f() == 256);
        bArr.getClass();
        Surface surface = gVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            return null;
        }
        return gVar.b();
    }

    public static Bitmap c(e eVar) {
        if (eVar.getFormat() != 35) {
            vb.h.s("Input image format must be YUV_420_888");
            return null;
        }
        int width = eVar.getWidth();
        int height = eVar.getHeight();
        int iE = eVar.A2()[0].e();
        int iE2 = eVar.A2()[1].e();
        int iE3 = eVar.A2()[2].e();
        int iF = eVar.A2()[0].f();
        int iF2 = eVar.A2()[1].f();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(eVar.getWidth(), eVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(eVar.A2()[0].d(), iE, eVar.A2()[1].d(), iE2, eVar.A2()[2].d(), iE3, iF, iF2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        org.apache.commons.lang3.e.w("YUV to RGB conversion failed");
        return null;
    }

    public static b1 d(e eVar, o1 o1Var, ByteBuffer byteBuffer, int i14, boolean z14) {
        if (!h(eVar)) {
            return null;
        }
        System.currentTimeMillis();
        if (!g(i14)) {
            return null;
        }
        Surface surface = o1Var.getSurface();
        int width = eVar.getWidth();
        int height = eVar.getHeight();
        int iE = eVar.A2()[0].e();
        int iE2 = eVar.A2()[1].e();
        int iE3 = eVar.A2()[2].e();
        int iF = eVar.A2()[0].f();
        int iF2 = eVar.A2()[1].f();
        if ((nativeConvertAndroid420ToABGR(eVar.A2()[0].d(), iE, eVar.A2()[1].d(), iE2, eVar.A2()[2].d(), iE3, iF, iF2, surface, byteBuffer, width, height, z14 ? iF : 0, z14 ? iF2 : 0, z14 ? iF2 : 0, i14) != 0 ? c.ERROR_CONVERSION : c.SUCCESS) == c.ERROR_CONVERSION) {
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            f5418a++;
        }
        e eVarB = o1Var.b();
        if (eVarB == null) {
            return null;
        }
        b1 b1Var = new b1(eVarB);
        b1Var.a(new n0(eVarB, eVar, 0));
        return b1Var;
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i14) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i14, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(Bitmap bitmap, ByteBuffer byteBuffer, int i14) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i14, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean g(int i14) {
        return i14 == 0 || i14 == 90 || i14 == 180 || i14 == 270;
    }

    public static boolean h(e eVar) {
        return eVar.getFormat() == 35 && eVar.A2().length == 3;
    }

    public static b1 i(e eVar, o1 o1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i14) {
        c cVar;
        e eVarB;
        c cVar2;
        if (!h(eVar) || !g(i14)) {
            return null;
        }
        c cVar3 = c.ERROR_CONVERSION;
        if (i14 > 0) {
            int width = eVar.getWidth();
            int height = eVar.getHeight();
            int iE = eVar.A2()[0].e();
            int iE2 = eVar.A2()[1].e();
            int iE3 = eVar.A2()[2].e();
            int iF = eVar.A2()[1].f();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage == null) {
                cVar2 = cVar3;
            } else {
                cVar2 = cVar3;
                if (nativeRotateYUV(eVar.A2()[0].d(), iE, eVar.A2()[1].d(), iE2, eVar.A2()[2].d(), iE3, iF, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i14) != 0) {
                    cVar3 = cVar2;
                } else {
                    imageWriter.queueInputImage(imageDequeueInputImage);
                    cVar3 = c.SUCCESS;
                }
            }
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        if (cVar3 == cVar || (eVarB = o1Var.b()) == null) {
            return null;
        }
        b1 b1Var = new b1(eVarB);
        b1Var.a(new n0(eVarB, eVar, 1));
        return b1Var;
    }

    public static b1 j(e eVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i14) {
        if (!h(eVar) || !g(i14)) {
            return null;
        }
        if (i14 == 0 && eVar.A2().length == 3 && eVar.A2()[1].f() == 2 && nativeGetYUVImageVUOff(eVar.A2()[2].d(), eVar.A2()[1].d()) == -1) {
            return null;
        }
        int i15 = i14 % 180;
        int width = i15 == 0 ? eVar.getWidth() : eVar.getHeight();
        int height = i15 == 0 ? eVar.getHeight() : eVar.getWidth();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(eVar.A2()[0].d(), eVar.A2()[0].e(), eVar.A2()[1].d(), eVar.A2()[1].e(), eVar.A2()[2].d(), eVar.A2()[2].e(), eVar.A2()[2].f(), byteBuffer4, width, 1, byteBufferNativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, eVar.getWidth(), eVar.getHeight(), i14) != 0) {
            return null;
        }
        return new b1(new a(eVar, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, width, height, i14));
    }

    public static void k(byte[] bArr, Surface surface) {
        surface.getClass();
        nativeWriteJpegToSurface(bArr, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16, int i17, int i18, Surface surface, ByteBuffer byteBuffer4, int i19, int i24, int i25, int i26, int i27, int i28);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16, int i17, int i18, Bitmap bitmap, int i19, int i24, int i25);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i14, int i15, int i16, int i17, boolean z14);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i14, int i15);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16, int i17, ByteBuffer byteBuffer4, int i18, int i19, ByteBuffer byteBuffer5, int i24, int i25, ByteBuffer byteBuffer6, int i26, int i27, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i28, int i29, int i30);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}

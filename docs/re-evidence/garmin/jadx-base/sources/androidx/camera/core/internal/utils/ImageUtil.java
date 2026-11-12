package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.e;
import j0.j;
import j0.k;
import j0.l;
import j0.m;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import sn.a;

/* JADX INFO: loaded from: classes.dex */
public final class ImageUtil {
    private ImageUtil() {
    }

    public static Bitmap a(e eVar) {
        int format = eVar.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(eVar.getWidth(), eVar.getHeight(), Bitmap.Config.ARGB_8888);
            eVar.A2()[0].d().rewind();
            ImageProcessingUtil.f(bitmapCreateBitmap, eVar.A2()[0].d(), eVar.A2()[0].e());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(eVar);
        }
        if (format != 256 && format != 4101) {
            a.l(eVar.getFormat(), "Incorrect image format of the input image proxy: ", ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            return null;
        }
        if (!c(eVar.getFormat())) {
            a.z(eVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferD = eVar.A2()[0].d();
        int iCapacity = byteBufferD.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferD.rewind();
        byteBufferD.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        org.apache.commons.lang3.e.w("Decode jpeg byte array failed");
        return null;
    }

    public static Rational b(Rational rational, int i14) {
        if (i14 == 90 || i14 == 270) {
            return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static boolean c(int i14) {
        return i14 == 256 || i14 == 4101;
    }

    public static byte[] d(e eVar, Rect rect, int i14, int i15) throws CodecFailedException {
        if (eVar.getFormat() != 35) {
            a.z(eVar.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        e.a aVar = eVar.A2()[0];
        e.a aVar2 = eVar.A2()[1];
        int i16 = 2;
        e.a aVar3 = eVar.A2()[2];
        ByteBuffer byteBufferD = aVar.d();
        ByteBuffer byteBufferD2 = aVar2.d();
        ByteBuffer byteBufferD3 = aVar3.d();
        byteBufferD.rewind();
        byteBufferD2.rewind();
        byteBufferD3.rewind();
        int iRemaining = byteBufferD.remaining();
        byte[] bArr = new byte[((eVar.getHeight() * eVar.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i17 = 0; i17 < eVar.getHeight(); i17++) {
            byteBufferD.get(bArr, width, eVar.getWidth());
            width += eVar.getWidth();
            byteBufferD.position(Math.min(iRemaining, aVar.e() + (byteBufferD.position() - eVar.getWidth())));
        }
        int height = eVar.getHeight() / 2;
        int width2 = eVar.getWidth() / 2;
        int iE = aVar3.e();
        int iE2 = aVar2.e();
        int iF = aVar3.f();
        int iF2 = aVar2.f();
        byte[] bArr2 = new byte[iE];
        byte[] bArr3 = new byte[iE2];
        int i18 = 0;
        while (i18 < height) {
            int i19 = i16;
            byteBufferD3.get(bArr2, 0, Math.min(iE, byteBufferD3.remaining()));
            byteBufferD2.get(bArr3, 0, Math.min(iE2, byteBufferD2.remaining()));
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 0; i26 < width2; i26++) {
                int i27 = width + 1;
                bArr[width] = bArr2[i24];
                width += 2;
                bArr[i27] = bArr3[i25];
                i24 += iF;
                i25 += iF2;
            }
            i18++;
            i16 = i19;
        }
        int i28 = i16;
        YuvImage yuvImage = new YuvImage(bArr, 17, eVar.getWidth(), eVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m[] mVarArr = j.f95926c;
        j.b bVar = new j.b(ByteOrder.BIG_ENDIAN);
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = bVar.f95937a;
        bVar.c("Orientation", strValueOf, arrayList);
        bVar.c("XResolution", "72/1", arrayList);
        bVar.c("YResolution", "72/1", arrayList);
        bVar.c("ResolutionUnit", String.valueOf(i28), arrayList);
        bVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        bVar.c("Make", Build.MANUFACTURER, arrayList);
        bVar.c("Model", Build.MODEL, arrayList);
        if (eVar.A0() != null) {
            eVar.A0().c(bVar);
        }
        bVar.d(i15);
        bVar.c("ImageWidth", String.valueOf(eVar.getWidth()), arrayList);
        bVar.c("ImageLength", String.valueOf(eVar.getHeight()), arrayList);
        ArrayList list = Collections.list(new k(bVar));
        if (!((Map) list.get(1)).isEmpty()) {
            bVar.b("ExposureProgram", String.valueOf(0), list);
            bVar.b("ExifVersion", "0230", list);
            bVar.b("ComponentsConfiguration", j.f95929f, list);
            bVar.b("MeteringMode", String.valueOf(0), list);
            bVar.b("LightSource", String.valueOf(0), list);
            bVar.b("FlashpixVersion", "0100", list);
            bVar.b("FocalPlaneResolutionUnit", String.valueOf(i28), list);
            bVar.b("FileSource", String.valueOf(3), list);
            bVar.b("SceneType", String.valueOf(1), list);
            bVar.b("CustomRendered", String.valueOf(0), list);
            bVar.b("SceneCaptureType", String.valueOf(0), list);
            bVar.b("Contrast", String.valueOf(0), list);
            bVar.b("Saturation", String.valueOf(0), list);
            bVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i28)).isEmpty()) {
            bVar.b("GPSVersionID", "2300", list);
            bVar.b("GPSSpeedRef", "K", list);
            bVar.b("GPSTrackRef", "T", list);
            bVar.b("GPSImgDirectionRef", "T", list);
            bVar.b("GPSDestBearingRef", "T", list);
            bVar.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, eVar.getWidth(), eVar.getHeight()) : rect, i14, new l(byteArrayOutputStream, new j(bVar.f95938b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.a.ENCODE_FAILED);
    }

    public static final class CodecFailedException extends Exception {
        private final a mFailureType;

        public enum a {
            ENCODE_FAILED,
            /* JADX INFO: Fake field, exist only in values array */
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
            this.mFailureType = a.UNKNOWN;
        }

        public a getFailureType() {
            return this.mFailureType;
        }

        public CodecFailedException(String str, a aVar) {
            super(str);
            this.mFailureType = aVar;
        }
    }
}

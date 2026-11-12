package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;

/* JADX INFO: loaded from: classes2.dex */
public class afs {
    public static int a(byte[] bArr) {
        int i;
        byte b2;
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        if (bArr.length == 2) {
            i = (bArr[0] & 255) << 8;
            b2 = bArr[1];
        } else if (bArr.length == 3) {
            i = ((bArr[0] & 65535) << 16) | ((bArr[1] & 255) << 8);
            b2 = bArr[2];
        } else {
            if (bArr.length != 4) {
                return 0;
            }
            i = ((bArr[0] & 16777215) << 24) | ((bArr[1] & 65535) << 16) | ((bArr[2] & 255) << 8);
            b2 = bArr[3];
        }
        return i | (b2 & 255);
    }

    public static int b(byte[] bArr, int i, int i2) {
        return a(j(bArr, i, i2));
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap d(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, i, i2, (Paint) null);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static Bitmap e(Bitmap bitmap, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < i4; i10++) {
                bitmapCreateBitmap.setPixel(i10, i9, Color.argb(bArr[i8] & 255, i, i2, i3));
                i8++;
            }
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapCreateBitmap, i6, i7, (Paint) null);
        canvas.save();
        canvas.restore();
        int width = bitmapCreateBitmap2.getWidth();
        int height = bitmapCreateBitmap2.getHeight();
        try {
            return Bitmap.createBitmap(bitmapCreateBitmap2, i6, i7, (width < i4 || height < i4) ? width > height ? height : width : i4, i5, (Matrix) null, false);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] f(byte b2, byte b3, byte b4) {
        byte b5 = (byte) ((b3 >> 2) & 63);
        return new byte[]{(byte) (((((byte) ((b2 >> 3) & 31)) << 3) & 248) | ((b5 >> 3) & 31)), (byte) (((b5 << 5) & SportReportBaseParser.ReportType.avgFreq) | ((byte) ((b4 >> 3) & 31)))};
    }

    public static byte[] g(boolean z, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        byte[] bArr = new byte[width * height * 3];
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int pixel = bitmap.getPixel(i3, i2);
                int iRed = Color.red(pixel);
                int iGreen = Color.green(pixel);
                int iBlue = Color.blue(pixel);
                bArr[i] = (byte) iRed;
                bArr[i + 1] = (byte) iGreen;
                bArr[i + 2] = (byte) iBlue;
                i += 3;
            }
        }
        return h(z, bArr);
    }

    public static byte[] h(boolean z, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[(bArr.length / 3) * 2];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            byte[] bArrI = !z ? i(bArr[i2], bArr[i2 + 1], bArr[i2 + 2]) : f(bArr[i2], bArr[i2 + 1], bArr[i2 + 2]);
            bArr2[i] = bArrI[0];
            bArr2[i + 1] = bArrI[1];
            i += 2;
        }
        return bArr2;
    }

    public static byte[] i(byte b2, byte b3, byte b4) {
        byte b5 = (byte) ((b3 >> 2) & 63);
        return new byte[]{(byte) (((b5 << 5) & SportReportBaseParser.ReportType.avgFreq) | ((byte) ((b4 >> 3) & 31))), (byte) (((((byte) ((b2 >> 3) & 31)) << 3) & 248) | ((b5 >> 3) & 31))};
    }

    public static byte[] j(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}

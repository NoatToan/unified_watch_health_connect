package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class eas {
    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap b(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        if (bitmap == null) {
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

    public static byte[] c(byte b2, byte b3, byte b4) {
        byte b5 = (byte) ((b3 >> 2) & 63);
        return new byte[]{(byte) (((b5 << 5) & SportReportBaseParser.ReportType.avgFreq) | ((byte) ((b4 >> 3) & 31))), (byte) (((((byte) ((b2 >> 3) & 31)) << 3) & 248) | ((b5 >> 3) & 31))};
    }

    public static byte[] d(Bitmap bitmap) {
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
        return f(bArr);
    }

    public static byte[] e(List<byte[]> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() <= 0) {
            return null;
        }
        byte[] bArrH = h(list.get(0), list.get(1));
        for (int i = 2; i < list.size(); i++) {
            bArrH = h(bArrH, list.get(i));
        }
        return bArrH;
    }

    public static byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length / 3) * 2];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            byte[] bArrC = c(bArr[i2], bArr[i2 + 1], bArr[i2 + 2]);
            bArr2[i] = bArrC[0];
            bArr2[i + 1] = bArrC[1];
            i += 2;
        }
        return bArr2;
    }

    public static byte[] g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}

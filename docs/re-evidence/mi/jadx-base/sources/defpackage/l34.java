package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.FloatRange;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l34 {
    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        if (width2 == 0 || height2 == 0) {
            return bitmap;
        }
        float f2 = (width * f) / width2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.scale(f2, f2, width / 2, height / 2);
            canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (Paint) null);
            canvas.save();
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (Exception e) {
            ipe.h(e.getMessage());
            return null;
        }
    }

    public static Bitmap b(String str, int i) {
        return c(str, i, null);
    }

    public static Bitmap c(String str, int i, Bitmap bitmap) {
        return f(str, i, bitmap, -16777216);
    }

    public static Bitmap d(String str, int i, Bitmap bitmap, @FloatRange(from = 0.0d, to = 1.0d) float f, int i2) {
        HashMap map = new HashMap();
        map.put(EncodeHintType.CHARACTER_SET, "utf-8");
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        map.put(EncodeHintType.MARGIN, 1);
        return e(str, i, bitmap, f, map, i2);
    }

    public static Bitmap e(String str, int i, Bitmap bitmap, @FloatRange(from = 0.0d, to = 1.0d) float f, Map<EncodeHintType, ?> map, int i2) {
        try {
            cp2 cp2VarA = new mfi().a(str, BarcodeFormat.QR_CODE, i, i, map);
            int[] iArr = new int[i * i];
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (cp2VarA.e(i4, i3)) {
                        iArr[(i3 * i) + i4] = i2;
                    } else {
                        iArr[(i3 * i) + i4] = -1;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
            return bitmap != null ? a(bitmapCreateBitmap, bitmap, f) : bitmapCreateBitmap;
        } catch (WriterException e) {
            ipe.h(e.getMessage());
            return null;
        }
    }

    public static Bitmap f(String str, int i, Bitmap bitmap, int i2) {
        return d(str, i, bitmap, 0.2f, i2);
    }
}

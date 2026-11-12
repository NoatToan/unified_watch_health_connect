package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kfi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<EncodeHintType, Object> f23805a;

    static {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        f23805a = enumMap;
        enumMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
        enumMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        enumMap.put(EncodeHintType.MARGIN, 0);
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        float f = ((width * 1.0f) / 5.0f) / width2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.scale(f, f, width / 2, height / 2);
            canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (Paint) null);
            canvas.save();
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap b(String str, int i, int i2, int i3, Bitmap bitmap) {
        try {
            cp2 cp2VarA = new fag().a(str, BarcodeFormat.QR_CODE, i, i, f23805a);
            int[] iArr = new int[i * i];
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    if (cp2VarA.e(i5, i4)) {
                        iArr[(i4 * i) + i5] = i2;
                    } else {
                        iArr[(i4 * i) + i5] = i3;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
            return a(bitmapCreateBitmap, bitmap);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap c(String str, int i, int i2, Bitmap bitmap) {
        return b(str, i, i2, -1, bitmap);
    }
}

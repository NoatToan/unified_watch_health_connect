package com.huami.lib.qrcode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.WorkerThread;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@WorkerThread
public final class QRCodeEncoder {
    private static final Map<EncodeHintType, Object> a;

    static {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        a = enumMap;
        enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        enumMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        enumMap.put(EncodeHintType.MARGIN, 0);
    }

    private QRCodeEncoder() {
    }

    private static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
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
            canvas.scale(f, f, width >> 1, height >> 1);
            canvas.drawBitmap(bitmap2, (width - width2) >> 1, (height - height2) >> 1, (Paint) null);
            canvas.save();
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    private static Bitmap b(Bitmap bitmap, String str, @Px int i) {
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(i);
        paint.setTextAlign(Paint.Align.CENTER);
        int iMeasureText = (int) paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i2 = (int) (fontMetrics.bottom - fontMetrics.top);
        float width = (bitmap.getWidth() * 1.0f) / iMeasureText;
        if (width < 1.0f) {
            paint.setTextScaleX(width);
        }
        int height = bitmap.getHeight() + i2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), (bitmap.getHeight() + i2) << 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas();
        canvas.drawColor(-1);
        canvas.setBitmap(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawText(str, bitmap.getWidth() >> 1, height, paint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    @Nullable
    @WorkerThread
    private static Bitmap c(String str, @Px int i, @Px int i2, @Px int i3, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.valueOf(str2), i, i2, a);
            int[] iArr = new int[i * i2];
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    if (bitMatrixEncode.get(i5, i4)) {
                        iArr[(i4 * i) + i5] = -16777216;
                    } else {
                        iArr[(i4 * i) + i5] = -1;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
            return i3 > 0 ? b(bitmapCreateBitmap, str, i3) : bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    @WorkerThread
    private static Bitmap d(String str, @Px int i, @ColorInt int i2, @ColorInt int i3, Bitmap bitmap, String str2) {
        try {
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.valueOf(str2), i, i, a);
            int[] iArr = new int[i * i];
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    if (bitMatrixEncode.get(i5, i4)) {
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

    @WorkerThread
    public static Bitmap syncEncodeBarcode(String str, @Px int i, @Px int i2) {
        return syncEncodeBarcode(str, i, i2, 0);
    }

    @WorkerThread
    public static Bitmap syncEncodeQRCode(String str, @Px int i) {
        return syncEncodeQRCode(str, i, -16777216, -1, null);
    }

    @Nullable
    @WorkerThread
    public static Bitmap syncEncodeBarcode(String str, @Px int i, @Px int i2, String str2) {
        return c(str, i, i2, 0, str2);
    }

    @WorkerThread
    public static Bitmap syncEncodeQRCode(String str, @Px int i, String str2) {
        return d(str, i, -16777216, -1, null, str2);
    }

    @WorkerThread
    public static Bitmap syncEncodeBarcode(String str, @Px int i, @Px int i2, @Px int i3) {
        return c(str, i, i2, i3, BarcodeFormat.CODE_128.toString());
    }

    @WorkerThread
    public static Bitmap syncEncodeQRCode(String str, @Px int i, @ColorInt int i2) {
        return syncEncodeQRCode(str, i, i2, -1, null);
    }

    @WorkerThread
    public static Bitmap syncEncodeQRCode(String str, @Px int i, @ColorInt int i2, Bitmap bitmap) {
        return syncEncodeQRCode(str, i, i2, -1, bitmap);
    }

    @Nullable
    @WorkerThread
    public static Bitmap syncEncodeQRCode(String str, @Px int i, @ColorInt int i2, @ColorInt int i3, Bitmap bitmap) {
        return d(str, i, i2, i3, bitmap, BarcodeFormat.QR_CODE.toString());
    }
}

package com.huami.watch.dataflow.chart.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import com.huami.watch.dataflow.chart.base.BarChart;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class ChartUtil {
    private static float a = -1.0f;
    private static float b = -1.0f;
    private static float c = -1.0f;
    private static boolean d = false;

    public static int colorToColor(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static Canvas createFilterCanvas(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 7));
        return canvas;
    }

    public static float dpToPx(Context context, float f) {
        return f * getDensity(context);
    }

    public static void drawBitmapCenter(Canvas canvas, float f, float f2, float f3, boolean z, boolean z2, Bitmap bitmap, Paint paint) {
        if (z) {
            f -= (bitmap.getWidth() * f3) / 2.0f;
        }
        if (z2) {
            f2 -= (bitmap.getHeight() * f3) / 2.0f;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3);
        matrix.postTranslate(f, f2);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public static void drawTextCenter(Canvas canvas, RectF rectF, String str, String str2, Paint paint, Paint paint2) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float fWidth = rectF.left + ((rectF.width() - rect.width()) / 2.0f);
        float fHeight = rectF.top + ((rectF.height() + rect.height()) / 2.0f);
        canvas.drawText(str, fWidth, fHeight, paint);
        Rect rect2 = new Rect();
        paint2.getTextBounds(str, 0, str.length(), rect2);
        canvas.drawText(str2, fWidth + rect.width() + 6.0f, (fHeight - rect.height()) + rect2.height(), paint2);
    }

    public static void erase(Canvas canvas, RectF rectF) {
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setDither(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawRect(rectF, paint);
    }

    public static int getBodyStateRegion(int i) {
        if (i <= -4) {
            return 0;
        }
        return i <= 5 ? 1 : 2;
    }

    public static float getDensity(Context context) {
        if (a < 0.0f) {
            if (context == null) {
                return 3.0f;
            }
            float f = context.getResources().getDisplayMetrics().density;
            a = f;
            if (c < 0.0f) {
                c = f;
            }
        }
        return a;
    }

    public static float getDensityScale(Context context) {
        if (b < 0.0f) {
            if (context == null) {
                return 1.0f;
            }
            b = context.getResources().getDisplayMetrics().density / 3.0f;
        }
        return b;
    }

    public static float getOriginalDensity(Context context) {
        if (c < 0.0f) {
            getDensity(context);
        }
        return c;
    }

    public static boolean isMiNote(Context context) {
        boolean z = isVirgoLTE() && getOriginalDensity(context) == 2.75f;
        d = z;
        return z;
    }

    public static boolean isNonChineseLocale() {
        Locale locale = Locale.getDefault();
        return (locale.equals(Locale.CHINA) || locale.equals(Locale.CHINESE) || locale.equals(Locale.SIMPLIFIED_CHINESE) || locale.equals(Locale.TRADITIONAL_CHINESE)) ? false : true;
    }

    public static boolean isVirgoLTE() {
        return Build.DEVICE.equalsIgnoreCase("virgo");
    }

    public static float itemLevelSize(int i, int i2, float f, int i3) {
        int i4 = i / i3;
        int i5 = ((i2 + i4) - 1) / i4;
        float f2 = (((i2 - 1) % i4) + 1) / i4;
        int i6 = i5 - 1;
        return levelSize(i6, f, i3) + ((levelSize(i5, f, i3) - levelSize(i6, f, i3)) * f2);
    }

    public static float levelSize(int i, float f, int i2) {
        if (i <= 0) {
            return 0.0f;
        }
        return (((i2 + ((i2 - i) + 1)) * i) / 2.0f) * f;
    }

    @SuppressLint({"NewApi"})
    public static void setDensityDpi(Context context, int i) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.densityDpi = i;
        displayMetrics.densityDpi = i;
        displayMetrics.density = i / 160;
        context.getResources().updateConfiguration(configuration, displayMetrics);
        a = -1.0f;
        b = -1.0f;
        getDensity(context);
    }

    public static float updateLevelSize(int i, float f, int i2) {
        return (f * (((i / i2) * i2) / i)) / (((i2 + 1) * i2) / 2.0f);
    }

    public static int updateMaxItemValue(List<BarChart.BarItem> list, int i, int i2) {
        int i3;
        synchronized (list) {
            for (BarChart.BarItem barItem : list) {
                if (barItem.index >= i && (i3 = barItem.value) > i2) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    public static boolean isMiNote() {
        return d;
    }

    public static void drawBitmapCenter(Canvas canvas, float f, float f2, float f3, Bitmap bitmap, Paint paint) {
        drawBitmapCenter(canvas, f, f2, f3, true, true, bitmap, paint);
    }

    public static void drawTextCenter(Canvas canvas, RectF rectF, String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, rectF.left + ((rectF.width() - rect.width()) / 2.0f), rectF.top + ((rectF.height() + rect.height()) / 2.0f), paint);
    }
}

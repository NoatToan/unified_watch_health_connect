package com.huami.sleep.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.core.text.TextUtilsCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class ViewUtils {
    private static final float a = 3.0f;
    private static final float b = 1080.0f;
    private static float c = 0.0f;
    private static final String d = "status_bar_height";

    private static void a(Canvas canvas, float x, float y, float scale, boolean horizonCenter, boolean verticalCenter, Bitmap bitmap, Paint paint) {
        if (horizonCenter) {
            x -= (bitmap.getWidth() * scale) / 2.0f;
        }
        if (verticalCenter) {
            y -= (bitmap.getHeight() * scale) / 2.0f;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(scale, scale);
        matrix.postTranslate(x, y);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public static float calcuTextHeight(Paint paint, String text) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        return rect.height();
    }

    public static float calcuTextWidth(float textSize, String text) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(text);
    }

    public static float dp2px(Context context, float dp) {
        return TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    public static void drawBitmapCenter(Canvas canvas, float x, float y, float scale, Bitmap bitmap, Paint paint) {
        a(canvas, x, y, scale, true, true, bitmap, paint);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static float getDensityValue(Context context) {
        if (c == 0.0f) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    public static int getHeight(View v) {
        int height = v.getHeight();
        if (height > 0) {
            return height;
        }
        v.measure(0, 0);
        return v.getMeasuredHeight();
    }

    public static int[] getLocationOnScreen(View v) {
        int[] iArr = new int[2];
        v.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float getRealSizeByPercentCal(Context context, float rawsizeInDp) {
        return rawsizeInDp * 3.0f * (context.getResources().getDisplayMetrics().widthPixels / b);
    }

    public static int getScreenWidth(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getWidth(View v) {
        int width = v.getWidth();
        if (width > 0) {
            return width;
        }
        v.measure(0, 0);
        return v.getMeasuredWidth();
    }

    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static int parse2RealPxBy1080(Context context, int px) {
        return (int) (px * (context.getResources().getDisplayMetrics().widthPixels / b));
    }

    public static float sp2px(Context context, float sp) {
        return TypedValue.applyDimension(2, sp, context.getResources().getDisplayMetrics());
    }

    public static float calcuTextHeight(float textSize, String text) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }
}

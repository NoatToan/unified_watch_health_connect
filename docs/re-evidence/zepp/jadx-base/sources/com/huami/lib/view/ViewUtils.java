package com.huami.lib.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
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

/* JADX INFO: loaded from: classes10.dex */
public class ViewUtils {
    private static final float a = 3.0f;
    private static final float b = 1080.0f;
    private static float c;

    private static void a(Canvas canvas, float f, float f2, float f3, boolean z, boolean z2, Bitmap bitmap, Paint paint) {
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

    public static float calcuTextHeight(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float calcuTextWidth(Paint paint, String str) {
        return paint.measureText(str);
    }

    public static float dp2px(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void drawBitmapCenter(Canvas canvas, float f, float f2, float f3, Bitmap bitmap, Paint paint) {
        a(canvas, f, f2, f3, true, true, bitmap, paint);
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

    public static int getHeight(View view) {
        int height = view.getHeight();
        if (height > 0) {
            return height;
        }
        view.measure(0, 0);
        return view.getMeasuredHeight();
    }

    public static int[] getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float getRealSizeByPercentCal(Context context, float f) {
        return f * 3.0f * (context.getResources().getDisplayMetrics().widthPixels / b);
    }

    public static int getScreenWidth(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        try {
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Exception unused) {
            return (int) dp2px(context, 24.0f);
        }
    }

    public static int getWidth(View view) {
        int width = view.getWidth();
        if (width > 0) {
            return width;
        }
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }

    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static int parse2RealPxBy1080(Context context, int i) {
        return (int) (i * (context.getResources().getDisplayMetrics().widthPixels / b));
    }

    public static float sp2px(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static float calcuTextHeight(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }
}

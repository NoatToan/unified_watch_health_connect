package com.huami.ecg.chart.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.text.TextUtilsCompat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class UIUtils {
    private static Rect a = new Rect();

    public static class a implements Runnable {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ TextView c;

        /* JADX INFO: renamed from: com.huami.ecg.chart.utils.UIUtils$a$a, reason: collision with other inner class name */
        public class RunnableC0375a implements Runnable {
            public RunnableC0375a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c.requestFocus();
            }
        }

        public a(TextView textView, Activity activity, TextView textView2) {
            this.a = textView;
            this.b = activity;
            this.c = textView2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.requestFocus();
            this.a.performAccessibilityAction(16, null);
            UIUtils.showSoftInputMethod(this.b);
            this.c.postDelayed(new RunnableC0375a(), 300L);
        }
    }

    private UIUtils() {
    }

    public static int calcTextHeight(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), a);
        return a.height();
    }

    public static int calcTextWidth(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static void destroyViewTree(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                destroyViewTree(viewGroup.getChildAt(childCount));
            }
            viewGroup.removeAllViewsInLayout();
        }
    }

    public static float dip2Pix(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int dip2pix(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void drawTextWithMaxWidth(Canvas canvas, TextPaint textPaint, String str, int i, float f, float f2) {
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        canvas.save();
        canvas.translate(f, f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public static int getHourIndex(int i) {
        if (i != 0) {
            return 24;
        }
        return Calendar.getInstance().get(11);
    }

    public static int getLocationCenterX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return (view.getMeasuredWidth() / 2) + iArr[0];
    }

    public static Drawable getMaskDrawable(Context context, int i) {
        Drawable drawable = Build.VERSION.SDK_INT >= 21 ? context.getDrawable(i) : context.getResources().getDrawable(i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalArgumentException("maskId is invalid");
    }

    public static int getScreenHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void hideSoftInputMethod(Activity activity) {
        IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(windowToken, 2);
        }
    }

    public static boolean isRTL() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static void removeSelfFromParent(View view) {
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void showSoftInputMethod(Activity activity, TextView textView, TextView textView2, int i) {
        a aVar = new a(textView, activity, textView2);
        if (i > 0) {
            textView2.postDelayed(aVar, i);
        } else {
            aVar.run();
        }
    }

    public static int sp2pix(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static void hideSoftInputMethod(EditText editText) {
        InputMethodManager inputMethodManager;
        if (editText == null || (inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static void showSoftInputMethod(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(currentFocus, 1);
        }
    }
}

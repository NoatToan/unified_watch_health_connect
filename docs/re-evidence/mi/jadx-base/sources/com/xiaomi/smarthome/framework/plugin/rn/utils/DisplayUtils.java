package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.ApiHelper;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class DisplayUtils {
    public static final int FADE_IN_FADE_OUT_DURATION = 100;
    static final String TAG = "DisplayUtils";

    public interface CacheLockBmpCallback {
        void onCacheComplete(Bitmap bitmap);
    }

    public static Bitmap blurBitmap(Context context, Bitmap bitmap, float f, int i) {
        if (f < 1.0f) {
            bitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f), Math.round(bitmap.getHeight() * f), false);
        }
        return fastblur(bitmap, i);
    }

    private static int compositeAlpha(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int compositeColors(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iCompositeAlpha = compositeAlpha(iAlpha2, iAlpha);
        return Color.argb(iCompositeAlpha, compositeComponent(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iCompositeAlpha), compositeComponent(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iCompositeAlpha), compositeComponent(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iCompositeAlpha));
    }

    private static int compositeComponent(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static SpannableString createStandardBulletText(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new BulletSpan(dip2px(6.0f), -16731273), 0, str.length(), 0);
        return spannableString;
    }

    public static SpannableString createStandardIndentedText(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new LeadingMarginSpan.Standard(dip2px(14.0f), 0), 0, str.length(), 0);
        return spannableString;
    }

    public static int dip2px(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((f * displayMetrics.density) + 0.5f);
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static Bitmap fastblur(Bitmap bitmap, int i) {
        int i2 = i;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr6 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr6[i11] = i11 / i9;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap2 = bitmapCopy;
            int i16 = -i2;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i16 <= i2) {
                int i26 = i5;
                int i27 = height;
                int i28 = iArr[i14 + Math.min(i4, Math.max(i16, 0))];
                int[] iArr8 = iArr7[i16 + i2];
                iArr8[0] = (i28 & 16711680) >> 16;
                iArr8[1] = (i28 & 65280) >> 8;
                iArr8[2] = i28 & 255;
                int iAbs = i12 - Math.abs(i16);
                int i29 = iArr8[0];
                i17 += i29 * iAbs;
                int i30 = iArr8[1];
                i18 += i30 * iAbs;
                int i31 = iArr8[2];
                i19 += iAbs * i31;
                if (i16 > 0) {
                    i23 += i29;
                    i24 += i30;
                    i25 += i31;
                } else {
                    i20 += i29;
                    i21 += i30;
                    i22 += i31;
                }
                i16++;
                height = i27;
                i5 = i26;
            }
            int i32 = i5;
            int i33 = height;
            int i34 = i2;
            int i35 = 0;
            while (i35 < width) {
                iArr2[i14] = iArr6[i17];
                iArr3[i14] = iArr6[i18];
                iArr4[i14] = iArr6[i19];
                int i36 = i17 - i20;
                int i37 = i18 - i21;
                int i38 = i19 - i22;
                int[] iArr9 = iArr7[((i34 - i2) + i7) % i7];
                int i39 = i20 - iArr9[0];
                int i40 = i21 - iArr9[1];
                int i41 = i22 - iArr9[2];
                if (i13 == 0) {
                    iArr5[i35] = Math.min(i35 + i2 + 1, i4);
                }
                int i42 = iArr[i15 + iArr5[i35]];
                int i43 = (i42 & 16711680) >> 16;
                iArr9[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr9[1] = i44;
                int i45 = i42 & 255;
                iArr9[2] = i45;
                int i46 = i23 + i43;
                int i47 = i24 + i44;
                int i48 = i25 + i45;
                i17 = i36 + i46;
                i18 = i37 + i47;
                i19 = i38 + i48;
                i34 = (i34 + 1) % i7;
                int[] iArr10 = iArr7[i34 % i7];
                int i49 = iArr10[0];
                i20 = i39 + i49;
                int i50 = iArr10[1];
                i21 = i40 + i50;
                int i51 = iArr10[2];
                i22 = i41 + i51;
                i23 = i46 - i49;
                i24 = i47 - i50;
                i25 = i48 - i51;
                i14++;
                i35++;
                iArr6 = iArr6;
            }
            i15 += width;
            i13++;
            bitmapCopy = bitmap2;
            height = i33;
            i5 = i32;
        }
        Bitmap bitmap3 = bitmapCopy;
        int i52 = i5;
        int i53 = height;
        int[] iArr11 = iArr6;
        int i54 = 0;
        while (i54 < width) {
            int i55 = -i2;
            int i56 = i55 * width;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            while (i55 <= i2) {
                int[] iArr12 = iArr5;
                int iMax = Math.max(0, i56) + i54;
                int[] iArr13 = iArr7[i55 + i2];
                iArr13[0] = iArr2[iMax];
                iArr13[1] = iArr3[iMax];
                iArr13[2] = iArr4[iMax];
                int iAbs2 = i12 - Math.abs(i55);
                i57 += iArr2[iMax] * iAbs2;
                i58 += iArr3[iMax] * iAbs2;
                i59 += iArr4[iMax] * iAbs2;
                if (i55 > 0) {
                    i63 += iArr13[0];
                    i64 += iArr13[1];
                    i65 += iArr13[2];
                } else {
                    i60 += iArr13[0];
                    i61 += iArr13[1];
                    i62 += iArr13[2];
                }
                int i66 = i52;
                if (i55 < i66) {
                    i56 += width;
                }
                i55++;
                i52 = i66;
                iArr5 = iArr12;
            }
            int[] iArr14 = iArr5;
            int i67 = i52;
            int i68 = i2;
            int i69 = i54;
            int i70 = i53;
            int i71 = 0;
            while (i71 < i70) {
                iArr[i69] = (iArr[i69] & (-16777216)) | (iArr11[i57] << 16) | (iArr11[i58] << 8) | iArr11[i59];
                int i72 = i57 - i60;
                int i73 = i58 - i61;
                int i74 = i59 - i62;
                int[] iArr15 = iArr7[((i68 - i2) + i7) % i7];
                int i75 = i60 - iArr15[0];
                int i76 = i61 - iArr15[1];
                int i77 = i62 - iArr15[2];
                if (i54 == 0) {
                    iArr14[i71] = Math.min(i71 + i12, i67) * width;
                }
                int i78 = iArr14[i71] + i54;
                int i79 = iArr2[i78];
                iArr15[0] = i79;
                int i80 = iArr3[i78];
                iArr15[1] = i80;
                int i81 = iArr4[i78];
                iArr15[2] = i81;
                int i82 = i63 + i79;
                int i83 = i64 + i80;
                int i84 = i65 + i81;
                i57 = i72 + i82;
                i58 = i73 + i83;
                i59 = i74 + i84;
                i68 = (i68 + 1) % i7;
                int[] iArr16 = iArr7[i68];
                int i85 = iArr16[0];
                i60 = i75 + i85;
                int i86 = iArr16[1];
                i61 = i76 + i86;
                int i87 = iArr16[2];
                i62 = i77 + i87;
                i63 = i82 - i85;
                i64 = i83 - i86;
                i65 = i84 - i87;
                i69 += width;
                i71++;
                i2 = i;
            }
            i54++;
            i2 = i;
            i53 = i70;
            i52 = i67;
            iArr5 = iArr14;
        }
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, i53);
        return bitmap3;
    }

    private static boolean fixOrientation(Context context) {
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(context)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void fixScreenOrientationIfNeeded(Context context) {
        if (Build.VERSION.SDK_INT == 26 && isTranslucentOrFloating(context)) {
            fixOrientation(context);
        }
    }

    public static Bitmap getBlurBmp(Context context, Bitmap bitmap, float f) {
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), false);
            Class<?> cls = Class.forName("miui.util.ScreenshotUtils");
            Bitmap bitmap2 = (Bitmap) cls.getMethod("getBlurBackground", Bitmap.class, Bitmap.class).invoke(cls, bitmapCreateScaledBitmap, null);
            bitmapCreateScaledBitmap.recycle();
            return bitmap2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static float getDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Point getDisplaySize(Activity activity) {
        Point point = new Point();
        if (ApiHelper.HAS_NEW_DISPLAY) {
            activity.getWindowManager().getDefaultDisplay().getSize(point);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
        }
        return point;
    }

    public static Point getDisplaySizeInPixel(Context context) {
        if (context == null) {
            return new Point();
        }
        Point point = new Point();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        return point;
    }

    public static BitmapDrawable getLockscreenBmp(Context context) {
        try {
            Class<?> cls = Class.forName("miui.content.res.ThemeResources");
            return (BitmapDrawable) cls.getDeclaredMethod("getLockWallpaperCache", Context.class).invoke(cls, context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getRealScreenHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getRealScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int getScreenHeightDp() {
        return px2dip(MiJiaEnvironment.getAppContext(), getScreenHeight());
    }

    public static int[] getScreenWH(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScreenWidthDp() {
        return px2dip(MiJiaEnvironment.getAppContext(), getScreenWidth(MiJiaEnvironment.getAppContext()));
    }

    public static int getStatusBarByTop(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int iCeil = 0;
        for (int i = 0; i < length; i++) {
            iCeil += (int) Math.ceil(fArr[i]);
        }
        return iCeil;
    }

    public static boolean isFoldDevice() {
        String str = Build.DEVICE;
        return "cetus".equals(str) || "zizhan".equals(str) || "babylon".equals(str);
    }

    public static boolean isTranslucentOrFloating(Context context) {
        boolean z = false;
        try {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField(AIApiConstants.Window.NAME).get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            boolean zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                typedArrayObtainStyledAttributes.recycle();
                return zBooleanValue;
            } catch (Exception e) {
                e = e;
                z = zBooleanValue;
                e.printStackTrace();
                return z;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean isUnfoldMode(Context context) {
        return isFoldDevice() && getRealScreenWidth(context) >= 1860 && getRealScreenHeight(context) >= 1860;
    }

    public static void overridingPendingAnim(Context context, int i, int i2) {
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            StringBuilder sb = new StringBuilder();
            sb.append("OverridePending:Activity=");
            sb.append(activity);
            activity.overridePendingTransition(i, i2);
        }
    }

    public static int px2dip(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((f / displayMetrics.density) + 0.5f);
    }

    public static int px2sp(Context context, float f) {
        return (int) ((((double) f) / ((double) context.getResources().getDisplayMetrics().scaledDensity)) + 0.5d);
    }

    public static void setHideAnimation(View view, int i, int i2) {
        if (view == null || i < 0 || view.getVisibility() == i2) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(i);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xiaomi.smarthome.framework.plugin.rn.utils.DisplayUtils.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        if (i2 == 4 || i2 == 8) {
            view.setVisibility(i2);
        } else {
            view.setVisibility(8);
        }
        view.startAnimation(alphaAnimation);
    }

    public static void setShowAnimation(View view, int i) {
        if (view == null || i < 0 || view.getVisibility() == 0) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(i);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xiaomi.smarthome.framework.plugin.rn.utils.DisplayUtils.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    public static void setTransparentStatusBar(Window window) {
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_TRANSPARENT").getInt(cls2);
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            cls.getMethod("setExtraFlags", cls3, cls3).invoke(window, Integer.valueOf(i), Integer.valueOf(i2 | i));
            window.addFlags(67108864);
        } catch (Exception unused) {
        }
    }

    public static int sp2px(Context context, float f) {
        return (int) ((((double) f) * ((double) context.getResources().getDisplayMetrics().scaledDensity)) + 0.5d);
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int dip2px(float f) {
        return dip2px(MiJiaEnvironment.getAppContext(), f);
    }

    public static int px2dip(float f) {
        return px2dip(MiJiaEnvironment.getAppContext(), f);
    }
}

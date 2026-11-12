package com.huami.watch.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class Util {
    private static final String a = "Util";
    public static final /* synthetic */ boolean b = false;

    public static String byteArrayToString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(Integer.toHexString((b2 & 255) + 256).substring(1));
        }
        return stringBuffer.toString();
    }

    public static void fixInputMethodManagerLeak(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
        for (int i = 0; i < 3; i++) {
            try {
                Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if (obj != null && (obj instanceof View)) {
                    View view = (View) obj;
                    if (view.getContext() != context) {
                        Log.d(a, "Break, context is not suitable, getContext=" + view.getContext() + ", destContext=" + context, new Object[0]);
                        return;
                    }
                    declaredField.set(inputMethodManager, null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:24:0x0061, B:26:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[PHI: r3
      0x0079: PHI (r3v7 boolean) = (r3v4 boolean), (r3v8 boolean), (r3v8 boolean) binds: [B:29:0x0071, B:23:0x005f, B:25:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static int getNavigationBarHeight(Context context) {
        boolean z;
        int dimensionPixelSize;
        int identifier;
        if (context == null) {
            return 0;
        }
        int identifier2 = context.getResources().getIdentifier("config_showNavigationBar", "bool", "android");
        Resources resources = context.getResources();
        boolean z2 = true;
        if (identifier2 > 0) {
            try {
                z = resources.getBoolean(identifier2);
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        String str = null;
                        try {
                            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                            declaredMethod.setAccessible(true);
                            str = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
                        } catch (Throwable unused) {
                        }
                        if ("1".equals(str)) {
                            z2 = false;
                        } else if (!"0".equals(str)) {
                            z2 = z;
                        }
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        try {
                            identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                            if (identifier > 0) {
                                dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                            } else {
                                dimensionPixelSize = 0;
                            }
                        } catch (Exception unused2) {
                            z = z2;
                            Log.d(a, "Failed to get navigation bar height", new Object[0]);
                            z2 = z;
                        }
                    } else {
                        dimensionPixelSize = 0;
                    }
                } catch (Exception unused3) {
                    Log.d(a, "Failed to get navigation bar height", new Object[0]);
                    z2 = z;
                    dimensionPixelSize = 0;
                    Log.d(a, "Has navigation bar: " + z2 + " and if has, the height is : " + dimensionPixelSize, new Object[0]);
                    return dimensionPixelSize;
                }
            } catch (Exception unused4) {
                z = false;
            }
        } else {
            z2 = false;
            if (z2) {
                identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                } else {
                    dimensionPixelSize = 0;
                }
            } else {
                dimensionPixelSize = 0;
            }
        }
        Log.d(a, "Has navigation bar: " + z2 + " and if has, the height is : " + dimensionPixelSize, new Object[0]);
        return dimensionPixelSize;
    }

    public static int getScreenHeight(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public static int getScreenRealHeight(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 72;
    }

    public static float getStatusBarHeightFloat(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimension(identifier);
        }
        return 72.0f;
    }

    public static int getVersionCodeByPkgName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void toPlayStore(Context context) {
        String packageName = context.getPackageName();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }
}

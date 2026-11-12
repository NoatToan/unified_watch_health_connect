package com.huawei.phoneservice.faq.base.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.text.TextUtilsCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public class p {
    public static void e(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static void b(Activity activity, boolean z, int i) {
        if (activity != null && z) {
            int i2 = Build.VERSION.SDK_INT;
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
            View decorView = window.getDecorView();
            if (decorView == null) {
                return;
            }
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility((i2 >= 29 && c(activity)) ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        }
    }

    public static void e(Activity activity) {
        View viewFindViewById;
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        View childAt = ((ViewGroup) viewFindViewById).getChildAt(0);
        if (childAt == null) {
            g.c("FaqUiUtils", "root view is null");
            return;
        }
        childAt.setFocusable(true);
        childAt.setFocusableInTouchMode(true);
        childAt.requestFocus();
        childAt.requestFocusFromTouch();
        childAt.setDefaultFocusHighlightEnabled(false);
    }

    public static void c(Activity activity, int[] iArr) {
        if (iArr == null || iArr.length <= 0 || b(activity) || !d.d()) {
            return;
        }
        for (int i : iArr) {
            View viewFindViewById = activity.findViewById(i);
            if (viewFindViewById != null) {
                viewFindViewById.setPadding(0, viewFindViewById.getPaddingTop(), 0, viewFindViewById.getPaddingBottom());
            }
        }
    }

    public static boolean b(Activity activity) {
        String str;
        int iIntValue;
        try {
            iIntValue = ((Integer) Class.forName("android.content.Intent").getMethod("getHwFlags", new Class[0]).invoke(activity.getIntent(), new Object[0])).intValue();
        } catch (ClassNotFoundException unused) {
            str = "isSplitActivity ClassNotFoundException";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        } catch (IllegalAccessException unused2) {
            str = "isSplitActivity IllegalAccessException";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        } catch (IllegalArgumentException unused3) {
            str = "isSplitActivity IllegalArgumentException";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        } catch (NoSuchMethodException unused4) {
            str = "isSplitActivity NoSuchMethodException";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        } catch (RuntimeException unused5) {
            str = "isSplitActivity RuntimeException";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        } catch (InvocationTargetException unused6) {
            str = "isSplitActivity InvocationTargetException";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        } catch (Exception unused7) {
            str = "isSplitActivity Exception";
            g.b("FaqUiUtils", str);
            iIntValue = 0;
        }
        return (iIntValue & 4) != 0;
    }

    public static boolean e(Context context) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1;
    }

    public static int e(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static boolean c(Activity activity) {
        return (activity == null || activity.getResources() == null || activity.getResources().getConfiguration() == null || (activity.getResources().getConfiguration().uiMode & 48) != 32) ? false : true;
    }
}

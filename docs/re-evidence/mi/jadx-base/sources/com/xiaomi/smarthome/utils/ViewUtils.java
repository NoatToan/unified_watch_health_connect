package com.xiaomi.smarthome.utils;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.Reflector;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.utils.ViewUtils;
import defpackage.alb;
import defpackage.cjg;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedList;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes2.dex */
public class ViewUtils {

    @SuppressLint({"ClickableViewAccessibility"})
    public static final View.OnTouchListener CLICK_HAPTIC = new View.OnTouchListener() { // from class: zxq
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return ViewUtils.lambda$static$0(view, motionEvent);
        }
    };
    private static int statusHeight = -1;

    public static void clearAllActivityViews(Activity activity) {
        try {
            clearViewResource(activity.getWindow().getDecorView().findViewById(R.id.content));
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.GENERAL, "", e.getMessage());
        }
    }

    public static void clearHapticFeedback(View view) {
        if (view == null) {
            return;
        }
        view.setOnTouchListener(null);
    }

    private static void clearViewResource(View view) {
        if (view == null || view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            return;
        }
        if (view instanceof ImageView) {
            ((ImageView) view).setImageBitmap(null);
            return;
        }
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            webView.setTag(null);
            webView.stopLoading();
            webView.clearHistory();
            try {
                webView.removeAllViews();
            } catch (Exception unused) {
            }
            webView.clearView();
            try {
                ((ViewGroup) webView.getParent()).removeView(webView);
            } catch (Exception unused2) {
            }
            webView.destroy();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                clearViewResource(viewGroup.getChildAt(i));
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused3) {
            }
        }
    }

    public static void doAlphaAnimationToHide(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
        view.setVisibility(4);
    }

    public static void doAlphaAnimationToShow(View view) {
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static void expandViewTouchDelegate(final View view, final int i, final int i2, final int i3, final int i4) {
        if (view.getParent() != null) {
            ((View) view.getParent()).post(new Runnable() { // from class: com.xiaomi.smarthome.utils.ViewUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i2;
                    rect.left -= i3;
                    rect.right += i4;
                    TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                    if (view.getParent() instanceof View) {
                        ((View) view.getParent()).setTouchDelegate(touchDelegate);
                    }
                }
            });
        }
    }

    public static void findScrollView(ViewGroup viewGroup, Collection<cjg> collection) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof cjg) {
                collection.add((cjg) childAt);
            } else if (childAt instanceof ViewGroup) {
                findScrollView((ViewGroup) childAt, collection);
            }
        }
    }

    public static void fixInputMethodManager(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        Reflector.invokeMethodExceptionSafe(inputMethodManager, "windowDismissed", new Reflector.TypedObject(activity.getWindow().getDecorView().getWindowToken(), IBinder.class));
        Reflector.invokeMethodExceptionSafe(inputMethodManager, "startGettingWindowFocus", new Reflector.TypedObject(null, View.class));
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
        for (int i = 0; i < 3; i++) {
            try {
                Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if (obj != null && (obj instanceof View)) {
                    if (((View) obj).getContext() != activity) {
                        return;
                    } else {
                        declaredField.set(inputMethodManager, null);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static LinkedList<View> getAllParent(View view) {
        LinkedList<View> linkedList = new LinkedList<>();
        if (view == null) {
            return linkedList;
        }
        linkedList.addFirst(view);
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            linkedList.addFirst((View) parent);
        }
        return linkedList;
    }

    public static int getGridViewColunms(Context context, int i, int i2) {
        DisplayMetrics displayMetrics = MiJiaEnvironment.getAppContext().getResources().getDisplayMetrics();
        int i3 = context.getResources().getConfiguration().orientation;
        int i4 = displayMetrics.widthPixels;
        float f = context.getResources().getDisplayMetrics().density;
        return (int) ((i4 - (30.0f * f)) / ((i + i2) * f));
    }

    public static int getGridViewColunmsForSubCategoryList(Context context, int i, int i2) {
        int i3 = MiJiaEnvironment.getAppContext().getResources().getDisplayMetrics().widthPixels;
        float f = context.getResources().getDisplayMetrics().density;
        return (int) ((i3 - (40.0f * f)) / ((i + i2) * f));
    }

    public static RectF getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    private static String getNavBarOverride() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getNavigationBarHeight(Context context) {
        if (!hasNavBar(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", PluginPackageConstant.RN_DIR_A));
    }

    public static int getShowSize(View view, View view2) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        view2.getGlobalVisibleRect(rect2);
        if (rect2.intersect(rect)) {
            return rect2.width() * rect2.height();
        }
        return 0;
    }

    public static int getStatusHeight(Context context) {
        int i = statusHeight;
        if (i != -1) {
            return i;
        }
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
            if (identifier != 0) {
                statusHeight = resources.getDimensionPixelSize(identifier);
            }
        } catch (Exception unused) {
        }
        if (statusHeight == -1) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                statusHeight = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (Exception unused2) {
            }
        }
        if (statusHeight == -1) {
            statusHeight = context.getResources().getDimensionPixelSize(com.xiaomi.smarthome.smarthome_utils.R.dimen.title_bar_top_padding);
        }
        return statusHeight;
    }

    public static boolean hasNavBar(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", PluginPackageConstant.RN_DIR_A);
        if (identifier == 0) {
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
        boolean z = resources.getBoolean(identifier);
        String navBarOverride = getNavBarOverride();
        if ("1".equals(navBarOverride)) {
            return false;
        }
        if ("0".equals(navBarOverride)) {
            return true;
        }
        return z;
    }

    public static boolean isHapticFeedbackEnabled(View view) {
        return view.isHapticFeedbackEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (HapticCompat.performHapticFeedback(view, alb.g)) {
                return false;
            }
            view.performHapticFeedback(3);
            return false;
        }
        if (motionEvent.getAction() != 1 || HapticCompat.performHapticFeedback(view, alb.f)) {
            return false;
        }
        view.performHapticFeedback(7);
        return false;
    }

    public static void performHapticClick(View view) {
        if (view == null || HapticCompat.performHapticFeedback(view, alb.f)) {
            return;
        }
        view.performHapticFeedback(6);
    }

    public static void performHapticConfirm(View view) {
        if (view == null || HapticCompat.performHapticFeedback(view, alb.f)) {
            return;
        }
        view.performHapticFeedback(16);
    }

    public static void performHapticFeedback(CompoundButton compoundButton) {
        if (HapticCompat.performHapticFeedback(compoundButton, alb.i)) {
            return;
        }
        compoundButton.performHapticFeedback(compoundButton.isChecked() ? 3 : 7);
    }

    public static void performHapticFlick(View view) {
        if (HapticCompat.performHapticFeedback(view, alb.s)) {
            return;
        }
        view.performHapticFeedback(7);
    }

    public static void performHapticPress(View view) {
        if (view == null || HapticCompat.performHapticFeedback(view, alb.m)) {
            return;
        }
        view.performHapticFeedback(3);
    }

    public static void performHapticScrollEdge(View view) {
        if (HapticCompat.performHapticFeedback(view, alb.q)) {
            return;
        }
        view.performHapticFeedback(3);
    }

    public static void performHapticTick(View view) {
        if (view == null || HapticCompat.performHapticFeedback(view, alb.j)) {
            return;
        }
        view.performHapticFeedback(4);
    }

    public static void playEnterAnimation(View view, RectF rectF, RectF rectF2) {
        if (view == null || rectF == null || rectF2 == null) {
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        float fMax = Math.max(rectF.height() / rectF2.height(), rectF.width() / rectF2.width());
        animationSet.addAnimation(new ScaleAnimation(fMax, 1.0f, fMax, 1.0f, 1, 0.5f, 1, 0.5f));
        animationSet.addAnimation(new TranslateAnimation(0, rectF.centerX() - rectF2.centerX(), 0, 0.0f, 0, rectF.centerY() - rectF2.centerY(), 0, 0.0f));
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        view.startAnimation(animationSet);
    }

    public static void playExitAnimation(View view, RectF rectF, RectF rectF2, Runnable runnable) {
        if (view == null || rectF == null || rectF2 == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        float fMax = Math.max(rectF.height() / rectF2.height(), rectF.width() / rectF2.width());
        animationSet.addAnimation(new ScaleAnimation(1.0f, fMax, 1.0f, fMax, 1, 0.5f, 1, 0.5f));
        animationSet.addAnimation(new TranslateAnimation(0, 0.0f, 0, rectF.centerX() - rectF2.centerX(), 0, 0.0f, 0, rectF.centerY() - rectF2.centerY()));
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        view.startAnimation(animationSet);
        view.postDelayed(runnable, 250L);
    }

    @RequiresApi(api = 31)
    public static void setAllowClickWhenDisabled(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setAllowClickWhenDisabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            setAllowClickWhenDisabled(viewGroup.getChildAt(i), z);
            i++;
        }
    }

    public static void setEnabled(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            setEnabled(viewGroup.getChildAt(i), z);
            i++;
        }
    }

    public static void setHapticFeedback(View view) {
        if (view == null) {
            return;
        }
        view.setOnTouchListener(CLICK_HAPTIC);
    }

    public static void performHapticFeedback(View view, int i) {
        if (HapticCompat.performHapticFeedback(view, i)) {
            return;
        }
        view.performHapticFeedback(i);
    }
}

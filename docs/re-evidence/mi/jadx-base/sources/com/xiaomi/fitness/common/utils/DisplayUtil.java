package com.xiaomi.fitness.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.jrk;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\tH\u0007J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u0005H\u0007J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u001f\u001a\u00020\u0005H\u0007J\u0012\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0007J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010+\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\b\b\u0001\u0010.\u001a\u00020\u0005H\u0007J\u001a\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010.\u001a\u00020\u0005J\u001c\u00101\u001a\u0004\u0018\u0001002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u00102\u001a\u00020\u0005H\u0007J\u001a\u00103\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u00104\u001a\u00020&H\u0007R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010 \u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010\u0007R\u0016\u0010'\u001a\u0004\u0018\u00010(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/common/utils/DisplayUtil;", "", "<init>", "()V", "defBorderMargin", "", "getDefBorderMargin", "()I", "dip2pxF", "", "dpValue", "dip2px", "getFixDp2Px", "px2dp", "context", "Landroid/content/Context;", "pxValue", "dp2px", "px2sp", "sp2px", "spValue", "sp2pxF", "getScreenDensity", "screenDensity", "getScreenDensity$annotations", "()F", "setTranslucentStatusBar", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "getScreenWidth", "getScreenHeight", "statusBarHeight", "getStatusBarHeight$annotations", "getStatusBarHeight", "hideBottomUIMenu", "mActivity", "hasNavBar", "", "navBarOverride", "", "getNavBarOverride", "()Ljava/lang/String;", "setTypeface", "paint", "Landroid/graphics/Paint;", "attr", "getTypeface", "Landroid/graphics/Typeface;", "getTypefaceAsResourceId", "resourceId", "setStatusBarFontColor", "isBlack", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisplayUtil {

    @NotNull
    public static final DisplayUtil INSTANCE = new DisplayUtil();

    private DisplayUtil() {
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "dpValue.dp", imports = {"com.xiaomi.fitness.common.utils.ExtUtils"}))
    @JvmStatic
    public static final int dip2px(float dpValue) {
        return (int) ((dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "dpValue.dp", imports = {"com.xiaomi.fitness.common.utils.ExtUtils"}))
    @JvmStatic
    public static final int dp2px(@NotNull Context context, float dpValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private final String getNavBarOverride() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, "qemu.hw.mainkeys");
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static /* synthetic */ void getScreenDensity$annotations() {
    }

    @JvmStatic
    public static final int getScreenHeight() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @JvmStatic
    public static final int getScreenWidth() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static final int getStatusBarHeight() {
        int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return Resources.getSystem().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @JvmStatic
    public static /* synthetic */ void getStatusBarHeight$annotations() {
    }

    @JvmStatic
    @Nullable
    public static final Typeface getTypefaceAsResourceId(@Nullable Context context, int resourceId) {
        if (resourceId <= 0) {
            return Typeface.DEFAULT;
        }
        Intrinsics.checkNotNull(context);
        return jrk.h(context, resourceId);
    }

    @JvmStatic
    public static final void hideBottomUIMenu(@Nullable Activity mActivity) {
        if (mActivity == null || mActivity.isFinishing() || !INSTANCE.hasNavBar(mActivity)) {
            return;
        }
        Window window = mActivity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = 2050;
        window.setAttributes(attributes);
    }

    @JvmStatic
    public static final void setStatusBarFontColor(@Nullable Activity activity, boolean isBlack) {
        if (isBlack) {
            Intrinsics.checkNotNull(activity);
            activity.getWindow().getDecorView().setSystemUiVisibility(9472);
        } else {
            Intrinsics.checkNotNull(activity);
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @JvmStatic
    public static final void setTranslucentStatusBar(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(0);
    }

    @JvmStatic
    public static final void setTypeface(@NotNull Context context, @NotNull Paint paint, int attr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paint, "paint");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attr, typedValue, true);
        int i = typedValue.resourceId;
        if (i > 0) {
            paint.setTypeface(jrk.h(context, i));
        }
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "dpValue.sp", imports = {"com.xiaomi.fitness.common.utils.ExtUtils"}))
    @JvmStatic
    public static final int sp2px(float dpValue) {
        return (int) ((dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public final float dip2pxF(float dpValue) {
        return (dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public final int getDefBorderMargin() {
        return dip2px(12.0f);
    }

    public final int getFixDp2Px(float dpValue) {
        return (int) ((dpValue * (Resources.getSystem().getDisplayMetrics().widthPixels / 360.0f)) + 0.5f);
    }

    public final float getScreenDensity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }

    @Nullable
    public final Typeface getTypeface(@NotNull Context context, int attr) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attr, typedValue, true);
        int i = typedValue.resourceId;
        return i > 0 ? jrk.h(context, i) : Typeface.DEFAULT;
    }

    public final boolean hasNavBar(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", PluginPackageConstant.RN_DIR_A);
        if (identifier != 0) {
            boolean z = resources.getBoolean(identifier);
            String navBarOverride = getNavBarOverride();
            if (!Intrinsics.areEqual("1", navBarOverride)) {
                if (Intrinsics.areEqual("0", navBarOverride)) {
                    return true;
                }
                return z;
            }
        } else if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
            return true;
        }
        return false;
    }

    public final int px2dp(@NotNull Context context, float pxValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int px2sp(@NotNull Context context, float pxValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((pxValue / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final float sp2pxF(float dpValue) {
        return (dpValue * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public static final float getScreenDensity() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "dpValue.sp", imports = {"com.xiaomi.fitness.common.utils.ExtUtils"}))
    @JvmStatic
    public static final int sp2px(@NotNull Context context, float spValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @JvmStatic
    public static final int getScreenWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}

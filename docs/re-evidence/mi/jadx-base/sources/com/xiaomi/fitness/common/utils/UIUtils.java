package com.xiaomi.fitness.common.utils;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.tkr;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\u0006\u0010\u0011\u001a\u00020\fJ\u0018\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020 J\u0016\u0010#\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020 J\u0016\u0010%\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020 J\u000e\u0010&\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010'\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010(\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010*J\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010/\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00100\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00101\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00102\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u00104\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u00105\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u00106\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u00107\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00108\u001a\u00020\tJ\u0016\u00109\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00108\u001a\u00020\tJ\u0018\u0010:\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010;\u001a\u00020\u001dJ\u000e\u0010<\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\"\u0010=\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\tJ*\u0010=\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010>\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\tJ\u000e\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020CJ\u0010\u0010D\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010E\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010F\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\n\u0010G\u001a\u00020\t*\u00020\u000eJ\n\u0010H\u001a\u00020\t*\u00020\u000eJ\u0006\u0010H\u001a\u00020\tJ\n\u0010I\u001a\u00020\t*\u00020\u000eJ\n\u0010J\u001a\u00020\t*\u00020\u000eJ\n\u0010K\u001a\u00020\t*\u00020\u000eJ\n\u0010L\u001a\u00020\t*\u00020\u000eJ\n\u0010M\u001a\u00020\t*\u00020\u000eJ\u0006\u0010N\u001a\u00020\tJ\u0006\u0010O\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010\n¨\u0006P"}, d2 = {"Lcom/xiaomi/fitness/common/utils/UIUtils;", "", "<init>", "()V", "TAG", "", "FORCE_FSG_NAV_BAR", "HIDE_GESTURE_LINE", "isInMainThread", "", "()Z", "checkContext", "", "context", "Landroid/content/Context;", "getSafeContext", "checkInMainThread", "checkNotInMainThread", "setStatusBarFontColor", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "darkFont", "hideStatusBar", "window", "Landroid/view/Window;", "setAlertDialogGravity", "alertDialog", "Landroid/app/AlertDialog;", "gravity", "", "dip2px", "dpValue", "", "px2dip", "pxValue", "sp2px", "spValue", "px2sp", "isGodzillaScale", "isNightMode", "isIntentAvailable", "intent", "Landroid/content/Intent;", "isRtl", "getScreenWidth", "getScreenHeight", "getScreenRealHeight", "physicalScreenWidth", "physicalScreenHeight", "getStatusBarHeight", "fullScreenGestureEnabled", "gestureLineEnabled", "isHasNavigationBar", "hideSystemUI", "updateBarColor", "setLightStatusBar", "light", "setLightNavigationBar", "setNavigationBarColor", "colorResId", "setNavigationBarTranslucent", "setNavigationBar", "navigationColorRes", "isLightNavigationBar", "windowBgRes", "changeOrientation", "fragment", "Landroidx/fragment/app/Fragment;", "checkMultiWindow", "isLargeScreen", "isSmallScreen", "isLargerScreen", "isTablet", "isPortrait", "isLandscape", "isTabletAndLandscape", "isTabletOrLandscape", "isTabletAndPortrait", "isFoldableExpandOrPadPortrait", "getScreenState", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUIUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIUtils.kt\ncom/xiaomi/fitness/common/utils/UIUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"})
public final class UIUtils {

    @NotNull
    private static final String FORCE_FSG_NAV_BAR = "force_fsg_nav_bar";

    @NotNull
    private static final String HIDE_GESTURE_LINE = "hide_gesture_line";

    @NotNull
    public static final UIUtils INSTANCE = new UIUtils();

    @NotNull
    private static final String TAG = "UIUtils";

    private UIUtils() {
    }

    @JvmStatic
    public static final void checkInMainThread() {
        if (!INSTANCE.isInMainThread()) {
            throw new IllegalStateException("must call in main thread".toString());
        }
    }

    @JvmStatic
    @NotNull
    public static final Context getSafeContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Application application = context instanceof Application ? (Application) context : null;
        if (application != null) {
            return application;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @JvmStatic
    public static final boolean isNightMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public final int changeOrientation(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return -1;
        }
        int i = activity.getRequestedOrientation() == 0 ? 1 : 0;
        activity.setRequestedOrientation(i);
        return i;
    }

    public final void checkContext(@Nullable Context context) {
        Objects.requireNonNull(context, "context can not be null");
    }

    public final boolean checkMultiWindow(@Nullable Activity activity) {
        return activity != null && activity.isInMultiWindowMode();
    }

    public final void checkNotInMainThread() {
        if (!(!isInMainThread())) {
            throw new IllegalStateException("can't call in main thread".toString());
        }
    }

    public final int dip2px(@NotNull Context context, float dpValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final boolean fullScreenGestureEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Objects.requireNonNull(context);
            return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
        } catch (Exception e) {
            Logger.e(TAG, "fullScreenGestureEnabled: " + e);
            return false;
        }
    }

    public final boolean gestureLineEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Objects.requireNonNull(context);
            return Settings.Global.getInt(context.getContentResolver(), HIDE_GESTURE_LINE, 0) == 0;
        } catch (Exception e) {
            Logger.e(TAG, "gestureLineEnabled: " + e);
            return false;
        }
    }

    public final int getScreenHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public final int getScreenRealHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public final int getScreenState() {
        if (isTabletAndLandscape(ApplicationExtKt.getApplication())) {
            return 0;
        }
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 1;
        }
        if (isTabletAndPortrait(ApplicationExtKt.getApplication())) {
            return 2;
        }
        return isLandscape(ApplicationExtKt.getApplication()) ? 4 : 3;
    }

    public final int getScreenWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    public final int getStatusBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final void hideStatusBar(@Nullable Window window) {
        View viewPeekDecorView;
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.setSystemUiVisibility(4);
    }

    public final void hideSystemUI(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        Objects.requireNonNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(3846);
    }

    public final boolean isFoldableExpandOrPadPortrait() {
        int screenState = getScreenState();
        return screenState == 1 || screenState == 2;
    }

    public final boolean isGodzillaScale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().fontScale - 1.4f >= 0.0f;
    }

    public final boolean isHasNavigationBar(@Nullable Activity activity) {
        return (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView().findViewById(R.id.navigationBarBackground) == null) ? false : true;
    }

    public final boolean isInMainThread() {
        return Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
    }

    public final boolean isIntentAvailable(@Nullable Context context, @Nullable Intent intent) {
        return (intent == null || context == null || intent.resolveActivity(context.getPackageManager()) == null) ? false : true;
    }

    public final boolean isLandscape(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final boolean isLargeScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        return (context.getResources().getConfiguration().screenLayout & 15) == 3;
    }

    public final boolean isLargerScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public final boolean isPortrait(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().orientation == 1;
    }

    public final boolean isRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public final boolean isSmallScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().screenLayout & 15) == 1;
    }

    public final boolean isTablet(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = SystemProperties.INSTANCE.getString("ro.build.characteristics", "default");
        Logger.d(TAG, "isTablet mDeviceType=" + string);
        if (string != null) {
            return StringsKt__StringsKt.contains((CharSequence) string, (CharSequence) "emulator", true) ? isLargerScreen(context) : StringsKt__StringsKt.contains((CharSequence) string, (CharSequence) "tablet", true);
        }
        return false;
    }

    public final boolean isTabletAndLandscape(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return isTablet(context) && isLandscape(context);
    }

    public final boolean isTabletAndPortrait(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return isTablet(context) && isPortrait(context);
    }

    public final boolean isTabletOrLandscape(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return isTablet(context) || isLandscape(context);
    }

    public final int physicalScreenHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        Object systemService = context.getSystemService("display");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return ((DisplayManager) systemService).getDisplay(0).getMode().getPhysicalHeight();
    }

    public final int physicalScreenWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        Object systemService = context.getSystemService("display");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return ((DisplayManager) systemService).getDisplay(0).getMode().getPhysicalWidth();
    }

    public final int px2dip(@NotNull Context context, float pxValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int px2sp(@NotNull Context context, float pxValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((pxValue / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void setAlertDialogGravity(@NotNull AlertDialog alertDialog, int gravity) {
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        Window window = alertDialog.getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(gravity);
    }

    public final void setLightNavigationBar(@NotNull Window window, boolean light) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT < 30) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(light ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        } else {
            d dVarA = tkr.a(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(dVarA, "getInsetsController(...)");
            dVarA.b(light);
        }
    }

    public final void setLightStatusBar(@NotNull Window window, boolean light) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (Build.VERSION.SDK_INT < 30) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(light ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        } else {
            d dVarA = tkr.a(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(dVarA, "getInsetsController(...)");
            dVarA.c(light);
        }
    }

    public final void setNavigationBar(@Nullable Activity activity, int navigationColorRes, boolean isLightNavigationBar) {
        setNavigationBar(activity, navigationColorRes, 0, isLightNavigationBar);
    }

    public final void setNavigationBarColor(@NotNull Activity activity, int colorResId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(activity.getResources().getColor(colorResId));
    }

    public final void setNavigationBarTranslucent(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.addFlags(Integer.MIN_VALUE);
        window.addFlags(134217728);
    }

    public final void setStatusBarFontColor(@Nullable Activity activity, boolean darkFont) {
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (darkFont) {
            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
        }
    }

    public final int sp2px(@NotNull Context context, float spValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void updateBarColor(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean z = !isNightMode(activity);
        Window window = activity.getWindow();
        Intrinsics.checkNotNull(window);
        setLightNavigationBar(window, z);
        setLightStatusBar(window, z);
    }

    public final void setNavigationBar(@Nullable Activity activity, int navigationColorRes, int windowBgRes, boolean isLightNavigationBar) {
        if (activity == null) {
            return;
        }
        setNavigationBarColor(activity, navigationColorRes);
        Window window = activity.getWindow();
        if (windowBgRes != 0) {
            window.setBackgroundDrawable(activity.getDrawable(windowBgRes));
        }
        Intrinsics.checkNotNull(window);
        setLightNavigationBar(window, isLightNavigationBar);
    }

    public final boolean isTablet() {
        String string = SystemProperties.INSTANCE.getString("ro.build.characteristics", "default");
        Logger.d(TAG, "isTablet mDeviceType=" + string);
        return string != null && StringsKt__StringsKt.contains((CharSequence) string, (CharSequence) "tablet", true);
    }
}

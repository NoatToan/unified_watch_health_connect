package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.mipay.sdk.util.NavBarUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/utils/NavigationBarHelper;", "", "<init>", "()V", "TAG", "", "getNavigationBarHeight", "", "context", "Landroid/content/Context;", "isShowNavigationHandle", "", "isEnableGestureLine", "isSupportGestureLine", "isNavigationBarFullScreenCompat", "isNavigationBarFullScreen", "isFullScreenGestureMode", "getRealNavigationBarHeight", "checkDeviceHasNavigationBar", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavigationBarHelper {

    @NotNull
    public static final NavigationBarHelper INSTANCE = new NavigationBarHelper();

    @NotNull
    public static final String TAG = "NavigationBarHelper";

    private NavigationBarHelper() {
    }

    private final boolean checkDeviceHasNavigationBar(Context context) {
        String str = miuix.core.util.SystemProperties.get("qemu.hw.mainkeys");
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        if (Intrinsics.areEqual("1", str)) {
            return false;
        }
        if (Intrinsics.areEqual("0", str)) {
            return true;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return resources.getBoolean(identifier);
        }
        return false;
    }

    private final int getRealNavigationBarHeight(Context context) {
        int dimensionPixelSize = 0;
        if (checkDeviceHasNavigationBar(context)) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
            dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            Logger.i(TAG, "getNavigationBarHeightFromProp = " + dimensionPixelSize);
        }
        return dimensionPixelSize;
    }

    private final boolean isEnableGestureLine(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "hide_gesture_line", 0) == 0;
    }

    private final boolean isFullScreenGestureMode(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_navBarInteractionMode", "integer", PluginPackageConstant.RN_DIR_A);
        return identifier > 0 && resources.getInteger(identifier) == 2;
    }

    private final boolean isNavigationBarFullScreen(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), NavBarUtils.FORCE_FSG_NAV_BAR, 0) != 0;
    }

    private final boolean isNavigationBarFullScreenCompat(Context context) {
        boolean zIsNavigationBarFullScreen = isNavigationBarFullScreen(context);
        boolean zIsFullScreenGestureMode = isFullScreenGestureMode(context);
        Logger.i(TAG, "isNavigationBarFullScreenCompat " + zIsNavigationBarFullScreen + " " + zIsFullScreenGestureMode);
        return zIsNavigationBarFullScreen || zIsFullScreenGestureMode;
    }

    private final boolean isShowNavigationHandle(Context context) {
        return isEnableGestureLine(context) && isNavigationBarFullScreenCompat(context) && isSupportGestureLine(context);
    }

    private final boolean isSupportGestureLine(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "use_gesture_version_three", 0) != 0;
    }

    public final int getNavigationBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int realNavigationBarHeight = (isShowNavigationHandle(context) || !isNavigationBarFullScreenCompat(context)) ? getRealNavigationBarHeight(context) : 0;
        int i = realNavigationBarHeight >= 0 ? realNavigationBarHeight : 0;
        Logger.i(TAG, "getNavigationBarHeight = " + i);
        return i;
    }
}

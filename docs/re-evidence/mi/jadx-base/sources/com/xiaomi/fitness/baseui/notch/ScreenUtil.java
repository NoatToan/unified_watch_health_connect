package com.xiaomi.fitness.baseui.notch;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/ScreenUtil;", "", "<init>", "()V", "isPortrait", "", "context", "Landroid/content/Context;", "getContentViewHeight", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "getContentViewDisplayFrame", "Landroid/graphics/Rect;", "getContentView", "Landroid/view/View;", "getNavigationBarHeight", "getStatusBarHeight", "getDimensionPixel", "navigation_bar_height", "", "getScreenSize", "", "calculateNotchRect", "notchWidth", "notchHeight", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenUtil {

    @NotNull
    public static final ScreenUtil INSTANCE = new ScreenUtil();

    private ScreenUtil() {
    }

    private final int getDimensionPixel(Context context, String navigation_bar_height) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(navigation_bar_height, "dimen", PluginPackageConstant.RN_DIR_A);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @NotNull
    public final Rect calculateNotchRect(@NotNull Context context, int notchWidth, int notchHeight) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        int[] screenSize = getScreenSize(context);
        int i3 = 0;
        int i4 = screenSize[0];
        int i5 = screenSize[1];
        if (isPortrait(context)) {
            int i6 = (i4 - notchWidth) / 2;
            i = 0;
            i3 = i6;
            notchHeight = notchWidth + i6;
            i2 = notchHeight;
        } else {
            i = (i5 - notchWidth) / 2;
            i2 = notchWidth + i;
        }
        return new Rect(i3, i, notchHeight, i2);
    }

    @NotNull
    public final View getContentView(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    @NotNull
    public final Rect getContentViewDisplayFrame(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View contentView = getContentView(activity);
        Rect rect = new Rect();
        contentView.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public final int getContentViewHeight(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return getContentView(activity).getHeight();
    }

    public final int getNavigationBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getDimensionPixel(context, "navigation_bar_height");
    }

    @NotNull
    public final int[] getScreenSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = new int[2];
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.x;
            i2 = point.y;
        } catch (Throwable unused) {
        }
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final int getStatusBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getDimensionPixel(context, "status_bar_height");
    }

    public final boolean isPortrait(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().orientation == 1;
    }
}

package com.xiaomi.hm.health.utils.ex;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\u0012\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Landroid/view/View;", "", "getScreenWidth", "getScreenHeight", "Landroid/util/DisplayMetrics;", "getScreenMetrics", "", Constant.PAI_KEY_DAILY_PAI, "dp2px", "sp", "sp2px", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    public static final float dp2px(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics());
    }

    public static final int getScreenHeight(@NotNull View view) {
        return getScreenMetrics(view).heightPixels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final DisplayMetrics getScreenMetrics(@NotNull View view) {
        view.getContext();
        if (!(view instanceof Activity)) {
            return view.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) view).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int getScreenWidth(@NotNull View view) {
        return getScreenMetrics(view).widthPixels;
    }

    public static final float sp2px(@NotNull View view, float f) {
        return TypedValue.applyDimension(2, f, view.getContext().getResources().getDisplayMetrics());
    }
}

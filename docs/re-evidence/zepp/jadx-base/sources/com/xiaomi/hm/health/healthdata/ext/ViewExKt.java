package com.xiaomi.hm.health.healthdata.ext;

import android.util.TypedValue;
import android.view.View;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Landroid/view/View;", "", "visible", "", "setVisible", "isVisible", "", Constant.PAI_KEY_DAILY_PAI, "dpToPx", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    public static final float dpToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }
}

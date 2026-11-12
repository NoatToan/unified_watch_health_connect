package com.huami.bodymeasurements.common.ext;

import android.util.TypedValue;
import android.view.View;
import androidx.core.text.TextUtilsCompat;
import com.xiaomi.hm.health.Constant;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007\u001a\u0006\u0010\f\u001a\u00020\u0001¨\u0006\r"}, d2 = {"Landroid/view/View;", "", "visible", "", "setVisible", "setVisibleOrNot", "isVisible", "", Constant.PAI_KEY_DAILY_PAI, "dpToPx", "sp", "spToPx", "isRtl", "common_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    public static final float dpToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    public static final boolean isRtl() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void setVisibleOrNot(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }

    public static final float spToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(2, f, view.getResources().getDisplayMetrics());
    }
}

package com.huami.bloodoxygen.ui.utils;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.hm.health.Constant;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\n\u0010\u000b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0004¨\u0006\u000e"}, d2 = {"Landroid/view/View;", "", Constant.PAI_KEY_DAILY_PAI, "dpToPx", "", "dp2Px", "sp2Px", "", "visible", "", "setVisible", "isVisible", "", "formatToLocale", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionsKt {
    public static final float dp2Px(int i) {
        return (i * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public static final float dpToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    @NotNull
    public static final String formatToLocale(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i), Locale.getDefault()}, 2));
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final float sp2Px(int i) {
        return TypedValue.applyDimension(2, i, Resources.getSystem().getDisplayMetrics());
    }
}

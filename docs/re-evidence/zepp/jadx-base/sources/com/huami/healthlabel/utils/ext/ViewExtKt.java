package com.huami.healthlabel.utils.ext;

import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "", "solid", "", "setShape", "(Landroid/view/View;Ljava/lang/Integer;)V", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExtKt {
    public static final void setShape(@NotNull View view, @Nullable Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 18.0f, view.getResources().getDisplayMetrics()));
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        Unit unit = Unit.INSTANCE;
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void setShape$default(View view, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        setShape(view, num);
    }
}

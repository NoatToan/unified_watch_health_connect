package com.xiaomi.fitness.baseui.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/baseui/widget/ZoomOutPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$k;", "Landroid/view/View;", "page", "", "position", "", "transformPage", "(Landroid/view/View;F)V", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class ZoomOutPageTransformer implements ViewPager2.k {
    public static final float MIN_ALPHA = 0.3f;
    public static final float MIN_SCALE = 0.62f;

    @Override // androidx.viewpager2.widget.ViewPager2.k
    public void transformPage(@NotNull View page, float position) {
        Intrinsics.checkNotNullParameter(page, "page");
        int width = page.getWidth();
        int height = page.getHeight();
        if (position < -1.0f) {
            page.setAlpha(0.0f);
            return;
        }
        if (position > 1.0f) {
            page.setAlpha(0.0f);
            return;
        }
        float f = 1;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(0.62f, f - Math.abs(position));
        float f2 = f - fCoerceAtLeast;
        float f3 = 2;
        float f4 = (height * f2) / f3;
        float f5 = (width * f2) / f3;
        if (position < 0.0f) {
            page.setTranslationX(f5 - (f4 / f3));
        } else {
            page.setTranslationX((-f5) + (f4 / f3));
        }
        page.setScaleX(fCoerceAtLeast);
        page.setScaleY(fCoerceAtLeast);
        page.setAlpha((((fCoerceAtLeast - 0.62f) / 0.38f) * 0.7f) + 0.3f);
    }
}

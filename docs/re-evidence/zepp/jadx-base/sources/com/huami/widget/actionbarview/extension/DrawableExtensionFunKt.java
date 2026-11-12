package com.huami.widget.actionbarview.extension;

import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroid/graphics/drawable/Drawable;", "", "color", "tintDrawable", "action-bar-view_release"}, k = 2, mv = {1, 4, 0})
public final class DrawableExtensionFunKt {
    @Nullable
    public static final Drawable tintDrawable(@NotNull Drawable drawable, @ColorInt int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }
}

package com.google.accompanist.insets;

import kotlin.Metadata;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/google/accompanist/insets/MutableInsets;", "Landroidx/core/graphics/Insets;", "insets", "", "updateFrom", "Lcom/google/accompanist/insets/Insets;", "minimumValue", "coerceEachDimensionAtLeast", "insets_release"}, k = 2, mv = {1, 5, 1})
public final class InsetsKt {
    @NotNull
    public static final Insets coerceEachDimensionAtLeast(@NotNull Insets insets, @NotNull Insets insets2) {
        Insets insets3 = insets.getLeft() >= insets2.getLeft() && insets.getTop() >= insets2.getTop() && insets.getRight() >= insets2.getRight() && insets.getBottom() >= insets2.getBottom() ? insets : null;
        return insets3 == null ? new MutableInsets(e.coerceAtLeast(insets.getLeft(), insets2.getLeft()), e.coerceAtLeast(insets.getTop(), insets2.getTop()), e.coerceAtLeast(insets.getRight(), insets2.getRight()), e.coerceAtLeast(insets.getBottom(), insets2.getBottom())) : insets3;
    }

    public static final void updateFrom(@NotNull MutableInsets mutableInsets, @NotNull androidx.core.graphics.Insets insets) {
        mutableInsets.setLeft(insets.left);
        mutableInsets.setTop(insets.top);
        mutableInsets.setRight(insets.right);
        mutableInsets.setBottom(insets.bottom);
    }
}

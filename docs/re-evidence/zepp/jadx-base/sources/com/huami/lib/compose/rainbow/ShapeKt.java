package com.huami.lib.compose.rainbow;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/Shapes;", "a", "Landroidx/compose/material/Shapes;", "getShapes", "()Landroidx/compose/material/Shapes;", "Shapes", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class ShapeKt {

    @NotNull
    private static final Shapes a;

    static {
        float f = 6;
        a = new Shapes(RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(Dp.m2965constructorimpl(f)), RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(Dp.m2965constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50));
    }

    @NotNull
    public static final Shapes getShapes() {
        return a;
    }
}

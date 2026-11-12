package com.huami.lib.compose.rainbow;

import androidx.compose.material.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/Typography;", "a", "Landroidx/compose/material/Typography;", "getTypography", "()Landroidx/compose/material/Typography;", "Typography", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class TypeKt {

    @NotNull
    private static final Typography a;

    static {
        SystemFontFamily systemFontFamily = FontFamily.INSTANCE.getDefault();
        a = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, systemFontFamily, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), null, null, null, null, 15871, null);
    }

    @NotNull
    public static final Typography getTypography() {
        return a;
    }
}

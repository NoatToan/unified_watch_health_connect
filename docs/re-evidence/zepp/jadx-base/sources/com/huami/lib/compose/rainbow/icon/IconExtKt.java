package com.huami.lib.compose.rainbow.icon;

import android.text.TextUtils;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "mirror", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class IconExtKt {
    @Stable
    @NotNull
    public static final Modifier mirror(@NotNull Modifier modifier) {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? ScaleKt.scale(modifier, -1.0f, 1.0f) : modifier;
    }
}

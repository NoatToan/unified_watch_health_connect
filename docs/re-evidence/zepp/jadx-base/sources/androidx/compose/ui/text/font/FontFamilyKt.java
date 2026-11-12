package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u001a#\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"", "Landroidx/compose/ui/text/font/Font;", "fonts", "Landroidx/compose/ui/text/font/FontFamily;", "FontFamily", "", "([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "typeface", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class FontFamilyKt {
    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull List<? extends Font> list) {
        return new FontListFontFamily(list);
    }

    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull Font... fontArr) {
        return new FontListFontFamily(ArraysKt___ArraysJvmKt.asList(fontArr));
    }

    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull Typeface typeface) {
        return new LoadedFontFamily(typeface);
    }
}

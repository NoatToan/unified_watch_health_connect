package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapterHelperMethods;", "", "Landroid/graphics/Typeface;", "typeface", "", "finalFontWeight", "", "finalFontStyle", "create", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class TypefaceAdapterHelperMethods {

    @NotNull
    public static final TypefaceAdapterHelperMethods INSTANCE = new TypefaceAdapterHelperMethods();

    private TypefaceAdapterHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(28)
    @NotNull
    public final Typeface create(@NotNull Typeface typeface, int finalFontWeight, boolean finalFontStyle) {
        return Typeface.create(typeface, finalFontWeight, finalFontStyle);
    }
}

package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.Typeface;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/Typeface;", "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public interface AndroidTypeface extends Typeface {
    @NotNull
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    android.graphics.Typeface mo2838getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis);
}

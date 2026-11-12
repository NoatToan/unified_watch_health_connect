package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R-\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/TextFieldSize;", "", "Landroidx/compose/ui/unit/IntSize;", "computeMinSize-YbymL2g", "()J", "computeMinSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/TextStyle;", "style", "", "update", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "setResourceLoader", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "setStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "<set-?>", SDKConstants.PARAM_CONTEXT_MIN_SIZE, "J", "getMinSize-YbymL2g", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroidx/compose/ui/text/TextStyle;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class TextFieldSize {

    @NotNull
    private Density density;

    @NotNull
    private LayoutDirection layoutDirection;
    private long minSize = m480computeMinSizeYbymL2g();

    @NotNull
    private Font.ResourceLoader resourceLoader;

    @NotNull
    private TextStyle style;

    public TextFieldSize(@NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader, @NotNull TextStyle textStyle) {
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.resourceLoader = resourceLoader;
        this.style = textStyle;
    }

    /* JADX INFO: renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m480computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(TextStyleKt.resolveDefaults(this.style, this.layoutDirection), this.density, this.resourceLoader, null, 0, 24, null);
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: getMinSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMinSize() {
        return this.minSize;
    }

    @NotNull
    public final Font.ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.style;
    }

    public final void setDensity(@NotNull Density density) {
        this.density = density;
    }

    public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setResourceLoader(@NotNull Font.ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public final void setStyle(@NotNull TextStyle textStyle) {
        this.style = textStyle;
    }

    public final void update(@NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader, @NotNull TextStyle style) {
        if (layoutDirection == this.layoutDirection && Intrinsics.areEqual(density, this.density) && Intrinsics.areEqual(resourceLoader, this.resourceLoader) && Intrinsics.areEqual(style, this.style)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.resourceLoader = resourceLoader;
        this.style = style;
        this.minSize = m480computeMinSizeYbymL2g();
    }
}

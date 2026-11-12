package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import com.xiaomi.market.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001au\u0010\u0019\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/unit/Constraints;", "constraints", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Z", "canReuse", "other", "canReuseLayout", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class TextLayoutHelperKt {
    /* JADX INFO: renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m484canReuse7_7YC6M(@NotNull TextLayoutResult textLayoutResult, @NotNull AnnotatedString annotatedString, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Font.ResourceLoader resourceLoader, long j) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (Intrinsics.areEqual(layoutInput.getText(), annotatedString) && canReuseLayout(layoutInput.getStyle(), textStyle) && Intrinsics.areEqual(layoutInput.getPlaceholders(), list) && layoutInput.getMaxLines() == i && layoutInput.getSoftWrap() == z && TextOverflow.m2916equalsimpl0(layoutInput.getOverflow(), i2) && Intrinsics.areEqual(layoutInput.getDensity(), density) && layoutInput.getLayoutDirection() == layoutDirection && Intrinsics.areEqual(layoutInput.getResourceLoader(), resourceLoader) && Constraints.m2937getMinWidthimpl(j) == Constraints.m2937getMinWidthimpl(layoutInput.getConstraints())) {
            return !(z || TextOverflow.m2916equalsimpl0(i2, TextOverflow.INSTANCE.m2921getEllipsisgIe3tQ8())) || Constraints.m2935getMaxWidthimpl(j) == Constraints.m2935getMaxWidthimpl(layoutInput.getConstraints());
        }
        return false;
    }

    public static final boolean canReuseLayout(@NotNull TextStyle textStyle, @NotNull TextStyle textStyle2) {
        return TextUnit.m3103equalsimpl0(textStyle.getFontSize(), textStyle2.getFontSize()) && Intrinsics.areEqual(textStyle.getFontWeight(), textStyle2.getFontWeight()) && Intrinsics.areEqual(textStyle.getFontStyle(), textStyle2.getFontStyle()) && Intrinsics.areEqual(textStyle.getFontSynthesis(), textStyle2.getFontSynthesis()) && Intrinsics.areEqual(textStyle.getFontFamily(), textStyle2.getFontFamily()) && Intrinsics.areEqual(textStyle.getFontFeatureSettings(), textStyle2.getFontFeatureSettings()) && TextUnit.m3103equalsimpl0(textStyle.getLetterSpacing(), textStyle2.getLetterSpacing()) && Intrinsics.areEqual(textStyle.getBaselineShift(), textStyle2.getBaselineShift()) && Intrinsics.areEqual(textStyle.getTextGeometricTransform(), textStyle2.getTextGeometricTransform()) && Intrinsics.areEqual(textStyle.getLocaleList(), textStyle2.getLocaleList()) && Color.m1213equalsimpl0(textStyle.getBackground(), textStyle2.getBackground()) && Intrinsics.areEqual(textStyle.getTextAlign(), textStyle2.getTextAlign()) && Intrinsics.areEqual(textStyle.getTextDirection(), textStyle2.getTextDirection()) && TextUnit.m3103equalsimpl0(textStyle.getLineHeight(), textStyle2.getLineHeight()) && Intrinsics.areEqual(textStyle.getTextIndent(), textStyle2.getTextIndent());
    }
}

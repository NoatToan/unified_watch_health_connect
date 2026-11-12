package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0019\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0019\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0019\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012\"\u0019\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0019\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "start", Command.STOP, "", "fraction", "lerp", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveDefaults", "layoutDirection", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "resolveTextDirection-Yj3eThk", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/TextDirection;)I", "resolveTextDirection", "Landroidx/compose/ui/unit/TextUnit;", "DefaultFontSize", "J", "DefaultLetterSpacing", "Landroidx/compose/ui/graphics/Color;", "DefaultBackgroundColor", "DefaultLineHeight", "DefaultColor", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class TextStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultLineHeight;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultBackgroundColor = companion.m1247getTransparent0d7_KjU();
        DefaultLineHeight = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
        DefaultColor = companion.m1238getBlack0d7_KjU();
    }

    @NotNull
    public static final TextStyle lerp(@NotNull TextStyle textStyle, @NotNull TextStyle textStyle2, float f) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f));
    }

    @NotNull
    public static final TextStyle resolveDefaults(@NotNull TextStyle textStyle, @NotNull LayoutDirection layoutDirection) {
        long color = textStyle.getColor();
        Color.Companion companion = Color.INSTANCE;
        if (!(color != companion.m1248getUnspecified0d7_KjU())) {
            color = DefaultColor;
        }
        long j = color;
        long fontSize = TextUnitKt.m3124isUnspecifiedR2X_6o(textStyle.getFontSize()) ? DefaultFontSize : textStyle.getFontSize();
        FontWeight fontWeight = textStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = textStyle.getFontStyle();
        FontStyle fontStyleM2757boximpl = FontStyle.m2757boximpl(fontStyle == null ? FontStyle.INSTANCE.m2765getNormal_LCdwA() : fontStyle.m2763unboximpl());
        FontSynthesis fontSynthesis = textStyle.getFontSynthesis();
        FontSynthesis fontSynthesisM2766boximpl = FontSynthesis.m2766boximpl(fontSynthesis == null ? FontSynthesis.INSTANCE.m2775getAllGVVA2EU() : fontSynthesis.getValue());
        FontFamily fontFamily = textStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = textStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = TextUnitKt.m3124isUnspecifiedR2X_6o(textStyle.getLetterSpacing()) ? DefaultLetterSpacing : textStyle.getLetterSpacing();
        BaselineShift baselineShift = textStyle.getBaselineShift();
        BaselineShift baselineShiftM2870boximpl = BaselineShift.m2870boximpl(baselineShift == null ? BaselineShift.INSTANCE.m2880getNoney9eOQZs() : baselineShift.m2876unboximpl());
        TextGeometricTransform textGeometricTransform = textStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = textStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = textStyle.getBackground();
        if (!(background != companion.m1248getUnspecified0d7_KjU())) {
            background = DefaultBackgroundColor;
        }
        long j2 = background;
        TextDecoration textDecoration = textStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = textStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        TextAlign textAlign = textStyle.getTextAlign();
        TextAlign textAlignM2884boximpl = TextAlign.m2884boximpl(textAlign == null ? TextAlign.INSTANCE.m2896getStarte0LSkKk() : textAlign.getValue());
        TextDirection textDirectionM2897boximpl = TextDirection.m2897boximpl(m2744resolveTextDirectionYj3eThk(layoutDirection, textStyle.getTextDirection()));
        long lineHeight = TextUnitKt.m3124isUnspecifiedR2X_6o(textStyle.getLineHeight()) ? DefaultLineHeight : textStyle.getLineHeight();
        TextIndent textIndent = textStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.getNone();
        }
        return new TextStyle(j, fontSize, fontWeight2, fontStyleM2757boximpl, fontSynthesisM2766boximpl, fontFamily2, str, letterSpacing, baselineShiftM2870boximpl, textGeometricTransform2, localeList2, j2, textDecoration2, shadow2, textAlignM2884boximpl, textDirectionM2897boximpl, lineHeight, textIndent, null);
    }

    /* JADX INFO: renamed from: resolveTextDirection-Yj3eThk, reason: not valid java name */
    public static final int m2744resolveTextDirectionYj3eThk(@NotNull LayoutDirection layoutDirection, @Nullable TextDirection textDirection) {
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (textDirection == null ? false : TextDirection.m2900equalsimpl0(textDirection.getValue(), companion.m2904getContents_7Xco())) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i == 1) {
                return companion.m2905getContentOrLtrs_7Xco();
            }
            if (i == 2) {
                return companion.m2906getContentOrRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (textDirection != null) {
            return textDirection.getValue();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 == 1) {
            return companion.m2907getLtrs_7Xco();
        }
        if (i2 == 2) {
            return companion.m2908getRtls_7Xco();
        }
        throw new NoWhenBranchMatchedException();
    }
}

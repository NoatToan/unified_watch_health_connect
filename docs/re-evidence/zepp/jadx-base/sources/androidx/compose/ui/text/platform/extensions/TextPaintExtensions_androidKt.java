package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0001H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "typefaceAdapter", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "applySpanStyle", "", "hasFontAttributes", "Landroid/graphics/Typeface;", "createTypeface", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class TextPaintExtensions_androidKt {
    /* JADX WARN: Code duplicated, block: B:45:0x0146  */
    @NotNull
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint, @NotNull SpanStyle spanStyle, @NotNull TypefaceAdapter typefaceAdapter, @NotNull Density density) {
        long jM3117getUnspecifiedXSAIIZE;
        long jM3105getTypeUIouoOA = TextUnit.m3105getTypeUIouoOA(spanStyle.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3139getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo192toPxR2X_6o(spanStyle.getFontSize()));
        } else if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA, companion.m3138getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m3106getValueimpl(spanStyle.getFontSize()));
        }
        if (hasFontAttributes(spanStyle)) {
            androidTextPaint.setTypeface(createTypeface(spanStyle, typefaceAdapter));
        }
        if (spanStyle.getLocaleList() != null && !Intrinsics.areEqual(spanStyle.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
            } else {
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(spanStyle.getLocaleList().isEmpty() ? Locale.INSTANCE.getCurrent() : spanStyle.getLocaleList().get(0)));
            }
        }
        long jM3105getTypeUIouoOA2 = TextUnit.m3105getTypeUIouoOA(spanStyle.getLetterSpacing());
        if (TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA2, companion.m3138getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m3106getValueimpl(spanStyle.getLetterSpacing()));
        } else {
            TextUnitType.m3134equalsimpl0(jM3105getTypeUIouoOA2, companion.m3139getSpUIouoOA());
        }
        if (spanStyle.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m2845setColor8_81llA(spanStyle.getColor());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        if (TextUnitType.m3134equalsimpl0(TextUnit.m3105getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m3139getSpUIouoOA())) {
            if (TextUnit.m3106getValueimpl(spanStyle.getLetterSpacing()) == 0.0f) {
                jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
            } else {
                jM3117getUnspecifiedXSAIIZE = spanStyle.getLetterSpacing();
            }
        } else {
            jM3117getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3117getUnspecifiedXSAIIZE();
        }
        long j = jM3117getUnspecifiedXSAIIZE;
        long background = spanStyle.getBackground();
        Color.Companion companion2 = Color.INSTANCE;
        long jM1248getUnspecified0d7_KjU = Color.m1213equalsimpl0(background, companion2.m1247getTransparent0d7_KjU()) ? companion2.m1248getUnspecified0d7_KjU() : spanStyle.getBackground();
        BaselineShift baselineShift = spanStyle.getBaselineShift();
        return new SpanStyle(0L, 0L, null, null, null, null, null, j, baselineShift != null ? BaselineShift.m2873equalsimpl0(baselineShift.m2876unboximpl(), BaselineShift.INSTANCE.m2880getNoney9eOQZs()) : false ? null : spanStyle.getBaselineShift(), null, null, jM1248getUnspecified0d7_KjU, null, null, 13951, null);
    }

    private static final Typeface createTypeface(SpanStyle spanStyle, TypefaceAdapter typefaceAdapter) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        int iM2765getNormal_LCdwA = fontStyle == null ? FontStyle.INSTANCE.m2765getNormal_LCdwA() : fontStyle.m2763unboximpl();
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        return typefaceAdapter.m2851createDPcqOEQ(fontFamily, fontWeight, iM2765getNormal_LCdwA, fontSynthesis == null ? FontSynthesis.INSTANCE.m2775getAllGVVA2EU() : fontSynthesis.getValue());
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}

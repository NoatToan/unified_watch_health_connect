package com.mapbox.maps.extension.style.utils;

import android.graphics.Color;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import e23.l;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\bJ(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0006J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/extension/style/utils/ColorUtils;", "", "()V", "TAG", "", "colorIntToRgbaExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", TtmlNode.ATTR_TTS_COLOR, "", "colorToGlRgbaArray", "", "colorToRgbaArray", "colorToRgbaString", "formatARGB", "alpha", "", "red", "green", "blue", "formatAlpha", "matchToColorOrNull", "m", "Ljava/util/regex/Matcher;", "(Ljava/util/regex/Matcher;)Ljava/lang/Integer;", "rgbaExpressionToColorInt", "value", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Ljava/lang/Integer;", "rgbaExpressionToColorString", "rgbaToColor", "(Ljava/lang/String;)Ljava/lang/Integer;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();
    private static final String TAG = "ColorUtils";

    private ColorUtils() {
    }

    private final String formatARGB(double alpha, int red, int green, int blue) {
        String alpha2 = formatAlpha(alpha);
        x0 x0Var = x0.f105818a;
        return String.format(Locale.US, "rgba(%d, %d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(red), Integer.valueOf(green), Integer.valueOf(blue), alpha2}, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatAlpha(double alpha) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.getClass();
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        decimalFormat.applyPattern("#.########");
        String str = decimalFormat.format(alpha);
        str.getClass();
        return str;
    }

    private final Integer matchToColorOrNull(Matcher m14) {
        if (!m14.matches() || m14.groupCount() != 4) {
            return null;
        }
        String strGroup = m14.group(4);
        float f14 = strGroup != null ? Float.parseFloat(strGroup) : 1.0f;
        String strGroup2 = m14.group(1);
        strGroup2.getClass();
        int i14 = (int) Float.parseFloat(strGroup2);
        String strGroup3 = m14.group(2);
        strGroup3.getClass();
        int i15 = (int) Float.parseFloat(strGroup3);
        String strGroup4 = m14.group(3);
        strGroup4.getClass();
        return Integer.valueOf(Color.argb((int) ((f14 * 255.0f) + 0.5f), i14, i15, (int) Float.parseFloat(strGroup4)));
    }

    public final Expression colorIntToRgbaExpression(int color) {
        return ExpressionDslKt.rgba(new AnonymousClass1(color, ((double) ((color >> 24) & 255)) / 255.0d));
    }

    public final float[] colorToGlRgbaArray(int color) {
        return new float[]{((color >> 16) & 255) / 255.0f, ((color >> 8) & 255) / 255.0f, (color & 255) / 255.0f, ((color >> 24) & 255) / 255.0f};
    }

    public final float[] colorToRgbaArray(int color) {
        return new float[]{(color >> 16) & 255, (color >> 8) & 255, color & 255, ((color >> 24) & 255) / 255.0f};
    }

    public final String colorToRgbaString(int color) {
        return formatARGB(((double) ((color >> 24) & 255)) / 255.0d, (color >> 16) & 255, (color >> 8) & 255, color & 255);
    }

    public final Integer rgbaExpressionToColorInt(Expression value) {
        value.getClass();
        Matcher matcher = Pattern.compile("\\[?\\s*rgba?\\s*,?\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\]").matcher(value.toString());
        matcher.getClass();
        return matchToColorOrNull(matcher);
    }

    public final String rgbaExpressionToColorString(Expression value) {
        value.getClass();
        Matcher matcher = Pattern.compile("\\[?\\s*rgba?\\s*,?\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\]").matcher(value.toString());
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return null;
        }
        String strGroup = matcher.group(4);
        double d14 = strGroup != null ? Double.parseDouble(strGroup) : 1.0d;
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        int i14 = (int) Float.parseFloat(strGroup2);
        String strGroup3 = matcher.group(2);
        strGroup3.getClass();
        int i15 = (int) Float.parseFloat(strGroup3);
        String strGroup4 = matcher.group(3);
        strGroup4.getClass();
        return formatARGB(d14, i14, i15, (int) Float.parseFloat(strGroup4));
    }

    public final Integer rgbaToColor(String value) {
        value.getClass();
        Matcher matcher = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(value);
        matcher.getClass();
        return matchToColorOrNull(matcher);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.style.utils.ColorUtils$colorIntToRgbaExpression$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Expression.ExpressionBuilder, Unit> {
        final /* synthetic */ double $alpha;
        final /* synthetic */ int $color;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i14, double d14) {
            super(1);
            this.$color = i14;
            this.$alpha = d14;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Expression.ExpressionBuilder expressionBuilder) {
            expressionBuilder.getClass();
            expressionBuilder.literal((this.$color >> 16) & 255);
            expressionBuilder.literal((this.$color >> 8) & 255);
            expressionBuilder.literal(this.$color & 255);
            expressionBuilder.literal(Double.parseDouble(ColorUtils.INSTANCE.formatAlpha(this.$alpha)));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Expression.ExpressionBuilder expressionBuilder) {
            invoke2(expressionBuilder);
            return Unit.INSTANCE;
        }
    }
}

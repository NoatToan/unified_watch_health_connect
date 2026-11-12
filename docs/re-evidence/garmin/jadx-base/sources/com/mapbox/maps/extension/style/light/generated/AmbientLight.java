package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.light.Light;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J#\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010)\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0013\u0010,\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00102\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b3\u0010.¨\u00064"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lcom/mapbox/maps/extension/style/light/generated/AmbientLightDslReceiver;", "Lcom/mapbox/maps/extension/style/light/Light;", "", "lightId", "<init>", "(Ljava/lang/String;)V", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "", "intensity", "(D)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "intensityTransition", "colorUseTheme", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLightId", "getColorUseTheme", "getColorUseTheme$annotations", "()V", "getColorUseThemeAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getColorUseThemeAsExpression$annotations", "colorUseThemeAsExpression", "getColorAsColorInt", "()Ljava/lang/Integer;", "colorAsColorInt", "getColor", "getColorAsExpression", "colorAsExpression", "getColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getIntensity", "()Ljava/lang/Double;", "getIntensityAsExpression", "intensityAsExpression", "getIntensityTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AmbientLight extends Light implements AmbientLightDslReceiver {
    private final String lightId;

    public AmbientLight(String str) {
        str.getClass();
        this.lightId = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight color(int color) {
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight colorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    @MapboxExperimental
    public AmbientLight colorUseTheme(String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    public final String getColor() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(colorAsExpression);
        }
        return null;
    }

    public final Integer getColorAsColorInt() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(colorAsExpression);
        }
        return null;
    }

    public final Expression getColorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType(TtmlNode.ATTR_TTS_COLOR, Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    public final StyleTransition getColorTransition() {
        return getTransitionProperty$extension_style_release("color-transition");
    }

    public final String getColorUseTheme() {
        return (String) getPropertyValueWithType("color-use-theme", String.class);
    }

    public final Expression getColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String colorUseTheme = getColorUseTheme();
        if (colorUseTheme != null) {
            return Expression.INSTANCE.literal(colorUseTheme);
        }
        return null;
    }

    public final Double getIntensity() {
        return (Double) getPropertyValueWithType("intensity", Double.class);
    }

    public final Expression getIntensityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("intensity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double intensity = getIntensity();
        if (intensity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(intensity.doubleValue());
    }

    public final StyleTransition getIntensityTransition() {
        return getTransitionProperty$extension_style_release("intensity-transition");
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    public String getLightId() {
        return this.lightId;
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    public String getType$extension_style_release() {
        return "ambient";
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight intensity(double intensity) {
        setProperty$extension_style_release(new PropertyValue<>("intensity", Double.valueOf(intensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight intensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        intensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    @MapboxExperimental
    public AmbientLight colorUseTheme(Expression colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight intensity(Expression intensity) {
        intensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity", intensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight color(String color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight color(Expression color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight colorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.AmbientLightDslReceiver
    public AmbientLight intensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity-transition", options));
        return this;
    }
}

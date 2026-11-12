package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.light.Light;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b0\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J#\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0013J#\u0010 \u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0013J#\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0017¢\u0006\u0004\b#\u0010\u000fJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\nH\u0017¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010&\u001a\u00020\u0003H\u0010¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010-\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010\f8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010%R\u0013\u00103\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u00109\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b8\u0010,R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b:\u00105R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010>\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b=\u0010,R\u0013\u0010 \u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b?\u00105R\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0013\u0010B\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bA\u0010,R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bC\u00105R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010%R\u001c\u0010I\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010F\u001a\u0004\bG\u0010,¨\u0006J"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lcom/mapbox/maps/extension/style/light/generated/DirectionalLightDslReceiver;", "Lcom/mapbox/maps/extension/style/light/Light;", "", "lightId", "<init>", "(Ljava/lang/String;)V", "", "castShadows", "(Z)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "", "", "direction", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "directionTransition", "intensity", "(D)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "intensityTransition", "shadowIntensity", "shadowIntensityTransition", "colorUseTheme", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLightId", "getCastShadows", "()Ljava/lang/Boolean;", "getCastShadowsAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "castShadowsAsExpression", "getColorAsColorInt", "()Ljava/lang/Integer;", "colorAsColorInt", "getColor", "getColorAsExpression", "colorAsExpression", "getColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDirection", "()Ljava/util/List;", "getDirectionAsExpression", "directionAsExpression", "getDirectionTransition", "getIntensity", "()Ljava/lang/Double;", "getIntensityAsExpression", "intensityAsExpression", "getIntensityTransition", "getShadowIntensity", "getShadowIntensityAsExpression", "shadowIntensityAsExpression", "getShadowIntensityTransition", "getColorUseTheme", "getColorUseTheme$annotations", "()V", "getColorUseThemeAsExpression", "getColorUseThemeAsExpression$annotations", "colorUseThemeAsExpression", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DirectionalLight extends Light implements DirectionalLightDslReceiver {
    private final String lightId;

    public DirectionalLight(String str) {
        str.getClass();
        this.lightId = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight castShadows(boolean castShadows) {
        setProperty$extension_style_release(new PropertyValue<>("cast-shadows", Boolean.valueOf(castShadows)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight color(int color) {
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight colorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @MapboxExperimental
    public DirectionalLight colorUseTheme(String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight direction(List<Double> direction) {
        direction.getClass();
        setProperty$extension_style_release(new PropertyValue<>("direction", direction));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight directionTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        directionTransition(builder.build());
        return this;
    }

    public final Boolean getCastShadows() {
        return (Boolean) getPropertyValueWithType("cast-shadows", Boolean.class);
    }

    public final Expression getCastShadowsAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("cast-shadows", Expression.class);
        if (expression != null) {
            return expression;
        }
        Boolean castShadows = getCastShadows();
        if (castShadows == null) {
            return null;
        }
        return Expression.INSTANCE.literal(castShadows.booleanValue());
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

    public final List<Double> getDirection() {
        return (List) getPropertyValueWithType("direction", List.class);
    }

    public final Expression getDirectionAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("direction", Expression.class);
        if (expression != null) {
            return expression;
        }
        List<Double> direction = getDirection();
        if (direction != null) {
            return Expression.INSTANCE.literal$extension_style_release(direction);
        }
        return null;
    }

    public final StyleTransition getDirectionTransition() {
        return getTransitionProperty$extension_style_release("direction-transition");
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

    public final Double getShadowIntensity() {
        return (Double) getPropertyValueWithType("shadow-intensity", Double.class);
    }

    public final Expression getShadowIntensityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("shadow-intensity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double shadowIntensity = getShadowIntensity();
        if (shadowIntensity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(shadowIntensity.doubleValue());
    }

    public final StyleTransition getShadowIntensityTransition() {
        return getTransitionProperty$extension_style_release("shadow-intensity-transition");
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    public String getType$extension_style_release() {
        return "directional";
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight intensity(double intensity) {
        setProperty$extension_style_release(new PropertyValue<>("intensity", Double.valueOf(intensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight intensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        intensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight shadowIntensity(double shadowIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("shadow-intensity", Double.valueOf(shadowIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight shadowIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        shadowIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    @MapboxExperimental
    public DirectionalLight colorUseTheme(Expression colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight direction(Expression direction) {
        direction.getClass();
        setProperty$extension_style_release(new PropertyValue<>("direction", direction));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight castShadows(Expression castShadows) {
        castShadows.getClass();
        setProperty$extension_style_release(new PropertyValue<>("cast-shadows", castShadows));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight intensity(Expression intensity) {
        intensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity", intensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight shadowIntensity(Expression shadowIntensity) {
        shadowIntensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-intensity", shadowIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight color(String color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight color(Expression color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight colorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight directionTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("direction-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight intensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.DirectionalLightDslReceiver
    public DirectionalLight shadowIntensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-intensity-transition", options));
        return this;
    }
}

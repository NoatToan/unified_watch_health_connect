package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Anchor;
import com.mapbox.maps.extension.style.light.Light;
import com.mapbox.maps.extension.style.light.LightPosition;
import com.mapbox.maps.extension.style.light.LightUtils;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J#\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J'\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020#H\u0016¢\u0006\u0004\b!\u0010$J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\fJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0014J#\u0010%\u001a\u00020\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0004H\u0017¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000bH\u0017¢\u0006\u0004\b&\u0010\fJ\u000f\u0010)\u001a\u00020\u0004H\u0010¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00107\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0013\u0010:\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010@\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b?\u00103R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bA\u0010<R\u0013\u0010!\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010E\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bD\u00103R\u0013\u0010%\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bF\u0010<R\u001c\u0010&\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bG\u0010(R\u001c\u0010L\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010I\u001a\u0004\bJ\u00103¨\u0006M"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/light/generated/FlatLightDslReceiver;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLightExtension;", "Lcom/mapbox/maps/extension/style/light/Light;", "", "lightId", "<init>", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;", "anchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "", "intensity", "(D)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "intensityTransition", "radialCoordinate", "azimuthalAngle", "polarAngle", ModelSourceWrapper.POSITION, "(DDD)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/light/LightPosition;", "(Lcom/mapbox/maps/extension/style/light/LightPosition;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "positionTransition", "colorUseTheme", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "Ljava/lang/String;", "getLightId", "getAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;", "getAnchorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "anchorAsExpression", "getColorAsColorInt", "()Ljava/lang/Integer;", "colorAsColorInt", "getColor", "getColorAsExpression", "colorAsExpression", "getColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getIntensity", "()Ljava/lang/Double;", "getIntensityAsExpression", "intensityAsExpression", "getIntensityTransition", "getPosition", "()Lcom/mapbox/maps/extension/style/light/LightPosition;", "getPositionAsExpression", "positionAsExpression", "getPositionTransition", "getColorUseTheme", "getColorUseTheme$annotations", "()V", "getColorUseThemeAsExpression", "getColorUseThemeAsExpression$annotations", "colorUseThemeAsExpression", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FlatLight extends Light implements FlatLightDslReceiver, StyleContract.StyleLightExtension {
    private final String lightId;

    public FlatLight(String str) {
        str.getClass();
        this.lightId = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight anchor(Anchor anchor) {
        anchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("anchor", anchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleLightExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        LightUtils.setLight(delegate, this);
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight color(int color) {
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight colorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @MapboxExperimental
    public FlatLight colorUseTheme(String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    public final Anchor getAnchor() {
        String str = (String) getPropertyValueWithType("anchor", String.class);
        if (str == null) {
            return null;
        }
        Anchor.Companion companion = Anchor.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getAnchorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("anchor", Expression.class);
        if (expression != null) {
            return expression;
        }
        Anchor anchor = getAnchor();
        if (anchor != null) {
            return Expression.INSTANCE.literal(anchor.getValue());
        }
        return null;
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

    public final LightPosition getPosition() {
        List<Double> list = (List) getPropertyValueWithType(ModelSourceWrapper.POSITION, List.class);
        if (list != null) {
            return LightPosition.INSTANCE.fromList(list);
        }
        return null;
    }

    public final Expression getPositionAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType(ModelSourceWrapper.POSITION, Expression.class);
        if (expression != null) {
            return expression;
        }
        LightPosition position = getPosition();
        if (position != null) {
            return Expression.INSTANCE.literal$extension_style_release(position.toList());
        }
        return null;
    }

    public final StyleTransition getPositionTransition() {
        return getTransitionProperty$extension_style_release("position-transition");
    }

    @Override // com.mapbox.maps.extension.style.light.Light
    public String getType$extension_style_release() {
        return "flat";
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight intensity(double intensity) {
        setProperty$extension_style_release(new PropertyValue<>("intensity", Double.valueOf(intensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight intensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        intensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight position(LightPosition position) {
        position.getClass();
        setProperty$extension_style_release(new PropertyValue<>(ModelSourceWrapper.POSITION, position));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight positionTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        positionTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight anchor(Expression anchor) {
        anchor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("anchor", anchor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    @MapboxExperimental
    public FlatLight colorUseTheme(Expression colorUseTheme) {
        colorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight position(double radialCoordinate, double azimuthalAngle, double polarAngle) {
        position(new LightPosition(radialCoordinate, azimuthalAngle, polarAngle));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight intensity(Expression intensity) {
        intensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity", intensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight position(Expression position) {
        position.getClass();
        setProperty$extension_style_release(new PropertyValue<>(ModelSourceWrapper.POSITION, position));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight color(String color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight color(Expression color) {
        color.getClass();
        setProperty$extension_style_release(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight colorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight intensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.light.generated.FlatLightDslReceiver
    public FlatLight positionTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("position-transition", options));
        return this;
    }
}

package com.mapbox.maps.extension.style.layers.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.BackgroundPitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0018J#\u0010 \u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0010J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\rJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010\u0018J#\u0010\"\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\bJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\rJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0017¢\u0006\u0004\b%\u0010\rJ\u000f\u0010)\u001a\u00020\u0003H\u0010¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b5\u0010(R\u0013\u00107\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b6\u00100R\u0013\u0010:\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010(R\u001c\u0010B\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010?\u001a\u0004\b@\u00100R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bC\u00103R\u0013\u0010E\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bD\u00100R\u0013\u0010 \u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bF\u0010<R\u0013\u0010!\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bG\u00103R\u0013\u0010I\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bH\u00100R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bJ\u0010<R\u0013\u0010#\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010(R\u0013\u0010M\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bL\u00100R\u001c\u0010%\u001a\u0004\u0018\u00010$8FX\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010?\u001a\u0004\bN\u0010OR\u001c\u0010S\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010?\u001a\u0004\bQ\u00100¨\u0006U"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "<init>", "(Ljava/lang/String;)V", "slot", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "maxZoom", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "backgroundColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "backgroundColorUseTheme", "backgroundEmissiveStrength", "backgroundEmissiveStrengthTransition", "backgroundOpacity", "backgroundOpacityTransition", "backgroundPattern", "Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "backgroundPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSlot", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getBackgroundColor", "getBackgroundColorAsExpression", "backgroundColorAsExpression", "getBackgroundColorAsColorInt", "()Ljava/lang/Integer;", "backgroundColorAsColorInt", "getBackgroundColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getBackgroundColorUseTheme", "getBackgroundColorUseTheme$annotations", "()V", "getBackgroundColorUseThemeAsExpression", "getBackgroundColorUseThemeAsExpression$annotations", "backgroundColorUseThemeAsExpression", "getBackgroundEmissiveStrength", "getBackgroundEmissiveStrengthAsExpression", "backgroundEmissiveStrengthAsExpression", "getBackgroundEmissiveStrengthTransition", "getBackgroundOpacity", "getBackgroundOpacityAsExpression", "backgroundOpacityAsExpression", "getBackgroundOpacityTransition", "getBackgroundPattern", "getBackgroundPatternAsExpression", "backgroundPatternAsExpression", "getBackgroundPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "getBackgroundPitchAlignment$annotations", "getBackgroundPitchAlignmentAsExpression", "getBackgroundPitchAlignmentAsExpression$annotations", "backgroundPitchAlignmentAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BackgroundLayer extends Layer implements BackgroundLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;

    public BackgroundLayer(String str) {
        str.getClass();
        this.layerId = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundPitchAlignment$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getBackgroundPitchAlignmentAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundColor(int backgroundColor) {
        setProperty$extension_style_release(new PropertyValue<>("background-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(backgroundColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        backgroundColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    public BackgroundLayer backgroundColorUseTheme(String backgroundColorUseTheme) {
        backgroundColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color-use-theme", backgroundColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundEmissiveStrength(double backgroundEmissiveStrength) {
        setProperty$extension_style_release(new PropertyValue<>("background-emissive-strength", Double.valueOf(backgroundEmissiveStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        backgroundEmissiveStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundOpacity(double backgroundOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("background-opacity", Double.valueOf(backgroundOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        backgroundOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundPattern(String backgroundPattern) {
        backgroundPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pattern", backgroundPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    public BackgroundLayer backgroundPitchAlignment(BackgroundPitchAlignment backgroundPitchAlignment) {
        backgroundPitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pitch-alignment", backgroundPitchAlignment));
        return this;
    }

    public final String getBackgroundColor() {
        Expression backgroundColorAsExpression = getBackgroundColorAsExpression();
        if (backgroundColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(backgroundColorAsExpression);
        }
        return null;
    }

    public final Integer getBackgroundColorAsColorInt() {
        Expression backgroundColorAsExpression = getBackgroundColorAsExpression();
        if (backgroundColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(backgroundColorAsExpression);
        }
        return null;
    }

    public final Expression getBackgroundColorAsExpression() {
        return (Expression) getPropertyValueWithType("background-color", Expression.class);
    }

    public final StyleTransition getBackgroundColorTransition() {
        return (StyleTransition) getPropertyValueWithType("background-color-transition", StyleTransition.class);
    }

    public final String getBackgroundColorUseTheme() {
        return (String) getPropertyValueWithType("background-color-use-theme", String.class);
    }

    public final Expression getBackgroundColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-color-use-theme");
    }

    public final Double getBackgroundEmissiveStrength() {
        return (Double) getPropertyValueWithType("background-emissive-strength", Double.class);
    }

    public final Expression getBackgroundEmissiveStrengthAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-emissive-strength");
    }

    public final StyleTransition getBackgroundEmissiveStrengthTransition() {
        return (StyleTransition) getPropertyValueWithType("background-emissive-strength-transition", StyleTransition.class);
    }

    public final Double getBackgroundOpacity() {
        return (Double) getPropertyValueWithType("background-opacity", Double.class);
    }

    public final Expression getBackgroundOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-opacity");
    }

    public final StyleTransition getBackgroundOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("background-opacity-transition", StyleTransition.class);
    }

    public final String getBackgroundPattern() {
        return (String) getPropertyValueWithType("background-pattern", String.class);
    }

    public final Expression getBackgroundPatternAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("background-pattern");
    }

    public final BackgroundPitchAlignment getBackgroundPitchAlignment() {
        String str = (String) getPropertyValueWithType("background-pitch-alignment", String.class);
        if (str == null) {
            return null;
        }
        BackgroundPitchAlignment.Companion companion = BackgroundPitchAlignment.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    public final Expression getBackgroundPitchAlignmentAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("background-pitch-alignment", Expression.class);
        if (expression != null) {
            return expression;
        }
        BackgroundPitchAlignment backgroundPitchAlignment = getBackgroundPitchAlignment();
        if (backgroundPitchAlignment != null) {
            return Expression.INSTANCE.literal(backgroundPitchAlignment.getValue());
        }
        return null;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getLayerId() {
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMaxZoom() {
        return (Double) getPropertyValueWithType("maxzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMinZoom() {
        return (Double) getPropertyValueWithType("minzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "background";
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Visibility getVisibility() {
        String str = (String) getPropertyValueWithType("visibility", String.class);
        if (str == null) {
            return null;
        }
        Visibility.Companion companion = Visibility.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Expression getVisibilityAsExpression() {
        return (Expression) getPropertyValueWithType("visibility", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public BackgroundLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public BackgroundLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public BackgroundLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public BackgroundLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u000eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010!\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0013\u0010%\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u0004\u0018\u00010,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u000eR\u0013\u00103\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0013\u00105\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer$Companion;", "", "()V", "defaultBackgroundColor", "", "getDefaultBackgroundColor", "()Ljava/lang/String;", "defaultBackgroundColorAsColorInt", "", "getDefaultBackgroundColorAsColorInt", "()Ljava/lang/Integer;", "defaultBackgroundColorAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultBackgroundColorAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultBackgroundColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultBackgroundColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultBackgroundColorUseTheme", "getDefaultBackgroundColorUseTheme$annotations", "getDefaultBackgroundColorUseTheme", "defaultBackgroundColorUseThemeAsExpression", "getDefaultBackgroundColorUseThemeAsExpression$annotations", "getDefaultBackgroundColorUseThemeAsExpression", "defaultBackgroundEmissiveStrength", "", "getDefaultBackgroundEmissiveStrength", "()Ljava/lang/Double;", "defaultBackgroundEmissiveStrengthAsExpression", "getDefaultBackgroundEmissiveStrengthAsExpression", "defaultBackgroundEmissiveStrengthTransition", "getDefaultBackgroundEmissiveStrengthTransition", "defaultBackgroundOpacity", "getDefaultBackgroundOpacity", "defaultBackgroundOpacityAsExpression", "getDefaultBackgroundOpacityAsExpression", "defaultBackgroundOpacityTransition", "getDefaultBackgroundOpacityTransition", "defaultBackgroundPattern", "getDefaultBackgroundPattern", "defaultBackgroundPatternAsExpression", "getDefaultBackgroundPatternAsExpression", "defaultBackgroundPitchAlignment", "Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "getDefaultBackgroundPitchAlignment$annotations", "getDefaultBackgroundPitchAlignment", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "defaultBackgroundPitchAlignmentAsExpression", "getDefaultBackgroundPitchAlignmentAsExpression$annotations", "getDefaultBackgroundPitchAlignmentAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundPitchAlignment$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultBackgroundPitchAlignmentAsExpression$annotations() {
        }

        public final String getDefaultBackgroundColor() {
            Expression defaultBackgroundColorAsExpression = getDefaultBackgroundColorAsExpression();
            if (defaultBackgroundColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultBackgroundColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultBackgroundColorAsColorInt() {
            Expression defaultBackgroundColorAsExpression = getDefaultBackgroundColorAsExpression();
            if (defaultBackgroundColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultBackgroundColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultBackgroundColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultBackgroundColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultBackgroundColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultBackgroundColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultBackgroundColorUseTheme = getDefaultBackgroundColorUseTheme();
            if (defaultBackgroundColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultBackgroundColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultBackgroundEmissiveStrength() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultBackgroundEmissiveStrengthAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-emissive-strength");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultBackgroundEmissiveStrength = getDefaultBackgroundEmissiveStrength();
            if (defaultBackgroundEmissiveStrength == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBackgroundEmissiveStrength.doubleValue());
        }

        public final StyleTransition getDefaultBackgroundEmissiveStrengthTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-emissive-strength-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultBackgroundOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultBackgroundOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultBackgroundOpacity = getDefaultBackgroundOpacity();
            if (defaultBackgroundOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBackgroundOpacity.doubleValue());
        }

        public final StyleTransition getDefaultBackgroundOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultBackgroundPattern() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-pattern");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultBackgroundPatternAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-pattern");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultBackgroundPattern = getDefaultBackgroundPattern();
            if (defaultBackgroundPattern != null) {
                return Expression.INSTANCE.literal(defaultBackgroundPattern);
            }
            return null;
        }

        public final BackgroundPitchAlignment getDefaultBackgroundPitchAlignment() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-pitch-alignment");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            BackgroundPitchAlignment.Companion companion = BackgroundPitchAlignment.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        public final Expression getDefaultBackgroundPitchAlignmentAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "background-pitch-alignment");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            BackgroundPitchAlignment defaultBackgroundPitchAlignment = getDefaultBackgroundPitchAlignment();
            if (defaultBackgroundPitchAlignment != null) {
                return Expression.INSTANCE.literal(defaultBackgroundPitchAlignment.getValue());
            }
            return null;
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "maxzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultMinZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("background", "visibility");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            Visibility.Companion companion = Visibility.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    public BackgroundLayer backgroundColorUseTheme(Expression backgroundColorUseTheme) {
        backgroundColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color-use-theme", backgroundColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundPattern(Expression backgroundPattern) {
        backgroundPattern.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pattern", backgroundPattern));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    @MapboxExperimental
    public BackgroundLayer backgroundPitchAlignment(Expression backgroundPitchAlignment) {
        backgroundPitchAlignment.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-pitch-alignment", backgroundPitchAlignment));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundEmissiveStrength(Expression backgroundEmissiveStrength) {
        backgroundEmissiveStrength.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-emissive-strength", backgroundEmissiveStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundOpacity(Expression backgroundOpacity) {
        backgroundOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-opacity", backgroundOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public BackgroundLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundColor(Expression backgroundColor) {
        backgroundColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color", backgroundColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundColor(String backgroundColor) {
        backgroundColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color", backgroundColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundEmissiveStrengthTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-emissive-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.BackgroundLayerDsl
    public BackgroundLayer backgroundOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("background-opacity-transition", options));
        return this;
    }
}

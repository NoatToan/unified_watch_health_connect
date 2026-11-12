package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\bE\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0001fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0017¢\u0006\u0004\b\u001e\u0010$J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0011H\u0017¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000bH\u0017¢\u0006\u0004\b%\u0010\rJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0011H\u0017¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000bH\u0017¢\u0006\u0004\b&\u0010\rJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011H\u0017¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000bH\u0017¢\u0006\u0004\b'\u0010\rJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b(\u0010\u001fJ#\u0010(\u001a\u00020\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0017¢\u0006\u0004\b(\u0010$J\u000f\u0010+\u001a\u00020\u0003H\u0010¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010*R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00102R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00108R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010*R\u001c\u0010?\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010<\u001a\u0004\b=\u00102R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010<\u001a\u0004\b@\u00102R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010*R\u001c\u0010F\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010<\u001a\u0004\bD\u00102R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010<\u001a\u0004\bG\u0010HR\u001c\u0010L\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u00102R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010<\u001a\u0004\bM\u00108R\u001c\u0010Q\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010<\u001a\u0004\bO\u00102R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001c8FX\u0087\u0004¢\u0006\f\u0012\u0004\bT\u0010<\u001a\u0004\bR\u0010SR\u001c\u0010%\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010<\u001a\u0004\bU\u00108R\u001c\u0010Y\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010<\u001a\u0004\bW\u00102R\u001c\u0010&\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010<\u001a\u0004\bZ\u00108R\u001c\u0010^\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010<\u001a\u0004\b\\\u00102R\u001c\u0010'\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010<\u001a\u0004\b_\u00108R\u001c\u0010c\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010<\u001a\u0004\ba\u00102R\u001c\u0010(\u001a\u0004\u0018\u00010\u001c8FX\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010<\u001a\u0004\bd\u0010S¨\u0006g"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "maxZoom", "rasterParticleArrayBand", "rasterParticleColor", "rasterParticleColorUseTheme", "", "rasterParticleCount", "(J)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "rasterParticleFadeOpacityFactor", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "rasterParticleFadeOpacityFactorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "rasterParticleMaxSpeed", "rasterParticleResetRateFactor", "rasterParticleSpeedFactor", "rasterParticleSpeedFactorTransition", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getRasterParticleArrayBand", "getRasterParticleArrayBand$annotations", "()V", "getRasterParticleArrayBandAsExpression", "getRasterParticleArrayBandAsExpression$annotations", "rasterParticleArrayBandAsExpression", "getRasterParticleColor", "getRasterParticleColor$annotations", "getRasterParticleColorUseTheme", "getRasterParticleColorUseTheme$annotations", "getRasterParticleColorUseThemeAsExpression", "getRasterParticleColorUseThemeAsExpression$annotations", "rasterParticleColorUseThemeAsExpression", "getRasterParticleCount", "()Ljava/lang/Long;", "getRasterParticleCount$annotations", "getRasterParticleCountAsExpression", "getRasterParticleCountAsExpression$annotations", "rasterParticleCountAsExpression", "getRasterParticleFadeOpacityFactor", "getRasterParticleFadeOpacityFactor$annotations", "getRasterParticleFadeOpacityFactorAsExpression", "getRasterParticleFadeOpacityFactorAsExpression$annotations", "rasterParticleFadeOpacityFactorAsExpression", "getRasterParticleFadeOpacityFactorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getRasterParticleFadeOpacityFactorTransition$annotations", "getRasterParticleMaxSpeed", "getRasterParticleMaxSpeed$annotations", "getRasterParticleMaxSpeedAsExpression", "getRasterParticleMaxSpeedAsExpression$annotations", "rasterParticleMaxSpeedAsExpression", "getRasterParticleResetRateFactor", "getRasterParticleResetRateFactor$annotations", "getRasterParticleResetRateFactorAsExpression", "getRasterParticleResetRateFactorAsExpression$annotations", "rasterParticleResetRateFactorAsExpression", "getRasterParticleSpeedFactor", "getRasterParticleSpeedFactor$annotations", "getRasterParticleSpeedFactorAsExpression", "getRasterParticleSpeedFactorAsExpression$annotations", "rasterParticleSpeedFactorAsExpression", "getRasterParticleSpeedFactorTransition", "getRasterParticleSpeedFactorTransition$annotations", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class RasterParticleLayer extends Layer implements RasterParticleLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public RasterParticleLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleArrayBand$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleArrayBandAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleCount$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleCountAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleFadeOpacityFactorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleMaxSpeed$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleMaxSpeedAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleResetRateFactor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleResetRateFactorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getRasterParticleSpeedFactorTransition$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    public RasterParticleLayer filter(Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
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

    public final String getRasterParticleArrayBand() {
        return (String) getPropertyValueWithType("raster-particle-array-band", String.class);
    }

    public final Expression getRasterParticleArrayBandAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-array-band");
    }

    public final Expression getRasterParticleColor() {
        return (Expression) getPropertyValueWithType("raster-particle-color", Expression.class);
    }

    public final String getRasterParticleColorUseTheme() {
        return (String) getPropertyValueWithType("raster-particle-color-use-theme", String.class);
    }

    public final Expression getRasterParticleColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-color-use-theme");
    }

    public final Long getRasterParticleCount() {
        Number number = (Number) getPropertyValueWithType("raster-particle-count", Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public final Expression getRasterParticleCountAsExpression() {
        Expression propertyValueAsExpressionOrLiteralExpression$extension_style_release = getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-count");
        if (propertyValueAsExpressionOrLiteralExpression$extension_style_release == null) {
            return null;
        }
        Object literalValue = propertyValueAsExpressionOrLiteralExpression$extension_style_release.getLiteralValue();
        Number number = literalValue instanceof Number ? (Number) literalValue : null;
        if (number != null) {
            Expression expressionLiteral = Expression.INSTANCE.literal(number.longValue());
            if (expressionLiteral != null) {
                return expressionLiteral;
            }
        }
        return propertyValueAsExpressionOrLiteralExpression$extension_style_release;
    }

    public final Double getRasterParticleFadeOpacityFactor() {
        return (Double) getPropertyValueWithType("raster-particle-fade-opacity-factor", Double.class);
    }

    public final Expression getRasterParticleFadeOpacityFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-fade-opacity-factor");
    }

    public final StyleTransition getRasterParticleFadeOpacityFactorTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-particle-fade-opacity-factor-transition", StyleTransition.class);
    }

    public final Double getRasterParticleMaxSpeed() {
        return (Double) getPropertyValueWithType("raster-particle-max-speed", Double.class);
    }

    public final Expression getRasterParticleMaxSpeedAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-max-speed");
    }

    public final Double getRasterParticleResetRateFactor() {
        return (Double) getPropertyValueWithType("raster-particle-reset-rate-factor", Double.class);
    }

    public final Expression getRasterParticleResetRateFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-reset-rate-factor");
    }

    public final Double getRasterParticleSpeedFactor() {
        return (Double) getPropertyValueWithType("raster-particle-speed-factor", Double.class);
    }

    public final Expression getRasterParticleSpeedFactorAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("raster-particle-speed-factor");
    }

    public final StyleTransition getRasterParticleSpeedFactorTransition() {
        return (StyleTransition) getPropertyValueWithType("raster-particle-speed-factor-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceLayer() {
        return (String) getPropertyValueWithType("source-layer", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "raster-particle";
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
    public RasterParticleLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterParticleLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleArrayBand(String rasterParticleArrayBand) {
        rasterParticleArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-array-band", rasterParticleArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleColor(Expression rasterParticleColor) {
        rasterParticleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-color", rasterParticleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleColorUseTheme(String rasterParticleColorUseTheme) {
        rasterParticleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-color-use-theme", rasterParticleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleCount(long rasterParticleCount) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-count", Long.valueOf(rasterParticleCount)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleFadeOpacityFactor(double rasterParticleFadeOpacityFactor) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-fade-opacity-factor", Double.valueOf(rasterParticleFadeOpacityFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleFadeOpacityFactorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterParticleFadeOpacityFactorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleMaxSpeed(double rasterParticleMaxSpeed) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-max-speed", Double.valueOf(rasterParticleMaxSpeed)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleResetRateFactor(double rasterParticleResetRateFactor) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-reset-rate-factor", Double.valueOf(rasterParticleResetRateFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleSpeedFactor(double rasterParticleSpeedFactor) {
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-speed-factor", Double.valueOf(rasterParticleSpeedFactor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleSpeedFactorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        rasterParticleSpeedFactorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterParticleLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    public RasterParticleLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterParticleLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0012R\u001c\u0010$\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0012R\u001c\u0010*\u001a\u0004\u0018\u00010+8FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0006R\u001c\u00102\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0012R\u001c\u00105\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0006R\u001c\u00108\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0012R\u001c\u0010;\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0006R\u001c\u0010>\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0012R\u001c\u0010A\u001a\u0004\u0018\u00010+8FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010.R\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer$Companion;", "", "()V", "defaultMaxZoom", "", "getDefaultMaxZoom", "()Ljava/lang/Double;", "defaultMinZoom", "getDefaultMinZoom", "defaultRasterParticleArrayBand", "", "getDefaultRasterParticleArrayBand$annotations", "getDefaultRasterParticleArrayBand", "()Ljava/lang/String;", "defaultRasterParticleArrayBandAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultRasterParticleArrayBandAsExpression$annotations", "getDefaultRasterParticleArrayBandAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultRasterParticleColor", "getDefaultRasterParticleColor$annotations", "getDefaultRasterParticleColor", "defaultRasterParticleColorUseTheme", "getDefaultRasterParticleColorUseTheme$annotations", "getDefaultRasterParticleColorUseTheme", "defaultRasterParticleColorUseThemeAsExpression", "getDefaultRasterParticleColorUseThemeAsExpression$annotations", "getDefaultRasterParticleColorUseThemeAsExpression", "defaultRasterParticleCount", "", "getDefaultRasterParticleCount$annotations", "getDefaultRasterParticleCount", "()Ljava/lang/Long;", "defaultRasterParticleCountAsExpression", "getDefaultRasterParticleCountAsExpression$annotations", "getDefaultRasterParticleCountAsExpression", "defaultRasterParticleFadeOpacityFactor", "getDefaultRasterParticleFadeOpacityFactor$annotations", "getDefaultRasterParticleFadeOpacityFactor", "defaultRasterParticleFadeOpacityFactorAsExpression", "getDefaultRasterParticleFadeOpacityFactorAsExpression$annotations", "getDefaultRasterParticleFadeOpacityFactorAsExpression", "defaultRasterParticleFadeOpacityFactorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultRasterParticleFadeOpacityFactorTransition$annotations", "getDefaultRasterParticleFadeOpacityFactorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultRasterParticleMaxSpeed", "getDefaultRasterParticleMaxSpeed$annotations", "getDefaultRasterParticleMaxSpeed", "defaultRasterParticleMaxSpeedAsExpression", "getDefaultRasterParticleMaxSpeedAsExpression$annotations", "getDefaultRasterParticleMaxSpeedAsExpression", "defaultRasterParticleResetRateFactor", "getDefaultRasterParticleResetRateFactor$annotations", "getDefaultRasterParticleResetRateFactor", "defaultRasterParticleResetRateFactorAsExpression", "getDefaultRasterParticleResetRateFactorAsExpression$annotations", "getDefaultRasterParticleResetRateFactorAsExpression", "defaultRasterParticleSpeedFactor", "getDefaultRasterParticleSpeedFactor$annotations", "getDefaultRasterParticleSpeedFactor", "defaultRasterParticleSpeedFactorAsExpression", "getDefaultRasterParticleSpeedFactorAsExpression$annotations", "getDefaultRasterParticleSpeedFactorAsExpression", "defaultRasterParticleSpeedFactorTransition", "getDefaultRasterParticleSpeedFactorTransition$annotations", "getDefaultRasterParticleSpeedFactorTransition", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleArrayBand$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleArrayBandAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleColor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleCount$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleCountAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleFadeOpacityFactor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleFadeOpacityFactorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleFadeOpacityFactorTransition$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleMaxSpeed$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleMaxSpeedAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleResetRateFactor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleResetRateFactorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleSpeedFactor$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleSpeedFactorAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultRasterParticleSpeedFactorTransition$annotations() {
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final String getDefaultRasterParticleArrayBand() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-array-band");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultRasterParticleArrayBandAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-array-band");
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
            String defaultRasterParticleArrayBand = getDefaultRasterParticleArrayBand();
            if (defaultRasterParticleArrayBand != null) {
                return Expression.INSTANCE.literal(defaultRasterParticleArrayBand);
            }
            return null;
        }

        public final Expression getDefaultRasterParticleColor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Expression) objUnwrap;
        }

        public final String getDefaultRasterParticleColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultRasterParticleColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-color-use-theme");
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
            String defaultRasterParticleColorUseTheme = getDefaultRasterParticleColorUseTheme();
            if (defaultRasterParticleColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultRasterParticleColorUseTheme);
            }
            return null;
        }

        public final Long getDefaultRasterParticleCount() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-count");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Number.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Number number = (Number) objUnwrap;
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }

        public final Expression getDefaultRasterParticleCountAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-count");
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
            Long defaultRasterParticleCount = getDefaultRasterParticleCount();
            if (defaultRasterParticleCount == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleCount.longValue());
        }

        public final Double getDefaultRasterParticleFadeOpacityFactor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-fade-opacity-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterParticleFadeOpacityFactorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-fade-opacity-factor");
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
            Double defaultRasterParticleFadeOpacityFactor = getDefaultRasterParticleFadeOpacityFactor();
            if (defaultRasterParticleFadeOpacityFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleFadeOpacityFactor.doubleValue());
        }

        public final StyleTransition getDefaultRasterParticleFadeOpacityFactorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-fade-opacity-factor-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultRasterParticleMaxSpeed() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-max-speed");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterParticleMaxSpeedAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-max-speed");
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
            Double defaultRasterParticleMaxSpeed = getDefaultRasterParticleMaxSpeed();
            if (defaultRasterParticleMaxSpeed == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleMaxSpeed.doubleValue());
        }

        public final Double getDefaultRasterParticleResetRateFactor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-reset-rate-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterParticleResetRateFactorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-reset-rate-factor");
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
            Double defaultRasterParticleResetRateFactor = getDefaultRasterParticleResetRateFactor();
            if (defaultRasterParticleResetRateFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleResetRateFactor.doubleValue());
        }

        public final Double getDefaultRasterParticleSpeedFactor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-speed-factor");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultRasterParticleSpeedFactorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-speed-factor");
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
            Double defaultRasterParticleSpeedFactor = getDefaultRasterParticleSpeedFactor();
            if (defaultRasterParticleSpeedFactor == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultRasterParticleSpeedFactor.doubleValue());
        }

        public final StyleTransition getDefaultRasterParticleSpeedFactorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "raster-particle-speed-factor-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("raster-particle", "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleArrayBand(Expression rasterParticleArrayBand) {
        rasterParticleArrayBand.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-array-band", rasterParticleArrayBand));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleColorUseTheme(Expression rasterParticleColorUseTheme) {
        rasterParticleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-color-use-theme", rasterParticleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleCount(Expression rasterParticleCount) {
        rasterParticleCount.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-count", rasterParticleCount));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleFadeOpacityFactor(Expression rasterParticleFadeOpacityFactor) {
        rasterParticleFadeOpacityFactor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-fade-opacity-factor", rasterParticleFadeOpacityFactor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleMaxSpeed(Expression rasterParticleMaxSpeed) {
        rasterParticleMaxSpeed.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-max-speed", rasterParticleMaxSpeed));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleResetRateFactor(Expression rasterParticleResetRateFactor) {
        rasterParticleResetRateFactor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-reset-rate-factor", rasterParticleResetRateFactor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleSpeedFactor(Expression rasterParticleSpeedFactor) {
        rasterParticleSpeedFactor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-speed-factor", rasterParticleSpeedFactor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public RasterParticleLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleFadeOpacityFactorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-fade-opacity-factor-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.RasterParticleLayerDsl
    @MapboxExperimental
    public RasterParticleLayer rasterParticleSpeedFactorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("raster-particle-speed-factor-transition", options));
        return this;
    }
}

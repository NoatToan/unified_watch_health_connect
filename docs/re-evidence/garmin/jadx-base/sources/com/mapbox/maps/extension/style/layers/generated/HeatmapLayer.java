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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b1\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016¢\u0006\u0004\b\u001a\u0010 J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\rJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010\u001bJ#\u0010\"\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\rJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010\u001bJ#\u0010$\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016¢\u0006\u0004\b$\u0010 J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\rJ\u000f\u0010(\u001a\u00020\u0003H\u0010¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010'R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010'R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00103\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010/R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010'R\u001c\u0010=\u001a\u0004\u0018\u00010\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010:\u001a\u0004\b;\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b>\u00105R\u0013\u0010@\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b?\u0010/R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010!\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bC\u00105R\u0013\u0010E\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bD\u0010/R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0013\u0010#\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bG\u00105R\u0013\u0010I\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bH\u0010/R\u0013\u0010$\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bJ\u0010BR\u0013\u0010%\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bK\u00105R\u0013\u0010M\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bL\u0010/¨\u0006O"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sourceLayer", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "maxZoom", "heatmapColor", "heatmapColorUseTheme", "heatmapIntensity", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "heatmapIntensityTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "heatmapOpacity", "heatmapOpacityTransition", "heatmapRadius", "heatmapRadiusTransition", "heatmapWeight", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSourceId", "getSourceLayer", "getSlot", "getFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getHeatmapColor", "getHeatmapColorUseTheme", "getHeatmapColorUseTheme$annotations", "()V", "getHeatmapColorUseThemeAsExpression", "getHeatmapColorUseThemeAsExpression$annotations", "heatmapColorUseThemeAsExpression", "getHeatmapIntensity", "getHeatmapIntensityAsExpression", "heatmapIntensityAsExpression", "getHeatmapIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getHeatmapOpacity", "getHeatmapOpacityAsExpression", "heatmapOpacityAsExpression", "getHeatmapOpacityTransition", "getHeatmapRadius", "getHeatmapRadiusAsExpression", "heatmapRadiusAsExpression", "getHeatmapRadiusTransition", "getHeatmapWeight", "getHeatmapWeightAsExpression", "heatmapWeightAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HeatmapLayer extends Layer implements HeatmapLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;
    private final String sourceId;

    public HeatmapLayer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.layerId = str;
        this.sourceId = str2;
        setInternalSourceId$extension_style_release(str2);
    }

    @MapboxExperimental
    public static /* synthetic */ void getHeatmapColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getHeatmapColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer filter(Expression filter) {
        filter.getClass();
        setProperty$extension_style_release(new PropertyValue<>("filter", filter));
        return this;
    }

    public final Expression getFilter() {
        return (Expression) getPropertyValueWithType("filter", Expression.class);
    }

    public final Expression getHeatmapColor() {
        return (Expression) getPropertyValueWithType("heatmap-color", Expression.class);
    }

    public final String getHeatmapColorUseTheme() {
        return (String) getPropertyValueWithType("heatmap-color-use-theme", String.class);
    }

    public final Expression getHeatmapColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-color-use-theme");
    }

    public final Double getHeatmapIntensity() {
        return (Double) getPropertyValueWithType("heatmap-intensity", Double.class);
    }

    public final Expression getHeatmapIntensityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-intensity");
    }

    public final StyleTransition getHeatmapIntensityTransition() {
        return (StyleTransition) getPropertyValueWithType("heatmap-intensity-transition", StyleTransition.class);
    }

    public final Double getHeatmapOpacity() {
        return (Double) getPropertyValueWithType("heatmap-opacity", Double.class);
    }

    public final Expression getHeatmapOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-opacity");
    }

    public final StyleTransition getHeatmapOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("heatmap-opacity-transition", StyleTransition.class);
    }

    public final Double getHeatmapRadius() {
        return (Double) getPropertyValueWithType("heatmap-radius", Double.class);
    }

    public final Expression getHeatmapRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-radius");
    }

    public final StyleTransition getHeatmapRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("heatmap-radius-transition", StyleTransition.class);
    }

    public final Double getHeatmapWeight() {
        return (Double) getPropertyValueWithType("heatmap-weight", Double.class);
    }

    public final Expression getHeatmapWeightAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("heatmap-weight");
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

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceLayer() {
        return (String) getPropertyValueWithType("source-layer", String.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "heatmap";
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

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapColor(Expression heatmapColor) {
        heatmapColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-color", heatmapColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @MapboxExperimental
    public HeatmapLayer heatmapColorUseTheme(String heatmapColorUseTheme) {
        heatmapColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-color-use-theme", heatmapColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapIntensity(double heatmapIntensity) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-intensity", Double.valueOf(heatmapIntensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapIntensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        heatmapIntensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapOpacity(double heatmapOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-opacity", Double.valueOf(heatmapOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        heatmapOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapRadius(double heatmapRadius) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-radius", Double.valueOf(heatmapRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        heatmapRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapWeight(double heatmapWeight) {
        setProperty$extension_style_release(new PropertyValue<>("heatmap-weight", Double.valueOf(heatmapWeight)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HeatmapLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HeatmapLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HeatmapLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer sourceLayer(String sourceLayer) {
        sourceLayer.getClass();
        setProperty$extension_style_release(new PropertyValue<>("source-layer", sourceLayer));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HeatmapLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0006R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0013\u0010#\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0013\u0010%\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0013\u0010'\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0013\u0010)\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010\u0012R\u0013\u0010+\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer$Companion;", "", "()V", "defaultHeatmapColor", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultHeatmapColor", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultHeatmapColorUseTheme", "", "getDefaultHeatmapColorUseTheme$annotations", "getDefaultHeatmapColorUseTheme", "()Ljava/lang/String;", "defaultHeatmapColorUseThemeAsExpression", "getDefaultHeatmapColorUseThemeAsExpression$annotations", "getDefaultHeatmapColorUseThemeAsExpression", "defaultHeatmapIntensity", "", "getDefaultHeatmapIntensity", "()Ljava/lang/Double;", "defaultHeatmapIntensityAsExpression", "getDefaultHeatmapIntensityAsExpression", "defaultHeatmapIntensityTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultHeatmapIntensityTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultHeatmapOpacity", "getDefaultHeatmapOpacity", "defaultHeatmapOpacityAsExpression", "getDefaultHeatmapOpacityAsExpression", "defaultHeatmapOpacityTransition", "getDefaultHeatmapOpacityTransition", "defaultHeatmapRadius", "getDefaultHeatmapRadius", "defaultHeatmapRadiusAsExpression", "getDefaultHeatmapRadiusAsExpression", "defaultHeatmapRadiusTransition", "getDefaultHeatmapRadiusTransition", "defaultHeatmapWeight", "getDefaultHeatmapWeight", "defaultHeatmapWeightAsExpression", "getDefaultHeatmapWeightAsExpression", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHeatmapColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultHeatmapColorUseThemeAsExpression$annotations() {
        }

        public final Expression getDefaultHeatmapColor() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Expression) objUnwrap;
        }

        public final String getDefaultHeatmapColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultHeatmapColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-color-use-theme");
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
            String defaultHeatmapColorUseTheme = getDefaultHeatmapColorUseTheme();
            if (defaultHeatmapColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultHeatmapColorUseTheme);
            }
            return null;
        }

        public final Double getDefaultHeatmapIntensity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-intensity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHeatmapIntensityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-intensity");
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
            Double defaultHeatmapIntensity = getDefaultHeatmapIntensity();
            if (defaultHeatmapIntensity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapIntensity.doubleValue());
        }

        public final StyleTransition getDefaultHeatmapIntensityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-intensity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultHeatmapOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHeatmapOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-opacity");
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
            Double defaultHeatmapOpacity = getDefaultHeatmapOpacity();
            if (defaultHeatmapOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapOpacity.doubleValue());
        }

        public final StyleTransition getDefaultHeatmapOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultHeatmapRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHeatmapRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-radius");
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
            Double defaultHeatmapRadius = getDefaultHeatmapRadius();
            if (defaultHeatmapRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapRadius.doubleValue());
        }

        public final StyleTransition getDefaultHeatmapRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultHeatmapWeight() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-weight");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultHeatmapWeightAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "heatmap-weight");
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
            Double defaultHeatmapWeight = getDefaultHeatmapWeight();
            if (defaultHeatmapWeight == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultHeatmapWeight.doubleValue());
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "maxzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "minzoom");
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
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("heatmap", "visibility");
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

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    @MapboxExperimental
    public HeatmapLayer heatmapColorUseTheme(Expression heatmapColorUseTheme) {
        heatmapColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-color-use-theme", heatmapColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapIntensity(Expression heatmapIntensity) {
        heatmapIntensity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-intensity", heatmapIntensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapOpacity(Expression heatmapOpacity) {
        heatmapOpacity.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-opacity", heatmapOpacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapRadius(Expression heatmapRadius) {
        heatmapRadius.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-radius", heatmapRadius));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapWeight(Expression heatmapWeight) {
        heatmapWeight.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-weight", heatmapWeight));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public HeatmapLayer visibility(Expression visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapIntensityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.HeatmapLayerDsl
    public HeatmapLayer heatmapRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("heatmap-radius-transition", options));
        return this;
    }
}

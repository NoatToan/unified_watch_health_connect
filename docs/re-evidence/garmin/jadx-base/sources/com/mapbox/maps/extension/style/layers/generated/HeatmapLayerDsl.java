package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\tJ\u0019\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H&¢\u0006\u0004\b\u0016\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\rH&¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001e\u0010\u0017J#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b \u0010\u0017J#\u0010 \u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H&¢\u0006\u0004\b \u0010\u001cJ\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\rH&¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "maxZoom", "heatmapColor", "heatmapColorUseTheme", "heatmapIntensity", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "heatmapIntensityTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/HeatmapLayer;", "heatmapOpacity", "heatmapOpacityTransition", "heatmapRadius", "heatmapRadiusTransition", "heatmapWeight", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface HeatmapLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ HeatmapLayer heatmapIntensity$default(HeatmapLayerDsl heatmapLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: heatmapIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return heatmapLayerDsl.heatmapIntensity(d14);
        }

        public static /* synthetic */ HeatmapLayer heatmapOpacity$default(HeatmapLayerDsl heatmapLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: heatmapOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return heatmapLayerDsl.heatmapOpacity(d14);
        }

        public static /* synthetic */ HeatmapLayer heatmapRadius$default(HeatmapLayerDsl heatmapLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: heatmapRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 30.0d;
            }
            return heatmapLayerDsl.heatmapRadius(d14);
        }

        public static /* synthetic */ HeatmapLayer heatmapWeight$default(HeatmapLayerDsl heatmapLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: heatmapWeight");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return heatmapLayerDsl.heatmapWeight(d14);
        }
    }

    HeatmapLayer filter(Expression filter);

    HeatmapLayer heatmapColor(Expression heatmapColor);

    @MapboxExperimental
    HeatmapLayer heatmapColorUseTheme(Expression heatmapColorUseTheme);

    @MapboxExperimental
    HeatmapLayer heatmapColorUseTheme(String heatmapColorUseTheme);

    HeatmapLayer heatmapIntensity(double heatmapIntensity);

    HeatmapLayer heatmapIntensity(Expression heatmapIntensity);

    HeatmapLayer heatmapIntensityTransition(StyleTransition options);

    HeatmapLayer heatmapIntensityTransition(l<? super StyleTransition.Builder, Unit> block);

    HeatmapLayer heatmapOpacity(double heatmapOpacity);

    HeatmapLayer heatmapOpacity(Expression heatmapOpacity);

    HeatmapLayer heatmapOpacityTransition(StyleTransition options);

    HeatmapLayer heatmapOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    HeatmapLayer heatmapRadius(double heatmapRadius);

    HeatmapLayer heatmapRadius(Expression heatmapRadius);

    HeatmapLayer heatmapRadiusTransition(StyleTransition options);

    HeatmapLayer heatmapRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    HeatmapLayer heatmapWeight(double heatmapWeight);

    HeatmapLayer heatmapWeight(Expression heatmapWeight);

    HeatmapLayer maxZoom(double maxZoom);

    HeatmapLayer minZoom(double minZoom);

    HeatmapLayer slot(String slot);

    HeatmapLayer sourceLayer(String sourceLayer);

    HeatmapLayer visibility(Expression visibility);

    HeatmapLayer visibility(Visibility visibility);
}

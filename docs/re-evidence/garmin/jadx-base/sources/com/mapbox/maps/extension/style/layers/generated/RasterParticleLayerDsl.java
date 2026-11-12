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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\rH'¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH'¢\u0006\u0004\b\u001a\u0010 J\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\rH'¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H'¢\u0006\u0004\b!\u0010\tJ\u0019\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\rH'¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\tJ\u0019\u0010#\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\rH'¢\u0006\u0004\b#\u0010\u000fJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\tJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b$\u0010\u001bJ#\u0010$\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH'¢\u0006\u0004\b$\u0010 ¨\u0006%"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "maxZoom", "rasterParticleArrayBand", "rasterParticleColor", "rasterParticleColorUseTheme", "", "rasterParticleCount", "(J)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "rasterParticleFadeOpacityFactor", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "rasterParticleFadeOpacityFactorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/RasterParticleLayer;", "rasterParticleMaxSpeed", "rasterParticleResetRateFactor", "rasterParticleSpeedFactor", "rasterParticleSpeedFactorTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public interface RasterParticleLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ RasterParticleLayer rasterParticleCount$default(RasterParticleLayerDsl rasterParticleLayerDsl, long j8, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterParticleCount");
                return null;
            }
            if ((i14 & 1) != 0) {
                j8 = 512;
            }
            return rasterParticleLayerDsl.rasterParticleCount(j8);
        }

        public static /* synthetic */ RasterParticleLayer rasterParticleFadeOpacityFactor$default(RasterParticleLayerDsl rasterParticleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterParticleFadeOpacityFactor");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.98d;
            }
            return rasterParticleLayerDsl.rasterParticleFadeOpacityFactor(d14);
        }

        public static /* synthetic */ RasterParticleLayer rasterParticleMaxSpeed$default(RasterParticleLayerDsl rasterParticleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterParticleMaxSpeed");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return rasterParticleLayerDsl.rasterParticleMaxSpeed(d14);
        }

        public static /* synthetic */ RasterParticleLayer rasterParticleResetRateFactor$default(RasterParticleLayerDsl rasterParticleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterParticleResetRateFactor");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.8d;
            }
            return rasterParticleLayerDsl.rasterParticleResetRateFactor(d14);
        }

        public static /* synthetic */ RasterParticleLayer rasterParticleSpeedFactor$default(RasterParticleLayerDsl rasterParticleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterParticleSpeedFactor");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.2d;
            }
            return rasterParticleLayerDsl.rasterParticleSpeedFactor(d14);
        }
    }

    RasterParticleLayer filter(Expression filter);

    RasterParticleLayer maxZoom(double maxZoom);

    RasterParticleLayer minZoom(double minZoom);

    @MapboxExperimental
    RasterParticleLayer rasterParticleArrayBand(Expression rasterParticleArrayBand);

    @MapboxExperimental
    RasterParticleLayer rasterParticleArrayBand(String rasterParticleArrayBand);

    @MapboxExperimental
    RasterParticleLayer rasterParticleColor(Expression rasterParticleColor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleColorUseTheme(Expression rasterParticleColorUseTheme);

    @MapboxExperimental
    RasterParticleLayer rasterParticleColorUseTheme(String rasterParticleColorUseTheme);

    @MapboxExperimental
    RasterParticleLayer rasterParticleCount(long rasterParticleCount);

    @MapboxExperimental
    RasterParticleLayer rasterParticleCount(Expression rasterParticleCount);

    @MapboxExperimental
    RasterParticleLayer rasterParticleFadeOpacityFactor(double rasterParticleFadeOpacityFactor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleFadeOpacityFactor(Expression rasterParticleFadeOpacityFactor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleFadeOpacityFactorTransition(StyleTransition options);

    @MapboxExperimental
    RasterParticleLayer rasterParticleFadeOpacityFactorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    RasterParticleLayer rasterParticleMaxSpeed(double rasterParticleMaxSpeed);

    @MapboxExperimental
    RasterParticleLayer rasterParticleMaxSpeed(Expression rasterParticleMaxSpeed);

    @MapboxExperimental
    RasterParticleLayer rasterParticleResetRateFactor(double rasterParticleResetRateFactor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleResetRateFactor(Expression rasterParticleResetRateFactor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleSpeedFactor(double rasterParticleSpeedFactor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleSpeedFactor(Expression rasterParticleSpeedFactor);

    @MapboxExperimental
    RasterParticleLayer rasterParticleSpeedFactorTransition(StyleTransition options);

    @MapboxExperimental
    RasterParticleLayer rasterParticleSpeedFactorTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterParticleLayer slot(String slot);

    RasterParticleLayer sourceLayer(String sourceLayer);

    RasterParticleLayer visibility(Expression visibility);

    RasterParticleLayer visibility(Visibility visibility);
}

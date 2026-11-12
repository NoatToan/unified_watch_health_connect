package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.RasterResampling;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH'¢\u0006\u0004\b\u0010\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u0014\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\fH&¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH&¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001c\u0010\u0015J#\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\nH'¢\u0006\u0004\b\u001e\u0010\u000bJ\u001f\u0010 \u001a\u00020\u00042\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH&¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\nH&¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\"\u0010\u0015J#\u0010\"\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\"\u0010\u001aJ\u001d\u0010#\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH&¢\u0006\u0004\b#\u0010!J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\nH&¢\u0006\u0004\b#\u0010\u000bJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b$\u0010\u0015J#\u0010$\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b$\u0010\u001aJ\u0019\u0010%\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\fH&¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\nH&¢\u0006\u0004\b%\u0010\u000bJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b&\u0010\u0015J#\u0010&\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b&\u0010\u001aJ\u0019\u0010'\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\fH'¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\nH'¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b(\u0010\u0015J#\u0010(\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H'¢\u0006\u0004\b(\u0010\u001aJ\u0019\u0010)\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\fH&¢\u0006\u0004\b)\u0010\u000eJ\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\nH&¢\u0006\u0004\b)\u0010\u000bJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b*\u0010\u0015J#\u0010*\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b*\u0010\u001aJ\u0019\u0010+\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\fH&¢\u0006\u0004\b+\u0010\u000eJ\u0017\u0010+\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b+\u0010\u000bJ\u0019\u0010,\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\fH&¢\u0006\u0004\b,\u0010\u000eJ\u0017\u0010,\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\nH&¢\u0006\u0004\b,\u0010\u000bJ\u0017\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b-\u0010\u0015J#\u0010-\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b-\u0010\u001aJ\u0019\u0010.\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\fH&¢\u0006\u0004\b.\u0010\u000eJ\u0017\u0010.\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\nH&¢\u0006\u0004\b.\u0010\u000bJ\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b/\u0010\u0015J#\u0010/\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b/\u0010\u001aJ\u0019\u00101\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\u00042\u0006\u00101\u001a\u00020\nH&¢\u0006\u0004\b1\u0010\u000bJ\u0019\u00103\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\fH&¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\nH&¢\u0006\u0004\b3\u0010\u000bJ\u0017\u00104\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b4\u0010\u0015J#\u00104\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b4\u0010\u001a¨\u00065"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/RasterLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "slot", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "maxZoom", "rasterArrayBand", "rasterBrightnessMax", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "rasterBrightnessMaxTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "rasterBrightnessMin", "rasterBrightnessMinTransition", "rasterColor", "rasterColorUseTheme", "", "rasterColorMix", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "rasterColorMixTransition", "rasterColorRange", "rasterColorRangeTransition", "rasterContrast", "rasterContrastTransition", "rasterElevation", "rasterElevationTransition", "rasterEmissiveStrength", "rasterEmissiveStrengthTransition", "rasterFadeDuration", "rasterHueRotate", "rasterHueRotateTransition", "rasterOpacity", "rasterOpacityTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;", "rasterResampling", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/RasterResampling;)Lcom/mapbox/maps/extension/style/layers/generated/RasterLayer;", "rasterSaturation", "rasterSaturationTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface RasterLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ RasterLayer rasterBrightnessMax$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterBrightnessMax");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return rasterLayerDsl.rasterBrightnessMax(d14);
        }

        public static /* synthetic */ RasterLayer rasterBrightnessMin$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterBrightnessMin");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return rasterLayerDsl.rasterBrightnessMin(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RasterLayer rasterColorMix$default(RasterLayerDsl rasterLayerDsl, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterColorMix");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(0.2126d), Double.valueOf(0.7152d), Double.valueOf(0.0722d), Double.valueOf(0.0d));
            }
            return rasterLayerDsl.rasterColorMix((List<Double>) list);
        }

        public static /* synthetic */ RasterLayer rasterContrast$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterContrast");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return rasterLayerDsl.rasterContrast(d14);
        }

        public static /* synthetic */ RasterLayer rasterElevation$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterElevation");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return rasterLayerDsl.rasterElevation(d14);
        }

        public static /* synthetic */ RasterLayer rasterEmissiveStrength$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return rasterLayerDsl.rasterEmissiveStrength(d14);
        }

        public static /* synthetic */ RasterLayer rasterFadeDuration$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterFadeDuration");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 300.0d;
            }
            return rasterLayerDsl.rasterFadeDuration(d14);
        }

        public static /* synthetic */ RasterLayer rasterHueRotate$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterHueRotate");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return rasterLayerDsl.rasterHueRotate(d14);
        }

        public static /* synthetic */ RasterLayer rasterOpacity$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return rasterLayerDsl.rasterOpacity(d14);
        }

        public static /* synthetic */ RasterLayer rasterResampling$default(RasterLayerDsl rasterLayerDsl, RasterResampling rasterResampling, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterResampling");
                return null;
            }
            if ((i14 & 1) != 0) {
                rasterResampling = RasterResampling.LINEAR;
            }
            return rasterLayerDsl.rasterResampling(rasterResampling);
        }

        public static /* synthetic */ RasterLayer rasterSaturation$default(RasterLayerDsl rasterLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: rasterSaturation");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return rasterLayerDsl.rasterSaturation(d14);
        }
    }

    RasterLayer maxZoom(double maxZoom);

    RasterLayer minZoom(double minZoom);

    @MapboxExperimental
    RasterLayer rasterArrayBand(Expression rasterArrayBand);

    @MapboxExperimental
    RasterLayer rasterArrayBand(String rasterArrayBand);

    RasterLayer rasterBrightnessMax(double rasterBrightnessMax);

    RasterLayer rasterBrightnessMax(Expression rasterBrightnessMax);

    RasterLayer rasterBrightnessMaxTransition(StyleTransition options);

    RasterLayer rasterBrightnessMaxTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterBrightnessMin(double rasterBrightnessMin);

    RasterLayer rasterBrightnessMin(Expression rasterBrightnessMin);

    RasterLayer rasterBrightnessMinTransition(StyleTransition options);

    RasterLayer rasterBrightnessMinTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterColor(Expression rasterColor);

    RasterLayer rasterColorMix(Expression rasterColorMix);

    RasterLayer rasterColorMix(List<Double> rasterColorMix);

    RasterLayer rasterColorMixTransition(StyleTransition options);

    RasterLayer rasterColorMixTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterColorRange(Expression rasterColorRange);

    RasterLayer rasterColorRange(List<Double> rasterColorRange);

    RasterLayer rasterColorRangeTransition(StyleTransition options);

    RasterLayer rasterColorRangeTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    RasterLayer rasterColorUseTheme(Expression rasterColorUseTheme);

    @MapboxExperimental
    RasterLayer rasterColorUseTheme(String rasterColorUseTheme);

    RasterLayer rasterContrast(double rasterContrast);

    RasterLayer rasterContrast(Expression rasterContrast);

    RasterLayer rasterContrastTransition(StyleTransition options);

    RasterLayer rasterContrastTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    RasterLayer rasterElevation(double rasterElevation);

    @MapboxExperimental
    RasterLayer rasterElevation(Expression rasterElevation);

    @MapboxExperimental
    RasterLayer rasterElevationTransition(StyleTransition options);

    @MapboxExperimental
    RasterLayer rasterElevationTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterEmissiveStrength(double rasterEmissiveStrength);

    RasterLayer rasterEmissiveStrength(Expression rasterEmissiveStrength);

    RasterLayer rasterEmissiveStrengthTransition(StyleTransition options);

    RasterLayer rasterEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterFadeDuration(double rasterFadeDuration);

    RasterLayer rasterFadeDuration(Expression rasterFadeDuration);

    RasterLayer rasterHueRotate(double rasterHueRotate);

    RasterLayer rasterHueRotate(Expression rasterHueRotate);

    RasterLayer rasterHueRotateTransition(StyleTransition options);

    RasterLayer rasterHueRotateTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterOpacity(double rasterOpacity);

    RasterLayer rasterOpacity(Expression rasterOpacity);

    RasterLayer rasterOpacityTransition(StyleTransition options);

    RasterLayer rasterOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer rasterResampling(Expression rasterResampling);

    RasterLayer rasterResampling(RasterResampling rasterResampling);

    RasterLayer rasterSaturation(double rasterSaturation);

    RasterLayer rasterSaturation(Expression rasterSaturation);

    RasterLayer rasterSaturationTransition(StyleTransition options);

    RasterLayer rasterSaturationTransition(l<? super StyleTransition.Builder, Unit> block);

    RasterLayer slot(String slot);

    RasterLayer sourceLayer(String sourceLayer);

    RasterLayer visibility(Expression visibility);

    RasterLayer visibility(Visibility visibility);
}

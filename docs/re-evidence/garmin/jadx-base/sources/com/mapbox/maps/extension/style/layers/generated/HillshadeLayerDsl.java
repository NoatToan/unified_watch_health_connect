package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.HillshadeIlluminationAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0011H&¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b\u0015\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\nH'¢\u0006\u0004\b\u001c\u0010\u000bJ\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\nH&¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001e\u0010\u0016J#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b\u001e\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\fH&¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\nH&¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b \u0010\u0016J#\u0010 \u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b \u0010\u001bJ\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\nH&¢\u0006\u0004\b!\u0010\u000bJ\u0019\u0010!\u001a\u00020\u00042\b\b\u0001\u0010!\u001a\u00020\u0011H&¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\"\u0010\u0016J#\u0010\"\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\nH'¢\u0006\u0004\b#\u0010\u000bJ\u0019\u0010%\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\nH&¢\u0006\u0004\b%\u0010\u000bJ\u0019\u0010'\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\fH&¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\nH&¢\u0006\u0004\b'\u0010\u000bJ\u0019\u0010(\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b(\u0010\u000bJ\u0019\u0010(\u001a\u00020\u00042\b\b\u0001\u0010(\u001a\u00020\u0011H&¢\u0006\u0004\b(\u0010\u0012J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b)\u0010\u0016J#\u0010)\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0002H'¢\u0006\u0004\b*\u0010\u0005J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\nH'¢\u0006\u0004\b*\u0010\u000b¨\u0006+"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "slot", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "maxZoom", "hillshadeAccentColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "hillshadeAccentColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "hillshadeAccentColorUseTheme", "hillshadeEmissiveStrength", "hillshadeEmissiveStrengthTransition", "hillshadeExaggeration", "hillshadeExaggerationTransition", "hillshadeHighlightColor", "hillshadeHighlightColorTransition", "hillshadeHighlightColorUseTheme", "Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;", "hillshadeIlluminationAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/HillshadeIlluminationAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/HillshadeLayer;", "hillshadeIlluminationDirection", "hillshadeShadowColor", "hillshadeShadowColorTransition", "hillshadeShadowColorUseTheme", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface HillshadeLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ HillshadeLayer hillshadeAccentColor$default(HillshadeLayerDsl hillshadeLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeAccentColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return hillshadeLayerDsl.hillshadeAccentColor(str);
        }

        public static /* synthetic */ HillshadeLayer hillshadeEmissiveStrength$default(HillshadeLayerDsl hillshadeLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return hillshadeLayerDsl.hillshadeEmissiveStrength(d14);
        }

        public static /* synthetic */ HillshadeLayer hillshadeExaggeration$default(HillshadeLayerDsl hillshadeLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeExaggeration");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.5d;
            }
            return hillshadeLayerDsl.hillshadeExaggeration(d14);
        }

        public static /* synthetic */ HillshadeLayer hillshadeHighlightColor$default(HillshadeLayerDsl hillshadeLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeHighlightColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#FFFFFF";
            }
            return hillshadeLayerDsl.hillshadeHighlightColor(str);
        }

        public static /* synthetic */ HillshadeLayer hillshadeIlluminationAnchor$default(HillshadeLayerDsl hillshadeLayerDsl, HillshadeIlluminationAnchor hillshadeIlluminationAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeIlluminationAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                hillshadeIlluminationAnchor = HillshadeIlluminationAnchor.VIEWPORT;
            }
            return hillshadeLayerDsl.hillshadeIlluminationAnchor(hillshadeIlluminationAnchor);
        }

        public static /* synthetic */ HillshadeLayer hillshadeIlluminationDirection$default(HillshadeLayerDsl hillshadeLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeIlluminationDirection");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 335.0d;
            }
            return hillshadeLayerDsl.hillshadeIlluminationDirection(d14);
        }

        public static /* synthetic */ HillshadeLayer hillshadeShadowColor$default(HillshadeLayerDsl hillshadeLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: hillshadeShadowColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return hillshadeLayerDsl.hillshadeShadowColor(str);
        }
    }

    HillshadeLayer hillshadeAccentColor(int hillshadeAccentColor);

    HillshadeLayer hillshadeAccentColor(Expression hillshadeAccentColor);

    HillshadeLayer hillshadeAccentColor(String hillshadeAccentColor);

    HillshadeLayer hillshadeAccentColorTransition(StyleTransition options);

    HillshadeLayer hillshadeAccentColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    HillshadeLayer hillshadeAccentColorUseTheme(Expression hillshadeAccentColorUseTheme);

    @MapboxExperimental
    HillshadeLayer hillshadeAccentColorUseTheme(String hillshadeAccentColorUseTheme);

    HillshadeLayer hillshadeEmissiveStrength(double hillshadeEmissiveStrength);

    HillshadeLayer hillshadeEmissiveStrength(Expression hillshadeEmissiveStrength);

    HillshadeLayer hillshadeEmissiveStrengthTransition(StyleTransition options);

    HillshadeLayer hillshadeEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    HillshadeLayer hillshadeExaggeration(double hillshadeExaggeration);

    HillshadeLayer hillshadeExaggeration(Expression hillshadeExaggeration);

    HillshadeLayer hillshadeExaggerationTransition(StyleTransition options);

    HillshadeLayer hillshadeExaggerationTransition(l<? super StyleTransition.Builder, Unit> block);

    HillshadeLayer hillshadeHighlightColor(int hillshadeHighlightColor);

    HillshadeLayer hillshadeHighlightColor(Expression hillshadeHighlightColor);

    HillshadeLayer hillshadeHighlightColor(String hillshadeHighlightColor);

    HillshadeLayer hillshadeHighlightColorTransition(StyleTransition options);

    HillshadeLayer hillshadeHighlightColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    HillshadeLayer hillshadeHighlightColorUseTheme(Expression hillshadeHighlightColorUseTheme);

    @MapboxExperimental
    HillshadeLayer hillshadeHighlightColorUseTheme(String hillshadeHighlightColorUseTheme);

    HillshadeLayer hillshadeIlluminationAnchor(Expression hillshadeIlluminationAnchor);

    HillshadeLayer hillshadeIlluminationAnchor(HillshadeIlluminationAnchor hillshadeIlluminationAnchor);

    HillshadeLayer hillshadeIlluminationDirection(double hillshadeIlluminationDirection);

    HillshadeLayer hillshadeIlluminationDirection(Expression hillshadeIlluminationDirection);

    HillshadeLayer hillshadeShadowColor(int hillshadeShadowColor);

    HillshadeLayer hillshadeShadowColor(Expression hillshadeShadowColor);

    HillshadeLayer hillshadeShadowColor(String hillshadeShadowColor);

    HillshadeLayer hillshadeShadowColorTransition(StyleTransition options);

    HillshadeLayer hillshadeShadowColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    HillshadeLayer hillshadeShadowColorUseTheme(Expression hillshadeShadowColorUseTheme);

    @MapboxExperimental
    HillshadeLayer hillshadeShadowColorUseTheme(String hillshadeShadowColorUseTheme);

    HillshadeLayer maxZoom(double maxZoom);

    HillshadeLayer minZoom(double minZoom);

    HillshadeLayer slot(String slot);

    HillshadeLayer sourceLayer(String sourceLayer);

    HillshadeLayer visibility(Expression visibility);

    HillshadeLayer visibility(Visibility visibility);
}

package com.mapbox.maps.extension.style.layers.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.BackgroundPitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u0014\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\tH'¢\u0006\u0004\b\u001b\u0010\nJ\u0019\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\tH&¢\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001d\u0010\u0015J#\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u001d\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\nJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001f\u0010\u0015J#\u0010\u001f\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0005J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\tH&¢\u0006\u0004\b \u0010\nJ\u0019\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020!H'¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\tH'¢\u0006\u0004\b\"\u0010\n¨\u0006$"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayerDsl;", "", "", "slot", "Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "maxZoom", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "backgroundColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "backgroundColorUseTheme", "backgroundEmissiveStrength", "backgroundEmissiveStrengthTransition", "backgroundOpacity", "backgroundOpacityTransition", "backgroundPattern", "Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;", "backgroundPitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/BackgroundPitchAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/BackgroundLayer;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface BackgroundLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ BackgroundLayer backgroundColor$default(BackgroundLayerDsl backgroundLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: backgroundColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return backgroundLayerDsl.backgroundColor(str);
        }

        public static /* synthetic */ BackgroundLayer backgroundEmissiveStrength$default(BackgroundLayerDsl backgroundLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: backgroundEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return backgroundLayerDsl.backgroundEmissiveStrength(d14);
        }

        public static /* synthetic */ BackgroundLayer backgroundOpacity$default(BackgroundLayerDsl backgroundLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: backgroundOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return backgroundLayerDsl.backgroundOpacity(d14);
        }

        public static /* synthetic */ BackgroundLayer backgroundPitchAlignment$default(BackgroundLayerDsl backgroundLayerDsl, BackgroundPitchAlignment backgroundPitchAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: backgroundPitchAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                backgroundPitchAlignment = BackgroundPitchAlignment.MAP;
            }
            return backgroundLayerDsl.backgroundPitchAlignment(backgroundPitchAlignment);
        }
    }

    BackgroundLayer backgroundColor(int backgroundColor);

    BackgroundLayer backgroundColor(Expression backgroundColor);

    BackgroundLayer backgroundColor(String backgroundColor);

    BackgroundLayer backgroundColorTransition(StyleTransition options);

    BackgroundLayer backgroundColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    BackgroundLayer backgroundColorUseTheme(Expression backgroundColorUseTheme);

    @MapboxExperimental
    BackgroundLayer backgroundColorUseTheme(String backgroundColorUseTheme);

    BackgroundLayer backgroundEmissiveStrength(double backgroundEmissiveStrength);

    BackgroundLayer backgroundEmissiveStrength(Expression backgroundEmissiveStrength);

    BackgroundLayer backgroundEmissiveStrengthTransition(StyleTransition options);

    BackgroundLayer backgroundEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    BackgroundLayer backgroundOpacity(double backgroundOpacity);

    BackgroundLayer backgroundOpacity(Expression backgroundOpacity);

    BackgroundLayer backgroundOpacityTransition(StyleTransition options);

    BackgroundLayer backgroundOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    BackgroundLayer backgroundPattern(Expression backgroundPattern);

    BackgroundLayer backgroundPattern(String backgroundPattern);

    @MapboxExperimental
    BackgroundLayer backgroundPitchAlignment(Expression backgroundPitchAlignment);

    @MapboxExperimental
    BackgroundLayer backgroundPitchAlignment(BackgroundPitchAlignment backgroundPitchAlignment);

    BackgroundLayer maxZoom(double maxZoom);

    BackgroundLayer minZoom(double minZoom);

    BackgroundLayer slot(String slot);

    BackgroundLayer visibility(Expression visibility);

    BackgroundLayer visibility(Visibility visibility);
}

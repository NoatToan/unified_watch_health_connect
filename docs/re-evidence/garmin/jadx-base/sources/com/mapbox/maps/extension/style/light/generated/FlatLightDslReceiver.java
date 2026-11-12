package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.Anchor;
import com.mapbox.maps.extension.style.light.LightPosition;
import com.mapbox.maps.extension.style.types.LightDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@LightDsl
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u0003\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b\u000f\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0019\u0010\u0010J#\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001fH&¢\u0006\u0004\b\u001d\u0010 J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b!\u0010\u0010J#\u0010!\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b!\u0010\u0015J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000bH'¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0006H'¢\u0006\u0004\b\"\u0010\u0007¨\u0006#"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/FlatLightDslReceiver;", "", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;", "anchor", "Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Anchor;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "", "intensity", "(D)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "intensityTransition", "radialCoordinate", "azimuthalAngle", "polarAngle", ModelSourceWrapper.POSITION, "(DDD)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "Lcom/mapbox/maps/extension/style/light/LightPosition;", "(Lcom/mapbox/maps/extension/style/light/LightPosition;)Lcom/mapbox/maps/extension/style/light/generated/FlatLight;", "positionTransition", "colorUseTheme", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FlatLightDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ FlatLight anchor$default(FlatLightDslReceiver flatLightDslReceiver, Anchor anchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: anchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                anchor = Anchor.VIEWPORT;
            }
            return flatLightDslReceiver.anchor(anchor);
        }

        public static /* synthetic */ FlatLight color$default(FlatLightDslReceiver flatLightDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: color");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return flatLightDslReceiver.color(str);
        }

        public static /* synthetic */ FlatLight intensity$default(FlatLightDslReceiver flatLightDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: intensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.5d;
            }
            return flatLightDslReceiver.intensity(d14);
        }

        public static /* synthetic */ FlatLight position$default(FlatLightDslReceiver flatLightDslReceiver, LightPosition lightPosition, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: position");
                return null;
            }
            if ((i14 & 1) != 0) {
                lightPosition = new LightPosition(1.15d, 210.0d, 30.0d);
            }
            return flatLightDslReceiver.position(lightPosition);
        }
    }

    FlatLight anchor(Expression anchor);

    FlatLight anchor(Anchor anchor);

    FlatLight color(int color);

    FlatLight color(Expression color);

    FlatLight color(String color);

    FlatLight colorTransition(StyleTransition options);

    FlatLight colorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FlatLight colorUseTheme(Expression colorUseTheme);

    @MapboxExperimental
    FlatLight colorUseTheme(String colorUseTheme);

    FlatLight intensity(double intensity);

    FlatLight intensity(Expression intensity);

    FlatLight intensityTransition(StyleTransition options);

    FlatLight intensityTransition(l<? super StyleTransition.Builder, Unit> block);

    FlatLight position(double radialCoordinate, double azimuthalAngle, double polarAngle);

    FlatLight position(Expression position);

    FlatLight position(LightPosition position);

    FlatLight positionTransition(StyleTransition options);

    FlatLight positionTransition(l<? super StyleTransition.Builder, Unit> block);
}

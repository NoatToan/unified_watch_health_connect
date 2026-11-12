package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.LightDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LightDsl
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u0003\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b\u000f\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u001a\u0010\u0010J#\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b\u001a\u0010\u0015J\u0019\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u001d\u0010\u0010J#\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b\u001d\u0010\u0015J\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0017H&¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\u0007J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u001f\u0010\u0010J#\u0010\u001f\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H&¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000bH'¢\u0006\u0004\b \u0010\fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H'¢\u0006\u0004\b \u0010\u0007¨\u0006!"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/DirectionalLightDslReceiver;", "", "", "castShadows", "Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "(Z)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "", "", "direction", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "directionTransition", "intensity", "(D)Lcom/mapbox/maps/extension/style/light/generated/DirectionalLight;", "intensityTransition", "shadowIntensity", "shadowIntensityTransition", "colorUseTheme", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface DirectionalLightDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ DirectionalLight castShadows$default(DirectionalLightDslReceiver directionalLightDslReceiver, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: castShadows");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return directionalLightDslReceiver.castShadows(z14);
        }

        public static /* synthetic */ DirectionalLight color$default(DirectionalLightDslReceiver directionalLightDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: color");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return directionalLightDslReceiver.color(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DirectionalLight direction$default(DirectionalLightDslReceiver directionalLightDslReceiver, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: direction");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(210.0d), Double.valueOf(30.0d));
            }
            return directionalLightDslReceiver.direction((List<Double>) list);
        }

        public static /* synthetic */ DirectionalLight intensity$default(DirectionalLightDslReceiver directionalLightDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: intensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.5d;
            }
            return directionalLightDslReceiver.intensity(d14);
        }

        public static /* synthetic */ DirectionalLight shadowIntensity$default(DirectionalLightDslReceiver directionalLightDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: shadowIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return directionalLightDslReceiver.shadowIntensity(d14);
        }
    }

    DirectionalLight castShadows(Expression castShadows);

    DirectionalLight castShadows(boolean castShadows);

    DirectionalLight color(int color);

    DirectionalLight color(Expression color);

    DirectionalLight color(String color);

    DirectionalLight colorTransition(StyleTransition options);

    DirectionalLight colorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    DirectionalLight colorUseTheme(Expression colorUseTheme);

    @MapboxExperimental
    DirectionalLight colorUseTheme(String colorUseTheme);

    DirectionalLight direction(Expression direction);

    DirectionalLight direction(List<Double> direction);

    DirectionalLight directionTransition(StyleTransition options);

    DirectionalLight directionTransition(l<? super StyleTransition.Builder, Unit> block);

    DirectionalLight intensity(double intensity);

    DirectionalLight intensity(Expression intensity);

    DirectionalLight intensityTransition(StyleTransition options);

    DirectionalLight intensityTransition(l<? super StyleTransition.Builder, Unit> block);

    DirectionalLight shadowIntensity(double shadowIntensity);

    DirectionalLight shadowIntensity(Expression shadowIntensity);

    DirectionalLight shadowIntensityTransition(StyleTransition options);

    DirectionalLight shadowIntensityTransition(l<? super StyleTransition.Builder, Unit> block);
}

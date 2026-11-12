package com.mapbox.maps.extension.style.light.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.LightDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@LightDsl
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\u0003\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\f\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\rJ#\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H'¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\bH'¢\u0006\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/extension/style/light/generated/AmbientLightDslReceiver;", "", "", TtmlNode.ATTR_TTS_COLOR, "Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "(I)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "", "intensity", "(D)Lcom/mapbox/maps/extension/style/light/generated/AmbientLight;", "intensityTransition", "colorUseTheme", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AmbientLightDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AmbientLight color$default(AmbientLightDslReceiver ambientLightDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: color");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return ambientLightDslReceiver.color(str);
        }

        public static /* synthetic */ AmbientLight intensity$default(AmbientLightDslReceiver ambientLightDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: intensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.5d;
            }
            return ambientLightDslReceiver.intensity(d14);
        }
    }

    AmbientLight color(int color);

    AmbientLight color(Expression color);

    AmbientLight color(String color);

    AmbientLight colorTransition(StyleTransition options);

    AmbientLight colorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    AmbientLight colorUseTheme(Expression colorUseTheme);

    @MapboxExperimental
    AmbientLight colorUseTheme(String colorUseTheme);

    AmbientLight intensity(double intensity);

    AmbientLight intensity(Expression intensity);

    AmbientLight intensityTransition(StyleTransition options);

    AmbientLight intensityTransition(l<? super StyleTransition.Builder, Unit> block);
}

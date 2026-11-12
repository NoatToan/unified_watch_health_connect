package com.mapbox.maps.extension.style.precipitations.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.SnowDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H'¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\n\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0014H'¢\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0016\u0010\u000bJ#\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0005J\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0006H'¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0018\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H'¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001c\u0010\u000bJ#\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u001c\u0010\u0010J\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H'¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001e\u0010\u000bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H'¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b \u0010\u000bJ#\u0010 \u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b \u0010\u0010J\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006H'¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\"\u0010\u000bJ#\u0010\"\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\u0005J\u0019\u0010#\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u0006H'¢\u0006\u0004\b#\u0010\u0007J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b$\u0010\u000bJ#\u0010$\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b$\u0010\u0010J\u0019\u0010%\u001a\u00020\u00042\b\b\u0001\u0010%\u001a\u00020\u0011H'¢\u0006\u0004\b%\u0010\u0013J\u0019\u0010%\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0006H'¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b&\u0010\u000bJ#\u0010&\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0014H'¢\u0006\u0004\b'\u0010\u0015J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0006H'¢\u0006\u0004\b'\u0010\u0007J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0014H'¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006H'¢\u0006\u0004\b(\u0010\u0007¨\u0006)"}, d2 = {"Lcom/mapbox/maps/extension/style/precipitations/generated/SnowDslReceiver;", "", "", "centerThinning", "Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "(D)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "centerThinningTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "colorTransition", "density", "densityTransition", "", "direction", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/precipitations/generated/Snow;", "directionTransition", "flakeSize", "flakeSizeTransition", "intensity", "intensityTransition", "opacity", "opacityTransition", "vignette", "vignetteTransition", "vignetteColor", "vignetteColorTransition", "colorUseTheme", "vignetteColorUseTheme", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
@SnowDsl
public interface SnowDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Snow centerThinning$default(SnowDslReceiver snowDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: centerThinning");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.4d;
            }
            return snowDslReceiver.centerThinning(d14);
        }

        public static /* synthetic */ Snow color$default(SnowDslReceiver snowDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: color");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return snowDslReceiver.color(str);
        }

        public static /* synthetic */ Snow density$default(SnowDslReceiver snowDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: density");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],11,0,13,0.85]");
            }
            return snowDslReceiver.density(expression);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snow direction$default(SnowDslReceiver snowDslReceiver, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: direction");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(0.0d), Double.valueOf(50.0d));
            }
            return snowDslReceiver.direction((List<Double>) list);
        }

        public static /* synthetic */ Snow flakeSize$default(SnowDslReceiver snowDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: flakeSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.71d;
            }
            return snowDslReceiver.flakeSize(d14);
        }

        public static /* synthetic */ Snow intensity$default(SnowDslReceiver snowDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: intensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return snowDslReceiver.intensity(d14);
        }

        public static /* synthetic */ Snow opacity$default(SnowDslReceiver snowDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: opacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return snowDslReceiver.opacity(d14);
        }

        public static /* synthetic */ Snow vignette$default(SnowDslReceiver snowDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: vignette");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],11,0,13,0.3]");
            }
            return snowDslReceiver.vignette(expression);
        }

        public static /* synthetic */ Snow vignetteColor$default(SnowDslReceiver snowDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: vignetteColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return snowDslReceiver.vignetteColor(str);
        }
    }

    @MapboxExperimental
    Snow centerThinning(double centerThinning);

    @MapboxExperimental
    Snow centerThinning(Expression centerThinning);

    @MapboxExperimental
    Snow centerThinningTransition(StyleTransition options);

    @MapboxExperimental
    Snow centerThinningTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow color(int color);

    @MapboxExperimental
    Snow color(Expression color);

    @MapboxExperimental
    Snow color(String color);

    @MapboxExperimental
    Snow colorTransition(StyleTransition options);

    @MapboxExperimental
    Snow colorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow colorUseTheme(Expression colorUseTheme);

    @MapboxExperimental
    Snow colorUseTheme(String colorUseTheme);

    @MapboxExperimental
    Snow density(double density);

    @MapboxExperimental
    Snow density(Expression density);

    @MapboxExperimental
    Snow densityTransition(StyleTransition options);

    @MapboxExperimental
    Snow densityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow direction(Expression direction);

    @MapboxExperimental
    Snow direction(List<Double> direction);

    @MapboxExperimental
    Snow directionTransition(StyleTransition options);

    @MapboxExperimental
    Snow directionTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow flakeSize(double flakeSize);

    @MapboxExperimental
    Snow flakeSize(Expression flakeSize);

    @MapboxExperimental
    Snow flakeSizeTransition(StyleTransition options);

    @MapboxExperimental
    Snow flakeSizeTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow intensity(double intensity);

    @MapboxExperimental
    Snow intensity(Expression intensity);

    @MapboxExperimental
    Snow intensityTransition(StyleTransition options);

    @MapboxExperimental
    Snow intensityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow opacity(double opacity);

    @MapboxExperimental
    Snow opacity(Expression opacity);

    @MapboxExperimental
    Snow opacityTransition(StyleTransition options);

    @MapboxExperimental
    Snow opacityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow vignette(double vignette);

    @MapboxExperimental
    Snow vignette(Expression vignette);

    @MapboxExperimental
    Snow vignetteColor(int vignetteColor);

    @MapboxExperimental
    Snow vignetteColor(Expression vignetteColor);

    @MapboxExperimental
    Snow vignetteColor(String vignetteColor);

    @MapboxExperimental
    Snow vignetteColorTransition(StyleTransition options);

    @MapboxExperimental
    Snow vignetteColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Snow vignetteColorUseTheme(Expression vignetteColorUseTheme);

    @MapboxExperimental
    Snow vignetteColorUseTheme(String vignetteColorUseTheme);

    @MapboxExperimental
    Snow vignetteTransition(StyleTransition options);

    @MapboxExperimental
    Snow vignetteTransition(l<? super StyleTransition.Builder, Unit> block);
}

package com.mapbox.maps.extension.style.precipitations.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.RainDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@RainDsl
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H'¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\n\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0014H'¢\u0006\u0004\b\u0012\u0010\u0015J\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0016\u0010\u000bJ#\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0005J\u0019\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0006H'¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0018\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H'¢\u0006\u0004\b\u001a\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001c\u0010\u000bJ#\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u001c\u0010\u0010J\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H'¢\u0006\u0004\b\u001d\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001e\u0010\u000bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010\u001f\u001a\u00020\u00042\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H'¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H'¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b \u0010\u000bJ#\u0010 \u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b \u0010\u0010J\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006H'¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\"\u0010\u000bJ#\u0010\"\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\u0005J\u0019\u0010#\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u0006H'¢\u0006\u0004\b#\u0010\u0007J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b$\u0010\u000bJ#\u0010$\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010\u0005J\u0019\u0010%\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0006H'¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b&\u0010\u000bJ#\u0010&\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b&\u0010\u0010J\u0019\u0010'\u001a\u00020\u00042\b\b\u0001\u0010'\u001a\u00020\u0011H'¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0014H'¢\u0006\u0004\b'\u0010\u0015J\u0019\u0010'\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u0006H'¢\u0006\u0004\b'\u0010\u0007J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b(\u0010\u000bJ#\u0010(\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH'¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0014H'¢\u0006\u0004\b)\u0010\u0015J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0006H'¢\u0006\u0004\b)\u0010\u0007J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0014H'¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0006H'¢\u0006\u0004\b*\u0010\u0007¨\u0006+"}, d2 = {"Lcom/mapbox/maps/extension/style/precipitations/generated/RainDslReceiver;", "", "", "centerThinning", "Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "(D)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "centerThinningTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "colorTransition", "density", "densityTransition", "", "direction", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "directionTransition", "distortionStrength", "distortionStrengthTransition", "dropletSize", "dropletSizeTransition", "intensity", "intensityTransition", "opacity", "opacityTransition", "vignette", "vignetteTransition", "vignetteColor", "vignetteColorTransition", "colorUseTheme", "vignetteColorUseTheme", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public interface RainDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Rain centerThinning$default(RainDslReceiver rainDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: centerThinning");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.57d;
            }
            return rainDslReceiver.centerThinning(d14);
        }

        public static /* synthetic */ Rain color$default(RainDslReceiver rainDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: color");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"measure-light\",\"brightness\"],0,\"#03113d\",0.3,\"#a8adbc\"]");
            }
            return rainDslReceiver.color(expression);
        }

        public static /* synthetic */ Rain density$default(RainDslReceiver rainDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: density");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],11,0,13,0.5]");
            }
            return rainDslReceiver.density(expression);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Rain direction$default(RainDslReceiver rainDslReceiver, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: direction");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(0.0d), Double.valueOf(80.0d));
            }
            return rainDslReceiver.direction((List<Double>) list);
        }

        public static /* synthetic */ Rain distortionStrength$default(RainDslReceiver rainDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: distortionStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.7d;
            }
            return rainDslReceiver.distortionStrength(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Rain dropletSize$default(RainDslReceiver rainDslReceiver, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: dropletSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(2.6d), Double.valueOf(18.2d));
            }
            return rainDslReceiver.dropletSize((List<Double>) list);
        }

        public static /* synthetic */ Rain intensity$default(RainDslReceiver rainDslReceiver, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: intensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return rainDslReceiver.intensity(d14);
        }

        public static /* synthetic */ Rain opacity$default(RainDslReceiver rainDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: opacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"measure-light\",\"brightness\"],0,0.88,1,0.7]");
            }
            return rainDslReceiver.opacity(expression);
        }

        public static /* synthetic */ Rain vignette$default(RainDslReceiver rainDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: vignette");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],11,0,13,1]");
            }
            return rainDslReceiver.vignette(expression);
        }

        public static /* synthetic */ Rain vignetteColor$default(RainDslReceiver rainDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: vignetteColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"measure-light\",\"brightness\"],0,\"#001736\",0.3,\"#464646\"]");
            }
            return rainDslReceiver.vignetteColor(expression);
        }
    }

    @MapboxExperimental
    Rain centerThinning(double centerThinning);

    @MapboxExperimental
    Rain centerThinning(Expression centerThinning);

    @MapboxExperimental
    Rain centerThinningTransition(StyleTransition options);

    @MapboxExperimental
    Rain centerThinningTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain color(int color);

    @MapboxExperimental
    Rain color(Expression color);

    @MapboxExperimental
    Rain color(String color);

    @MapboxExperimental
    Rain colorTransition(StyleTransition options);

    @MapboxExperimental
    Rain colorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain colorUseTheme(Expression colorUseTheme);

    @MapboxExperimental
    Rain colorUseTheme(String colorUseTheme);

    @MapboxExperimental
    Rain density(double density);

    @MapboxExperimental
    Rain density(Expression density);

    @MapboxExperimental
    Rain densityTransition(StyleTransition options);

    @MapboxExperimental
    Rain densityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain direction(Expression direction);

    @MapboxExperimental
    Rain direction(List<Double> direction);

    @MapboxExperimental
    Rain directionTransition(StyleTransition options);

    @MapboxExperimental
    Rain directionTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain distortionStrength(double distortionStrength);

    @MapboxExperimental
    Rain distortionStrength(Expression distortionStrength);

    @MapboxExperimental
    Rain distortionStrengthTransition(StyleTransition options);

    @MapboxExperimental
    Rain distortionStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain dropletSize(Expression dropletSize);

    @MapboxExperimental
    Rain dropletSize(List<Double> dropletSize);

    @MapboxExperimental
    Rain dropletSizeTransition(StyleTransition options);

    @MapboxExperimental
    Rain dropletSizeTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain intensity(double intensity);

    @MapboxExperimental
    Rain intensity(Expression intensity);

    @MapboxExperimental
    Rain intensityTransition(StyleTransition options);

    @MapboxExperimental
    Rain intensityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain opacity(double opacity);

    @MapboxExperimental
    Rain opacity(Expression opacity);

    @MapboxExperimental
    Rain opacityTransition(StyleTransition options);

    @MapboxExperimental
    Rain opacityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain vignette(double vignette);

    @MapboxExperimental
    Rain vignette(Expression vignette);

    @MapboxExperimental
    Rain vignetteColor(int vignetteColor);

    @MapboxExperimental
    Rain vignetteColor(Expression vignetteColor);

    @MapboxExperimental
    Rain vignetteColor(String vignetteColor);

    @MapboxExperimental
    Rain vignetteColorTransition(StyleTransition options);

    @MapboxExperimental
    Rain vignetteColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Rain vignetteColorUseTheme(Expression vignetteColorUseTheme);

    @MapboxExperimental
    Rain vignetteColorUseTheme(String vignetteColorUseTheme);

    @MapboxExperimental
    Rain vignetteTransition(StyleTransition options);

    @MapboxExperimental
    Rain vignetteTransition(l<? super StyleTransition.Builder, Unit> block);
}

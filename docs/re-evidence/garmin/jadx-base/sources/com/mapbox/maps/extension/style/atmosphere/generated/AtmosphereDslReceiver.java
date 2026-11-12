package com.mapbox.maps.extension.style.atmosphere.generated;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.AtmosphereDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0019\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0006H&¢\u0006\u0004\b\u0003\u0010\u0007J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\u0003\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H'¢\u0006\u0004\b\u0013\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH'¢\u0006\u0004\b\u0013\u0010\tJ\u0019\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0005J\u0019\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH&¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\rJ#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H'¢\u0006\u0004\b\u0016\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bH'¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u0018\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\rJ#\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b\u001c\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001e\u0010\rJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b\u001e\u0010\u0012J\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010\u0007J\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\bH&¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b \u0010\rJ#\u0010 \u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b \u0010\u0012J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006H'¢\u0006\u0004\b!\u0010\u0007J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\bH'¢\u0006\u0004\b!\u0010\tJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0017H&¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\bH&¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b#\u0010\rJ#\u0010#\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010$\u001a\u00020\u00042\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH&¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\bH&¢\u0006\u0004\b$\u0010\tJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b%\u0010\rJ#\u0010%\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH&¢\u0006\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lcom/mapbox/maps/extension/style/atmosphere/generated/AtmosphereDslReceiver;", "", "", TtmlNode.ATTR_TTS_COLOR, "Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "(I)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "colorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "colorUseTheme", "highColor", "highColorTransition", "highColorUseTheme", "", "horizonBlend", "(D)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "horizonBlendTransition", "", "range", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/atmosphere/generated/Atmosphere;", "rangeTransition", "spaceColor", "spaceColorTransition", "spaceColorUseTheme", "starIntensity", "starIntensityTransition", "verticalRange", "verticalRangeTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@AtmosphereDsl
public interface AtmosphereDslReceiver {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Atmosphere color$default(AtmosphereDslReceiver atmosphereDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: color");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return atmosphereDslReceiver.color(str);
        }

        public static /* synthetic */ Atmosphere highColor$default(AtmosphereDslReceiver atmosphereDslReceiver, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: highColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#245cdf";
            }
            return atmosphereDslReceiver.highColor(str);
        }

        public static /* synthetic */ Atmosphere horizonBlend$default(AtmosphereDslReceiver atmosphereDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: horizonBlend");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],4,0.2,7,0.1]");
            }
            return atmosphereDslReceiver.horizonBlend(expression);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Atmosphere range$default(AtmosphereDslReceiver atmosphereDslReceiver, List list, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: range");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(Double.valueOf(0.5d), Double.valueOf(10.0d));
            }
            return atmosphereDslReceiver.range((List<Double>) list);
        }

        public static /* synthetic */ Atmosphere spaceColor$default(AtmosphereDslReceiver atmosphereDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: spaceColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],4,\"#010b19\",7,\"#367ab9\"]");
            }
            return atmosphereDslReceiver.spaceColor(expression);
        }

        public static /* synthetic */ Atmosphere starIntensity$default(AtmosphereDslReceiver atmosphereDslReceiver, Expression expression, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: starIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                expression = Expression.INSTANCE.fromRaw("[\"interpolate\",[\"linear\"],[\"zoom\"],5,0.35,6,0]");
            }
            return atmosphereDslReceiver.starIntensity(expression);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Atmosphere verticalRange$default(AtmosphereDslReceiver atmosphereDslReceiver, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: verticalRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return atmosphereDslReceiver.verticalRange((List<Double>) list);
        }
    }

    Atmosphere color(int color);

    Atmosphere color(Expression color);

    Atmosphere color(String color);

    Atmosphere colorTransition(StyleTransition options);

    Atmosphere colorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Atmosphere colorUseTheme(Expression colorUseTheme);

    @MapboxExperimental
    Atmosphere colorUseTheme(String colorUseTheme);

    Atmosphere highColor(int highColor);

    Atmosphere highColor(Expression highColor);

    Atmosphere highColor(String highColor);

    Atmosphere highColorTransition(StyleTransition options);

    Atmosphere highColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Atmosphere highColorUseTheme(Expression highColorUseTheme);

    @MapboxExperimental
    Atmosphere highColorUseTheme(String highColorUseTheme);

    Atmosphere horizonBlend(double horizonBlend);

    Atmosphere horizonBlend(Expression horizonBlend);

    Atmosphere horizonBlendTransition(StyleTransition options);

    Atmosphere horizonBlendTransition(l<? super StyleTransition.Builder, Unit> block);

    Atmosphere range(Expression range);

    Atmosphere range(List<Double> range);

    Atmosphere rangeTransition(StyleTransition options);

    Atmosphere rangeTransition(l<? super StyleTransition.Builder, Unit> block);

    Atmosphere spaceColor(int spaceColor);

    Atmosphere spaceColor(Expression spaceColor);

    Atmosphere spaceColor(String spaceColor);

    Atmosphere spaceColorTransition(StyleTransition options);

    Atmosphere spaceColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    Atmosphere spaceColorUseTheme(Expression spaceColorUseTheme);

    @MapboxExperimental
    Atmosphere spaceColorUseTheme(String spaceColorUseTheme);

    Atmosphere starIntensity(double starIntensity);

    Atmosphere starIntensity(Expression starIntensity);

    Atmosphere starIntensityTransition(StyleTransition options);

    Atmosphere starIntensityTransition(l<? super StyleTransition.Builder, Unit> block);

    Atmosphere verticalRange(Expression verticalRange);

    Atmosphere verticalRange(List<Double> verticalRange);

    Atmosphere verticalRangeTransition(StyleTransition options);

    Atmosphere verticalRangeTransition(l<? super StyleTransition.Builder, Unit> block);
}

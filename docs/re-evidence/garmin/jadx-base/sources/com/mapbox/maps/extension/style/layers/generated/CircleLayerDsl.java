package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.CirclePitchScale;
import com.mapbox.maps.extension.style.layers.properties.generated.CircleTranslateAnchor;
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
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\rH&¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b\u0018\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010\tJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020 H&¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\"\u0010\u0019J#\u0010\"\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\tJ\u0019\u0010$\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\rH&¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010\tJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b%\u0010\u0019J#\u0010%\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b%\u0010\u001eJ\u0019\u0010&\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\rH&¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H&¢\u0006\u0004\b&\u0010\tJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b'\u0010\u0019J#\u0010'\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b'\u0010\u001eJ\u0019\u0010)\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0007H&¢\u0006\u0004\b)\u0010\tJ\u0019\u0010,\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0007H&¢\u0006\u0004\b,\u0010\tJ\u0019\u0010.\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\rH&¢\u0006\u0004\b.\u0010\u000fJ\u0017\u0010.\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0007H&¢\u0006\u0004\b.\u0010\tJ\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b/\u0010\u0019J#\u0010/\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b/\u0010\u001eJ\u0019\u00100\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u0005J\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0007H&¢\u0006\u0004\b0\u0010\tJ\u0019\u00100\u001a\u00020\u00042\b\b\u0001\u00100\u001a\u00020 H&¢\u0006\u0004\b0\u0010!J\u0017\u00101\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b1\u0010\u0019J#\u00101\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b1\u0010\u001eJ\u0017\u00102\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u0005J\u0017\u00102\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0007H'¢\u0006\u0004\b2\u0010\tJ\u0019\u00103\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\rH&¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H&¢\u0006\u0004\b3\u0010\tJ\u0017\u00104\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b4\u0010\u0019J#\u00104\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b4\u0010\u001eJ\u0019\u00105\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\rH&¢\u0006\u0004\b5\u0010\u000fJ\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H&¢\u0006\u0004\b5\u0010\tJ\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b6\u0010\u0019J#\u00106\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b6\u0010\u001eJ\u001f\u00108\u001a\u00020\u00042\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\r07H&¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0007H&¢\u0006\u0004\b8\u0010\tJ\u0017\u0010:\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b:\u0010\u0019J#\u0010:\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH&¢\u0006\u0004\b:\u0010\u001eJ\u0019\u0010<\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020;H&¢\u0006\u0004\b<\u0010=J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0007H&¢\u0006\u0004\b<\u0010\t¨\u0006>"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/CircleLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "maxZoom", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;", "circleElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleSortKey", "circleBlur", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "circleBlurTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleColorTransition", "circleColorUseTheme", "circleEmissiveStrength", "circleEmissiveStrengthTransition", "circleOpacity", "circleOpacityTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;", "circlePitchAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;", "circlePitchScale", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CirclePitchScale;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleRadius", "circleRadiusTransition", "circleStrokeColor", "circleStrokeColorTransition", "circleStrokeColorUseTheme", "circleStrokeOpacity", "circleStrokeOpacityTransition", "circleStrokeWidth", "circleStrokeWidthTransition", "", "circleTranslate", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "circleTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;", "circleTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/CircleTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/CircleLayer;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CircleLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CircleLayer circleBlur$default(CircleLayerDsl circleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleBlur");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return circleLayerDsl.circleBlur(d14);
        }

        public static /* synthetic */ CircleLayer circleColor$default(CircleLayerDsl circleLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return circleLayerDsl.circleColor(str);
        }

        public static /* synthetic */ CircleLayer circleElevationReference$default(CircleLayerDsl circleLayerDsl, CircleElevationReference circleElevationReference, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleElevationReference");
                return null;
            }
            if ((i14 & 1) != 0) {
                circleElevationReference = CircleElevationReference.NONE;
            }
            return circleLayerDsl.circleElevationReference(circleElevationReference);
        }

        public static /* synthetic */ CircleLayer circleEmissiveStrength$default(CircleLayerDsl circleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return circleLayerDsl.circleEmissiveStrength(d14);
        }

        public static /* synthetic */ CircleLayer circleOpacity$default(CircleLayerDsl circleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return circleLayerDsl.circleOpacity(d14);
        }

        public static /* synthetic */ CircleLayer circlePitchAlignment$default(CircleLayerDsl circleLayerDsl, CirclePitchAlignment circlePitchAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circlePitchAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                circlePitchAlignment = CirclePitchAlignment.VIEWPORT;
            }
            return circleLayerDsl.circlePitchAlignment(circlePitchAlignment);
        }

        public static /* synthetic */ CircleLayer circlePitchScale$default(CircleLayerDsl circleLayerDsl, CirclePitchScale circlePitchScale, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circlePitchScale");
                return null;
            }
            if ((i14 & 1) != 0) {
                circlePitchScale = CirclePitchScale.MAP;
            }
            return circleLayerDsl.circlePitchScale(circlePitchScale);
        }

        public static /* synthetic */ CircleLayer circleRadius$default(CircleLayerDsl circleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 5.0d;
            }
            return circleLayerDsl.circleRadius(d14);
        }

        public static /* synthetic */ CircleLayer circleStrokeColor$default(CircleLayerDsl circleLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleStrokeColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return circleLayerDsl.circleStrokeColor(str);
        }

        public static /* synthetic */ CircleLayer circleStrokeOpacity$default(CircleLayerDsl circleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleStrokeOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return circleLayerDsl.circleStrokeOpacity(d14);
        }

        public static /* synthetic */ CircleLayer circleStrokeWidth$default(CircleLayerDsl circleLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleStrokeWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return circleLayerDsl.circleStrokeWidth(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CircleLayer circleTranslate$default(CircleLayerDsl circleLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleTranslate");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return circleLayerDsl.circleTranslate((List<Double>) list);
        }

        public static /* synthetic */ CircleLayer circleTranslateAnchor$default(CircleLayerDsl circleLayerDsl, CircleTranslateAnchor circleTranslateAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: circleTranslateAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                circleTranslateAnchor = CircleTranslateAnchor.MAP;
            }
            return circleLayerDsl.circleTranslateAnchor(circleTranslateAnchor);
        }
    }

    CircleLayer circleBlur(double circleBlur);

    CircleLayer circleBlur(Expression circleBlur);

    CircleLayer circleBlurTransition(StyleTransition options);

    CircleLayer circleBlurTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer circleColor(int circleColor);

    CircleLayer circleColor(Expression circleColor);

    CircleLayer circleColor(String circleColor);

    CircleLayer circleColorTransition(StyleTransition options);

    CircleLayer circleColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    CircleLayer circleColorUseTheme(Expression circleColorUseTheme);

    @MapboxExperimental
    CircleLayer circleColorUseTheme(String circleColorUseTheme);

    @MapboxExperimental
    CircleLayer circleElevationReference(Expression circleElevationReference);

    @MapboxExperimental
    CircleLayer circleElevationReference(CircleElevationReference circleElevationReference);

    CircleLayer circleEmissiveStrength(double circleEmissiveStrength);

    CircleLayer circleEmissiveStrength(Expression circleEmissiveStrength);

    CircleLayer circleEmissiveStrengthTransition(StyleTransition options);

    CircleLayer circleEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer circleOpacity(double circleOpacity);

    CircleLayer circleOpacity(Expression circleOpacity);

    CircleLayer circleOpacityTransition(StyleTransition options);

    CircleLayer circleOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer circlePitchAlignment(Expression circlePitchAlignment);

    CircleLayer circlePitchAlignment(CirclePitchAlignment circlePitchAlignment);

    CircleLayer circlePitchScale(Expression circlePitchScale);

    CircleLayer circlePitchScale(CirclePitchScale circlePitchScale);

    CircleLayer circleRadius(double circleRadius);

    CircleLayer circleRadius(Expression circleRadius);

    CircleLayer circleRadiusTransition(StyleTransition options);

    CircleLayer circleRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer circleSortKey(double circleSortKey);

    CircleLayer circleSortKey(Expression circleSortKey);

    CircleLayer circleStrokeColor(int circleStrokeColor);

    CircleLayer circleStrokeColor(Expression circleStrokeColor);

    CircleLayer circleStrokeColor(String circleStrokeColor);

    CircleLayer circleStrokeColorTransition(StyleTransition options);

    CircleLayer circleStrokeColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    CircleLayer circleStrokeColorUseTheme(Expression circleStrokeColorUseTheme);

    @MapboxExperimental
    CircleLayer circleStrokeColorUseTheme(String circleStrokeColorUseTheme);

    CircleLayer circleStrokeOpacity(double circleStrokeOpacity);

    CircleLayer circleStrokeOpacity(Expression circleStrokeOpacity);

    CircleLayer circleStrokeOpacityTransition(StyleTransition options);

    CircleLayer circleStrokeOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer circleStrokeWidth(double circleStrokeWidth);

    CircleLayer circleStrokeWidth(Expression circleStrokeWidth);

    CircleLayer circleStrokeWidthTransition(StyleTransition options);

    CircleLayer circleStrokeWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer circleTranslate(Expression circleTranslate);

    CircleLayer circleTranslate(List<Double> circleTranslate);

    CircleLayer circleTranslateAnchor(Expression circleTranslateAnchor);

    CircleLayer circleTranslateAnchor(CircleTranslateAnchor circleTranslateAnchor);

    CircleLayer circleTranslateTransition(StyleTransition options);

    CircleLayer circleTranslateTransition(l<? super StyleTransition.Builder, Unit> block);

    CircleLayer filter(Expression filter);

    CircleLayer maxZoom(double maxZoom);

    CircleLayer minZoom(double minZoom);

    CircleLayer slot(String slot);

    CircleLayer sourceLayer(String sourceLayer);

    CircleLayer visibility(Expression visibility);

    CircleLayer visibility(Visibility visibility);
}

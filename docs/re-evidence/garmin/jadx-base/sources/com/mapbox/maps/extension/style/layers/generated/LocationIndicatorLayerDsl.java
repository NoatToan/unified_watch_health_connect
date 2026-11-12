package com.mapbox.maps.extension.style.layers.generated;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b\u0012\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\tH&¢\u0006\u0004\b\u0019\u0010\nJ\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001aH&¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001c\u0010\u0013J#\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\tH'¢\u0006\u0004\b\u001d\u0010\nJ\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\nJ\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u001f\u0010\u0013J#\u0010\u001f\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u0005J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\tH'¢\u0006\u0004\b \u0010\nJ\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\rJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\tH&¢\u0006\u0004\b!\u0010\nJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010\u0013J#\u0010\"\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\tH&¢\u0006\u0004\b#\u0010\nJ\u0019\u0010$\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u000bH&¢\u0006\u0004\b$\u0010\rJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\tH&¢\u0006\u0004\b$\u0010\nJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b%\u0010\u0013J#\u0010%\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b%\u0010\u0018J\u0019\u0010&\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0002H&¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\tH&¢\u0006\u0004\b&\u0010\nJ\u0019\u0010&\u001a\u00020\u00042\b\b\u0001\u0010&\u001a\u00020\u001aH&¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010\u0013J#\u0010'\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b'\u0010\u0018J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\tH'¢\u0006\u0004\b(\u0010\nJ\u001f\u0010*\u001a\u00020\u00042\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0)H&¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\tH&¢\u0006\u0004\b*\u0010\nJ\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b,\u0010\u0013J#\u0010,\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b,\u0010\u0018J\u0019\u0010-\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u000bH&¢\u0006\u0004\b-\u0010\rJ\u0017\u0010-\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\tH&¢\u0006\u0004\b-\u0010\nJ\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b.\u0010\u0013J#\u0010.\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b.\u0010\u0018J\u0019\u0010/\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u000bH&¢\u0006\u0004\b/\u0010\rJ\u0017\u0010/\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\tH&¢\u0006\u0004\b/\u0010\nJ\u001f\u00100\u001a\u00020\u00042\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0)H&¢\u0006\u0004\b0\u0010+J\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\tH&¢\u0006\u0004\b0\u0010\nJ\u0017\u00101\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b1\u0010\u0013J#\u00101\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b1\u0010\u0018J\u0019\u00102\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u000bH&¢\u0006\u0004\b2\u0010\rJ\u0017\u00102\u001a\u00020\u00042\u0006\u00102\u001a\u00020\tH&¢\u0006\u0004\b2\u0010\nJ\u0017\u00103\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b3\u0010\u0013J#\u00103\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b3\u0010\u0018J\u0019\u00104\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u000bH&¢\u0006\u0004\b4\u0010\rJ\u0017\u00104\u001a\u00020\u00042\u0006\u00104\u001a\u00020\tH&¢\u0006\u0004\b4\u0010\nJ\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0002H&¢\u0006\u0004\b5\u0010\u0005J\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\tH&¢\u0006\u0004\b5\u0010\nJ\u0019\u00106\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u000bH&¢\u0006\u0004\b6\u0010\rJ\u0017\u00106\u001a\u00020\u00042\u0006\u00106\u001a\u00020\tH&¢\u0006\u0004\b6\u0010\nJ\u0017\u00107\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b7\u0010\u0013J#\u00107\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b7\u0010\u0018J\u0017\u00108\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0002H&¢\u0006\u0004\b8\u0010\u0005J\u0017\u00108\u001a\u00020\u00042\u0006\u00108\u001a\u00020\tH&¢\u0006\u0004\b8\u0010\nJ\u0019\u00109\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u000bH&¢\u0006\u0004\b9\u0010\rJ\u0017\u00109\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH&¢\u0006\u0004\b9\u0010\nJ\u0017\u0010:\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b:\u0010\u0013J#\u0010:\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b:\u0010\u0018¨\u0006;"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayerDsl;", "", "", "slot", "Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "maxZoom", "accuracyRadius", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "accuracyRadiusTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "accuracyRadiusBorderColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "accuracyRadiusBorderColorTransition", "accuracyRadiusBorderColorUseTheme", "accuracyRadiusColor", "accuracyRadiusColorTransition", "accuracyRadiusColorUseTheme", "bearing", "bearingTransition", "bearingImage", "bearingImageSize", "bearingImageSizeTransition", "emphasisCircleColor", "emphasisCircleColorTransition", "emphasisCircleColorUseTheme", "", "emphasisCircleGlowRange", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "emphasisCircleGlowRangeTransition", "emphasisCircleRadius", "emphasisCircleRadiusTransition", "imagePitchDisplacement", FirebaseAnalytics.Param.LOCATION, "locationTransition", "locationIndicatorOpacity", "locationIndicatorOpacityTransition", "perspectiveCompensation", "shadowImage", "shadowImageSize", "shadowImageSizeTransition", "topImage", "topImageSize", "topImageSizeTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LocationIndicatorLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ LocationIndicatorLayer accuracyRadius$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: accuracyRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return locationIndicatorLayerDsl.accuracyRadius(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer accuracyRadiusBorderColor$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: accuracyRadiusBorderColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return locationIndicatorLayerDsl.accuracyRadiusBorderColor(str);
        }

        public static /* synthetic */ LocationIndicatorLayer accuracyRadiusColor$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: accuracyRadiusColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return locationIndicatorLayerDsl.accuracyRadiusColor(str);
        }

        public static /* synthetic */ LocationIndicatorLayer bearing$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: bearing");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return locationIndicatorLayerDsl.bearing(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer bearingImageSize$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: bearingImageSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return locationIndicatorLayerDsl.bearingImageSize(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer emphasisCircleColor$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: emphasisCircleColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return locationIndicatorLayerDsl.emphasisCircleColor(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocationIndicatorLayer emphasisCircleGlowRange$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: emphasisCircleGlowRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return locationIndicatorLayerDsl.emphasisCircleGlowRange((List<Double>) list);
        }

        public static /* synthetic */ LocationIndicatorLayer emphasisCircleRadius$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: emphasisCircleRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return locationIndicatorLayerDsl.emphasisCircleRadius(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer imagePitchDisplacement$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: imagePitchDisplacement");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return locationIndicatorLayerDsl.imagePitchDisplacement(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocationIndicatorLayer location$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: location");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf, dValueOf);
            }
            return locationIndicatorLayerDsl.location((List<Double>) list);
        }

        public static /* synthetic */ LocationIndicatorLayer locationIndicatorOpacity$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: locationIndicatorOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return locationIndicatorLayerDsl.locationIndicatorOpacity(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer perspectiveCompensation$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: perspectiveCompensation");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.85d;
            }
            return locationIndicatorLayerDsl.perspectiveCompensation(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer shadowImageSize$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: shadowImageSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return locationIndicatorLayerDsl.shadowImageSize(d14);
        }

        public static /* synthetic */ LocationIndicatorLayer topImageSize$default(LocationIndicatorLayerDsl locationIndicatorLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: topImageSize");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return locationIndicatorLayerDsl.topImageSize(d14);
        }
    }

    LocationIndicatorLayer accuracyRadius(double accuracyRadius);

    LocationIndicatorLayer accuracyRadius(Expression accuracyRadius);

    LocationIndicatorLayer accuracyRadiusBorderColor(int accuracyRadiusBorderColor);

    LocationIndicatorLayer accuracyRadiusBorderColor(Expression accuracyRadiusBorderColor);

    LocationIndicatorLayer accuracyRadiusBorderColor(String accuracyRadiusBorderColor);

    LocationIndicatorLayer accuracyRadiusBorderColorTransition(StyleTransition options);

    LocationIndicatorLayer accuracyRadiusBorderColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LocationIndicatorLayer accuracyRadiusBorderColorUseTheme(Expression accuracyRadiusBorderColorUseTheme);

    @MapboxExperimental
    LocationIndicatorLayer accuracyRadiusBorderColorUseTheme(String accuracyRadiusBorderColorUseTheme);

    LocationIndicatorLayer accuracyRadiusColor(int accuracyRadiusColor);

    LocationIndicatorLayer accuracyRadiusColor(Expression accuracyRadiusColor);

    LocationIndicatorLayer accuracyRadiusColor(String accuracyRadiusColor);

    LocationIndicatorLayer accuracyRadiusColorTransition(StyleTransition options);

    LocationIndicatorLayer accuracyRadiusColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LocationIndicatorLayer accuracyRadiusColorUseTheme(Expression accuracyRadiusColorUseTheme);

    @MapboxExperimental
    LocationIndicatorLayer accuracyRadiusColorUseTheme(String accuracyRadiusColorUseTheme);

    LocationIndicatorLayer accuracyRadiusTransition(StyleTransition options);

    LocationIndicatorLayer accuracyRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer bearing(double bearing);

    LocationIndicatorLayer bearing(Expression bearing);

    LocationIndicatorLayer bearingImage(Expression bearingImage);

    LocationIndicatorLayer bearingImage(String bearingImage);

    LocationIndicatorLayer bearingImageSize(double bearingImageSize);

    LocationIndicatorLayer bearingImageSize(Expression bearingImageSize);

    LocationIndicatorLayer bearingImageSizeTransition(StyleTransition options);

    LocationIndicatorLayer bearingImageSizeTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer bearingTransition(StyleTransition options);

    LocationIndicatorLayer bearingTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer emphasisCircleColor(int emphasisCircleColor);

    LocationIndicatorLayer emphasisCircleColor(Expression emphasisCircleColor);

    LocationIndicatorLayer emphasisCircleColor(String emphasisCircleColor);

    LocationIndicatorLayer emphasisCircleColorTransition(StyleTransition options);

    LocationIndicatorLayer emphasisCircleColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LocationIndicatorLayer emphasisCircleColorUseTheme(Expression emphasisCircleColorUseTheme);

    @MapboxExperimental
    LocationIndicatorLayer emphasisCircleColorUseTheme(String emphasisCircleColorUseTheme);

    LocationIndicatorLayer emphasisCircleGlowRange(Expression emphasisCircleGlowRange);

    LocationIndicatorLayer emphasisCircleGlowRange(List<Double> emphasisCircleGlowRange);

    LocationIndicatorLayer emphasisCircleGlowRangeTransition(StyleTransition options);

    LocationIndicatorLayer emphasisCircleGlowRangeTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer emphasisCircleRadius(double emphasisCircleRadius);

    LocationIndicatorLayer emphasisCircleRadius(Expression emphasisCircleRadius);

    LocationIndicatorLayer emphasisCircleRadiusTransition(StyleTransition options);

    LocationIndicatorLayer emphasisCircleRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer imagePitchDisplacement(double imagePitchDisplacement);

    LocationIndicatorLayer imagePitchDisplacement(Expression imagePitchDisplacement);

    LocationIndicatorLayer location(Expression location);

    LocationIndicatorLayer location(List<Double> location);

    LocationIndicatorLayer locationIndicatorOpacity(double locationIndicatorOpacity);

    LocationIndicatorLayer locationIndicatorOpacity(Expression locationIndicatorOpacity);

    LocationIndicatorLayer locationIndicatorOpacityTransition(StyleTransition options);

    LocationIndicatorLayer locationIndicatorOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer locationTransition(StyleTransition options);

    LocationIndicatorLayer locationTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer maxZoom(double maxZoom);

    LocationIndicatorLayer minZoom(double minZoom);

    LocationIndicatorLayer perspectiveCompensation(double perspectiveCompensation);

    LocationIndicatorLayer perspectiveCompensation(Expression perspectiveCompensation);

    LocationIndicatorLayer shadowImage(Expression shadowImage);

    LocationIndicatorLayer shadowImage(String shadowImage);

    LocationIndicatorLayer shadowImageSize(double shadowImageSize);

    LocationIndicatorLayer shadowImageSize(Expression shadowImageSize);

    LocationIndicatorLayer shadowImageSizeTransition(StyleTransition options);

    LocationIndicatorLayer shadowImageSizeTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer slot(String slot);

    LocationIndicatorLayer topImage(Expression topImage);

    LocationIndicatorLayer topImage(String topImage);

    LocationIndicatorLayer topImageSize(double topImageSize);

    LocationIndicatorLayer topImageSize(Expression topImageSize);

    LocationIndicatorLayer topImageSizeTransition(StyleTransition options);

    LocationIndicatorLayer topImageSizeTransition(l<? super StyleTransition.Builder, Unit> block);

    LocationIndicatorLayer visibility(Expression visibility);

    LocationIndicatorLayer visibility(Visibility visibility);
}

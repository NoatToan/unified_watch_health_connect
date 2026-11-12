package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.SkyType;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0011H&¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H'¢\u0006\u0004\b\u0013\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\bJ\u0019\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006H'¢\u0006\u0004\b\u0015\u0010\bJ\u001d\u0010\u0017\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\fH&¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H'¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H&¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\bJ\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\bJ\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J#\u0010!\u001a\u00020\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H&¢\u0006\u0004\b!\u0010'J\u0019\u0010)\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0006H&¢\u0006\u0004\b)\u0010\b¨\u0006+"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/SkyLayerDsl;", "", "", "slot", "Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "maxZoom", "skyAtmosphereColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "skyAtmosphereColorUseTheme", "skyAtmosphereHaloColor", "skyAtmosphereHaloColorUseTheme", "", "skyAtmosphereSun", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "skyAtmosphereSunIntensity", "skyGradient", "skyGradientUseTheme", "skyGradientCenter", "skyGradientRadius", "skyOpacity", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "skyOpacityTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;", "skyType", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/SkyType;)Lcom/mapbox/maps/extension/style/layers/generated/SkyLayer;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SkyLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SkyLayer skyAtmosphereColor$default(SkyLayerDsl skyLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyAtmosphereColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "white";
            }
            return skyLayerDsl.skyAtmosphereColor(str);
        }

        public static /* synthetic */ SkyLayer skyAtmosphereHaloColor$default(SkyLayerDsl skyLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyAtmosphereHaloColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "white";
            }
            return skyLayerDsl.skyAtmosphereHaloColor(str);
        }

        public static /* synthetic */ SkyLayer skyAtmosphereSunIntensity$default(SkyLayerDsl skyLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyAtmosphereSunIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 10.0d;
            }
            return skyLayerDsl.skyAtmosphereSunIntensity(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkyLayer skyGradientCenter$default(SkyLayerDsl skyLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyGradientCenter");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return skyLayerDsl.skyGradientCenter((List<Double>) list);
        }

        public static /* synthetic */ SkyLayer skyGradientRadius$default(SkyLayerDsl skyLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyGradientRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 90.0d;
            }
            return skyLayerDsl.skyGradientRadius(d14);
        }

        public static /* synthetic */ SkyLayer skyOpacity$default(SkyLayerDsl skyLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return skyLayerDsl.skyOpacity(d14);
        }

        public static /* synthetic */ SkyLayer skyType$default(SkyLayerDsl skyLayerDsl, SkyType skyType, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: skyType");
                return null;
            }
            if ((i14 & 1) != 0) {
                skyType = SkyType.ATMOSPHERE;
            }
            return skyLayerDsl.skyType(skyType);
        }
    }

    SkyLayer filter(Expression filter);

    SkyLayer maxZoom(double maxZoom);

    SkyLayer minZoom(double minZoom);

    SkyLayer skyAtmosphereColor(int skyAtmosphereColor);

    SkyLayer skyAtmosphereColor(Expression skyAtmosphereColor);

    SkyLayer skyAtmosphereColor(String skyAtmosphereColor);

    @MapboxExperimental
    SkyLayer skyAtmosphereColorUseTheme(Expression skyAtmosphereColorUseTheme);

    @MapboxExperimental
    SkyLayer skyAtmosphereColorUseTheme(String skyAtmosphereColorUseTheme);

    SkyLayer skyAtmosphereHaloColor(int skyAtmosphereHaloColor);

    SkyLayer skyAtmosphereHaloColor(Expression skyAtmosphereHaloColor);

    SkyLayer skyAtmosphereHaloColor(String skyAtmosphereHaloColor);

    @MapboxExperimental
    SkyLayer skyAtmosphereHaloColorUseTheme(Expression skyAtmosphereHaloColorUseTheme);

    @MapboxExperimental
    SkyLayer skyAtmosphereHaloColorUseTheme(String skyAtmosphereHaloColorUseTheme);

    SkyLayer skyAtmosphereSun(Expression skyAtmosphereSun);

    SkyLayer skyAtmosphereSun(List<Double> skyAtmosphereSun);

    SkyLayer skyAtmosphereSunIntensity(double skyAtmosphereSunIntensity);

    SkyLayer skyAtmosphereSunIntensity(Expression skyAtmosphereSunIntensity);

    SkyLayer skyGradient(Expression skyGradient);

    SkyLayer skyGradientCenter(Expression skyGradientCenter);

    SkyLayer skyGradientCenter(List<Double> skyGradientCenter);

    SkyLayer skyGradientRadius(double skyGradientRadius);

    SkyLayer skyGradientRadius(Expression skyGradientRadius);

    @MapboxExperimental
    SkyLayer skyGradientUseTheme(Expression skyGradientUseTheme);

    @MapboxExperimental
    SkyLayer skyGradientUseTheme(String skyGradientUseTheme);

    SkyLayer skyOpacity(double skyOpacity);

    SkyLayer skyOpacity(Expression skyOpacity);

    SkyLayer skyOpacityTransition(StyleTransition options);

    SkyLayer skyOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    SkyLayer skyType(Expression skyType);

    SkyLayer skyType(SkyType skyType);

    SkyLayer slot(String slot);

    SkyLayer visibility(Expression visibility);

    SkyLayer visibility(Visibility visibility);
}

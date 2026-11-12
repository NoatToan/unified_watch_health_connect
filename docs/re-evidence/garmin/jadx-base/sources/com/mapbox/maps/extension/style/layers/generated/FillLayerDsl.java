package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.FillElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.FillTranslateAnchor;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\rH&¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\tJ\u0019\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0011H&¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\tJ\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\tJ\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001aH'¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H'¢\u0006\u0004\b\u001e\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010\u0005J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0007H'¢\u0006\u0004\b%\u0010\tJ\u0019\u0010&\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0002H&¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H&¢\u0006\u0004\b&\u0010\tJ\u0019\u0010&\u001a\u00020\u00042\b\b\u0001\u0010&\u001a\u00020\u001aH&¢\u0006\u0004\b&\u0010\u001bJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b'\u0010\u001fJ#\u0010'\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H&¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007H'¢\u0006\u0004\b(\u0010\tJ\u0019\u0010)\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\rH&¢\u0006\u0004\b)\u0010\u000fJ\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0007H&¢\u0006\u0004\b)\u0010\tJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b*\u0010\u001fJ#\u0010*\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H&¢\u0006\u0004\b*\u0010$J\u0019\u0010+\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\rH&¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010+\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0007H&¢\u0006\u0004\b+\u0010\tJ\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b,\u0010\u001fJ#\u0010,\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H&¢\u0006\u0004\b,\u0010$J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010\u0005J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0007H&¢\u0006\u0004\b-\u0010\tJ\u0019\u0010-\u001a\u00020\u00042\b\b\u0001\u0010-\u001a\u00020\u001aH&¢\u0006\u0004\b-\u0010\u001bJ\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b.\u0010\u001fJ#\u0010.\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H&¢\u0006\u0004\b.\u0010$J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\u0005J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0007H'¢\u0006\u0004\b/\u0010\tJ\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u0005J\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0007H&¢\u0006\u0004\b0\u0010\tJ\u0019\u00101\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\rH&¢\u0006\u0004\b1\u0010\u000fJ\u0017\u00101\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0007H&¢\u0006\u0004\b1\u0010\tJ\u001f\u00103\u001a\u00020\u00042\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\r02H&¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H&¢\u0006\u0004\b3\u0010\tJ\u0017\u00105\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b5\u0010\u001fJ#\u00105\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H&¢\u0006\u0004\b5\u0010$J\u0019\u00107\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0007H&¢\u0006\u0004\b7\u0010\tJ\u0019\u00109\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u0002H'¢\u0006\u0004\b9\u0010\u0005J\u0017\u00109\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0007H'¢\u0006\u0004\b9\u0010\tJ\u0019\u00109\u001a\u00020\u00042\b\b\u0001\u00109\u001a\u00020\u001aH'¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b:\u0010\u001fJ#\u0010:\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H'¢\u0006\u0004\b:\u0010$J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0002H'¢\u0006\u0004\b;\u0010\u0005J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0007H'¢\u0006\u0004\b;\u0010\tJ\u0019\u0010<\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\rH'¢\u0006\u0004\b<\u0010\u000fJ\u0017\u0010<\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0007H'¢\u0006\u0004\b<\u0010\tJ\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b=\u0010\u001fJ#\u0010=\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H'¢\u0006\u0004\b=\u0010$¨\u0006>"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "maxZoom", "", "fillConstructBridgeGuardRail", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "fillElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillSortKey", "fillAntialias", "fillBridgeGuardRailColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "fillBridgeGuardRailColorTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillBridgeGuardRailColorUseTheme", "fillColor", "fillColorTransition", "fillColorUseTheme", "fillEmissiveStrength", "fillEmissiveStrengthTransition", "fillOpacity", "fillOpacityTransition", "fillOutlineColor", "fillOutlineColorTransition", "fillOutlineColorUseTheme", "fillPattern", "fillPatternCrossFade", "", "fillTranslate", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "fillTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "fillTunnelStructureColor", "fillTunnelStructureColorTransition", "fillTunnelStructureColorUseTheme", "fillZOffset", "fillZOffsetTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FillLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ FillLayer fillAntialias$default(FillLayerDsl fillLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillAntialias");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return fillLayerDsl.fillAntialias(z14);
        }

        public static /* synthetic */ FillLayer fillBridgeGuardRailColor$default(FillLayerDsl fillLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillBridgeGuardRailColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "rgba(241, 236, 225, 255)";
            }
            return fillLayerDsl.fillBridgeGuardRailColor(str);
        }

        public static /* synthetic */ FillLayer fillColor$default(FillLayerDsl fillLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return fillLayerDsl.fillColor(str);
        }

        public static /* synthetic */ FillLayer fillConstructBridgeGuardRail$default(FillLayerDsl fillLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillConstructBridgeGuardRail");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return fillLayerDsl.fillConstructBridgeGuardRail(z14);
        }

        public static /* synthetic */ FillLayer fillElevationReference$default(FillLayerDsl fillLayerDsl, FillElevationReference fillElevationReference, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillElevationReference");
                return null;
            }
            if ((i14 & 1) != 0) {
                fillElevationReference = FillElevationReference.NONE;
            }
            return fillLayerDsl.fillElevationReference(fillElevationReference);
        }

        public static /* synthetic */ FillLayer fillEmissiveStrength$default(FillLayerDsl fillLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillLayerDsl.fillEmissiveStrength(d14);
        }

        public static /* synthetic */ FillLayer fillOpacity$default(FillLayerDsl fillLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return fillLayerDsl.fillOpacity(d14);
        }

        public static /* synthetic */ FillLayer fillPatternCrossFade$default(FillLayerDsl fillLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillPatternCrossFade");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillLayerDsl.fillPatternCrossFade(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FillLayer fillTranslate$default(FillLayerDsl fillLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillTranslate");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return fillLayerDsl.fillTranslate((List<Double>) list);
        }

        public static /* synthetic */ FillLayer fillTranslateAnchor$default(FillLayerDsl fillLayerDsl, FillTranslateAnchor fillTranslateAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillTranslateAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                fillTranslateAnchor = FillTranslateAnchor.MAP;
            }
            return fillLayerDsl.fillTranslateAnchor(fillTranslateAnchor);
        }

        public static /* synthetic */ FillLayer fillTunnelStructureColor$default(FillLayerDsl fillLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillTunnelStructureColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "rgba(241, 236, 225, 255)";
            }
            return fillLayerDsl.fillTunnelStructureColor(str);
        }

        public static /* synthetic */ FillLayer fillZOffset$default(FillLayerDsl fillLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillZOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillLayerDsl.fillZOffset(d14);
        }
    }

    FillLayer fillAntialias(Expression fillAntialias);

    FillLayer fillAntialias(boolean fillAntialias);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColor(int fillBridgeGuardRailColor);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColor(Expression fillBridgeGuardRailColor);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColor(String fillBridgeGuardRailColor);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColorTransition(StyleTransition options);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColorUseTheme(Expression fillBridgeGuardRailColorUseTheme);

    @MapboxExperimental
    FillLayer fillBridgeGuardRailColorUseTheme(String fillBridgeGuardRailColorUseTheme);

    FillLayer fillColor(int fillColor);

    FillLayer fillColor(Expression fillColor);

    FillLayer fillColor(String fillColor);

    FillLayer fillColorTransition(StyleTransition options);

    FillLayer fillColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillLayer fillColorUseTheme(Expression fillColorUseTheme);

    @MapboxExperimental
    FillLayer fillColorUseTheme(String fillColorUseTheme);

    @MapboxExperimental
    FillLayer fillConstructBridgeGuardRail(Expression fillConstructBridgeGuardRail);

    @MapboxExperimental
    FillLayer fillConstructBridgeGuardRail(boolean fillConstructBridgeGuardRail);

    @MapboxExperimental
    FillLayer fillElevationReference(Expression fillElevationReference);

    @MapboxExperimental
    FillLayer fillElevationReference(FillElevationReference fillElevationReference);

    FillLayer fillEmissiveStrength(double fillEmissiveStrength);

    FillLayer fillEmissiveStrength(Expression fillEmissiveStrength);

    FillLayer fillEmissiveStrengthTransition(StyleTransition options);

    FillLayer fillEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    FillLayer fillOpacity(double fillOpacity);

    FillLayer fillOpacity(Expression fillOpacity);

    FillLayer fillOpacityTransition(StyleTransition options);

    FillLayer fillOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    FillLayer fillOutlineColor(int fillOutlineColor);

    FillLayer fillOutlineColor(Expression fillOutlineColor);

    FillLayer fillOutlineColor(String fillOutlineColor);

    FillLayer fillOutlineColorTransition(StyleTransition options);

    FillLayer fillOutlineColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillLayer fillOutlineColorUseTheme(Expression fillOutlineColorUseTheme);

    @MapboxExperimental
    FillLayer fillOutlineColorUseTheme(String fillOutlineColorUseTheme);

    FillLayer fillPattern(Expression fillPattern);

    FillLayer fillPattern(String fillPattern);

    FillLayer fillPatternCrossFade(double fillPatternCrossFade);

    FillLayer fillPatternCrossFade(Expression fillPatternCrossFade);

    FillLayer fillSortKey(double fillSortKey);

    FillLayer fillSortKey(Expression fillSortKey);

    FillLayer fillTranslate(Expression fillTranslate);

    FillLayer fillTranslate(List<Double> fillTranslate);

    FillLayer fillTranslateAnchor(Expression fillTranslateAnchor);

    FillLayer fillTranslateAnchor(FillTranslateAnchor fillTranslateAnchor);

    FillLayer fillTranslateTransition(StyleTransition options);

    FillLayer fillTranslateTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillLayer fillTunnelStructureColor(int fillTunnelStructureColor);

    @MapboxExperimental
    FillLayer fillTunnelStructureColor(Expression fillTunnelStructureColor);

    @MapboxExperimental
    FillLayer fillTunnelStructureColor(String fillTunnelStructureColor);

    @MapboxExperimental
    FillLayer fillTunnelStructureColorTransition(StyleTransition options);

    @MapboxExperimental
    FillLayer fillTunnelStructureColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillLayer fillTunnelStructureColorUseTheme(Expression fillTunnelStructureColorUseTheme);

    @MapboxExperimental
    FillLayer fillTunnelStructureColorUseTheme(String fillTunnelStructureColorUseTheme);

    @MapboxExperimental
    FillLayer fillZOffset(double fillZOffset);

    @MapboxExperimental
    FillLayer fillZOffset(Expression fillZOffset);

    @MapboxExperimental
    FillLayer fillZOffsetTransition(StyleTransition options);

    @MapboxExperimental
    FillLayer fillZOffsetTransition(l<? super StyleTransition.Builder, Unit> block);

    FillLayer filter(Expression filter);

    FillLayer maxZoom(double maxZoom);

    FillLayer minZoom(double minZoom);

    FillLayer slot(String slot);

    FillLayer sourceLayer(String sourceLayer);

    FillLayer visibility(Expression visibility);

    FillLayer visibility(Visibility visibility);
}

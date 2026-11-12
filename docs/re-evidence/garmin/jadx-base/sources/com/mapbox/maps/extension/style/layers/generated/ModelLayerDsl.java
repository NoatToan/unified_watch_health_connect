package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelScaleMode;
import com.mapbox.maps.extension.style.layers.properties.generated.ModelType;
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
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b\u0015\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H'¢\u0006\u0004\b\u001d\u0010\tJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H'¢\u0006\u0004\b\u001f\u0010\tJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020 H'¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\"\u0010\u0016J#\u0010\"\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\tJ\u0019\u0010$\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\rH'¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007H'¢\u0006\u0004\b$\u0010\tJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b%\u0010\u0016J#\u0010%\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b%\u0010\u001bJ\u0019\u0010&\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\rH'¢\u0006\u0004\b&\u0010\u000fJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H'¢\u0006\u0004\b&\u0010\tJ\u0019\u0010(\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020'H'¢\u0006\u0004\b(\u0010)J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007H'¢\u0006\u0004\b(\u0010\tJ\u0019\u0010*\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\rH'¢\u0006\u0004\b*\u0010\u000fJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0007H'¢\u0006\u0004\b*\u0010\tJ\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b+\u0010\u0016J#\u0010+\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b+\u0010\u001bJ\u001f\u0010-\u001a\u00020\u00042\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0,H'¢\u0006\u0004\b-\u0010.J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010\tJ\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b/\u0010\u0016J#\u0010/\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b/\u0010\u001bJ\u0019\u00100\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\rH'¢\u0006\u0004\b0\u0010\u000fJ\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0007H'¢\u0006\u0004\b0\u0010\tJ\u0017\u00101\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b1\u0010\u0016J#\u00101\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b1\u0010\u001bJ\u0019\u00102\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u001cH'¢\u0006\u0004\b2\u0010\u001eJ\u0017\u00102\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0007H'¢\u0006\u0004\b2\u0010\tJ\u001f\u00103\u001a\u00020\u00042\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\r0,H'¢\u0006\u0004\b3\u0010.J\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H'¢\u0006\u0004\b3\u0010\tJ\u0017\u00104\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b4\u0010\u0016J#\u00104\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b4\u0010\u001bJ\u0019\u00105\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\rH'¢\u0006\u0004\b5\u0010\u000fJ\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H'¢\u0006\u0004\b5\u0010\tJ\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b6\u0010\u0016J#\u00106\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b6\u0010\u001bJ\u001f\u00107\u001a\u00020\u00042\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\r0,H'¢\u0006\u0004\b7\u0010.J\u0017\u00107\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0007H'¢\u0006\u0004\b7\u0010\tJ\u0017\u00108\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b8\u0010\u0016J#\u00108\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b8\u0010\u001bJ\u0019\u0010:\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u000209H'¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0007H'¢\u0006\u0004\b:\u0010\tJ\u001f\u0010<\u001a\u00020\u00042\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0,H'¢\u0006\u0004\b<\u0010.J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0007H'¢\u0006\u0004\b<\u0010\tJ\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b=\u0010\u0016J#\u0010=\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b=\u0010\u001bJ\u0019\u0010?\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020>H'¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0007H'¢\u0006\u0004\b?\u0010\t¨\u0006A"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/ModelLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "maxZoom", "modelId", "modelAmbientOcclusionIntensity", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "modelAmbientOcclusionIntensityTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "", "modelCastShadows", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelColorTransition", "modelColorUseTheme", "modelColorMixIntensity", "modelColorMixIntensityTransition", "modelCutoffFadeRange", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;", "modelElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelEmissiveStrength", "modelEmissiveStrengthTransition", "", "modelHeightBasedEmissiveStrengthMultiplier", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelHeightBasedEmissiveStrengthMultiplierTransition", "modelOpacity", "modelOpacityTransition", "modelReceiveShadows", "modelRotation", "modelRotationTransition", "modelRoughness", "modelRoughnessTransition", "modelScale", "modelScaleTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;", "modelScaleMode", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelScaleMode;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "modelTranslation", "modelTranslationTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;", "modelType", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/ModelType;)Lcom/mapbox/maps/extension/style/layers/generated/ModelLayer;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public interface ModelLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ ModelLayer modelAmbientOcclusionIntensity$default(ModelLayerDsl modelLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelAmbientOcclusionIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return modelLayerDsl.modelAmbientOcclusionIntensity(d14);
        }

        public static /* synthetic */ ModelLayer modelCastShadows$default(ModelLayerDsl modelLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelCastShadows");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return modelLayerDsl.modelCastShadows(z14);
        }

        public static /* synthetic */ ModelLayer modelColor$default(ModelLayerDsl modelLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return modelLayerDsl.modelColor(str);
        }

        public static /* synthetic */ ModelLayer modelColorMixIntensity$default(ModelLayerDsl modelLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelColorMixIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return modelLayerDsl.modelColorMixIntensity(d14);
        }

        public static /* synthetic */ ModelLayer modelCutoffFadeRange$default(ModelLayerDsl modelLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelCutoffFadeRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return modelLayerDsl.modelCutoffFadeRange(d14);
        }

        public static /* synthetic */ ModelLayer modelElevationReference$default(ModelLayerDsl modelLayerDsl, ModelElevationReference modelElevationReference, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelElevationReference");
                return null;
            }
            if ((i14 & 1) != 0) {
                modelElevationReference = ModelElevationReference.GROUND;
            }
            return modelLayerDsl.modelElevationReference(modelElevationReference);
        }

        public static /* synthetic */ ModelLayer modelEmissiveStrength$default(ModelLayerDsl modelLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return modelLayerDsl.modelEmissiveStrength(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ModelLayer modelHeightBasedEmissiveStrengthMultiplier$default(ModelLayerDsl modelLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(1.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelHeightBasedEmissiveStrengthMultiplier");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf, dValueOf, dValueOf, Double.valueOf(0.0d));
            }
            return modelLayerDsl.modelHeightBasedEmissiveStrengthMultiplier((List<Double>) list);
        }

        public static /* synthetic */ ModelLayer modelId$default(ModelLayerDsl modelLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelId");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "";
            }
            return modelLayerDsl.modelId(str);
        }

        public static /* synthetic */ ModelLayer modelOpacity$default(ModelLayerDsl modelLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return modelLayerDsl.modelOpacity(d14);
        }

        public static /* synthetic */ ModelLayer modelReceiveShadows$default(ModelLayerDsl modelLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelReceiveShadows");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return modelLayerDsl.modelReceiveShadows(z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ModelLayer modelRotation$default(ModelLayerDsl modelLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelRotation");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf, dValueOf);
            }
            return modelLayerDsl.modelRotation((List<Double>) list);
        }

        public static /* synthetic */ ModelLayer modelRoughness$default(ModelLayerDsl modelLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelRoughness");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return modelLayerDsl.modelRoughness(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ModelLayer modelScale$default(ModelLayerDsl modelLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(1.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelScale");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf, dValueOf);
            }
            return modelLayerDsl.modelScale((List<Double>) list);
        }

        public static /* synthetic */ ModelLayer modelScaleMode$default(ModelLayerDsl modelLayerDsl, ModelScaleMode modelScaleMode, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelScaleMode");
                return null;
            }
            if ((i14 & 1) != 0) {
                modelScaleMode = ModelScaleMode.MAP;
            }
            return modelLayerDsl.modelScaleMode(modelScaleMode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ModelLayer modelTranslation$default(ModelLayerDsl modelLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelTranslation");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf, dValueOf);
            }
            return modelLayerDsl.modelTranslation((List<Double>) list);
        }

        public static /* synthetic */ ModelLayer modelType$default(ModelLayerDsl modelLayerDsl, ModelType modelType, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: modelType");
                return null;
            }
            if ((i14 & 1) != 0) {
                modelType = ModelType.COMMON_3D;
            }
            return modelLayerDsl.modelType(modelType);
        }
    }

    ModelLayer filter(Expression filter);

    ModelLayer maxZoom(double maxZoom);

    ModelLayer minZoom(double minZoom);

    @MapboxExperimental
    ModelLayer modelAmbientOcclusionIntensity(double modelAmbientOcclusionIntensity);

    @MapboxExperimental
    ModelLayer modelAmbientOcclusionIntensity(Expression modelAmbientOcclusionIntensity);

    @MapboxExperimental
    ModelLayer modelAmbientOcclusionIntensityTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelAmbientOcclusionIntensityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelCastShadows(Expression modelCastShadows);

    @MapboxExperimental
    ModelLayer modelCastShadows(boolean modelCastShadows);

    @MapboxExperimental
    ModelLayer modelColor(int modelColor);

    @MapboxExperimental
    ModelLayer modelColor(Expression modelColor);

    @MapboxExperimental
    ModelLayer modelColor(String modelColor);

    @MapboxExperimental
    ModelLayer modelColorMixIntensity(double modelColorMixIntensity);

    @MapboxExperimental
    ModelLayer modelColorMixIntensity(Expression modelColorMixIntensity);

    @MapboxExperimental
    ModelLayer modelColorMixIntensityTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelColorMixIntensityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelColorTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelColorUseTheme(Expression modelColorUseTheme);

    @MapboxExperimental
    ModelLayer modelColorUseTheme(String modelColorUseTheme);

    @MapboxExperimental
    ModelLayer modelCutoffFadeRange(double modelCutoffFadeRange);

    @MapboxExperimental
    ModelLayer modelCutoffFadeRange(Expression modelCutoffFadeRange);

    @MapboxExperimental
    ModelLayer modelElevationReference(Expression modelElevationReference);

    @MapboxExperimental
    ModelLayer modelElevationReference(ModelElevationReference modelElevationReference);

    @MapboxExperimental
    ModelLayer modelEmissiveStrength(double modelEmissiveStrength);

    @MapboxExperimental
    ModelLayer modelEmissiveStrength(Expression modelEmissiveStrength);

    @MapboxExperimental
    ModelLayer modelEmissiveStrengthTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelHeightBasedEmissiveStrengthMultiplier(Expression modelHeightBasedEmissiveStrengthMultiplier);

    @MapboxExperimental
    ModelLayer modelHeightBasedEmissiveStrengthMultiplier(List<Double> modelHeightBasedEmissiveStrengthMultiplier);

    @MapboxExperimental
    ModelLayer modelHeightBasedEmissiveStrengthMultiplierTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelHeightBasedEmissiveStrengthMultiplierTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelId(Expression modelId);

    @MapboxExperimental
    ModelLayer modelId(String modelId);

    @MapboxExperimental
    ModelLayer modelOpacity(double modelOpacity);

    @MapboxExperimental
    ModelLayer modelOpacity(Expression modelOpacity);

    @MapboxExperimental
    ModelLayer modelOpacityTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelReceiveShadows(Expression modelReceiveShadows);

    @MapboxExperimental
    ModelLayer modelReceiveShadows(boolean modelReceiveShadows);

    @MapboxExperimental
    ModelLayer modelRotation(Expression modelRotation);

    @MapboxExperimental
    ModelLayer modelRotation(List<Double> modelRotation);

    @MapboxExperimental
    ModelLayer modelRotationTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelRotationTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelRoughness(double modelRoughness);

    @MapboxExperimental
    ModelLayer modelRoughness(Expression modelRoughness);

    @MapboxExperimental
    ModelLayer modelRoughnessTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelRoughnessTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelScale(Expression modelScale);

    @MapboxExperimental
    ModelLayer modelScale(List<Double> modelScale);

    @MapboxExperimental
    ModelLayer modelScaleMode(Expression modelScaleMode);

    @MapboxExperimental
    ModelLayer modelScaleMode(ModelScaleMode modelScaleMode);

    @MapboxExperimental
    ModelLayer modelScaleTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelScaleTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelTranslation(Expression modelTranslation);

    @MapboxExperimental
    ModelLayer modelTranslation(List<Double> modelTranslation);

    @MapboxExperimental
    ModelLayer modelTranslationTransition(StyleTransition options);

    @MapboxExperimental
    ModelLayer modelTranslationTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    ModelLayer modelType(Expression modelType);

    @MapboxExperimental
    ModelLayer modelType(ModelType modelType);

    ModelLayer slot(String slot);

    ModelLayer sourceLayer(String sourceLayer);

    ModelLayer visibility(Expression visibility);

    ModelLayer visibility(Visibility visibility);
}

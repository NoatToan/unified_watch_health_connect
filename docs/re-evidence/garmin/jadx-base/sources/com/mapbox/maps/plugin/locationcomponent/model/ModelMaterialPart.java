package com.mapbox.maps.plugin.locationcomponent.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.HashMap;
import java.util.List;
import o13.p;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p13.u0;
import p13.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0007J\u001c\u0010#\u001a\u00020\"2\b\b\u0001\u0010\n\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007R,\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R,\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR,\u0010\u001d\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016¨\u0006%"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/model/ModelMaterialPart;", "Lcom/mapbox/maps/plugin/locationcomponent/model/ModelPart;", "materialOverride", "", "(Ljava/lang/String;)V", "featureStateId", ModelSourceWrapper.MATERIAL_OVERRIDES, "", "(Ljava/lang/String;Ljava/util/List;)V", "value", TtmlNode.ATTR_TTS_COLOR, "getColor$annotations", "()V", "getColor", "()Ljava/lang/String;", "setColor", "", "colorMixIntensity", "getColorMixIntensity$annotations", "getColorMixIntensity", "()D", "setColorMixIntensity", "(D)V", "emissiveStrength", "getEmissiveStrength$annotations", "getEmissiveStrength", "setEmissiveStrength", "getMaterialOverrides", "()Ljava/util/List;", "opacity", "getOpacity$annotations", "getOpacity", "setOpacity", "resetColor", "", "updateColor", "", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public class ModelMaterialPart extends ModelPart {
    private String color;
    private double colorMixIntensity;
    private double emissiveStrength;
    private final List<String> materialOverrides;
    private double opacity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelMaterialPart(String str, List<String> list) {
        super(str);
        str.getClass();
        list.getClass();
        this.materialOverrides = list;
        this.color = AnimatableModel.DEFAULT_COLOR;
        this.opacity = 1.0d;
    }

    @MapboxExperimental
    public static /* synthetic */ void getColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorMixIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmissiveStrength$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacity$annotations() {
    }

    public static /* synthetic */ void updateColor$default(ModelMaterialPart modelMaterialPart, int i14, double d14, int i15, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: updateColor");
            return;
        }
        if ((i15 & 2) != 0) {
            d14 = 1.0d;
        }
        modelMaterialPart.updateColor(i14, d14);
    }

    public final String getColor() {
        return this.color;
    }

    public final double getColorMixIntensity() {
        return this.colorMixIntensity;
    }

    public final double getEmissiveStrength() {
        return this.emissiveStrength;
    }

    public final List<String> getMaterialOverrides() {
        return this.materialOverrides;
    }

    public final double getOpacity() {
        return this.opacity;
    }

    @MapboxExperimental
    public final void resetColor() {
        setColorMixIntensity(0.0d);
    }

    public final void setColor(String str) {
        str.getClass();
        this.color = str;
        getUpdateFeatureState().invoke(new Value((HashMap<String, Value>) u0.d(new p(getFeatureStateId() + "-color", new Value(str)))));
    }

    public final void setColorMixIntensity(double d14) {
        this.colorMixIntensity = d14;
        getUpdateFeatureState().invoke(new Value((HashMap<String, Value>) u0.d(new p(getFeatureStateId() + "-color-mix-intensity", new Value(d14)))));
    }

    public final void setEmissiveStrength(double d14) {
        this.emissiveStrength = d14;
        getUpdateFeatureState().invoke(new Value((HashMap<String, Value>) u0.d(new p(getFeatureStateId() + "-emission", new Value(d14)))));
    }

    public final void setOpacity(double d14) {
        this.opacity = d14;
        getUpdateFeatureState().invoke(new Value((HashMap<String, Value>) u0.d(new p(getFeatureStateId() + "-opacity", new Value(d14)))));
    }

    @MapboxExperimental
    public final void updateColor(int color, double colorMixIntensity) {
        setColor(ColorUtils.INSTANCE.colorToRgbaString(color));
        setColorMixIntensity(colorMixIntensity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelMaterialPart(String str) {
        this(str, w.c(str));
        str.getClass();
    }
}

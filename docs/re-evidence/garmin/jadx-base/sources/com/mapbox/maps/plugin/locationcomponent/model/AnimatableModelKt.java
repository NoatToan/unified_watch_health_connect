package com.mapbox.maps.plugin.locationcomponent.model;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPlugin;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, d2 = {"createAnimatableModel", "Lcom/mapbox/maps/plugin/locationcomponent/model/AnimatableModel;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPlugin;", "modelUri", "", "modelParts", "", "Lcom/mapbox/maps/plugin/locationcomponent/model/ModelPart;", "plugin-locationcomponent_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AnimatableModelKt {
    @MapboxExperimental
    public static final AnimatableModel createAnimatableModel(LocationComponentPlugin locationComponentPlugin, String str, List<? extends ModelPart> list) {
        locationComponentPlugin.getClass();
        str.getClass();
        list.getClass();
        AnimatableModel animatableModel = new AnimatableModel(str, list);
        ((LocationComponentPluginImpl) locationComponentPlugin).bindToAnimatableModel$plugin_locationcomponent_release(animatableModel);
        return animatableModel;
    }
}

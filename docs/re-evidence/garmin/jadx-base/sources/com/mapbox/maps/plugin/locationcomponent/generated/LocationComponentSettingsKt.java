package com.mapbox.maps.plugin.locationcomponent.generated;

import com.mapbox.maps.plugin.LocationPuck;
import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/LocationPuck;", "locationPuck", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "", "initializer", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "LocationComponentSettings", "(Lcom/mapbox/maps/plugin/LocationPuck;Le23/l;)Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentSettingsKt {
    public static final /* synthetic */ LocationComponentSettings LocationComponentSettings(LocationPuck locationPuck, l lVar) {
        locationPuck.getClass();
        lVar.getClass();
        LocationComponentSettings.Builder builder = new LocationComponentSettings.Builder(locationPuck);
        lVar.invoke(builder);
        return builder.build();
    }
}

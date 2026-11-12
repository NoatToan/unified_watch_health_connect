package com.mapbox.maps.debugoptions;

import com.mapbox.maps.MapDebugOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"nativeDebugOptions", "", "Lcom/mapbox/maps/MapDebugOptions;", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "getNativeDebugOptions", "(Ljava/util/Set;)Ljava/util/Set;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapViewDebugOptionsKt {
    public static final Set<MapDebugOptions> getNativeDebugOptions(Set<MapViewDebugOptions> set) {
        MapDebugOptions mapDebugOptionsValueOf;
        set.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            try {
                mapDebugOptionsValueOf = MapDebugOptions.valueOf(((MapViewDebugOptions) it.next()).getName$maps_sdk_release());
            } catch (Exception unused) {
                mapDebugOptionsValueOf = null;
            }
            if (mapDebugOptionsValueOf != null) {
                arrayList.add(mapDebugOptionsValueOf);
            }
        }
        return h0.g1(arrayList);
    }
}

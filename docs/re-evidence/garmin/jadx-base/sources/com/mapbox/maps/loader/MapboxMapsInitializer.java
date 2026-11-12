package com.mapbox.maps.loader;

import com.mapbox.common.BaseMapboxInitializer;
import zd.b;

/* JADX INFO: loaded from: classes3.dex */
public class MapboxMapsInitializer extends BaseMapboxInitializer<MapboxMaps> {
    @Override // com.mapbox.common.BaseMapboxInitializer
    public Class<? extends b<MapboxMaps>> getInitializerClass() {
        return MapboxMapsInitializerImpl.class;
    }
}

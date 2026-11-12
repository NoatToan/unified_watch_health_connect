package com.mapbox.maps.loader;

import android.content.Context;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.MapboxConstants;
import java.util.ArrayList;
import java.util.List;
import zd.b;

/* JADX INFO: loaded from: classes3.dex */
public class MapboxMapsInitializerImpl implements b<MapboxMaps> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.b
    public MapboxMaps create(Context context) {
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(MapboxConstants.MAP_SHARED_LIBRARY_NAME);
        return MapboxMaps.INSTANCE;
    }

    @Override // zd.b
    public List<Class<? extends b<?>>> dependencies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MapboxSDKCommonInitializerImpl.class);
        return arrayList;
    }
}

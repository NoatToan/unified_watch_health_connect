package com.mapbox.maps;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/MapRecorderOptions$Builder;", "", "block", "Lcom/mapbox/maps/MapRecorderOptions;", "mapRecorderOptions", "(Le23/l;)Lcom/mapbox/maps/MapRecorderOptions;", "Lcom/mapbox/maps/MapPlayerOptions$Builder;", "Lcom/mapbox/maps/MapPlayerOptions;", "mapPlayerOptions", "(Le23/l;)Lcom/mapbox/maps/MapPlayerOptions;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapRecorderKt {
    public static final MapPlayerOptions mapPlayerOptions(e23.l<? super MapPlayerOptions.Builder, Unit> lVar) {
        lVar.getClass();
        MapPlayerOptions.Builder builder = new MapPlayerOptions.Builder();
        lVar.invoke(builder);
        MapPlayerOptions mapPlayerOptionsBuild = builder.build();
        mapPlayerOptionsBuild.getClass();
        return mapPlayerOptionsBuild;
    }

    public static final MapRecorderOptions mapRecorderOptions(e23.l<? super MapRecorderOptions.Builder, Unit> lVar) {
        lVar.getClass();
        MapRecorderOptions.Builder builder = new MapRecorderOptions.Builder();
        lVar.invoke(builder);
        MapRecorderOptions mapRecorderOptionsBuild = builder.build();
        mapRecorderOptionsBuild.getClass();
        return mapRecorderOptionsBuild;
    }
}

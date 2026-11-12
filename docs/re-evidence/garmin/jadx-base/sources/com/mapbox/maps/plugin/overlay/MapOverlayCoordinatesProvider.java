package com.mapbox.maps.plugin.overlay;

import com.mapbox.geojson.Point;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/plugin/overlay/MapOverlayCoordinatesProvider;", "", "getShownCoordinates", "", "Lcom/mapbox/geojson/Point;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapOverlayCoordinatesProvider {
    List<Point> getShownCoordinates();
}

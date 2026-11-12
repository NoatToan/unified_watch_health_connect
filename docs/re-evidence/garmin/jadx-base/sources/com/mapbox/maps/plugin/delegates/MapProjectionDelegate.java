package com.mapbox.maps.plugin.delegates;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ProjectedMeters;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapProjectionDelegate;", "", "coordinateForProjectedMeters", "Lcom/mapbox/geojson/Point;", "projectedMeters", "Lcom/mapbox/maps/ProjectedMeters;", "getMetersPerPixelAtLatitude", "", "latitude", "zoom", "project", "Lcom/mapbox/maps/MercatorCoordinate;", "point", "zoomScale", "projectedMetersForCoordinate", "unproject", "coordinate", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapProjectionDelegate {
    Point coordinateForProjectedMeters(ProjectedMeters projectedMeters);

    double getMetersPerPixelAtLatitude(double latitude);

    double getMetersPerPixelAtLatitude(double latitude, double zoom);

    MercatorCoordinate project(Point point, double zoomScale);

    ProjectedMeters projectedMetersForCoordinate(Point point);

    Point unproject(MercatorCoordinate coordinate, double zoomScale);
}

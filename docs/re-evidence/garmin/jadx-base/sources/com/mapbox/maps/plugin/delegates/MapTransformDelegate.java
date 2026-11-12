package com.mapbox.maps.plugin.delegates;

import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.ConstrainMode;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.NorthOrientation;
import com.mapbox.maps.Size;
import com.mapbox.maps.ViewportMode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H&¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "", "getMapOptions", "Lcom/mapbox/maps/MapOptions;", "getSize", "Lcom/mapbox/maps/Size;", "isGestureInProgress", "", "isUserAnimationInProgress", "setCameraAnimationHint", "", "cameraAnimationHint", "Lcom/mapbox/maps/CameraAnimationHint;", "setConstrainMode", "constrainMode", "Lcom/mapbox/maps/ConstrainMode;", "setGestureInProgress", "inProgress", "setNorthOrientation", "northOrientation", "Lcom/mapbox/maps/NorthOrientation;", "setUserAnimationInProgress", "setViewportMode", "viewportMode", "Lcom/mapbox/maps/ViewportMode;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapTransformDelegate {
    MapOptions getMapOptions();

    Size getSize();

    boolean isGestureInProgress();

    boolean isUserAnimationInProgress();

    @MapboxExperimental
    void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint);

    void setConstrainMode(ConstrainMode constrainMode);

    void setGestureInProgress(boolean inProgress);

    void setNorthOrientation(NorthOrientation northOrientation);

    void setUserAnimationInProgress(boolean inProgress);

    void setViewportMode(ViewportMode viewportMode);
}

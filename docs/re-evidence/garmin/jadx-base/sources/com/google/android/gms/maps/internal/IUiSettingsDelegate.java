package com.google.android.gms.maps.internal;

import android.os.IInterface;

/* JADX INFO: loaded from: classes14.dex */
public interface IUiSettingsDelegate extends IInterface {
    boolean isCompassEnabled();

    boolean isIndoorLevelPickerEnabled();

    boolean isMapToolbarEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isScrollGesturesEnabledDuringRotateOrZoom();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z14);

    void setCompassEnabled(boolean z14);

    void setIndoorLevelPickerEnabled(boolean z14);

    void setMapToolbarEnabled(boolean z14);

    void setMyLocationButtonEnabled(boolean z14);

    void setRotateGesturesEnabled(boolean z14);

    void setScrollGesturesEnabled(boolean z14);

    void setScrollGesturesEnabledDuringRotateOrZoom(boolean z14);

    void setTiltGesturesEnabled(boolean z14);

    void setZoomControlsEnabled(boolean z14);

    void setZoomGesturesEnabled(boolean z14);
}

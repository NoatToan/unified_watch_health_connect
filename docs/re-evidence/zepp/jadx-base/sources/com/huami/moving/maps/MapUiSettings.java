package com.huami.moving.maps;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0002H&J\b\u0010\u0018\u001a\u00020\u0002H&J\b\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\u0002H&J\b\u0010\u001c\u001a\u00020\u0002H&J\b\u0010\u001d\u001a\u00020\u0002H&J\b\u0010\u001e\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u0002H&J\b\u0010 \u001a\u00020\u0013H&J\b\u0010!\u001a\u00020\u0013H&J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0013H&J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0013H&J\u0010\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0013H&J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00132\u0006\u0010(\u001a\u00020&H&J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010+\u001a\u00020\u0002H&¨\u0006,"}, d2 = {"Lcom/huami/moving/maps/MapUiSettings;", "", "", "isIndoorSwitchEnabled", "enable", "", "setIndoorSwitchEnabled", "isIndoorLevelPickerEnabled", "setIndoorLevelPickerEnabled", "setScaleControlsEnabled", "setZoomControlsEnabled", "setCompassEnabled", "setMyLocationButtonEnabled", "setScrollGesturesEnabled", "setZoomGesturesEnabled", "setTiltGesturesEnabled", "setRotateGesturesEnabled", "setAllGesturesEnabled", "setMapToolbarEnabled", "", "position", "setLogoPosition", "setZoomPosition", "isScaleControlsEnabled", "isZoomControlsEnabled", "isCompassEnabled", "isMyLocationButtonEnabled", "isScrollGesturesEnabled", "isZoomGesturesEnabled", "isTiltGesturesEnabled", "isRotateGesturesEnabled", "isMapToolbarEnabled", "getLogoPosition", "getZoomPosition", "setZoomInByScreenCenter", "margin", "setLogoBottomMargin", "setLogoLeftMargin", "", "getLogoMarginRate", "rate", "setLogoMarginRate", "setGestureScaleByMapCenter", "isGestureScaleByMapCenter", "moving_release"}, k = 1, mv = {1, 5, 1})
public interface MapUiSettings {
    float getLogoMarginRate(int margin);

    int getLogoPosition();

    int getZoomPosition();

    boolean isCompassEnabled();

    boolean isGestureScaleByMapCenter();

    boolean isIndoorLevelPickerEnabled();

    boolean isIndoorSwitchEnabled();

    boolean isMapToolbarEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScaleControlsEnabled();

    boolean isScrollGesturesEnabled();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean enable);

    void setCompassEnabled(boolean enable);

    void setGestureScaleByMapCenter(boolean enable);

    void setIndoorLevelPickerEnabled(boolean enable);

    void setIndoorSwitchEnabled(boolean enable);

    void setLogoBottomMargin(int margin);

    void setLogoLeftMargin(int margin);

    void setLogoMarginRate(int margin, float rate);

    void setLogoPosition(int position);

    void setMapToolbarEnabled(boolean enable);

    void setMyLocationButtonEnabled(boolean enable);

    void setRotateGesturesEnabled(boolean enable);

    void setScaleControlsEnabled(boolean enable);

    void setScrollGesturesEnabled(boolean enable);

    void setTiltGesturesEnabled(boolean enable);

    void setZoomControlsEnabled(boolean enable);

    void setZoomGesturesEnabled(boolean enable);

    void setZoomInByScreenCenter(boolean enable);

    void setZoomPosition(int position);
}

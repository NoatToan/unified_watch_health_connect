package com.huami.moving.maps.gaode;

import com.amap.api.maps.UiSettings;
import com.huami.moving.maps.MapUiSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0014H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0014H\u0016J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00142\u0006\u0010(\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\u0006\u0010,\u001a\u00020\u0005R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/huami/moving/maps/gaode/GaodeUiSettings;", "Lcom/huami/moving/maps/MapUiSettings;", "", "isIndoorSwitchEnabled", "enable", "", "setIndoorSwitchEnabled", "isIndoorLevelPickerEnabled", "setIndoorLevelPickerEnabled", "setScaleControlsEnabled", "setZoomControlsEnabled", "setCompassEnabled", "setMyLocationButtonEnabled", "setScrollGesturesEnabled", "setZoomGesturesEnabled", "setTiltGesturesEnabled", "setRotateGesturesEnabled", "isMapToolbarEnabled", "setAllGesturesEnabled", "setMapToolbarEnabled", "", "position", "setLogoPosition", "setZoomPosition", "isScaleControlsEnabled", "isZoomControlsEnabled", "isCompassEnabled", "isMyLocationButtonEnabled", "isScrollGesturesEnabled", "isZoomGesturesEnabled", "isTiltGesturesEnabled", "isRotateGesturesEnabled", "getLogoPosition", "getZoomPosition", "setZoomInByScreenCenter", "margin", "setLogoBottomMargin", "setLogoLeftMargin", "", "getLogoMarginRate", "rate", "setLogoMarginRate", "setGestureScaleByMapCenter", "isGestureScaleByMapCenter", "hideGaodeLogo", "Lcom/amap/api/maps/UiSettings;", "a", "Lcom/amap/api/maps/UiSettings;", "settings", "<init>", "(Lcom/amap/api/maps/UiSettings;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GaodeUiSettings implements MapUiSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UiSettings settings;

    public GaodeUiSettings(@NotNull UiSettings uiSettings) {
        this.settings = uiSettings;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public float getLogoMarginRate(int margin) {
        return this.settings.getLogoMarginRate(margin);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public int getLogoPosition() {
        return this.settings.getLogoPosition();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public int getZoomPosition() {
        return this.settings.getZoomPosition();
    }

    public final void hideGaodeLogo() {
        this.settings.setLogoLeftMargin(-100);
        this.settings.setLogoBottomMargin(-100);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isCompassEnabled() {
        return this.settings.isCompassEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isGestureScaleByMapCenter() {
        return this.settings.isGestureScaleByMapCenter();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isIndoorLevelPickerEnabled() {
        return false;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isIndoorSwitchEnabled() {
        return this.settings.isIndoorSwitchEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isMapToolbarEnabled() {
        return false;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isMyLocationButtonEnabled() {
        return this.settings.isMyLocationButtonEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isRotateGesturesEnabled() {
        return this.settings.isRotateGesturesEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isScaleControlsEnabled() {
        return this.settings.isScaleControlsEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isScrollGesturesEnabled() {
        return this.settings.isScrollGesturesEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isTiltGesturesEnabled() {
        return this.settings.isTiltGesturesEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isZoomControlsEnabled() {
        return this.settings.isZoomControlsEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isZoomGesturesEnabled() {
        return this.settings.isZoomGesturesEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setAllGesturesEnabled(boolean enable) {
        this.settings.setAllGesturesEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setCompassEnabled(boolean enable) {
        this.settings.setCompassEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setGestureScaleByMapCenter(boolean enable) {
        this.settings.setGestureScaleByMapCenter(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setIndoorLevelPickerEnabled(boolean enable) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setIndoorSwitchEnabled(boolean enable) {
        this.settings.setIndoorSwitchEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoBottomMargin(int margin) {
        this.settings.setLogoBottomMargin(margin);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoLeftMargin(int margin) {
        this.settings.setLogoLeftMargin(margin);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoMarginRate(int margin, float rate) {
        this.settings.setLogoMarginRate(margin, rate);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoPosition(int position) {
        this.settings.setLogoPosition(position);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setMapToolbarEnabled(boolean enable) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setMyLocationButtonEnabled(boolean enable) {
        this.settings.setMyLocationButtonEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setRotateGesturesEnabled(boolean enable) {
        this.settings.setRotateGesturesEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setScaleControlsEnabled(boolean enable) {
        this.settings.setScaleControlsEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setScrollGesturesEnabled(boolean enable) {
        this.settings.setScrollGesturesEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setTiltGesturesEnabled(boolean enable) {
        this.settings.setTiltGesturesEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setZoomControlsEnabled(boolean enable) {
        this.settings.setZoomControlsEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setZoomGesturesEnabled(boolean enable) {
        this.settings.setZoomGesturesEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setZoomInByScreenCenter(boolean enable) {
        this.settings.setZoomInByScreenCenter(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setZoomPosition(int position) {
        this.settings.setZoomPosition(position);
    }
}

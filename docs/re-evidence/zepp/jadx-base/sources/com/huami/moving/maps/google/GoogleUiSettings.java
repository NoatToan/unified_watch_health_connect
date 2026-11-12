package com.huami.moving.maps.google;

import com.google.android.gms.maps.UiSettings;
import com.huami.moving.maps.MapUiSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0013H\u0016J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00132\u0006\u0010(\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/huami/moving/maps/google/GoogleUiSettings;", "Lcom/huami/moving/maps/MapUiSettings;", "", "isIndoorSwitchEnabled", "enable", "", "setIndoorSwitchEnabled", "isIndoorLevelPickerEnabled", "setIndoorLevelPickerEnabled", "setScaleControlsEnabled", "setZoomControlsEnabled", "setCompassEnabled", "setMyLocationButtonEnabled", "setScrollGesturesEnabled", "setZoomGesturesEnabled", "setTiltGesturesEnabled", "setRotateGesturesEnabled", "setAllGesturesEnabled", "setMapToolbarEnabled", "", "position", "setLogoPosition", "setZoomPosition", "isScaleControlsEnabled", "isZoomControlsEnabled", "isCompassEnabled", "isMyLocationButtonEnabled", "isScrollGesturesEnabled", "isZoomGesturesEnabled", "isTiltGesturesEnabled", "isRotateGesturesEnabled", "isMapToolbarEnabled", "getLogoPosition", "getZoomPosition", "setZoomInByScreenCenter", "margin", "setLogoBottomMargin", "setLogoLeftMargin", "", "getLogoMarginRate", "rate", "setLogoMarginRate", "setGestureScaleByMapCenter", "isGestureScaleByMapCenter", "Lcom/google/android/gms/maps/UiSettings;", "a", "Lcom/google/android/gms/maps/UiSettings;", "settings", "<init>", "(Lcom/google/android/gms/maps/UiSettings;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GoogleUiSettings implements MapUiSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UiSettings settings;

    public GoogleUiSettings(@NotNull UiSettings uiSettings) {
        this.settings = uiSettings;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public float getLogoMarginRate(int margin) {
        return 0.0f;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public int getLogoPosition() {
        return 0;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public int getZoomPosition() {
        return 0;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isCompassEnabled() {
        return this.settings.isCompassEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isGestureScaleByMapCenter() {
        return false;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isIndoorLevelPickerEnabled() {
        return this.settings.isIndoorLevelPickerEnabled();
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isIndoorSwitchEnabled() {
        return false;
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public boolean isMapToolbarEnabled() {
        return this.settings.isMapToolbarEnabled();
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
        return false;
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
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setIndoorLevelPickerEnabled(boolean enable) {
        this.settings.setIndoorLevelPickerEnabled(enable);
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setIndoorSwitchEnabled(boolean enable) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoBottomMargin(int margin) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoLeftMargin(int margin) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoMarginRate(int margin, float rate) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setLogoPosition(int position) {
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setMapToolbarEnabled(boolean enable) {
        this.settings.setMapToolbarEnabled(enable);
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
    }

    @Override // com.huami.moving.maps.MapUiSettings
    public void setZoomPosition(int position) {
    }
}

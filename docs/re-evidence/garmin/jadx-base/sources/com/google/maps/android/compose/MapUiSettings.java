package com.google.maps.android.compose;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016Jj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, d2 = {"Lcom/google/maps/android/compose/MapUiSettings;", "", "compassEnabled", "", "indoorLevelPickerEnabled", "mapToolbarEnabled", "myLocationButtonEnabled", "rotationGesturesEnabled", "scrollGesturesEnabled", "scrollGesturesEnabledDuringRotateOrZoom", "tiltGesturesEnabled", "zoomControlsEnabled", "zoomGesturesEnabled", "<init>", "(ZZZZZZZZZZ)V", "getCompassEnabled", "()Z", "getIndoorLevelPickerEnabled", "getMapToolbarEnabled", "getMyLocationButtonEnabled", "getRotationGesturesEnabled", "getScrollGesturesEnabled", "getScrollGesturesEnabledDuringRotateOrZoom", "getTiltGesturesEnabled", "getZoomControlsEnabled", "getZoomGesturesEnabled", "toString", "", "equals", "other", "hashCode", "", "copy", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapUiSettings {
    public static final int $stable = 0;
    private final boolean compassEnabled;
    private final boolean indoorLevelPickerEnabled;
    private final boolean mapToolbarEnabled;
    private final boolean myLocationButtonEnabled;
    private final boolean rotationGesturesEnabled;
    private final boolean scrollGesturesEnabled;
    private final boolean scrollGesturesEnabledDuringRotateOrZoom;
    private final boolean tiltGesturesEnabled;
    private final boolean zoomControlsEnabled;
    private final boolean zoomGesturesEnabled;

    public /* synthetic */ MapUiSettings(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? true : z15, (i14 & 4) != 0 ? true : z16, (i14 & 8) != 0 ? true : z17, (i14 & 16) != 0 ? true : z18, (i14 & 32) != 0 ? true : z19, (i14 & 64) != 0 ? true : z24, (i14 & 128) != 0 ? true : z25, (i14 & 256) != 0 ? true : z26, (i14 & 512) != 0 ? true : z27);
    }

    public static /* synthetic */ MapUiSettings copy$default(MapUiSettings mapUiSettings, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = mapUiSettings.compassEnabled;
        }
        if ((i14 & 2) != 0) {
            z15 = mapUiSettings.indoorLevelPickerEnabled;
        }
        if ((i14 & 4) != 0) {
            z16 = mapUiSettings.mapToolbarEnabled;
        }
        if ((i14 & 8) != 0) {
            z17 = mapUiSettings.myLocationButtonEnabled;
        }
        if ((i14 & 16) != 0) {
            z18 = mapUiSettings.rotationGesturesEnabled;
        }
        if ((i14 & 32) != 0) {
            z19 = mapUiSettings.scrollGesturesEnabled;
        }
        if ((i14 & 64) != 0) {
            z24 = mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom;
        }
        if ((i14 & 128) != 0) {
            z25 = mapUiSettings.tiltGesturesEnabled;
        }
        if ((i14 & 256) != 0) {
            z26 = mapUiSettings.zoomControlsEnabled;
        }
        if ((i14 & 512) != 0) {
            z27 = mapUiSettings.zoomGesturesEnabled;
        }
        boolean z28 = z26;
        boolean z29 = z27;
        boolean z34 = z24;
        boolean z35 = z25;
        boolean z36 = z18;
        boolean z37 = z19;
        return mapUiSettings.copy(z14, z15, z16, z17, z36, z37, z34, z35, z28, z29);
    }

    public final MapUiSettings copy(boolean compassEnabled, boolean indoorLevelPickerEnabled, boolean mapToolbarEnabled, boolean myLocationButtonEnabled, boolean rotationGesturesEnabled, boolean scrollGesturesEnabled, boolean scrollGesturesEnabledDuringRotateOrZoom, boolean tiltGesturesEnabled, boolean zoomControlsEnabled, boolean zoomGesturesEnabled) {
        return new MapUiSettings(compassEnabled, indoorLevelPickerEnabled, mapToolbarEnabled, myLocationButtonEnabled, rotationGesturesEnabled, scrollGesturesEnabled, scrollGesturesEnabledDuringRotateOrZoom, tiltGesturesEnabled, zoomControlsEnabled, zoomGesturesEnabled);
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapUiSettings)) {
            return false;
        }
        MapUiSettings mapUiSettings = (MapUiSettings) other;
        return this.compassEnabled == mapUiSettings.compassEnabled && this.indoorLevelPickerEnabled == mapUiSettings.indoorLevelPickerEnabled && this.mapToolbarEnabled == mapUiSettings.mapToolbarEnabled && this.myLocationButtonEnabled == mapUiSettings.myLocationButtonEnabled && this.rotationGesturesEnabled == mapUiSettings.rotationGesturesEnabled && this.scrollGesturesEnabled == mapUiSettings.scrollGesturesEnabled && this.scrollGesturesEnabledDuringRotateOrZoom == mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom && this.tiltGesturesEnabled == mapUiSettings.tiltGesturesEnabled && this.zoomControlsEnabled == mapUiSettings.zoomControlsEnabled && this.zoomGesturesEnabled == mapUiSettings.zoomGesturesEnabled;
    }

    public final boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    public final boolean getIndoorLevelPickerEnabled() {
        return this.indoorLevelPickerEnabled;
    }

    public final boolean getMapToolbarEnabled() {
        return this.mapToolbarEnabled;
    }

    public final boolean getMyLocationButtonEnabled() {
        return this.myLocationButtonEnabled;
    }

    public final boolean getRotationGesturesEnabled() {
        return this.rotationGesturesEnabled;
    }

    public final boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public final boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.scrollGesturesEnabledDuringRotateOrZoom;
    }

    public final boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public final boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    public final boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.compassEnabled), Boolean.valueOf(this.indoorLevelPickerEnabled), Boolean.valueOf(this.mapToolbarEnabled), Boolean.valueOf(this.myLocationButtonEnabled), Boolean.valueOf(this.rotationGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabledDuringRotateOrZoom), Boolean.valueOf(this.tiltGesturesEnabled), Boolean.valueOf(this.zoomControlsEnabled), Boolean.valueOf(this.zoomGesturesEnabled));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MapUiSettings(compassEnabled=");
        sb3.append(this.compassEnabled);
        sb3.append(", indoorLevelPickerEnabled=");
        sb3.append(this.indoorLevelPickerEnabled);
        sb3.append(", mapToolbarEnabled=");
        sb3.append(this.mapToolbarEnabled);
        sb3.append(", myLocationButtonEnabled=");
        sb3.append(this.myLocationButtonEnabled);
        sb3.append(", rotationGesturesEnabled=");
        sb3.append(this.rotationGesturesEnabled);
        sb3.append(", scrollGesturesEnabled=");
        sb3.append(this.scrollGesturesEnabled);
        sb3.append(", scrollGesturesEnabledDuringRotateOrZoom=");
        sb3.append(this.scrollGesturesEnabledDuringRotateOrZoom);
        sb3.append(", tiltGesturesEnabled=");
        sb3.append(this.tiltGesturesEnabled);
        sb3.append(", zoomControlsEnabled=");
        sb3.append(this.zoomControlsEnabled);
        sb3.append(", zoomGesturesEnabled=");
        return am.j.t(sb3, this.zoomGesturesEnabled, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public MapUiSettings(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27) {
        this.compassEnabled = z14;
        this.indoorLevelPickerEnabled = z15;
        this.mapToolbarEnabled = z16;
        this.myLocationButtonEnabled = z17;
        this.rotationGesturesEnabled = z18;
        this.scrollGesturesEnabled = z19;
        this.scrollGesturesEnabledDuringRotateOrZoom = z24;
        this.tiltGesturesEnabled = z25;
        this.zoomControlsEnabled = z26;
        this.zoomGesturesEnabled = z27;
    }

    public MapUiSettings() {
        this(false, false, false, false, false, false, false, false, false, false, 1023, null);
    }
}

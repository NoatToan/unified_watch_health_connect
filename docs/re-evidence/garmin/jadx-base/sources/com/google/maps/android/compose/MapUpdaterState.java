package com.google.maps.android.compose;

import c2.h2;
import com.google.android.gms.maps.LocationSource;
import p005kotlin.Metadata;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u00106\"\u0004\b7\u00108R/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/google/maps/android/compose/MapUpdaterState;", "", "", "mergeDescendants", "", "contentDescription", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "Lc2/h2;", "contentPadding", "Lcom/google/android/gms/maps/LocationSource;", "locationSource", "Lcom/google/maps/android/compose/MapProperties;", "mapProperties", "Lcom/google/maps/android/compose/MapUiSettings;", "mapUiSettings", "", "mapColorScheme", "<init>", "(ZLjava/lang/String;Lcom/google/maps/android/compose/CameraPositionState;Lc2/h2;Lcom/google/android/gms/maps/LocationSource;Lcom/google/maps/android/compose/MapProperties;Lcom/google/maps/android/compose/MapUiSettings;Ljava/lang/Integer;)V", "<set-?>", "mergeDescendants$delegate", "Lp3/p1;", "getMergeDescendants", "()Z", "setMergeDescendants", "(Z)V", "contentDescription$delegate", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "cameraPositionState$delegate", "getCameraPositionState", "()Lcom/google/maps/android/compose/CameraPositionState;", "setCameraPositionState", "(Lcom/google/maps/android/compose/CameraPositionState;)V", "contentPadding$delegate", "getContentPadding", "()Lc2/h2;", "setContentPadding", "(Lc2/h2;)V", "locationSource$delegate", "getLocationSource", "()Lcom/google/android/gms/maps/LocationSource;", "setLocationSource", "(Lcom/google/android/gms/maps/LocationSource;)V", "mapProperties$delegate", "getMapProperties", "()Lcom/google/maps/android/compose/MapProperties;", "setMapProperties", "(Lcom/google/maps/android/compose/MapProperties;)V", "mapUiSettings$delegate", "getMapUiSettings", "()Lcom/google/maps/android/compose/MapUiSettings;", "setMapUiSettings", "(Lcom/google/maps/android/compose/MapUiSettings;)V", "mapColorScheme$delegate", "getMapColorScheme", "()Ljava/lang/Integer;", "setMapColorScheme", "(Ljava/lang/Integer;)V", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapUpdaterState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: cameraPositionState$delegate, reason: from kotlin metadata */
    private final p1 cameraPositionState;

    /* JADX INFO: renamed from: contentDescription$delegate, reason: from kotlin metadata */
    private final p1 contentDescription;

    /* JADX INFO: renamed from: contentPadding$delegate, reason: from kotlin metadata */
    private final p1 contentPadding;

    /* JADX INFO: renamed from: locationSource$delegate, reason: from kotlin metadata */
    private final p1 locationSource;

    /* JADX INFO: renamed from: mapColorScheme$delegate, reason: from kotlin metadata */
    private final p1 mapColorScheme;

    /* JADX INFO: renamed from: mapProperties$delegate, reason: from kotlin metadata */
    private final p1 mapProperties;

    /* JADX INFO: renamed from: mapUiSettings$delegate, reason: from kotlin metadata */
    private final p1 mapUiSettings;

    /* JADX INFO: renamed from: mergeDescendants$delegate, reason: from kotlin metadata */
    private final p1 mergeDescendants;

    public MapUpdaterState(boolean z14, String str, CameraPositionState cameraPositionState, h2 h2Var, LocationSource locationSource, MapProperties mapProperties, MapUiSettings mapUiSettings, Integer num) {
        cameraPositionState.getClass();
        h2Var.getClass();
        mapProperties.getClass();
        mapUiSettings.getClass();
        this.mergeDescendants = p3.p0.n(Boolean.valueOf(z14));
        this.contentDescription = p3.p0.n(str);
        this.cameraPositionState = p3.p0.n(cameraPositionState);
        this.contentPadding = p3.p0.n(h2Var);
        this.locationSource = p3.p0.n(locationSource);
        this.mapProperties = p3.p0.n(mapProperties);
        this.mapUiSettings = p3.p0.n(mapUiSettings);
        this.mapColorScheme = p3.p0.n(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraPositionState getCameraPositionState() {
        return (CameraPositionState) this.cameraPositionState.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getContentDescription() {
        return (String) this.contentDescription.getF182175a();
    }

    public final h2 getContentPadding() {
        return (h2) this.contentPadding.getF182175a();
    }

    public final LocationSource getLocationSource() {
        return (LocationSource) this.locationSource.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getMapColorScheme() {
        return (Integer) this.mapColorScheme.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MapProperties getMapProperties() {
        return (MapProperties) this.mapProperties.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MapUiSettings getMapUiSettings() {
        return (MapUiSettings) this.mapUiSettings.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getMergeDescendants() {
        return ((Boolean) this.mergeDescendants.getF182175a()).booleanValue();
    }

    public final void setCameraPositionState(CameraPositionState cameraPositionState) {
        cameraPositionState.getClass();
        this.cameraPositionState.setValue(cameraPositionState);
    }

    public final void setContentDescription(String str) {
        this.contentDescription.setValue(str);
    }

    public final void setContentPadding(h2 h2Var) {
        h2Var.getClass();
        this.contentPadding.setValue(h2Var);
    }

    public final void setLocationSource(LocationSource locationSource) {
        this.locationSource.setValue(locationSource);
    }

    public final void setMapColorScheme(Integer num) {
        this.mapColorScheme.setValue(num);
    }

    public final void setMapProperties(MapProperties mapProperties) {
        mapProperties.getClass();
        this.mapProperties.setValue(mapProperties);
    }

    public final void setMapUiSettings(MapUiSettings mapUiSettings) {
        mapUiSettings.getClass();
        this.mapUiSettings.setValue(mapUiSettings);
    }

    public final void setMergeDescendants(boolean z14) {
        this.mergeDescendants.setValue(Boolean.valueOf(z14));
    }
}

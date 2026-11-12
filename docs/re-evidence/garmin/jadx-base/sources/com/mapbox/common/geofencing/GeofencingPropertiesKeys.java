package com.mapbox.common.geofencing;

import com.mapbox.annotation.MapboxExperimental;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mapbox/common/geofencing/GeofencingPropertiesKeys;", "", "()V", "DWELL_TIME_KEY", "", "POINT_RADIUS_KEY", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeofencingPropertiesKeys {
    public static final String DWELL_TIME_KEY = "MBX_GEOFENCE_DWELL_TIME";
    public static final GeofencingPropertiesKeys INSTANCE = new GeofencingPropertiesKeys();
    public static final String POINT_RADIUS_KEY = "MBX_GEOFENCE_POINT_RADIUS";

    private GeofencingPropertiesKeys() {
    }
}

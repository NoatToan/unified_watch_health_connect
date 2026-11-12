package com.mapbox.maps.plugin.locationcomponent;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentConstants;", "", "()V", "ACCURACY_RADIUS_ANIMATION_DURATION", "", "BEARING_ICON", "", "COMPASS_UPDATE_RATE_MS", "DEFAULT_FASTEST_INTERVAL_MILLIS", "DEFAULT_INTERVAL_MILLIS", "DEFAULT_MINIMUM_DISPLACEMENT_METERS", "", "DEFAULT_TRACKING_PADDING_ANIM_DURATION", "DEFAULT_TRACKING_TILT_ANIM_DURATION", "DEFAULT_TRACKING_ZOOM_ANIM_DURATION", "INSTANT_LOCATION_TRANSITION_THRESHOLD", "", "LOCATION_INDICATOR_LAYER", "MAX_ANIMATION_DURATION_MS", "MODEL_LAYER", "MODEL_SOURCE", "PULSING_MAX_RADIUS_FOLLOW_ACCURACY", "SHADOW_ICON", "TOP_ICON", "TRANSITION_ANIMATION_DURATION_MS", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentConstants {
    public static final long ACCURACY_RADIUS_ANIMATION_DURATION = 250;
    public static final String BEARING_ICON = "mapbox-location-bearing-icon";
    public static final long COMPASS_UPDATE_RATE_MS = 500;
    public static final long DEFAULT_FASTEST_INTERVAL_MILLIS = 1000;
    public static final long DEFAULT_INTERVAL_MILLIS = 1000;
    public static final float DEFAULT_MINIMUM_DISPLACEMENT_METERS = 0.1f;
    public static final long DEFAULT_TRACKING_PADDING_ANIM_DURATION = 750;
    public static final long DEFAULT_TRACKING_TILT_ANIM_DURATION = 1250;
    public static final long DEFAULT_TRACKING_ZOOM_ANIM_DURATION = 750;
    public static final LocationComponentConstants INSTANCE = new LocationComponentConstants();
    public static final double INSTANT_LOCATION_TRANSITION_THRESHOLD = 50000.0d;
    public static final String LOCATION_INDICATOR_LAYER = "mapbox-location-indicator-layer";
    public static final long MAX_ANIMATION_DURATION_MS = 2000;
    public static final String MODEL_LAYER = "mapbox-location-model-layer";
    public static final String MODEL_SOURCE = "mapbox-location-model-source";
    public static final float PULSING_MAX_RADIUS_FOLLOW_ACCURACY = -1.0f;
    public static final String SHADOW_ICON = "mapbox-location-shadow-icon";
    public static final String TOP_ICON = "mapbox-location-top-icon";
    public static final long TRANSITION_ANIMATION_DURATION_MS = 750;

    private LocationComponentConstants() {
    }
}

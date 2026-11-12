package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public enum DeviceLocationProviderType {
    BEST,
    ANDROID,
    GOOGLE_PLAY_SERVICES;

    private int getValue() {
        return ordinal();
    }
}

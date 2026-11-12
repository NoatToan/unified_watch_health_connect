package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationServiceObserver {
    void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    void onAvailabilityChanged(boolean z14);

    void onPermissionStatusChanged(PermissionStatus permissionStatus);
}

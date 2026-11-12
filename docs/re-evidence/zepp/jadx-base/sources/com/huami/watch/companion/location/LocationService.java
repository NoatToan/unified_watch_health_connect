package com.huami.watch.companion.location;

/* JADX INFO: loaded from: classes16.dex */
public interface LocationService {
    void cancelLocation();

    Location getLastLocation();

    void optionLocationService(LocationOption locationOption);

    void registerLocationListener(LocationListener locationListener);

    void startLocation();

    void stopLocation();
}

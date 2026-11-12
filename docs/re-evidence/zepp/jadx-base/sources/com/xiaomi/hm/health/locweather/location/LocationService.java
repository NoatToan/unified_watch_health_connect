package com.xiaomi.hm.health.locweather.location;

/* JADX INFO: loaded from: classes21.dex */
public interface LocationService {
    void cancelLocation();

    MyLocation getLastLocation();

    void optionLocationService(LocationOption locationOption);

    void registerLocationListener(LocationListener locationListener);

    void startLocation();

    void stopLocation();
}

package com.huami.mifit.sportlib.observer;

import com.huami.mifit.sportlib.model.GPSPoint;

/* JADX INFO: loaded from: classes11.dex */
public interface IServiceSportObserver {
    void onDeviceStatusChanged(boolean z, boolean z2);

    void onGPSSignalChanged(int i);

    void onInaccuracyLocationChanged(GPSPoint gPSPoint);

    void onScreenStatusChanged(String str, String str2);
}

package com.huawei.healthcloud.plugintrack.manager.inteface;

/* JADX INFO: loaded from: classes2.dex */
public interface IMapViewListener {
    void pauseSport(int i);

    void resumeSport(int i);

    void startSport();

    void stopSport(boolean z);

    void updateGpsStatus(int i);

    void updateSportStatusWhenLockScreen(int i);
}

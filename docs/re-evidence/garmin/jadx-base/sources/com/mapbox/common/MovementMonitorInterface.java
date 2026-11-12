package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface MovementMonitorInterface {
    void getMovementInfo(MovementInfoCallback movementInfoCallback);

    void registerObserver(MovementModeObserver movementModeObserver);

    void setMovementInfo(MovementInfo movementInfo);

    void unregisterObserver(MovementModeObserver movementModeObserver);
}

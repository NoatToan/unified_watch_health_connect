package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface MovementModeObserver {
    void onMovementModeChanged(MovementInfo movementInfo);

    void onMovementModeError(String str);
}

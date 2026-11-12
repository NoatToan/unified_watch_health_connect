package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface LifecycleMonitorInterface {
    void getLifecycleState(GetLifecycleStateCallback getLifecycleStateCallback);

    void getMonitoringState(GetLifecycleMonitoringStateCallback getLifecycleMonitoringStateCallback);

    void registerObserver(LifecycleObserver lifecycleObserver);

    void unregisterObserver(LifecycleObserver lifecycleObserver);
}

package com.xiaomi.wearable.gpsalgorithm.api;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.wearable.gpsalgorithm.data.MapRotationData;
import com.xiaomi.wearable.gpsalgorithm.listener.AutoPauseCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IFitnessSportAlgo {
    default int autoPauseGetState() {
        return 0;
    }

    default void autoPauseHandle(float f, float f2, float f3) {
    }

    Location computeSportInfoByGps(Location location);

    Location computeSportInfoBySteps(long j, long j2);

    default int dynamicFeedLocation(double d, double d2) {
        return 0;
    }

    default void dynamicFree() {
    }

    default void dynamicInit(double d, double d2, int i) {
    }

    default void finishAutoPause() {
    }

    default ArrayList<MapRotationData> getDynamicRotationList() {
        return null;
    }

    default int getRouteMatchResult() {
        return 0;
    }

    void notifySportStateChanged(int i, int i2);

    default void progressRouteMatch(Location location) {
    }

    default void setStandardRoute(List<Location> list) {
    }

    default void startAutoPause(AutoPauseCallback autoPauseCallback) {
    }

    default void startRouteMatch() {
    }
}

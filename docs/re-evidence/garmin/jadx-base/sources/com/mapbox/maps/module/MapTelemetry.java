package com.mapbox.maps.module;

import android.os.Bundle;
import com.mapbox.common.TelemetryUtils;

/* JADX INFO: loaded from: classes3.dex */
public interface MapTelemetry {
    void disableTelemetrySession();

    default boolean getUserTelemetryRequestState() {
        return TelemetryUtils.getEventsCollectionState();
    }

    void onAppUserTurnstileEvent();

    void onPerformanceEvent(Bundle bundle);

    void setUserTelemetryRequestState(boolean z14);
}

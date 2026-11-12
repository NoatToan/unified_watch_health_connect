package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
public interface TelemetryUtilsResponseCallback {
    void run(Expected<EventsServiceError, None> expected);
}

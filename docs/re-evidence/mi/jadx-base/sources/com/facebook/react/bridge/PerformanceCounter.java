package com.facebook.react.bridge;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface PerformanceCounter {
    Map<String, Long> getPerformanceCounters();

    void profileNextBatch();
}

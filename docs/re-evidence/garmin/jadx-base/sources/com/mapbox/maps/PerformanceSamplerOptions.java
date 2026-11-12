package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum PerformanceSamplerOptions {
    CUMULATIVE_RENDERING_STATS,
    PER_FRAME_RENDERING_STATS;

    private int getValue() {
        return ordinal();
    }
}

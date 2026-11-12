package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum ResourceLoadFlags {
    NONE(0),
    CRITICAL(1),
    ACCEPT_EXPIRED(2),
    FORCE_LOAD(4),
    SKIP_DATA_LOADING(8),
    SKIP_DATA_TRANSFER(24),
    FORCE_EXPIRED(32),
    SKIP_DECOMPRESSION(64),
    CHECK_INTEGRITY(128);

    public final int value;

    ResourceLoadFlags(int i14) {
        this.value = i14;
    }

    private int getValue() {
        return this.value;
    }
}

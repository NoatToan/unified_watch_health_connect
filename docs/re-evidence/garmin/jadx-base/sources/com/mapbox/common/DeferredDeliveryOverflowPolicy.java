package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum DeferredDeliveryOverflowPolicy {
    DISCARD_INCOMING,
    RETIRE_OLDEST;

    private int getValue() {
        return ordinal();
    }
}

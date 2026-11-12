package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum NetworkRestriction {
    NONE(0),
    DISALLOW_EXPENSIVE(1),
    DISALLOW_ALL(255);

    public final int value;

    NetworkRestriction(int i14) {
        this.value = i14;
    }

    private int getValue() {
        return this.value;
    }
}

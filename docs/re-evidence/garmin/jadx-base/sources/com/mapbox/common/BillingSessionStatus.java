package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum BillingSessionStatus {
    SESSION_ACTIVE("SessionActive"),
    SESSION_PAUSED("SessionPaused"),
    NO_SESSION("NoSession");

    private String str;

    BillingSessionStatus(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}

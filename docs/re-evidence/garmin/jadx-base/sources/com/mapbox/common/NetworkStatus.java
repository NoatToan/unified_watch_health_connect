package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum NetworkStatus {
    NOT_REACHABLE("NotReachable"),
    REACHABLE_VIA_WI_FI("ReachableViaWiFi"),
    REACHABLE_VIA_ETHERNET("ReachableViaEthernet"),
    REACHABLE_VIA_WWAN("ReachableViaWWAN");

    private String str;

    NetworkStatus(String str) {
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

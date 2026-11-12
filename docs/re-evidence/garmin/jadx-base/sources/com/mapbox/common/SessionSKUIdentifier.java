package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum SessionSKUIdentifier {
    NAV2_SES_TRIP("Nav2SesTrip"),
    NAV2_SES_FDTRIP("Nav2SesFDTrip"),
    NAV3_SES_UX_AGTRIP("Nav3SesUxAGTrip"),
    NAV3_SES_UX_FDTRIP("Nav3SesUxFDTrip"),
    NAV3_SES_CORE_AGTRIP("Nav3SesCoreAGTrip"),
    NAV3_SES_CORE_FDTRIP("Nav3SesCoreFDTrip");

    private String str;

    SessionSKUIdentifier(String str) {
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

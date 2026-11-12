package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public enum LocationErrorCode {
    NONE("None"),
    NOT_READY("NotReady"),
    NOT_AVAILABLE("NotAvailable"),
    ACCESS_DENIED("AccessDenied"),
    INVALID_ARGUMENT("InvalidArgument"),
    FAILED_TO_DETECT_LOCATION("FailedToDetectLocation"),
    COMMUNICATION_FAILURE("CommunicationFailure"),
    CANCELLED("Cancelled"),
    NOT_SUPPORTED("NotSupported"),
    UNKNOWN("Unknown");

    private String str;

    LocationErrorCode(String str) {
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

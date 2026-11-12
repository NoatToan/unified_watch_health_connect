package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum EventsServiceErrorCode {
    NO_TOKEN("NoToken"),
    NO_USER_AGENT("NoUserAgent"),
    NOT_FOUND("NotFound"),
    UNAUTHORIZED("Unauthorized"),
    INVALID_PAYLOAD("InvalidPayload"),
    LARGE_PAYLOAD("LargePayload"),
    MULTI_STATUS("MultiStatus"),
    BAD_REQUEST("BadRequest"),
    TIMEOUT("Timeout"),
    INVALID_ENDPOINT("InvalidEndpoint"),
    MALFORMED_EVENT("MalformedEvent"),
    HTTP_ERROR("HttpError"),
    EVENTS_DISABLED("EventsDisabled"),
    IOERROR("IOError");

    private String str;

    EventsServiceErrorCode(String str) {
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

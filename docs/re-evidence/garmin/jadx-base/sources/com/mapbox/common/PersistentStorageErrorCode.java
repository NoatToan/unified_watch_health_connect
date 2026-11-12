package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum PersistentStorageErrorCode {
    KEY_ALREADY_EXISTS,
    KEY_NOT_FOUND,
    CORRUPTED_DATA,
    IOERROR,
    UNKNOWN;

    private int getValue() {
        return ordinal();
    }
}

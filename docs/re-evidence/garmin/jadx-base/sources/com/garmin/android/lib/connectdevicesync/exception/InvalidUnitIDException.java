package com.garmin.android.lib.connectdevicesync.exception;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes11.dex */
public class InvalidUnitIDException extends Exception {
    public InvalidUnitIDException(long j8) {
        super(e.e(j8, "Invalid unit ID "));
    }

    public InvalidUnitIDException() {
        super("Empty mac address.");
    }
}

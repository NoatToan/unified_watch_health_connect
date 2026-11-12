package com.garmin.io.cobs;

import it2.a;

/* JADX INFO: loaded from: classes10.dex */
public class CobsDecodeException extends Exception {
    private final a mFailure;

    public CobsDecodeException(a aVar) {
        super("Cobs decode failed: " + aVar.name());
        this.mFailure = aVar;
    }

    public a failure() {
        return this.mFailure;
    }
}

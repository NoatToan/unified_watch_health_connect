package com.garmin.android.lib.connectdevicesync.exception;

import wb2.h;

/* JADX INFO: loaded from: classes11.dex */
public class ServerProcessingTimeoutException extends ServerException {
    public ServerProcessingTimeoutException(String str) {
        super(h.SERVER_PROCESS_TIMEOUT, str);
    }
}

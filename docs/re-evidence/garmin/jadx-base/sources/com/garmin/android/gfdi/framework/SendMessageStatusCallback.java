package com.garmin.android.gfdi.framework;

/* JADX INFO: loaded from: classes8.dex */
public interface SendMessageStatusCallback {

    public enum Status {
        OK,
        FAILED,
        NOT_SUPPORTED
    }

    void onSendResult(Status status);
}

package com.xiaomi.continuity.messagecenter;

/* JADX INFO: loaded from: classes7.dex */
public enum ResultCode {
    UNKNOWN(-9999),
    PUBLISH_CONTENT_ERROR(-4, "Publish message error"),
    NO_ONLINE_DEVICE(-3, "No online device"),
    INVOKE_AUTH_FAILED(-2, "No permission to call this method"),
    ERROR(-1, "Error"),
    SUCCESS(0, "Success"),
    SEND_MESSAGE_RELIABLE_ARRIVE_CODE(1, "Reliable arrive"),
    SEND_MESSAGE_UNRELIABLE_ARRIVE_CODE(2, "Already send，not guaranteed whether the peer receives ");

    private String mMessage;
    private int mResultCode;

    ResultCode(int i) {
        this.mResultCode = i;
        this.mMessage = name();
    }

    public static ResultCode fromInt(int i) {
        for (ResultCode resultCode : values()) {
            if (resultCode.mResultCode == i) {
                return resultCode;
            }
        }
        return UNKNOWN;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    ResultCode(int i, String str) {
        this.mResultCode = i;
        this.mMessage = str;
    }
}

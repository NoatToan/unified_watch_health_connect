package com.garmin.android.gfdi.framework;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/garmin/android/gfdi/framework/MessageStatus;", "", "()V", "ACK", "", "COBS_DECODER_ERROR", "CRC_ERROR", "LENGTH_ERROR", "NAK", "UNKNOWN_OR_NOT_SUPPORTED", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MessageStatus {
    public static final int ACK = 0;
    public static final int COBS_DECODER_ERROR = 3;
    public static final int CRC_ERROR = 4;
    public static final MessageStatus INSTANCE = new MessageStatus();
    public static final int LENGTH_ERROR = 5;
    public static final int NAK = 1;
    public static final int UNKNOWN_OR_NOT_SUPPORTED = 2;

    private MessageStatus() {
    }
}

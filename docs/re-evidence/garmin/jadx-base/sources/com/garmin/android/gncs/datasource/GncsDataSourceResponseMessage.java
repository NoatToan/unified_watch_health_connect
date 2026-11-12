package com.garmin.android.gncs.datasource;

import android.util.SparseArray;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class GncsDataSourceResponseMessage {
    private static final int PAYLOAD_END = 1;
    private static final int RESPONSE_LENGTH = 1;
    private static final int RESPONSE_OFFSET = 0;
    private final byte[] frame;

    public enum ResponseType {
        TRANSFER_SUCCESSFUL(0),
        RESEND_LAST_DATA_PACKET(1),
        ABORT_REQUEST(2),
        ERROR_CRC_MISMATCH(3),
        ERROR_DATA_OFFSET_MISMATCH(4);

        private static final SparseArray<ResponseType> dictionary = new SparseArray<>(values().length);
        private final int value;

        static {
            for (ResponseType responseType : values()) {
                dictionary.put(responseType.value, responseType);
            }
        }

        ResponseType(int i14) {
            this.value = i14;
        }

        public static ResponseType getResponseType(int i14) {
            return dictionary.get(i14);
        }

        public byte getValue() {
            return (byte) this.value;
        }
    }

    public GncsDataSourceResponseMessage(byte[] bArr) {
        this.frame = bArr;
    }

    public byte getResponse() {
        return this.frame[0];
    }

    public void setResponse(ResponseType responseType) {
        if (responseType != null) {
            setResponse(responseType.getValue());
        }
    }

    public String toString() {
        ResponseType responseType = ResponseType.getResponseType(getResponse());
        return String.format(Locale.getDefault(), "[gncs data source response] msg id: %1$d, length: %2$d, response: %3$d (%4$s)", Integer.valueOf(GncsDataSourceMessage.MESSAGE_ID), Integer.valueOf(this.frame.length), Byte.valueOf(getResponse()), responseType != null ? responseType.name() : "???");
    }

    public void setResponse(byte b14) {
        this.frame[0] = b14;
    }
}

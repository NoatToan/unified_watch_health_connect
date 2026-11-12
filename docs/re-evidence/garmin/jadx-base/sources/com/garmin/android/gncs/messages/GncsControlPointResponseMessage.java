package com.garmin.android.gncs.messages;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes11.dex */
public class GncsControlPointResponseMessage {

    public enum ResponseType {
        SUCCESSFUL(0),
        ANCS_ERROR_OCCURRED(1),
        INVALID_PARAMETERS(2);

        private static final SparseArray<ResponseType> lookupByValue = new SparseArray<>(values().length);
        private final byte value;

        static {
            for (ResponseType responseType : values()) {
                lookupByValue.put(responseType.value, responseType);
            }
        }

        ResponseType(int i14) {
            this.value = (byte) i14;
        }

        public static ResponseType getResponseType(byte b14) {
            return lookupByValue.get(b14);
        }

        public byte getValue() {
            return this.value;
        }
    }
}

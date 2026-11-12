package com.garmin.android.gncs.messages;

import android.util.SparseArray;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class NotificationServiceSubscriptionResponseMessage {
    private static final int FEATURE_FLAGS_LENGTH = 1;
    private static final int FEATURE_FLAGS_OFFSET = 2;
    private static final int INTENT_LENGTH = 1;
    private static final int INTENT_OFFSET = 1;
    private static final int MESSAGE_LENGTH = 3;
    private static final int PAYLOAD_END = 3;
    private static final int RESPONSE_OFFSET = 0;
    private static final int RESPONSE_STATUS_LENGTH = 1;
    private static final int TOTAL_RESPONSE_LENGTH = 3;
    private final byte[] frame = new byte[3];

    public enum IntentType {
        UNSUBSCRIBE(0),
        SUBSCRIBE(1);

        private static final SparseArray<IntentType> dictionary = new SparseArray<>(values().length);
        private final int value;

        static {
            for (IntentType intentType : values()) {
                dictionary.put(intentType.value, intentType);
            }
        }

        IntentType(int i14) {
            this.value = i14;
        }

        public static IntentType getIntentType(int i14) {
            return dictionary.get(i14);
        }

        public byte getValue() {
            return (byte) this.value;
        }
    }

    public enum ResponseType {
        SUCCESSFUL(0),
        UNSUCCESSFUL_NOT_SUPPORTED(1),
        UNSUCCESSFUL_NOT_READY(2);

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

    private byte getFeatureFlags() {
        return this.frame[2];
    }

    public byte getIntent() {
        return this.frame[1];
    }

    public byte[] getPayload() {
        return this.frame;
    }

    public byte getResponse() {
        return this.frame[0];
    }

    public void setFeatureFlags(byte b14) {
        this.frame[2] = b14;
    }

    public void setIntent(IntentType intentType) {
        if (intentType != null) {
            setIntent(intentType.getValue());
        }
    }

    public void setPhoneNumberFeatureAvailable(boolean z14) {
        byte featureFlags = getFeatureFlags();
        setFeatureFlags((byte) (z14 ? NotificationServiceSubscriptionMessage.getPhoneNumberFeatureFlag() | featureFlags : (~NotificationServiceSubscriptionMessage.getPhoneNumberFeatureFlag()) & featureFlags));
    }

    public void setResponse(ResponseType responseType) {
        if (responseType != null) {
            setResponse(responseType.getValue());
        }
    }

    public String toString() {
        ResponseType responseType = ResponseType.getResponseType(getResponse());
        return String.format(Locale.getDefault(), "[notification service subscription response] msg id: %1$d, length: %2$d, response: %3$d (%4$s)", Integer.valueOf(NotificationServiceSubscriptionMessage.MESSAGE_ID), Integer.valueOf(this.frame.length), Byte.valueOf(getResponse()), responseType != null ? responseType.name() : "???");
    }

    public void setIntent(byte b14) {
        this.frame[1] = b14;
    }

    public void setResponse(byte b14) {
        this.frame[0] = b14;
    }
}

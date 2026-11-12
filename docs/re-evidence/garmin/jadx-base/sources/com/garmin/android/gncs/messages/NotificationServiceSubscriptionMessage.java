package com.garmin.android.gncs.messages;

import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class NotificationServiceSubscriptionMessage {
    private static final int FIXED_MESSAGE_LENGTH = 2;
    private static final int FIXED_PAYLOAD_END = 2;
    private static final int FLAG_LENGTH = 1;
    private static final int FLAG_OFFSET = 1;
    private static final byte FLAG_UNAVAILABLE = 0;
    private static final int FUTURE_FEATURE_1 = 2;
    private static final int FUTURE_FEATURE_2 = 4;
    private static final int FUTURE_FEATURE_3 = 8;
    private static final int FUTURE_FEATURE_4 = 16;
    private static final int FUTURE_FEATURE_5 = 32;
    private static final int FUTURE_FEATURE_6 = 32;
    private static final int INTENT_INDICATOR_LENGTH = 1;
    private static final int INTENT_INDICATOR_OFFSET = 0;
    public static final int MESSAGE_ID = 5036;
    private static final int PHONE_NUMBER_FEATURE = 1;
    private final byte[] frame;

    public enum IntentIndicator {
        UNSUBSCRIBE,
        SUBSCRIBE
    }

    public enum PhoneNumberSubscription {
        UNAVAILABLE,
        AVAILABLE
    }

    public NotificationServiceSubscriptionMessage(byte[] bArr) {
        this.frame = bArr;
        getFeatureFlags();
        getIntentIndicator();
    }

    public static int getPhoneNumberFeatureFlag() {
        return 1;
    }

    public byte getFeatureFlags() {
        byte[] bArr = this.frame;
        if (bArr.length > 1) {
            return bArr[1];
        }
        return (byte) 0;
    }

    public byte getIntentIndicator() {
        return this.frame[0];
    }

    public boolean isPhoneNumberSupportAvailable() {
        return (getFeatureFlags() & 1) == 1;
    }

    public boolean isSubscribing() {
        return IntentIndicator.SUBSCRIBE.ordinal() == getIntentIndicator();
    }

    public void setIntentIndicator(IntentIndicator intentIndicator) {
        if (intentIndicator == null) {
            intentIndicator = IntentIndicator.UNSUBSCRIBE;
        }
        this.frame[0] = (byte) intentIndicator.ordinal();
    }

    public String toString() {
        return String.format(Locale.getDefault(), "[notification service subscription] msg id: %1$d, length: %2$d, intent indicator: %3$s (%4$s), Feature Flag: %5$s wants raw sms reply(%6$s)", Integer.valueOf(MESSAGE_ID), Integer.valueOf(this.frame.length), Byte.valueOf(getIntentIndicator()), Byte.valueOf(getFeatureFlags()), (isSubscribing() ? IntentIndicator.SUBSCRIBE : IntentIndicator.UNSUBSCRIBE).name(), (isPhoneNumberSupportAvailable() ? PhoneNumberSubscription.AVAILABLE : PhoneNumberSubscription.UNAVAILABLE).name());
    }
}

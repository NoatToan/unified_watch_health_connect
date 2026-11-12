package com.xiaomi.ai.domain.phonecall.common;

/* JADX INFO: loaded from: classes7.dex */
public enum ResponseStrategy {
    DEFAULT,
    MULTI_CONTACTS_BROWSE,
    MULTI_CONTACTS_STOP,
    MULTI_NUMBERS_BROWSE,
    MULTI_NUMBERS_STOP,
    MISS_APPELLATION_STOP,
    NO_TOAST_SPEAK_AFTER_SELECT_NUMBER,
    MATCH_RECENT_AND_CALL,
    HAS_SCREEN_DEVICE_SHOW_CONTACT_NUMBER;

    public static ResponseStrategy fromString(String str) {
        for (ResponseStrategy responseStrategy : values()) {
            if (responseStrategy.toString().equalsIgnoreCase(str)) {
                return responseStrategy;
            }
        }
        return DEFAULT;
    }
}

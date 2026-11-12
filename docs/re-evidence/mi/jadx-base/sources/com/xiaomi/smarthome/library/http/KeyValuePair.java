package com.xiaomi.smarthome.library.http;

/* JADX INFO: loaded from: classes2.dex */
public class KeyValuePair {
    private final String key;
    private final String value;

    public KeyValuePair(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Key may not be null");
        }
        this.key = str;
        this.value = str2;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
}

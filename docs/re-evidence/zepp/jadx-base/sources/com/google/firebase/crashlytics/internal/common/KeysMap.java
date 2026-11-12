package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class KeysMap {
    private final Map<String, String> a = new HashMap();
    private final int b;
    private final int c;

    public KeysMap(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private String a(String str) {
        if (str != null) {
            return sanitizeAttribute(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    @NonNull
    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        int i = this.c;
        return length > i ? strTrim.substring(0, i) : strTrim;
    }

    public synchronized void setKey(String str, String str2) {
        String strA = a(str);
        if (this.a.size() < this.b || this.a.containsKey(strA)) {
            this.a.put(strA, str2 == null ? "" : sanitizeAttribute(str2));
        } else {
            Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
        }
    }

    public synchronized void setKeys(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strA = a(entry.getKey());
            if (this.a.size() < this.b || this.a.containsKey(strA)) {
                String value = entry.getValue();
                this.a.put(strA, value == null ? "" : sanitizeAttribute(value));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Logger.getLogger().w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
        }
    }
}

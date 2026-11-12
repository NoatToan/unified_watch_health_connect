package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class UserMetadata {
    public static final int d = 64;
    public static final int e = 1024;
    public static final int f = 8192;
    private String a = null;
    private final KeysMap b = new KeysMap(64, 1024);
    private final KeysMap c = new KeysMap(64, 8192);

    @NonNull
    public Map<String, String> getCustomKeys() {
        return this.b.getKeys();
    }

    public Map<String, String> getInternalKeys() {
        return this.c.getKeys();
    }

    @Nullable
    public String getUserId() {
        return this.a;
    }

    public void setCustomKey(String str, String str2) {
        this.b.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.b.setKeys(map);
    }

    public void setInternalKey(String str, String str2) {
        this.c.setKey(str, str2);
    }

    public void setUserId(String str) {
        this.a = this.b.sanitizeAttribute(str);
    }
}

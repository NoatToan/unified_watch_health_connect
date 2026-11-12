package com.xiaomi.smarthome.cache.keystore;

/* JADX INFO: loaded from: classes4.dex */
public interface ICacheStore {
    boolean contains(String str);

    boolean getBoolean(String str, boolean z);

    String getString(String str, String str2);

    boolean putBoolean(String str, boolean z);

    boolean putString(String str, String str2);
}

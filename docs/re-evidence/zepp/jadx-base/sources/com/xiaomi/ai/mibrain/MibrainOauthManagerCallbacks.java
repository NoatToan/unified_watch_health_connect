package com.xiaomi.ai.mibrain;

/* JADX INFO: loaded from: classes18.dex */
public interface MibrainOauthManagerCallbacks {
    String getOauthCode();

    String getOauthData(String str);

    boolean putOauthData(String str, String str2);
}

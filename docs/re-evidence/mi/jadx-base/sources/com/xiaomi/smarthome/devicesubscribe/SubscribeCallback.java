package com.xiaomi.smarthome.devicesubscribe;

import com.xiaomi.smarthome.frame.Error;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public interface SubscribeCallback {
    void onFailure(Error error);

    void onReceive(String str, String str2, JSONArray jSONArray);

    void onSuccess(String str);
}

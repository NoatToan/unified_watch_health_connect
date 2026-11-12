package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface BleJsonParser<T> {
    T parse(JSONObject jSONObject) throws JSONException;
}

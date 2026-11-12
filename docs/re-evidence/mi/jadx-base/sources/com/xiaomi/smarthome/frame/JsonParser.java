package com.xiaomi.smarthome.frame;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface JsonParser<T> {
    T parse(JSONObject jSONObject) throws JSONException;
}

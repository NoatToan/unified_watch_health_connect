package com.xiaomi.smarthome.core.server.internal.apiparser;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface CoreJsonParser<T> {
    T parse(JSONObject jSONObject) throws JSONException;
}

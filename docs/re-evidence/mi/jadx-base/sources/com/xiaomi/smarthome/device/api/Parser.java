package com.xiaomi.smarthome.device.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface Parser<T> {
    public static final Parser<JSONObject> DEFAULT_PARSER = new Parser<JSONObject>() { // from class: com.xiaomi.smarthome.device.api.Parser.1
        @Override // com.xiaomi.smarthome.device.api.Parser
        public JSONObject parse(String str) throws JSONException {
            return new JSONObject(str);
        }
    };

    T parse(String str) throws JSONException;
}

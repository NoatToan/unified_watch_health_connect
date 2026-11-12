package com.mibi.sdk.component.recharge;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface RechargeMethodParser {
    RechargeMethod parse(String str, JSONObject jSONObject) throws JSONException;
}

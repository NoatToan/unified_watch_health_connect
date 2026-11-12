package com.huawei.health.knit.bff.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface IResourceRequestCallback {
    void onFailure(int i, String str);

    void onSuccess(JSONObject jSONObject);
}

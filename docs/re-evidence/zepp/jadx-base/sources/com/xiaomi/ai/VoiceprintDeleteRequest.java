package com.xiaomi.ai;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes18.dex */
public class VoiceprintDeleteRequest {
    public String family;
    public JSONArray ids = new JSONArray();
    public String vendorStr;

    public void addUserId(String str) {
        this.ids.put(str);
    }

    public void setFamily(String str) {
        this.family = str;
    }
}

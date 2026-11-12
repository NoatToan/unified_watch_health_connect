package com.xiaomi.ai;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class EventRequest {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g = true;
    public boolean h = false;
    public JSONObject i;

    public EventRequest(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public void addContext(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public void setAutoTts(boolean z) {
        this.g = z;
    }

    public void setDevice(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public void startNewSession() {
        this.h = true;
    }
}

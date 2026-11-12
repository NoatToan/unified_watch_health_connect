package com.xiaomi.clientreport.data;

import com.xiaomi.channel.commonutils.android.f;
import com.xiaomi.push.ae;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    private String a = ae.a();
    private String b = f.m3424a();
    private String c;
    public String clientInterfaceId;
    private String d;
    public int production;
    public int reportType;

    public String getPackageName() {
        return this.c;
    }

    public void setAppPackageName(String str) {
        this.c = str;
    }

    public void setSdkVersion(String str) {
        this.d = str;
    }

    public JSONObject toJson() {
        return new JSONObject();
    }

    public String toJsonString() {
        return null;
    }
}

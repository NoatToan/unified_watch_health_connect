package com.weibo.ssosdk;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class WeiboSsoSdkConfig implements Cloneable {
    private Context a;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private HashMap<String, String> i = new HashMap<>();
    private volatile boolean j = false;
    private volatile boolean k = false;

    private String a(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public void addExtra(String str, String str2) {
        this.i.put(str, str2);
    }

    public Object clone() {
        try {
            WeiboSsoSdkConfig weiboSsoSdkConfig = (WeiboSsoSdkConfig) super.clone();
            HashMap<String, String> map = new HashMap<>();
            for (Map.Entry<String, String> entry : weiboSsoSdkConfig.i.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            weiboSsoSdkConfig.i = map;
            return weiboSsoSdkConfig;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getAppKey(boolean z) {
        return z ? a(this.b) : this.b;
    }

    public Context getApplicationContext() {
        return this.a;
    }

    public String getExtraString(boolean z) {
        if (this.i.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.i.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
                return "";
            }
        }
        return z ? a(jSONObject.toString()) : jSONObject.toString();
    }

    public String getFrom(boolean z) {
        return z ? a(this.d) : this.d;
    }

    public synchronized boolean getIsWifiInfors() {
        return this.k;
    }

    public String getOldWm(boolean z) {
        return z ? a(this.f) : this.f;
    }

    public String getSmApiKey() {
        return this.h;
    }

    public String getSmid(boolean z) {
        return z ? a(this.c) : this.c;
    }

    public String getSub(boolean z) {
        return z ? a(this.g) : this.g;
    }

    public synchronized boolean getUserChoise() {
        return this.j;
    }

    public String getWm(boolean z) {
        return z ? a(this.e) : this.e;
    }

    public void setAppKey(String str) {
        this.b = str;
    }

    public void setContext(Context context) {
        this.a = context.getApplicationContext();
    }

    public void setFrom(String str) {
        this.d = str;
    }

    public synchronized void setIsWifiInfors(boolean z) {
        this.k = z;
    }

    public void setOldWm(String str) {
        this.f = str;
    }

    public void setSmApiKey(String str) {
        this.h = str;
    }

    public void setSmid(String str) {
        this.c = str;
    }

    public void setSub(String str) {
        this.g = str;
    }

    public synchronized void setUserChoise(boolean z) {
        this.j = z;
    }

    public void setWm(String str) {
        this.e = str;
    }

    public boolean verify() {
        return (this.a == null || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) ? false : true;
    }
}

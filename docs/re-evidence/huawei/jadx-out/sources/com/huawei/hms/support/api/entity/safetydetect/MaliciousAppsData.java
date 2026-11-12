package com.huawei.hms.support.api.entity.safetydetect;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class MaliciousAppsData {
    private int apkCategory;
    private String apkPackageName;
    private String apkSha256;

    public String toString() {
        return "MaliciousAppsData{apkPackageName='" + this.apkPackageName + "', apkCategory=" + this.apkCategory + ", apkSha256='" + this.apkSha256 + "'}";
    }

    public void setApkSha256(String str) {
        this.apkSha256 = str;
    }

    public void setApkPackageName(String str) {
        this.apkPackageName = str;
    }

    public void setApkCategory(int i) {
        this.apkCategory = i;
    }

    public String getApkSha256() {
        return this.apkSha256;
    }

    public String getApkPackageName() {
        return this.apkPackageName;
    }

    public int getApkCategory() {
        return this.apkCategory;
    }

    public MaliciousAppsData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.apkPackageName = jSONObject.optString("apkPackageName");
        this.apkCategory = jSONObject.optInt("apkCategory");
        this.apkSha256 = jSONObject.optString("apkSha256");
    }
}

package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes41.dex */
public class AdAssistEventRecord {
    private String eventType;
    private String promotedAppPkgName;
    private String requestId;
    private String siteId;
    private String slotId;
    private String time;

    public void setTime(String str) {
        this.time = str;
    }

    public void setSlotId(String str) {
        this.slotId = str;
    }

    public void setSiteId(String str) {
        this.siteId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setPromotedAppPkgName(String str) {
        this.promotedAppPkgName = str;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public String f() {
        return this.eventType;
    }

    public String e() {
        return this.siteId;
    }

    public String d() {
        return this.slotId;
    }

    public String c() {
        return this.promotedAppPkgName;
    }

    public String b() {
        return this.time;
    }

    public String a() {
        return this.requestId;
    }

    public AdAssistEventRecord(String str, String str2, String str3, String str4, String str5, String str6) {
        this.requestId = str;
        this.time = str2;
        this.promotedAppPkgName = str3;
        this.slotId = str4;
        this.siteId = str5;
        this.eventType = str6;
    }

    public AdAssistEventRecord() {
    }
}

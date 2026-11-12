package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class AdSlotMapRecord extends RecordBean {
    private int adClicked;
    private int adShown;
    private String content;
    private String contentId;
    private long endTime;
    private String pkgName;
    private String slotId;
    private long startTime;

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "endTime<?";
    }

    public String c() {
        return this.slotId;
    }

    public String e() {
        return this.pkgName;
    }

    public void b(int i) {
        this.adShown = i;
    }

    public String d() {
        return this.contentId;
    }

    public void a(int i) {
        this.adClicked = i;
    }

    public String a() {
        return this.content;
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.contentId = jSONObject.optString("contentid");
            this.content = jSONObject.toString();
            this.startTime = jSONObject.optLong("starttime");
            this.endTime = jSONObject.optLong("endtime");
        }
    }

    public AdSlotMapRecord(String str, String str2, JSONObject jSONObject) {
        this.pkgName = str;
        this.slotId = str2;
        c(jSONObject);
    }

    public AdSlotMapRecord() {
    }
}

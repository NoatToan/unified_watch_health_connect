package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;
import defpackage.axc;
import defpackage.axe;
import defpackage.axw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class MaterialSummaryRecord extends RecordBean {
    private String adType;
    private String contentId;
    private int height;
    private String pkgName;
    private String slotId;
    private long updateTime;
    private String urls;
    private int width;

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return 2592000000L;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "updateTime<?";
    }

    public int g() {
        return this.width;
    }

    public String j() {
        return this.urls;
    }

    public String c() {
        return this.slotId;
    }

    public String b() {
        return this.pkgName;
    }

    public int e() {
        return this.height;
    }

    public String d() {
        return this.contentId;
    }

    public String a() {
        return this.adType;
    }

    public MaterialSummaryRecord(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        this.pkgName = str;
        this.adType = str2;
        this.slotId = str3;
        this.contentId = str4;
        axw axwVarC = jSONObject != null ? "3".equals(jSONObject.optString("apiVer")) ? axe.c(jSONObject) : axc.c(jSONObject) : null;
        if (axwVarC != null) {
            this.width = axwVarC.c();
            this.height = axwVarC.b();
            this.urls = axwVarC.d();
        }
        this.updateTime = System.currentTimeMillis();
    }

    public MaterialSummaryRecord() {
    }
}

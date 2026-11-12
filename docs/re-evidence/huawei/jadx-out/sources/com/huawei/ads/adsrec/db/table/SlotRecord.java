package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class SlotRecord extends RecordBean {
    private String ad30;
    private String pkgName;
    private String slotId;
    private long updateTime;

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return 7776000000L;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "updateTime<?";
    }

    public String d() {
        return this.slotId;
    }

    public String c() {
        return this.pkgName;
    }

    public String a() {
        return this.ad30;
    }

    public SlotRecord(String str, JSONObject jSONObject) {
        this.updateTime = System.currentTimeMillis();
        this.pkgName = str;
        if (jSONObject != null) {
            this.slotId = jSONObject.optString("slotid");
            this.ad30 = jSONObject.toString();
        }
        this.updateTime = System.currentTimeMillis();
    }

    public SlotRecord() {
        this.updateTime = System.currentTimeMillis();
    }
}

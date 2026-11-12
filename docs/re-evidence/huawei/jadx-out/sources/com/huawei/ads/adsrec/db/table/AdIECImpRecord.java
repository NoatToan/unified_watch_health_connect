package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class AdIECImpRecord extends RecordBean {
    private String contentId;
    private long lastRecallTime;
    private long lastShowTime;
    private String pkgName;
    private int showCount;
    private long updateTime = System.currentTimeMillis();

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return 1296000000L;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "updateTime<?";
    }

    public int a() {
        return this.showCount;
    }

    public void e(String str) {
        this.pkgName = str;
    }

    public void b(long j) {
        this.updateTime = j;
    }

    public long b() {
        return this.lastRecallTime;
    }

    public void b(String str) {
        this.contentId = str;
    }

    public void d(long j) {
        this.lastShowTime = j;
    }

    public void a(int i) {
        this.showCount = i;
    }

    public String c() {
        return this.contentId;
    }
}

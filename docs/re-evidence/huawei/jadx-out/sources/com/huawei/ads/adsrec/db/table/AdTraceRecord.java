package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class AdTraceRecord extends RecordBean {
    private String adCreativeMaterialUrl;
    private String click;
    private String contentId;
    private String exposure;
    private String reserveStr;
    private Boolean sendToMedia;
    private String tradeMode;
    private String uniqueId;
    private long uptime;

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return 2592000000L;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "uptime<?";
    }

    public boolean h() {
        return this.sendToMedia.booleanValue();
    }

    public void f(String str) {
        this.uniqueId = str;
    }

    public String g() {
        return this.uniqueId;
    }

    public void d(String str) {
        this.tradeMode = str;
    }

    public String b() {
        return this.tradeMode;
    }

    public void b(String str) {
        this.exposure = str;
    }

    public String d() {
        return this.exposure;
    }

    public void a(String str) {
        this.contentId = str;
    }

    public String a() {
        return this.contentId;
    }

    public void c(String str) {
        this.click = str;
    }

    public String c() {
        return this.click;
    }

    public void a(boolean z) {
        this.sendToMedia = Boolean.valueOf(z);
    }

    public void e(String str) {
        this.adCreativeMaterialUrl = str;
    }

    public void c(long j) {
        this.uptime = j;
    }

    public String e() {
        return this.adCreativeMaterialUrl;
    }
}

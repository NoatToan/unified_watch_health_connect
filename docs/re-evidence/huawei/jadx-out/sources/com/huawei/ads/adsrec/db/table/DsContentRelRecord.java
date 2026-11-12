package com.huawei.ads.adsrec.db.table;

import com.huawei.ads.fund.anno.DataKeep;
import com.huawei.ads.fund.db.RecordBean;

/* JADX INFO: loaded from: classes4.dex */
@DataKeep
public class DsContentRelRecord extends RecordBean {
    private double adIntentScore;
    private double adMergedScore;
    private double adScore;
    private int adType;
    private String aes128EncryptEcpm;
    private String clientRequestId;
    private String contentId;
    private String dayIntentId1st;
    private String dayIntentId2nd;
    private String dspId;
    private String hostPkgName;
    private String industryId1st;
    private String industryId2nd;
    private int interactionType;
    private String mediaType;
    private String reqIntentId1st;
    private String reqIntentId2nd;
    private long updateTime;

    @Override // com.huawei.ads.fund.db.Table
    public long getMaxStoreTime() {
        return 1296000000L;
    }

    public String toString() {
        return "DsContentRelRecord{contentId='" + this.contentId + "', clientRequestId='" + this.clientRequestId + "', updateTime='" + this.updateTime + "', mediaType='" + this.mediaType + "', adScore=" + this.adScore + ", adIntentScore=" + this.adIntentScore + ", adMergedScore='" + this.adMergedScore + '}';
    }

    public String p() {
        return this.reqIntentId2nd;
    }

    public String r() {
        return this.reqIntentId1st;
    }

    public String n() {
        return this.mediaType;
    }

    public int m() {
        return this.interactionType;
    }

    public String k() {
        return this.industryId2nd;
    }

    public void l(String str) {
        this.reqIntentId2nd = str;
    }

    public String l() {
        return this.industryId1st;
    }

    public void m(String str) {
        this.reqIntentId1st = str;
    }

    public String o() {
        return this.hostPkgName;
    }

    public void j(String str) {
        this.mediaType = str;
    }

    public String i() {
        return this.dspId;
    }

    public void i(String str) {
        this.industryId2nd = str;
    }

    public String j() {
        return this.dayIntentId2nd;
    }

    public void g(String str) {
        this.industryId1st = str;
    }

    public String h() {
        return this.dayIntentId1st;
    }

    @Override // com.huawei.ads.fund.db.Table
    public String getExpireCleanWhereClause() {
        return "updateTime<?";
    }

    public void h(String str) {
        this.hostPkgName = str;
    }

    public String g() {
        return this.contentId;
    }

    public void f(String str) {
        this.dspId = str;
    }

    public String f() {
        return this.clientRequestId;
    }

    public void d(String str) {
        this.dayIntentId2nd = str;
    }

    public String c() {
        return this.aes128EncryptEcpm;
    }

    public void b(String str) {
        this.dayIntentId1st = str;
    }

    public int d() {
        return this.adType;
    }

    public void c(String str) {
        this.contentId = str;
    }

    public void b(double d) {
        this.adScore = d;
    }

    public double e() {
        return this.adScore;
    }

    public void a(String str) {
        this.clientRequestId = str;
    }

    public void b(int i) {
        this.interactionType = i;
    }

    public void d(double d) {
        this.adMergedScore = d;
    }

    public double a() {
        return this.adMergedScore;
    }

    public void e(String str) {
        this.aes128EncryptEcpm = str;
    }

    public void e(long j) {
        this.updateTime = j;
    }

    public void d(int i) {
        this.adType = i;
    }

    public void a(double d) {
        this.adIntentScore = d;
    }

    public double b() {
        return this.adIntentScore;
    }
}

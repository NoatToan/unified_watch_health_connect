package com.huawei.ads.adsrec.bean;

import com.huawei.ads.adsrec.IUtilCallback;
import com.huawei.ads.adsrec.db.table.DsContentRelRecord;
import com.huawei.ads.fund.anno.DataKeep;
import defpackage.awz;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
@DataKeep
public class SampleData {
    private String adIntentScore;
    private String adMergedScore;
    private String adScore;
    private int adType;
    private String bagId;
    private String cost7d;
    private String dayIntentId1st;
    private String dayIntentId2nd;
    private String dspId;
    private String ecpm;
    private String industryId1st;
    private String industryId2nd;
    private String interactionType;
    private String mediaType;
    private String reqIntentId1st;
    private String reqIntentId2nd;

    public SampleData(DsContentRelRecord dsContentRelRecord, double d) {
        IUtilCallback iUtilCallbackC = awz.c();
        if (iUtilCallbackC != null) {
            this.ecpm = iUtilCallbackC.aes128Decrypt(dsContentRelRecord.c());
        }
        this.adScore = String.valueOf(dsContentRelRecord.e());
        this.adIntentScore = String.valueOf(dsContentRelRecord.b());
        this.adMergedScore = String.valueOf(dsContentRelRecord.a());
        this.cost7d = String.valueOf(d);
        this.interactionType = String.valueOf(dsContentRelRecord.m());
        this.adType = dsContentRelRecord.d();
        this.dspId = dsContentRelRecord.i();
        this.industryId1st = dsContentRelRecord.l();
        this.industryId2nd = dsContentRelRecord.k();
        this.reqIntentId1st = dsContentRelRecord.r();
        this.reqIntentId2nd = dsContentRelRecord.p();
        this.dayIntentId1st = dsContentRelRecord.h();
        this.dayIntentId2nd = dsContentRelRecord.j();
        this.mediaType = dsContentRelRecord.n();
        this.bagId = UUID.randomUUID().toString();
    }

    public SampleData() {
    }
}

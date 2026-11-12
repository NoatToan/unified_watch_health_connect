package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.db.bean.a;

/* JADX INFO: loaded from: classes12.dex */
public class SdkExposureHistoryRecord extends a {
    public static final String CALLERPKG = "callerPkg";
    public static final String IMPTIME = "impTime";
    private String appId;
    private String callerPkg;
    private String creativeId;
    private String creativeUniqueId;
    private long impTime;
    private String slotId;

    public void e(String str) {
        this.callerPkg = str;
    }

    public void d(String str) {
        this.slotId = str;
    }

    public void c(String str) {
        this.creativeUniqueId = str;
    }

    public void b(String str) {
        this.creativeId = str;
    }

    public void a(String str) {
        this.appId = str;
    }

    public void a(long j) {
        this.impTime = j;
    }
}

package com.huawei.openalliance.ad.beans.tags;

import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes12.dex */
public class TagCfgModel {
    private String qryIntvl;
    private String rptMode;
    private String type;
    private String validT;

    public String d() {
        return dg.b(this.rptMode) ? "0" : this.rptMode;
    }

    public String c() {
        return dg.b(this.qryIntvl) ? "60" : this.qryIntvl;
    }

    public String b() {
        return dg.b(this.validT) ? "60" : this.validT;
    }

    public String a() {
        return this.type;
    }
}

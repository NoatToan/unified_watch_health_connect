package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class FidRequestBean extends BaseRequestBean {
    private String additional;
    private String fid;

    public void setFid(String str) {
        this.fid = str;
    }

    public void setAdditional(String str) {
        this.additional = str;
    }

    public String getFid() {
        return this.fid;
    }

    public String getAdditional() {
        return this.additional;
    }
}

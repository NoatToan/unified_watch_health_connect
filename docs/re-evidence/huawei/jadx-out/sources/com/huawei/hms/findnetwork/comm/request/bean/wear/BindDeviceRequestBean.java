package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class BindDeviceRequestBean extends BaseRequestBean {
    private String fid;
    private String secondaryPublicKey;
    private String srcTranId;

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public void setSrcTranId(String str) {
        this.srcTranId = str;
    }

    public void setSecondaryPublicKey(String str) {
        this.secondaryPublicKey = str;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public String getSrcTranId() {
        return this.srcTranId;
    }

    public String getSecondaryPublicKey() {
        return this.secondaryPublicKey;
    }

    public String getFid() {
        return this.fid;
    }
}

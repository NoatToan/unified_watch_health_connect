package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class ShareDeviceRequestBean extends BaseRequestBean {
    private String fid;
    private String publicKey;
    private String srcTranId;

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public void setSrcTranId(String str) {
        this.srcTranId = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public String getSrcTranId() {
        return this.srcTranId;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getFid() {
        return this.fid;
    }
}

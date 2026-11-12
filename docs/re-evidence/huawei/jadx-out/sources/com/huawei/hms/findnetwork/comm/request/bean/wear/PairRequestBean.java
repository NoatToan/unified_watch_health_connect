package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class PairRequestBean extends BaseRequestBean {
    private String srcTranId = "";
    private String msg = "";
    private String version = "";

    public void setVersion(String str) {
        this.version = str;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public void setSrcTranId(String str) {
        this.srcTranId = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String getVersion() {
        return this.version;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public String getSrcTranId() {
        return this.srcTranId;
    }

    public String getMsg() {
        return this.msg;
    }
}

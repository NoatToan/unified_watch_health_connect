package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;

/* JADX INFO: loaded from: classes33.dex */
public class PairResponseBean extends BaseRequestBean {
    private String msg;
    private String srcTranId;

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public void setSrcTranId(String str) {
        this.srcTranId = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    @Override // com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean
    public String getSrcTranId() {
        return this.srcTranId;
    }

    public String getMsg() {
        return this.msg;
    }
}

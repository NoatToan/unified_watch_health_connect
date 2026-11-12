package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class FidBatchRequestBean extends BaseRequestBean {
    private String additional;
    private List<String> fids;

    public void setFids(List<String> list) {
        this.fids = list;
    }

    public void setAdditional(String str) {
        this.additional = str;
    }

    public List<String> getFids() {
        return this.fids;
    }

    public String getAdditional() {
        return this.additional;
    }
}

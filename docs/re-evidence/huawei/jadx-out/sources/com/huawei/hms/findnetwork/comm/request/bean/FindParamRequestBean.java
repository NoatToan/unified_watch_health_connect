package com.huawei.hms.findnetwork.comm.request.bean;

import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class FindParamRequestBean extends SnRequestBean {
    private List<FindKeyParam> paramList;
    private String productId;
    private long registerTime;

    public FindParamRequestBean() {
    }

    public FindParamRequestBean(String str, String str2, long j, List<FindKeyParam> list) {
        this.connectTagSn = str;
        this.productId = str2;
        this.registerTime = j;
        this.paramList = list;
    }

    public void setRegisterTime(long j) {
        this.registerTime = j;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setParamList(List<FindKeyParam> list) {
        this.paramList = list;
    }

    public long getRegisterTime() {
        return this.registerTime;
    }

    public String getProductId() {
        return this.productId;
    }

    public List<FindKeyParam> getParamList() {
        return this.paramList;
    }
}

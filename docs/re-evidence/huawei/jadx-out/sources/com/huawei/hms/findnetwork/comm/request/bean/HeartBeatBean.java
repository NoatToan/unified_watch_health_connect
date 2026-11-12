package com.huawei.hms.findnetwork.comm.request.bean;

import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class HeartBeatBean {
    List<Integer> businessIdList;
    String sn;

    public void setSn(String str) {
        this.sn = str;
    }

    public void setBusinessIdList(List<Integer> list) {
        this.businessIdList = list;
    }

    public String getSn() {
        return this.sn;
    }

    public List<Integer> getBusinessIdList() {
        return this.businessIdList;
    }

    public HeartBeatBean(String str, List<Integer> list) {
        this.sn = str;
        this.businessIdList = list;
    }
}

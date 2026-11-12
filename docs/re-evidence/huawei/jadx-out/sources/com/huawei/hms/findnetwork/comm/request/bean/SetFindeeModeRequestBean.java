package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class SetFindeeModeRequestBean extends BaseRequestBean {
    private int duration;

    public void setFindeeModeTime(int i) {
        this.duration = i;
    }

    public int getFindeeModeTime() {
        return this.duration;
    }
}

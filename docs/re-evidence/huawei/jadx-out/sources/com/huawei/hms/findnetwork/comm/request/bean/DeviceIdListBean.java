package com.huawei.hms.findnetwork.comm.request.bean;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceIdListBean extends BaseRequestBean {
    List<String> deviceIdList;

    public void setDeviceIdList(List<String> list) {
        this.deviceIdList = list;
    }

    public List<String> getDeviceIdList() {
        return this.deviceIdList;
    }
}

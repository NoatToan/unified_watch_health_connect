package com.huawei.hms.findnetwork.comm.request.bean;

import com.huawei.hms.findnetwork.comm.request.option.OfflineBroadcastParam;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class SetPublicKeysRequestBean extends BaseRequestBean {
    private String countryCode;
    private List<OfflineBroadcastParam> publicKeys;

    public void setPublicKeys(List<OfflineBroadcastParam> list) {
        this.publicKeys = list;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public List<OfflineBroadcastParam> getPublicKeys() {
        return this.publicKeys;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public SetPublicKeysRequestBean(List<OfflineBroadcastParam> list) {
        this.publicKeys = list;
    }
}

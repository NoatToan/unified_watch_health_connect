package com.huawei.hms.findnetwork.comm.request.bean;

import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class TagDerivedKey {
    private List<PubKeyHash> mPubKeyList;
    private String pairingKeyData;
    private String sn;

    public void setSn(String str) {
        this.sn = str;
    }

    public void setPubKeyList(List<PubKeyHash> list) {
        this.mPubKeyList = list;
    }

    public void setPairingKeyData(String str) {
        this.pairingKeyData = str;
    }

    public String getSn() {
        return this.sn;
    }

    public List<PubKeyHash> getPubKeyList() {
        return this.mPubKeyList;
    }

    public String getPairingKeyData() {
        return this.pairingKeyData;
    }

    public TagDerivedKey(String str, List<PubKeyHash> list, String str2) {
        this.sn = str;
        this.mPubKeyList = list;
        this.pairingKeyData = str2;
    }
}

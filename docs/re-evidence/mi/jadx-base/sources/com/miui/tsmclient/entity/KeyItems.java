package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class KeyItems extends CommonResponseInfo {

    @SerializedName(TSMAuthContants.PARAM_CARDNO)
    private String mCardNo;

    @SerializedName("carKeyList")
    private List<KeyItem> mKeyItems;

    public List<KeyItem> getAddedKeyItems() {
        return this.mKeyItems;
    }

    public String getCardNo() {
        return this.mCardNo;
    }

    public void setCardNo(String str) {
        this.mCardNo = str;
    }
}

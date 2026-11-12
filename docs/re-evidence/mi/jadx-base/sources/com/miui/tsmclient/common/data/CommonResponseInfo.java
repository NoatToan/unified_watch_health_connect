package com.miui.tsmclient.common.data;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.IAuthClient;

/* JADX INFO: loaded from: classes4.dex */
public class CommonResponseInfo {

    @SerializedName(IAuthClient.KEY_ERR_CODE)
    private int mErrorCode;

    @SerializedName("errDesc")
    private String mErrorDesc;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorDesc() {
        return this.mErrorDesc;
    }

    public boolean isSuccess() {
        return this.mErrorCode == 200;
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public void setErrorDesc(String str) {
        this.mErrorDesc = str;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}

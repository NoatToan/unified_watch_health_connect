package com.ximalaya.ting.android.opensdk.model;

import com.facebook.internal.NativeProtocol;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import com.xmlywind.sdk.common.Constants;

/* JADX INFO: loaded from: classes22.dex */
public class SercretPubKey extends XimalayaResponse {

    @SerializedName(Constants.EXPIRED_TIME)
    private int expiredTime;

    @SerializedName(NativeProtocol.WEB_DIALOG_IS_FALLBACK)
    private boolean isFallBack;

    @SerializedName("s_pub_key")
    private String pubKey;

    public int getExpiredTime() {
        return this.expiredTime;
    }

    public String getPubKey() {
        return this.pubKey;
    }

    public boolean isFallBack() {
        return this.isFallBack;
    }

    public void setExpiredTime(int i) {
        this.expiredTime = i;
    }

    public void setFallBack(boolean z) {
        this.isFallBack = z;
    }

    public void setPubKey(String str) {
        this.pubKey = str;
    }
}

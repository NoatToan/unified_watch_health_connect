package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class NotificationToken {

    @SerializedName("tokenData")
    private String mTokenData;

    @SerializedName("type")
    private String mType;

    public String getTokenData() {
        return this.mTokenData;
    }

    public String getType() {
        return this.mType;
    }
}

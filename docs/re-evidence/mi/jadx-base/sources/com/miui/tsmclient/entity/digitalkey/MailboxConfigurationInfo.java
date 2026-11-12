package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class MailboxConfigurationInfo {

    @SerializedName("accessRights")
    private String mAccessRights;

    @SerializedName("timeToLive")
    private String mTimeToLive;

    public String getAccessRights() {
        return this.mAccessRights;
    }

    public String getTimeToLive() {
        return this.mTimeToLive;
    }

    public String toJsonString() {
        return new Gson().toJson(this);
    }
}

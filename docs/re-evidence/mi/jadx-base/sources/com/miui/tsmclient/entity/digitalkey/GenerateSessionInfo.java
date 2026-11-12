package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class GenerateSessionInfo {

    @SerializedName("inviteLink")
    private String mInviteLink;

    @SerializedName("sessionId")
    private String mSessionId;

    public String getInviteLink() {
        return this.mInviteLink;
    }

    public String getSessionId() {
        return this.mSessionId;
    }
}

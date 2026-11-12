package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes6.dex */
public class NotificationTokenInfo {

    @SerializedName(TSMAuthContants.PARAM_NOTIFICATION_TOKEN)
    private NotificationToken mNotificationToken;

    public static NotificationTokenInfo fromJson(String str) {
        return (NotificationTokenInfo) new Gson().fromJson(str, NotificationTokenInfo.class);
    }

    public NotificationToken getNotificationToken() {
        return this.mNotificationToken;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}

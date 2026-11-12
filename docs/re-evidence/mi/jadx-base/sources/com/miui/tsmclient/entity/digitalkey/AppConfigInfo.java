package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class AppConfigInfo {

    @SerializedName(Constants.EXTRA_ENABLE_NEW_TASK)
    private boolean isEnableNewTask;

    @SerializedName(Constants.EXTRA_APP_PAIRING_LINK)
    private String mAppPairingLink;

    @SerializedName("appPairingLinkPkgName")
    private String mAppPairingLinkPkgName;

    @SerializedName("appPairingLinkType")
    private int mAppPairingLinkType;

    public String getAppPairingLink() {
        return this.mAppPairingLink;
    }

    public String getAppPairingLinkPkgName() {
        return this.mAppPairingLinkPkgName;
    }

    public int getAppPairingLinkType() {
        return this.mAppPairingLinkType;
    }

    public boolean isEnableNewTask() {
        return this.isEnableNewTask;
    }
}

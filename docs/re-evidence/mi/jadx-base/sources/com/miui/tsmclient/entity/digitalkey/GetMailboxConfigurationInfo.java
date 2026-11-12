package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes6.dex */
public class GetMailboxConfigurationInfo {

    @SerializedName(TSMAuthContants.PARAM_DISPLAY_INFORMATION)
    private DisplayInformationInfo mDisplayInformation;

    @SerializedName(TSMAuthContants.PARAM_MAILBOX_CONFIGURATION)
    private MailboxConfigurationInfo mMailboxConfiguration;

    public DisplayInformationInfo getDisplayInformation() {
        return this.mDisplayInformation;
    }

    public MailboxConfigurationInfo getMailboxConfiguration() {
        return this.mMailboxConfiguration;
    }
}

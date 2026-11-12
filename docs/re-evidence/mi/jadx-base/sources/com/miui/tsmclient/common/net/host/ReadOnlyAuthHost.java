package com.miui.tsmclient.common.net.host;

import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public class ReadOnlyAuthHost extends BaseHost {
    private static final String SERVICE_ID = "tsm-auth";
    private String SERVICE_STAGING;
    private String mServiceOnline;

    public ReadOnlyAuthHost() {
        this.SERVICE_STAGING = "https://staging-r.tsmapi.pay.xiaomi.com/";
        this.mServiceOnline = "https://r.tsmapi.pay.xiaomi.com/";
        if (EnvironmentConfig.isStaging()) {
            if (Host.getStagingIndex() == 6) {
                this.SERVICE_STAGING = "https://staging-r-external.tsmapi.pay.xiaomi.com/";
            }
        } else if (Host.getStagingIndex() == 4) {
            this.mServiceOnline = "https://preview-r.tsmapi.pay.xiaomi.com/";
        } else {
            this.mServiceOnline = "https://r.tsmapi.pay.xiaomi.com/";
        }
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getOnlineHost() {
        return this.mServiceOnline;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getServiceId() {
        return SERVICE_ID;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getStagingHost() {
        return this.SERVICE_STAGING;
    }
}

package com.miui.tsmclient.common.net.host;

import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public class AuthHost extends BaseHost {
    private static final String SERVICE_ID = "tsm-auth";
    private String mServiceOnline;
    private String mServiceStaging;

    public AuthHost() {
        this.mServiceStaging = "https://staging.tsmapi.pay.xiaomi.com/";
        this.mServiceOnline = "https://tsmapi.pay.xiaomi.com/";
        if (!EnvironmentConfig.isStaging()) {
            if (Host.getStagingIndex() == 4) {
                this.mServiceOnline = "https://preview.tsmapi.pay.xiaomi.com/";
                return;
            } else {
                this.mServiceOnline = "https://tsmapi.pay.xiaomi.com/";
                return;
            }
        }
        int stagingIndex = Host.getStagingIndex();
        if (stagingIndex == 1) {
            this.mServiceStaging = "https://staging1.tsmapi.pay.xiaomi.com/";
            return;
        }
        if (stagingIndex == 2) {
            this.mServiceStaging = "https://staging2.tsmapi.pay.xiaomi.com/";
            return;
        }
        if (stagingIndex == 3) {
            this.mServiceStaging = "https://staging3.tsmapi.pay.xiaomi.com/";
        } else if (stagingIndex != 6) {
            this.mServiceStaging = "https://staging.tsmapi.pay.xiaomi.com/";
        } else {
            this.mServiceStaging = "https://staging-external.tsmapi.pay.xiaomi.com/";
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
        return this.mServiceStaging;
    }
}

package com.miui.tsmclient.common.net.host;

import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityHost extends BaseHost {
    private static final String ACTIVITY_SERVICE_ONLINE = "https://tsmactivity.pay.xiaomi.com/";
    private String mActivityServiceStaging;
    private String mServiceId;

    public ActivityHost() {
        this.mServiceId = "tsm-activity-api";
        this.mActivityServiceStaging = "https://staging.tsmactivity.pay.xiaomi.com/";
        if (EnvironmentConfig.isStaging()) {
            int stagingIndex = Host.getStagingIndex();
            if (stagingIndex == 1) {
                this.mActivityServiceStaging = "https://staging1.tsmactivity.pay.xiaomi.com/";
                this.mServiceId = "tsm-activity-api-1";
            } else if (stagingIndex == 2) {
                this.mActivityServiceStaging = "https://staging2.tsmactivity.pay.xiaomi.com/";
                this.mServiceId = "tsm-activity-api-2";
            } else if (stagingIndex != 3) {
                this.mActivityServiceStaging = "https://staging.tsmactivity.pay.xiaomi.com/";
                this.mServiceId = "tsm-activity-api";
            } else {
                this.mActivityServiceStaging = "https://staging3.tsmactivity.pay.xiaomi.com/";
                this.mServiceId = "tsm-activity-api-3";
            }
        }
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getOnlineHost() {
        return ACTIVITY_SERVICE_ONLINE;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getServiceId() {
        return this.mServiceId;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getStagingHost() {
        return this.mActivityServiceStaging;
    }
}

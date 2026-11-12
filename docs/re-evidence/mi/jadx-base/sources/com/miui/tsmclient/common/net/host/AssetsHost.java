package com.miui.tsmclient.common.net.host;

import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public class AssetsHost extends BaseHost {
    private static final String SERVICE_ID = "tsm-assets";
    private String mAssetsServiceOnline;
    private String mAssetsServiceStaging;

    public AssetsHost() {
        this.mAssetsServiceStaging = "https://staging1.sf.pay.xiaomi.com/";
        this.mAssetsServiceOnline = "https://sf.pay.xiaomi.com/";
        if (!EnvironmentConfig.isStaging()) {
            if (Host.getStagingIndex() == 4) {
                this.mAssetsServiceOnline = "https://preview.sf.pay.xiaomi.com/";
                return;
            } else {
                this.mAssetsServiceOnline = "https://sf.pay.xiaomi.com/";
                return;
            }
        }
        int stagingIndex = Host.getStagingIndex();
        if (stagingIndex == 1) {
            this.mAssetsServiceStaging = "https://staging1.sf.pay.xiaomi.com/";
            return;
        }
        if (stagingIndex == 2) {
            this.mAssetsServiceStaging = "https://staging2.sf.pay.xiaomi.com/";
            return;
        }
        if (stagingIndex == 3) {
            this.mAssetsServiceStaging = "https://staging3.sf.pay.xiaomi.com/";
        } else if (stagingIndex != 6) {
            this.mAssetsServiceStaging = "https://staging.sf.pay.xiaomi.com";
        } else {
            this.mAssetsServiceStaging = "https://staging-external.sf.pay.xiaomi.com/";
        }
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getOnlineHost() {
        return this.mAssetsServiceOnline;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getServiceId() {
        return SERVICE_ID;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getStagingHost() {
        return this.mAssetsServiceStaging;
    }
}

package com.miui.tsmclient.sesdk.easycard.net.host;

import com.miui.tsmclient.common.net.host.BaseHost;

/* JADX INFO: loaded from: classes6.dex */
public class EasyCardHost extends BaseHost {
    private static final String SERVICE_ID = "tsm-auth";
    private static final String SERVICE_ONLINE = "https://yyk-seitsm.nfcpay.xiaomi.com/";
    private static final String SERVICE_STAGING = "https://staging-yyk-seitsm.nfcpay.xiaomi.com/";

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getOnlineHost() {
        return SERVICE_ONLINE;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getServiceId() {
        return SERVICE_ID;
    }

    @Override // com.miui.tsmclient.common.net.host.Host
    public String getStagingHost() {
        return SERVICE_STAGING;
    }
}

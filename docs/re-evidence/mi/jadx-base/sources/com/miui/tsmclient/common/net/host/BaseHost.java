package com.miui.tsmclient.common.net.host;

import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseHost extends Host {
    @Override // com.miui.tsmclient.common.net.host.Host
    public String getAuthType() {
        return EnvironmentConfig.isLoginAuth() ? "login" : NetConstants.AUTH_TYPE_OAUTH;
    }
}

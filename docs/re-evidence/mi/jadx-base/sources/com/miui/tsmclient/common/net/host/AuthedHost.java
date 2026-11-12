package com.miui.tsmclient.common.net.host;

import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes4.dex */
public class AuthedHost extends AuthHost {
    @Override // com.miui.tsmclient.common.net.host.BaseHost, com.miui.tsmclient.common.net.host.Host
    public String getAuthType() {
        return EnvironmentConfig.isLoginAuth() ? NetConstants.AUTH_TYPE_AUTHED : NetConstants.AUTH_TYPE_OAUTH;
    }
}

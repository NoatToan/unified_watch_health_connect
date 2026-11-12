package com.miui.tsmclient.net;

import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes6.dex */
public class AuthClientFactory {
    public static IAuthClient createAuthClient() {
        return EnvironmentConfig.isLoginAuth() ? new TSMAuthClient() : new OAuthClient();
    }
}

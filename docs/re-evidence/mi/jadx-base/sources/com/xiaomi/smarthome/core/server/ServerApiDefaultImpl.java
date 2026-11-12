package com.xiaomi.smarthome.core.server;

import android.content.Context;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;

/* JADX INFO: loaded from: classes10.dex */
public class ServerApiDefaultImpl extends ServerApi {
    ServerBean bean = new ServerBean("cn", ServerConstants.NEW_CN_COUNTRY_CODE, "");

    @Override // com.xiaomi.smarthome.core.server.ServerApi
    public ServerBean getCurrentServer(Context context) {
        return this.bean;
    }

    @Override // com.xiaomi.smarthome.core.server.ServerApi
    public ServerBean getGlobalSettingServer() {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.ServerApi
    public String getGlobalSettingServerEnv() {
        return "";
    }

    @Override // com.xiaomi.smarthome.core.server.ServerApi
    public boolean isCoreReady() {
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.ServerApi
    public boolean isInternationalServer() {
        return false;
    }
}

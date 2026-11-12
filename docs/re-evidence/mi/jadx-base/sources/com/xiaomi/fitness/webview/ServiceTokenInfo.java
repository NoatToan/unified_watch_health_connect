package com.xiaomi.fitness.webview;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public class ServiceTokenInfo {
    public String cUserId;
    public String serviceToken;
    public String ssecurity;
    public long timeDiff;
    public String userId;

    public static ServiceTokenInfo build(String str, String str2, String str3, String str4) {
        ServiceTokenInfo serviceTokenInfo = new ServiceTokenInfo();
        serviceTokenInfo.userId = str;
        serviceTokenInfo.cUserId = str2;
        serviceTokenInfo.serviceToken = str3;
        serviceTokenInfo.ssecurity = str4;
        return serviceTokenInfo;
    }
}

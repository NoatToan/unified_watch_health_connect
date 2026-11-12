package com.xiaomi.hm.health.relation.cloud;

import android.text.TextUtils;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BasicServerDef {
    public static final String API_BASE_IF = "huami.health.";
    public static final String API_DEVICE_IF = "huami.device.";
    public static final String API_SHOES_IF = "huami.shoes.";
    public static final String API_SPORT_IF = "huami.sport.";
    public static final String API_THIRD_PARTY_APP = "huami.partner.";
    public static final String API_USER_IF = "huami.user.";
    public static final String RESPONSE_FORMAT = "json";
    public static final String TEST_INNER_SERVER = null;

    public static String getUrl(String str) {
        String str2 = HMServerDef.getHost() + str;
        String str3 = TEST_INNER_SERVER;
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3 + str;
        }
        HMLog.i("url", str2, new Object[0]);
        return str2;
    }
}

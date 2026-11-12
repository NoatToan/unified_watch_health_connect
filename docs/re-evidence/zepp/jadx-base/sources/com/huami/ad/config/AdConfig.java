package com.huami.ad.config;

import com.huami.ad.Constants;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdConfig implements Constants {
    public static final String DEFAULT_BASE_PATH = "discovery/" + HMAppConfig.getSocial() + "/cards/";

    public static Map<String, Object> getParams() {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("appname", HMAppConfig.getPackageName());
        systemParams.put("appplatform", HMAppConfig.getDeviceType());
        systemParams.put("adcode", LocWeatherManager.getInstance().getLocationAddressCode());
        return systemParams;
    }

    public Map<String, Object> getConfig() {
        return getParams();
    }

    public abstract String getUrl();
}

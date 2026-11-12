package com.huami.ad.config;

import com.huami.network.hmnetwork.config.HMAppConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchConfig extends AdConfig {
    private static final String e = "LaunchConfig";
    private static final String f = "discovery/" + HMAppConfig.getSocial() + "/cards/startpage_ad";
    private static final String g = "w";
    private static final String h = "h";
    private int a;
    private int b;
    private String c;
    private String d;

    public LaunchConfig(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    private Map<String, Object> a() {
        Map<String, Object> params = AdConfig.getParams();
        params.put(g, String.valueOf(this.b));
        params.put("h", String.valueOf(this.a));
        params.put("user_region", this.c);
        params.put("user_country", this.d);
        return params;
    }

    @Override // com.huami.ad.config.AdConfig
    public Map<String, Object> getConfig() {
        return a();
    }

    @Override // com.huami.ad.config.AdConfig
    public String getUrl() {
        return f;
    }
}

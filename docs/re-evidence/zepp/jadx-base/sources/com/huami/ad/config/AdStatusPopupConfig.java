package com.huami.ad.config;

/* JADX INFO: loaded from: classes4.dex */
public class AdStatusPopupConfig extends AdConfig {
    private static final String a = "homepage_popup";

    @Override // com.huami.ad.config.AdConfig
    public String getUrl() {
        return AdConfig.DEFAULT_BASE_PATH + a;
    }
}

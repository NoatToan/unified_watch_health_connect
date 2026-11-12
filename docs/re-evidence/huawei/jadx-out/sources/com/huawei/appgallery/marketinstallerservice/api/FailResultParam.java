package com.huawei.appgallery.marketinstallerservice.api;

/* JADX INFO: loaded from: classes23.dex */
public class FailResultParam extends BaseResultParam {
    private MarketInfo e = null;

    public void setMarketInfo(MarketInfo marketInfo) {
        this.e = marketInfo;
    }

    public MarketInfo getMarketInfo() {
        return this.e;
    }
}

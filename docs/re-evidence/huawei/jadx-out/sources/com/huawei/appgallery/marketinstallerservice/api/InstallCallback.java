package com.huawei.appgallery.marketinstallerservice.api;

/* JADX INFO: loaded from: classes23.dex */
public interface InstallCallback {
    void onFailed(FailResultParam failResultParam);

    void onSuccess(MarketInfo marketInfo);
}

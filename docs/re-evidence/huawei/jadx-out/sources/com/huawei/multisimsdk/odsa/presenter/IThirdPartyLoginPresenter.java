package com.huawei.multisimsdk.odsa.presenter;

/* JADX INFO: loaded from: classes12.dex */
public interface IThirdPartyLoginPresenter {
    void getWsTokenAndNonce(String str);

    void onDestroy();

    void onStart();

    void onStop();

    void startLogin();
}

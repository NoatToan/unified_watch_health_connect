package com.xmlywind.sdk.splash;

/* JADX INFO: loaded from: classes22.dex */
public interface b {
    void onSplashAdClicked();

    void onSplashAdFailToPresent(int i, String str);

    void onSplashAdLoadFail(int i, String str);

    void onSplashAdLoadSuccess();

    void onSplashAdSkip();

    void onSplashAdSuccessPresentScreen();

    void onSplashClosed();
}

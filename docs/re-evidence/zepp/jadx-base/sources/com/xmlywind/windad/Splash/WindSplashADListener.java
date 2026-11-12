package com.xmlywind.windad.Splash;

import com.xmlywind.windad.WindAdError;

/* JADX INFO: loaded from: classes22.dex */
public interface WindSplashADListener {
    void onSplashAdClicked();

    void onSplashAdFailToLoad(WindAdError windAdError, String str);

    void onSplashAdSuccessLoad();

    void onSplashAdSuccessPresent();

    void onSplashClosed();
}

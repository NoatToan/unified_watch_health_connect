package com.xmlywind.windad.interstitial;

import com.xmlywind.windad.WindAdError;

/* JADX INFO: loaded from: classes22.dex */
public interface WindInterstitialAdListener {
    void onInterstitialAdClicked(String str);

    void onInterstitialAdClosed(String str);

    void onInterstitialAdLoadError(WindAdError windAdError, String str);

    void onInterstitialAdLoadSuccess(String str);

    void onInterstitialAdPlayEnd(String str);

    void onInterstitialAdPlayError(WindAdError windAdError, String str);

    void onInterstitialAdPlayStart(String str);

    void onInterstitialAdPreLoadFail(String str);

    void onInterstitialAdPreLoadSuccess(String str);
}

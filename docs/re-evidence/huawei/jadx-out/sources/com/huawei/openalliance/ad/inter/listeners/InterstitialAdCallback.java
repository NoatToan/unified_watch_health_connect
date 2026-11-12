package com.huawei.openalliance.ad.inter.listeners;

import com.huawei.openalliance.ad.inter.data.InterstitialAd;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InterstitialAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterstitialAdListener f19242a;

    public abstract void onAdsLoaded(InterstitialAd interstitialAd);

    public void setInterstitialAdListener(InterstitialAdListener interstitialAdListener) {
        this.f19242a = interstitialAdListener;
    }

    public InterstitialAdListener getInterstitialAdListener() {
        return this.f19242a;
    }

    public InterstitialAdCallback(InterstitialAdListener interstitialAdListener) {
        this.f19242a = interstitialAdListener;
    }
}

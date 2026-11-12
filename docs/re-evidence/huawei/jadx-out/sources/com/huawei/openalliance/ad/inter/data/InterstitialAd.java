package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.inter.listeners.InterstitialAdListener;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class InterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.huawei.openalliance.ad.inter.g f19182a;

    public final void show() {
        this.f19182a.f();
    }

    public void setVideoConfiguration(VideoConfiguration videoConfiguration) {
        this.f19182a.a(videoConfiguration);
    }

    public final void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        this.f19182a.a(rewardVerifyConfig);
    }

    public final void setRewardAdStatusListener(IRewardAdStatusListener iRewardAdStatusListener) {
        this.f19182a.a(iRewardAdStatusListener);
    }

    public final void setLocation(Location location) {
        this.f19182a.a(location);
    }

    public void setExtraInfo(String str) {
        this.f19182a.c(str);
    }

    public final void setContentBundle(String str) {
        this.f19182a.b(str);
    }

    public final void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.f19182a.a(interstitialAdListener);
    }

    public final void setAdId(String str) {
        this.f19182a.a(str);
    }

    public final void loadAd(RequestOptions requestOptions) {
        this.f19182a.a(requestOptions, 0);
    }

    public final boolean isLoading() {
        return this.f19182a.d();
    }

    public final boolean isLoaded() {
        return this.f19182a.c();
    }

    public BiddingInfo getBiddingInfo() {
        return this.f19182a.g() == null ? new BiddingInfo() : this.f19182a.g();
    }

    public final Bundle getAdMetadata() {
        return this.f19182a.e();
    }

    public final InterstitialAdListener getAdListener() {
        return this.f19182a.a();
    }

    public final String getAdId() {
        return this.f19182a.b();
    }

    public void a(List<b> list) {
        this.f19182a.a(list);
    }

    public InterstitialAd(Context context) {
        this.f19182a = new com.huawei.openalliance.ad.inter.g(context);
    }
}

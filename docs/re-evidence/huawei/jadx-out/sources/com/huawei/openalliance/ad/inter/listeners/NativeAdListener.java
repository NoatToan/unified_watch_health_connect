package com.huawei.openalliance.ad.inter.listeners;

import com.huawei.openalliance.ad.inter.data.INativeAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface NativeAdListener {
    void onAdFailed(int i);

    void onAdsLoaded(Map<String, List<INativeAd>> map);
}

package com.huawei.openalliance.ad.inter.listeners;

import com.huawei.openalliance.ad.inter.data.IRewardAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface RewardAdListener {
    void onAdFailed(int i);

    void onAdsLoaded(Map<String, List<IRewardAd>> map);
}

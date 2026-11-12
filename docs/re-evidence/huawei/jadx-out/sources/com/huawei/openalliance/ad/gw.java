package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.inter.listeners.RewardAdListener;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class gw implements gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardAdListener f18851b;

    @Override // com.huawei.openalliance.ad.gs
    public void a(qy qyVar) {
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(Map map) {
        StringBuilder sb = new StringBuilder("onAdsLoaded, size:");
        sb.append(map != null ? Integer.valueOf(map.size()) : null);
        sb.append(", listener:");
        sb.append(this.f18851b);
        hw.b("RewardCallbackProc", sb.toString());
        RewardAdListener rewardAdListener = this.f18851b;
        if (rewardAdListener != null) {
            rewardAdListener.onAdsLoaded(map);
        }
        com.huawei.openalliance.ad.utils.ae.a(this.f18850a, map);
    }

    @Override // com.huawei.openalliance.ad.gs
    public void a(int i) {
        hw.b("RewardCallbackProc", "onAdFailed, errorCode:" + i);
        RewardAdListener rewardAdListener = this.f18851b;
        if (rewardAdListener != null) {
            rewardAdListener.onAdFailed(i);
        }
    }

    public gw(Context context, RewardAdListener rewardAdListener) {
        this.f18850a = context.getApplicationContext();
        this.f18851b = rewardAdListener;
    }
}

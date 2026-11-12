package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes41.dex */
public class vj implements MuteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f21468a;

    @Override // com.huawei.openalliance.ad.media.listener.MuteListener
    public void onUnmute() {
        this.f21468a.e(false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MuteListener
    public void onMute() {
        this.f21468a.e(true);
    }

    public vj(PPSRewardView pPSRewardView) {
        this.f21468a = pPSRewardView;
    }
}

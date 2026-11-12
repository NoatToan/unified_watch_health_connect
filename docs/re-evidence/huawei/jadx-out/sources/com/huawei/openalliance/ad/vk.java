package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.views.NetworkChangeListener;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes41.dex */
public class vk implements NetworkChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.huawei.openalliance.ad.views.interfaces.k f21469a;

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkDisconnected() {
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkConnectedOrChanged(boolean z) {
        this.f21469a.a(z);
    }

    public vk(PPSRewardView pPSRewardView) {
        this.f21469a = pPSRewardView;
    }
}

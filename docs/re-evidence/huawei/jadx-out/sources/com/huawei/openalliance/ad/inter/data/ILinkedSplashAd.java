package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;

/* JADX INFO: loaded from: classes12.dex */
public interface ILinkedSplashAd extends INativeAd {
    LinkedAdListener getListener();

    String getSoundSwitch();

    boolean isFromExsplash();

    void setListener(LinkedAdListener linkedAdListener);
}

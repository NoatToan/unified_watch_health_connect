package com.huawei.policy;

import defpackage.oaw;
import defpackage.xiu;

/* JADX INFO: loaded from: classes15.dex */
public interface MedalSyncPolicy {
    void onLaunchPageStart(oaw oawVar);

    void onLightMedalListStart(oaw oawVar);

    void onLightMedalMessageListStart(oaw oawVar);

    void onLightMedalStart(oaw oawVar);

    void onSyncMedalsStart(oaw oawVar);

    void receiveFromDevice(int i, xiu xiuVar);
}

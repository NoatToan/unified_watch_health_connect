package com.huawei.pluginachievement.impl;

import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;

/* JADX INFO: loaded from: classes2.dex */
public interface AchieveObserverExpansion extends AchieveObserver {
    void onCloudDataCallback(int i, UserAchieveWrapper userAchieveWrapper);
}

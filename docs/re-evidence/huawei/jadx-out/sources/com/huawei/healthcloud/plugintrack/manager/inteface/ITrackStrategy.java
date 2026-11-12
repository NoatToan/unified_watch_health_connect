package com.huawei.healthcloud.plugintrack.manager.inteface;

/* JADX INFO: loaded from: classes10.dex */
public interface ITrackStrategy {
    void dispatchPhoneCurrentState(int i);

    void notifyUserOperateSportState(int i);

    void start();

    void stop();
}

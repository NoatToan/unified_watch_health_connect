package com.huawei.motiondetection.motionrelay;

/* JADX INFO: loaded from: classes12.dex */
public interface IRelay {
    void destroy();

    void setRelayListener(RelayListener relayListener);

    void startMotionReco(int i);

    void startMotionService();

    void stopMotionReco(int i);

    void stopMotionService();
}

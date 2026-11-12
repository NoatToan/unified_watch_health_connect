package com.xiaomi.hm.health.bt.device;

import com.xiaomi.hm.health.bt.gatt.Phy;
import com.xiaomi.hm.health.bt.profile.base.ConnectionParameters;
import com.xiaomi.hm.health.bt.profile.base.Mtu;

/* JADX INFO: loaded from: classes19.dex */
public interface IBleInterface {
    void enableConnectedAdv(final boolean enable, final HMCallback callback);

    Mtu getMtu();

    void requestConnectionPriority(int connectionPriority, HMCallback callback);

    void requestMtu(int mtu, HMCallback<Integer> callback);

    void setConnectionParameters(ConnectionParameters parameters, HMCallback callback);

    void setPreferredPhy(int txPhy, int rxPhy, int phyOptions, HMCallback<Phy> callback);
}

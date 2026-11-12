package com.huami.wallet.ui.utils;

import com.huami.components.devicestatus.DeviceStatusNavigator;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.wallet.ui.helper.WalletPageHelper;

/* JADX INFO: loaded from: classes16.dex */
public class WalletUI {
    private static volatile WalletUI d;
    private DeviceStatusStringProvider a;
    private DeviceStatusNavigator b;
    private boolean c = false;

    public static WalletUI getInstance() {
        if (d == null) {
            synchronized (WalletUI.class) {
                if (d == null) {
                    d = new WalletUI();
                }
            }
        }
        return d;
    }

    public boolean canDeleteCard() {
        return this.c;
    }

    public DeviceStatusNavigator getDeviceStatusNavigator() {
        return this.b;
    }

    public DeviceStatusStringProvider getDeviceStatusStringProvider() {
        return this.a;
    }

    public boolean isInWallet() {
        return WalletPageHelper.getInstance().getCreatedActivityCount() > 0;
    }

    public void setCanDeleteCard(boolean z) {
        this.c = z;
    }

    public void setDeviceStatusNavigator(DeviceStatusNavigator deviceStatusNavigator) {
        this.b = deviceStatusNavigator;
    }

    public void setDeviceStatusStringProvider(DeviceStatusStringProvider deviceStatusStringProvider) {
        this.a = deviceStatusStringProvider;
    }
}

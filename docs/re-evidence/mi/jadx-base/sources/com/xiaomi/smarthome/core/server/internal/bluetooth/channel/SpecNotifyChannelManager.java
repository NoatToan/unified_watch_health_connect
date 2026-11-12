package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;

/* JADX INFO: loaded from: classes10.dex */
public class SpecNotifyChannelManager extends SpecChannelManager {

    public static class Holder {
        public static final SpecNotifyChannelManager INSTANCE = new SpecNotifyChannelManager();

        private Holder() {
        }
    }

    public static SpecNotifyChannelManager getInstance() {
        return Holder.INSTANCE;
    }

    private SpecNotifyChannelManager() {
        super(BluetoothConstants.CHARACTER_BLE_SPEC_READ);
    }
}

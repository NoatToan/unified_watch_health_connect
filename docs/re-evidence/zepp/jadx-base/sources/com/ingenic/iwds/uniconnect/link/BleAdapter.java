package com.ingenic.iwds.uniconnect.link;

import android.content.Context;

/* JADX INFO: loaded from: classes18.dex */
public class BleAdapter extends Adapter {
    public BleAdapter(Context context, AdapterManager adapterManager) {
        super(context, adapterManager, Adapter.TAG_BLE_DATA_CHANNEL);
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public void cancelDiscovey() {
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public void disable() {
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public boolean enable() {
        return false;
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public String getLocalAddress() {
        return null;
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public boolean isEnabled() {
        return false;
    }

    @Override // com.ingenic.iwds.uniconnect.link.Adapter
    public int startDiscovery(Adapter.DeviceDiscoveryCallbacks deviceDiscoveryCallbacks) {
        return 0;
    }
}

package org.cybergarage.upnp.device;

import org.cybergarage.upnp.ssdp.SSDPPacket;

/* JADX INFO: loaded from: classes23.dex */
public interface NotifyListener {
    void deviceNotifyReceived(SSDPPacket sSDPPacket);
}

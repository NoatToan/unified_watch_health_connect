package org.cybergarage.upnp.device;

import org.cybergarage.upnp.Device;
import org.cybergarage.util.ThreadCore;

/* JADX INFO: loaded from: classes23.dex */
public class Advertiser extends ThreadCore {
    private Device device;

    public Advertiser(Device device) {
        setDevice(device);
    }

    public Device getDevice() {
        return this.device;
    }

    @Override // org.cybergarage.util.ThreadCore, java.lang.Runnable
    public void run() {
        Device device = getDevice();
        long leaseTime = device.getLeaseTime();
        while (isRunnable()) {
            try {
                Thread.sleep(((leaseTime / 4) + ((long) (leaseTime * Math.random() * 0.25d))) * 1000);
            } catch (InterruptedException unused) {
            }
            device.announce();
        }
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}

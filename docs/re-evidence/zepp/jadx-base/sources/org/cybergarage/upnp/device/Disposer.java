package org.cybergarage.upnp.device;

import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.util.ThreadCore;

/* JADX INFO: loaded from: classes23.dex */
public class Disposer extends ThreadCore {
    private ControlPoint ctrlPoint;

    public Disposer(ControlPoint controlPoint) {
        setControlPoint(controlPoint);
    }

    public ControlPoint getControlPoint() {
        return this.ctrlPoint;
    }

    @Override // org.cybergarage.util.ThreadCore, java.lang.Runnable
    public void run() {
        ControlPoint controlPoint = getControlPoint();
        long expiredDeviceMonitoringInterval = controlPoint.getExpiredDeviceMonitoringInterval() * 1000;
        while (isRunnable()) {
            try {
                Thread.sleep(expiredDeviceMonitoringInterval);
            } catch (InterruptedException unused) {
            }
            controlPoint.removeExpiredDevices();
        }
    }

    public void setControlPoint(ControlPoint controlPoint) {
        this.ctrlPoint = controlPoint;
    }
}

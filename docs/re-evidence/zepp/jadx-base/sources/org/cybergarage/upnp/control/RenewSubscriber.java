package org.cybergarage.upnp.control;

import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.util.ThreadCore;

/* JADX INFO: loaded from: classes23.dex */
public class RenewSubscriber extends ThreadCore {
    public static final long INTERVAL = 120;
    private ControlPoint ctrlPoint;

    public RenewSubscriber(ControlPoint controlPoint) {
        setControlPoint(controlPoint);
    }

    public ControlPoint getControlPoint() {
        return this.ctrlPoint;
    }

    @Override // org.cybergarage.util.ThreadCore, java.lang.Runnable
    public void run() {
        ControlPoint controlPoint = getControlPoint();
        while (isRunnable()) {
            try {
                Thread.sleep(120000L);
            } catch (InterruptedException unused) {
            }
            controlPoint.renewSubscriberService();
        }
    }

    public void setControlPoint(ControlPoint controlPoint) {
        this.ctrlPoint = controlPoint;
    }
}

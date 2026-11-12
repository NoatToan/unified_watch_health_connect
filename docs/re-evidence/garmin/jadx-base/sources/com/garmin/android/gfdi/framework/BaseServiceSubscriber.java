package com.garmin.android.gfdi.framework;

import android.content.Context;
import da2.k;
import da2.l;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseServiceSubscriber implements ma2.e, ma2.c {
    private static final int MAX_NUMBER_OF_NOTIFICATIONS = 3;
    private static final int NOTIFICATION_TIMEOUT_MILLISECONDS = 15000;
    private static final int TIME_BETWEEN_SUCCESSIVE_NOTIFICATIONS = 5000;
    protected Context appContext;
    private final Logger mLogger;
    protected PacketQueue transferQueue;
    private ma2.d bleConn = null;
    private l mRemoteDeviceProxy = null;
    private Timer mNotificationTimer = null;
    private int mNotificationCount = -1;
    private final byte[] lock = new byte[0];

    public BaseServiceSubscriber(Context context) {
        this.appContext = context;
        String tag = getTag();
        int i14 = gt2.c.f79010a;
        tag.getClass();
        this.mLogger = gt2.b.f79005a.i(tag);
    }

    public static /* synthetic */ int access$008(BaseServiceSubscriber baseServiceSubscriber) {
        int i14 = baseServiceSubscriber.mNotificationCount;
        baseServiceSubscriber.mNotificationCount = i14 + 1;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotificationTimer() {
        synchronized (this.lock) {
            try {
                try {
                    Timer timer = this.mNotificationTimer;
                    if (timer != null) {
                        timer.cancel();
                        this.mNotificationTimer.purge();
                        this.mLogger.debug("BleNotificationTimer stopped");
                    }
                } catch (Exception unused) {
                } finally {
                    this.mNotificationTimer = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ma2.e
    public abstract /* synthetic */ ma2.c create(Context context);

    public void disableReadCharacteristicNotification(String str, UUID uuid, UUID uuid2) {
        startNotificationEnabler(str, uuid, uuid2, false);
    }

    public void enableReadCharacteristicNotification(String str, UUID uuid, UUID uuid2) {
        startNotificationEnabler(str, uuid, uuid2, true);
    }

    public da2.b getRegistry() {
        return da2.d.c(this.appContext).f58886a.f111646e;
    }

    public l getRemoteDeviceProxy() {
        l lVar;
        synchronized (this.lock) {
            lVar = this.mRemoteDeviceProxy;
        }
        return lVar;
    }

    public abstract String getTag();

    public abstract void handleMessage(UUID uuid, byte[] bArr);

    @Override // ma2.e
    public void init(UUID uuid, ma2.d dVar, Object obj) {
        this.bleConn = dVar;
        if (dVar != null) {
            PacketQueue packetQueue = this.transferQueue;
            if (packetQueue != null) {
                packetQueue.stop();
            }
            this.transferQueue = new PacketQueue(dVar);
        }
    }

    @Override // ma2.c
    public void onBleCharacteristicNotificationSet(String str, UUID uuid, UUID uuid2, boolean z14) {
        this.mLogger.debug("onBleCharacteristicNotificationSet: " + str + "|" + uuid + "|" + uuid2 + "|success=" + z14);
        if (z14) {
            stopNotificationTimer();
        }
    }

    public void onBleCharacteristicRead(String str, UUID uuid, UUID uuid2, byte[] bArr, boolean z14) {
    }

    @Override // ma2.c
    public void onBleCharacteristicWritten(String str, UUID uuid, UUID uuid2, boolean z14) {
        this.mLogger.debug("onBleCharacteristicWritten: " + str + ", was success: " + z14);
        this.transferQueue.setConfirmed(true);
    }

    @Override // ma2.c
    public void onBlePacketReceived(String str, UUID uuid, UUID uuid2, byte[] bArr) {
        this.mLogger.debug("onBlePacketReceived: " + ft2.b.a(bArr));
        handleMessage(uuid2, bArr);
    }

    public abstract /* synthetic */ void onBleServicesDiscovered(k kVar, UUID uuid, UUID[] uuidArr);

    public void onNotificationEnableTimeout(String str, UUID uuid, UUID uuid2, boolean z14) {
        Logger logger = this.mLogger;
        StringBuilder sb3 = new StringBuilder("Did not ");
        sb3.append(z14 ? "enable" : "disable");
        sb3.append(" (Service UUID=");
        sb3.append(uuid);
        sb3.append(", Characteristic UUID=");
        sb3.append(uuid2);
        sb3.append(")");
        logger.error(sb3.toString());
    }

    public void onRemoteDeviceDisconnected(String str) {
        stopNotificationTimer();
        PacketQueue packetQueue = this.transferQueue;
        if (packetQueue != null) {
            packetQueue.stop();
            this.transferQueue = null;
        }
    }

    public void setRemoteDeviceProxy(l lVar) {
        synchronized (this.lock) {
            this.mRemoteDeviceProxy = lVar;
        }
    }

    public void startNotificationEnabler(final String str, final UUID uuid, final UUID uuid2, final boolean z14) {
        if (uuid == null || uuid2 == null || this.bleConn == null) {
            return;
        }
        synchronized (this.lock) {
            stopNotificationTimer();
            this.mNotificationCount = 0;
            this.mNotificationTimer = new Timer("GDI_BleMBNotificationTimer_" + str);
            this.mLogger.debug("Scheduling MBNotificationEnabling task");
            this.mNotificationTimer.scheduleAtFixedRate(new TimerTask() { // from class: com.garmin.android.gfdi.framework.BaseServiceSubscriber.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    int i14 = BaseServiceSubscriber.this.mNotificationCount;
                    BaseServiceSubscriber baseServiceSubscriber = BaseServiceSubscriber.this;
                    if (i14 < 3) {
                        BaseServiceSubscriber.access$008(baseServiceSubscriber);
                        BaseServiceSubscriber.this.mLogger.debug("enableReadCharacteristicNotificaiton.run: Go ahead Mr. Remote Device, you can talk now... attempt#" + BaseServiceSubscriber.this.mNotificationCount);
                        BaseServiceSubscriber.this.bleConn.b(uuid, uuid2, z14);
                        return;
                    }
                    baseServiceSubscriber.mLogger.warn("enableReadCharacteristicNotificaiton.run: Read characteristic " + uuid2 + " does not seem to be willing to talk.");
                    cancel();
                }
            }, 0L, 5000L);
            this.mLogger.debug("Scheduling NotificationWatching task");
            this.mNotificationTimer.schedule(new TimerTask() { // from class: com.garmin.android.gfdi.framework.BaseServiceSubscriber.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    BaseServiceSubscriber.this.mLogger.warn("Time's up!!! BLE notification enabling took too long!");
                    BaseServiceSubscriber.this.stopNotificationTimer();
                    BaseServiceSubscriber.this.onNotificationEnableTimeout(str, uuid, uuid2, z14);
                }
            }, 15000L);
        }
    }
}

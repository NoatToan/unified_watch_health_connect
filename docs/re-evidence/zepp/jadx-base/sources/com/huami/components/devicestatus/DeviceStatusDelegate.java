package com.huami.components.devicestatus;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceStatusDelegate implements DeviceStatusListener {
    private static volatile DeviceStatusDelegate c;
    private List<DeviceStatusListener> a = new LinkedList();
    private DeviceStatusDataSource b;

    public interface a<T> {
        void accept(T t);
    }

    private DeviceStatusDelegate() {
    }

    public static DeviceStatusDelegate getInstance() {
        if (c == null) {
            synchronized (DeviceStatusDelegate.class) {
                if (c == null) {
                    c = new DeviceStatusDelegate();
                }
            }
        }
        return c;
    }

    private void u(a<DeviceStatusListener> aVar) {
        for (int i = 0; i < this.a.size(); i++) {
            aVar.accept(this.a.get(i));
        }
    }

    public DeviceStatusDataSource getDataSource() {
        return this.b;
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onConnected(final int i) {
        u(new a() { // from class: com.huami.components.devicestatus.f
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onConnected(i);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onConnecting(final int i) {
        u(new a() { // from class: com.huami.components.devicestatus.c
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onConnecting(i);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onConnectingTimeout(final int i) {
        u(new a() { // from class: com.huami.components.devicestatus.e
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onConnectingTimeout(i);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onDisconnected(final int i) {
        u(new a() { // from class: com.huami.components.devicestatus.b
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onDisconnected(i);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onStartSyncAGPS(final int i) {
        u(new a() { // from class: com.huami.components.devicestatus.a
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onStartSyncAGPS(i);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onStartSyncData(final int i) {
        u(new a() { // from class: com.huami.components.devicestatus.d
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onStartSyncData(i);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onStopSyncAGPS(final int i, final boolean z) {
        u(new a() { // from class: com.huami.components.devicestatus.i
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onStopSyncAGPS(i, z);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onStopSyncData(final int i, final boolean z) {
        u(new a() { // from class: com.huami.components.devicestatus.j
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onStopSyncData(i, z);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onSynchronizingAGPS(final int i, final int i2) {
        u(new a() { // from class: com.huami.components.devicestatus.h
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onSynchronizingAGPS(i, i2);
            }
        });
    }

    @Override // com.huami.components.devicestatus.DeviceStatusListener
    public void onSynchronizingData(final int i, final int i2) {
        u(new a() { // from class: com.huami.components.devicestatus.g
            @Override // com.huami.components.devicestatus.DeviceStatusDelegate.a
            public final void accept(Object obj) {
                ((DeviceStatusListener) obj).onSynchronizingData(i, i2);
            }
        });
    }

    public void registerDeviceStatusListener(DeviceStatusListener deviceStatusListener) {
        if (this.a.contains(deviceStatusListener)) {
            return;
        }
        this.a.add(deviceStatusListener);
    }

    public void setDataSource(DeviceStatusDataSource deviceStatusDataSource) {
        this.b = deviceStatusDataSource;
    }

    public void unregisterDeviceStatusListener(DeviceStatusListener deviceStatusListener) {
        this.a.remove(deviceStatusListener);
    }
}

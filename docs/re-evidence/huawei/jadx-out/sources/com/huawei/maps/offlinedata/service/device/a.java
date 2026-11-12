package com.huawei.maps.offlinedata.service.device;

import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f17892a;

    private a() {
    }

    public static a a() {
        if (f17892a == null) {
            synchronized (a.class) {
                if (f17892a == null) {
                    f17892a = new a();
                }
            }
        }
        return f17892a;
    }

    public void b(int i) {
        g.c("DeviceConnectStatusService", "onConnectStatusChanged statusCode: " + i);
        try {
            if (i != 2) {
                com.huawei.maps.offlinedata.service.download.b.b().g();
                f.b().c((OfflineDataTaskEntity) null);
                f.b().a();
            } else if (OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap() != null) {
                boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
                g.c("DeviceConnectStatusService", "syncPoliticalPerspective--isSmartWatchApMode--" + zIsSmartWatchApMode);
                if (zIsSmartWatchApMode) {
                    g.c("DeviceConnectStatusService", "call queryDevicePing from political.");
                    d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.service.device.a$$ExternalSyntheticLambda0
                        @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
                        public final void onPingResult(int i2) {
                            this.f$0.a(i2);
                        }
                    });
                } else {
                    b();
                }
            } else {
                g.c("DeviceConnectStatusService", "onConnectStatusChanged wearEngine4OfflineMap is null.");
            }
            com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.connect", String.valueOf(i));
        } catch (Exception e) {
            g.b("DeviceConnectStatusService", "onConnectStatusChanged exception: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        g.c("DeviceConnectStatusService", "political onPingResult code:" + i);
        if (i == 202) {
            b();
        } else {
            g.c("DeviceConnectStatusService", "political ping failed.");
        }
    }

    private void b() {
        g.c("DeviceConnectStatusService", "syncPoliticalPerspective");
        d.a().a(-1, 0);
    }
}

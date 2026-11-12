package com.huawei.maps.offlinedata.service;

import android.text.TextUtils;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListListener;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.service.device.f;
import com.huawei.maps.offlinedata.service.device.receivers.d;
import com.huawei.maps.offlinedata.service.download.b;
import com.huawei.maps.offlinedata.utils.c;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.maps.offlinedata.utils.j;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f17874b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f17875a = false;

    private a() {
    }

    public static a a() {
        if (f17874b == null) {
            synchronized (a.class) {
                if (f17874b == null) {
                    f17874b = new a();
                }
            }
        }
        return f17874b;
    }

    public boolean b() {
        return this.f17875a;
    }

    public boolean c() {
        return Boolean.parseBoolean(com.huawei.maps.offlinedata.utils.a.b().getSharedPreferences("com.huawei.health.h5.offline-map", 0).getString("autoUpdateIfWifi", null));
    }

    public void d() {
        g.c("OfflineMapManager", "pauseAllWhenNetworkChange");
        b.b().g();
    }

    public void e() {
        g.c("OfflineMapManager", "pauseWaitingTaskWhenH5change");
        b.b().a();
        f.b().a();
    }

    public void f() {
        g.c("OfflineMapManager", "resumeAllAutoDownloadTask start");
        if (b()) {
            return;
        }
        com.huawei.maps.offlinedata.service.persist.b.e().h(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.service.a$$ExternalSyntheticLambda1
            @Override // com.huawei.maps.offlinedata.utils.b
            public final void a(Object obj) {
                a.b((List) obj);
            }
        });
    }

    public void g() {
        g.c("OfflineMapManager", "resumeAllWhenNetworkChange");
        if (c()) {
            if (OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap() != null) {
                boolean zIsSmartWatchMcuMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchMcuMode();
                g.c("OfflineMapManager", "resumeAllWhenNetworkChange--isSmartWatchMcuMode--" + zIsSmartWatchMcuMode);
                if (zIsSmartWatchMcuMode) {
                    g.c("OfflineMapManager", "smartWatchMcuMode is true");
                    return;
                }
            }
            com.huawei.maps.offlinedata.service.persist.b.e().h(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.service.a$$ExternalSyntheticLambda5
                @Override // com.huawei.maps.offlinedata.utils.b
                public final void a(Object obj) {
                    a.c((List) obj);
                }
            });
        }
    }

    public void h() {
        g.c("OfflineMapManager", "resumeWaitingTaskWhenH5change");
        com.huawei.maps.offlinedata.service.persist.b.e().h(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.service.a$$ExternalSyntheticLambda3
            @Override // com.huawei.maps.offlinedata.utils.b
            public final void a(Object obj) {
                a.d((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(List list) {
        g.c("OfflineMapManager", "resumeAllAutoDownloadTask size: " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) it.next();
            if (TextUtils.equals(offlineDataTaskEntity.getItemState(), "processing") && offlineDataTaskEntity.getDownloadType() != null && offlineDataTaskEntity.getDownloadType().intValue() == 1) {
                String taskState = offlineDataTaskEntity.getTaskState();
                if (taskState.contains("download")) {
                    b.b().b(offlineDataTaskEntity);
                } else if (taskState.contains("transmit")) {
                    MapOfflineDataItemEntity mapOfflineDataItemEntityB = com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getDataType(), offlineDataTaskEntity.getCityId(), offlineDataTaskEntity.getVersion());
                    if (mapOfflineDataItemEntityB == null) {
                        g.c("OfflineMapManager", "resumeAllAutoDownloadTask dataItem is null");
                        return;
                    }
                    String fileId = mapOfflineDataItemEntityB.getFileId();
                    if (c.b(new File(com.huawei.maps.offlinedata.service.storage.a.e().c() + fileId.substring(fileId.lastIndexOf(47)))) || !TextUtils.equals(offlineDataTaskEntity.getTaskState(), "{\"transmit\":\"error\"}")) {
                        f.b().a(offlineDataTaskEntity, (MapOfflineDataItemEntity) null);
                    } else {
                        com.huawei.maps.offlinedata.service.persist.b.e().a(offlineDataTaskEntity.getId());
                        d.a().a(offlineDataTaskEntity.getDownloadType().intValue(), mapOfflineDataItemEntityB);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(List list) {
        g.c("OfflineMapManager", "the task list needed resume size is " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) it.next();
            String taskState = offlineDataTaskEntity.getTaskState();
            if (!taskState.contains("pause") && !taskState.contains(VastAttribute.ERROR) && !taskState.contains("parsing") && (!taskState.contains("download") || !taskState.contains("finish"))) {
                if (offlineDataTaskEntity.getTaskState().contains("transmit")) {
                    f.b().a(offlineDataTaskEntity, (MapOfflineDataItemEntity) null);
                } else {
                    b.b().b(offlineDataTaskEntity);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(List list) {
        g.c("OfflineMapManager", "the task list needed resume size is " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) it.next();
            String taskState = offlineDataTaskEntity.getTaskState();
            if (TextUtils.equals(offlineDataTaskEntity.getItemState(), "updating") && taskState.contains("download") && !b.b().d().contains(offlineDataTaskEntity)) {
                b.b().b(offlineDataTaskEntity);
            }
        }
    }

    public void a(boolean z) {
        this.f17875a = z;
        f.b().a(true);
    }

    public void a(final String str) {
        g.c("OfflineMapManager", "start check auto updates.");
        if (b()) {
            g.c("OfflineMapManager", "the webview is running. skip native updates.");
            return;
        }
        if (!c()) {
            g.c("OfflineMapManager", "the auto updates is disable");
            return;
        }
        if (OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap() != null) {
            boolean zIsSmartWatchMcuMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchMcuMode();
            g.c("OfflineMapManager", "startAutoUpdates--isSmartWatchMcuMode--" + zIsSmartWatchMcuMode);
            if (zIsSmartWatchMcuMode) {
                g.c("OfflineMapManager", "smartWatchMcuMode is true");
                return;
            }
        }
        int networkType = NetworkUtil.getNetworkType(com.huawei.maps.offlinedata.utils.a.b());
        if (networkType != 1) {
            g.c("OfflineMapManager", "current network type is not wifi: " + networkType);
            return;
        }
        long jA = j.a("autoUpdateCheckTime" + str, 0L, com.huawei.maps.offlinedata.utils.a.b());
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jA - jCurrentTimeMillis) < TimeUnit.HOURS.toMillis(1L)) {
            g.c("OfflineMapManager", "checked for updates recently. skip.");
            return;
        }
        boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
        g.c("OfflineMapManager", "startAutoUpdates--isSmartWatchApMode--" + zIsSmartWatchApMode);
        if (zIsSmartWatchApMode) {
            g.c("OfflineMapManager", "call queryDevicePing from startAutoUpdates.");
            com.huawei.maps.offlinedata.service.device.d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.service.a$$ExternalSyntheticLambda0
                @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
                public final void onPingResult(int i) {
                    this.f$0.a(str, jCurrentTimeMillis, i);
                }
            });
            return;
        }
        a(str, jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(OnCheckUpdatesListListener onCheckUpdatesListListener) {
        com.huawei.maps.offlinedata.service.cloud.a.c().a();
        if (!com.huawei.maps.offlinedata.service.cloud.a.c().b()) {
            g.d("OfflineMapManager", "the auto updates is disable by cloud.");
            onCheckUpdatesListListener.onOfflineMapsInfoResult(new ArrayList());
            return;
        }
        String strI = com.huawei.maps.offlinedata.service.cloud.a.c().i();
        String strG = com.huawei.maps.offlinedata.service.cloud.a.c().g();
        String strH = com.huawei.maps.offlinedata.service.cloud.a.c().h();
        if (TextUtils.isEmpty(strI) && TextUtils.isEmpty(strG) && TextUtils.isEmpty(strH)) {
            g.b("OfflineMapManager", "Failed to obtain the data version. Can't check for auto updates.");
            onCheckUpdatesListListener.onOfflineMapsInfoResult(new ArrayList());
        } else {
            com.huawei.maps.offlinedata.service.device.b.a().a(onCheckUpdatesListListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j, int i) {
        g.c("OfflineMapManager", "startAutoUpdates onPingResult code:" + i);
        if (i == 202) {
            a(str, j);
        } else {
            g.c("OfflineMapManager", "startAutoUpdates ping failed.");
        }
    }

    private void a(String str, long j) {
        g.c("OfflineMapManager", "the auto updates start.");
        j.b("autoUpdateCheckTime" + str, j, com.huawei.maps.offlinedata.utils.a.b());
        a(new OnCheckUpdatesListListener() { // from class: com.huawei.maps.offlinedata.service.a$$ExternalSyntheticLambda2
            @Override // com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListListener
            public final void onOfflineMapsInfoResult(List list) {
                a.a(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MapOfflineDataItemEntity mapOfflineDataItemEntity = (MapOfflineDataItemEntity) it.next();
            OfflineDataTaskEntity offlineDataTaskEntityA = com.huawei.maps.offlinedata.service.persist.b.e().a(mapOfflineDataItemEntity.getCityId(), mapOfflineDataItemEntity.getDataType());
            if (offlineDataTaskEntityA == null) {
                offlineDataTaskEntityA = OfflineDataTaskEntity.Builder.create().fromMapInfo(mapOfflineDataItemEntity).build();
            }
            if (!offlineDataTaskEntityA.getTaskState().contains("pause") && !offlineDataTaskEntityA.getTaskState().contains(VastAttribute.ERROR)) {
                offlineDataTaskEntityA.setItemState("updating");
                offlineDataTaskEntityA.setVersion(mapOfflineDataItemEntity.getVersion());
                b.b().b(offlineDataTaskEntityA);
            } else {
                g.c("OfflineMapManager", "the task has paused or error. skip update " + offlineDataTaskEntityA.getPrintId());
            }
        }
    }

    private void a(final OnCheckUpdatesListListener onCheckUpdatesListListener) {
        g.c("OfflineMapManager", "Check offline map updates for auto update...");
        if (com.huawei.maps.offlinedata.service.init.a.a().b()) {
            new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    a.b(onCheckUpdatesListListener);
                }
            }).start();
        }
    }
}
